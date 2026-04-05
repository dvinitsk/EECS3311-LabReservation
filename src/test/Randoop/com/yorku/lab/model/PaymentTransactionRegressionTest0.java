package com.yorku.lab.model;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PaymentTransactionRegressionTest0 {

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
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        java.lang.Class<?> wildcardClass5 = paymentTransaction4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType2, paymentMethod3);
        java.lang.String str5 = paymentTransaction4.getTransactionId();
        double double6 = paymentTransaction4.getAmount();
        com.yorku.lab.enums.PaymentType paymentType9 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod10 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction11 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType9, paymentMethod10);
        com.yorku.lab.enums.PaymentStatus paymentStatus12 = paymentTransaction11.getStatus();
        com.yorku.lab.enums.PaymentStatus paymentStatus13 = paymentTransaction11.getStatus();
        paymentTransaction4.setStatus(paymentStatus13);
        java.lang.Class<?> wildcardClass15 = paymentStatus13.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + paymentStatus12 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus12.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertTrue("'" + paymentStatus13 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus13.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction5 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 0, paymentType2, paymentMethod3, "");
        java.lang.Class<?> wildcardClass6 = paymentTransaction5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentMethod paymentMethod6 = paymentTransaction4.getMethod();
        com.yorku.lab.enums.PaymentMethod paymentMethod7 = paymentTransaction4.getMethod();
        double double8 = paymentTransaction4.getAmount();
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertNull(paymentMethod7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType2, paymentMethod3);
        java.lang.String str5 = paymentTransaction4.getTransactionId();
        java.lang.String str6 = paymentTransaction4.getReservationId();
        java.lang.String str7 = paymentTransaction4.getTransactionId();
        com.yorku.lab.enums.PaymentType paymentType8 = paymentTransaction4.getType();
        com.yorku.lab.enums.PaymentMethod paymentMethod9 = paymentTransaction4.getMethod();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = paymentMethod9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(paymentType8);
        org.junit.Assert.assertNull(paymentMethod9);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentType paymentType6 = paymentTransaction4.getType();
        com.yorku.lab.enums.PaymentStatus paymentStatus7 = paymentTransaction4.getStatus();
        java.lang.Class<?> wildcardClass8 = paymentTransaction4.getClass();
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentType6);
        org.junit.Assert.assertTrue("'" + paymentStatus7 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus7.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType2, paymentMethod3);
        double double5 = paymentTransaction4.getAmount();
        paymentTransaction4.setReservationId("");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentType paymentType5 = null;
        paymentTransaction4.setType(paymentType5);
        com.yorku.lab.enums.PaymentType paymentType7 = null;
        paymentTransaction4.setType(paymentType7);
        com.yorku.lab.enums.PaymentType paymentType9 = null;
        paymentTransaction4.setType(paymentType9);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentStatus paymentStatus6 = paymentTransaction4.getStatus();
        double double7 = paymentTransaction4.getAmount();
        java.lang.String str8 = paymentTransaction4.getTransactionId();
        paymentTransaction4.setReservationId("");
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertTrue("'" + paymentStatus6 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus6.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction5 = new com.yorku.lab.model.PaymentTransaction("hi!", (double) 0.0f, paymentType2, paymentMethod3, "");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType2, paymentMethod3);
        java.lang.String str5 = paymentTransaction4.getTransactionId();
        com.yorku.lab.enums.PaymentType paymentType6 = paymentTransaction4.getType();
        com.yorku.lab.enums.PaymentStatus paymentStatus7 = null;
        paymentTransaction4.setStatus(paymentStatus7);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(paymentType6);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType2, paymentMethod3);
        java.lang.String str5 = paymentTransaction4.getTransactionId();
        com.yorku.lab.enums.PaymentMethod paymentMethod6 = paymentTransaction4.getMethod();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(paymentMethod6);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentMethod paymentMethod6 = paymentTransaction4.getMethod();
        java.lang.String str7 = paymentTransaction4.getReservationId();
        java.lang.String str8 = paymentTransaction4.getTransactionId();
        com.yorku.lab.enums.PaymentStatus paymentStatus9 = null;
        paymentTransaction4.setStatus(paymentStatus9);
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentMethod paymentMethod6 = paymentTransaction4.getMethod();
        double double7 = paymentTransaction4.getAmount();
        com.yorku.lab.enums.PaymentStatus paymentStatus8 = paymentTransaction4.getStatus();
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + paymentStatus8 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus8.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction5 = new com.yorku.lab.model.PaymentTransaction("hi!", 0.0d, paymentType2, paymentMethod3, "hi!");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentMethod paymentMethod6 = paymentTransaction4.getMethod();
        com.yorku.lab.enums.PaymentStatus paymentStatus7 = null;
        paymentTransaction4.setStatus(paymentStatus7);
        com.yorku.lab.enums.PaymentType paymentType9 = null;
        paymentTransaction4.setType(paymentType9);
        java.lang.String str11 = paymentTransaction4.getTransactionId();
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) (byte) 10, paymentType2, paymentMethod3);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction5 = new com.yorku.lab.model.PaymentTransaction("", (double) 0.0f, paymentType2, paymentMethod3, "");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentType paymentType5 = null;
        paymentTransaction4.setType(paymentType5);
        java.lang.String str7 = paymentTransaction4.getTransactionId();
        java.lang.String str8 = paymentTransaction4.getReservationId();
        java.lang.String str9 = paymentTransaction4.getReservationId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction5 = new com.yorku.lab.model.PaymentTransaction("", (double) (byte) -1, paymentType2, paymentMethod3, "");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) 1L, paymentType2, paymentMethod3);
        java.lang.Class<?> wildcardClass5 = paymentTransaction4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        java.lang.String str5 = paymentTransaction4.getReservationId();
        com.yorku.lab.enums.PaymentMethod paymentMethod6 = paymentTransaction4.getMethod();
        java.lang.String str7 = paymentTransaction4.getTransactionId();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) '#', paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentType paymentType5 = null;
        paymentTransaction4.setType(paymentType5);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        java.lang.String str6 = paymentTransaction4.getTransactionId();
        com.yorku.lab.enums.PaymentStatus paymentStatus7 = paymentTransaction4.getStatus();
        double double8 = paymentTransaction4.getAmount();
        double double9 = paymentTransaction4.getAmount();
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + paymentStatus7 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus7.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction5 = new com.yorku.lab.model.PaymentTransaction("hi!", 0.0d, paymentType2, paymentMethod3, "");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction5 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 0, paymentType2, paymentMethod3, "");
        com.yorku.lab.enums.PaymentMethod paymentMethod6 = paymentTransaction5.getMethod();
        org.junit.Assert.assertNull(paymentMethod6);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentStatus paymentStatus6 = null;
        paymentTransaction4.setStatus(paymentStatus6);
        java.lang.String str8 = paymentTransaction4.getReservationId();
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentMethod paymentMethod6 = paymentTransaction4.getMethod();
        java.lang.String str7 = paymentTransaction4.getReservationId();
        com.yorku.lab.enums.PaymentStatus paymentStatus8 = null;
        paymentTransaction4.setStatus(paymentStatus8);
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType2, paymentMethod3);
        java.lang.String str5 = paymentTransaction4.getTransactionId();
        java.lang.String str6 = paymentTransaction4.getReservationId();
        java.lang.String str7 = paymentTransaction4.getTransactionId();
        com.yorku.lab.enums.PaymentType paymentType8 = paymentTransaction4.getType();
        paymentTransaction4.setReservationId("hi!");
        com.yorku.lab.enums.PaymentStatus paymentStatus11 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentType paymentType12 = null;
        paymentTransaction4.setType(paymentType12);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(paymentType8);
        org.junit.Assert.assertTrue("'" + paymentStatus11 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus11.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentMethod paymentMethod6 = paymentTransaction4.getMethod();
        com.yorku.lab.enums.PaymentType paymentType7 = null;
        paymentTransaction4.setType(paymentType7);
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentMethod6);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        java.lang.String str5 = paymentTransaction4.getTransactionId();
        com.yorku.lab.enums.PaymentMethod paymentMethod6 = paymentTransaction4.getMethod();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(paymentMethod6);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType2, paymentMethod3);
        java.lang.String str5 = paymentTransaction4.getTransactionId();
        java.lang.String str6 = paymentTransaction4.getReservationId();
        com.yorku.lab.enums.PaymentMethod paymentMethod7 = paymentTransaction4.getMethod();
        java.lang.String str8 = paymentTransaction4.getReservationId();
        java.lang.String str9 = paymentTransaction4.getTransactionId();
        double double10 = paymentTransaction4.getAmount();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(paymentMethod7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction5 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 1, paymentType2, paymentMethod3, "");
        com.yorku.lab.enums.PaymentType paymentType8 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod9 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType8, paymentMethod9);
        java.lang.String str11 = paymentTransaction10.getTransactionId();
        java.lang.String str12 = paymentTransaction10.getReservationId();
        java.lang.String str13 = paymentTransaction10.getTransactionId();
        com.yorku.lab.enums.PaymentType paymentType16 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod17 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction18 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType16, paymentMethod17);
        com.yorku.lab.enums.PaymentStatus paymentStatus19 = paymentTransaction18.getStatus();
        paymentTransaction10.setStatus(paymentStatus19);
        paymentTransaction5.setStatus(paymentStatus19);
        com.yorku.lab.enums.PaymentMethod paymentMethod22 = paymentTransaction5.getMethod();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + paymentStatus19 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus19.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentMethod22);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        paymentTransaction4.setReservationId("hi!");
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentStatus paymentStatus6 = paymentTransaction4.getStatus();
        double double7 = paymentTransaction4.getAmount();
        com.yorku.lab.enums.PaymentStatus paymentStatus8 = null;
        paymentTransaction4.setStatus(paymentStatus8);
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertTrue("'" + paymentStatus6 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus6.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentMethod paymentMethod6 = paymentTransaction4.getMethod();
        com.yorku.lab.enums.PaymentStatus paymentStatus7 = null;
        paymentTransaction4.setStatus(paymentStatus7);
        com.yorku.lab.enums.PaymentType paymentType11 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod12 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction13 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType11, paymentMethod12);
        com.yorku.lab.enums.PaymentType paymentType16 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod17 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction18 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType16, paymentMethod17);
        com.yorku.lab.enums.PaymentStatus paymentStatus19 = paymentTransaction18.getStatus();
        paymentTransaction13.setStatus(paymentStatus19);
        paymentTransaction4.setStatus(paymentStatus19);
        com.yorku.lab.enums.PaymentType paymentType24 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod25 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction26 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType24, paymentMethod25);
        com.yorku.lab.enums.PaymentStatus paymentStatus27 = paymentTransaction26.getStatus();
        com.yorku.lab.enums.PaymentType paymentType28 = paymentTransaction26.getType();
        com.yorku.lab.enums.PaymentStatus paymentStatus29 = paymentTransaction26.getStatus();
        com.yorku.lab.enums.PaymentType paymentType30 = null;
        paymentTransaction26.setType(paymentType30);
        com.yorku.lab.enums.PaymentType paymentType34 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod35 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction36 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType34, paymentMethod35);
        java.lang.String str37 = paymentTransaction36.getTransactionId();
        java.lang.String str38 = paymentTransaction36.getReservationId();
        com.yorku.lab.enums.PaymentMethod paymentMethod39 = paymentTransaction36.getMethod();
        java.lang.String str40 = paymentTransaction36.getReservationId();
        com.yorku.lab.enums.PaymentStatus paymentStatus41 = paymentTransaction36.getStatus();
        paymentTransaction26.setStatus(paymentStatus41);
        paymentTransaction4.setStatus(paymentStatus41);
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertTrue("'" + paymentStatus19 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus19.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertTrue("'" + paymentStatus27 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus27.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentType28);
        org.junit.Assert.assertTrue("'" + paymentStatus29 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus29.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(paymentMethod39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + paymentStatus41 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus41.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentMethod paymentMethod6 = paymentTransaction4.getMethod();
        java.lang.Class<?> wildcardClass7 = paymentTransaction4.getClass();
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction5 = new com.yorku.lab.model.PaymentTransaction("hi!", (double) 1, paymentType2, paymentMethod3, "");
        java.lang.String str6 = paymentTransaction5.getTransactionId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType2, paymentMethod3);
        java.lang.String str5 = paymentTransaction4.getTransactionId();
        double double6 = paymentTransaction4.getAmount();
        com.yorku.lab.enums.PaymentType paymentType9 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod10 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction11 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType9, paymentMethod10);
        com.yorku.lab.enums.PaymentStatus paymentStatus12 = paymentTransaction11.getStatus();
        com.yorku.lab.enums.PaymentStatus paymentStatus13 = paymentTransaction11.getStatus();
        paymentTransaction4.setStatus(paymentStatus13);
        java.lang.String str15 = paymentTransaction4.getTransactionId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + paymentStatus12 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus12.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertTrue("'" + paymentStatus13 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus13.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("hi!", (double) (byte) 0, paymentType2, paymentMethod3);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentMethod paymentMethod6 = paymentTransaction4.getMethod();
        double double7 = paymentTransaction4.getAmount();
        com.yorku.lab.enums.PaymentMethod paymentMethod8 = paymentTransaction4.getMethod();
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(paymentMethod8);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction5 = new com.yorku.lab.model.PaymentTransaction("", (double) 10L, paymentType2, paymentMethod3, "");
        com.yorku.lab.enums.PaymentType paymentType6 = paymentTransaction5.getType();
        java.lang.String str7 = paymentTransaction5.getReservationId();
        java.lang.String str8 = paymentTransaction5.getReservationId();
        org.junit.Assert.assertNull(paymentType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentMethod paymentMethod6 = paymentTransaction4.getMethod();
        com.yorku.lab.enums.PaymentStatus paymentStatus7 = null;
        paymentTransaction4.setStatus(paymentStatus7);
        com.yorku.lab.enums.PaymentStatus paymentStatus9 = null;
        paymentTransaction4.setStatus(paymentStatus9);
        java.lang.String str11 = paymentTransaction4.getTransactionId();
        com.yorku.lab.enums.PaymentStatus paymentStatus12 = paymentTransaction4.getStatus();
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(paymentStatus12);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction5 = new com.yorku.lab.model.PaymentTransaction("", (double) (byte) 1, paymentType2, paymentMethod3, "hi!");
        java.lang.Class<?> wildcardClass6 = paymentTransaction5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction5 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 0, paymentType2, paymentMethod3, "");
        com.yorku.lab.enums.PaymentType paymentType8 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod9 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType8, paymentMethod9);
        com.yorku.lab.enums.PaymentStatus paymentStatus11 = paymentTransaction10.getStatus();
        java.lang.String str12 = paymentTransaction10.getTransactionId();
        com.yorku.lab.enums.PaymentStatus paymentStatus13 = paymentTransaction10.getStatus();
        paymentTransaction5.setStatus(paymentStatus13);
        org.junit.Assert.assertTrue("'" + paymentStatus11 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus11.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + paymentStatus13 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus13.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType2, paymentMethod3);
        java.lang.String str5 = paymentTransaction4.getTransactionId();
        double double6 = paymentTransaction4.getAmount();
        com.yorku.lab.enums.PaymentType paymentType9 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod10 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction11 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType9, paymentMethod10);
        com.yorku.lab.enums.PaymentStatus paymentStatus12 = paymentTransaction11.getStatus();
        com.yorku.lab.enums.PaymentStatus paymentStatus13 = paymentTransaction11.getStatus();
        paymentTransaction4.setStatus(paymentStatus13);
        java.lang.String str15 = paymentTransaction4.getReservationId();
        java.lang.String str16 = paymentTransaction4.getTransactionId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + paymentStatus12 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus12.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertTrue("'" + paymentStatus13 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus13.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType2, paymentMethod3);
        java.lang.String str5 = paymentTransaction4.getTransactionId();
        java.lang.String str6 = paymentTransaction4.getReservationId();
        java.lang.String str7 = paymentTransaction4.getTransactionId();
        com.yorku.lab.enums.PaymentType paymentType8 = paymentTransaction4.getType();
        double double9 = paymentTransaction4.getAmount();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(paymentType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentMethod paymentMethod6 = paymentTransaction4.getMethod();
        com.yorku.lab.enums.PaymentStatus paymentStatus7 = null;
        paymentTransaction4.setStatus(paymentStatus7);
        com.yorku.lab.enums.PaymentType paymentType9 = null;
        paymentTransaction4.setType(paymentType9);
        java.lang.Class<?> wildcardClass11 = paymentTransaction4.getClass();
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentStatus paymentStatus6 = paymentTransaction4.getStatus();
        double double7 = paymentTransaction4.getAmount();
        com.yorku.lab.enums.PaymentType paymentType10 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod11 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction12 = new com.yorku.lab.model.PaymentTransaction("", (double) ' ', paymentType10, paymentMethod11);
        com.yorku.lab.enums.PaymentType paymentType15 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod16 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction17 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType15, paymentMethod16);
        com.yorku.lab.enums.PaymentStatus paymentStatus18 = paymentTransaction17.getStatus();
        paymentTransaction12.setStatus(paymentStatus18);
        paymentTransaction4.setStatus(paymentStatus18);
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertTrue("'" + paymentStatus6 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus6.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + paymentStatus18 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus18.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction5 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 0, paymentType2, paymentMethod3, "");
        java.lang.String str6 = paymentTransaction5.getReservationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        java.lang.String str6 = paymentTransaction4.getTransactionId();
        com.yorku.lab.enums.PaymentStatus paymentStatus7 = paymentTransaction4.getStatus();
        double double8 = paymentTransaction4.getAmount();
        java.lang.Class<?> wildcardClass9 = paymentTransaction4.getClass();
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + paymentStatus7 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus7.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction5 = new com.yorku.lab.model.PaymentTransaction("", (double) 10L, paymentType2, paymentMethod3, "");
        java.lang.String str6 = paymentTransaction5.getTransactionId();
        com.yorku.lab.enums.PaymentType paymentType7 = null;
        paymentTransaction5.setType(paymentType7);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) 1L, paymentType2, paymentMethod3);
        java.lang.String str5 = paymentTransaction4.getTransactionId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentMethod paymentMethod6 = paymentTransaction4.getMethod();
        java.lang.String str7 = paymentTransaction4.getReservationId();
        java.lang.String str8 = paymentTransaction4.getTransactionId();
        com.yorku.lab.enums.PaymentStatus paymentStatus9 = paymentTransaction4.getStatus();
        java.lang.Class<?> wildcardClass10 = paymentTransaction4.getClass();
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + paymentStatus9 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus9.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("hi!", (double) 1, paymentType2, paymentMethod3);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentMethod paymentMethod6 = paymentTransaction4.getMethod();
        com.yorku.lab.enums.PaymentStatus paymentStatus7 = null;
        paymentTransaction4.setStatus(paymentStatus7);
        double double9 = paymentTransaction4.getAmount();
        com.yorku.lab.enums.PaymentStatus paymentStatus10 = paymentTransaction4.getStatus();
        java.lang.String str11 = paymentTransaction4.getReservationId();
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(paymentStatus10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType2, paymentMethod3);
        java.lang.String str5 = paymentTransaction4.getTransactionId();
        java.lang.String str6 = paymentTransaction4.getReservationId();
        java.lang.String str7 = paymentTransaction4.getTransactionId();
        com.yorku.lab.enums.PaymentType paymentType8 = paymentTransaction4.getType();
        com.yorku.lab.enums.PaymentStatus paymentStatus9 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentMethod paymentMethod10 = paymentTransaction4.getMethod();
        java.lang.String str11 = paymentTransaction4.getTransactionId();
        java.lang.String str12 = paymentTransaction4.getTransactionId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(paymentType8);
        org.junit.Assert.assertTrue("'" + paymentStatus9 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus9.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentMethod10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction5 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3, "");
        double double6 = paymentTransaction5.getAmount();
        com.yorku.lab.enums.PaymentMethod paymentMethod7 = paymentTransaction5.getMethod();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(paymentMethod7);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType2, paymentMethod3);
        java.lang.String str5 = paymentTransaction4.getTransactionId();
        java.lang.String str6 = paymentTransaction4.getReservationId();
        com.yorku.lab.enums.PaymentMethod paymentMethod7 = paymentTransaction4.getMethod();
        java.lang.String str8 = paymentTransaction4.getReservationId();
        com.yorku.lab.enums.PaymentStatus paymentStatus9 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentType paymentType10 = paymentTransaction4.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(paymentMethod7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + paymentStatus9 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus9.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentType10);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentStatus paymentStatus6 = paymentTransaction4.getStatus();
        double double7 = paymentTransaction4.getAmount();
        java.lang.String str8 = paymentTransaction4.getTransactionId();
        com.yorku.lab.enums.PaymentStatus paymentStatus9 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentStatus paymentStatus10 = paymentTransaction4.getStatus();
        double double11 = paymentTransaction4.getAmount();
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertTrue("'" + paymentStatus6 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus6.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + paymentStatus9 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus9.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertTrue("'" + paymentStatus10 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus10.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) 10, paymentType2, paymentMethod3);
        java.lang.String str5 = paymentTransaction4.getReservationId();
        java.lang.String str6 = paymentTransaction4.getTransactionId();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentStatus paymentStatus6 = paymentTransaction4.getStatus();
        double double7 = paymentTransaction4.getAmount();
        com.yorku.lab.enums.PaymentType paymentType8 = paymentTransaction4.getType();
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertTrue("'" + paymentStatus6 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus6.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(paymentType8);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        double double5 = paymentTransaction4.getAmount();
        com.yorku.lab.enums.PaymentType paymentType8 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod9 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType8, paymentMethod9);
        java.lang.String str11 = paymentTransaction10.getTransactionId();
        double double12 = paymentTransaction10.getAmount();
        com.yorku.lab.enums.PaymentType paymentType15 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod16 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction17 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType15, paymentMethod16);
        com.yorku.lab.enums.PaymentStatus paymentStatus18 = paymentTransaction17.getStatus();
        com.yorku.lab.enums.PaymentStatus paymentStatus19 = paymentTransaction17.getStatus();
        paymentTransaction10.setStatus(paymentStatus19);
        paymentTransaction4.setStatus(paymentStatus19);
        java.lang.Class<?> wildcardClass22 = paymentTransaction4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + paymentStatus18 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus18.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertTrue("'" + paymentStatus19 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus19.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) ' ', paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        java.lang.String str6 = paymentTransaction4.getTransactionId();
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("hi!", (double) '#', paymentType2, paymentMethod3);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        paymentTransaction4.setReservationId("hi!");
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        double double5 = paymentTransaction4.getAmount();
        com.yorku.lab.enums.PaymentType paymentType8 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod9 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType8, paymentMethod9);
        java.lang.String str11 = paymentTransaction10.getTransactionId();
        double double12 = paymentTransaction10.getAmount();
        com.yorku.lab.enums.PaymentType paymentType15 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod16 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction17 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType15, paymentMethod16);
        com.yorku.lab.enums.PaymentStatus paymentStatus18 = paymentTransaction17.getStatus();
        com.yorku.lab.enums.PaymentStatus paymentStatus19 = paymentTransaction17.getStatus();
        paymentTransaction10.setStatus(paymentStatus19);
        paymentTransaction4.setStatus(paymentStatus19);
        double double22 = paymentTransaction4.getAmount();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + paymentStatus18 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus18.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertTrue("'" + paymentStatus19 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus19.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) 10, paymentType2, paymentMethod3);
        java.lang.String str5 = paymentTransaction4.getReservationId();
        com.yorku.lab.enums.PaymentType paymentType6 = paymentTransaction4.getType();
        com.yorku.lab.enums.PaymentStatus paymentStatus7 = null;
        paymentTransaction4.setStatus(paymentStatus7);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(paymentType6);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction5 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3, "hi!");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentMethod paymentMethod6 = paymentTransaction4.getMethod();
        java.lang.String str7 = paymentTransaction4.getReservationId();
        java.lang.String str8 = paymentTransaction4.getTransactionId();
        com.yorku.lab.enums.PaymentStatus paymentStatus9 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentStatus paymentStatus10 = paymentTransaction4.getStatus();
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + paymentStatus9 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus9.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertTrue("'" + paymentStatus10 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus10.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        java.lang.String str5 = paymentTransaction4.getTransactionId();
        double double6 = paymentTransaction4.getAmount();
        com.yorku.lab.enums.PaymentType paymentType7 = null;
        paymentTransaction4.setType(paymentType7);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentMethod paymentMethod6 = paymentTransaction4.getMethod();
        com.yorku.lab.enums.PaymentStatus paymentStatus7 = null;
        paymentTransaction4.setStatus(paymentStatus7);
        com.yorku.lab.enums.PaymentStatus paymentStatus9 = null;
        paymentTransaction4.setStatus(paymentStatus9);
        com.yorku.lab.enums.PaymentMethod paymentMethod11 = paymentTransaction4.getMethod();
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertNull(paymentMethod11);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction5 = new com.yorku.lab.model.PaymentTransaction("", (double) 10L, paymentType2, paymentMethod3, "");
        java.lang.String str6 = paymentTransaction5.getTransactionId();
        paymentTransaction5.setReservationId("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) ' ', paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentType paymentType7 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod8 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction9 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType7, paymentMethod8);
        com.yorku.lab.enums.PaymentStatus paymentStatus10 = paymentTransaction9.getStatus();
        paymentTransaction4.setStatus(paymentStatus10);
        java.lang.String str12 = paymentTransaction4.getTransactionId();
        double double13 = paymentTransaction4.getAmount();
        org.junit.Assert.assertTrue("'" + paymentStatus10 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus10.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) (byte) 0, paymentType2, paymentMethod3);
        double double5 = paymentTransaction4.getAmount();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType2, paymentMethod3);
        java.lang.String str5 = paymentTransaction4.getTransactionId();
        double double6 = paymentTransaction4.getAmount();
        com.yorku.lab.enums.PaymentType paymentType9 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod10 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction11 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType9, paymentMethod10);
        com.yorku.lab.enums.PaymentStatus paymentStatus12 = paymentTransaction11.getStatus();
        com.yorku.lab.enums.PaymentStatus paymentStatus13 = paymentTransaction11.getStatus();
        paymentTransaction4.setStatus(paymentStatus13);
        java.lang.String str15 = paymentTransaction4.getReservationId();
        paymentTransaction4.setReservationId("");
        java.lang.String str18 = paymentTransaction4.getTransactionId();
        java.lang.String str19 = paymentTransaction4.getTransactionId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + paymentStatus12 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus12.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertTrue("'" + paymentStatus13 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus13.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentType paymentType5 = null;
        paymentTransaction4.setType(paymentType5);
        com.yorku.lab.enums.PaymentType paymentType7 = paymentTransaction4.getType();
        com.yorku.lab.enums.PaymentType paymentType8 = null;
        paymentTransaction4.setType(paymentType8);
        java.lang.String str10 = paymentTransaction4.getReservationId();
        org.junit.Assert.assertNull(paymentType7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        java.lang.String str6 = paymentTransaction4.getTransactionId();
        com.yorku.lab.enums.PaymentStatus paymentStatus7 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentStatus paymentStatus8 = paymentTransaction4.getStatus();
        java.lang.String str9 = paymentTransaction4.getReservationId();
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + paymentStatus7 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus7.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertTrue("'" + paymentStatus8 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus8.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) ' ', paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentType paymentType6 = paymentTransaction4.getType();
        java.lang.String str7 = paymentTransaction4.getTransactionId();
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentMethod paymentMethod6 = paymentTransaction4.getMethod();
        com.yorku.lab.enums.PaymentStatus paymentStatus7 = null;
        paymentTransaction4.setStatus(paymentStatus7);
        double double9 = paymentTransaction4.getAmount();
        com.yorku.lab.enums.PaymentStatus paymentStatus10 = paymentTransaction4.getStatus();
        paymentTransaction4.setReservationId("hi!");
        java.lang.String str13 = paymentTransaction4.getTransactionId();
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(paymentStatus10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentMethod paymentMethod6 = paymentTransaction4.getMethod();
        com.yorku.lab.enums.PaymentStatus paymentStatus7 = null;
        paymentTransaction4.setStatus(paymentStatus7);
        double double9 = paymentTransaction4.getAmount();
        com.yorku.lab.enums.PaymentStatus paymentStatus10 = paymentTransaction4.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = paymentStatus10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(paymentStatus10);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentType paymentType5 = null;
        paymentTransaction4.setType(paymentType5);
        java.lang.String str7 = paymentTransaction4.getReservationId();
        com.yorku.lab.enums.PaymentStatus paymentStatus8 = null;
        paymentTransaction4.setStatus(paymentStatus8);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction5 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 1, paymentType2, paymentMethod3, "");
        com.yorku.lab.enums.PaymentType paymentType8 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod9 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType8, paymentMethod9);
        java.lang.String str11 = paymentTransaction10.getTransactionId();
        java.lang.String str12 = paymentTransaction10.getReservationId();
        java.lang.String str13 = paymentTransaction10.getTransactionId();
        com.yorku.lab.enums.PaymentType paymentType16 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod17 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction18 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType16, paymentMethod17);
        com.yorku.lab.enums.PaymentStatus paymentStatus19 = paymentTransaction18.getStatus();
        paymentTransaction10.setStatus(paymentStatus19);
        paymentTransaction5.setStatus(paymentStatus19);
        com.yorku.lab.enums.PaymentType paymentType24 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod25 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction26 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType24, paymentMethod25);
        java.lang.String str27 = paymentTransaction26.getTransactionId();
        java.lang.String str28 = paymentTransaction26.getReservationId();
        java.lang.String str29 = paymentTransaction26.getTransactionId();
        com.yorku.lab.enums.PaymentType paymentType30 = paymentTransaction26.getType();
        com.yorku.lab.enums.PaymentStatus paymentStatus31 = paymentTransaction26.getStatus();
        paymentTransaction5.setStatus(paymentStatus31);
        com.yorku.lab.enums.PaymentType paymentType33 = paymentTransaction5.getType();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + paymentStatus19 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus19.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(paymentType30);
        org.junit.Assert.assertTrue("'" + paymentStatus31 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus31.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentType33);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        java.lang.String str5 = paymentTransaction4.getReservationId();
        com.yorku.lab.enums.PaymentType paymentType8 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod9 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType8, paymentMethod9);
        java.lang.String str11 = paymentTransaction10.getTransactionId();
        com.yorku.lab.enums.PaymentType paymentType14 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod15 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction16 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType14, paymentMethod15);
        com.yorku.lab.enums.PaymentStatus paymentStatus17 = paymentTransaction16.getStatus();
        com.yorku.lab.enums.PaymentStatus paymentStatus18 = paymentTransaction16.getStatus();
        paymentTransaction10.setStatus(paymentStatus18);
        paymentTransaction4.setStatus(paymentStatus18);
        com.yorku.lab.enums.PaymentType paymentType23 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod24 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction25 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType23, paymentMethod24);
        com.yorku.lab.enums.PaymentStatus paymentStatus26 = paymentTransaction25.getStatus();
        com.yorku.lab.enums.PaymentMethod paymentMethod27 = paymentTransaction25.getMethod();
        java.lang.String str28 = paymentTransaction25.getReservationId();
        java.lang.String str29 = paymentTransaction25.getTransactionId();
        com.yorku.lab.enums.PaymentStatus paymentStatus30 = paymentTransaction25.getStatus();
        paymentTransaction4.setStatus(paymentStatus30);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + paymentStatus17 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus17.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertTrue("'" + paymentStatus18 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus18.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertTrue("'" + paymentStatus26 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus26.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentMethod27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + paymentStatus30 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus30.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentStatus paymentStatus6 = paymentTransaction4.getStatus();
        double double7 = paymentTransaction4.getAmount();
        java.lang.Class<?> wildcardClass8 = paymentTransaction4.getClass();
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertTrue("'" + paymentStatus6 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus6.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType2, paymentMethod3);
        java.lang.String str5 = paymentTransaction4.getTransactionId();
        java.lang.String str6 = paymentTransaction4.getReservationId();
        com.yorku.lab.enums.PaymentMethod paymentMethod7 = paymentTransaction4.getMethod();
        java.lang.String str8 = paymentTransaction4.getReservationId();
        com.yorku.lab.enums.PaymentStatus paymentStatus9 = paymentTransaction4.getStatus();
        double double10 = paymentTransaction4.getAmount();
        com.yorku.lab.enums.PaymentMethod paymentMethod11 = paymentTransaction4.getMethod();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(paymentMethod7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + paymentStatus9 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus9.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertNull(paymentMethod11);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("hi!", (double) ' ', paymentType2, paymentMethod3);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        double double5 = paymentTransaction4.getAmount();
        com.yorku.lab.enums.PaymentType paymentType6 = null;
        paymentTransaction4.setType(paymentType6);
        com.yorku.lab.enums.PaymentType paymentType8 = paymentTransaction4.getType();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(paymentType8);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType2, paymentMethod3);
        java.lang.String str5 = paymentTransaction4.getTransactionId();
        java.lang.String str6 = paymentTransaction4.getReservationId();
        com.yorku.lab.enums.PaymentMethod paymentMethod7 = paymentTransaction4.getMethod();
        com.yorku.lab.enums.PaymentStatus paymentStatus8 = null;
        paymentTransaction4.setStatus(paymentStatus8);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(paymentMethod7);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType2, paymentMethod3);
        java.lang.String str5 = paymentTransaction4.getTransactionId();
        java.lang.String str6 = paymentTransaction4.getReservationId();
        java.lang.String str7 = paymentTransaction4.getTransactionId();
        com.yorku.lab.enums.PaymentType paymentType8 = paymentTransaction4.getType();
        paymentTransaction4.setReservationId("hi!");
        double double11 = paymentTransaction4.getAmount();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(paymentType8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction5 = new com.yorku.lab.model.PaymentTransaction("", (double) ' ', paymentType2, paymentMethod3, "");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentMethod paymentMethod6 = paymentTransaction4.getMethod();
        java.lang.String str7 = paymentTransaction4.getReservationId();
        java.lang.String str8 = paymentTransaction4.getTransactionId();
        com.yorku.lab.enums.PaymentType paymentType9 = null;
        paymentTransaction4.setType(paymentType9);
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentMethod paymentMethod6 = paymentTransaction4.getMethod();
        com.yorku.lab.enums.PaymentType paymentType7 = paymentTransaction4.getType();
        com.yorku.lab.enums.PaymentStatus paymentStatus8 = paymentTransaction4.getStatus();
        java.lang.Class<?> wildcardClass9 = paymentStatus8.getClass();
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertNull(paymentType7);
        org.junit.Assert.assertTrue("'" + paymentStatus8 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus8.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType2, paymentMethod3);
        java.lang.String str5 = paymentTransaction4.getTransactionId();
        java.lang.String str6 = paymentTransaction4.getReservationId();
        java.lang.String str7 = paymentTransaction4.getTransactionId();
        com.yorku.lab.enums.PaymentType paymentType8 = paymentTransaction4.getType();
        com.yorku.lab.enums.PaymentStatus paymentStatus9 = paymentTransaction4.getStatus();
        double double10 = paymentTransaction4.getAmount();
        java.lang.String str11 = paymentTransaction4.getReservationId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(paymentType8);
        org.junit.Assert.assertTrue("'" + paymentStatus9 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus9.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 35.0d, paymentType2, paymentMethod3);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("hi!", (double) (byte) 1, paymentType2, paymentMethod3);
        paymentTransaction4.setReservationId("");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        java.lang.String str6 = paymentTransaction4.getTransactionId();
        com.yorku.lab.enums.PaymentStatus paymentStatus7 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentStatus paymentStatus8 = paymentTransaction4.getStatus();
        java.lang.Class<?> wildcardClass9 = paymentTransaction4.getClass();
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + paymentStatus7 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus7.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertTrue("'" + paymentStatus8 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus8.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        java.lang.String str6 = paymentTransaction4.getTransactionId();
        com.yorku.lab.enums.PaymentStatus paymentStatus7 = paymentTransaction4.getStatus();
        double double8 = paymentTransaction4.getAmount();
        paymentTransaction4.setReservationId("");
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + paymentStatus7 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus7.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        java.lang.String str5 = paymentTransaction4.getTransactionId();
        com.yorku.lab.enums.PaymentType paymentType8 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod9 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType8, paymentMethod9);
        com.yorku.lab.enums.PaymentStatus paymentStatus11 = paymentTransaction10.getStatus();
        com.yorku.lab.enums.PaymentStatus paymentStatus12 = paymentTransaction10.getStatus();
        paymentTransaction4.setStatus(paymentStatus12);
        com.yorku.lab.enums.PaymentType paymentType14 = null;
        paymentTransaction4.setType(paymentType14);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + paymentStatus11 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus11.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertTrue("'" + paymentStatus12 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus12.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentMethod paymentMethod6 = paymentTransaction4.getMethod();
        com.yorku.lab.enums.PaymentStatus paymentStatus7 = null;
        paymentTransaction4.setStatus(paymentStatus7);
        double double9 = paymentTransaction4.getAmount();
        com.yorku.lab.enums.PaymentStatus paymentStatus10 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentStatus paymentStatus11 = paymentTransaction4.getStatus();
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(paymentStatus10);
        org.junit.Assert.assertNull(paymentStatus11);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction5 = new com.yorku.lab.model.PaymentTransaction("", (-1.0d), paymentType2, paymentMethod3, "hi!");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) (byte) 0, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentType paymentType7 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod8 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction9 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType7, paymentMethod8);
        com.yorku.lab.enums.PaymentStatus paymentStatus10 = paymentTransaction9.getStatus();
        com.yorku.lab.enums.PaymentType paymentType11 = paymentTransaction9.getType();
        com.yorku.lab.enums.PaymentStatus paymentStatus12 = paymentTransaction9.getStatus();
        paymentTransaction4.setStatus(paymentStatus12);
        org.junit.Assert.assertTrue("'" + paymentStatus10 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus10.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentType11);
        org.junit.Assert.assertTrue("'" + paymentStatus12 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus12.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentMethod paymentMethod6 = paymentTransaction4.getMethod();
        double double7 = paymentTransaction4.getAmount();
        com.yorku.lab.enums.PaymentType paymentType8 = null;
        paymentTransaction4.setType(paymentType8);
        com.yorku.lab.enums.PaymentStatus paymentStatus10 = paymentTransaction4.getStatus();
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + paymentStatus10 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus10.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) 0L, paymentType2, paymentMethod3);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType2, paymentMethod3);
        java.lang.String str5 = paymentTransaction4.getTransactionId();
        double double6 = paymentTransaction4.getAmount();
        com.yorku.lab.enums.PaymentType paymentType9 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod10 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction11 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType9, paymentMethod10);
        com.yorku.lab.enums.PaymentStatus paymentStatus12 = paymentTransaction11.getStatus();
        com.yorku.lab.enums.PaymentStatus paymentStatus13 = paymentTransaction11.getStatus();
        paymentTransaction4.setStatus(paymentStatus13);
        java.lang.String str15 = paymentTransaction4.getReservationId();
        com.yorku.lab.enums.PaymentMethod paymentMethod16 = paymentTransaction4.getMethod();
        com.yorku.lab.enums.PaymentType paymentType17 = paymentTransaction4.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + paymentStatus12 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus12.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertTrue("'" + paymentStatus13 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus13.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(paymentMethod16);
        org.junit.Assert.assertNull(paymentType17);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        double double5 = paymentTransaction4.getAmount();
        com.yorku.lab.enums.PaymentType paymentType8 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod9 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType8, paymentMethod9);
        java.lang.String str11 = paymentTransaction10.getTransactionId();
        double double12 = paymentTransaction10.getAmount();
        com.yorku.lab.enums.PaymentType paymentType15 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod16 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction17 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType15, paymentMethod16);
        com.yorku.lab.enums.PaymentStatus paymentStatus18 = paymentTransaction17.getStatus();
        com.yorku.lab.enums.PaymentStatus paymentStatus19 = paymentTransaction17.getStatus();
        paymentTransaction10.setStatus(paymentStatus19);
        paymentTransaction4.setStatus(paymentStatus19);
        com.yorku.lab.enums.PaymentStatus paymentStatus22 = paymentTransaction4.getStatus();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + paymentStatus18 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus18.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertTrue("'" + paymentStatus19 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus19.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertTrue("'" + paymentStatus22 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus22.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction5 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) -1, paymentType2, paymentMethod3, "");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentMethod paymentMethod6 = paymentTransaction4.getMethod();
        com.yorku.lab.enums.PaymentMethod paymentMethod7 = paymentTransaction4.getMethod();
        com.yorku.lab.enums.PaymentMethod paymentMethod8 = paymentTransaction4.getMethod();
        java.lang.String str9 = paymentTransaction4.getReservationId();
        com.yorku.lab.enums.PaymentMethod paymentMethod10 = paymentTransaction4.getMethod();
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertNull(paymentMethod7);
        org.junit.Assert.assertNull(paymentMethod8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(paymentMethod10);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentMethod paymentMethod6 = paymentTransaction4.getMethod();
        com.yorku.lab.enums.PaymentMethod paymentMethod7 = paymentTransaction4.getMethod();
        com.yorku.lab.enums.PaymentMethod paymentMethod8 = paymentTransaction4.getMethod();
        com.yorku.lab.enums.PaymentType paymentType9 = paymentTransaction4.getType();
        com.yorku.lab.enums.PaymentType paymentType10 = paymentTransaction4.getType();
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertNull(paymentMethod7);
        org.junit.Assert.assertNull(paymentMethod8);
        org.junit.Assert.assertNull(paymentType9);
        org.junit.Assert.assertNull(paymentType10);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentMethod paymentMethod6 = paymentTransaction4.getMethod();
        double double7 = paymentTransaction4.getAmount();
        com.yorku.lab.enums.PaymentType paymentType8 = null;
        paymentTransaction4.setType(paymentType8);
        com.yorku.lab.enums.PaymentType paymentType10 = null;
        paymentTransaction4.setType(paymentType10);
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentMethod paymentMethod6 = paymentTransaction4.getMethod();
        com.yorku.lab.enums.PaymentStatus paymentStatus7 = null;
        paymentTransaction4.setStatus(paymentStatus7);
        double double9 = paymentTransaction4.getAmount();
        com.yorku.lab.enums.PaymentStatus paymentStatus10 = null;
        paymentTransaction4.setStatus(paymentStatus10);
        java.lang.String str12 = paymentTransaction4.getReservationId();
        com.yorku.lab.enums.PaymentStatus paymentStatus13 = null;
        paymentTransaction4.setStatus(paymentStatus13);
        java.lang.String str15 = paymentTransaction4.getTransactionId();
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentMethod paymentMethod6 = paymentTransaction4.getMethod();
        com.yorku.lab.enums.PaymentStatus paymentStatus7 = null;
        paymentTransaction4.setStatus(paymentStatus7);
        java.lang.String str9 = paymentTransaction4.getTransactionId();
        com.yorku.lab.enums.PaymentStatus paymentStatus10 = paymentTransaction4.getStatus();
        java.lang.String str11 = paymentTransaction4.getTransactionId();
        java.lang.String str12 = paymentTransaction4.getReservationId();
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(paymentStatus10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentStatus paymentStatus6 = paymentTransaction4.getStatus();
        java.lang.String str7 = paymentTransaction4.getReservationId();
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertTrue("'" + paymentStatus6 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus6.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentMethod paymentMethod6 = paymentTransaction4.getMethod();
        java.lang.String str7 = paymentTransaction4.getReservationId();
        java.lang.String str8 = paymentTransaction4.getReservationId();
        java.lang.String str9 = paymentTransaction4.getReservationId();
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentStatus paymentStatus6 = paymentTransaction4.getStatus();
        double double7 = paymentTransaction4.getAmount();
        java.lang.String str8 = paymentTransaction4.getTransactionId();
        com.yorku.lab.enums.PaymentStatus paymentStatus9 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentStatus paymentStatus10 = null;
        paymentTransaction4.setStatus(paymentStatus10);
        java.lang.Class<?> wildcardClass12 = paymentTransaction4.getClass();
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertTrue("'" + paymentStatus6 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus6.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + paymentStatus9 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus9.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType2, paymentMethod3);
        java.lang.String str5 = paymentTransaction4.getTransactionId();
        java.lang.String str6 = paymentTransaction4.getReservationId();
        com.yorku.lab.enums.PaymentMethod paymentMethod7 = paymentTransaction4.getMethod();
        java.lang.String str8 = paymentTransaction4.getReservationId();
        java.lang.String str9 = paymentTransaction4.getTransactionId();
        com.yorku.lab.enums.PaymentType paymentType12 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod13 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction14 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType12, paymentMethod13);
        com.yorku.lab.enums.PaymentStatus paymentStatus15 = paymentTransaction14.getStatus();
        com.yorku.lab.enums.PaymentMethod paymentMethod16 = paymentTransaction14.getMethod();
        com.yorku.lab.enums.PaymentStatus paymentStatus17 = paymentTransaction14.getStatus();
        paymentTransaction4.setStatus(paymentStatus17);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(paymentMethod7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + paymentStatus15 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus15.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentMethod16);
        org.junit.Assert.assertTrue("'" + paymentStatus17 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus17.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        double double5 = paymentTransaction4.getAmount();
        com.yorku.lab.enums.PaymentType paymentType8 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod9 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType8, paymentMethod9);
        java.lang.String str11 = paymentTransaction10.getTransactionId();
        double double12 = paymentTransaction10.getAmount();
        com.yorku.lab.enums.PaymentType paymentType15 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod16 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction17 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType15, paymentMethod16);
        com.yorku.lab.enums.PaymentStatus paymentStatus18 = paymentTransaction17.getStatus();
        com.yorku.lab.enums.PaymentStatus paymentStatus19 = paymentTransaction17.getStatus();
        paymentTransaction10.setStatus(paymentStatus19);
        paymentTransaction4.setStatus(paymentStatus19);
        java.lang.String str22 = paymentTransaction4.getReservationId();
        com.yorku.lab.enums.PaymentStatus paymentStatus23 = paymentTransaction4.getStatus();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + paymentStatus18 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus18.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertTrue("'" + paymentStatus19 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus19.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + paymentStatus23 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus23.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        java.lang.String str5 = paymentTransaction4.getReservationId();
        com.yorku.lab.enums.PaymentType paymentType8 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod9 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType8, paymentMethod9);
        java.lang.String str11 = paymentTransaction10.getTransactionId();
        com.yorku.lab.enums.PaymentType paymentType14 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod15 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction16 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType14, paymentMethod15);
        com.yorku.lab.enums.PaymentStatus paymentStatus17 = paymentTransaction16.getStatus();
        com.yorku.lab.enums.PaymentStatus paymentStatus18 = paymentTransaction16.getStatus();
        paymentTransaction10.setStatus(paymentStatus18);
        paymentTransaction4.setStatus(paymentStatus18);
        com.yorku.lab.enums.PaymentMethod paymentMethod21 = paymentTransaction4.getMethod();
        com.yorku.lab.enums.PaymentMethod paymentMethod22 = paymentTransaction4.getMethod();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + paymentStatus17 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus17.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertTrue("'" + paymentStatus18 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus18.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentMethod21);
        org.junit.Assert.assertNull(paymentMethod22);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) 10L, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentMethod paymentMethod5 = paymentTransaction4.getMethod();
        org.junit.Assert.assertNull(paymentMethod5);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction5 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 1, paymentType2, paymentMethod3, "");
        com.yorku.lab.enums.PaymentType paymentType8 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod9 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType8, paymentMethod9);
        java.lang.String str11 = paymentTransaction10.getTransactionId();
        java.lang.String str12 = paymentTransaction10.getReservationId();
        java.lang.String str13 = paymentTransaction10.getTransactionId();
        com.yorku.lab.enums.PaymentType paymentType16 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod17 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction18 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType16, paymentMethod17);
        com.yorku.lab.enums.PaymentStatus paymentStatus19 = paymentTransaction18.getStatus();
        paymentTransaction10.setStatus(paymentStatus19);
        paymentTransaction5.setStatus(paymentStatus19);
        java.lang.String str22 = paymentTransaction5.getReservationId();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + paymentStatus19 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus19.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentMethod paymentMethod6 = paymentTransaction4.getMethod();
        com.yorku.lab.enums.PaymentStatus paymentStatus7 = null;
        paymentTransaction4.setStatus(paymentStatus7);
        double double9 = paymentTransaction4.getAmount();
        com.yorku.lab.enums.PaymentType paymentType10 = paymentTransaction4.getType();
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(paymentType10);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 100.0d, paymentType2, paymentMethod3);
        java.lang.String str5 = paymentTransaction4.getTransactionId();
        com.yorku.lab.enums.PaymentType paymentType8 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod9 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType8, paymentMethod9);
        com.yorku.lab.enums.PaymentStatus paymentStatus11 = paymentTransaction10.getStatus();
        com.yorku.lab.enums.PaymentMethod paymentMethod12 = paymentTransaction10.getMethod();
        java.lang.String str13 = paymentTransaction10.getReservationId();
        java.lang.String str14 = paymentTransaction10.getTransactionId();
        com.yorku.lab.enums.PaymentStatus paymentStatus15 = paymentTransaction10.getStatus();
        paymentTransaction4.setStatus(paymentStatus15);
        com.yorku.lab.enums.PaymentType paymentType17 = null;
        paymentTransaction4.setType(paymentType17);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + paymentStatus11 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus11.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentMethod12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + paymentStatus15 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus15.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) 10, paymentType2, paymentMethod3);
        java.lang.String str5 = paymentTransaction4.getReservationId();
        com.yorku.lab.enums.PaymentType paymentType6 = paymentTransaction4.getType();
        com.yorku.lab.enums.PaymentType paymentType7 = null;
        paymentTransaction4.setType(paymentType7);
        paymentTransaction4.setReservationId("");
        com.yorku.lab.enums.PaymentType paymentType11 = paymentTransaction4.getType();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(paymentType6);
        org.junit.Assert.assertNull(paymentType11);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        java.lang.String str5 = paymentTransaction4.getReservationId();
        com.yorku.lab.enums.PaymentMethod paymentMethod6 = paymentTransaction4.getMethod();
        java.lang.String str7 = paymentTransaction4.getReservationId();
        java.lang.String str8 = paymentTransaction4.getReservationId();
        com.yorku.lab.enums.PaymentMethod paymentMethod9 = paymentTransaction4.getMethod();
        double double10 = paymentTransaction4.getAmount();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(paymentMethod9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentMethod paymentMethod6 = paymentTransaction4.getMethod();
        java.lang.String str7 = paymentTransaction4.getReservationId();
        com.yorku.lab.enums.PaymentType paymentType8 = null;
        paymentTransaction4.setType(paymentType8);
        com.yorku.lab.enums.PaymentType paymentType12 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod13 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction14 = new com.yorku.lab.model.PaymentTransaction("", (double) ' ', paymentType12, paymentMethod13);
        com.yorku.lab.enums.PaymentType paymentType17 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod18 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction19 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType17, paymentMethod18);
        com.yorku.lab.enums.PaymentStatus paymentStatus20 = paymentTransaction19.getStatus();
        paymentTransaction14.setStatus(paymentStatus20);
        paymentTransaction4.setStatus(paymentStatus20);
        com.yorku.lab.enums.PaymentType paymentType23 = null;
        paymentTransaction4.setType(paymentType23);
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + paymentStatus20 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus20.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentType paymentType6 = paymentTransaction4.getType();
        com.yorku.lab.enums.PaymentStatus paymentStatus7 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentType paymentType8 = paymentTransaction4.getType();
        com.yorku.lab.enums.PaymentStatus paymentStatus9 = paymentTransaction4.getStatus();
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentType6);
        org.junit.Assert.assertTrue("'" + paymentStatus7 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus7.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentType8);
        org.junit.Assert.assertTrue("'" + paymentStatus9 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus9.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) (byte) 0, paymentType2, paymentMethod3);
        paymentTransaction4.setReservationId("hi!");
        com.yorku.lab.enums.PaymentType paymentType9 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod10 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction11 = new com.yorku.lab.model.PaymentTransaction("", (double) (byte) 0, paymentType9, paymentMethod10);
        com.yorku.lab.enums.PaymentType paymentType14 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod15 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction16 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType14, paymentMethod15);
        java.lang.String str17 = paymentTransaction16.getTransactionId();
        java.lang.String str18 = paymentTransaction16.getReservationId();
        com.yorku.lab.enums.PaymentMethod paymentMethod19 = paymentTransaction16.getMethod();
        java.lang.String str20 = paymentTransaction16.getReservationId();
        com.yorku.lab.enums.PaymentStatus paymentStatus21 = paymentTransaction16.getStatus();
        paymentTransaction11.setStatus(paymentStatus21);
        paymentTransaction4.setStatus(paymentStatus21);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(paymentMethod19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + paymentStatus21 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus21.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction5 = new com.yorku.lab.model.PaymentTransaction("hi!", (double) 1L, paymentType2, paymentMethod3, "hi!");
        com.yorku.lab.enums.PaymentType paymentType6 = null;
        paymentTransaction5.setType(paymentType6);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentMethod paymentMethod6 = paymentTransaction4.getMethod();
        com.yorku.lab.enums.PaymentStatus paymentStatus7 = null;
        paymentTransaction4.setStatus(paymentStatus7);
        java.lang.String str9 = paymentTransaction4.getTransactionId();
        com.yorku.lab.enums.PaymentStatus paymentStatus10 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentStatus paymentStatus11 = paymentTransaction4.getStatus();
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(paymentStatus10);
        org.junit.Assert.assertNull(paymentStatus11);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) 100, paymentType2, paymentMethod3);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType2, paymentMethod3);
        java.lang.String str5 = paymentTransaction4.getTransactionId();
        double double6 = paymentTransaction4.getAmount();
        com.yorku.lab.enums.PaymentType paymentType9 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod10 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction11 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType9, paymentMethod10);
        com.yorku.lab.enums.PaymentStatus paymentStatus12 = paymentTransaction11.getStatus();
        com.yorku.lab.enums.PaymentStatus paymentStatus13 = paymentTransaction11.getStatus();
        paymentTransaction4.setStatus(paymentStatus13);
        java.lang.String str15 = paymentTransaction4.getReservationId();
        com.yorku.lab.enums.PaymentType paymentType16 = paymentTransaction4.getType();
        com.yorku.lab.enums.PaymentType paymentType17 = null;
        paymentTransaction4.setType(paymentType17);
        java.lang.String str19 = paymentTransaction4.getTransactionId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + paymentStatus12 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus12.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertTrue("'" + paymentStatus13 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus13.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(paymentType16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction5 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 1, paymentType2, paymentMethod3, "");
        com.yorku.lab.enums.PaymentType paymentType8 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod9 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType8, paymentMethod9);
        java.lang.String str11 = paymentTransaction10.getTransactionId();
        java.lang.String str12 = paymentTransaction10.getReservationId();
        java.lang.String str13 = paymentTransaction10.getTransactionId();
        com.yorku.lab.enums.PaymentType paymentType16 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod17 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction18 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType16, paymentMethod17);
        com.yorku.lab.enums.PaymentStatus paymentStatus19 = paymentTransaction18.getStatus();
        paymentTransaction10.setStatus(paymentStatus19);
        paymentTransaction5.setStatus(paymentStatus19);
        com.yorku.lab.enums.PaymentType paymentType24 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod25 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction26 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType24, paymentMethod25);
        java.lang.String str27 = paymentTransaction26.getTransactionId();
        java.lang.String str28 = paymentTransaction26.getReservationId();
        java.lang.String str29 = paymentTransaction26.getTransactionId();
        com.yorku.lab.enums.PaymentType paymentType30 = paymentTransaction26.getType();
        com.yorku.lab.enums.PaymentStatus paymentStatus31 = paymentTransaction26.getStatus();
        paymentTransaction5.setStatus(paymentStatus31);
        java.lang.Class<?> wildcardClass33 = paymentStatus31.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + paymentStatus19 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus19.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(paymentType30);
        org.junit.Assert.assertTrue("'" + paymentStatus31 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus31.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentMethod paymentMethod6 = paymentTransaction4.getMethod();
        com.yorku.lab.enums.PaymentStatus paymentStatus7 = null;
        paymentTransaction4.setStatus(paymentStatus7);
        com.yorku.lab.enums.PaymentStatus paymentStatus9 = null;
        paymentTransaction4.setStatus(paymentStatus9);
        com.yorku.lab.enums.PaymentType paymentType11 = null;
        paymentTransaction4.setType(paymentType11);
        com.yorku.lab.enums.PaymentType paymentType15 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod16 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction17 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType15, paymentMethod16);
        com.yorku.lab.enums.PaymentStatus paymentStatus18 = paymentTransaction17.getStatus();
        com.yorku.lab.enums.PaymentStatus paymentStatus19 = paymentTransaction17.getStatus();
        paymentTransaction4.setStatus(paymentStatus19);
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertTrue("'" + paymentStatus18 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus18.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertTrue("'" + paymentStatus19 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus19.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType2, paymentMethod3);
        java.lang.String str5 = paymentTransaction4.getTransactionId();
        java.lang.String str6 = paymentTransaction4.getReservationId();
        java.lang.String str7 = paymentTransaction4.getTransactionId();
        com.yorku.lab.enums.PaymentType paymentType8 = paymentTransaction4.getType();
        paymentTransaction4.setReservationId("hi!");
        com.yorku.lab.enums.PaymentStatus paymentStatus11 = paymentTransaction4.getStatus();
        double double12 = paymentTransaction4.getAmount();
        com.yorku.lab.enums.PaymentStatus paymentStatus13 = paymentTransaction4.getStatus();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(paymentType8);
        org.junit.Assert.assertTrue("'" + paymentStatus11 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus11.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + paymentStatus13 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus13.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        java.lang.String str5 = paymentTransaction4.getReservationId();
        paymentTransaction4.setReservationId("hi!");
        double double8 = paymentTransaction4.getAmount();
        java.lang.Class<?> wildcardClass9 = paymentTransaction4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) '#', paymentType2, paymentMethod3);
        java.lang.String str5 = paymentTransaction4.getTransactionId();
        double double6 = paymentTransaction4.getAmount();
        com.yorku.lab.enums.PaymentType paymentType7 = paymentTransaction4.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertNull(paymentType7);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType2, paymentMethod3);
        java.lang.String str5 = paymentTransaction4.getTransactionId();
        double double6 = paymentTransaction4.getAmount();
        com.yorku.lab.enums.PaymentType paymentType9 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod10 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction11 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType9, paymentMethod10);
        com.yorku.lab.enums.PaymentStatus paymentStatus12 = paymentTransaction11.getStatus();
        com.yorku.lab.enums.PaymentStatus paymentStatus13 = paymentTransaction11.getStatus();
        paymentTransaction4.setStatus(paymentStatus13);
        com.yorku.lab.enums.PaymentType paymentType15 = paymentTransaction4.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + paymentStatus12 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus12.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertTrue("'" + paymentStatus13 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus13.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentType15);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction5 = new com.yorku.lab.model.PaymentTransaction("", (double) 1L, paymentType2, paymentMethod3, "");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentMethod paymentMethod6 = paymentTransaction4.getMethod();
        com.yorku.lab.enums.PaymentStatus paymentStatus7 = null;
        paymentTransaction4.setStatus(paymentStatus7);
        com.yorku.lab.enums.PaymentStatus paymentStatus9 = null;
        paymentTransaction4.setStatus(paymentStatus9);
        double double11 = paymentTransaction4.getAmount();
        java.lang.String str12 = paymentTransaction4.getReservationId();
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("hi!", 0.0d, paymentType2, paymentMethod3);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) (-1L), paymentType2, paymentMethod3);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentMethod paymentMethod6 = paymentTransaction4.getMethod();
        com.yorku.lab.enums.PaymentStatus paymentStatus7 = null;
        paymentTransaction4.setStatus(paymentStatus7);
        double double9 = paymentTransaction4.getAmount();
        com.yorku.lab.enums.PaymentStatus paymentStatus10 = paymentTransaction4.getStatus();
        paymentTransaction4.setReservationId("hi!");
        com.yorku.lab.enums.PaymentMethod paymentMethod13 = paymentTransaction4.getMethod();
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(paymentStatus10);
        org.junit.Assert.assertNull(paymentMethod13);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentMethod paymentMethod6 = paymentTransaction4.getMethod();
        com.yorku.lab.enums.PaymentStatus paymentStatus7 = null;
        paymentTransaction4.setStatus(paymentStatus7);
        double double9 = paymentTransaction4.getAmount();
        com.yorku.lab.enums.PaymentStatus paymentStatus10 = paymentTransaction4.getStatus();
        paymentTransaction4.setReservationId("hi!");
        java.lang.Class<?> wildcardClass13 = paymentTransaction4.getClass();
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(paymentStatus10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentStatus paymentStatus6 = paymentTransaction4.getStatus();
        double double7 = paymentTransaction4.getAmount();
        paymentTransaction4.setReservationId("");
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertTrue("'" + paymentStatus6 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus6.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType2, paymentMethod3);
        java.lang.String str5 = paymentTransaction4.getTransactionId();
        double double6 = paymentTransaction4.getAmount();
        java.lang.String str7 = paymentTransaction4.getReservationId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType2, paymentMethod3);
        java.lang.String str5 = paymentTransaction4.getTransactionId();
        java.lang.String str6 = paymentTransaction4.getReservationId();
        com.yorku.lab.enums.PaymentMethod paymentMethod7 = paymentTransaction4.getMethod();
        java.lang.String str8 = paymentTransaction4.getReservationId();
        com.yorku.lab.enums.PaymentStatus paymentStatus9 = paymentTransaction4.getStatus();
        double double10 = paymentTransaction4.getAmount();
        double double11 = paymentTransaction4.getAmount();
        com.yorku.lab.enums.PaymentMethod paymentMethod12 = paymentTransaction4.getMethod();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(paymentMethod7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + paymentStatus9 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus9.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNull(paymentMethod12);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) ' ', paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentType paymentType7 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod8 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction9 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType7, paymentMethod8);
        com.yorku.lab.enums.PaymentStatus paymentStatus10 = paymentTransaction9.getStatus();
        paymentTransaction4.setStatus(paymentStatus10);
        java.lang.Class<?> wildcardClass12 = paymentStatus10.getClass();
        org.junit.Assert.assertTrue("'" + paymentStatus10 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus10.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        java.lang.String str5 = paymentTransaction4.getReservationId();
        java.lang.String str6 = paymentTransaction4.getReservationId();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction5 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 10, paymentType2, paymentMethod3, "");
        com.yorku.lab.enums.PaymentMethod paymentMethod6 = paymentTransaction5.getMethod();
        org.junit.Assert.assertNull(paymentMethod6);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentType paymentType7 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod8 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction9 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType7, paymentMethod8);
        com.yorku.lab.enums.PaymentStatus paymentStatus10 = paymentTransaction9.getStatus();
        paymentTransaction4.setStatus(paymentStatus10);
        double double12 = paymentTransaction4.getAmount();
        org.junit.Assert.assertTrue("'" + paymentStatus10 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus10.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentMethod paymentMethod6 = paymentTransaction4.getMethod();
        com.yorku.lab.enums.PaymentStatus paymentStatus7 = null;
        paymentTransaction4.setStatus(paymentStatus7);
        com.yorku.lab.enums.PaymentStatus paymentStatus9 = null;
        paymentTransaction4.setStatus(paymentStatus9);
        com.yorku.lab.enums.PaymentType paymentType11 = null;
        paymentTransaction4.setType(paymentType11);
        com.yorku.lab.enums.PaymentType paymentType13 = paymentTransaction4.getType();
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertNull(paymentType13);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) ' ', paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentType paymentType6 = null;
        paymentTransaction4.setType(paymentType6);
        com.yorku.lab.enums.PaymentStatus paymentStatus8 = null;
        paymentTransaction4.setStatus(paymentStatus8);
        com.yorku.lab.enums.PaymentType paymentType10 = null;
        paymentTransaction4.setType(paymentType10);
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType2, paymentMethod3);
        java.lang.String str5 = paymentTransaction4.getTransactionId();
        java.lang.String str6 = paymentTransaction4.getReservationId();
        com.yorku.lab.enums.PaymentMethod paymentMethod7 = paymentTransaction4.getMethod();
        java.lang.String str8 = paymentTransaction4.getReservationId();
        java.lang.String str9 = paymentTransaction4.getTransactionId();
        java.lang.String str10 = paymentTransaction4.getTransactionId();
        paymentTransaction4.setReservationId("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(paymentMethod7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }
}

