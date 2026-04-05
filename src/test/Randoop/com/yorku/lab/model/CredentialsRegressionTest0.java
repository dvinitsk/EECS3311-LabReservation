package test.Randoop.com.yorku.lab.model;

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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        java.lang.String str4 = credentials2.getPasswordHash();
        credentials2.setEmail("");
        java.lang.Class<?> wildcardClass7 = credentials2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.Class<?> wildcardClass3 = credentials2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        java.lang.String str4 = credentials2.getEmail();
        java.lang.String str5 = credentials2.getEmail();
        java.lang.Class<?> wildcardClass6 = credentials2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        credentials2.setPasswordHash("");
        java.lang.String str5 = credentials2.getPasswordHash();
        java.lang.Class<?> wildcardClass6 = credentials2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        boolean boolean4 = credentials2.verifyPassword("hi!");
        java.lang.Class<?> wildcardClass5 = credentials2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        credentials2.setPasswordHash("");
        boolean boolean6 = credentials2.verifyPassword("");
        java.lang.Class<?> wildcardClass7 = credentials2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        java.lang.String str4 = credentials2.getPasswordHash();
        credentials2.setEmail("");
        credentials2.setPasswordHash("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        java.lang.String str4 = credentials2.getEmail();
        java.lang.String str5 = credentials2.getEmail();
        boolean boolean7 = credentials2.verifyPassword("hi!");
        java.lang.Class<?> wildcardClass8 = credentials2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        credentials2.setPasswordHash("");
        boolean boolean6 = credentials2.verifyPassword("");
        java.lang.String str7 = credentials2.getPasswordHash();
        java.lang.Class<?> wildcardClass8 = credentials2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        java.lang.String str4 = credentials2.getEmail();
        java.lang.Class<?> wildcardClass5 = credentials2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        credentials2.setPasswordHash("hi!");
        java.lang.Class<?> wildcardClass5 = credentials2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        java.lang.Class<?> wildcardClass3 = credentials2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        boolean boolean5 = credentials2.verifyPassword("hi!");
        java.lang.Class<?> wildcardClass6 = credentials2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        java.lang.String str4 = credentials2.getPasswordHash();
        credentials2.setPasswordHash("");
        boolean boolean8 = credentials2.verifyPassword("");
        credentials2.setPasswordHash("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        boolean boolean4 = credentials2.verifyPassword("hi!");
        java.lang.String str5 = credentials2.getPasswordHash();
        java.lang.Class<?> wildcardClass6 = credentials2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        credentials2.setPasswordHash("hi!");
        java.lang.String str5 = credentials2.getEmail();
        boolean boolean7 = credentials2.verifyPassword("");
        boolean boolean9 = credentials2.verifyPassword("");
        java.lang.String str10 = credentials2.getPasswordHash();
        java.lang.String str11 = credentials2.getPasswordHash();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        java.lang.String str4 = credentials2.getPasswordHash();
        credentials2.setPasswordHash("");
        boolean boolean8 = credentials2.verifyPassword("");
        boolean boolean10 = credentials2.verifyPassword("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        boolean boolean4 = credentials2.verifyPassword("hi!");
        credentials2.setEmail("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        java.lang.String str4 = credentials2.getPasswordHash();
        credentials2.setPasswordHash("");
        java.lang.Class<?> wildcardClass7 = credentials2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        credentials2.setPasswordHash("");
        boolean boolean6 = credentials2.verifyPassword("");
        java.lang.String str7 = credentials2.getPasswordHash();
        java.lang.String str8 = credentials2.getEmail();
        java.lang.String str9 = credentials2.getPasswordHash();
        java.lang.Class<?> wildcardClass10 = credentials2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        credentials2.setPasswordHash("");
        boolean boolean6 = credentials2.verifyPassword("");
        java.lang.String str7 = credentials2.getPasswordHash();
        java.lang.String str8 = credentials2.getEmail();
        java.lang.String str9 = credentials2.getEmail();
        credentials2.setPasswordHash("");
        java.lang.String str12 = credentials2.getPasswordHash();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        java.lang.String str4 = credentials2.getPasswordHash();
        credentials2.setPasswordHash("");
        credentials2.setPasswordHash("");
        boolean boolean10 = credentials2.verifyPassword("");
        java.lang.String str11 = credentials2.getPasswordHash();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        credentials2.setPasswordHash("");
        boolean boolean6 = credentials2.verifyPassword("");
        java.lang.String str7 = credentials2.getPasswordHash();
        java.lang.String str8 = credentials2.getEmail();
        credentials2.setPasswordHash("hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        java.lang.String str4 = credentials2.getPasswordHash();
        java.lang.String str5 = credentials2.getEmail();
        java.lang.Class<?> wildcardClass6 = credentials2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        credentials2.setPasswordHash("hi!");
        java.lang.String str5 = credentials2.getEmail();
        boolean boolean7 = credentials2.verifyPassword("");
        java.lang.String str8 = credentials2.getEmail();
        java.lang.String str9 = credentials2.getEmail();
        java.lang.Class<?> wildcardClass10 = credentials2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "hi!");
        java.lang.String str3 = credentials2.getPasswordHash();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        java.lang.String str4 = credentials2.getEmail();
        java.lang.String str5 = credentials2.getEmail();
        boolean boolean7 = credentials2.verifyPassword("hi!");
        credentials2.setEmail("hi!");
        java.lang.String str10 = credentials2.getEmail();
        credentials2.setPasswordHash("");
        java.lang.String str13 = credentials2.getPasswordHash();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        credentials2.setPasswordHash("hi!");
        java.lang.String str5 = credentials2.getEmail();
        boolean boolean7 = credentials2.verifyPassword("");
        java.lang.String str8 = credentials2.getEmail();
        java.lang.String str9 = credentials2.getEmail();
        credentials2.setEmail("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        credentials2.setPasswordHash("hi!");
        java.lang.String str5 = credentials2.getEmail();
        boolean boolean7 = credentials2.verifyPassword("");
        java.lang.String str8 = credentials2.getEmail();
        java.lang.String str9 = credentials2.getPasswordHash();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        credentials2.setPasswordHash("hi!");
        java.lang.String str5 = credentials2.getEmail();
        boolean boolean7 = credentials2.verifyPassword("");
        boolean boolean9 = credentials2.verifyPassword("hi!");
        boolean boolean11 = credentials2.verifyPassword("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        java.lang.String str4 = credentials2.getEmail();
        java.lang.String str5 = credentials2.getEmail();
        boolean boolean7 = credentials2.verifyPassword("hi!");
        boolean boolean9 = credentials2.verifyPassword("");
        credentials2.setPasswordHash("hi!");
        java.lang.Class<?> wildcardClass12 = credentials2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        boolean boolean4 = credentials2.verifyPassword("hi!");
        credentials2.setEmail("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        boolean boolean5 = credentials2.verifyPassword("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        credentials2.setPasswordHash("hi!");
        java.lang.String str5 = credentials2.getEmail();
        boolean boolean7 = credentials2.verifyPassword("");
        boolean boolean9 = credentials2.verifyPassword("hi!");
        boolean boolean11 = credentials2.verifyPassword("hi!");
        credentials2.setEmail("");
        boolean boolean15 = credentials2.verifyPassword("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        java.lang.String str4 = credentials2.getEmail();
        java.lang.String str5 = credentials2.getEmail();
        boolean boolean7 = credentials2.verifyPassword("hi!");
        boolean boolean9 = credentials2.verifyPassword("");
        credentials2.setPasswordHash("hi!");
        credentials2.setPasswordHash("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        credentials2.setPasswordHash("");
        boolean boolean6 = credentials2.verifyPassword("");
        java.lang.String str7 = credentials2.getPasswordHash();
        java.lang.String str8 = credentials2.getEmail();
        java.lang.String str9 = credentials2.getEmail();
        credentials2.setPasswordHash("");
        java.lang.Class<?> wildcardClass12 = credentials2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        java.lang.String str4 = credentials2.getEmail();
        java.lang.String str5 = credentials2.getEmail();
        boolean boolean7 = credentials2.verifyPassword("hi!");
        java.lang.String str8 = credentials2.getPasswordHash();
        boolean boolean10 = credentials2.verifyPassword("");
        credentials2.setPasswordHash("");
        java.lang.Class<?> wildcardClass13 = credentials2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        credentials2.setPasswordHash("hi!");
        java.lang.String str5 = credentials2.getEmail();
        boolean boolean7 = credentials2.verifyPassword("");
        boolean boolean9 = credentials2.verifyPassword("");
        boolean boolean11 = credentials2.verifyPassword("");
        java.lang.String str12 = credentials2.getPasswordHash();
        boolean boolean14 = credentials2.verifyPassword("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        java.lang.String str4 = credentials2.getPasswordHash();
        boolean boolean6 = credentials2.verifyPassword("");
        boolean boolean8 = credentials2.verifyPassword("");
        credentials2.setPasswordHash("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        java.lang.String str4 = credentials2.getPasswordHash();
        credentials2.setPasswordHash("");
        credentials2.setPasswordHash("");
        boolean boolean10 = credentials2.verifyPassword("");
        java.lang.Class<?> wildcardClass11 = credentials2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        java.lang.String str4 = credentials2.getEmail();
        java.lang.String str5 = credentials2.getEmail();
        boolean boolean7 = credentials2.verifyPassword("hi!");
        boolean boolean9 = credentials2.verifyPassword("");
        java.lang.String str10 = credentials2.getPasswordHash();
        java.lang.String str11 = credentials2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        java.lang.String str4 = credentials2.getPasswordHash();
        boolean boolean6 = credentials2.verifyPassword("");
        boolean boolean8 = credentials2.verifyPassword("hi!");
        credentials2.setPasswordHash("");
        boolean boolean12 = credentials2.verifyPassword("");
        java.lang.String str13 = credentials2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        credentials2.setPasswordHash("");
        boolean boolean6 = credentials2.verifyPassword("");
        java.lang.String str7 = credentials2.getPasswordHash();
        java.lang.String str8 = credentials2.getEmail();
        java.lang.String str9 = credentials2.getEmail();
        credentials2.setPasswordHash("");
        credentials2.setEmail("hi!");
        java.lang.Class<?> wildcardClass14 = credentials2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        credentials2.setPasswordHash("");
        java.lang.Class<?> wildcardClass5 = credentials2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        boolean boolean4 = credentials2.verifyPassword("hi!");
        java.lang.String str5 = credentials2.getEmail();
        credentials2.setPasswordHash("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        java.lang.String str4 = credentials2.getPasswordHash();
        boolean boolean6 = credentials2.verifyPassword("");
        java.lang.String str7 = credentials2.getPasswordHash();
        credentials2.setPasswordHash("hi!");
        boolean boolean11 = credentials2.verifyPassword("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        credentials2.setPasswordHash("");
        java.lang.String str5 = credentials2.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        credentials2.setPasswordHash("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        credentials2.setPasswordHash("hi!");
        java.lang.String str5 = credentials2.getEmail();
        boolean boolean7 = credentials2.verifyPassword("");
        boolean boolean9 = credentials2.verifyPassword("");
        java.lang.String str10 = credentials2.getEmail();
        java.lang.String str11 = credentials2.getPasswordHash();
        java.lang.String str12 = credentials2.getEmail();
        boolean boolean14 = credentials2.verifyPassword("");
        java.lang.String str15 = credentials2.getPasswordHash();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        credentials2.setPasswordHash("hi!");
        java.lang.String str5 = credentials2.getEmail();
        boolean boolean7 = credentials2.verifyPassword("");
        boolean boolean9 = credentials2.verifyPassword("");
        java.lang.String str10 = credentials2.getEmail();
        credentials2.setPasswordHash("");
        java.lang.Class<?> wildcardClass13 = credentials2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        java.lang.String str4 = credentials2.getEmail();
        java.lang.String str5 = credentials2.getEmail();
        boolean boolean7 = credentials2.verifyPassword("hi!");
        boolean boolean9 = credentials2.verifyPassword("");
        credentials2.setEmail("");
        java.lang.Class<?> wildcardClass12 = credentials2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        java.lang.String str4 = credentials2.getEmail();
        java.lang.String str5 = credentials2.getPasswordHash();
        java.lang.String str6 = credentials2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        credentials2.setPasswordHash("");
        boolean boolean6 = credentials2.verifyPassword("");
        credentials2.setEmail("hi!");
        credentials2.setEmail("hi!");
        credentials2.setPasswordHash("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        java.lang.String str4 = credentials2.getPasswordHash();
        credentials2.setPasswordHash("");
        credentials2.setPasswordHash("");
        boolean boolean10 = credentials2.verifyPassword("");
        java.lang.String str11 = credentials2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        java.lang.String str4 = credentials2.getPasswordHash();
        boolean boolean6 = credentials2.verifyPassword("");
        java.lang.Class<?> wildcardClass7 = credentials2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        java.lang.String str4 = credentials2.getPasswordHash();
        boolean boolean6 = credentials2.verifyPassword("");
        credentials2.setPasswordHash("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        java.lang.String str4 = credentials2.getPasswordHash();
        credentials2.setPasswordHash("");
        credentials2.setPasswordHash("");
        boolean boolean10 = credentials2.verifyPassword("");
        credentials2.setEmail("");
        java.lang.String str13 = credentials2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        java.lang.String str4 = credentials2.getEmail();
        java.lang.String str5 = credentials2.getEmail();
        boolean boolean7 = credentials2.verifyPassword("hi!");
        credentials2.setEmail("hi!");
        java.lang.String str10 = credentials2.getEmail();
        java.lang.Class<?> wildcardClass11 = credentials2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        boolean boolean5 = credentials2.verifyPassword("hi!");
        credentials2.setPasswordHash("");
        boolean boolean9 = credentials2.verifyPassword("");
        boolean boolean11 = credentials2.verifyPassword("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        java.lang.String str4 = credentials2.getPasswordHash();
        boolean boolean6 = credentials2.verifyPassword("");
        java.lang.String str7 = credentials2.getPasswordHash();
        java.lang.String str8 = credentials2.getPasswordHash();
        credentials2.setEmail("hi!");
        java.lang.Class<?> wildcardClass11 = credentials2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "hi!");
        credentials2.setPasswordHash("hi!");
        java.lang.String str5 = credentials2.getPasswordHash();
        java.lang.String str6 = credentials2.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        java.lang.String str4 = credentials2.getPasswordHash();
        boolean boolean6 = credentials2.verifyPassword("");
        java.lang.String str7 = credentials2.getPasswordHash();
        boolean boolean9 = credentials2.verifyPassword("");
        credentials2.setEmail("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        credentials2.setPasswordHash("hi!");
        java.lang.String str5 = credentials2.getEmail();
        boolean boolean7 = credentials2.verifyPassword("");
        boolean boolean9 = credentials2.verifyPassword("");
        credentials2.setPasswordHash("");
        java.lang.Class<?> wildcardClass12 = credentials2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        java.lang.String str3 = credentials2.getEmail();
        boolean boolean5 = credentials2.verifyPassword("");
        credentials2.setPasswordHash("");
        java.lang.String str8 = credentials2.getPasswordHash();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "hi!");
        java.lang.String str3 = credentials2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        credentials2.setPasswordHash("");
        boolean boolean6 = credentials2.verifyPassword("");
        java.lang.String str7 = credentials2.getPasswordHash();
        java.lang.String str8 = credentials2.getEmail();
        java.lang.String str9 = credentials2.getPasswordHash();
        boolean boolean11 = credentials2.verifyPassword("");
        java.lang.Class<?> wildcardClass12 = credentials2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        credentials2.setPasswordHash("");
        boolean boolean6 = credentials2.verifyPassword("");
        java.lang.String str7 = credentials2.getPasswordHash();
        credentials2.setEmail("hi!");
        credentials2.setEmail("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        credentials2.setPasswordHash("hi!");
        java.lang.String str5 = credentials2.getEmail();
        boolean boolean7 = credentials2.verifyPassword("");
        boolean boolean9 = credentials2.verifyPassword("");
        boolean boolean11 = credentials2.verifyPassword("");
        java.lang.String str12 = credentials2.getPasswordHash();
        java.lang.Class<?> wildcardClass13 = credentials2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        credentials2.setPasswordHash("");
        boolean boolean6 = credentials2.verifyPassword("");
        credentials2.setEmail("hi!");
        credentials2.setEmail("hi!");
        java.lang.Class<?> wildcardClass11 = credentials2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        boolean boolean5 = credentials2.verifyPassword("hi!");
        java.lang.String str6 = credentials2.getPasswordHash();
        java.lang.Class<?> wildcardClass7 = credentials2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        java.lang.String str4 = credentials2.getPasswordHash();
        java.lang.String str5 = credentials2.getEmail();
        boolean boolean7 = credentials2.verifyPassword("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        credentials2.setPasswordHash("hi!");
        java.lang.String str5 = credentials2.getEmail();
        boolean boolean7 = credentials2.verifyPassword("");
        java.lang.String str8 = credentials2.getEmail();
        java.lang.String str9 = credentials2.getEmail();
        java.lang.String str10 = credentials2.getEmail();
        credentials2.setEmail("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        credentials2.setPasswordHash("hi!");
        java.lang.String str5 = credentials2.getEmail();
        boolean boolean7 = credentials2.verifyPassword("");
        boolean boolean9 = credentials2.verifyPassword("");
        java.lang.String str10 = credentials2.getEmail();
        java.lang.String str11 = credentials2.getPasswordHash();
        java.lang.String str12 = credentials2.getEmail();
        java.lang.String str13 = credentials2.getEmail();
        java.lang.String str14 = credentials2.getEmail();
        credentials2.setPasswordHash("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        credentials2.setPasswordHash("");
        boolean boolean6 = credentials2.verifyPassword("");
        credentials2.setEmail("hi!");
        credentials2.setEmail("hi!");
        boolean boolean12 = credentials2.verifyPassword("");
        credentials2.setPasswordHash("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        credentials2.setPasswordHash("hi!");
        java.lang.String str5 = credentials2.getEmail();
        boolean boolean7 = credentials2.verifyPassword("");
        boolean boolean9 = credentials2.verifyPassword("");
        java.lang.String str10 = credentials2.getEmail();
        java.lang.String str11 = credentials2.getPasswordHash();
        java.lang.String str12 = credentials2.getEmail();
        java.lang.String str13 = credentials2.getEmail();
        credentials2.setPasswordHash("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        java.lang.String str4 = credentials2.getPasswordHash();
        credentials2.setPasswordHash("");
        credentials2.setPasswordHash("");
        boolean boolean10 = credentials2.verifyPassword("");
        credentials2.setEmail("");
        credentials2.setEmail("");
        credentials2.setPasswordHash("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        java.lang.String str4 = credentials2.getPasswordHash();
        credentials2.setEmail("");
        java.lang.String str7 = credentials2.getEmail();
        credentials2.setPasswordHash("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        java.lang.String str4 = credentials2.getEmail();
        java.lang.String str5 = credentials2.getPasswordHash();
        java.lang.Class<?> wildcardClass6 = credentials2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        credentials2.setPasswordHash("");
        boolean boolean6 = credentials2.verifyPassword("");
        credentials2.setEmail("hi!");
        credentials2.setPasswordHash("");
        java.lang.String str11 = credentials2.getEmail();
        credentials2.setEmail("");
        credentials2.setPasswordHash("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "hi!");
        credentials2.setPasswordHash("hi!");
        java.lang.String str5 = credentials2.getEmail();
        java.lang.String str6 = credentials2.getPasswordHash();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        java.lang.String str4 = credentials2.getPasswordHash();
        boolean boolean6 = credentials2.verifyPassword("");
        java.lang.String str7 = credentials2.getPasswordHash();
        credentials2.setPasswordHash("hi!");
        credentials2.setPasswordHash("hi!");
        credentials2.setEmail("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        credentials2.setPasswordHash("");
        boolean boolean6 = credentials2.verifyPassword("");
        credentials2.setEmail("hi!");
        credentials2.setEmail("hi!");
        java.lang.String str11 = credentials2.getPasswordHash();
        credentials2.setPasswordHash("");
        boolean boolean15 = credentials2.verifyPassword("");
        credentials2.setPasswordHash("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        java.lang.String str4 = credentials2.getEmail();
        java.lang.String str5 = credentials2.getEmail();
        boolean boolean7 = credentials2.verifyPassword("hi!");
        java.lang.String str8 = credentials2.getEmail();
        java.lang.Class<?> wildcardClass9 = credentials2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        credentials2.setPasswordHash("hi!");
        java.lang.String str5 = credentials2.getEmail();
        boolean boolean7 = credentials2.verifyPassword("");
        boolean boolean9 = credentials2.verifyPassword("");
        java.lang.String str10 = credentials2.getEmail();
        credentials2.setEmail("hi!");
        credentials2.setEmail("hi!");
        boolean boolean16 = credentials2.verifyPassword("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        credentials2.setPasswordHash("");
        java.lang.String str5 = credentials2.getPasswordHash();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        java.lang.String str4 = credentials2.getEmail();
        java.lang.String str5 = credentials2.getEmail();
        boolean boolean7 = credentials2.verifyPassword("hi!");
        boolean boolean9 = credentials2.verifyPassword("");
        credentials2.setEmail("");
        credentials2.setPasswordHash("hi!");
        java.lang.Class<?> wildcardClass14 = credentials2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        java.lang.String str4 = credentials2.getEmail();
        java.lang.String str5 = credentials2.getEmail();
        boolean boolean7 = credentials2.verifyPassword("hi!");
        boolean boolean9 = credentials2.verifyPassword("");
        credentials2.setEmail("");
        credentials2.setPasswordHash("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        credentials2.setPasswordHash("hi!");
        java.lang.String str5 = credentials2.getEmail();
        boolean boolean7 = credentials2.verifyPassword("");
        boolean boolean9 = credentials2.verifyPassword("hi!");
        boolean boolean11 = credentials2.verifyPassword("hi!");
        java.lang.String str12 = credentials2.getPasswordHash();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        java.lang.String str4 = credentials2.getPasswordHash();
        boolean boolean6 = credentials2.verifyPassword("");
        boolean boolean8 = credentials2.verifyPassword("");
        credentials2.setEmail("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        credentials2.setPasswordHash("");
        boolean boolean6 = credentials2.verifyPassword("");
        credentials2.setEmail("hi!");
        credentials2.setPasswordHash("");
        java.lang.String str11 = credentials2.getEmail();
        boolean boolean13 = credentials2.verifyPassword("");
        credentials2.setEmail("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        credentials2.setPasswordHash("hi!");
        java.lang.String str5 = credentials2.getEmail();
        boolean boolean7 = credentials2.verifyPassword("");
        boolean boolean9 = credentials2.verifyPassword("hi!");
        boolean boolean11 = credentials2.verifyPassword("hi!");
        boolean boolean13 = credentials2.verifyPassword("hi!");
        boolean boolean15 = credentials2.verifyPassword("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        java.lang.String str4 = credentials2.getPasswordHash();
        boolean boolean6 = credentials2.verifyPassword("");
        boolean boolean8 = credentials2.verifyPassword("hi!");
        credentials2.setPasswordHash("");
        credentials2.setEmail("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        java.lang.String str4 = credentials2.getPasswordHash();
        boolean boolean6 = credentials2.verifyPassword("");
        java.lang.String str7 = credentials2.getPasswordHash();
        java.lang.String str8 = credentials2.getPasswordHash();
        credentials2.setEmail("hi!");
        credentials2.setPasswordHash("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        java.lang.String str4 = credentials2.getEmail();
        java.lang.String str5 = credentials2.getEmail();
        boolean boolean7 = credentials2.verifyPassword("hi!");
        java.lang.String str8 = credentials2.getPasswordHash();
        boolean boolean10 = credentials2.verifyPassword("");
        credentials2.setPasswordHash("hi!");
        java.lang.Class<?> wildcardClass13 = credentials2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        java.lang.String str4 = credentials2.getPasswordHash();
        boolean boolean6 = credentials2.verifyPassword("");
        credentials2.setEmail("");
        java.lang.String str9 = credentials2.getEmail();
        boolean boolean11 = credentials2.verifyPassword("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        credentials2.setPasswordHash("hi!");
        java.lang.String str5 = credentials2.getEmail();
        boolean boolean7 = credentials2.verifyPassword("");
        boolean boolean9 = credentials2.verifyPassword("");
        java.lang.String str10 = credentials2.getEmail();
        java.lang.String str11 = credentials2.getPasswordHash();
        credentials2.setPasswordHash("");
        java.lang.Class<?> wildcardClass14 = credentials2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        java.lang.String str4 = credentials2.getPasswordHash();
        java.lang.String str5 = credentials2.getEmail();
        credentials2.setEmail("");
        credentials2.setEmail("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        java.lang.String str4 = credentials2.getPasswordHash();
        credentials2.setPasswordHash("");
        boolean boolean8 = credentials2.verifyPassword("");
        credentials2.setEmail("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        credentials2.setPasswordHash("hi!");
        java.lang.String str5 = credentials2.getEmail();
        boolean boolean7 = credentials2.verifyPassword("");
        boolean boolean9 = credentials2.verifyPassword("");
        java.lang.String str10 = credentials2.getEmail();
        java.lang.String str11 = credentials2.getPasswordHash();
        java.lang.String str12 = credentials2.getEmail();
        java.lang.Class<?> wildcardClass13 = credentials2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        credentials2.setPasswordHash("");
        java.lang.String str5 = credentials2.getPasswordHash();
        boolean boolean7 = credentials2.verifyPassword("");
        credentials2.setPasswordHash("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        java.lang.String str4 = credentials2.getEmail();
        java.lang.String str5 = credentials2.getEmail();
        boolean boolean7 = credentials2.verifyPassword("hi!");
        java.lang.String str8 = credentials2.getPasswordHash();
        boolean boolean10 = credentials2.verifyPassword("");
        credentials2.setPasswordHash("hi!");
        credentials2.setEmail("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        java.lang.String str4 = credentials2.getPasswordHash();
        java.lang.String str5 = credentials2.getEmail();
        boolean boolean7 = credentials2.verifyPassword("hi!");
        java.lang.String str8 = credentials2.getEmail();
        credentials2.setEmail("");
        credentials2.setEmail("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        java.lang.String str4 = credentials2.getPasswordHash();
        credentials2.setEmail("");
        credentials2.setPasswordHash("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        java.lang.String str3 = credentials2.getEmail();
        boolean boolean5 = credentials2.verifyPassword("");
        boolean boolean7 = credentials2.verifyPassword("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        boolean boolean5 = credentials2.verifyPassword("hi!");
        boolean boolean7 = credentials2.verifyPassword("");
        boolean boolean9 = credentials2.verifyPassword("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        credentials2.setPasswordHash("");
        boolean boolean6 = credentials2.verifyPassword("");
        java.lang.String str7 = credentials2.getPasswordHash();
        java.lang.String str8 = credentials2.getEmail();
        java.lang.String str9 = credentials2.getPasswordHash();
        boolean boolean11 = credentials2.verifyPassword("");
        credentials2.setEmail("");
        java.lang.Class<?> wildcardClass14 = credentials2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        credentials2.setPasswordHash("");
        credentials2.setEmail("hi!");
        boolean boolean8 = credentials2.verifyPassword("");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        java.lang.String str4 = credentials2.getPasswordHash();
        boolean boolean6 = credentials2.verifyPassword("");
        boolean boolean8 = credentials2.verifyPassword("hi!");
        java.lang.String str9 = credentials2.getPasswordHash();
        java.lang.String str10 = credentials2.getPasswordHash();
        java.lang.String str11 = credentials2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "hi!");
        credentials2.setPasswordHash("");
        java.lang.String str5 = credentials2.getPasswordHash();
        java.lang.String str6 = credentials2.getPasswordHash();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        credentials2.setPasswordHash("hi!");
        java.lang.String str5 = credentials2.getEmail();
        boolean boolean7 = credentials2.verifyPassword("");
        java.lang.String str8 = credentials2.getEmail();
        java.lang.String str9 = credentials2.getEmail();
        boolean boolean11 = credentials2.verifyPassword("");
        credentials2.setPasswordHash("");
        java.lang.Class<?> wildcardClass14 = credentials2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        credentials2.setPasswordHash("");
        boolean boolean6 = credentials2.verifyPassword("");
        java.lang.String str7 = credentials2.getPasswordHash();
        java.lang.String str8 = credentials2.getEmail();
        java.lang.String str9 = credentials2.getPasswordHash();
        boolean boolean11 = credentials2.verifyPassword("");
        java.lang.String str12 = credentials2.getEmail();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        java.lang.String str4 = credentials2.getPasswordHash();
        java.lang.String str5 = credentials2.getPasswordHash();
        java.lang.Class<?> wildcardClass6 = credentials2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        credentials2.setPasswordHash("hi!");
        java.lang.String str5 = credentials2.getEmail();
        boolean boolean7 = credentials2.verifyPassword("");
        boolean boolean9 = credentials2.verifyPassword("");
        credentials2.setEmail("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        credentials2.setPasswordHash("");
        boolean boolean6 = credentials2.verifyPassword("");
        java.lang.String str7 = credentials2.getPasswordHash();
        java.lang.String str8 = credentials2.getEmail();
        java.lang.String str9 = credentials2.getEmail();
        credentials2.setEmail("");
        java.lang.String str12 = credentials2.getPasswordHash();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        credentials2.setPasswordHash("hi!");
        java.lang.String str5 = credentials2.getEmail();
        boolean boolean7 = credentials2.verifyPassword("");
        boolean boolean9 = credentials2.verifyPassword("");
        java.lang.String str10 = credentials2.getEmail();
        java.lang.String str11 = credentials2.getPasswordHash();
        java.lang.String str12 = credentials2.getEmail();
        boolean boolean14 = credentials2.verifyPassword("");
        java.lang.String str15 = credentials2.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        java.lang.String str4 = credentials2.getPasswordHash();
        credentials2.setEmail("hi!");
        credentials2.setPasswordHash("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        boolean boolean4 = credentials2.verifyPassword("hi!");
        java.lang.String str5 = credentials2.getEmail();
        boolean boolean7 = credentials2.verifyPassword("");
        java.lang.String str8 = credentials2.getPasswordHash();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        java.lang.String str4 = credentials2.getPasswordHash();
        credentials2.setPasswordHash("");
        boolean boolean8 = credentials2.verifyPassword("");
        java.lang.String str9 = credentials2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        boolean boolean4 = credentials2.verifyPassword("hi!");
        java.lang.String str5 = credentials2.getPasswordHash();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        credentials2.setPasswordHash("");
        boolean boolean6 = credentials2.verifyPassword("");
        credentials2.setEmail("hi!");
        credentials2.setPasswordHash("");
        credentials2.setEmail("hi!");
        java.lang.String str13 = credentials2.getPasswordHash();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        boolean boolean5 = credentials2.verifyPassword("hi!");
        java.lang.String str6 = credentials2.getPasswordHash();
        java.lang.String str7 = credentials2.getPasswordHash();
        credentials2.setPasswordHash("hi!");
        credentials2.setEmail("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        credentials2.setPasswordHash("hi!");
        java.lang.String str5 = credentials2.getEmail();
        boolean boolean7 = credentials2.verifyPassword("");
        boolean boolean9 = credentials2.verifyPassword("");
        java.lang.String str10 = credentials2.getEmail();
        java.lang.String str11 = credentials2.getPasswordHash();
        java.lang.String str12 = credentials2.getEmail();
        boolean boolean14 = credentials2.verifyPassword("");
        credentials2.setPasswordHash("");
        credentials2.setEmail("");
        java.lang.String str19 = credentials2.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        credentials2.setPasswordHash("hi!");
        java.lang.String str5 = credentials2.getEmail();
        boolean boolean7 = credentials2.verifyPassword("");
        boolean boolean9 = credentials2.verifyPassword("hi!");
        credentials2.setPasswordHash("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        java.lang.String str4 = credentials2.getPasswordHash();
        credentials2.setPasswordHash("");
        credentials2.setPasswordHash("");
        boolean boolean10 = credentials2.verifyPassword("");
        boolean boolean12 = credentials2.verifyPassword("hi!");
        java.lang.String str13 = credentials2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        boolean boolean5 = credentials2.verifyPassword("hi!");
        credentials2.setPasswordHash("");
        credentials2.setPasswordHash("");
        credentials2.setPasswordHash("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        credentials2.setPasswordHash("");
        boolean boolean6 = credentials2.verifyPassword("");
        java.lang.String str7 = credentials2.getPasswordHash();
        java.lang.String str8 = credentials2.getEmail();
        java.lang.String str9 = credentials2.getEmail();
        credentials2.setPasswordHash("");
        credentials2.setPasswordHash("hi!");
        java.lang.Class<?> wildcardClass14 = credentials2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        java.lang.String str4 = credentials2.getEmail();
        java.lang.String str5 = credentials2.getEmail();
        boolean boolean7 = credentials2.verifyPassword("hi!");
        boolean boolean9 = credentials2.verifyPassword("");
        credentials2.setEmail("");
        credentials2.setPasswordHash("hi!");
        boolean boolean15 = credentials2.verifyPassword("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        credentials2.setPasswordHash("");
        boolean boolean6 = credentials2.verifyPassword("");
        java.lang.String str7 = credentials2.getPasswordHash();
        credentials2.setEmail("");
        credentials2.setPasswordHash("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        java.lang.String str4 = credentials2.getPasswordHash();
        credentials2.setPasswordHash("");
        credentials2.setPasswordHash("");
        boolean boolean10 = credentials2.verifyPassword("");
        credentials2.setEmail("");
        credentials2.setEmail("");
        credentials2.setEmail("");
        credentials2.setPasswordHash("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        credentials2.setPasswordHash("hi!");
        java.lang.String str5 = credentials2.getEmail();
        boolean boolean7 = credentials2.verifyPassword("");
        boolean boolean9 = credentials2.verifyPassword("");
        java.lang.String str10 = credentials2.getEmail();
        java.lang.String str11 = credentials2.getPasswordHash();
        java.lang.String str12 = credentials2.getEmail();
        boolean boolean14 = credentials2.verifyPassword("");
        credentials2.setPasswordHash("");
        credentials2.setEmail("");
        java.lang.Class<?> wildcardClass19 = credentials2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        java.lang.String str4 = credentials2.getPasswordHash();
        boolean boolean6 = credentials2.verifyPassword("");
        java.lang.String str7 = credentials2.getPasswordHash();
        boolean boolean9 = credentials2.verifyPassword("");
        java.lang.String str10 = credentials2.getPasswordHash();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        credentials2.setPasswordHash("hi!");
        java.lang.String str5 = credentials2.getEmail();
        boolean boolean7 = credentials2.verifyPassword("");
        boolean boolean9 = credentials2.verifyPassword("");
        java.lang.String str10 = credentials2.getEmail();
        java.lang.String str11 = credentials2.getPasswordHash();
        java.lang.String str12 = credentials2.getEmail();
        java.lang.String str13 = credentials2.getEmail();
        java.lang.String str14 = credentials2.getEmail();
        java.lang.String str15 = credentials2.getPasswordHash();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        credentials2.setPasswordHash("");
        boolean boolean6 = credentials2.verifyPassword("");
        credentials2.setEmail("hi!");
        credentials2.setPasswordHash("");
        java.lang.String str11 = credentials2.getEmail();
        credentials2.setPasswordHash("hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "hi!");
        boolean boolean4 = credentials2.verifyPassword("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        java.lang.String str4 = credentials2.getPasswordHash();
        credentials2.setPasswordHash("");
        credentials2.setPasswordHash("");
        credentials2.setEmail("");
        boolean boolean12 = credentials2.verifyPassword("");
        boolean boolean14 = credentials2.verifyPassword("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        java.lang.String str4 = credentials2.getPasswordHash();
        credentials2.setPasswordHash("");
        boolean boolean8 = credentials2.verifyPassword("");
        credentials2.setPasswordHash("");
        boolean boolean12 = credentials2.verifyPassword("hi!");
        credentials2.setEmail("");
        java.lang.String str15 = credentials2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        java.lang.String str4 = credentials2.getPasswordHash();
        credentials2.setPasswordHash("");
        boolean boolean8 = credentials2.verifyPassword("");
        credentials2.setPasswordHash("");
        credentials2.setPasswordHash("hi!");
        credentials2.setPasswordHash("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        java.lang.String str4 = credentials2.getPasswordHash();
        credentials2.setPasswordHash("");
        credentials2.setPasswordHash("");
        boolean boolean10 = credentials2.verifyPassword("");
        credentials2.setEmail("");
        credentials2.setEmail("");
        credentials2.setEmail("hi!");
        java.lang.Class<?> wildcardClass17 = credentials2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        credentials2.setPasswordHash("hi!");
        java.lang.String str5 = credentials2.getEmail();
        boolean boolean7 = credentials2.verifyPassword("");
        java.lang.String str8 = credentials2.getEmail();
        java.lang.String str9 = credentials2.getEmail();
        boolean boolean11 = credentials2.verifyPassword("");
        java.lang.Class<?> wildcardClass12 = credentials2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        credentials2.setPasswordHash("hi!");
        java.lang.String str5 = credentials2.getEmail();
        boolean boolean7 = credentials2.verifyPassword("");
        java.lang.String str8 = credentials2.getEmail();
        java.lang.String str9 = credentials2.getEmail();
        java.lang.String str10 = credentials2.getEmail();
        credentials2.setPasswordHash("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        credentials2.setPasswordHash("hi!");
        java.lang.String str5 = credentials2.getEmail();
        boolean boolean7 = credentials2.verifyPassword("");
        boolean boolean9 = credentials2.verifyPassword("");
        java.lang.String str10 = credentials2.getEmail();
        credentials2.setEmail("");
        java.lang.String str13 = credentials2.getPasswordHash();
        credentials2.setEmail("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        credentials2.setPasswordHash("hi!");
        java.lang.String str5 = credentials2.getEmail();
        boolean boolean7 = credentials2.verifyPassword("");
        java.lang.String str8 = credentials2.getEmail();
        java.lang.String str9 = credentials2.getEmail();
        java.lang.String str10 = credentials2.getEmail();
        boolean boolean12 = credentials2.verifyPassword("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "hi!");
        java.lang.String str3 = credentials2.getPasswordHash();
        java.lang.String str4 = credentials2.getPasswordHash();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        credentials2.setPasswordHash("");
        java.lang.String str5 = credentials2.getPasswordHash();
        credentials2.setPasswordHash("");
        credentials2.setPasswordHash("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        credentials2.setPasswordHash("");
        boolean boolean6 = credentials2.verifyPassword("");
        credentials2.setPasswordHash("");
        credentials2.setEmail("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        boolean boolean4 = credentials2.verifyPassword("hi!");
        boolean boolean6 = credentials2.verifyPassword("");
        java.lang.String str7 = credentials2.getEmail();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        java.lang.String str3 = credentials2.getEmail();
        boolean boolean5 = credentials2.verifyPassword("");
        java.lang.String str6 = credentials2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("", "");
        credentials2.setPasswordHash("hi!");
        java.lang.String str5 = credentials2.getEmail();
        boolean boolean7 = credentials2.verifyPassword("");
        boolean boolean9 = credentials2.verifyPassword("");
        java.lang.String str10 = credentials2.getPasswordHash();
        java.lang.String str11 = credentials2.getEmail();
        java.lang.String str12 = credentials2.getEmail();
        java.lang.Class<?> wildcardClass13 = credentials2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        java.lang.String str4 = credentials2.getPasswordHash();
        boolean boolean6 = credentials2.verifyPassword("");
        java.lang.String str7 = credentials2.getPasswordHash();
        credentials2.setPasswordHash("hi!");
        credentials2.setPasswordHash("hi!");
        java.lang.Class<?> wildcardClass12 = credentials2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.yorku.lab.model.Credentials credentials2 = new com.yorku.lab.model.Credentials("hi!", "");
        java.lang.String str3 = credentials2.getPasswordHash();
        java.lang.String str4 = credentials2.getEmail();
        java.lang.String str5 = credentials2.getEmail();
        boolean boolean7 = credentials2.verifyPassword("hi!");
        boolean boolean9 = credentials2.verifyPassword("");
        credentials2.setPasswordHash("hi!");
        credentials2.setEmail("");
        credentials2.setEmail("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }
}

