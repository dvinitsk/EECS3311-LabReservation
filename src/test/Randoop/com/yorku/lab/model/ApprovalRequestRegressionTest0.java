package test.Randoop.com.yorku.lab.model;

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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
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
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.approve();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.Class<?> wildcardClass4 = approvalRequest2.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.approve();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        java.lang.String str6 = approvalRequest2.getRequestId();
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.approve();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = user5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.Class<?> wildcardClass3 = approvalRequest2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.approve();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        java.lang.String str6 = approvalRequest2.getRequestId();
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.reject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        approvalRequest2.setRejectReason("");
        com.yorku.lab.enums.ApprovalStatus approvalStatus8 = null;
        approvalRequest2.setStatus(approvalStatus8);
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.approve();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        approvalRequest2.setRejectReason("hi!");
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.approve();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user5);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("hi!", user1);
        com.yorku.lab.enums.ApprovalStatus approvalStatus3 = null;
        approvalRequest2.setStatus(approvalStatus3);
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.reject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        java.lang.String str6 = approvalRequest2.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus7 = approvalRequest2.getStatus();
        java.lang.String str8 = approvalRequest2.getRequestId();
        java.lang.String str9 = approvalRequest2.getRequestId();
        java.lang.Class<?> wildcardClass10 = approvalRequest2.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + approvalStatus7 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus7.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        approvalRequest2.setRejectReason("");
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.approve();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        approvalRequest2.setRejectReason("");
        approvalRequest2.setRejectReason("hi!");
        java.lang.String str10 = approvalRequest2.getRequestId();
        java.lang.Class<?> wildcardClass11 = approvalRequest2.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRequestId();
        com.yorku.lab.model.User user6 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest7 = new com.yorku.lab.model.ApprovalRequest("", user6);
        java.lang.String str8 = approvalRequest7.getRejectReason();
        java.lang.String str9 = approvalRequest7.getRequestId();
        com.yorku.lab.model.User user11 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest12 = new com.yorku.lab.model.ApprovalRequest("", user11);
        java.lang.String str13 = approvalRequest12.getRejectReason();
        com.yorku.lab.model.User user14 = approvalRequest12.getUser();
        com.yorku.lab.model.User user15 = approvalRequest12.getUser();
        java.lang.String str16 = approvalRequest12.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus17 = approvalRequest12.getStatus();
        approvalRequest7.setStatus(approvalStatus17);
        approvalRequest2.setStatus(approvalStatus17);
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.approve();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + approvalStatus17 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus17.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        java.lang.String str6 = approvalRequest2.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus7 = approvalRequest2.getStatus();
        java.lang.String str8 = approvalRequest2.getRequestId();
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.approve();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + approvalStatus7 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus7.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.approve();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        java.lang.String str6 = approvalRequest2.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus7 = approvalRequest2.getStatus();
        java.lang.String str8 = approvalRequest2.getRequestId();
        java.lang.String str9 = approvalRequest2.getRequestId();
        java.lang.String str10 = approvalRequest2.getRejectReason();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + approvalStatus7 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus7.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        approvalRequest2.setRejectReason("");
        com.yorku.lab.model.User user9 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest10 = new com.yorku.lab.model.ApprovalRequest("", user9);
        java.lang.String str11 = approvalRequest10.getRejectReason();
        java.lang.String str12 = approvalRequest10.getRequestId();
        com.yorku.lab.model.User user14 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest15 = new com.yorku.lab.model.ApprovalRequest("", user14);
        java.lang.String str16 = approvalRequest15.getRejectReason();
        com.yorku.lab.model.User user17 = approvalRequest15.getUser();
        com.yorku.lab.model.User user18 = approvalRequest15.getUser();
        java.lang.String str19 = approvalRequest15.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus20 = approvalRequest15.getStatus();
        approvalRequest10.setStatus(approvalStatus20);
        approvalRequest2.setStatus(approvalStatus20);
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.reject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + approvalStatus20 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus20.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRejectReason();
        java.lang.Class<?> wildcardClass5 = approvalRequest2.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        java.lang.String str6 = approvalRequest2.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus7 = approvalRequest2.getStatus();
        java.lang.Class<?> wildcardClass8 = approvalRequest2.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + approvalStatus7 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus7.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        com.yorku.lab.model.User user3 = approvalRequest2.getUser();
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.reject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        approvalRequest2.setRejectReason("hi!");
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.reject("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user5);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRequestId();
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.reject("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRequestId();
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.reject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.reject("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        approvalRequest2.setRejectReason("hi!");
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        com.yorku.lab.model.User user7 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest8 = new com.yorku.lab.model.ApprovalRequest("", user7);
        java.lang.String str9 = approvalRequest8.getRejectReason();
        java.lang.String str10 = approvalRequest8.getRequestId();
        com.yorku.lab.model.User user12 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest13 = new com.yorku.lab.model.ApprovalRequest("", user12);
        java.lang.String str14 = approvalRequest13.getRejectReason();
        java.lang.String str15 = approvalRequest13.getRequestId();
        com.yorku.lab.model.User user17 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest18 = new com.yorku.lab.model.ApprovalRequest("", user17);
        java.lang.String str19 = approvalRequest18.getRejectReason();
        com.yorku.lab.model.User user20 = approvalRequest18.getUser();
        com.yorku.lab.model.User user21 = approvalRequest18.getUser();
        java.lang.String str22 = approvalRequest18.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus23 = approvalRequest18.getStatus();
        approvalRequest13.setStatus(approvalStatus23);
        approvalRequest8.setStatus(approvalStatus23);
        approvalRequest2.setStatus(approvalStatus23);
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.reject("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertNull(user21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + approvalStatus23 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus23.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        approvalRequest2.setRejectReason("");
        com.yorku.lab.enums.ApprovalStatus approvalStatus8 = null;
        approvalRequest2.setStatus(approvalStatus8);
        com.yorku.lab.model.User user10 = approvalRequest2.getUser();
        com.yorku.lab.enums.ApprovalStatus approvalStatus11 = approvalRequest2.getStatus();
        java.lang.String str12 = approvalRequest2.getRequestId();
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.approve();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(approvalStatus11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        approvalRequest2.setRejectReason("hi!");
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        com.yorku.lab.model.User user7 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest8 = new com.yorku.lab.model.ApprovalRequest("", user7);
        java.lang.String str9 = approvalRequest8.getRejectReason();
        java.lang.String str10 = approvalRequest8.getRequestId();
        com.yorku.lab.model.User user12 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest13 = new com.yorku.lab.model.ApprovalRequest("", user12);
        java.lang.String str14 = approvalRequest13.getRejectReason();
        java.lang.String str15 = approvalRequest13.getRequestId();
        com.yorku.lab.model.User user17 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest18 = new com.yorku.lab.model.ApprovalRequest("", user17);
        java.lang.String str19 = approvalRequest18.getRejectReason();
        com.yorku.lab.model.User user20 = approvalRequest18.getUser();
        com.yorku.lab.model.User user21 = approvalRequest18.getUser();
        java.lang.String str22 = approvalRequest18.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus23 = approvalRequest18.getStatus();
        approvalRequest13.setStatus(approvalStatus23);
        approvalRequest8.setStatus(approvalStatus23);
        approvalRequest2.setStatus(approvalStatus23);
        com.yorku.lab.model.User user28 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest29 = new com.yorku.lab.model.ApprovalRequest("", user28);
        java.lang.String str30 = approvalRequest29.getRejectReason();
        com.yorku.lab.model.User user31 = approvalRequest29.getUser();
        com.yorku.lab.model.User user32 = approvalRequest29.getUser();
        approvalRequest29.setRejectReason("");
        approvalRequest29.setRejectReason("hi!");
        approvalRequest29.setRejectReason("");
        com.yorku.lab.model.User user40 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest41 = new com.yorku.lab.model.ApprovalRequest("", user40);
        java.lang.String str42 = approvalRequest41.getRejectReason();
        java.lang.String str43 = approvalRequest41.getRequestId();
        com.yorku.lab.model.User user45 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest46 = new com.yorku.lab.model.ApprovalRequest("", user45);
        java.lang.String str47 = approvalRequest46.getRejectReason();
        java.lang.String str48 = approvalRequest46.getRequestId();
        com.yorku.lab.model.User user50 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest51 = new com.yorku.lab.model.ApprovalRequest("", user50);
        java.lang.String str52 = approvalRequest51.getRejectReason();
        com.yorku.lab.model.User user53 = approvalRequest51.getUser();
        com.yorku.lab.model.User user54 = approvalRequest51.getUser();
        java.lang.String str55 = approvalRequest51.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus56 = approvalRequest51.getStatus();
        approvalRequest46.setStatus(approvalStatus56);
        approvalRequest41.setStatus(approvalStatus56);
        approvalRequest29.setStatus(approvalStatus56);
        approvalRequest2.setStatus(approvalStatus56);
        java.lang.Class<?> wildcardClass61 = approvalRequest2.getClass();
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertNull(user21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + approvalStatus23 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus23.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(user31);
        org.junit.Assert.assertNull(user32);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(user53);
        org.junit.Assert.assertNull(user54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + approvalStatus56 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus56.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRequestId();
        java.lang.String str5 = approvalRequest2.getRejectReason();
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.reject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        java.lang.String str6 = approvalRequest2.getRequestId();
        com.yorku.lab.model.User user8 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest9 = new com.yorku.lab.model.ApprovalRequest("", user8);
        java.lang.String str10 = approvalRequest9.getRejectReason();
        com.yorku.lab.model.User user11 = approvalRequest9.getUser();
        com.yorku.lab.model.User user12 = approvalRequest9.getUser();
        java.lang.String str13 = approvalRequest9.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus14 = approvalRequest9.getStatus();
        approvalRequest2.setStatus(approvalStatus14);
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.approve();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + approvalStatus14 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus14.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        approvalRequest2.setRejectReason("");
        com.yorku.lab.enums.ApprovalStatus approvalStatus8 = null;
        approvalRequest2.setStatus(approvalStatus8);
        com.yorku.lab.model.User user10 = approvalRequest2.getUser();
        com.yorku.lab.model.User user11 = approvalRequest2.getUser();
        java.lang.String str12 = approvalRequest2.getRejectReason();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRequestId();
        com.yorku.lab.model.User user6 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest7 = new com.yorku.lab.model.ApprovalRequest("", user6);
        java.lang.String str8 = approvalRequest7.getRejectReason();
        com.yorku.lab.model.User user9 = approvalRequest7.getUser();
        com.yorku.lab.model.User user10 = approvalRequest7.getUser();
        java.lang.String str11 = approvalRequest7.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus12 = approvalRequest7.getStatus();
        approvalRequest2.setStatus(approvalStatus12);
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.approve();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + approvalStatus12 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus12.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRequestId();
        java.lang.String str5 = approvalRequest2.getRejectReason();
        approvalRequest2.setRejectReason("");
        com.yorku.lab.model.User user8 = approvalRequest2.getUser();
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.reject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        java.lang.String str6 = approvalRequest2.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus7 = approvalRequest2.getStatus();
        java.lang.String str8 = approvalRequest2.getRequestId();
        java.lang.Class<?> wildcardClass9 = approvalRequest2.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + approvalStatus7 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus7.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRequestId();
        com.yorku.lab.model.User user6 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest7 = new com.yorku.lab.model.ApprovalRequest("", user6);
        java.lang.String str8 = approvalRequest7.getRejectReason();
        java.lang.String str9 = approvalRequest7.getRequestId();
        com.yorku.lab.model.User user11 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest12 = new com.yorku.lab.model.ApprovalRequest("", user11);
        java.lang.String str13 = approvalRequest12.getRejectReason();
        com.yorku.lab.model.User user14 = approvalRequest12.getUser();
        com.yorku.lab.model.User user15 = approvalRequest12.getUser();
        java.lang.String str16 = approvalRequest12.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus17 = approvalRequest12.getStatus();
        approvalRequest7.setStatus(approvalStatus17);
        approvalRequest2.setStatus(approvalStatus17);
        com.yorku.lab.model.User user20 = approvalRequest2.getUser();
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.reject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + approvalStatus17 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus17.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNull(user20);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRequestId();
        com.yorku.lab.model.User user6 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest7 = new com.yorku.lab.model.ApprovalRequest("", user6);
        java.lang.String str8 = approvalRequest7.getRejectReason();
        java.lang.String str9 = approvalRequest7.getRequestId();
        com.yorku.lab.model.User user11 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest12 = new com.yorku.lab.model.ApprovalRequest("", user11);
        java.lang.String str13 = approvalRequest12.getRejectReason();
        com.yorku.lab.model.User user14 = approvalRequest12.getUser();
        com.yorku.lab.model.User user15 = approvalRequest12.getUser();
        java.lang.String str16 = approvalRequest12.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus17 = approvalRequest12.getStatus();
        approvalRequest7.setStatus(approvalStatus17);
        approvalRequest2.setStatus(approvalStatus17);
        com.yorku.lab.model.User user20 = approvalRequest2.getUser();
        java.lang.Class<?> wildcardClass21 = approvalRequest2.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + approvalStatus17 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus17.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        approvalRequest2.setRejectReason("hi!");
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        com.yorku.lab.model.User user7 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest8 = new com.yorku.lab.model.ApprovalRequest("", user7);
        java.lang.String str9 = approvalRequest8.getRejectReason();
        java.lang.String str10 = approvalRequest8.getRequestId();
        com.yorku.lab.model.User user12 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest13 = new com.yorku.lab.model.ApprovalRequest("", user12);
        java.lang.String str14 = approvalRequest13.getRejectReason();
        java.lang.String str15 = approvalRequest13.getRequestId();
        com.yorku.lab.model.User user17 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest18 = new com.yorku.lab.model.ApprovalRequest("", user17);
        java.lang.String str19 = approvalRequest18.getRejectReason();
        com.yorku.lab.model.User user20 = approvalRequest18.getUser();
        com.yorku.lab.model.User user21 = approvalRequest18.getUser();
        java.lang.String str22 = approvalRequest18.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus23 = approvalRequest18.getStatus();
        approvalRequest13.setStatus(approvalStatus23);
        approvalRequest8.setStatus(approvalStatus23);
        approvalRequest2.setStatus(approvalStatus23);
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.approve();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertNull(user21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + approvalStatus23 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus23.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("hi!", user1);
        approvalRequest2.setRejectReason("");
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.approve();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("hi!", user1);
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
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("hi!", user1);
        approvalRequest2.setRejectReason("");
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.reject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        java.lang.String str6 = approvalRequest2.getRequestId();
        com.yorku.lab.model.User user8 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest9 = new com.yorku.lab.model.ApprovalRequest("", user8);
        java.lang.String str10 = approvalRequest9.getRejectReason();
        com.yorku.lab.model.User user11 = approvalRequest9.getUser();
        com.yorku.lab.model.User user12 = approvalRequest9.getUser();
        java.lang.String str13 = approvalRequest9.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus14 = approvalRequest9.getStatus();
        approvalRequest2.setStatus(approvalStatus14);
        java.lang.String str16 = approvalRequest2.getRequestId();
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.approve();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + approvalStatus14 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus14.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        approvalRequest2.setRejectReason("hi!");
        java.lang.String str5 = approvalRequest2.getRequestId();
        java.lang.Class<?> wildcardClass6 = approvalRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        approvalRequest2.setRejectReason("");
        approvalRequest2.setRejectReason("hi!");
        approvalRequest2.setRejectReason("");
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.reject("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRequestId();
        com.yorku.lab.model.User user6 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest7 = new com.yorku.lab.model.ApprovalRequest("", user6);
        java.lang.String str8 = approvalRequest7.getRejectReason();
        java.lang.String str9 = approvalRequest7.getRequestId();
        com.yorku.lab.model.User user11 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest12 = new com.yorku.lab.model.ApprovalRequest("", user11);
        java.lang.String str13 = approvalRequest12.getRejectReason();
        com.yorku.lab.model.User user14 = approvalRequest12.getUser();
        com.yorku.lab.model.User user15 = approvalRequest12.getUser();
        java.lang.String str16 = approvalRequest12.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus17 = approvalRequest12.getStatus();
        approvalRequest7.setStatus(approvalStatus17);
        approvalRequest2.setStatus(approvalStatus17);
        java.lang.Class<?> wildcardClass20 = approvalStatus17.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + approvalStatus17 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus17.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        java.lang.String str6 = approvalRequest2.getRequestId();
        approvalRequest2.setRejectReason("");
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.reject("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        java.lang.String str6 = approvalRequest2.getRequestId();
        com.yorku.lab.model.User user8 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest9 = new com.yorku.lab.model.ApprovalRequest("", user8);
        java.lang.String str10 = approvalRequest9.getRejectReason();
        com.yorku.lab.model.User user11 = approvalRequest9.getUser();
        com.yorku.lab.model.User user12 = approvalRequest9.getUser();
        java.lang.String str13 = approvalRequest9.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus14 = approvalRequest9.getStatus();
        approvalRequest2.setStatus(approvalStatus14);
        java.lang.String str16 = approvalRequest2.getRequestId();
        com.yorku.lab.model.User user17 = approvalRequest2.getUser();
        java.lang.Class<?> wildcardClass18 = approvalRequest2.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + approvalStatus14 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus14.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRequestId();
        approvalRequest2.setRejectReason("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        approvalRequest2.setRejectReason("hi!");
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        com.yorku.lab.model.User user7 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest8 = new com.yorku.lab.model.ApprovalRequest("", user7);
        java.lang.String str9 = approvalRequest8.getRejectReason();
        java.lang.String str10 = approvalRequest8.getRequestId();
        com.yorku.lab.model.User user12 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest13 = new com.yorku.lab.model.ApprovalRequest("", user12);
        java.lang.String str14 = approvalRequest13.getRejectReason();
        java.lang.String str15 = approvalRequest13.getRequestId();
        com.yorku.lab.model.User user17 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest18 = new com.yorku.lab.model.ApprovalRequest("", user17);
        java.lang.String str19 = approvalRequest18.getRejectReason();
        com.yorku.lab.model.User user20 = approvalRequest18.getUser();
        com.yorku.lab.model.User user21 = approvalRequest18.getUser();
        java.lang.String str22 = approvalRequest18.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus23 = approvalRequest18.getStatus();
        approvalRequest13.setStatus(approvalStatus23);
        approvalRequest8.setStatus(approvalStatus23);
        approvalRequest2.setStatus(approvalStatus23);
        java.lang.Class<?> wildcardClass27 = approvalRequest2.getClass();
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertNull(user21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + approvalStatus23 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus23.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        approvalRequest2.setRejectReason("");
        com.yorku.lab.enums.ApprovalStatus approvalStatus8 = null;
        approvalRequest2.setStatus(approvalStatus8);
        com.yorku.lab.model.User user10 = approvalRequest2.getUser();
        com.yorku.lab.enums.ApprovalStatus approvalStatus11 = approvalRequest2.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.reject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(approvalStatus11);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        com.yorku.lab.enums.ApprovalStatus approvalStatus3 = approvalRequest2.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.approve();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + approvalStatus3 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus3.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        approvalRequest2.setRejectReason("");
        com.yorku.lab.enums.ApprovalStatus approvalStatus8 = null;
        approvalRequest2.setStatus(approvalStatus8);
        com.yorku.lab.model.User user10 = approvalRequest2.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = user10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user10);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("hi!", user1);
        java.lang.Class<?> wildcardClass3 = approvalRequest2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        approvalRequest2.setRejectReason("hi!");
        java.lang.String str5 = approvalRequest2.getRequestId();
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.approve();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRequestId();
        com.yorku.lab.model.User user6 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest7 = new com.yorku.lab.model.ApprovalRequest("", user6);
        java.lang.String str8 = approvalRequest7.getRejectReason();
        java.lang.String str9 = approvalRequest7.getRequestId();
        com.yorku.lab.model.User user11 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest12 = new com.yorku.lab.model.ApprovalRequest("", user11);
        java.lang.String str13 = approvalRequest12.getRejectReason();
        com.yorku.lab.model.User user14 = approvalRequest12.getUser();
        com.yorku.lab.model.User user15 = approvalRequest12.getUser();
        java.lang.String str16 = approvalRequest12.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus17 = approvalRequest12.getStatus();
        approvalRequest7.setStatus(approvalStatus17);
        approvalRequest2.setStatus(approvalStatus17);
        com.yorku.lab.model.User user20 = approvalRequest2.getUser();
        com.yorku.lab.enums.ApprovalStatus approvalStatus21 = approvalRequest2.getStatus();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + approvalStatus17 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus17.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertTrue("'" + approvalStatus21 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus21.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        java.lang.String str6 = approvalRequest2.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus7 = approvalRequest2.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.reject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + approvalStatus7 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus7.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("hi!", user1);
        approvalRequest2.setRejectReason("");
        approvalRequest2.setRejectReason("");
        java.lang.Class<?> wildcardClass7 = approvalRequest2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        approvalRequest2.setRejectReason("");
        com.yorku.lab.model.User user9 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest10 = new com.yorku.lab.model.ApprovalRequest("", user9);
        java.lang.String str11 = approvalRequest10.getRejectReason();
        java.lang.String str12 = approvalRequest10.getRequestId();
        com.yorku.lab.model.User user14 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest15 = new com.yorku.lab.model.ApprovalRequest("", user14);
        java.lang.String str16 = approvalRequest15.getRejectReason();
        com.yorku.lab.model.User user17 = approvalRequest15.getUser();
        com.yorku.lab.model.User user18 = approvalRequest15.getUser();
        java.lang.String str19 = approvalRequest15.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus20 = approvalRequest15.getStatus();
        approvalRequest10.setStatus(approvalStatus20);
        approvalRequest2.setStatus(approvalStatus20);
        java.lang.Class<?> wildcardClass23 = approvalStatus20.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + approvalStatus20 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus20.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        java.lang.String str6 = approvalRequest2.getRequestId();
        java.lang.String str7 = approvalRequest2.getRequestId();
        com.yorku.lab.model.User user9 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest10 = new com.yorku.lab.model.ApprovalRequest("", user9);
        java.lang.String str11 = approvalRequest10.getRejectReason();
        java.lang.String str12 = approvalRequest10.getRequestId();
        java.lang.String str13 = approvalRequest10.getRejectReason();
        java.lang.String str14 = approvalRequest10.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus15 = approvalRequest10.getStatus();
        approvalRequest2.setStatus(approvalStatus15);
        approvalRequest2.setRejectReason("");
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.approve();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + approvalStatus15 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus15.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRequestId();
        approvalRequest2.setRejectReason("");
        com.yorku.lab.model.User user7 = approvalRequest2.getUser();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(user7);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("hi!", user1);
        com.yorku.lab.model.User user3 = approvalRequest2.getUser();
        approvalRequest2.setRejectReason("");
        com.yorku.lab.enums.ApprovalStatus approvalStatus6 = null;
        approvalRequest2.setStatus(approvalStatus6);
        org.junit.Assert.assertNull(user3);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRequestId();
        java.lang.String str5 = approvalRequest2.getRejectReason();
        java.lang.String str6 = approvalRequest2.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus7 = approvalRequest2.getStatus();
        approvalRequest2.setRejectReason("");
        com.yorku.lab.enums.ApprovalStatus approvalStatus10 = approvalRequest2.getStatus();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + approvalStatus7 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus7.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertTrue("'" + approvalStatus10 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus10.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        approvalRequest2.setRejectReason("");
        approvalRequest2.setRejectReason("hi!");
        java.lang.String str10 = approvalRequest2.getRequestId();
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.approve();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        approvalRequest2.setRejectReason("");
        com.yorku.lab.enums.ApprovalStatus approvalStatus8 = null;
        approvalRequest2.setStatus(approvalStatus8);
        com.yorku.lab.model.User user10 = approvalRequest2.getUser();
        com.yorku.lab.enums.ApprovalStatus approvalStatus11 = approvalRequest2.getStatus();
        java.lang.String str12 = approvalRequest2.getRequestId();
        com.yorku.lab.model.User user14 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest15 = new com.yorku.lab.model.ApprovalRequest("", user14);
        java.lang.String str16 = approvalRequest15.getRejectReason();
        com.yorku.lab.model.User user17 = approvalRequest15.getUser();
        com.yorku.lab.model.User user18 = approvalRequest15.getUser();
        java.lang.String str19 = approvalRequest15.getRequestId();
        com.yorku.lab.model.User user21 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest22 = new com.yorku.lab.model.ApprovalRequest("", user21);
        java.lang.String str23 = approvalRequest22.getRejectReason();
        com.yorku.lab.model.User user24 = approvalRequest22.getUser();
        com.yorku.lab.model.User user25 = approvalRequest22.getUser();
        java.lang.String str26 = approvalRequest22.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus27 = approvalRequest22.getStatus();
        approvalRequest15.setStatus(approvalStatus27);
        approvalRequest2.setStatus(approvalStatus27);
        java.lang.Class<?> wildcardClass30 = approvalRequest2.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(approvalStatus11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(user24);
        org.junit.Assert.assertNull(user25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + approvalStatus27 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus27.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("hi!", user1);
        com.yorku.lab.enums.ApprovalStatus approvalStatus3 = null;
        approvalRequest2.setStatus(approvalStatus3);
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.reject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user5);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        java.lang.String str6 = approvalRequest2.getRequestId();
        com.yorku.lab.model.User user8 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest9 = new com.yorku.lab.model.ApprovalRequest("", user8);
        java.lang.String str10 = approvalRequest9.getRejectReason();
        com.yorku.lab.model.User user11 = approvalRequest9.getUser();
        com.yorku.lab.model.User user12 = approvalRequest9.getUser();
        java.lang.String str13 = approvalRequest9.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus14 = approvalRequest9.getStatus();
        approvalRequest2.setStatus(approvalStatus14);
        java.lang.String str16 = approvalRequest2.getRequestId();
        com.yorku.lab.model.User user17 = approvalRequest2.getUser();
        com.yorku.lab.enums.ApprovalStatus approvalStatus18 = approvalRequest2.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.reject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + approvalStatus14 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus14.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertTrue("'" + approvalStatus18 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus18.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        approvalRequest2.setRejectReason("");
        com.yorku.lab.enums.ApprovalStatus approvalStatus8 = null;
        approvalRequest2.setStatus(approvalStatus8);
        com.yorku.lab.model.User user10 = approvalRequest2.getUser();
        com.yorku.lab.enums.ApprovalStatus approvalStatus11 = approvalRequest2.getStatus();
        java.lang.String str12 = approvalRequest2.getRequestId();
        java.lang.String str13 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user14 = approvalRequest2.getUser();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(approvalStatus11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(user14);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        java.lang.String str6 = approvalRequest2.getRequestId();
        java.lang.String str7 = approvalRequest2.getRequestId();
        java.lang.Class<?> wildcardClass8 = approvalRequest2.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        approvalRequest2.setRejectReason("");
        com.yorku.lab.enums.ApprovalStatus approvalStatus8 = null;
        approvalRequest2.setStatus(approvalStatus8);
        com.yorku.lab.model.User user10 = approvalRequest2.getUser();
        com.yorku.lab.enums.ApprovalStatus approvalStatus11 = approvalRequest2.getStatus();
        java.lang.String str12 = approvalRequest2.getRequestId();
        com.yorku.lab.model.User user14 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest15 = new com.yorku.lab.model.ApprovalRequest("", user14);
        java.lang.String str16 = approvalRequest15.getRejectReason();
        com.yorku.lab.model.User user17 = approvalRequest15.getUser();
        com.yorku.lab.model.User user18 = approvalRequest15.getUser();
        approvalRequest15.setRejectReason("");
        com.yorku.lab.model.User user22 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest23 = new com.yorku.lab.model.ApprovalRequest("", user22);
        java.lang.String str24 = approvalRequest23.getRejectReason();
        java.lang.String str25 = approvalRequest23.getRequestId();
        com.yorku.lab.model.User user27 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest28 = new com.yorku.lab.model.ApprovalRequest("", user27);
        java.lang.String str29 = approvalRequest28.getRejectReason();
        com.yorku.lab.model.User user30 = approvalRequest28.getUser();
        com.yorku.lab.model.User user31 = approvalRequest28.getUser();
        java.lang.String str32 = approvalRequest28.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus33 = approvalRequest28.getStatus();
        approvalRequest23.setStatus(approvalStatus33);
        approvalRequest15.setStatus(approvalStatus33);
        approvalRequest2.setStatus(approvalStatus33);
        java.lang.String str37 = approvalRequest2.getRejectReason();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(approvalStatus11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(user30);
        org.junit.Assert.assertNull(user31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + approvalStatus33 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus33.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        java.lang.String str6 = approvalRequest2.getRequestId();
        com.yorku.lab.model.User user8 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest9 = new com.yorku.lab.model.ApprovalRequest("", user8);
        java.lang.String str10 = approvalRequest9.getRejectReason();
        com.yorku.lab.model.User user11 = approvalRequest9.getUser();
        com.yorku.lab.model.User user12 = approvalRequest9.getUser();
        java.lang.String str13 = approvalRequest9.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus14 = approvalRequest9.getStatus();
        approvalRequest2.setStatus(approvalStatus14);
        java.lang.String str16 = approvalRequest2.getRequestId();
        com.yorku.lab.model.User user17 = approvalRequest2.getUser();
        com.yorku.lab.enums.ApprovalStatus approvalStatus18 = approvalRequest2.getStatus();
        java.lang.Class<?> wildcardClass19 = approvalStatus18.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + approvalStatus14 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus14.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertTrue("'" + approvalStatus18 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus18.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRejectReason();
        com.yorku.lab.enums.ApprovalStatus approvalStatus5 = approvalRequest2.getStatus();
        approvalRequest2.setRejectReason("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus5.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("hi!", user1);
        com.yorku.lab.enums.ApprovalStatus approvalStatus3 = null;
        approvalRequest2.setStatus(approvalStatus3);
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        approvalRequest2.setRejectReason("");
        com.yorku.lab.model.User user8 = approvalRequest2.getUser();
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("hi!", user1);
        com.yorku.lab.enums.ApprovalStatus approvalStatus3 = null;
        approvalRequest2.setStatus(approvalStatus3);
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.reject("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        approvalRequest2.setRejectReason("");
        approvalRequest2.setRejectReason("hi!");
        approvalRequest2.setRejectReason("");
        com.yorku.lab.model.User user13 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest14 = new com.yorku.lab.model.ApprovalRequest("", user13);
        com.yorku.lab.enums.ApprovalStatus approvalStatus15 = approvalRequest14.getStatus();
        approvalRequest2.setStatus(approvalStatus15);
        java.lang.Class<?> wildcardClass17 = approvalRequest2.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertTrue("'" + approvalStatus15 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus15.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRequestId();
        java.lang.String str4 = approvalRequest2.getRequestId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        approvalRequest2.setRejectReason("");
        com.yorku.lab.enums.ApprovalStatus approvalStatus8 = null;
        approvalRequest2.setStatus(approvalStatus8);
        com.yorku.lab.model.User user10 = approvalRequest2.getUser();
        com.yorku.lab.enums.ApprovalStatus approvalStatus11 = approvalRequest2.getStatus();
        java.lang.String str12 = approvalRequest2.getRequestId();
        com.yorku.lab.model.User user14 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest15 = new com.yorku.lab.model.ApprovalRequest("", user14);
        java.lang.String str16 = approvalRequest15.getRejectReason();
        com.yorku.lab.model.User user17 = approvalRequest15.getUser();
        com.yorku.lab.model.User user18 = approvalRequest15.getUser();
        java.lang.String str19 = approvalRequest15.getRequestId();
        com.yorku.lab.model.User user21 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest22 = new com.yorku.lab.model.ApprovalRequest("", user21);
        java.lang.String str23 = approvalRequest22.getRejectReason();
        com.yorku.lab.model.User user24 = approvalRequest22.getUser();
        com.yorku.lab.model.User user25 = approvalRequest22.getUser();
        java.lang.String str26 = approvalRequest22.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus27 = approvalRequest22.getStatus();
        approvalRequest15.setStatus(approvalStatus27);
        approvalRequest2.setStatus(approvalStatus27);
        com.yorku.lab.enums.ApprovalStatus approvalStatus30 = approvalRequest2.getStatus();
        com.yorku.lab.model.User user31 = approvalRequest2.getUser();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(approvalStatus11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(user24);
        org.junit.Assert.assertNull(user25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + approvalStatus27 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus27.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertTrue("'" + approvalStatus30 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus30.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNull(user31);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        com.yorku.lab.model.User user3 = approvalRequest2.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = user3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("hi!", user1);
        com.yorku.lab.enums.ApprovalStatus approvalStatus3 = null;
        approvalRequest2.setStatus(approvalStatus3);
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        java.lang.String str6 = approvalRequest2.getRequestId();
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.reject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRequestId();
        com.yorku.lab.model.User user5 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest6 = new com.yorku.lab.model.ApprovalRequest("", user5);
        java.lang.String str7 = approvalRequest6.getRejectReason();
        com.yorku.lab.model.User user8 = approvalRequest6.getUser();
        com.yorku.lab.model.User user9 = approvalRequest6.getUser();
        approvalRequest6.setRejectReason("");
        com.yorku.lab.enums.ApprovalStatus approvalStatus12 = null;
        approvalRequest6.setStatus(approvalStatus12);
        com.yorku.lab.model.User user14 = approvalRequest6.getUser();
        com.yorku.lab.enums.ApprovalStatus approvalStatus15 = approvalRequest6.getStatus();
        java.lang.String str16 = approvalRequest6.getRequestId();
        com.yorku.lab.model.User user18 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest19 = new com.yorku.lab.model.ApprovalRequest("", user18);
        java.lang.String str20 = approvalRequest19.getRejectReason();
        com.yorku.lab.model.User user21 = approvalRequest19.getUser();
        com.yorku.lab.model.User user22 = approvalRequest19.getUser();
        approvalRequest19.setRejectReason("");
        com.yorku.lab.model.User user26 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest27 = new com.yorku.lab.model.ApprovalRequest("", user26);
        java.lang.String str28 = approvalRequest27.getRejectReason();
        java.lang.String str29 = approvalRequest27.getRequestId();
        com.yorku.lab.model.User user31 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest32 = new com.yorku.lab.model.ApprovalRequest("", user31);
        java.lang.String str33 = approvalRequest32.getRejectReason();
        com.yorku.lab.model.User user34 = approvalRequest32.getUser();
        com.yorku.lab.model.User user35 = approvalRequest32.getUser();
        java.lang.String str36 = approvalRequest32.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus37 = approvalRequest32.getStatus();
        approvalRequest27.setStatus(approvalStatus37);
        approvalRequest19.setStatus(approvalStatus37);
        approvalRequest6.setStatus(approvalStatus37);
        com.yorku.lab.model.User user42 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest43 = new com.yorku.lab.model.ApprovalRequest("", user42);
        java.lang.String str44 = approvalRequest43.getRejectReason();
        com.yorku.lab.model.User user45 = approvalRequest43.getUser();
        com.yorku.lab.model.User user46 = approvalRequest43.getUser();
        java.lang.String str47 = approvalRequest43.getRequestId();
        com.yorku.lab.model.User user49 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest50 = new com.yorku.lab.model.ApprovalRequest("", user49);
        java.lang.String str51 = approvalRequest50.getRejectReason();
        com.yorku.lab.model.User user52 = approvalRequest50.getUser();
        com.yorku.lab.model.User user53 = approvalRequest50.getUser();
        java.lang.String str54 = approvalRequest50.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus55 = approvalRequest50.getStatus();
        approvalRequest43.setStatus(approvalStatus55);
        approvalRequest6.setStatus(approvalStatus55);
        approvalRequest2.setStatus(approvalStatus55);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(approvalStatus15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(user21);
        org.junit.Assert.assertNull(user22);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(user34);
        org.junit.Assert.assertNull(user35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + approvalStatus37 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus37.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(user45);
        org.junit.Assert.assertNull(user46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(user52);
        org.junit.Assert.assertNull(user53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + approvalStatus55 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus55.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("hi!", user1);
        com.yorku.lab.enums.ApprovalStatus approvalStatus3 = null;
        approvalRequest2.setStatus(approvalStatus3);
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        java.lang.String str6 = approvalRequest2.getRejectReason();
        java.lang.String str7 = approvalRequest2.getRejectReason();
        java.lang.String str8 = approvalRequest2.getRequestId();
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        approvalRequest2.setRejectReason("hi!");
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        java.lang.String str6 = approvalRequest2.getRejectReason();
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.reject("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        approvalRequest2.setRejectReason("");
        com.yorku.lab.enums.ApprovalStatus approvalStatus8 = null;
        approvalRequest2.setStatus(approvalStatus8);
        com.yorku.lab.model.User user10 = approvalRequest2.getUser();
        com.yorku.lab.enums.ApprovalStatus approvalStatus11 = approvalRequest2.getStatus();
        java.lang.String str12 = approvalRequest2.getRequestId();
        java.lang.String str13 = approvalRequest2.getRejectReason();
        java.lang.String str14 = approvalRequest2.getRequestId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(approvalStatus11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        com.yorku.lab.model.User user3 = approvalRequest2.getUser();
        java.lang.String str4 = approvalRequest2.getRequestId();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        java.lang.String str6 = approvalRequest2.getRequestId();
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        approvalRequest2.setRejectReason("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        com.yorku.lab.model.User user3 = approvalRequest2.getUser();
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.approve();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRejectReason();
        com.yorku.lab.enums.ApprovalStatus approvalStatus5 = approvalRequest2.getStatus();
        java.lang.Class<?> wildcardClass6 = approvalRequest2.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus5.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRequestId();
        java.lang.String str5 = approvalRequest2.getRejectReason();
        approvalRequest2.setRejectReason("");
        com.yorku.lab.model.User user9 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest10 = new com.yorku.lab.model.ApprovalRequest("", user9);
        com.yorku.lab.enums.ApprovalStatus approvalStatus11 = approvalRequest10.getStatus();
        approvalRequest2.setStatus(approvalStatus11);
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.reject("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + approvalStatus11 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus11.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("hi!", user1);
        com.yorku.lab.enums.ApprovalStatus approvalStatus3 = null;
        approvalRequest2.setStatus(approvalStatus3);
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        java.lang.String str6 = approvalRequest2.getRejectReason();
        java.lang.String str7 = approvalRequest2.getRejectReason();
        java.lang.String str8 = approvalRequest2.getRejectReason();
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRequestId();
        java.lang.String str5 = approvalRequest2.getRejectReason();
        java.lang.String str6 = approvalRequest2.getRequestId();
        java.lang.String str7 = approvalRequest2.getRejectReason();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("hi!", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.approve();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRequestId();
        com.yorku.lab.model.User user6 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest7 = new com.yorku.lab.model.ApprovalRequest("", user6);
        java.lang.String str8 = approvalRequest7.getRejectReason();
        java.lang.String str9 = approvalRequest7.getRequestId();
        com.yorku.lab.model.User user11 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest12 = new com.yorku.lab.model.ApprovalRequest("", user11);
        java.lang.String str13 = approvalRequest12.getRejectReason();
        com.yorku.lab.model.User user14 = approvalRequest12.getUser();
        com.yorku.lab.model.User user15 = approvalRequest12.getUser();
        java.lang.String str16 = approvalRequest12.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus17 = approvalRequest12.getStatus();
        approvalRequest7.setStatus(approvalStatus17);
        approvalRequest2.setStatus(approvalStatus17);
        com.yorku.lab.model.User user20 = approvalRequest2.getUser();
        approvalRequest2.setRejectReason("hi!");
        java.lang.String str23 = approvalRequest2.getRejectReason();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + approvalStatus17 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus17.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRequestId();
        java.lang.String str5 = approvalRequest2.getRejectReason();
        approvalRequest2.setRejectReason("");
        com.yorku.lab.model.User user9 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest10 = new com.yorku.lab.model.ApprovalRequest("", user9);
        com.yorku.lab.enums.ApprovalStatus approvalStatus11 = approvalRequest10.getStatus();
        approvalRequest2.setStatus(approvalStatus11);
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.approve();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + approvalStatus11 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus11.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRequestId();
        com.yorku.lab.model.User user6 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest7 = new com.yorku.lab.model.ApprovalRequest("", user6);
        java.lang.String str8 = approvalRequest7.getRejectReason();
        java.lang.String str9 = approvalRequest7.getRequestId();
        com.yorku.lab.model.User user11 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest12 = new com.yorku.lab.model.ApprovalRequest("", user11);
        java.lang.String str13 = approvalRequest12.getRejectReason();
        com.yorku.lab.model.User user14 = approvalRequest12.getUser();
        com.yorku.lab.model.User user15 = approvalRequest12.getUser();
        java.lang.String str16 = approvalRequest12.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus17 = approvalRequest12.getStatus();
        approvalRequest7.setStatus(approvalStatus17);
        approvalRequest2.setStatus(approvalStatus17);
        com.yorku.lab.model.User user20 = approvalRequest2.getUser();
        approvalRequest2.setRejectReason("hi!");
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.approve();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + approvalStatus17 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus17.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNull(user20);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRejectReason();
        com.yorku.lab.enums.ApprovalStatus approvalStatus5 = approvalRequest2.getStatus();
        java.lang.String str6 = approvalRequest2.getRequestId();
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.approve();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus5.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        approvalRequest2.setRejectReason("");
        com.yorku.lab.enums.ApprovalStatus approvalStatus8 = null;
        approvalRequest2.setStatus(approvalStatus8);
        com.yorku.lab.model.User user10 = approvalRequest2.getUser();
        com.yorku.lab.enums.ApprovalStatus approvalStatus11 = approvalRequest2.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.approve();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(approvalStatus11);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        com.yorku.lab.enums.ApprovalStatus approvalStatus3 = approvalRequest2.getStatus();
        approvalRequest2.setRejectReason("");
        java.lang.Class<?> wildcardClass6 = approvalRequest2.getClass();
        org.junit.Assert.assertTrue("'" + approvalStatus3 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus3.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRequestId();
        java.lang.String str5 = approvalRequest2.getRejectReason();
        approvalRequest2.setRejectReason("");
        com.yorku.lab.model.User user9 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest10 = new com.yorku.lab.model.ApprovalRequest("", user9);
        com.yorku.lab.enums.ApprovalStatus approvalStatus11 = approvalRequest10.getStatus();
        approvalRequest2.setStatus(approvalStatus11);
        java.lang.Class<?> wildcardClass13 = approvalStatus11.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + approvalStatus11 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus11.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        approvalRequest2.setRejectReason("hi!");
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        java.lang.String str6 = approvalRequest2.getRejectReason();
        com.yorku.lab.enums.ApprovalStatus approvalStatus7 = approvalRequest2.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.reject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus7 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus7.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        java.lang.String str6 = approvalRequest2.getRequestId();
        java.lang.String str7 = approvalRequest2.getRequestId();
        com.yorku.lab.model.User user9 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest10 = new com.yorku.lab.model.ApprovalRequest("", user9);
        java.lang.String str11 = approvalRequest10.getRejectReason();
        java.lang.String str12 = approvalRequest10.getRequestId();
        java.lang.String str13 = approvalRequest10.getRejectReason();
        java.lang.String str14 = approvalRequest10.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus15 = approvalRequest10.getStatus();
        approvalRequest2.setStatus(approvalStatus15);
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.approve();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + approvalStatus15 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus15.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("hi!", user1);
        com.yorku.lab.model.User user4 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest5 = new com.yorku.lab.model.ApprovalRequest("", user4);
        java.lang.String str6 = approvalRequest5.getRejectReason();
        com.yorku.lab.model.User user7 = approvalRequest5.getUser();
        com.yorku.lab.model.User user8 = approvalRequest5.getUser();
        approvalRequest5.setRejectReason("");
        approvalRequest5.setRejectReason("hi!");
        approvalRequest5.setRejectReason("");
        com.yorku.lab.model.User user16 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest17 = new com.yorku.lab.model.ApprovalRequest("", user16);
        com.yorku.lab.enums.ApprovalStatus approvalStatus18 = approvalRequest17.getStatus();
        approvalRequest5.setStatus(approvalStatus18);
        approvalRequest2.setStatus(approvalStatus18);
        java.lang.String str21 = approvalRequest2.getRejectReason();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertTrue("'" + approvalStatus18 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus18.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        java.lang.String str6 = approvalRequest2.getRequestId();
        com.yorku.lab.model.User user8 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest9 = new com.yorku.lab.model.ApprovalRequest("", user8);
        java.lang.String str10 = approvalRequest9.getRejectReason();
        com.yorku.lab.model.User user11 = approvalRequest9.getUser();
        com.yorku.lab.model.User user12 = approvalRequest9.getUser();
        java.lang.String str13 = approvalRequest9.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus14 = approvalRequest9.getStatus();
        approvalRequest2.setStatus(approvalStatus14);
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.reject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + approvalStatus14 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus14.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        approvalRequest2.setRejectReason("");
        approvalRequest2.setRejectReason("hi!");
        approvalRequest2.setRejectReason("");
        com.yorku.lab.model.User user13 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest14 = new com.yorku.lab.model.ApprovalRequest("", user13);
        com.yorku.lab.enums.ApprovalStatus approvalStatus15 = approvalRequest14.getStatus();
        approvalRequest2.setStatus(approvalStatus15);
        java.lang.String str17 = approvalRequest2.getRejectReason();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertTrue("'" + approvalStatus15 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus15.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRejectReason();
        com.yorku.lab.enums.ApprovalStatus approvalStatus5 = approvalRequest2.getStatus();
        java.lang.String str6 = approvalRequest2.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus7 = approvalRequest2.getStatus();
        java.lang.Class<?> wildcardClass8 = approvalStatus7.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus5.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + approvalStatus7 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus7.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        com.yorku.lab.enums.ApprovalStatus approvalStatus3 = approvalRequest2.getStatus();
        approvalRequest2.setRejectReason("");
        com.yorku.lab.model.User user6 = approvalRequest2.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = user6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + approvalStatus3 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus3.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNull(user6);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("hi!", user1);
        approvalRequest2.setRejectReason("");
        approvalRequest2.setRejectReason("");
        java.lang.String str7 = approvalRequest2.getRequestId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRequestId();
        com.yorku.lab.model.User user6 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest7 = new com.yorku.lab.model.ApprovalRequest("", user6);
        java.lang.String str8 = approvalRequest7.getRejectReason();
        com.yorku.lab.model.User user9 = approvalRequest7.getUser();
        com.yorku.lab.model.User user10 = approvalRequest7.getUser();
        java.lang.String str11 = approvalRequest7.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus12 = approvalRequest7.getStatus();
        approvalRequest2.setStatus(approvalStatus12);
        java.lang.String str14 = approvalRequest2.getRejectReason();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + approvalStatus12 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus12.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        java.lang.String str6 = approvalRequest2.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus7 = approvalRequest2.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.approve();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + approvalStatus7 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus7.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        approvalRequest2.setRejectReason("");
        approvalRequest2.setRejectReason("hi!");
        approvalRequest2.setRejectReason("hi!");
        java.lang.Class<?> wildcardClass12 = approvalRequest2.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        com.yorku.lab.model.User user3 = approvalRequest2.getUser();
        java.lang.Class<?> wildcardClass4 = approvalRequest2.getClass();
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRejectReason();
        com.yorku.lab.enums.ApprovalStatus approvalStatus5 = approvalRequest2.getStatus();
        java.lang.String str6 = approvalRequest2.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus7 = approvalRequest2.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.approve();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus5.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + approvalStatus7 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus7.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        approvalRequest2.setRejectReason("");
        com.yorku.lab.enums.ApprovalStatus approvalStatus8 = null;
        approvalRequest2.setStatus(approvalStatus8);
        com.yorku.lab.model.User user10 = approvalRequest2.getUser();
        com.yorku.lab.enums.ApprovalStatus approvalStatus11 = approvalRequest2.getStatus();
        java.lang.String str12 = approvalRequest2.getRequestId();
        com.yorku.lab.model.User user14 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest15 = new com.yorku.lab.model.ApprovalRequest("", user14);
        java.lang.String str16 = approvalRequest15.getRejectReason();
        com.yorku.lab.model.User user17 = approvalRequest15.getUser();
        com.yorku.lab.model.User user18 = approvalRequest15.getUser();
        approvalRequest15.setRejectReason("");
        com.yorku.lab.model.User user22 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest23 = new com.yorku.lab.model.ApprovalRequest("", user22);
        java.lang.String str24 = approvalRequest23.getRejectReason();
        java.lang.String str25 = approvalRequest23.getRequestId();
        com.yorku.lab.model.User user27 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest28 = new com.yorku.lab.model.ApprovalRequest("", user27);
        java.lang.String str29 = approvalRequest28.getRejectReason();
        com.yorku.lab.model.User user30 = approvalRequest28.getUser();
        com.yorku.lab.model.User user31 = approvalRequest28.getUser();
        java.lang.String str32 = approvalRequest28.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus33 = approvalRequest28.getStatus();
        approvalRequest23.setStatus(approvalStatus33);
        approvalRequest15.setStatus(approvalStatus33);
        approvalRequest2.setStatus(approvalStatus33);
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.reject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(approvalStatus11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(user30);
        org.junit.Assert.assertNull(user31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + approvalStatus33 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus33.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRequestId();
        com.yorku.lab.model.User user6 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest7 = new com.yorku.lab.model.ApprovalRequest("", user6);
        java.lang.String str8 = approvalRequest7.getRejectReason();
        java.lang.String str9 = approvalRequest7.getRequestId();
        com.yorku.lab.model.User user11 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest12 = new com.yorku.lab.model.ApprovalRequest("", user11);
        java.lang.String str13 = approvalRequest12.getRejectReason();
        com.yorku.lab.model.User user14 = approvalRequest12.getUser();
        com.yorku.lab.model.User user15 = approvalRequest12.getUser();
        java.lang.String str16 = approvalRequest12.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus17 = approvalRequest12.getStatus();
        approvalRequest7.setStatus(approvalStatus17);
        approvalRequest2.setStatus(approvalStatus17);
        com.yorku.lab.model.User user20 = approvalRequest2.getUser();
        java.lang.String str21 = approvalRequest2.getRequestId();
        com.yorku.lab.model.User user22 = approvalRequest2.getUser();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + approvalStatus17 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus17.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(user22);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("hi!", user1);
        com.yorku.lab.enums.ApprovalStatus approvalStatus3 = null;
        approvalRequest2.setStatus(approvalStatus3);
        approvalRequest2.setRejectReason("");
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.approve();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        java.lang.String str6 = approvalRequest2.getRequestId();
        com.yorku.lab.model.User user8 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest9 = new com.yorku.lab.model.ApprovalRequest("", user8);
        java.lang.String str10 = approvalRequest9.getRejectReason();
        com.yorku.lab.model.User user11 = approvalRequest9.getUser();
        com.yorku.lab.model.User user12 = approvalRequest9.getUser();
        java.lang.String str13 = approvalRequest9.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus14 = approvalRequest9.getStatus();
        approvalRequest2.setStatus(approvalStatus14);
        java.lang.String str16 = approvalRequest2.getRequestId();
        com.yorku.lab.model.User user17 = approvalRequest2.getUser();
        com.yorku.lab.enums.ApprovalStatus approvalStatus18 = null;
        approvalRequest2.setStatus(approvalStatus18);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + approvalStatus14 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus14.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(user17);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("hi!", user1);
        com.yorku.lab.model.User user3 = approvalRequest2.getUser();
        com.yorku.lab.enums.ApprovalStatus approvalStatus4 = null;
        approvalRequest2.setStatus(approvalStatus4);
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.reject("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("hi!", user1);
        com.yorku.lab.model.User user3 = approvalRequest2.getUser();
        approvalRequest2.setRejectReason("");
        java.lang.String str6 = approvalRequest2.getRejectReason();
        java.lang.Class<?> wildcardClass7 = approvalRequest2.getClass();
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        com.yorku.lab.enums.ApprovalStatus approvalStatus6 = approvalRequest2.getStatus();
        java.lang.String str7 = approvalRequest2.getRejectReason();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertTrue("'" + approvalStatus6 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus6.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        com.yorku.lab.enums.ApprovalStatus approvalStatus3 = approvalRequest2.getStatus();
        approvalRequest2.setRejectReason("");
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.approve();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + approvalStatus3 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus3.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRejectReason();
        com.yorku.lab.enums.ApprovalStatus approvalStatus5 = approvalRequest2.getStatus();
        com.yorku.lab.model.User user7 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest8 = new com.yorku.lab.model.ApprovalRequest("", user7);
        com.yorku.lab.enums.ApprovalStatus approvalStatus9 = approvalRequest8.getStatus();
        approvalRequest2.setStatus(approvalStatus9);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus5.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertTrue("'" + approvalStatus9 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus9.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        approvalRequest2.setRejectReason("");
        com.yorku.lab.enums.ApprovalStatus approvalStatus8 = null;
        approvalRequest2.setStatus(approvalStatus8);
        java.lang.String str10 = approvalRequest2.getRequestId();
        com.yorku.lab.model.User user12 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest13 = new com.yorku.lab.model.ApprovalRequest("", user12);
        java.lang.String str14 = approvalRequest13.getRejectReason();
        java.lang.String str15 = approvalRequest13.getRequestId();
        com.yorku.lab.model.User user17 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest18 = new com.yorku.lab.model.ApprovalRequest("", user17);
        java.lang.String str19 = approvalRequest18.getRejectReason();
        java.lang.String str20 = approvalRequest18.getRequestId();
        com.yorku.lab.model.User user22 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest23 = new com.yorku.lab.model.ApprovalRequest("", user22);
        java.lang.String str24 = approvalRequest23.getRejectReason();
        com.yorku.lab.model.User user25 = approvalRequest23.getUser();
        com.yorku.lab.model.User user26 = approvalRequest23.getUser();
        java.lang.String str27 = approvalRequest23.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus28 = approvalRequest23.getStatus();
        approvalRequest18.setStatus(approvalStatus28);
        approvalRequest13.setStatus(approvalStatus28);
        com.yorku.lab.model.User user31 = approvalRequest13.getUser();
        com.yorku.lab.model.User user33 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest34 = new com.yorku.lab.model.ApprovalRequest("", user33);
        java.lang.String str35 = approvalRequest34.getRejectReason();
        com.yorku.lab.model.User user36 = approvalRequest34.getUser();
        com.yorku.lab.model.User user37 = approvalRequest34.getUser();
        approvalRequest34.setRejectReason("");
        approvalRequest34.setRejectReason("hi!");
        com.yorku.lab.enums.ApprovalStatus approvalStatus42 = approvalRequest34.getStatus();
        approvalRequest13.setStatus(approvalStatus42);
        approvalRequest2.setStatus(approvalStatus42);
        com.yorku.lab.model.User user45 = approvalRequest2.getUser();
        com.yorku.lab.enums.ApprovalStatus approvalStatus46 = approvalRequest2.getStatus();
        java.lang.String str47 = approvalRequest2.getRequestId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(user25);
        org.junit.Assert.assertNull(user26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + approvalStatus28 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus28.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNull(user31);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(user36);
        org.junit.Assert.assertNull(user37);
        org.junit.Assert.assertTrue("'" + approvalStatus42 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus42.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNull(user45);
        org.junit.Assert.assertTrue("'" + approvalStatus46 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus46.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        java.lang.String str6 = approvalRequest2.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus7 = approvalRequest2.getStatus();
        com.yorku.lab.model.User user8 = approvalRequest2.getUser();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + approvalStatus7 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus7.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        com.yorku.lab.enums.ApprovalStatus approvalStatus3 = approvalRequest2.getStatus();
        java.lang.Class<?> wildcardClass4 = approvalRequest2.getClass();
        org.junit.Assert.assertTrue("'" + approvalStatus3 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus3.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRequestId();
        java.lang.Class<?> wildcardClass4 = approvalRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        java.lang.String str6 = approvalRequest2.getRequestId();
        java.lang.String str7 = approvalRequest2.getRejectReason();
        com.yorku.lab.enums.ApprovalStatus approvalStatus8 = approvalRequest2.getStatus();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + approvalStatus8 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus8.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRequestId();
        com.yorku.lab.model.User user6 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest7 = new com.yorku.lab.model.ApprovalRequest("", user6);
        java.lang.String str8 = approvalRequest7.getRejectReason();
        java.lang.String str9 = approvalRequest7.getRequestId();
        com.yorku.lab.model.User user11 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest12 = new com.yorku.lab.model.ApprovalRequest("", user11);
        java.lang.String str13 = approvalRequest12.getRejectReason();
        com.yorku.lab.model.User user14 = approvalRequest12.getUser();
        com.yorku.lab.model.User user15 = approvalRequest12.getUser();
        java.lang.String str16 = approvalRequest12.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus17 = approvalRequest12.getStatus();
        approvalRequest7.setStatus(approvalStatus17);
        approvalRequest2.setStatus(approvalStatus17);
        com.yorku.lab.model.User user20 = approvalRequest2.getUser();
        approvalRequest2.setRejectReason("hi!");
        com.yorku.lab.model.User user23 = approvalRequest2.getUser();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + approvalStatus17 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus17.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertNull(user23);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("hi!", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        com.yorku.lab.model.User user3 = approvalRequest2.getUser();
        java.lang.String str4 = approvalRequest2.getRequestId();
        approvalRequest2.setRejectReason("hi!");
        java.lang.String str7 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user8 = approvalRequest2.getUser();
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        approvalRequest2.setRejectReason("hi!");
        com.yorku.lab.model.User user6 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest7 = new com.yorku.lab.model.ApprovalRequest("", user6);
        java.lang.String str8 = approvalRequest7.getRejectReason();
        com.yorku.lab.model.User user9 = approvalRequest7.getUser();
        com.yorku.lab.model.User user10 = approvalRequest7.getUser();
        java.lang.String str11 = approvalRequest7.getRequestId();
        com.yorku.lab.model.User user13 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest14 = new com.yorku.lab.model.ApprovalRequest("", user13);
        java.lang.String str15 = approvalRequest14.getRejectReason();
        com.yorku.lab.model.User user16 = approvalRequest14.getUser();
        com.yorku.lab.model.User user17 = approvalRequest14.getUser();
        java.lang.String str18 = approvalRequest14.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus19 = approvalRequest14.getStatus();
        approvalRequest7.setStatus(approvalStatus19);
        approvalRequest2.setStatus(approvalStatus19);
        java.lang.String str22 = approvalRequest2.getRequestId();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + approvalStatus19 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus19.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        approvalRequest2.setRejectReason("");
        approvalRequest2.setRejectReason("hi!");
        java.lang.String str10 = approvalRequest2.getRequestId();
        java.lang.String str11 = approvalRequest2.getRequestId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        approvalRequest2.setRejectReason("");
        com.yorku.lab.enums.ApprovalStatus approvalStatus8 = null;
        approvalRequest2.setStatus(approvalStatus8);
        java.lang.String str10 = approvalRequest2.getRequestId();
        com.yorku.lab.model.User user12 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest13 = new com.yorku.lab.model.ApprovalRequest("", user12);
        java.lang.String str14 = approvalRequest13.getRejectReason();
        java.lang.String str15 = approvalRequest13.getRequestId();
        com.yorku.lab.model.User user17 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest18 = new com.yorku.lab.model.ApprovalRequest("", user17);
        java.lang.String str19 = approvalRequest18.getRejectReason();
        java.lang.String str20 = approvalRequest18.getRequestId();
        com.yorku.lab.model.User user22 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest23 = new com.yorku.lab.model.ApprovalRequest("", user22);
        java.lang.String str24 = approvalRequest23.getRejectReason();
        com.yorku.lab.model.User user25 = approvalRequest23.getUser();
        com.yorku.lab.model.User user26 = approvalRequest23.getUser();
        java.lang.String str27 = approvalRequest23.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus28 = approvalRequest23.getStatus();
        approvalRequest18.setStatus(approvalStatus28);
        approvalRequest13.setStatus(approvalStatus28);
        com.yorku.lab.model.User user31 = approvalRequest13.getUser();
        com.yorku.lab.model.User user33 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest34 = new com.yorku.lab.model.ApprovalRequest("", user33);
        java.lang.String str35 = approvalRequest34.getRejectReason();
        com.yorku.lab.model.User user36 = approvalRequest34.getUser();
        com.yorku.lab.model.User user37 = approvalRequest34.getUser();
        approvalRequest34.setRejectReason("");
        approvalRequest34.setRejectReason("hi!");
        com.yorku.lab.enums.ApprovalStatus approvalStatus42 = approvalRequest34.getStatus();
        approvalRequest13.setStatus(approvalStatus42);
        approvalRequest2.setStatus(approvalStatus42);
        com.yorku.lab.model.User user45 = approvalRequest2.getUser();
        com.yorku.lab.enums.ApprovalStatus approvalStatus46 = approvalRequest2.getStatus();
        approvalRequest2.setRejectReason("");
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.approve();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(user25);
        org.junit.Assert.assertNull(user26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + approvalStatus28 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus28.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNull(user31);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(user36);
        org.junit.Assert.assertNull(user37);
        org.junit.Assert.assertTrue("'" + approvalStatus42 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus42.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNull(user45);
        org.junit.Assert.assertTrue("'" + approvalStatus46 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus46.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("hi!", user1);
        approvalRequest2.setRejectReason("");
        java.lang.String str5 = approvalRequest2.getRejectReason();
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.approve();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRequestId();
        com.yorku.lab.model.User user6 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest7 = new com.yorku.lab.model.ApprovalRequest("", user6);
        java.lang.String str8 = approvalRequest7.getRejectReason();
        com.yorku.lab.model.User user9 = approvalRequest7.getUser();
        com.yorku.lab.model.User user10 = approvalRequest7.getUser();
        java.lang.String str11 = approvalRequest7.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus12 = approvalRequest7.getStatus();
        approvalRequest2.setStatus(approvalStatus12);
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.reject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + approvalStatus12 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus12.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        java.lang.String str6 = approvalRequest2.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus7 = approvalRequest2.getStatus();
        java.lang.String str8 = approvalRequest2.getRequestId();
        approvalRequest2.setRejectReason("");
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.approve();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + approvalStatus7 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus7.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        approvalRequest2.setRejectReason("");
        com.yorku.lab.enums.ApprovalStatus approvalStatus8 = null;
        approvalRequest2.setStatus(approvalStatus8);
        approvalRequest2.setRejectReason("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        approvalRequest2.setRejectReason("");
        com.yorku.lab.enums.ApprovalStatus approvalStatus8 = null;
        approvalRequest2.setStatus(approvalStatus8);
        com.yorku.lab.model.User user10 = approvalRequest2.getUser();
        com.yorku.lab.enums.ApprovalStatus approvalStatus11 = approvalRequest2.getStatus();
        java.lang.String str12 = approvalRequest2.getRequestId();
        com.yorku.lab.model.User user14 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest15 = new com.yorku.lab.model.ApprovalRequest("", user14);
        java.lang.String str16 = approvalRequest15.getRejectReason();
        com.yorku.lab.model.User user17 = approvalRequest15.getUser();
        com.yorku.lab.model.User user18 = approvalRequest15.getUser();
        java.lang.String str19 = approvalRequest15.getRequestId();
        com.yorku.lab.model.User user21 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest22 = new com.yorku.lab.model.ApprovalRequest("", user21);
        java.lang.String str23 = approvalRequest22.getRejectReason();
        com.yorku.lab.model.User user24 = approvalRequest22.getUser();
        com.yorku.lab.model.User user25 = approvalRequest22.getUser();
        java.lang.String str26 = approvalRequest22.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus27 = approvalRequest22.getStatus();
        approvalRequest15.setStatus(approvalStatus27);
        approvalRequest2.setStatus(approvalStatus27);
        com.yorku.lab.enums.ApprovalStatus approvalStatus30 = approvalRequest2.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.reject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(approvalStatus11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(user24);
        org.junit.Assert.assertNull(user25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + approvalStatus27 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus27.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertTrue("'" + approvalStatus30 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus30.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        approvalRequest2.setRejectReason("hi!");
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        java.lang.String str6 = approvalRequest2.getRejectReason();
        java.lang.Class<?> wildcardClass7 = approvalRequest2.getClass();
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRequestId();
        java.lang.String str5 = approvalRequest2.getRejectReason();
        approvalRequest2.setRejectReason("");
        com.yorku.lab.enums.ApprovalStatus approvalStatus8 = approvalRequest2.getStatus();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + approvalStatus8 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus8.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        com.yorku.lab.enums.ApprovalStatus approvalStatus3 = approvalRequest2.getStatus();
        approvalRequest2.setRejectReason("");
        com.yorku.lab.model.User user6 = approvalRequest2.getUser();
        com.yorku.lab.model.User user7 = approvalRequest2.getUser();
        java.lang.Class<?> wildcardClass8 = approvalRequest2.getClass();
        org.junit.Assert.assertTrue("'" + approvalStatus3 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus3.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        approvalRequest2.setRejectReason("");
        approvalRequest2.setRejectReason("hi!");
        approvalRequest2.setRejectReason("hi!");
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.approve();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        com.yorku.lab.model.User user3 = approvalRequest2.getUser();
        java.lang.String str4 = approvalRequest2.getRequestId();
        approvalRequest2.setRejectReason("hi!");
        com.yorku.lab.model.User user7 = approvalRequest2.getUser();
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(user7);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("hi!", user1);
        com.yorku.lab.model.User user3 = approvalRequest2.getUser();
        approvalRequest2.setRejectReason("");
        java.lang.String str6 = approvalRequest2.getRejectReason();
        com.yorku.lab.enums.ApprovalStatus approvalStatus7 = approvalRequest2.getStatus();
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + approvalStatus7 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus7.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        approvalRequest2.setRejectReason("hi!");
        approvalRequest2.setRejectReason("hi!");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        approvalRequest2.setRejectReason("");
        approvalRequest2.setRejectReason("hi!");
        com.yorku.lab.enums.ApprovalStatus approvalStatus10 = approvalRequest2.getStatus();
        java.lang.String str11 = approvalRequest2.getRejectReason();
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.reject("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertTrue("'" + approvalStatus10 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus10.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("hi!", user1);
        com.yorku.lab.model.User user4 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest5 = new com.yorku.lab.model.ApprovalRequest("", user4);
        java.lang.String str6 = approvalRequest5.getRejectReason();
        com.yorku.lab.model.User user7 = approvalRequest5.getUser();
        com.yorku.lab.model.User user8 = approvalRequest5.getUser();
        approvalRequest5.setRejectReason("");
        approvalRequest5.setRejectReason("hi!");
        approvalRequest5.setRejectReason("");
        com.yorku.lab.model.User user16 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest17 = new com.yorku.lab.model.ApprovalRequest("", user16);
        com.yorku.lab.enums.ApprovalStatus approvalStatus18 = approvalRequest17.getStatus();
        approvalRequest5.setStatus(approvalStatus18);
        approvalRequest2.setStatus(approvalStatus18);
        com.yorku.lab.model.User user22 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest23 = new com.yorku.lab.model.ApprovalRequest("", user22);
        java.lang.String str24 = approvalRequest23.getRejectReason();
        java.lang.String str25 = approvalRequest23.getRejectReason();
        com.yorku.lab.enums.ApprovalStatus approvalStatus26 = approvalRequest23.getStatus();
        java.lang.String str27 = approvalRequest23.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus28 = approvalRequest23.getStatus();
        approvalRequest2.setStatus(approvalStatus28);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertTrue("'" + approvalStatus18 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus18.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + approvalStatus26 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus26.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + approvalStatus28 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus28.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        approvalRequest2.setRejectReason("");
        com.yorku.lab.enums.ApprovalStatus approvalStatus8 = null;
        approvalRequest2.setStatus(approvalStatus8);
        com.yorku.lab.model.User user10 = approvalRequest2.getUser();
        com.yorku.lab.model.User user11 = approvalRequest2.getUser();
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.approve();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(user11);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRejectReason();
        java.lang.String str5 = approvalRequest2.getRejectReason();
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
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRequestId();
        com.yorku.lab.model.User user6 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest7 = new com.yorku.lab.model.ApprovalRequest("", user6);
        java.lang.String str8 = approvalRequest7.getRejectReason();
        java.lang.String str9 = approvalRequest7.getRequestId();
        com.yorku.lab.model.User user11 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest12 = new com.yorku.lab.model.ApprovalRequest("", user11);
        java.lang.String str13 = approvalRequest12.getRejectReason();
        com.yorku.lab.model.User user14 = approvalRequest12.getUser();
        com.yorku.lab.model.User user15 = approvalRequest12.getUser();
        java.lang.String str16 = approvalRequest12.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus17 = approvalRequest12.getStatus();
        approvalRequest7.setStatus(approvalStatus17);
        approvalRequest2.setStatus(approvalStatus17);
        com.yorku.lab.model.User user20 = approvalRequest2.getUser();
        java.lang.String str21 = approvalRequest2.getRequestId();
        java.lang.String str22 = approvalRequest2.getRequestId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + approvalStatus17 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus17.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("hi!", user1);
        com.yorku.lab.enums.ApprovalStatus approvalStatus3 = null;
        approvalRequest2.setStatus(approvalStatus3);
        approvalRequest2.setRejectReason("");
        java.lang.String str7 = approvalRequest2.getRejectReason();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        approvalRequest2.setRejectReason("");
        approvalRequest2.setRejectReason("hi!");
        approvalRequest2.setRejectReason("");
        com.yorku.lab.model.User user13 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest14 = new com.yorku.lab.model.ApprovalRequest("", user13);
        java.lang.String str15 = approvalRequest14.getRejectReason();
        java.lang.String str16 = approvalRequest14.getRequestId();
        com.yorku.lab.model.User user18 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest19 = new com.yorku.lab.model.ApprovalRequest("", user18);
        java.lang.String str20 = approvalRequest19.getRejectReason();
        java.lang.String str21 = approvalRequest19.getRequestId();
        com.yorku.lab.model.User user23 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest24 = new com.yorku.lab.model.ApprovalRequest("", user23);
        java.lang.String str25 = approvalRequest24.getRejectReason();
        com.yorku.lab.model.User user26 = approvalRequest24.getUser();
        com.yorku.lab.model.User user27 = approvalRequest24.getUser();
        java.lang.String str28 = approvalRequest24.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus29 = approvalRequest24.getStatus();
        approvalRequest19.setStatus(approvalStatus29);
        approvalRequest14.setStatus(approvalStatus29);
        approvalRequest2.setStatus(approvalStatus29);
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.approve();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(user26);
        org.junit.Assert.assertNull(user27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + approvalStatus29 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus29.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("hi!", user1);
        com.yorku.lab.model.User user3 = approvalRequest2.getUser();
        java.lang.String str4 = approvalRequest2.getRejectReason();
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        approvalRequest2.setRejectReason("");
        com.yorku.lab.enums.ApprovalStatus approvalStatus8 = null;
        approvalRequest2.setStatus(approvalStatus8);
        java.lang.String str10 = approvalRequest2.getRequestId();
        com.yorku.lab.model.User user12 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest13 = new com.yorku.lab.model.ApprovalRequest("", user12);
        java.lang.String str14 = approvalRequest13.getRejectReason();
        java.lang.String str15 = approvalRequest13.getRequestId();
        com.yorku.lab.model.User user17 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest18 = new com.yorku.lab.model.ApprovalRequest("", user17);
        java.lang.String str19 = approvalRequest18.getRejectReason();
        java.lang.String str20 = approvalRequest18.getRequestId();
        com.yorku.lab.model.User user22 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest23 = new com.yorku.lab.model.ApprovalRequest("", user22);
        java.lang.String str24 = approvalRequest23.getRejectReason();
        com.yorku.lab.model.User user25 = approvalRequest23.getUser();
        com.yorku.lab.model.User user26 = approvalRequest23.getUser();
        java.lang.String str27 = approvalRequest23.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus28 = approvalRequest23.getStatus();
        approvalRequest18.setStatus(approvalStatus28);
        approvalRequest13.setStatus(approvalStatus28);
        com.yorku.lab.model.User user31 = approvalRequest13.getUser();
        com.yorku.lab.model.User user33 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest34 = new com.yorku.lab.model.ApprovalRequest("", user33);
        java.lang.String str35 = approvalRequest34.getRejectReason();
        com.yorku.lab.model.User user36 = approvalRequest34.getUser();
        com.yorku.lab.model.User user37 = approvalRequest34.getUser();
        approvalRequest34.setRejectReason("");
        approvalRequest34.setRejectReason("hi!");
        com.yorku.lab.enums.ApprovalStatus approvalStatus42 = approvalRequest34.getStatus();
        approvalRequest13.setStatus(approvalStatus42);
        approvalRequest2.setStatus(approvalStatus42);
        com.yorku.lab.model.User user45 = approvalRequest2.getUser();
        com.yorku.lab.enums.ApprovalStatus approvalStatus46 = approvalRequest2.getStatus();
        java.lang.String str47 = approvalRequest2.getRejectReason();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(user25);
        org.junit.Assert.assertNull(user26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + approvalStatus28 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus28.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNull(user31);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(user36);
        org.junit.Assert.assertNull(user37);
        org.junit.Assert.assertTrue("'" + approvalStatus42 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus42.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNull(user45);
        org.junit.Assert.assertTrue("'" + approvalStatus46 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus46.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRequestId();
        java.lang.String str5 = approvalRequest2.getRejectReason();
        java.lang.String str6 = approvalRequest2.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus7 = approvalRequest2.getStatus();
        approvalRequest2.setRejectReason("");
        com.yorku.lab.model.User user10 = approvalRequest2.getUser();
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.approve();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + approvalStatus7 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus7.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNull(user10);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        approvalRequest2.setRejectReason("");
        com.yorku.lab.model.User user9 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest10 = new com.yorku.lab.model.ApprovalRequest("", user9);
        java.lang.String str11 = approvalRequest10.getRejectReason();
        java.lang.String str12 = approvalRequest10.getRequestId();
        com.yorku.lab.model.User user14 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest15 = new com.yorku.lab.model.ApprovalRequest("", user14);
        java.lang.String str16 = approvalRequest15.getRejectReason();
        com.yorku.lab.model.User user17 = approvalRequest15.getUser();
        com.yorku.lab.model.User user18 = approvalRequest15.getUser();
        java.lang.String str19 = approvalRequest15.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus20 = approvalRequest15.getStatus();
        approvalRequest10.setStatus(approvalStatus20);
        approvalRequest2.setStatus(approvalStatus20);
        com.yorku.lab.enums.ApprovalStatus approvalStatus23 = approvalRequest2.getStatus();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + approvalStatus20 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus20.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertTrue("'" + approvalStatus23 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus23.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        approvalRequest2.setRejectReason("");
        com.yorku.lab.enums.ApprovalStatus approvalStatus8 = null;
        approvalRequest2.setStatus(approvalStatus8);
        com.yorku.lab.model.User user10 = approvalRequest2.getUser();
        com.yorku.lab.enums.ApprovalStatus approvalStatus11 = approvalRequest2.getStatus();
        java.lang.String str12 = approvalRequest2.getRequestId();
        java.lang.String str13 = approvalRequest2.getRejectReason();
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.approve();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(approvalStatus11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        approvalRequest2.setRejectReason("");
        com.yorku.lab.enums.ApprovalStatus approvalStatus8 = null;
        approvalRequest2.setStatus(approvalStatus8);
        com.yorku.lab.model.User user10 = approvalRequest2.getUser();
        com.yorku.lab.enums.ApprovalStatus approvalStatus11 = approvalRequest2.getStatus();
        java.lang.String str12 = approvalRequest2.getRequestId();
        com.yorku.lab.model.User user14 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest15 = new com.yorku.lab.model.ApprovalRequest("", user14);
        java.lang.String str16 = approvalRequest15.getRejectReason();
        com.yorku.lab.model.User user17 = approvalRequest15.getUser();
        com.yorku.lab.model.User user18 = approvalRequest15.getUser();
        approvalRequest15.setRejectReason("");
        com.yorku.lab.model.User user22 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest23 = new com.yorku.lab.model.ApprovalRequest("", user22);
        java.lang.String str24 = approvalRequest23.getRejectReason();
        java.lang.String str25 = approvalRequest23.getRequestId();
        com.yorku.lab.model.User user27 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest28 = new com.yorku.lab.model.ApprovalRequest("", user27);
        java.lang.String str29 = approvalRequest28.getRejectReason();
        com.yorku.lab.model.User user30 = approvalRequest28.getUser();
        com.yorku.lab.model.User user31 = approvalRequest28.getUser();
        java.lang.String str32 = approvalRequest28.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus33 = approvalRequest28.getStatus();
        approvalRequest23.setStatus(approvalStatus33);
        approvalRequest15.setStatus(approvalStatus33);
        approvalRequest2.setStatus(approvalStatus33);
        com.yorku.lab.model.User user38 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest39 = new com.yorku.lab.model.ApprovalRequest("", user38);
        java.lang.String str40 = approvalRequest39.getRejectReason();
        com.yorku.lab.model.User user41 = approvalRequest39.getUser();
        com.yorku.lab.model.User user42 = approvalRequest39.getUser();
        java.lang.String str43 = approvalRequest39.getRequestId();
        com.yorku.lab.model.User user45 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest46 = new com.yorku.lab.model.ApprovalRequest("", user45);
        java.lang.String str47 = approvalRequest46.getRejectReason();
        com.yorku.lab.model.User user48 = approvalRequest46.getUser();
        com.yorku.lab.model.User user49 = approvalRequest46.getUser();
        java.lang.String str50 = approvalRequest46.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus51 = approvalRequest46.getStatus();
        approvalRequest39.setStatus(approvalStatus51);
        approvalRequest2.setStatus(approvalStatus51);
        approvalRequest2.setRejectReason("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(approvalStatus11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(user30);
        org.junit.Assert.assertNull(user31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + approvalStatus33 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus33.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(user41);
        org.junit.Assert.assertNull(user42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(user48);
        org.junit.Assert.assertNull(user49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + approvalStatus51 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus51.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        java.lang.String str6 = approvalRequest2.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus7 = approvalRequest2.getStatus();
        com.yorku.lab.enums.ApprovalStatus approvalStatus8 = approvalRequest2.getStatus();
        java.lang.String str9 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user11 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest12 = new com.yorku.lab.model.ApprovalRequest("", user11);
        java.lang.String str13 = approvalRequest12.getRejectReason();
        com.yorku.lab.model.User user14 = approvalRequest12.getUser();
        com.yorku.lab.model.User user15 = approvalRequest12.getUser();
        approvalRequest12.setRejectReason("");
        com.yorku.lab.enums.ApprovalStatus approvalStatus18 = null;
        approvalRequest12.setStatus(approvalStatus18);
        com.yorku.lab.model.User user20 = approvalRequest12.getUser();
        com.yorku.lab.model.User user21 = approvalRequest12.getUser();
        com.yorku.lab.model.User user23 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest24 = new com.yorku.lab.model.ApprovalRequest("", user23);
        java.lang.String str25 = approvalRequest24.getRejectReason();
        com.yorku.lab.model.User user26 = approvalRequest24.getUser();
        com.yorku.lab.model.User user27 = approvalRequest24.getUser();
        approvalRequest24.setRejectReason("");
        com.yorku.lab.enums.ApprovalStatus approvalStatus30 = null;
        approvalRequest24.setStatus(approvalStatus30);
        com.yorku.lab.model.User user32 = approvalRequest24.getUser();
        com.yorku.lab.enums.ApprovalStatus approvalStatus33 = approvalRequest24.getStatus();
        java.lang.String str34 = approvalRequest24.getRequestId();
        com.yorku.lab.model.User user36 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest37 = new com.yorku.lab.model.ApprovalRequest("", user36);
        java.lang.String str38 = approvalRequest37.getRejectReason();
        com.yorku.lab.model.User user39 = approvalRequest37.getUser();
        com.yorku.lab.model.User user40 = approvalRequest37.getUser();
        approvalRequest37.setRejectReason("");
        com.yorku.lab.model.User user44 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest45 = new com.yorku.lab.model.ApprovalRequest("", user44);
        java.lang.String str46 = approvalRequest45.getRejectReason();
        java.lang.String str47 = approvalRequest45.getRequestId();
        com.yorku.lab.model.User user49 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest50 = new com.yorku.lab.model.ApprovalRequest("", user49);
        java.lang.String str51 = approvalRequest50.getRejectReason();
        com.yorku.lab.model.User user52 = approvalRequest50.getUser();
        com.yorku.lab.model.User user53 = approvalRequest50.getUser();
        java.lang.String str54 = approvalRequest50.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus55 = approvalRequest50.getStatus();
        approvalRequest45.setStatus(approvalStatus55);
        approvalRequest37.setStatus(approvalStatus55);
        approvalRequest24.setStatus(approvalStatus55);
        com.yorku.lab.model.User user60 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest61 = new com.yorku.lab.model.ApprovalRequest("", user60);
        java.lang.String str62 = approvalRequest61.getRejectReason();
        com.yorku.lab.model.User user63 = approvalRequest61.getUser();
        com.yorku.lab.model.User user64 = approvalRequest61.getUser();
        java.lang.String str65 = approvalRequest61.getRequestId();
        com.yorku.lab.model.User user67 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest68 = new com.yorku.lab.model.ApprovalRequest("", user67);
        java.lang.String str69 = approvalRequest68.getRejectReason();
        com.yorku.lab.model.User user70 = approvalRequest68.getUser();
        com.yorku.lab.model.User user71 = approvalRequest68.getUser();
        java.lang.String str72 = approvalRequest68.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus73 = approvalRequest68.getStatus();
        approvalRequest61.setStatus(approvalStatus73);
        approvalRequest24.setStatus(approvalStatus73);
        approvalRequest12.setStatus(approvalStatus73);
        approvalRequest2.setStatus(approvalStatus73);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + approvalStatus7 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus7.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertTrue("'" + approvalStatus8 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus8.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertNull(user21);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(user26);
        org.junit.Assert.assertNull(user27);
        org.junit.Assert.assertNull(user32);
        org.junit.Assert.assertNull(approvalStatus33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(user39);
        org.junit.Assert.assertNull(user40);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(user52);
        org.junit.Assert.assertNull(user53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + approvalStatus55 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus55.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNull(user63);
        org.junit.Assert.assertNull(user64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNull(user70);
        org.junit.Assert.assertNull(user71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertTrue("'" + approvalStatus73 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus73.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRejectReason();
        com.yorku.lab.enums.ApprovalStatus approvalStatus5 = approvalRequest2.getStatus();
        com.yorku.lab.model.User user7 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest8 = new com.yorku.lab.model.ApprovalRequest("", user7);
        java.lang.String str9 = approvalRequest8.getRejectReason();
        java.lang.String str10 = approvalRequest8.getRejectReason();
        com.yorku.lab.enums.ApprovalStatus approvalStatus11 = approvalRequest8.getStatus();
        approvalRequest2.setStatus(approvalStatus11);
        com.yorku.lab.enums.ApprovalStatus approvalStatus13 = approvalRequest2.getStatus();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus5.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + approvalStatus11 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus11.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertTrue("'" + approvalStatus13 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus13.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("hi!", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRejectReason();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        approvalRequest2.setRejectReason("hi!");
        com.yorku.lab.model.User user6 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest7 = new com.yorku.lab.model.ApprovalRequest("", user6);
        java.lang.String str8 = approvalRequest7.getRejectReason();
        com.yorku.lab.model.User user9 = approvalRequest7.getUser();
        com.yorku.lab.model.User user10 = approvalRequest7.getUser();
        java.lang.String str11 = approvalRequest7.getRequestId();
        com.yorku.lab.model.User user13 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest14 = new com.yorku.lab.model.ApprovalRequest("", user13);
        java.lang.String str15 = approvalRequest14.getRejectReason();
        com.yorku.lab.model.User user16 = approvalRequest14.getUser();
        com.yorku.lab.model.User user17 = approvalRequest14.getUser();
        java.lang.String str18 = approvalRequest14.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus19 = approvalRequest14.getStatus();
        approvalRequest7.setStatus(approvalStatus19);
        approvalRequest2.setStatus(approvalStatus19);
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.reject("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + approvalStatus19 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus19.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        approvalRequest2.setRejectReason("");
        com.yorku.lab.enums.ApprovalStatus approvalStatus8 = null;
        approvalRequest2.setStatus(approvalStatus8);
        com.yorku.lab.model.User user10 = approvalRequest2.getUser();
        com.yorku.lab.enums.ApprovalStatus approvalStatus11 = approvalRequest2.getStatus();
        java.lang.String str12 = approvalRequest2.getRequestId();
        com.yorku.lab.model.User user14 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest15 = new com.yorku.lab.model.ApprovalRequest("", user14);
        java.lang.String str16 = approvalRequest15.getRejectReason();
        com.yorku.lab.model.User user17 = approvalRequest15.getUser();
        com.yorku.lab.model.User user18 = approvalRequest15.getUser();
        java.lang.String str19 = approvalRequest15.getRequestId();
        com.yorku.lab.model.User user21 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest22 = new com.yorku.lab.model.ApprovalRequest("", user21);
        java.lang.String str23 = approvalRequest22.getRejectReason();
        com.yorku.lab.model.User user24 = approvalRequest22.getUser();
        com.yorku.lab.model.User user25 = approvalRequest22.getUser();
        java.lang.String str26 = approvalRequest22.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus27 = approvalRequest22.getStatus();
        approvalRequest15.setStatus(approvalStatus27);
        approvalRequest2.setStatus(approvalStatus27);
        com.yorku.lab.enums.ApprovalStatus approvalStatus30 = approvalRequest2.getStatus();
        java.lang.String str31 = approvalRequest2.getRequestId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(approvalStatus11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(user24);
        org.junit.Assert.assertNull(user25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + approvalStatus27 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus27.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertTrue("'" + approvalStatus30 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus30.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("hi!", user1);
        approvalRequest2.setRejectReason("");
        java.lang.String str5 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user6 = approvalRequest2.getUser();
        java.lang.String str7 = approvalRequest2.getRequestId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("hi!", user1);
        com.yorku.lab.model.User user3 = approvalRequest2.getUser();
        approvalRequest2.setRejectReason("");
        java.lang.String str6 = approvalRequest2.getRejectReason();
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.reject("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        approvalRequest2.setRejectReason("hi!");
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        approvalRequest2.setRejectReason("");
        org.junit.Assert.assertNull(user5);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.enums.ApprovalStatus approvalStatus4 = approvalRequest2.getStatus();
        java.lang.String str5 = approvalRequest2.getRejectReason();
        java.lang.String str6 = approvalRequest2.getRequestId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + approvalStatus4 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus4.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRejectReason();
        java.lang.String str5 = approvalRequest2.getRejectReason();
        java.lang.String str6 = approvalRequest2.getRequestId();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("hi!", user1);
        com.yorku.lab.model.User user3 = approvalRequest2.getUser();
        com.yorku.lab.enums.ApprovalStatus approvalStatus4 = approvalRequest2.getStatus();
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertTrue("'" + approvalStatus4 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus4.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        approvalRequest2.setRejectReason("");
        com.yorku.lab.enums.ApprovalStatus approvalStatus8 = null;
        approvalRequest2.setStatus(approvalStatus8);
        com.yorku.lab.model.User user11 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest12 = new com.yorku.lab.model.ApprovalRequest("", user11);
        approvalRequest12.setRejectReason("hi!");
        com.yorku.lab.model.User user15 = approvalRequest12.getUser();
        java.lang.String str16 = approvalRequest12.getRejectReason();
        com.yorku.lab.model.User user18 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest19 = new com.yorku.lab.model.ApprovalRequest("", user18);
        approvalRequest19.setRejectReason("hi!");
        com.yorku.lab.model.User user22 = approvalRequest19.getUser();
        com.yorku.lab.model.User user24 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest25 = new com.yorku.lab.model.ApprovalRequest("", user24);
        java.lang.String str26 = approvalRequest25.getRejectReason();
        java.lang.String str27 = approvalRequest25.getRequestId();
        com.yorku.lab.model.User user29 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest30 = new com.yorku.lab.model.ApprovalRequest("", user29);
        java.lang.String str31 = approvalRequest30.getRejectReason();
        java.lang.String str32 = approvalRequest30.getRequestId();
        com.yorku.lab.model.User user34 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest35 = new com.yorku.lab.model.ApprovalRequest("", user34);
        java.lang.String str36 = approvalRequest35.getRejectReason();
        com.yorku.lab.model.User user37 = approvalRequest35.getUser();
        com.yorku.lab.model.User user38 = approvalRequest35.getUser();
        java.lang.String str39 = approvalRequest35.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus40 = approvalRequest35.getStatus();
        approvalRequest30.setStatus(approvalStatus40);
        approvalRequest25.setStatus(approvalStatus40);
        approvalRequest19.setStatus(approvalStatus40);
        com.yorku.lab.model.User user45 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest46 = new com.yorku.lab.model.ApprovalRequest("", user45);
        java.lang.String str47 = approvalRequest46.getRejectReason();
        com.yorku.lab.model.User user48 = approvalRequest46.getUser();
        com.yorku.lab.model.User user49 = approvalRequest46.getUser();
        approvalRequest46.setRejectReason("");
        approvalRequest46.setRejectReason("hi!");
        approvalRequest46.setRejectReason("");
        com.yorku.lab.model.User user57 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest58 = new com.yorku.lab.model.ApprovalRequest("", user57);
        java.lang.String str59 = approvalRequest58.getRejectReason();
        java.lang.String str60 = approvalRequest58.getRequestId();
        com.yorku.lab.model.User user62 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest63 = new com.yorku.lab.model.ApprovalRequest("", user62);
        java.lang.String str64 = approvalRequest63.getRejectReason();
        java.lang.String str65 = approvalRequest63.getRequestId();
        com.yorku.lab.model.User user67 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest68 = new com.yorku.lab.model.ApprovalRequest("", user67);
        java.lang.String str69 = approvalRequest68.getRejectReason();
        com.yorku.lab.model.User user70 = approvalRequest68.getUser();
        com.yorku.lab.model.User user71 = approvalRequest68.getUser();
        java.lang.String str72 = approvalRequest68.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus73 = approvalRequest68.getStatus();
        approvalRequest63.setStatus(approvalStatus73);
        approvalRequest58.setStatus(approvalStatus73);
        approvalRequest46.setStatus(approvalStatus73);
        approvalRequest19.setStatus(approvalStatus73);
        com.yorku.lab.enums.ApprovalStatus approvalStatus78 = approvalRequest19.getStatus();
        approvalRequest12.setStatus(approvalStatus78);
        approvalRequest2.setStatus(approvalStatus78);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(user22);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(user37);
        org.junit.Assert.assertNull(user38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + approvalStatus40 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus40.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(user48);
        org.junit.Assert.assertNull(user49);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNull(user70);
        org.junit.Assert.assertNull(user71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertTrue("'" + approvalStatus73 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus73.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertTrue("'" + approvalStatus78 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus78.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        java.lang.String str6 = approvalRequest2.getRequestId();
        com.yorku.lab.model.User user8 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest9 = new com.yorku.lab.model.ApprovalRequest("", user8);
        java.lang.String str10 = approvalRequest9.getRejectReason();
        com.yorku.lab.model.User user11 = approvalRequest9.getUser();
        com.yorku.lab.model.User user12 = approvalRequest9.getUser();
        java.lang.String str13 = approvalRequest9.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus14 = approvalRequest9.getStatus();
        approvalRequest2.setStatus(approvalStatus14);
        java.lang.Class<?> wildcardClass16 = approvalRequest2.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + approvalStatus14 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus14.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        com.yorku.lab.model.User user3 = approvalRequest2.getUser();
        java.lang.String str4 = approvalRequest2.getRequestId();
        approvalRequest2.setRejectReason("hi!");
        com.yorku.lab.enums.ApprovalStatus approvalStatus7 = null;
        approvalRequest2.setStatus(approvalStatus7);
        java.lang.String str9 = approvalRequest2.getRejectReason();
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("hi!", user1);
        approvalRequest2.setRejectReason("");
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        org.junit.Assert.assertNull(user5);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        approvalRequest2.setRejectReason("hi!");
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        com.yorku.lab.model.User user7 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest8 = new com.yorku.lab.model.ApprovalRequest("", user7);
        java.lang.String str9 = approvalRequest8.getRejectReason();
        java.lang.String str10 = approvalRequest8.getRequestId();
        com.yorku.lab.model.User user12 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest13 = new com.yorku.lab.model.ApprovalRequest("", user12);
        java.lang.String str14 = approvalRequest13.getRejectReason();
        java.lang.String str15 = approvalRequest13.getRequestId();
        com.yorku.lab.model.User user17 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest18 = new com.yorku.lab.model.ApprovalRequest("", user17);
        java.lang.String str19 = approvalRequest18.getRejectReason();
        com.yorku.lab.model.User user20 = approvalRequest18.getUser();
        com.yorku.lab.model.User user21 = approvalRequest18.getUser();
        java.lang.String str22 = approvalRequest18.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus23 = approvalRequest18.getStatus();
        approvalRequest13.setStatus(approvalStatus23);
        approvalRequest8.setStatus(approvalStatus23);
        approvalRequest2.setStatus(approvalStatus23);
        com.yorku.lab.model.User user28 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest29 = new com.yorku.lab.model.ApprovalRequest("", user28);
        java.lang.String str30 = approvalRequest29.getRejectReason();
        com.yorku.lab.model.User user31 = approvalRequest29.getUser();
        com.yorku.lab.model.User user32 = approvalRequest29.getUser();
        approvalRequest29.setRejectReason("");
        approvalRequest29.setRejectReason("hi!");
        approvalRequest29.setRejectReason("");
        com.yorku.lab.model.User user40 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest41 = new com.yorku.lab.model.ApprovalRequest("", user40);
        java.lang.String str42 = approvalRequest41.getRejectReason();
        java.lang.String str43 = approvalRequest41.getRequestId();
        com.yorku.lab.model.User user45 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest46 = new com.yorku.lab.model.ApprovalRequest("", user45);
        java.lang.String str47 = approvalRequest46.getRejectReason();
        java.lang.String str48 = approvalRequest46.getRequestId();
        com.yorku.lab.model.User user50 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest51 = new com.yorku.lab.model.ApprovalRequest("", user50);
        java.lang.String str52 = approvalRequest51.getRejectReason();
        com.yorku.lab.model.User user53 = approvalRequest51.getUser();
        com.yorku.lab.model.User user54 = approvalRequest51.getUser();
        java.lang.String str55 = approvalRequest51.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus56 = approvalRequest51.getStatus();
        approvalRequest46.setStatus(approvalStatus56);
        approvalRequest41.setStatus(approvalStatus56);
        approvalRequest29.setStatus(approvalStatus56);
        approvalRequest2.setStatus(approvalStatus56);
        java.lang.String str61 = approvalRequest2.getRequestId();
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertNull(user21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + approvalStatus23 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus23.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(user31);
        org.junit.Assert.assertNull(user32);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(user53);
        org.junit.Assert.assertNull(user54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + approvalStatus56 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus56.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        java.lang.String str6 = approvalRequest2.getRequestId();
        com.yorku.lab.model.User user8 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest9 = new com.yorku.lab.model.ApprovalRequest("", user8);
        java.lang.String str10 = approvalRequest9.getRejectReason();
        com.yorku.lab.model.User user11 = approvalRequest9.getUser();
        com.yorku.lab.model.User user12 = approvalRequest9.getUser();
        java.lang.String str13 = approvalRequest9.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus14 = approvalRequest9.getStatus();
        approvalRequest2.setStatus(approvalStatus14);
        java.lang.String str16 = approvalRequest2.getRequestId();
        com.yorku.lab.model.User user17 = approvalRequest2.getUser();
        com.yorku.lab.enums.ApprovalStatus approvalStatus18 = approvalRequest2.getStatus();
        com.yorku.lab.enums.ApprovalStatus approvalStatus19 = null;
        approvalRequest2.setStatus(approvalStatus19);
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.approve();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + approvalStatus14 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus14.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertTrue("'" + approvalStatus18 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus18.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        java.lang.String str4 = approvalRequest2.getRejectReason();
        com.yorku.lab.enums.ApprovalStatus approvalStatus5 = approvalRequest2.getStatus();
        java.lang.String str6 = approvalRequest2.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus7 = approvalRequest2.getStatus();
        java.lang.String str8 = approvalRequest2.getRequestId();
        java.lang.String str9 = approvalRequest2.getRequestId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus5.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + approvalStatus7 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus7.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        java.lang.String str6 = approvalRequest2.getRequestId();
        com.yorku.lab.model.User user8 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest9 = new com.yorku.lab.model.ApprovalRequest("", user8);
        java.lang.String str10 = approvalRequest9.getRejectReason();
        com.yorku.lab.model.User user11 = approvalRequest9.getUser();
        com.yorku.lab.model.User user12 = approvalRequest9.getUser();
        java.lang.String str13 = approvalRequest9.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus14 = approvalRequest9.getStatus();
        approvalRequest2.setStatus(approvalStatus14);
        java.lang.String str16 = approvalRequest2.getRejectReason();
        approvalRequest2.setRejectReason("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + approvalStatus14 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus14.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        approvalRequest2.setRejectReason("hi!");
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        java.lang.String str6 = approvalRequest2.getRejectReason();
        com.yorku.lab.enums.ApprovalStatus approvalStatus7 = approvalRequest2.getStatus();
        approvalRequest2.setRejectReason("hi!");
        com.yorku.lab.enums.ApprovalStatus approvalStatus10 = approvalRequest2.getStatus();
        approvalRequest2.setRejectReason("hi!");
        java.lang.String str13 = approvalRequest2.getRequestId();
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus7 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus7.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertTrue("'" + approvalStatus10 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus10.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("hi!", user1);
        com.yorku.lab.model.User user3 = approvalRequest2.getUser();
        com.yorku.lab.enums.ApprovalStatus approvalStatus4 = null;
        approvalRequest2.setStatus(approvalStatus4);
        java.lang.String str6 = approvalRequest2.getRequestId();
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        java.lang.String str6 = approvalRequest2.getRequestId();
        approvalRequest2.setRejectReason("");
        java.lang.String str9 = approvalRequest2.getRequestId();
        com.yorku.lab.model.User user11 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest12 = new com.yorku.lab.model.ApprovalRequest("", user11);
        java.lang.String str13 = approvalRequest12.getRejectReason();
        java.lang.String str14 = approvalRequest12.getRejectReason();
        com.yorku.lab.enums.ApprovalStatus approvalStatus15 = approvalRequest12.getStatus();
        approvalRequest2.setStatus(approvalStatus15);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + approvalStatus15 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus15.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        approvalRequest2.setRejectReason("hi!");
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        com.yorku.lab.model.User user7 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest8 = new com.yorku.lab.model.ApprovalRequest("", user7);
        java.lang.String str9 = approvalRequest8.getRejectReason();
        java.lang.String str10 = approvalRequest8.getRequestId();
        com.yorku.lab.model.User user12 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest13 = new com.yorku.lab.model.ApprovalRequest("", user12);
        java.lang.String str14 = approvalRequest13.getRejectReason();
        java.lang.String str15 = approvalRequest13.getRequestId();
        com.yorku.lab.model.User user17 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest18 = new com.yorku.lab.model.ApprovalRequest("", user17);
        java.lang.String str19 = approvalRequest18.getRejectReason();
        com.yorku.lab.model.User user20 = approvalRequest18.getUser();
        com.yorku.lab.model.User user21 = approvalRequest18.getUser();
        java.lang.String str22 = approvalRequest18.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus23 = approvalRequest18.getStatus();
        approvalRequest13.setStatus(approvalStatus23);
        approvalRequest8.setStatus(approvalStatus23);
        approvalRequest2.setStatus(approvalStatus23);
        com.yorku.lab.model.User user28 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest29 = new com.yorku.lab.model.ApprovalRequest("", user28);
        java.lang.String str30 = approvalRequest29.getRejectReason();
        com.yorku.lab.model.User user31 = approvalRequest29.getUser();
        com.yorku.lab.model.User user32 = approvalRequest29.getUser();
        java.lang.String str33 = approvalRequest29.getRequestId();
        com.yorku.lab.model.User user35 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest36 = new com.yorku.lab.model.ApprovalRequest("", user35);
        java.lang.String str37 = approvalRequest36.getRejectReason();
        com.yorku.lab.model.User user38 = approvalRequest36.getUser();
        com.yorku.lab.model.User user39 = approvalRequest36.getUser();
        java.lang.String str40 = approvalRequest36.getRequestId();
        com.yorku.lab.enums.ApprovalStatus approvalStatus41 = approvalRequest36.getStatus();
        approvalRequest29.setStatus(approvalStatus41);
        java.lang.String str43 = approvalRequest29.getRequestId();
        com.yorku.lab.model.User user44 = approvalRequest29.getUser();
        com.yorku.lab.enums.ApprovalStatus approvalStatus45 = approvalRequest29.getStatus();
        approvalRequest2.setStatus(approvalStatus45);
        // The following exception was thrown during execution in test generation
        try {
            approvalRequest2.approve();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.setStatus(com.yorku.lab.enums.AccountStatus)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertNull(user21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + approvalStatus23 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus23.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(user31);
        org.junit.Assert.assertNull(user32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(user38);
        org.junit.Assert.assertNull(user39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + approvalStatus41 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus41.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNull(user44);
        org.junit.Assert.assertTrue("'" + approvalStatus45 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus45.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        com.yorku.lab.model.User user1 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = new com.yorku.lab.model.ApprovalRequest("", user1);
        java.lang.String str3 = approvalRequest2.getRejectReason();
        com.yorku.lab.model.User user4 = approvalRequest2.getUser();
        com.yorku.lab.model.User user5 = approvalRequest2.getUser();
        java.lang.String str6 = approvalRequest2.getRequestId();
        approvalRequest2.setRejectReason("");
        java.lang.String str9 = approvalRequest2.getRequestId();
        com.yorku.lab.model.User user11 = null;
        com.yorku.lab.model.ApprovalRequest approvalRequest12 = new com.yorku.lab.model.ApprovalRequest("", user11);
        java.lang.String str13 = approvalRequest12.getRejectReason();
        com.yorku.lab.model.User user14 = approvalRequest12.getUser();
        com.yorku.lab.model.User user15 = approvalRequest12.getUser();
        approvalRequest12.setRejectReason("");
        approvalRequest12.setRejectReason("hi!");
        com.yorku.lab.enums.ApprovalStatus approvalStatus20 = approvalRequest12.getStatus();
        com.yorku.lab.enums.ApprovalStatus approvalStatus21 = approvalRequest12.getStatus();
        approvalRequest2.setStatus(approvalStatus21);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertTrue("'" + approvalStatus20 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus20.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
        org.junit.Assert.assertTrue("'" + approvalStatus21 + "' != '" + com.yorku.lab.enums.ApprovalStatus.PENDING + "'", approvalStatus21.equals(com.yorku.lab.enums.ApprovalStatus.PENDING));
    }
}

