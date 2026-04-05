package com.yorku.lab.model;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ApprovalRequestRegressionTest0 {

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
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.reject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.reject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.Class<?> wildcardClass4 = approvalRequest2.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRejectReason();
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.reject("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRejectReason();
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.approve();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRejectReason();
        java.lang.String str5 = approvalRequest2.getRejectReason();
        com.yorku.lab.enums.ApprovalStatus approvalStatus6 = approvalRequest2.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.approve();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + approvalStatus6 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus6.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRejectReason();
        java.lang.String str5 = approvalRequest2.getRejectReason();
        java.lang.String str6 = approvalRequest2.getRejectReason();
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.reject("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRejectReason();
        java.lang.String str5 = approvalRequest2.getRejectReason();
        com.yorku.lab.enums.ApprovalStatus approvalStatus6 = approvalRequest2.getStatus();
        com.yorku.lab.model.User user8 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest9 = new com.yorku.lab.model.ApprovalRequest("", user8);
        java.lang.String str10 = approvalRequest9.getRejectReason();
        java.lang.String str11 = approvalRequest9.getRejectReason();
        java.lang.String str12 = approvalRequest9.getRejectReason();
        com.yorku.lab.enums.ApprovalStatus approvalStatus13 = approvalRequest9.getStatus();
        approvalRequest2.setStatus(approvalStatus13);
        java.lang.Class<?> wildcardClass15 = approvalRequest2.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + approvalStatus6 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus6.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + approvalStatus13 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus13.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRejectReason();
        java.lang.String str5 = approvalRequest2.getRejectReason();
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.approve();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRejectReason();
        java.lang.String str5 = approvalRequest2.getRejectReason();
        approvalRequest2.setRejectReason("");
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.approve();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.reject("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRejectReason();
        java.lang.String str5 = approvalRequest2.getRejectReason();
        approvalRequest2.setRejectReason("");
        com.yorku.lab.model.User user9 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest10 = new com.yorku.lab.model.ApprovalRequest("", user9);
        java.lang.String str11 = approvalRequest10.getRejectReason();
        java.lang.String str12 = approvalRequest10.getRejectReason();
        java.lang.String str13 = approvalRequest10.getRejectReason();
        com.yorku.lab.enums.ApprovalStatus approvalStatus14 = approvalRequest10.getStatus();
        com.yorku.lab.model.User user16 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest17 = new com.yorku.lab.model.ApprovalRequest("", user16);
        java.lang.String str18 = approvalRequest17.getRejectReason();
        java.lang.String str19 = approvalRequest17.getRejectReason();
        java.lang.String str20 = approvalRequest17.getRejectReason();
        com.yorku.lab.enums.ApprovalStatus approvalStatus21 = approvalRequest17.getStatus();
        approvalRequest10.setStatus(approvalStatus21);
        approvalRequest2.setStatus(approvalStatus21);
        java.lang.String str24 = approvalRequest2.getRejectReason();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + approvalStatus14 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus14.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + approvalStatus21 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus21.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRejectReason();
        java.lang.String str5 = approvalRequest2.getRejectReason();
        com.yorku.lab.enums.ApprovalStatus approvalStatus6 = approvalRequest2.getStatus();
        com.yorku.lab.model.User user8 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest9 = new com.yorku.lab.model.ApprovalRequest("", user8);
        java.lang.String str10 = approvalRequest9.getRejectReason();
        java.lang.String str11 = approvalRequest9.getRejectReason();
        java.lang.String str12 = approvalRequest9.getRejectReason();
        com.yorku.lab.enums.ApprovalStatus approvalStatus13 = approvalRequest9.getStatus();
        approvalRequest2.setStatus(approvalStatus13);
        approvalRequest2.setRejectReason("hi!");
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.approve();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + approvalStatus6 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus6.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + approvalStatus13 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus13.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        approvalRequest2.setRejectReason("");
        com.yorku.lab.model.User user6 = approvalRequest2.getUser();
        java.lang.Class<?> wildcardClass7 = approvalRequest2.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRejectReason();
        java.lang.String str5 = approvalRequest2.getRejectReason();
        com.yorku.lab.enums.ApprovalStatus approvalStatus6 = approvalRequest2.getStatus();
        java.lang.String str7 = approvalRequest2.getRequestId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + approvalStatus6 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus6.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("hi!", user1);
        com.yorku.lab.enums.ApprovalStatus approvalStatus3 = approvalRequest2.getStatus();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        org.junit.Assert.assertTrue("'" + approvalStatus3 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus3.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRejectReason();
        java.lang.String str5 = approvalRequest2.getRejectReason();
        approvalRequest2.setRejectReason("");
        com.yorku.lab.model.User user9 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest10 = new com.yorku.lab.model.ApprovalRequest("", user9);
        java.lang.String str11 = approvalRequest10.getRejectReason();
        java.lang.String str12 = approvalRequest10.getRejectReason();
        java.lang.String str13 = approvalRequest10.getRejectReason();
        com.yorku.lab.enums.ApprovalStatus approvalStatus14 = approvalRequest10.getStatus();
        com.yorku.lab.model.User user16 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest17 = new com.yorku.lab.model.ApprovalRequest("", user16);
        java.lang.String str18 = approvalRequest17.getRejectReason();
        java.lang.String str19 = approvalRequest17.getRejectReason();
        java.lang.String str20 = approvalRequest17.getRejectReason();
        com.yorku.lab.enums.ApprovalStatus approvalStatus21 = approvalRequest17.getStatus();
        approvalRequest10.setStatus(approvalStatus21);
        approvalRequest2.setStatus(approvalStatus21);
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.approve();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + approvalStatus14 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus14.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + approvalStatus21 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus21.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        approvalRequest2.setRejectReason("");
        com.yorku.lab.model.User user6 = approvalRequest2.getUser();
        com.yorku.lab.model.User user8 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest9 = new com.yorku.lab.model.ApprovalRequest("", user8);
        java.lang.String str10 = approvalRequest9.getRejectReason();
        approvalRequest9.setRejectReason("");
        com.yorku.lab.enums.ApprovalStatus approvalStatus13 = approvalRequest9.getStatus();
        approvalRequest2.setStatus(approvalStatus13);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + approvalStatus13 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus13.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRejectReason();
        java.lang.String str5 = approvalRequest2.getRejectReason();
        java.lang.String str6 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user8 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest9 = new com.yorku.lab.model.ApprovalRequest("", user8);
        java.lang.String str10 = approvalRequest9.getRejectReason();
        java.lang.String str11 = approvalRequest9.getRejectReason();
        java.lang.String str12 = approvalRequest9.getRejectReason();
        com.yorku.lab.enums.ApprovalStatus approvalStatus13 = approvalRequest9.getStatus();
        approvalRequest2.setStatus(approvalStatus13);
        java.lang.String str15 = approvalRequest2.getRequestId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + approvalStatus13 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus13.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRejectReason();
        java.lang.String str5 = approvalRequest2.getRejectReason();
        java.lang.String str6 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user8 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest9 = new com.yorku.lab.model.ApprovalRequest("", user8);
        java.lang.String str10 = approvalRequest9.getRejectReason();
        java.lang.String str11 = approvalRequest9.getRejectReason();
        java.lang.String str12 = approvalRequest9.getRejectReason();
        com.yorku.lab.enums.ApprovalStatus approvalStatus13 = approvalRequest9.getStatus();
        approvalRequest2.setStatus(approvalStatus13);
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.reject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + approvalStatus13 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus13.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        approvalRequest2.setRejectReason("");
        com.yorku.lab.enums.ApprovalStatus approvalStatus6 = approvalRequest2.getStatus();
        java.lang.String str7 = approvalRequest2.getRejectReason();
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.reject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + approvalStatus6 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus6.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        com.yorku.lab.enums.ApprovalStatus approvalStatus3 = approvalRequest2.getStatus();
        java.lang.Class<?> wildcardClass4 = approvalRequest2.getClass();
        org.junit.Assert.assertTrue("'" + approvalStatus3 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus3.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        approvalRequest2.setRejectReason("");
        com.yorku.lab.enums.ApprovalStatus approvalStatus6 = approvalRequest2.getStatus();
        approvalRequest2.setRejectReason("hi!");
        java.lang.String str9 = approvalRequest2.getRequestId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + approvalStatus6 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus6.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRejectReason();
        java.lang.String str5 = approvalRequest2.getRejectReason();
        java.lang.String str6 = approvalRequest2.getRejectReason();
        java.lang.String str7 = approvalRequest2.getRejectReason();
        java.lang.String str8 = approvalRequest2.getRequestId();
        com.yorku.lab.model.User user9 = approvalRequest2.getUser();
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.reject("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(user9);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRejectReason();
        java.lang.String str5 = approvalRequest2.getRejectReason();
        com.yorku.lab.enums.ApprovalStatus approvalStatus6 = approvalRequest2.getStatus();
        java.lang.String str7 = approvalRequest2.getRejectReason();
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.reject("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + approvalStatus6 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus6.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRejectReason();
        java.lang.String str5 = approvalRequest2.getRejectReason();
        java.lang.String str6 = approvalRequest2.getRejectReason();
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.reject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRejectReason();
        java.lang.String str5 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user7 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest8 = new com.yorku.lab.model.ApprovalRequest("", user7);
        java.lang.String str9 = approvalRequest8.getRejectReason();
        java.lang.String str10 = approvalRequest8.getRejectReason();
        java.lang.String str11 = approvalRequest8.getRejectReason();
        com.yorku.lab.enums.ApprovalStatus approvalStatus12 = approvalRequest8.getStatus();
        approvalRequest2.setStatus(approvalStatus12);
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.reject("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + approvalStatus12 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus12.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRejectReason();
        java.lang.String str5 = approvalRequest2.getRejectReason();
        approvalRequest2.setRejectReason("");
        com.yorku.lab.model.User user8 = approvalRequest2.getUser();
        approvalRequest2.setRejectReason("");
        java.lang.String str11 = approvalRequest2.getRejectReason();
        java.lang.String str12 = approvalRequest2.getRequestId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRejectReason();
        java.lang.String str5 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user7 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest8 = new com.yorku.lab.model.ApprovalRequest("", user7);
        java.lang.String str9 = approvalRequest8.getRejectReason();
        java.lang.String str10 = approvalRequest8.getRejectReason();
        java.lang.String str11 = approvalRequest8.getRejectReason();
        com.yorku.lab.enums.ApprovalStatus approvalStatus12 = approvalRequest8.getStatus();
        com.yorku.lab.model.User user14 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest15 = new com.yorku.lab.model.ApprovalRequest("", user14);
        java.lang.String str16 = approvalRequest15.getRejectReason();
        java.lang.String str17 = approvalRequest15.getRejectReason();
        java.lang.String str18 = approvalRequest15.getRejectReason();
        com.yorku.lab.enums.ApprovalStatus approvalStatus19 = approvalRequest15.getStatus();
        approvalRequest8.setStatus(approvalStatus19);
        approvalRequest2.setStatus(approvalStatus19);
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.approve();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + approvalStatus12 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus12.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + approvalStatus19 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus19.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        approvalRequest2.setRejectReason("");
        com.yorku.lab.model.User user6 = approvalRequest2.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = user6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user6);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRejectReason();
        java.lang.String str5 = approvalRequest2.getRejectReason();
        java.lang.String str6 = approvalRequest2.getRejectReason();
        java.lang.String str7 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user8 = approvalRequest2.getUser();
        com.yorku.lab.model.User user9 = approvalRequest2.getUser();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("hi!", user1);
        com.yorku.lab.model.User user3 = approvalRequest2.getUser();
        java.lang.String str4 = approvalRequest2.getRequestId();
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.reject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("hi!", user1);
        com.yorku.lab.model.User user3 = approvalRequest2.getUser();
        java.lang.String str4 = approvalRequest2.getRequestId();
        approvalRequest2.setRejectReason("hi!");
        com.yorku.lab.enums.ApprovalStatus approvalStatus7 = approvalRequest2.getStatus();
        java.lang.String str8 = approvalRequest2.getRequestId();
        com.yorku.lab.model.User user9 = approvalRequest2.getUser();
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus7 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus7.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(user9);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRejectReason();
        java.lang.String str5 = approvalRequest2.getRejectReason();
        java.lang.String str6 = approvalRequest2.getRejectReason();
        java.lang.String str7 = approvalRequest2.getRejectReason();
        java.lang.String str8 = approvalRequest2.getRequestId();
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.approve();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("hi!", user1);
        com.yorku.lab.model.User user3 = approvalRequest2.getUser();
        java.lang.String str4 = approvalRequest2.getRequestId();
        approvalRequest2.setRejectReason("hi!");
        com.yorku.lab.enums.ApprovalStatus approvalStatus7 = approvalRequest2.getStatus();
        com.yorku.lab.enums.ApprovalStatus approvalStatus8 = approvalRequest2.getStatus();
        com.yorku.lab.model.User user10 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest11 = new com.yorku.lab.model.ApprovalRequest("", user10);
        java.lang.String str12 = approvalRequest11.getRejectReason();
        approvalRequest11.setRejectReason("");
        com.yorku.lab.enums.ApprovalStatus approvalStatus15 = approvalRequest11.getStatus();
        approvalRequest2.setStatus(approvalStatus15);
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus7 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus7.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertTrue("'" + approvalStatus8 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus8.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + approvalStatus15 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus15.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("hi!", user1);
        com.yorku.lab.model.User user3 = approvalRequest2.getUser();
        java.lang.String str4 = approvalRequest2.getRequestId();
        approvalRequest2.setRejectReason("hi!");
        com.yorku.lab.enums.ApprovalStatus approvalStatus7 = approvalRequest2.getStatus();
        java.lang.String str8 = approvalRequest2.getRequestId();
        java.lang.String str9 = approvalRequest2.getRejectReason();
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus7 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus7.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRejectReason();
        java.lang.String str5 = approvalRequest2.getRejectReason();
        java.lang.String str6 = approvalRequest2.getRejectReason();
        java.lang.String str7 = approvalRequest2.getRequestId();
        java.lang.Class<?> wildcardClass8 = approvalRequest2.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRejectReason();
        java.lang.String str5 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user7 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest8 = new com.yorku.lab.model.ApprovalRequest("", user7);
        java.lang.String str9 = approvalRequest8.getRejectReason();
        java.lang.String str10 = approvalRequest8.getRejectReason();
        java.lang.String str11 = approvalRequest8.getRejectReason();
        com.yorku.lab.enums.ApprovalStatus approvalStatus12 = approvalRequest8.getStatus();
        com.yorku.lab.model.User user14 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest15 = new com.yorku.lab.model.ApprovalRequest("", user14);
        java.lang.String str16 = approvalRequest15.getRejectReason();
        java.lang.String str17 = approvalRequest15.getRejectReason();
        java.lang.String str18 = approvalRequest15.getRejectReason();
        com.yorku.lab.enums.ApprovalStatus approvalStatus19 = approvalRequest15.getStatus();
        approvalRequest8.setStatus(approvalStatus19);
        approvalRequest2.setStatus(approvalStatus19);
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.reject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + approvalStatus12 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus12.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + approvalStatus19 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus19.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("hi!", user1);
        com.yorku.lab.enums.ApprovalStatus approvalStatus3 = approvalRequest2.getStatus();
        java.lang.Class<?> wildcardClass4 = approvalRequest2.getClass();
        org.junit.Assert.assertTrue("'" + approvalStatus3 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus3.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("hi!", user1);
        com.yorku.lab.enums.ApprovalStatus approvalStatus3 = approvalRequest2.getStatus();
        java.lang.String str4 = approvalRequest2.getRejectReason();
        approvalRequest2.setRejectReason("");
        java.lang.String str7 = approvalRequest2.getRejectReason();
        org.junit.Assert.assertTrue("'" + approvalStatus3 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus3.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("hi!", user1);
        com.yorku.lab.enums.ApprovalStatus approvalStatus3 = approvalRequest2.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.reject("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + approvalStatus3 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus3.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user5 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest6 = new com.yorku.lab.model.ApprovalRequest("", user5);
        java.lang.String str7 = approvalRequest6.getRejectReason();
        java.lang.String str8 = approvalRequest6.getRejectReason();
        java.lang.String str9 = approvalRequest6.getRejectReason();
        com.yorku.lab.model.User user11 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest12 = new com.yorku.lab.model.ApprovalRequest("", user11);
        java.lang.String str13 = approvalRequest12.getRejectReason();
        java.lang.String str14 = approvalRequest12.getRejectReason();
        java.lang.String str15 = approvalRequest12.getRejectReason();
        com.yorku.lab.enums.ApprovalStatus approvalStatus16 = approvalRequest12.getStatus();
        approvalRequest6.setStatus(approvalStatus16);
        approvalRequest2.setStatus(approvalStatus16);
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.approve();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + approvalStatus16 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus16.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("hi!", user1);
        com.yorku.lab.model.User user3 = approvalRequest2.getUser();
        java.lang.String str4 = approvalRequest2.getRequestId();
        java.lang.String str5 = approvalRequest2.getRequestId();
        java.lang.String str6 = approvalRequest2.getRejectReason();
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRejectReason();
        java.lang.String str5 = approvalRequest2.getRejectReason();
        com.yorku.lab.enums.ApprovalStatus approvalStatus6 = approvalRequest2.getStatus();
        com.yorku.lab.model.User user8 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest9 = new com.yorku.lab.model.ApprovalRequest("", user8);
        java.lang.String str10 = approvalRequest9.getRejectReason();
        java.lang.String str11 = approvalRequest9.getRejectReason();
        java.lang.String str12 = approvalRequest9.getRejectReason();
        com.yorku.lab.enums.ApprovalStatus approvalStatus13 = approvalRequest9.getStatus();
        approvalRequest2.setStatus(approvalStatus13);
        approvalRequest2.setRejectReason("hi!");
        approvalRequest2.setRejectReason("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + approvalStatus6 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus6.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + approvalStatus13 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus13.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        approvalRequest2.setRejectReason("");
        com.yorku.lab.model.User user6 = approvalRequest2.getUser();
        approvalRequest2.setRejectReason("");
        java.lang.String str9 = approvalRequest2.getRequestId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRejectReason();
        java.lang.String str5 = approvalRequest2.getRejectReason();
        java.lang.String str6 = approvalRequest2.getRejectReason();
        approvalRequest2.setRejectReason("hi!");
        approvalRequest2.setRejectReason("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("hi!", user1);
        com.yorku.lab.enums.ApprovalStatus approvalStatus3 = approvalRequest2.getStatus();
        java.lang.String str4 = approvalRequest2.getRejectReason();
        approvalRequest2.setRejectReason("");
        approvalRequest2.setRejectReason("");
        org.junit.Assert.assertTrue("'" + approvalStatus3 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus3.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        approvalRequest2.setRejectReason("");
        com.yorku.lab.enums.ApprovalStatus approvalStatus6 = approvalRequest2.getStatus();
        approvalRequest2.setRejectReason("hi!");
        approvalRequest2.setRejectReason("");
        com.yorku.lab.model.User user12 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest13 = new com.yorku.lab.model.ApprovalRequest("", user12);
        java.lang.String str14 = approvalRequest13.getRejectReason();
        java.lang.String str15 = approvalRequest13.getRejectReason();
        java.lang.String str16 = approvalRequest13.getRejectReason();
        java.lang.String str17 = approvalRequest13.getRejectReason();
        com.yorku.lab.model.User user19 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest20 = new com.yorku.lab.model.ApprovalRequest("", user19);
        java.lang.String str21 = approvalRequest20.getRejectReason();
        java.lang.String str22 = approvalRequest20.getRejectReason();
        java.lang.String str23 = approvalRequest20.getRejectReason();
        com.yorku.lab.enums.ApprovalStatus approvalStatus24 = approvalRequest20.getStatus();
        approvalRequest13.setStatus(approvalStatus24);
        approvalRequest2.setStatus(approvalStatus24);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + approvalStatus6 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus6.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + approvalStatus24 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus24.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRejectReason();
        java.lang.String str5 = approvalRequest2.getRejectReason();
        java.lang.String str6 = approvalRequest2.getRejectReason();
        java.lang.String str7 = approvalRequest2.getRejectReason();
        java.lang.String str8 = approvalRequest2.getRequestId();
        com.yorku.lab.model.User user9 = approvalRequest2.getUser();
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.approve();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(user9);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        approvalRequest2.setRejectReason("");
        com.yorku.lab.model.User user6 = approvalRequest2.getUser();
        java.lang.String str7 = approvalRequest2.getRequestId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRejectReason();
        approvalRequest2.setRejectReason("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRejectReason();
        java.lang.String str5 = approvalRequest2.getRejectReason();
        approvalRequest2.setRejectReason("");
        com.yorku.lab.model.User user8 = approvalRequest2.getUser();
        com.yorku.lab.enums.ApprovalStatus approvalStatus9 = approvalRequest2.getStatus();
        java.lang.String str10 = approvalRequest2.getRequestId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertTrue("'" + approvalStatus9 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus9.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRejectReason();
        java.lang.String str5 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user7 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest8 = new com.yorku.lab.model.ApprovalRequest("", user7);
        java.lang.String str9 = approvalRequest8.getRejectReason();
        java.lang.String str10 = approvalRequest8.getRejectReason();
        java.lang.String str11 = approvalRequest8.getRejectReason();
        com.yorku.lab.enums.ApprovalStatus approvalStatus12 = approvalRequest8.getStatus();
        com.yorku.lab.model.User user14 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest15 = new com.yorku.lab.model.ApprovalRequest("", user14);
        java.lang.String str16 = approvalRequest15.getRejectReason();
        java.lang.String str17 = approvalRequest15.getRejectReason();
        java.lang.String str18 = approvalRequest15.getRejectReason();
        com.yorku.lab.enums.ApprovalStatus approvalStatus19 = approvalRequest15.getStatus();
        approvalRequest8.setStatus(approvalStatus19);
        approvalRequest2.setStatus(approvalStatus19);
        com.yorku.lab.model.User user23 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest24 = new com.yorku.lab.model.ApprovalRequest("", user23);
        java.lang.String str25 = approvalRequest24.getRejectReason();
        approvalRequest24.setRejectReason("");
        com.yorku.lab.enums.ApprovalStatus approvalStatus28 = approvalRequest24.getStatus();
        approvalRequest24.setRejectReason("hi!");
        com.yorku.lab.model.User user32 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest33 = new com.yorku.lab.model.ApprovalRequest("", user32);
        java.lang.String str34 = approvalRequest33.getRejectReason();
        java.lang.String str35 = approvalRequest33.getRejectReason();
        java.lang.String str36 = approvalRequest33.getRejectReason();
        approvalRequest33.setRejectReason("");
        com.yorku.lab.model.User user39 = approvalRequest33.getUser();
        com.yorku.lab.enums.ApprovalStatus approvalStatus40 = approvalRequest33.getStatus();
        approvalRequest24.setStatus(approvalStatus40);
        approvalRequest2.setStatus(approvalStatus40);
        java.lang.String str43 = approvalRequest2.getRequestId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + approvalStatus12 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus12.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + approvalStatus19 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus19.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + approvalStatus28 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus28.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(user39);
        org.junit.Assert.assertTrue("'" + approvalStatus40 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus40.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRejectReason();
        java.lang.String str5 = approvalRequest2.getRejectReason();
        approvalRequest2.setRejectReason("");
        approvalRequest2.setRejectReason("hi!");
        java.lang.String str10 = approvalRequest2.getRequestId();
        java.lang.String str11 = approvalRequest2.getRequestId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        approvalRequest2.setRejectReason("");
        com.yorku.lab.enums.ApprovalStatus approvalStatus6 = approvalRequest2.getStatus();
        java.lang.String str7 = approvalRequest2.getRejectReason();
        com.yorku.lab.enums.ApprovalStatus approvalStatus8 = approvalRequest2.getStatus();
        java.lang.String str9 = approvalRequest2.getRejectReason();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + approvalStatus6 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus6.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + approvalStatus8 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus8.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("hi!", user1);
        com.yorku.lab.enums.ApprovalStatus approvalStatus3 = approvalRequest2.getStatus();
        java.lang.String str4 = approvalRequest2.getRejectReason();
        java.lang.Class<?> wildcardClass5 = approvalRequest2.getClass();
        org.junit.Assert.assertTrue("'" + approvalStatus3 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus3.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRejectReason();
        java.lang.String str5 = approvalRequest2.getRejectReason();
        approvalRequest2.setRejectReason("");
        com.yorku.lab.model.User user8 = approvalRequest2.getUser();
        approvalRequest2.setRejectReason("");
        com.yorku.lab.enums.ApprovalStatus approvalStatus11 = approvalRequest2.getStatus();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertTrue("'" + approvalStatus11 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus11.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRejectReason();
        java.lang.String str5 = approvalRequest2.getRejectReason();
        com.yorku.lab.enums.ApprovalStatus approvalStatus6 = approvalRequest2.getStatus();
        java.lang.String str7 = approvalRequest2.getRejectReason();
        java.lang.Class<?> wildcardClass8 = approvalRequest2.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + approvalStatus6 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus6.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRejectReason();
        java.lang.String str5 = approvalRequest2.getRejectReason();
        java.lang.String str6 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user8 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest9 = new com.yorku.lab.model.ApprovalRequest("", user8);
        java.lang.String str10 = approvalRequest9.getRejectReason();
        java.lang.String str11 = approvalRequest9.getRejectReason();
        java.lang.String str12 = approvalRequest9.getRejectReason();
        com.yorku.lab.enums.ApprovalStatus approvalStatus13 = approvalRequest9.getStatus();
        approvalRequest2.setStatus(approvalStatus13);
        com.yorku.lab.enums.ApprovalStatus approvalStatus15 = null;
        approvalRequest2.setStatus(approvalStatus15);
        java.lang.Class<?> wildcardClass17 = approvalRequest2.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + approvalStatus13 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus13.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRejectReason();
        java.lang.String str5 = approvalRequest2.getRejectReason();
        approvalRequest2.setRejectReason("");
        com.yorku.lab.model.User user8 = approvalRequest2.getUser();
        approvalRequest2.setRejectReason("");
        java.lang.String str11 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user12 = approvalRequest2.getUser();
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.reject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRejectReason();
        java.lang.String str5 = approvalRequest2.getRejectReason();
        java.lang.String str6 = approvalRequest2.getRejectReason();
        java.lang.String str7 = approvalRequest2.getRejectReason();
        java.lang.String str8 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user9 = approvalRequest2.getUser();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(user9);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("hi!", user1);
        com.yorku.lab.model.User user3 = approvalRequest2.getUser();
        java.lang.String str4 = approvalRequest2.getRequestId();
        approvalRequest2.setRejectReason("hi!");
        com.yorku.lab.model.User user8 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest9 = new com.yorku.lab.model.ApprovalRequest("", user8);
        java.lang.String str10 = approvalRequest9.getRejectReason();
        java.lang.String str11 = approvalRequest9.getRejectReason();
        java.lang.String str12 = approvalRequest9.getRejectReason();
        com.yorku.lab.model.User user14 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest15 = new com.yorku.lab.model.ApprovalRequest("", user14);
        java.lang.String str16 = approvalRequest15.getRejectReason();
        java.lang.String str17 = approvalRequest15.getRejectReason();
        java.lang.String str18 = approvalRequest15.getRejectReason();
        com.yorku.lab.enums.ApprovalStatus approvalStatus19 = approvalRequest15.getStatus();
        com.yorku.lab.model.User user21 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest22 = new com.yorku.lab.model.ApprovalRequest("", user21);
        java.lang.String str23 = approvalRequest22.getRejectReason();
        java.lang.String str24 = approvalRequest22.getRejectReason();
        java.lang.String str25 = approvalRequest22.getRejectReason();
        com.yorku.lab.enums.ApprovalStatus approvalStatus26 = approvalRequest22.getStatus();
        approvalRequest15.setStatus(approvalStatus26);
        approvalRequest9.setStatus(approvalStatus26);
        approvalRequest2.setStatus(approvalStatus26);
        approvalRequest2.setRejectReason("");
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + approvalStatus19 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus19.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + approvalStatus26 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus26.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRejectReason();
        java.lang.String str5 = approvalRequest2.getRejectReason();
        java.lang.String str6 = approvalRequest2.getRejectReason();
        java.lang.String str7 = approvalRequest2.getRejectReason();
        java.lang.String str8 = approvalRequest2.getRejectReason();
        com.yorku.lab.enums.ApprovalStatus approvalStatus9 = approvalRequest2.getStatus();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + approvalStatus9 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus9.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("hi!", user1);
        com.yorku.lab.model.User user3 = approvalRequest2.getUser();
        approvalRequest2.setRejectReason("");
        org.junit.Assert.assertNull(user3);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRejectReason();
        java.lang.String str5 = approvalRequest2.getRejectReason();
        approvalRequest2.setRejectReason("");
        com.yorku.lab.model.User user8 = approvalRequest2.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = user8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        approvalRequest2.setRejectReason("");
        com.yorku.lab.model.User user6 = approvalRequest2.getUser();
        java.lang.String str7 = approvalRequest2.getRejectReason();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }
}

