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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        java.lang.Class<?> wildcardClass5 = paymentTransaction4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentMethod paymentMethod6 = paymentTransaction4.getMethod();
        com.yorku.lab.enums.PaymentType paymentType9 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod10 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction11 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType9, paymentMethod10);
        com.yorku.lab.enums.PaymentStatus paymentStatus12 = paymentTransaction11.getStatus();
        paymentTransaction4.setStatus(paymentStatus12);
        java.lang.Class<?> wildcardClass14 = paymentStatus12.getClass();
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertTrue("'" + paymentStatus12 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus12.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentStatus paymentStatus6 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentType paymentType7 = paymentTransaction4.getType();
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertTrue("'" + paymentStatus6 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus6.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentType7);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType2, paymentMethod3);
        java.lang.String str5 = paymentTransaction4.getTransactionId();
        com.yorku.lab.enums.PaymentType paymentType8 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod9 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType8, paymentMethod9);
        com.yorku.lab.enums.PaymentStatus paymentStatus11 = paymentTransaction10.getStatus();
        paymentTransaction4.setStatus(paymentStatus11);
        com.yorku.lab.enums.PaymentStatus paymentStatus13 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentType paymentType14 = paymentTransaction4.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + paymentStatus11 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus11.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertTrue("'" + paymentStatus13 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus13.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentType14);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType2, paymentMethod3);
        java.lang.String str5 = paymentTransaction4.getTransactionId();
        java.lang.String str6 = paymentTransaction4.getTransactionId();
        com.yorku.lab.enums.PaymentType paymentType7 = paymentTransaction4.getType();
        java.lang.Class<?> wildcardClass8 = paymentTransaction4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(paymentType7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType2, paymentMethod3);
        java.lang.String str5 = paymentTransaction4.getTransactionId();
        com.yorku.lab.enums.PaymentMethod paymentMethod6 = paymentTransaction4.getMethod();
        com.yorku.lab.enums.PaymentType paymentType9 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod10 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction11 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType9, paymentMethod10);
        double double12 = paymentTransaction11.getAmount();
        com.yorku.lab.enums.PaymentType paymentType15 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod16 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction17 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType15, paymentMethod16);
        java.lang.String str18 = paymentTransaction17.getTransactionId();
        com.yorku.lab.enums.PaymentType paymentType21 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod22 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction23 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType21, paymentMethod22);
        com.yorku.lab.enums.PaymentStatus paymentStatus24 = paymentTransaction23.getStatus();
        paymentTransaction17.setStatus(paymentStatus24);
        com.yorku.lab.enums.PaymentStatus paymentStatus26 = paymentTransaction17.getStatus();
        paymentTransaction11.setStatus(paymentStatus26);
        paymentTransaction4.setStatus(paymentStatus26);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + paymentStatus24 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus24.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertTrue("'" + paymentStatus26 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus26.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentMethod paymentMethod6 = paymentTransaction4.getMethod();
        com.yorku.lab.enums.PaymentType paymentType9 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod10 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction11 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType9, paymentMethod10);
        com.yorku.lab.enums.PaymentStatus paymentStatus12 = paymentTransaction11.getStatus();
        paymentTransaction4.setStatus(paymentStatus12);
        java.lang.String str14 = paymentTransaction4.getReservationId();
        com.yorku.lab.enums.PaymentMethod paymentMethod15 = paymentTransaction4.getMethod();
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertTrue("'" + paymentStatus12 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus12.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(paymentMethod15);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType2, paymentMethod3);
        double double5 = paymentTransaction4.getAmount();
        com.yorku.lab.enums.PaymentType paymentType8 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod9 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType8, paymentMethod9);
        java.lang.String str11 = paymentTransaction10.getTransactionId();
        com.yorku.lab.enums.PaymentType paymentType14 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod15 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction16 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType14, paymentMethod15);
        com.yorku.lab.enums.PaymentStatus paymentStatus17 = paymentTransaction16.getStatus();
        paymentTransaction10.setStatus(paymentStatus17);
        com.yorku.lab.enums.PaymentStatus paymentStatus19 = paymentTransaction10.getStatus();
        paymentTransaction4.setStatus(paymentStatus19);
        java.lang.Class<?> wildcardClass21 = paymentStatus19.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + paymentStatus17 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus17.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertTrue("'" + paymentStatus19 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus19.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction5 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 10, paymentType2, paymentMethod3, "hi!");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentMethod paymentMethod6 = paymentTransaction4.getMethod();
        com.yorku.lab.enums.PaymentType paymentType9 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod10 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction11 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType9, paymentMethod10);
        com.yorku.lab.enums.PaymentStatus paymentStatus12 = paymentTransaction11.getStatus();
        paymentTransaction4.setStatus(paymentStatus12);
        java.lang.Class<?> wildcardClass14 = paymentTransaction4.getClass();
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertTrue("'" + paymentStatus12 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus12.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType2, paymentMethod3);
        double double5 = paymentTransaction4.getAmount();
        java.lang.String str6 = paymentTransaction4.getTransactionId();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentMethod paymentMethod6 = paymentTransaction4.getMethod();
        com.yorku.lab.enums.PaymentType paymentType7 = paymentTransaction4.getType();
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertNull(paymentType7);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) ' ', paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentType paymentType5 = paymentTransaction4.getType();
        org.junit.Assert.assertNull(paymentType5);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentMethod paymentMethod6 = paymentTransaction4.getMethod();
        com.yorku.lab.enums.PaymentType paymentType9 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod10 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction11 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType9, paymentMethod10);
        com.yorku.lab.enums.PaymentStatus paymentStatus12 = paymentTransaction11.getStatus();
        paymentTransaction4.setStatus(paymentStatus12);
        com.yorku.lab.enums.PaymentType paymentType16 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod17 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction18 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType16, paymentMethod17);
        double double19 = paymentTransaction18.getAmount();
        com.yorku.lab.enums.PaymentType paymentType22 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod23 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction24 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType22, paymentMethod23);
        java.lang.String str25 = paymentTransaction24.getTransactionId();
        com.yorku.lab.enums.PaymentType paymentType28 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod29 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction30 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType28, paymentMethod29);
        com.yorku.lab.enums.PaymentStatus paymentStatus31 = paymentTransaction30.getStatus();
        paymentTransaction24.setStatus(paymentStatus31);
        com.yorku.lab.enums.PaymentStatus paymentStatus33 = paymentTransaction24.getStatus();
        paymentTransaction18.setStatus(paymentStatus33);
        paymentTransaction4.setStatus(paymentStatus33);
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertTrue("'" + paymentStatus12 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus12.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + paymentStatus31 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus31.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertTrue("'" + paymentStatus33 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus33.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType2, paymentMethod3);
        double double5 = paymentTransaction4.getAmount();
        com.yorku.lab.enums.PaymentType paymentType8 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod9 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType8, paymentMethod9);
        java.lang.String str11 = paymentTransaction10.getTransactionId();
        com.yorku.lab.enums.PaymentType paymentType14 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod15 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction16 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType14, paymentMethod15);
        com.yorku.lab.enums.PaymentStatus paymentStatus17 = paymentTransaction16.getStatus();
        paymentTransaction10.setStatus(paymentStatus17);
        com.yorku.lab.enums.PaymentStatus paymentStatus19 = paymentTransaction10.getStatus();
        paymentTransaction4.setStatus(paymentStatus19);
        com.yorku.lab.enums.PaymentType paymentType21 = null;
        paymentTransaction4.setType(paymentType21);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + paymentStatus17 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus17.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertTrue("'" + paymentStatus19 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus19.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) '#', paymentType2, paymentMethod3);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType2, paymentMethod3);
        java.lang.String str5 = paymentTransaction4.getTransactionId();
        java.lang.String str6 = paymentTransaction4.getTransactionId();
        com.yorku.lab.enums.PaymentType paymentType7 = paymentTransaction4.getType();
        java.lang.String str8 = paymentTransaction4.getTransactionId();
        com.yorku.lab.enums.PaymentStatus paymentStatus9 = paymentTransaction4.getStatus();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(paymentType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + paymentStatus9 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus9.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("hi!", (double) (byte) 1, paymentType2, paymentMethod3);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) ' ', paymentType2, paymentMethod3);
        java.lang.String str5 = paymentTransaction4.getReservationId();
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType2, paymentMethod3);
        double double5 = paymentTransaction4.getAmount();
        com.yorku.lab.enums.PaymentType paymentType8 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod9 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType8, paymentMethod9);
        java.lang.String str11 = paymentTransaction10.getTransactionId();
        com.yorku.lab.enums.PaymentType paymentType14 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod15 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction16 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType14, paymentMethod15);
        com.yorku.lab.enums.PaymentStatus paymentStatus17 = paymentTransaction16.getStatus();
        paymentTransaction10.setStatus(paymentStatus17);
        com.yorku.lab.enums.PaymentStatus paymentStatus19 = paymentTransaction10.getStatus();
        paymentTransaction4.setStatus(paymentStatus19);
        java.lang.String str21 = paymentTransaction4.getReservationId();
        com.yorku.lab.enums.PaymentMethod paymentMethod22 = paymentTransaction4.getMethod();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + paymentStatus17 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus17.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertTrue("'" + paymentStatus19 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus19.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(paymentMethod22);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType2, paymentMethod3);
        java.lang.String str5 = paymentTransaction4.getTransactionId();
        com.yorku.lab.enums.PaymentMethod paymentMethod6 = paymentTransaction4.getMethod();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = paymentMethod6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(paymentMethod6);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        java.lang.String str5 = paymentTransaction4.getTransactionId();
        com.yorku.lab.enums.PaymentType paymentType6 = null;
        paymentTransaction4.setType(paymentType6);
        com.yorku.lab.enums.PaymentStatus paymentStatus8 = paymentTransaction4.getStatus();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + paymentStatus8 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus8.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentMethod paymentMethod6 = paymentTransaction4.getMethod();
        java.lang.String str7 = paymentTransaction4.getReservationId();
        com.yorku.lab.enums.PaymentType paymentType8 = paymentTransaction4.getType();
        com.yorku.lab.enums.PaymentType paymentType9 = null;
        paymentTransaction4.setType(paymentType9);
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(paymentType8);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentMethod paymentMethod6 = paymentTransaction4.getMethod();
        com.yorku.lab.enums.PaymentMethod paymentMethod7 = paymentTransaction4.getMethod();
        com.yorku.lab.enums.PaymentType paymentType8 = null;
        paymentTransaction4.setType(paymentType8);
        com.yorku.lab.enums.PaymentType paymentType10 = null;
        paymentTransaction4.setType(paymentType10);
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertNull(paymentMethod7);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType2, paymentMethod3);
        java.lang.String str5 = paymentTransaction4.getTransactionId();
        java.lang.String str6 = paymentTransaction4.getReservationId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentStatus paymentStatus6 = paymentTransaction4.getStatus();
        java.lang.String str7 = paymentTransaction4.getTransactionId();
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertTrue("'" + paymentStatus6 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus6.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType2, paymentMethod3);
        java.lang.String str5 = paymentTransaction4.getTransactionId();
        com.yorku.lab.enums.PaymentType paymentType8 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod9 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType8, paymentMethod9);
        com.yorku.lab.enums.PaymentStatus paymentStatus11 = paymentTransaction10.getStatus();
        paymentTransaction4.setStatus(paymentStatus11);
        com.yorku.lab.enums.PaymentStatus paymentStatus13 = paymentTransaction4.getStatus();
        java.lang.Class<?> wildcardClass14 = paymentTransaction4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + paymentStatus11 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus11.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertTrue("'" + paymentStatus13 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus13.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction5 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 1, paymentType2, paymentMethod3, "");
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType2, paymentMethod3);
        java.lang.String str5 = paymentTransaction4.getTransactionId();
        java.lang.String str6 = paymentTransaction4.getTransactionId();
        com.yorku.lab.enums.PaymentType paymentType9 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod10 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction12 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) -1, paymentType9, paymentMethod10, "");
        com.yorku.lab.enums.PaymentStatus paymentStatus13 = paymentTransaction12.getStatus();
        paymentTransaction4.setStatus(paymentStatus13);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + paymentStatus13 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus13.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentMethod paymentMethod6 = paymentTransaction4.getMethod();
        java.lang.String str7 = paymentTransaction4.getReservationId();
        com.yorku.lab.enums.PaymentType paymentType8 = null;
        paymentTransaction4.setType(paymentType8);
        java.lang.String str10 = paymentTransaction4.getTransactionId();
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType2, paymentMethod3);
        double double5 = paymentTransaction4.getAmount();
        com.yorku.lab.enums.PaymentType paymentType8 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod9 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType8, paymentMethod9);
        java.lang.String str11 = paymentTransaction10.getTransactionId();
        com.yorku.lab.enums.PaymentType paymentType14 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod15 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction16 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType14, paymentMethod15);
        com.yorku.lab.enums.PaymentStatus paymentStatus17 = paymentTransaction16.getStatus();
        paymentTransaction10.setStatus(paymentStatus17);
        com.yorku.lab.enums.PaymentStatus paymentStatus19 = paymentTransaction10.getStatus();
        paymentTransaction4.setStatus(paymentStatus19);
        java.lang.String str21 = paymentTransaction4.getReservationId();
        java.lang.String str22 = paymentTransaction4.getTransactionId();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + paymentStatus17 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus17.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertTrue("'" + paymentStatus19 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus19.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        double double5 = paymentTransaction4.getAmount();
        com.yorku.lab.enums.PaymentStatus paymentStatus6 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentMethod paymentMethod7 = paymentTransaction4.getMethod();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + paymentStatus6 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus6.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentMethod7);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentMethod paymentMethod5 = paymentTransaction4.getMethod();
        org.junit.Assert.assertNull(paymentMethod5);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 1.0d, paymentType2, paymentMethod3);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentType paymentType5 = null;
        paymentTransaction4.setType(paymentType5);
        double double7 = paymentTransaction4.getAmount();
        com.yorku.lab.enums.PaymentStatus paymentStatus8 = paymentTransaction4.getStatus();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + paymentStatus8 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus8.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType2, paymentMethod3);
        java.lang.String str5 = paymentTransaction4.getTransactionId();
        java.lang.String str6 = paymentTransaction4.getTransactionId();
        double double7 = paymentTransaction4.getAmount();
        java.lang.String str8 = paymentTransaction4.getReservationId();
        java.lang.String str9 = paymentTransaction4.getReservationId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        double double5 = paymentTransaction4.getAmount();
        com.yorku.lab.enums.PaymentMethod paymentMethod6 = paymentTransaction4.getMethod();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(paymentMethod6);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentMethod paymentMethod6 = paymentTransaction4.getMethod();
        com.yorku.lab.enums.PaymentType paymentType9 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod10 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction11 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType9, paymentMethod10);
        com.yorku.lab.enums.PaymentStatus paymentStatus12 = paymentTransaction11.getStatus();
        paymentTransaction4.setStatus(paymentStatus12);
        java.lang.String str14 = paymentTransaction4.getTransactionId();
        java.lang.String str15 = paymentTransaction4.getTransactionId();
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertTrue("'" + paymentStatus12 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus12.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType2, paymentMethod3);
        java.lang.String str5 = paymentTransaction4.getTransactionId();
        com.yorku.lab.enums.PaymentMethod paymentMethod6 = paymentTransaction4.getMethod();
        com.yorku.lab.enums.PaymentMethod paymentMethod7 = paymentTransaction4.getMethod();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertNull(paymentMethod7);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        double double5 = paymentTransaction4.getAmount();
        com.yorku.lab.enums.PaymentType paymentType8 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod9 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType8, paymentMethod9);
        com.yorku.lab.enums.PaymentStatus paymentStatus11 = paymentTransaction10.getStatus();
        com.yorku.lab.enums.PaymentMethod paymentMethod12 = paymentTransaction10.getMethod();
        com.yorku.lab.enums.PaymentType paymentType13 = null;
        paymentTransaction10.setType(paymentType13);
        com.yorku.lab.enums.PaymentStatus paymentStatus15 = paymentTransaction10.getStatus();
        paymentTransaction4.setStatus(paymentStatus15);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + paymentStatus11 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus11.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentMethod12);
        org.junit.Assert.assertTrue("'" + paymentStatus15 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus15.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) 100, paymentType2, paymentMethod3);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentMethod paymentMethod6 = paymentTransaction4.getMethod();
        com.yorku.lab.enums.PaymentStatus paymentStatus7 = paymentTransaction4.getStatus();
        java.lang.Class<?> wildcardClass8 = paymentTransaction4.getClass();
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertTrue("'" + paymentStatus7 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus7.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentMethod paymentMethod6 = paymentTransaction4.getMethod();
        com.yorku.lab.enums.PaymentType paymentType7 = null;
        paymentTransaction4.setType(paymentType7);
        java.lang.String str9 = paymentTransaction4.getTransactionId();
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentMethod paymentMethod6 = paymentTransaction4.getMethod();
        com.yorku.lab.enums.PaymentMethod paymentMethod7 = paymentTransaction4.getMethod();
        com.yorku.lab.enums.PaymentType paymentType8 = null;
        paymentTransaction4.setType(paymentType8);
        com.yorku.lab.enums.PaymentMethod paymentMethod10 = paymentTransaction4.getMethod();
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertNull(paymentMethod7);
        org.junit.Assert.assertNull(paymentMethod10);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType2, paymentMethod3);
        java.lang.String str5 = paymentTransaction4.getReservationId();
        com.yorku.lab.enums.PaymentMethod paymentMethod6 = paymentTransaction4.getMethod();
        java.lang.String str7 = paymentTransaction4.getTransactionId();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction5 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 0, paymentType2, paymentMethod3, "");
        com.yorku.lab.enums.PaymentType paymentType6 = null;
        paymentTransaction5.setType(paymentType6);
        com.yorku.lab.enums.PaymentStatus paymentStatus8 = paymentTransaction5.getStatus();
        org.junit.Assert.assertTrue("'" + paymentStatus8 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus8.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) 10.0f, paymentType2, paymentMethod3);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType2, paymentMethod3);
        java.lang.String str5 = paymentTransaction4.getTransactionId();
        com.yorku.lab.enums.PaymentType paymentType8 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod9 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction10 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType8, paymentMethod9);
        com.yorku.lab.enums.PaymentStatus paymentStatus11 = paymentTransaction10.getStatus();
        paymentTransaction4.setStatus(paymentStatus11);
        com.yorku.lab.enums.PaymentStatus paymentStatus13 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentMethod paymentMethod14 = paymentTransaction4.getMethod();
        com.yorku.lab.enums.PaymentStatus paymentStatus15 = paymentTransaction4.getStatus();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + paymentStatus11 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus11.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertTrue("'" + paymentStatus13 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus13.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentMethod14);
        org.junit.Assert.assertTrue("'" + paymentStatus15 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus15.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = null;
        paymentTransaction4.setStatus(paymentStatus5);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) 1L, paymentType2, paymentMethod3);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentMethod paymentMethod6 = paymentTransaction4.getMethod();
        com.yorku.lab.enums.PaymentMethod paymentMethod7 = paymentTransaction4.getMethod();
        com.yorku.lab.enums.PaymentType paymentType8 = null;
        paymentTransaction4.setType(paymentType8);
        double double10 = paymentTransaction4.getAmount();
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertNull(paymentMethod7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) ' ', paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        double double5 = paymentTransaction4.getAmount();
        com.yorku.lab.enums.PaymentStatus paymentStatus6 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentType paymentType7 = null;
        paymentTransaction4.setType(paymentType7);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + paymentStatus6 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus6.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction5 = new com.yorku.lab.model.PaymentTransaction("hi!", 0.0d, paymentType2, paymentMethod3, "hi!");
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 100, paymentType2, paymentMethod3);
        java.lang.String str5 = paymentTransaction4.getTransactionId();
        com.yorku.lab.enums.PaymentType paymentType6 = paymentTransaction4.getType();
        com.yorku.lab.enums.PaymentStatus paymentStatus7 = paymentTransaction4.getStatus();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(paymentType6);
        org.junit.Assert.assertTrue("'" + paymentStatus7 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus7.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        java.lang.String str5 = paymentTransaction4.getTransactionId();
        java.lang.String str6 = paymentTransaction4.getReservationId();
        java.lang.String str7 = paymentTransaction4.getReservationId();
        java.lang.String str8 = paymentTransaction4.getTransactionId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction5 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) 0, paymentType2, paymentMethod3, "");
        com.yorku.lab.enums.PaymentType paymentType6 = null;
        paymentTransaction5.setType(paymentType6);
        com.yorku.lab.enums.PaymentStatus paymentStatus8 = null;
        paymentTransaction5.setStatus(paymentStatus8);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction5 = new com.yorku.lab.model.PaymentTransaction("", (double) (short) -1, paymentType2, paymentMethod3, "");
        com.yorku.lab.enums.PaymentStatus paymentStatus6 = paymentTransaction5.getStatus();
        java.lang.String str7 = paymentTransaction5.getTransactionId();
        java.lang.String str8 = paymentTransaction5.getReservationId();
        org.junit.Assert.assertTrue("'" + paymentStatus6 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus6.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", (double) 10, paymentType2, paymentMethod3);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentStatus paymentStatus6 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentType paymentType7 = null;
        paymentTransaction4.setType(paymentType7);
        double double9 = paymentTransaction4.getAmount();
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertTrue("'" + paymentStatus6 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus6.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction5 = new com.yorku.lab.model.PaymentTransaction("", (double) 100, paymentType2, paymentMethod3, "");
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentMethod paymentMethod6 = paymentTransaction4.getMethod();
        paymentTransaction4.setReservationId("hi!");
        java.lang.String str9 = paymentTransaction4.getTransactionId();
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentMethod paymentMethod6 = paymentTransaction4.getMethod();
        java.lang.String str7 = paymentTransaction4.getReservationId();
        com.yorku.lab.enums.PaymentType paymentType8 = null;
        paymentTransaction4.setType(paymentType8);
        java.lang.String str10 = paymentTransaction4.getReservationId();
        java.lang.String str11 = paymentTransaction4.getReservationId();
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction5 = new com.yorku.lab.model.PaymentTransaction("", (double) 1L, paymentType2, paymentMethod3, "");
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentMethod paymentMethod6 = paymentTransaction4.getMethod();
        com.yorku.lab.enums.PaymentType paymentType9 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod10 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction11 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType9, paymentMethod10);
        com.yorku.lab.enums.PaymentStatus paymentStatus12 = paymentTransaction11.getStatus();
        paymentTransaction4.setStatus(paymentStatus12);
        paymentTransaction4.setReservationId("hi!");
        com.yorku.lab.enums.PaymentMethod paymentMethod16 = paymentTransaction4.getMethod();
        java.lang.String str17 = paymentTransaction4.getReservationId();
        com.yorku.lab.enums.PaymentStatus paymentStatus18 = paymentTransaction4.getStatus();
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentMethod6);
        org.junit.Assert.assertTrue("'" + paymentStatus12 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus12.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertNull(paymentMethod16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + paymentStatus18 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus18.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("hi!", (double) 'a', paymentType2, paymentMethod3);
        paymentTransaction4.setReservationId("");
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        com.yorku.lab.enums.PaymentType paymentType2 = null;
        com.yorku.lab.enums.PaymentMethod paymentMethod3 = null;
        com.yorku.lab.model.PaymentTransaction paymentTransaction4 = new com.yorku.lab.model.PaymentTransaction("", 0.0d, paymentType2, paymentMethod3);
        com.yorku.lab.enums.PaymentStatus paymentStatus5 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentStatus paymentStatus6 = paymentTransaction4.getStatus();
        com.yorku.lab.enums.PaymentType paymentType7 = null;
        paymentTransaction4.setType(paymentType7);
        com.yorku.lab.enums.PaymentType paymentType9 = null;
        paymentTransaction4.setType(paymentType9);
        org.junit.Assert.assertTrue("'" + paymentStatus5 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus5.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
        org.junit.Assert.assertTrue("'" + paymentStatus6 + "' != '" + com.yorku.lab.enums.PaymentStatus.AUTHORIZED + "'", paymentStatus6.equals(com.yorku.lab.enums.PaymentStatus.AUTHORIZED));
    }
}

