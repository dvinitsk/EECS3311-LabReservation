package test.Randoop.com.yorku.lab.service;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegistrationServiceRegressionTest0 {

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
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult1 = com.yorku.lab.service.RegistrationService.RegistrationResult.error("");
        java.lang.String str2 = registrationResult1.toString();
        java.lang.Class<?> wildcardClass3 = registrationResult1.getClass();
        org.junit.Assert.assertNotNull(registrationResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RegistrationResult[success=false, message=, user=null]" + "'", str2, "RegistrationResult[success=false, message=, user=null]");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.yorku.lab.model.User user2 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult3 = new com.yorku.lab.service.RegistrationService.RegistrationResult(true, "", user2);
        com.yorku.lab.model.User user4 = registrationResult3.user();
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult1 = com.yorku.lab.service.RegistrationService.RegistrationResult.error("hi!");
        java.lang.Object obj2 = null;
        boolean boolean3 = registrationResult1.equals(obj2);
        java.lang.Class<?> wildcardClass4 = registrationResult1.getClass();
        org.junit.Assert.assertNotNull(registrationResult1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult1 = com.yorku.lab.service.RegistrationService.RegistrationResult.pendingApproval("hi!");
        java.lang.Class<?> wildcardClass2 = registrationResult1.getClass();
        org.junit.Assert.assertNotNull(registrationResult1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.yorku.lab.model.User user0 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult1 = com.yorku.lab.service.RegistrationService.RegistrationResult.success(user0);
        java.lang.Class<?> wildcardClass2 = registrationResult1.getClass();
        org.junit.Assert.assertNotNull(registrationResult1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.yorku.lab.model.User user2 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult3 = new com.yorku.lab.service.RegistrationService.RegistrationResult(true, "", user2);
        boolean boolean4 = registrationResult3.success();
        java.lang.String str5 = registrationResult3.message();
        java.lang.String str6 = registrationResult3.message();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.yorku.lab.model.User user2 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult3 = new com.yorku.lab.service.RegistrationService.RegistrationResult(true, "", user2);
        boolean boolean4 = registrationResult3.success();
        java.lang.Class<?> wildcardClass5 = registrationResult3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        boolean boolean2 = registrationService0.isPasswordStrong("");
        java.util.Optional<com.yorku.lab.model.User> userOptional4 = registrationService0.findById("");
        java.util.Optional<com.yorku.lab.model.User> userOptional6 = registrationService0.findById("hi!");
        java.lang.Class<?> wildcardClass7 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userOptional4);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult1 = com.yorku.lab.service.RegistrationService.RegistrationResult.error("");
        java.lang.String str2 = registrationResult1.toString();
        com.yorku.lab.model.User user5 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult6 = new com.yorku.lab.service.RegistrationService.RegistrationResult(true, "", user5);
        java.lang.String str7 = registrationResult6.message();
        boolean boolean8 = registrationResult1.equals((java.lang.Object) registrationResult6);
        java.lang.String str9 = registrationResult6.message();
        org.junit.Assert.assertNotNull(registrationResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RegistrationResult[success=false, message=, user=null]" + "'", str2, "RegistrationResult[success=false, message=, user=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        registrationService0.rejectAccount("", "");
        java.util.Optional<com.yorku.lab.model.User> userOptional5 = registrationService0.findById("");
        java.lang.Class<?> wildcardClass6 = registrationService0.getClass();
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        registrationService0.rejectAccount("", "");
        java.util.Optional<com.yorku.lab.model.User> userOptional5 = registrationService0.findById("");
        registrationService0.approveAccount("RegistrationResult[success=false, message=hi!, user=null]");
        org.junit.Assert.assertNotNull(userOptional5);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.yorku.lab.model.User user2 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult3 = new com.yorku.lab.service.RegistrationService.RegistrationResult(true, "RegistrationResult[success=true, message=, user=null]", user2);
        java.lang.Class<?> wildcardClass4 = registrationResult3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType4 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult6 = registrationService0.registerUser("hi!", "", "", userType4, "");
        registrationService0.rejectAccount("", "");
        java.util.Optional<com.yorku.lab.model.User> userOptional11 = registrationService0.findByEmail("hi!");
        java.lang.Class<?> wildcardClass12 = registrationService0.getClass();
        org.junit.Assert.assertNotNull(registrationResult6);
        org.junit.Assert.assertNotNull(userOptional11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult1 = com.yorku.lab.service.RegistrationService.RegistrationResult.pendingApproval("hi!");
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult3 = com.yorku.lab.service.RegistrationService.RegistrationResult.error("");
        java.lang.String str4 = registrationResult3.toString();
        com.yorku.lab.model.User user7 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult8 = new com.yorku.lab.service.RegistrationService.RegistrationResult(true, "", user7);
        java.lang.String str9 = registrationResult8.message();
        boolean boolean10 = registrationResult3.equals((java.lang.Object) registrationResult8);
        com.yorku.lab.model.User user11 = registrationResult8.user();
        boolean boolean12 = registrationResult1.equals((java.lang.Object) registrationResult8);
        org.junit.Assert.assertNotNull(registrationResult1);
        org.junit.Assert.assertNotNull(registrationResult3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "RegistrationResult[success=false, message=, user=null]" + "'", str4, "RegistrationResult[success=false, message=, user=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType4 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult6 = registrationService0.registerUser("hi!", "", "", userType4, "");
        registrationService0.rejectAccount("", "");
        java.lang.Class<?> wildcardClass10 = registrationService0.getClass();
        org.junit.Assert.assertNotNull(registrationResult6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType4 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult6 = registrationService0.registerUser("hi!", "", "", userType4, "");
        registrationService0.rejectAccount("", "");
        registrationService0.rejectAccount("RegistrationResult[success=true, message=Account created successfully, user=null]", "hi!");
        com.yorku.lab.enums.UserType userType16 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult18 = registrationService0.registerUser("RegistrationResult[success=false, message=, user=null]", "", "RegistrationResult[success=false, message=, user=null]", userType16, "RegistrationResult[success=false, message=, user=null]");
        java.util.Optional<com.yorku.lab.model.User> userOptional20 = registrationService0.findByEmail("");
        com.yorku.lab.enums.UserType userType24 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult26 = registrationService0.registerUser("RegistrationResult[success=true, message=, user=null]", "", "", userType24, "hi!");
        java.util.Optional<com.yorku.lab.model.User> userOptional28 = registrationService0.findById("RegistrationResult[success=false, message=hi!, user=null]");
        org.junit.Assert.assertNotNull(registrationResult6);
        org.junit.Assert.assertNotNull(registrationResult18);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertNotNull(registrationResult26);
        org.junit.Assert.assertNotNull(userOptional28);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult1 = com.yorku.lab.service.RegistrationService.RegistrationResult.error("RegistrationResult[success=false, message=, user=null]");
        boolean boolean2 = registrationResult1.success();
        org.junit.Assert.assertNotNull(registrationResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType4 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult6 = registrationService0.registerUser("hi!", "", "", userType4, "");
        registrationService0.rejectAccount("", "");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = registrationService0.getPendingApprovals();
        java.lang.Class<?> wildcardClass11 = approvalRequestList10.getClass();
        org.junit.Assert.assertNotNull(registrationResult6);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType4 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult6 = registrationService0.registerUser("hi!", "", "", userType4, "");
        registrationService0.rejectAccount("", "");
        registrationService0.rejectAccount("RegistrationResult[success=true, message=Account created successfully, user=null]", "hi!");
        com.yorku.lab.enums.UserType userType16 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult18 = registrationService0.registerUser("RegistrationResult[success=false, message=, user=null]", "", "RegistrationResult[success=false, message=, user=null]", userType16, "RegistrationResult[success=false, message=, user=null]");
        java.util.Optional<com.yorku.lab.model.User> userOptional20 = registrationService0.findByEmail("");
        com.yorku.lab.enums.UserType userType24 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult26 = registrationService0.registerUser("RegistrationResult[success=true, message=, user=null]", "", "", userType24, "hi!");
        java.lang.Class<?> wildcardClass27 = registrationService0.getClass();
        org.junit.Assert.assertNotNull(registrationResult6);
        org.junit.Assert.assertNotNull(registrationResult18);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertNotNull(registrationResult26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        boolean boolean2 = registrationService0.isPasswordStrong("");
        java.util.Optional<com.yorku.lab.model.User> userOptional4 = registrationService0.findById("");
        java.util.Optional<com.yorku.lab.model.User> userOptional6 = registrationService0.findById("hi!");
        com.yorku.lab.enums.UserType userType10 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult12 = registrationService0.registerUser("RegistrationResult[success=false, message=hi!, user=null]", "RegistrationResult[success=false, message=, user=null]", "RegistrationResult[success=true, message=, user=null]", userType10, "RegistrationResult[success=true, message=Account created successfully, user=null]");
        java.util.Optional<com.yorku.lab.model.User> userOptional14 = registrationService0.findByEmail("");
        java.lang.Class<?> wildcardClass15 = registrationService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userOptional4);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(registrationResult12);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult1 = com.yorku.lab.service.RegistrationService.RegistrationResult.pendingApproval("RegistrationResult[success=false, message=Password must contain uppercase, lowercase, numbers, and symbols, user=null]");
        org.junit.Assert.assertNotNull(registrationResult1);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        boolean boolean2 = registrationService0.isPasswordStrong("RegistrationResult[success=false, message=hi!, user=null]");
        com.yorku.lab.enums.UserType userType6 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult8 = registrationService0.registerUser("", "", "", userType6, "");
        java.util.Optional<com.yorku.lab.model.User> userOptional10 = registrationService0.findById("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(registrationResult8);
        org.junit.Assert.assertNotNull(userOptional10);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult1 = com.yorku.lab.service.RegistrationService.RegistrationResult.pendingApproval("RegistrationResult[success=true, message=Account created successfully, user=null]");
        java.lang.Object obj2 = null;
        boolean boolean3 = registrationResult1.equals(obj2);
        java.lang.String str4 = registrationResult1.message();
        org.junit.Assert.assertNotNull(registrationResult1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "RegistrationResult[success=true, message=Account created successfully, user=null]" + "'", str4, "RegistrationResult[success=true, message=Account created successfully, user=null]");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        boolean boolean2 = registrationService0.isPasswordStrong("");
        java.util.Optional<com.yorku.lab.model.User> userOptional4 = registrationService0.findById("");
        java.lang.Class<?> wildcardClass5 = userOptional4.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userOptional4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult1 = com.yorku.lab.service.RegistrationService.RegistrationResult.error("hi!");
        java.lang.String str2 = registrationResult1.toString();
        com.yorku.lab.model.User user3 = registrationResult1.user();
        org.junit.Assert.assertNotNull(registrationResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RegistrationResult[success=false, message=hi!, user=null]" + "'", str2, "RegistrationResult[success=false, message=hi!, user=null]");
        org.junit.Assert.assertNull(user3);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType4 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult6 = registrationService0.registerUser("hi!", "", "", userType4, "");
        registrationService0.rejectAccount("", "");
        java.util.Optional<com.yorku.lab.model.User> userOptional11 = registrationService0.findById("RegistrationResult[success=true, message=, user=null]");
        boolean boolean13 = registrationService0.isPasswordStrong("");
        org.junit.Assert.assertNotNull(registrationResult6);
        org.junit.Assert.assertNotNull(userOptional11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.yorku.lab.model.User user0 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult1 = com.yorku.lab.service.RegistrationService.RegistrationResult.success(user0);
        java.lang.String str2 = registrationResult1.toString();
        boolean boolean3 = registrationResult1.success();
        java.lang.String str4 = registrationResult1.toString();
        com.yorku.lab.model.User user5 = registrationResult1.user();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = user5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(registrationResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RegistrationResult[success=true, message=Account created successfully, user=null]" + "'", str2, "RegistrationResult[success=true, message=Account created successfully, user=null]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "RegistrationResult[success=true, message=Account created successfully, user=null]" + "'", str4, "RegistrationResult[success=true, message=Account created successfully, user=null]");
        org.junit.Assert.assertNull(user5);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.yorku.lab.model.User user2 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult3 = new com.yorku.lab.service.RegistrationService.RegistrationResult(false, "RegistrationResult[success=false, message=, user=null]", user2);
        java.lang.Object obj4 = null;
        boolean boolean5 = registrationResult3.equals(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.yorku.lab.model.User user2 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult3 = new com.yorku.lab.service.RegistrationService.RegistrationResult(false, "hi!", user2);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        registrationService0.rejectAccount("", "");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = registrationService0.getPendingApprovals();
        org.junit.Assert.assertNotNull(approvalRequestList4);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType4 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult6 = registrationService0.registerUser("RegistrationResult[success=true, message=Account created successfully, user=null]", "RegistrationResult[success=false, message=, user=null]", "", userType4, "RegistrationResult[success=false, message=Password must contain uppercase, lowercase, numbers, and symbols, user=null]");
        com.yorku.lab.service.RegistrationService registrationService7 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType11 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult13 = registrationService7.registerUser("hi!", "", "", userType11, "");
        registrationService7.rejectAccount("", "");
        registrationService7.rejectAccount("RegistrationResult[success=true, message=Account created successfully, user=null]", "hi!");
        com.yorku.lab.enums.UserType userType23 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult25 = registrationService7.registerUser("RegistrationResult[success=true, message=Account created successfully, user=null]", "RegistrationResult[success=false, message=, user=null]", "", userType23, "");
        registrationService7.rejectAccount("", "");
        java.util.Optional<com.yorku.lab.model.User> userOptional30 = registrationService7.findById("");
        boolean boolean31 = registrationResult6.equals((java.lang.Object) registrationService7);
        boolean boolean32 = registrationResult6.success();
        org.junit.Assert.assertNotNull(registrationResult6);
        org.junit.Assert.assertNotNull(registrationResult13);
        org.junit.Assert.assertNotNull(registrationResult25);
        org.junit.Assert.assertNotNull(userOptional30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType4 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult6 = registrationService0.registerUser("RegistrationResult[success=true, message=Account created successfully, user=null]", "RegistrationResult[success=false, message=, user=null]", "", userType4, "RegistrationResult[success=false, message=Password must contain uppercase, lowercase, numbers, and symbols, user=null]");
        com.yorku.lab.service.RegistrationService registrationService7 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType11 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult13 = registrationService7.registerUser("hi!", "", "", userType11, "");
        registrationService7.rejectAccount("", "");
        registrationService7.rejectAccount("RegistrationResult[success=true, message=Account created successfully, user=null]", "hi!");
        com.yorku.lab.enums.UserType userType23 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult25 = registrationService7.registerUser("RegistrationResult[success=true, message=Account created successfully, user=null]", "RegistrationResult[success=false, message=, user=null]", "", userType23, "");
        registrationService7.rejectAccount("", "");
        java.util.Optional<com.yorku.lab.model.User> userOptional30 = registrationService7.findById("");
        boolean boolean31 = registrationResult6.equals((java.lang.Object) registrationService7);
        java.util.Optional<com.yorku.lab.model.User> userOptional33 = registrationService7.findByEmail("RegistrationResult[success=false, message=, user=null]");
        org.junit.Assert.assertNotNull(registrationResult6);
        org.junit.Assert.assertNotNull(registrationResult13);
        org.junit.Assert.assertNotNull(registrationResult25);
        org.junit.Assert.assertNotNull(userOptional30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(userOptional33);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult1 = com.yorku.lab.service.RegistrationService.RegistrationResult.pendingApproval("");
        java.lang.String str2 = registrationResult1.toString();
        org.junit.Assert.assertNotNull(registrationResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RegistrationResult[success=true, message=, user=null]" + "'", str2, "RegistrationResult[success=true, message=, user=null]");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType4 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult6 = registrationService0.registerUser("hi!", "", "", userType4, "");
        registrationService0.rejectAccount("", "");
        registrationService0.rejectAccount("RegistrationResult[success=true, message=Account created successfully, user=null]", "hi!");
        com.yorku.lab.enums.UserType userType16 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult18 = registrationService0.registerUser("RegistrationResult[success=false, message=, user=null]", "", "RegistrationResult[success=false, message=, user=null]", userType16, "RegistrationResult[success=false, message=, user=null]");
        java.util.Optional<com.yorku.lab.model.User> userOptional20 = registrationService0.findByEmail("");
        com.yorku.lab.enums.UserType userType24 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult26 = registrationService0.registerUser("RegistrationResult[success=true, message=, user=null]", "", "", userType24, "hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList27 = registrationService0.getPendingApprovals();
        java.util.Optional<com.yorku.lab.model.User> userOptional29 = registrationService0.findByEmail("");
        org.junit.Assert.assertNotNull(registrationResult6);
        org.junit.Assert.assertNotNull(registrationResult18);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertNotNull(registrationResult26);
        org.junit.Assert.assertNotNull(approvalRequestList27);
        org.junit.Assert.assertNotNull(userOptional29);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType4 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult6 = registrationService0.registerUser("hi!", "", "", userType4, "");
        registrationService0.rejectAccount("", "");
        registrationService0.rejectAccount("RegistrationResult[success=true, message=Account created successfully, user=null]", "hi!");
        com.yorku.lab.enums.UserType userType16 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult18 = registrationService0.registerUser("RegistrationResult[success=false, message=, user=null]", "", "RegistrationResult[success=false, message=, user=null]", userType16, "RegistrationResult[success=false, message=, user=null]");
        java.util.Optional<com.yorku.lab.model.User> userOptional20 = registrationService0.findByEmail("");
        com.yorku.lab.enums.UserType userType24 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult26 = registrationService0.registerUser("RegistrationResult[success=true, message=, user=null]", "", "", userType24, "hi!");
        java.lang.String str27 = registrationResult26.message();
        org.junit.Assert.assertNotNull(registrationResult6);
        org.junit.Assert.assertNotNull(registrationResult18);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertNotNull(registrationResult26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Password must contain uppercase, lowercase, numbers, and symbols" + "'", str27, "Password must contain uppercase, lowercase, numbers, and symbols");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType4 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult6 = registrationService0.registerUser("hi!", "", "", userType4, "");
        registrationService0.rejectAccount("", "");
        registrationService0.rejectAccount("RegistrationResult[success=true, message=Account created successfully, user=null]", "hi!");
        com.yorku.lab.enums.UserType userType16 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult18 = registrationService0.registerUser("RegistrationResult[success=true, message=Account created successfully, user=null]", "RegistrationResult[success=false, message=, user=null]", "", userType16, "");
        java.util.Optional<com.yorku.lab.model.User> userOptional20 = registrationService0.findById("RegistrationResult[success=false, message=hi!, user=null]");
        java.lang.Class<?> wildcardClass21 = userOptional20.getClass();
        org.junit.Assert.assertNotNull(registrationResult6);
        org.junit.Assert.assertNotNull(registrationResult18);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.yorku.lab.model.User user2 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult3 = new com.yorku.lab.service.RegistrationService.RegistrationResult(false, "RegistrationResult[success=true, message=Account created successfully, user=null]", user2);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType4 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult6 = registrationService0.registerUser("hi!", "", "", userType4, "");
        java.lang.String str7 = registrationResult6.message();
        com.yorku.lab.model.User user8 = registrationResult6.user();
        org.junit.Assert.assertNotNull(registrationResult6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password must contain uppercase, lowercase, numbers, and symbols" + "'", str7, "Password must contain uppercase, lowercase, numbers, and symbols");
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType4 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult6 = registrationService0.registerUser("hi!", "", "", userType4, "");
        registrationService0.rejectAccount("", "");
        registrationService0.rejectAccount("RegistrationResult[success=true, message=Account created successfully, user=null]", "hi!");
        boolean boolean14 = registrationService0.isPasswordStrong("RegistrationResult[success=false, message=hi!, user=null]");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList15 = registrationService0.getPendingApprovals();
        org.junit.Assert.assertNotNull(registrationResult6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(approvalRequestList15);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        registrationService0.rejectAccount("", "");
        boolean boolean5 = registrationService0.isPasswordStrong("RegistrationResult[success=false, message=hi!, user=null]");
        java.util.Optional<com.yorku.lab.model.User> userOptional7 = registrationService0.findById("");
        registrationService0.approveAccount("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userOptional7);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType4 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult6 = registrationService0.registerUser("hi!", "", "", userType4, "");
        registrationService0.rejectAccount("", "");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = registrationService0.getPendingApprovals();
        com.yorku.lab.enums.UserType userType14 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult16 = registrationService0.registerUser("", "hi!", "", userType14, "Password must contain uppercase, lowercase, numbers, and symbols");
        java.lang.Class<?> wildcardClass17 = registrationService0.getClass();
        org.junit.Assert.assertNotNull(registrationResult6);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(registrationResult16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult1 = com.yorku.lab.service.RegistrationService.RegistrationResult.error("");
        java.lang.String str2 = registrationResult1.toString();
        com.yorku.lab.model.User user5 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult6 = new com.yorku.lab.service.RegistrationService.RegistrationResult(true, "", user5);
        java.lang.String str7 = registrationResult6.message();
        boolean boolean8 = registrationResult1.equals((java.lang.Object) registrationResult6);
        com.yorku.lab.model.User user9 = registrationResult6.user();
        boolean boolean10 = registrationResult6.success();
        java.lang.String str11 = registrationResult6.message();
        com.yorku.lab.model.User user12 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult13 = com.yorku.lab.service.RegistrationService.RegistrationResult.success(user12);
        com.yorku.lab.service.RegistrationService registrationService14 = new com.yorku.lab.service.RegistrationService();
        boolean boolean16 = registrationService14.isPasswordStrong("");
        java.util.Optional<com.yorku.lab.model.User> userOptional18 = registrationService14.findById("");
        boolean boolean19 = registrationResult13.equals((java.lang.Object) "");
        boolean boolean20 = registrationResult6.equals((java.lang.Object) "");
        org.junit.Assert.assertNotNull(registrationResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RegistrationResult[success=false, message=, user=null]" + "'", str2, "RegistrationResult[success=false, message=, user=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(registrationResult13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(userOptional18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType4 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult6 = registrationService0.registerUser("hi!", "", "", userType4, "");
        registrationService0.rejectAccount("", "");
        java.util.Optional<com.yorku.lab.model.User> userOptional11 = registrationService0.findByEmail("hi!");
        boolean boolean13 = registrationService0.isPasswordStrong("");
        registrationService0.approveAccount("hi!");
        registrationService0.approveAccount("RegistrationResult[success=false, message=, user=null]");
        java.lang.Class<?> wildcardClass18 = registrationService0.getClass();
        org.junit.Assert.assertNotNull(registrationResult6);
        org.junit.Assert.assertNotNull(userOptional11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType4 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult6 = registrationService0.registerUser("hi!", "", "", userType4, "");
        registrationService0.rejectAccount("", "");
        java.util.Optional<com.yorku.lab.model.User> userOptional11 = registrationService0.findByEmail("hi!");
        boolean boolean13 = registrationService0.isPasswordStrong("");
        registrationService0.approveAccount("hi!");
        registrationService0.approveAccount("RegistrationResult[success=false, message=, user=null]");
        registrationService0.approveAccount("hi!");
        registrationService0.rejectAccount("RegistrationResult[success=false, message=hi!, user=null]", "RegistrationResult[success=false, message=, user=null]");
        org.junit.Assert.assertNotNull(registrationResult6);
        org.junit.Assert.assertNotNull(userOptional11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType4 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult6 = registrationService0.registerUser("RegistrationResult[success=true, message=Account created successfully, user=null]", "RegistrationResult[success=false, message=, user=null]", "", userType4, "RegistrationResult[success=false, message=Password must contain uppercase, lowercase, numbers, and symbols, user=null]");
        com.yorku.lab.enums.UserType userType10 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult12 = registrationService0.registerUser("", "Password must contain uppercase, lowercase, numbers, and symbols", "Password must contain uppercase, lowercase, numbers, and symbols", userType10, "");
        org.junit.Assert.assertNotNull(registrationResult6);
        org.junit.Assert.assertNotNull(registrationResult12);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.yorku.lab.model.User user2 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult3 = new com.yorku.lab.service.RegistrationService.RegistrationResult(true, "RegistrationResult[success=false, message=Password must contain uppercase, lowercase, numbers, and symbols, user=null]", user2);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.yorku.lab.model.User user2 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult3 = new com.yorku.lab.service.RegistrationService.RegistrationResult(false, "", user2);
        boolean boolean4 = registrationResult3.success();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        boolean boolean2 = registrationService0.isPasswordStrong("");
        java.util.Optional<com.yorku.lab.model.User> userOptional4 = registrationService0.findById("");
        java.util.Optional<com.yorku.lab.model.User> userOptional6 = registrationService0.findById("hi!");
        com.yorku.lab.enums.UserType userType10 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult12 = registrationService0.registerUser("RegistrationResult[success=false, message=hi!, user=null]", "RegistrationResult[success=false, message=, user=null]", "RegistrationResult[success=true, message=, user=null]", userType10, "RegistrationResult[success=true, message=Account created successfully, user=null]");
        java.util.Optional<com.yorku.lab.model.User> userOptional14 = registrationService0.findByEmail("");
        registrationService0.approveAccount("RegistrationResult[success=false, message=hi!, user=null]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userOptional4);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(registrationResult12);
        org.junit.Assert.assertNotNull(userOptional14);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult1 = com.yorku.lab.service.RegistrationService.RegistrationResult.error("hi!");
        com.yorku.lab.service.RegistrationService registrationService2 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType6 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult8 = registrationService2.registerUser("hi!", "", "", userType6, "");
        registrationService2.rejectAccount("", "");
        java.util.Optional<com.yorku.lab.model.User> userOptional13 = registrationService2.findById("");
        boolean boolean14 = registrationResult1.equals((java.lang.Object) registrationService2);
        com.yorku.lab.model.User user17 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult18 = new com.yorku.lab.service.RegistrationService.RegistrationResult(true, "", user17);
        java.lang.String str19 = registrationResult18.message();
        boolean boolean20 = registrationResult1.equals((java.lang.Object) registrationResult18);
        java.lang.String str21 = registrationResult18.toString();
        java.lang.String str22 = registrationResult18.toString();
        org.junit.Assert.assertNotNull(registrationResult1);
        org.junit.Assert.assertNotNull(registrationResult8);
        org.junit.Assert.assertNotNull(userOptional13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "RegistrationResult[success=true, message=, user=null]" + "'", str21, "RegistrationResult[success=true, message=, user=null]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "RegistrationResult[success=true, message=, user=null]" + "'", str22, "RegistrationResult[success=true, message=, user=null]");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        registrationService0.rejectAccount("", "");
        java.util.Optional<com.yorku.lab.model.User> userOptional5 = registrationService0.findById("");
        boolean boolean7 = registrationService0.isPasswordStrong("");
        registrationService0.approveAccount("");
        com.yorku.lab.enums.UserType userType13 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult15 = registrationService0.registerUser("RegistrationResult[success=false, message=Password must contain uppercase, lowercase, numbers, and symbols, user=null]", "", "RegistrationResult[success=true, message=RegistrationResult[success=false, message=hi!, user=null], user=null]", userType13, "RegistrationResult[success=true, message=RegistrationResult[success=false, message=hi!, user=null], user=null]");
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(registrationResult15);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType4 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult6 = registrationService0.registerUser("hi!", "", "", userType4, "");
        registrationService0.rejectAccount("", "");
        registrationService0.rejectAccount("RegistrationResult[success=true, message=Account created successfully, user=null]", "hi!");
        com.yorku.lab.enums.UserType userType16 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult18 = registrationService0.registerUser("RegistrationResult[success=true, message=Account created successfully, user=null]", "RegistrationResult[success=false, message=, user=null]", "", userType16, "");
        com.yorku.lab.enums.UserType userType22 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult24 = registrationService0.registerUser("hi!", "RegistrationResult[success=false, message=, user=null]", "", userType22, "RegistrationResult[success=true, message=Account created successfully, user=null]");
        java.util.Optional<com.yorku.lab.model.User> userOptional26 = registrationService0.findById("RegistrationResult[success=false, message=hi!, user=null]");
        org.junit.Assert.assertNotNull(registrationResult6);
        org.junit.Assert.assertNotNull(registrationResult18);
        org.junit.Assert.assertNotNull(registrationResult24);
        org.junit.Assert.assertNotNull(userOptional26);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult1 = com.yorku.lab.service.RegistrationService.RegistrationResult.error("hi!");
        java.lang.String str2 = registrationResult1.toString();
        com.yorku.lab.model.User user5 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult6 = new com.yorku.lab.service.RegistrationService.RegistrationResult(false, "RegistrationResult[success=false, message=, user=null]", user5);
        boolean boolean7 = registrationResult1.equals((java.lang.Object) registrationResult6);
        com.yorku.lab.model.User user8 = registrationResult1.user();
        org.junit.Assert.assertNotNull(registrationResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RegistrationResult[success=false, message=hi!, user=null]" + "'", str2, "RegistrationResult[success=false, message=hi!, user=null]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult1 = com.yorku.lab.service.RegistrationService.RegistrationResult.error("hi!");
        java.lang.String str2 = registrationResult1.toString();
        boolean boolean3 = registrationResult1.success();
        boolean boolean4 = registrationResult1.success();
        org.junit.Assert.assertNotNull(registrationResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RegistrationResult[success=false, message=hi!, user=null]" + "'", str2, "RegistrationResult[success=false, message=hi!, user=null]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult1 = com.yorku.lab.service.RegistrationService.RegistrationResult.error("hi!");
        com.yorku.lab.service.RegistrationService registrationService2 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType6 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult8 = registrationService2.registerUser("hi!", "", "", userType6, "");
        registrationService2.rejectAccount("", "");
        java.util.Optional<com.yorku.lab.model.User> userOptional13 = registrationService2.findById("");
        boolean boolean14 = registrationResult1.equals((java.lang.Object) registrationService2);
        com.yorku.lab.model.User user17 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult18 = new com.yorku.lab.service.RegistrationService.RegistrationResult(true, "", user17);
        java.lang.String str19 = registrationResult18.message();
        boolean boolean20 = registrationResult1.equals((java.lang.Object) registrationResult18);
        com.yorku.lab.service.RegistrationService registrationService21 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType25 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult27 = registrationService21.registerUser("hi!", "", "", userType25, "");
        registrationService21.rejectAccount("", "");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList31 = registrationService21.getPendingApprovals();
        com.yorku.lab.enums.UserType userType35 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult37 = registrationService21.registerUser("", "hi!", "", userType35, "Password must contain uppercase, lowercase, numbers, and symbols");
        boolean boolean38 = registrationResult18.equals((java.lang.Object) "Password must contain uppercase, lowercase, numbers, and symbols");
        org.junit.Assert.assertNotNull(registrationResult1);
        org.junit.Assert.assertNotNull(registrationResult8);
        org.junit.Assert.assertNotNull(userOptional13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(registrationResult27);
        org.junit.Assert.assertNotNull(approvalRequestList31);
        org.junit.Assert.assertNotNull(registrationResult37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType4 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult6 = registrationService0.registerUser("hi!", "", "", userType4, "");
        registrationService0.rejectAccount("", "");
        registrationService0.rejectAccount("RegistrationResult[success=true, message=Account created successfully, user=null]", "hi!");
        com.yorku.lab.enums.UserType userType16 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult18 = registrationService0.registerUser("RegistrationResult[success=false, message=, user=null]", "", "RegistrationResult[success=false, message=, user=null]", userType16, "RegistrationResult[success=false, message=, user=null]");
        java.util.Optional<com.yorku.lab.model.User> userOptional20 = registrationService0.findByEmail("");
        com.yorku.lab.enums.UserType userType24 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult26 = registrationService0.registerUser("RegistrationResult[success=true, message=, user=null]", "", "", userType24, "hi!");
        java.util.Optional<com.yorku.lab.model.User> userOptional28 = registrationService0.findById("RegistrationResult[success=false, message=Password must contain uppercase, lowercase, numbers, and symbols, user=null]");
        org.junit.Assert.assertNotNull(registrationResult6);
        org.junit.Assert.assertNotNull(registrationResult18);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertNotNull(registrationResult26);
        org.junit.Assert.assertNotNull(userOptional28);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        boolean boolean2 = registrationService0.isPasswordStrong("RegistrationResult[success=false, message=hi!, user=null]");
        java.util.Optional<com.yorku.lab.model.User> userOptional4 = registrationService0.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional6 = registrationService0.findByEmail("");
        boolean boolean8 = registrationService0.isPasswordStrong("");
        registrationService0.rejectAccount("RegistrationResult[success=true, message=, user=null]", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userOptional4);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType4 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult6 = registrationService0.registerUser("hi!", "", "", userType4, "");
        registrationService0.rejectAccount("", "");
        registrationService0.rejectAccount("RegistrationResult[success=true, message=Account created successfully, user=null]", "hi!");
        com.yorku.lab.enums.UserType userType16 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult18 = registrationService0.registerUser("RegistrationResult[success=false, message=, user=null]", "", "RegistrationResult[success=false, message=, user=null]", userType16, "RegistrationResult[success=false, message=, user=null]");
        java.util.Optional<com.yorku.lab.model.User> userOptional20 = registrationService0.findByEmail("");
        com.yorku.lab.enums.UserType userType24 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult26 = registrationService0.registerUser("RegistrationResult[success=true, message=, user=null]", "", "", userType24, "hi!");
        registrationService0.approveAccount("");
        boolean boolean30 = registrationService0.isPasswordStrong("RegistrationResult[success=true, message=Account created successfully, user=null]");
        org.junit.Assert.assertNotNull(registrationResult6);
        org.junit.Assert.assertNotNull(registrationResult18);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertNotNull(registrationResult26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult1 = com.yorku.lab.service.RegistrationService.RegistrationResult.error("hi!");
        com.yorku.lab.service.RegistrationService registrationService2 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType6 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult8 = registrationService2.registerUser("hi!", "", "", userType6, "");
        registrationService2.rejectAccount("", "");
        java.util.Optional<com.yorku.lab.model.User> userOptional13 = registrationService2.findById("");
        boolean boolean14 = registrationResult1.equals((java.lang.Object) registrationService2);
        com.yorku.lab.model.User user17 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult18 = new com.yorku.lab.service.RegistrationService.RegistrationResult(true, "", user17);
        java.lang.String str19 = registrationResult18.message();
        boolean boolean20 = registrationResult1.equals((java.lang.Object) registrationResult18);
        boolean boolean21 = registrationResult1.success();
        com.yorku.lab.model.User user22 = registrationResult1.user();
        org.junit.Assert.assertNotNull(registrationResult1);
        org.junit.Assert.assertNotNull(registrationResult8);
        org.junit.Assert.assertNotNull(userOptional13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(user22);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult1 = com.yorku.lab.service.RegistrationService.RegistrationResult.pendingApproval("Password must contain uppercase, lowercase, numbers, and symbols");
        org.junit.Assert.assertNotNull(registrationResult1);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType4 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult6 = registrationService0.registerUser("hi!", "", "", userType4, "");
        registrationService0.rejectAccount("", "");
        registrationService0.rejectAccount("RegistrationResult[success=false, message=, user=null]", "RegistrationResult[success=true, message=, user=null]");
        java.util.Optional<com.yorku.lab.model.User> userOptional14 = registrationService0.findById("");
        org.junit.Assert.assertNotNull(registrationResult6);
        org.junit.Assert.assertNotNull(userOptional14);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        boolean boolean2 = registrationService0.isPasswordStrong("RegistrationResult[success=false, message=hi!, user=null]");
        java.util.Optional<com.yorku.lab.model.User> userOptional4 = registrationService0.findByEmail("");
        registrationService0.approveAccount("");
        com.yorku.lab.enums.UserType userType10 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult12 = registrationService0.registerUser("", "RegistrationResult[success=false, message=Password must contain uppercase, lowercase, numbers, and symbols, user=null]", "RegistrationResult[success=false, message=hi!, user=null]", userType10, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userOptional4);
        org.junit.Assert.assertNotNull(registrationResult12);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        boolean boolean2 = registrationService0.isPasswordStrong("RegistrationResult[success=false, message=hi!, user=null]");
        java.util.Optional<com.yorku.lab.model.User> userOptional4 = registrationService0.findByEmail("");
        java.lang.Class<?> wildcardClass5 = userOptional4.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userOptional4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult1 = com.yorku.lab.service.RegistrationService.RegistrationResult.error("");
        java.lang.String str2 = registrationResult1.toString();
        com.yorku.lab.model.User user5 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult6 = new com.yorku.lab.service.RegistrationService.RegistrationResult(true, "", user5);
        java.lang.String str7 = registrationResult6.message();
        boolean boolean8 = registrationResult1.equals((java.lang.Object) registrationResult6);
        com.yorku.lab.service.RegistrationService registrationService9 = new com.yorku.lab.service.RegistrationService();
        boolean boolean11 = registrationService9.isPasswordStrong("");
        java.util.Optional<com.yorku.lab.model.User> userOptional13 = registrationService9.findById("");
        java.util.Optional<com.yorku.lab.model.User> userOptional15 = registrationService9.findById("hi!");
        com.yorku.lab.enums.UserType userType19 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult21 = registrationService9.registerUser("RegistrationResult[success=false, message=hi!, user=null]", "RegistrationResult[success=false, message=, user=null]", "RegistrationResult[success=true, message=, user=null]", userType19, "RegistrationResult[success=true, message=Account created successfully, user=null]");
        boolean boolean22 = registrationResult1.equals((java.lang.Object) userType19);
        com.yorku.lab.model.User user23 = registrationResult1.user();
        org.junit.Assert.assertNotNull(registrationResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RegistrationResult[success=false, message=, user=null]" + "'", str2, "RegistrationResult[success=false, message=, user=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(userOptional13);
        org.junit.Assert.assertNotNull(userOptional15);
        org.junit.Assert.assertNotNull(registrationResult21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(user23);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType4 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult6 = registrationService0.registerUser("hi!", "", "", userType4, "");
        registrationService0.rejectAccount("", "");
        registrationService0.rejectAccount("RegistrationResult[success=true, message=Account created successfully, user=null]", "hi!");
        com.yorku.lab.enums.UserType userType16 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult18 = registrationService0.registerUser("RegistrationResult[success=true, message=Account created successfully, user=null]", "RegistrationResult[success=false, message=, user=null]", "", userType16, "");
        java.util.Optional<com.yorku.lab.model.User> userOptional20 = registrationService0.findById("RegistrationResult[success=false, message=hi!, user=null]");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList21 = registrationService0.getPendingApprovals();
        org.junit.Assert.assertNotNull(registrationResult6);
        org.junit.Assert.assertNotNull(registrationResult18);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertNotNull(approvalRequestList21);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        boolean boolean2 = registrationService0.isPasswordStrong("RegistrationResult[success=false, message=hi!, user=null]");
        java.util.Optional<com.yorku.lab.model.User> userOptional4 = registrationService0.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional6 = registrationService0.findById("");
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = registrationService0.findById("RegistrationResult[success=true, message=Account created successfully, user=null]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userOptional4);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(userOptional8);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult1 = com.yorku.lab.service.RegistrationService.RegistrationResult.pendingApproval("");
        com.yorku.lab.model.User user2 = registrationResult1.user();
        org.junit.Assert.assertNotNull(registrationResult1);
        org.junit.Assert.assertNull(user2);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        boolean boolean2 = registrationService0.isPasswordStrong("RegistrationResult[success=false, message=hi!, user=null]");
        java.util.Optional<com.yorku.lab.model.User> userOptional4 = registrationService0.findByEmail("");
        registrationService0.approveAccount("");
        registrationService0.approveAccount("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userOptional4);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        boolean boolean2 = registrationService0.isPasswordStrong("");
        java.util.Optional<com.yorku.lab.model.User> userOptional4 = registrationService0.findById("");
        java.util.Optional<com.yorku.lab.model.User> userOptional6 = registrationService0.findById("hi!");
        com.yorku.lab.enums.UserType userType10 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult12 = registrationService0.registerUser("RegistrationResult[success=false, message=hi!, user=null]", "RegistrationResult[success=false, message=, user=null]", "RegistrationResult[success=true, message=, user=null]", userType10, "RegistrationResult[success=true, message=Account created successfully, user=null]");
        java.util.Optional<com.yorku.lab.model.User> userOptional14 = registrationService0.findByEmail("");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList15 = registrationService0.getPendingApprovals();
        registrationService0.approveAccount("");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList18 = registrationService0.getPendingApprovals();
        registrationService0.rejectAccount("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userOptional4);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(registrationResult12);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(approvalRequestList15);
        org.junit.Assert.assertNotNull(approvalRequestList18);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        registrationService0.rejectAccount("", "");
        boolean boolean5 = registrationService0.isPasswordStrong("RegistrationResult[success=false, message=hi!, user=null]");
        boolean boolean7 = registrationService0.isPasswordStrong("");
        java.util.Optional<com.yorku.lab.model.User> userOptional9 = registrationService0.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional11 = registrationService0.findById("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertNotNull(userOptional11);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.yorku.lab.model.User user2 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult3 = new com.yorku.lab.service.RegistrationService.RegistrationResult(false, "RegistrationResult[success=true, message=, user=null]", user2);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.yorku.lab.model.User user2 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult3 = new com.yorku.lab.service.RegistrationService.RegistrationResult(true, "RegistrationResult[success=false, message=hi!, user=null]", user2);
        boolean boolean4 = registrationResult3.success();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult1 = com.yorku.lab.service.RegistrationService.RegistrationResult.error("hi!");
        com.yorku.lab.service.RegistrationService registrationService2 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType6 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult8 = registrationService2.registerUser("hi!", "", "", userType6, "");
        registrationService2.rejectAccount("", "");
        java.util.Optional<com.yorku.lab.model.User> userOptional13 = registrationService2.findById("");
        boolean boolean14 = registrationResult1.equals((java.lang.Object) registrationService2);
        com.yorku.lab.model.User user17 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult18 = new com.yorku.lab.service.RegistrationService.RegistrationResult(true, "", user17);
        java.lang.String str19 = registrationResult18.message();
        boolean boolean20 = registrationResult1.equals((java.lang.Object) registrationResult18);
        java.lang.String str21 = registrationResult18.toString();
        com.yorku.lab.model.User user22 = registrationResult18.user();
        org.junit.Assert.assertNotNull(registrationResult1);
        org.junit.Assert.assertNotNull(registrationResult8);
        org.junit.Assert.assertNotNull(userOptional13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "RegistrationResult[success=true, message=, user=null]" + "'", str21, "RegistrationResult[success=true, message=, user=null]");
        org.junit.Assert.assertNull(user22);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.yorku.lab.model.User user2 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult3 = new com.yorku.lab.service.RegistrationService.RegistrationResult(true, "hi!", user2);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType4 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult6 = registrationService0.registerUser("hi!", "", "", userType4, "");
        registrationService0.rejectAccount("", "");
        registrationService0.rejectAccount("RegistrationResult[success=true, message=Account created successfully, user=null]", "hi!");
        boolean boolean14 = registrationService0.isPasswordStrong("RegistrationResult[success=false, message=hi!, user=null]");
        registrationService0.approveAccount("RegistrationResult[success=false, message=, user=null]");
        org.junit.Assert.assertNotNull(registrationResult6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        boolean boolean2 = registrationService0.isPasswordStrong("RegistrationResult[success=false, message=hi!, user=null]");
        registrationService0.approveAccount("RegistrationResult[success=false, message=hi!, user=null]");
        java.util.Optional<com.yorku.lab.model.User> userOptional6 = registrationService0.findById("RegistrationResult[success=false, message=hi!, user=null]");
        com.yorku.lab.enums.UserType userType10 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult12 = registrationService0.registerUser("RegistrationResult[success=false, message=hi!, user=null]", "RegistrationResult[success=false, message=Password must contain uppercase, lowercase, numbers, and symbols, user=null]", "", userType10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(registrationResult12);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        boolean boolean2 = registrationService0.isPasswordStrong("");
        java.util.Optional<com.yorku.lab.model.User> userOptional4 = registrationService0.findById("");
        java.util.Optional<com.yorku.lab.model.User> userOptional6 = registrationService0.findById("hi!");
        com.yorku.lab.enums.UserType userType10 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult12 = registrationService0.registerUser("RegistrationResult[success=false, message=hi!, user=null]", "RegistrationResult[success=false, message=, user=null]", "RegistrationResult[success=true, message=, user=null]", userType10, "RegistrationResult[success=true, message=Account created successfully, user=null]");
        com.yorku.lab.service.RegistrationService registrationService13 = new com.yorku.lab.service.RegistrationService();
        boolean boolean15 = registrationService13.isPasswordStrong("");
        java.util.Optional<com.yorku.lab.model.User> userOptional17 = registrationService13.findById("");
        java.util.Optional<com.yorku.lab.model.User> userOptional19 = registrationService13.findById("hi!");
        com.yorku.lab.enums.UserType userType23 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult25 = registrationService13.registerUser("RegistrationResult[success=false, message=hi!, user=null]", "RegistrationResult[success=false, message=, user=null]", "RegistrationResult[success=true, message=, user=null]", userType23, "RegistrationResult[success=true, message=Account created successfully, user=null]");
        java.util.Optional<com.yorku.lab.model.User> userOptional27 = registrationService13.findByEmail("");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList28 = registrationService13.getPendingApprovals();
        com.yorku.lab.enums.UserType userType32 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult34 = registrationService13.registerUser("hi!", "", "RegistrationResult[success=false, message=Password must contain uppercase, lowercase, numbers, and symbols, user=null]", userType32, "");
        java.lang.String str35 = registrationResult34.toString();
        boolean boolean36 = registrationResult12.equals((java.lang.Object) registrationResult34);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userOptional4);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(registrationResult12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(userOptional17);
        org.junit.Assert.assertNotNull(userOptional19);
        org.junit.Assert.assertNotNull(registrationResult25);
        org.junit.Assert.assertNotNull(userOptional27);
        org.junit.Assert.assertNotNull(approvalRequestList28);
        org.junit.Assert.assertNotNull(registrationResult34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "RegistrationResult[success=false, message=Password must contain uppercase, lowercase, numbers, and symbols, user=null]" + "'", str35, "RegistrationResult[success=false, message=Password must contain uppercase, lowercase, numbers, and symbols, user=null]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult1 = com.yorku.lab.service.RegistrationService.RegistrationResult.error("");
        java.lang.String str2 = registrationResult1.toString();
        com.yorku.lab.model.User user5 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult6 = new com.yorku.lab.service.RegistrationService.RegistrationResult(true, "", user5);
        java.lang.String str7 = registrationResult6.message();
        boolean boolean8 = registrationResult1.equals((java.lang.Object) registrationResult6);
        java.lang.String str9 = registrationResult6.toString();
        java.lang.Class<?> wildcardClass10 = registrationResult6.getClass();
        org.junit.Assert.assertNotNull(registrationResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RegistrationResult[success=false, message=, user=null]" + "'", str2, "RegistrationResult[success=false, message=, user=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "RegistrationResult[success=true, message=, user=null]" + "'", str9, "RegistrationResult[success=true, message=, user=null]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType4 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult6 = registrationService0.registerUser("hi!", "", "", userType4, "");
        registrationService0.rejectAccount("", "");
        registrationService0.rejectAccount("RegistrationResult[success=true, message=Account created successfully, user=null]", "hi!");
        com.yorku.lab.enums.UserType userType16 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult18 = registrationService0.registerUser("RegistrationResult[success=false, message=, user=null]", "", "RegistrationResult[success=false, message=, user=null]", userType16, "RegistrationResult[success=false, message=, user=null]");
        java.util.Optional<com.yorku.lab.model.User> userOptional20 = registrationService0.findByEmail("");
        boolean boolean22 = registrationService0.isPasswordStrong("");
        org.junit.Assert.assertNotNull(registrationResult6);
        org.junit.Assert.assertNotNull(registrationResult18);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.yorku.lab.model.User user2 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult3 = new com.yorku.lab.service.RegistrationService.RegistrationResult(true, "RegistrationResult[success=true, message=RegistrationResult[success=false, message=hi!, user=null], user=null]", user2);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType4 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult6 = registrationService0.registerUser("hi!", "", "", userType4, "");
        registrationService0.rejectAccount("", "");
        registrationService0.rejectAccount("RegistrationResult[success=true, message=Account created successfully, user=null]", "hi!");
        com.yorku.lab.enums.UserType userType16 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult18 = registrationService0.registerUser("RegistrationResult[success=true, message=Account created successfully, user=null]", "RegistrationResult[success=false, message=, user=null]", "", userType16, "");
        java.lang.String str19 = registrationResult18.message();
        com.yorku.lab.model.User user20 = registrationResult18.user();
        java.lang.String str21 = registrationResult18.message();
        org.junit.Assert.assertNotNull(registrationResult6);
        org.junit.Assert.assertNotNull(registrationResult18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Password must contain uppercase, lowercase, numbers, and symbols" + "'", str19, "Password must contain uppercase, lowercase, numbers, and symbols");
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Password must contain uppercase, lowercase, numbers, and symbols" + "'", str21, "Password must contain uppercase, lowercase, numbers, and symbols");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        boolean boolean2 = registrationService0.isPasswordStrong("RegistrationResult[success=false, message=hi!, user=null]");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList3 = registrationService0.getPendingApprovals();
        boolean boolean5 = registrationService0.isPasswordStrong("RegistrationResult[success=false, message=, user=null]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(approvalRequestList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.yorku.lab.model.User user2 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult3 = new com.yorku.lab.service.RegistrationService.RegistrationResult(true, "", user2);
        java.lang.String str4 = registrationResult3.message();
        java.lang.String str5 = registrationResult3.message();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        registrationService0.rejectAccount("", "");
        registrationService0.rejectAccount("RegistrationResult[success=true, message=, user=null]", "");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType4 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult6 = registrationService0.registerUser("hi!", "", "", userType4, "");
        registrationService0.rejectAccount("", "");
        registrationService0.rejectAccount("RegistrationResult[success=true, message=Account created successfully, user=null]", "hi!");
        com.yorku.lab.enums.UserType userType16 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult18 = registrationService0.registerUser("RegistrationResult[success=false, message=, user=null]", "", "RegistrationResult[success=false, message=, user=null]", userType16, "RegistrationResult[success=false, message=, user=null]");
        java.util.Optional<com.yorku.lab.model.User> userOptional20 = registrationService0.findByEmail("");
        com.yorku.lab.enums.UserType userType24 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult26 = registrationService0.registerUser("RegistrationResult[success=true, message=, user=null]", "", "", userType24, "hi!");
        registrationService0.approveAccount("");
        com.yorku.lab.enums.UserType userType32 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult34 = registrationService0.registerUser("", "RegistrationResult[success=true, message=RegistrationResult[success=false, message=hi!, user=null], user=null]", "RegistrationResult[success=true, message=Account created successfully, user=null]", userType32, "hi!");
        org.junit.Assert.assertNotNull(registrationResult6);
        org.junit.Assert.assertNotNull(registrationResult18);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertNotNull(registrationResult26);
        org.junit.Assert.assertNotNull(registrationResult34);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult1 = com.yorku.lab.service.RegistrationService.RegistrationResult.pendingApproval("hi!");
        com.yorku.lab.model.User user2 = registrationResult1.user();
        org.junit.Assert.assertNotNull(registrationResult1);
        org.junit.Assert.assertNull(user2);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        boolean boolean2 = registrationService0.isPasswordStrong("RegistrationResult[success=false, message=hi!, user=null]");
        registrationService0.approveAccount("RegistrationResult[success=false, message=hi!, user=null]");
        com.yorku.lab.enums.UserType userType8 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult10 = registrationService0.registerUser("", "RegistrationResult[success=false, message=Password must contain uppercase, lowercase, numbers, and symbols, user=null]", "RegistrationResult[success=false, message=Password must contain uppercase, lowercase, numbers, and symbols, user=null]", userType8, "RegistrationResult[success=false, message=, user=null]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(registrationResult10);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.yorku.lab.model.User user2 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult3 = new com.yorku.lab.service.RegistrationService.RegistrationResult(true, "RegistrationResult[success=false, message=, user=null]", user2);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult1 = com.yorku.lab.service.RegistrationService.RegistrationResult.error("RegistrationResult[success=true, message=, user=null]");
        org.junit.Assert.assertNotNull(registrationResult1);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult1 = com.yorku.lab.service.RegistrationService.RegistrationResult.pendingApproval("RegistrationResult[success=true, message=, user=null]");
        boolean boolean2 = registrationResult1.success();
        org.junit.Assert.assertNotNull(registrationResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        boolean boolean2 = registrationService0.isPasswordStrong("");
        java.util.Optional<com.yorku.lab.model.User> userOptional4 = registrationService0.findById("");
        java.util.Optional<com.yorku.lab.model.User> userOptional6 = registrationService0.findById("hi!");
        com.yorku.lab.enums.UserType userType10 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult12 = registrationService0.registerUser("RegistrationResult[success=false, message=hi!, user=null]", "RegistrationResult[success=false, message=, user=null]", "RegistrationResult[success=true, message=, user=null]", userType10, "RegistrationResult[success=true, message=Account created successfully, user=null]");
        boolean boolean14 = registrationService0.isPasswordStrong("RegistrationResult[success=false, message=hi!, user=null]");
        boolean boolean16 = registrationService0.isPasswordStrong("RegistrationResult[success=false, message=hi!, user=null]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userOptional4);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(registrationResult12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult1 = com.yorku.lab.service.RegistrationService.RegistrationResult.pendingApproval("RegistrationResult[success=true, message=Account created successfully, user=null]");
        java.lang.Object obj2 = null;
        boolean boolean3 = registrationResult1.equals(obj2);
        java.lang.String str4 = registrationResult1.toString();
        org.junit.Assert.assertNotNull(registrationResult1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "RegistrationResult[success=true, message=RegistrationResult[success=true, message=Account created successfully, user=null], user=null]" + "'", str4, "RegistrationResult[success=true, message=RegistrationResult[success=true, message=Account created successfully, user=null], user=null]");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        registrationService0.rejectAccount("", "");
        java.util.Optional<com.yorku.lab.model.User> userOptional5 = registrationService0.findById("");
        java.lang.Class<?> wildcardClass6 = userOptional5.getClass();
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        boolean boolean2 = registrationService0.isPasswordStrong("");
        java.util.Optional<com.yorku.lab.model.User> userOptional4 = registrationService0.findById("");
        java.util.Optional<com.yorku.lab.model.User> userOptional6 = registrationService0.findById("hi!");
        com.yorku.lab.enums.UserType userType10 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult12 = registrationService0.registerUser("RegistrationResult[success=false, message=hi!, user=null]", "RegistrationResult[success=false, message=, user=null]", "RegistrationResult[success=true, message=, user=null]", userType10, "RegistrationResult[success=true, message=Account created successfully, user=null]");
        java.util.Optional<com.yorku.lab.model.User> userOptional14 = registrationService0.findByEmail("");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList15 = registrationService0.getPendingApprovals();
        registrationService0.approveAccount("");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList18 = registrationService0.getPendingApprovals();
        com.yorku.lab.enums.UserType userType22 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult24 = registrationService0.registerUser("RegistrationResult[success=true, message=Account created successfully, user=null]", "RegistrationResult[success=true, message=Account created successfully, user=null]", "", userType22, "RegistrationResult[success=false, message=hi!, user=null]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userOptional4);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(registrationResult12);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(approvalRequestList15);
        org.junit.Assert.assertNotNull(approvalRequestList18);
        org.junit.Assert.assertNotNull(registrationResult24);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType4 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult6 = registrationService0.registerUser("hi!", "", "", userType4, "");
        registrationService0.rejectAccount("", "");
        registrationService0.rejectAccount("RegistrationResult[success=true, message=Account created successfully, user=null]", "hi!");
        com.yorku.lab.enums.UserType userType16 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult18 = registrationService0.registerUser("RegistrationResult[success=false, message=, user=null]", "", "RegistrationResult[success=false, message=, user=null]", userType16, "RegistrationResult[success=false, message=, user=null]");
        boolean boolean20 = registrationService0.isPasswordStrong("Password must contain uppercase, lowercase, numbers, and symbols");
        com.yorku.lab.enums.UserType userType24 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult26 = registrationService0.registerUser("Password must contain uppercase, lowercase, numbers, and symbols", "RegistrationResult[success=true, message=RegistrationResult[success=false, message=hi!, user=null], user=null]", "Password must contain uppercase, lowercase, numbers, and symbols", userType24, "");
        org.junit.Assert.assertNotNull(registrationResult6);
        org.junit.Assert.assertNotNull(registrationResult18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(registrationResult26);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        boolean boolean2 = registrationService0.isPasswordStrong("RegistrationResult[success=false, message=hi!, user=null]");
        registrationService0.approveAccount("RegistrationResult[success=false, message=hi!, user=null]");
        java.util.Optional<com.yorku.lab.model.User> userOptional6 = registrationService0.findById("RegistrationResult[success=false, message=hi!, user=null]");
        registrationService0.rejectAccount("RegistrationResult[success=false, message=, user=null]", "RegistrationResult[success=true, message=RegistrationResult[success=true, message=Account created successfully, user=null], user=null]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userOptional6);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType4 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult6 = registrationService0.registerUser("hi!", "", "", userType4, "");
        registrationService0.rejectAccount("", "");
        registrationService0.rejectAccount("RegistrationResult[success=true, message=Account created successfully, user=null]", "hi!");
        com.yorku.lab.enums.UserType userType16 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult18 = registrationService0.registerUser("RegistrationResult[success=true, message=Account created successfully, user=null]", "RegistrationResult[success=false, message=, user=null]", "", userType16, "");
        java.util.Optional<com.yorku.lab.model.User> userOptional20 = registrationService0.findById("RegistrationResult[success=false, message=hi!, user=null]");
        registrationService0.approveAccount("RegistrationResult[success=false, message=Password must contain uppercase, lowercase, numbers, and symbols, user=null]");
        java.util.Optional<com.yorku.lab.model.User> userOptional24 = registrationService0.findByEmail("RegistrationResult[success=true, message=, user=null]");
        java.util.Optional<com.yorku.lab.model.User> userOptional26 = registrationService0.findByEmail("");
        org.junit.Assert.assertNotNull(registrationResult6);
        org.junit.Assert.assertNotNull(registrationResult18);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertNotNull(userOptional24);
        org.junit.Assert.assertNotNull(userOptional26);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType4 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult6 = registrationService0.registerUser("RegistrationResult[success=true, message=Account created successfully, user=null]", "RegistrationResult[success=false, message=, user=null]", "", userType4, "RegistrationResult[success=false, message=Password must contain uppercase, lowercase, numbers, and symbols, user=null]");
        com.yorku.lab.service.RegistrationService registrationService7 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType11 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult13 = registrationService7.registerUser("hi!", "", "", userType11, "");
        registrationService7.rejectAccount("", "");
        registrationService7.rejectAccount("RegistrationResult[success=true, message=Account created successfully, user=null]", "hi!");
        com.yorku.lab.enums.UserType userType23 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult25 = registrationService7.registerUser("RegistrationResult[success=true, message=Account created successfully, user=null]", "RegistrationResult[success=false, message=, user=null]", "", userType23, "");
        registrationService7.rejectAccount("", "");
        java.util.Optional<com.yorku.lab.model.User> userOptional30 = registrationService7.findById("");
        boolean boolean31 = registrationResult6.equals((java.lang.Object) registrationService7);
        registrationService7.approveAccount("Password must contain uppercase, lowercase, numbers, and symbols");
        com.yorku.lab.enums.UserType userType37 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult39 = registrationService7.registerUser("", "", "", userType37, "");
        boolean boolean41 = registrationService7.isPasswordStrong("");
        org.junit.Assert.assertNotNull(registrationResult6);
        org.junit.Assert.assertNotNull(registrationResult13);
        org.junit.Assert.assertNotNull(registrationResult25);
        org.junit.Assert.assertNotNull(userOptional30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(registrationResult39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult1 = com.yorku.lab.service.RegistrationService.RegistrationResult.error("RegistrationResult[success=true, message=RegistrationResult[success=true, message=Account created successfully, user=null], user=null]");
        org.junit.Assert.assertNotNull(registrationResult1);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult1 = com.yorku.lab.service.RegistrationService.RegistrationResult.error("RegistrationResult[success=false, message=, user=null]");
        java.lang.String str2 = registrationResult1.message();
        java.lang.String str3 = registrationResult1.message();
        org.junit.Assert.assertNotNull(registrationResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RegistrationResult[success=false, message=, user=null]" + "'", str2, "RegistrationResult[success=false, message=, user=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "RegistrationResult[success=false, message=, user=null]" + "'", str3, "RegistrationResult[success=false, message=, user=null]");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType4 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult6 = registrationService0.registerUser("hi!", "", "", userType4, "");
        registrationService0.rejectAccount("", "");
        registrationService0.rejectAccount("RegistrationResult[success=true, message=Account created successfully, user=null]", "hi!");
        com.yorku.lab.enums.UserType userType16 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult18 = registrationService0.registerUser("RegistrationResult[success=true, message=Account created successfully, user=null]", "RegistrationResult[success=false, message=, user=null]", "", userType16, "");
        com.yorku.lab.model.User user19 = registrationResult18.user();
        java.lang.String str20 = registrationResult18.message();
        boolean boolean21 = registrationResult18.success();
        org.junit.Assert.assertNotNull(registrationResult6);
        org.junit.Assert.assertNotNull(registrationResult18);
        org.junit.Assert.assertNull(user19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Password must contain uppercase, lowercase, numbers, and symbols" + "'", str20, "Password must contain uppercase, lowercase, numbers, and symbols");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        boolean boolean2 = registrationService0.isPasswordStrong("RegistrationResult[success=false, message=hi!, user=null]");
        com.yorku.lab.enums.UserType userType6 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult8 = registrationService0.registerUser("", "", "", userType6, "");
        boolean boolean10 = registrationService0.isPasswordStrong("Password must contain uppercase, lowercase, numbers, and symbols");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(registrationResult8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult1 = com.yorku.lab.service.RegistrationService.RegistrationResult.error("");
        java.lang.String str2 = registrationResult1.toString();
        com.yorku.lab.model.User user5 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult6 = new com.yorku.lab.service.RegistrationService.RegistrationResult(true, "", user5);
        java.lang.String str7 = registrationResult6.message();
        boolean boolean8 = registrationResult1.equals((java.lang.Object) registrationResult6);
        java.lang.String str9 = registrationResult6.toString();
        java.lang.String str10 = registrationResult6.message();
        org.junit.Assert.assertNotNull(registrationResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RegistrationResult[success=false, message=, user=null]" + "'", str2, "RegistrationResult[success=false, message=, user=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "RegistrationResult[success=true, message=, user=null]" + "'", str9, "RegistrationResult[success=true, message=, user=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult1 = com.yorku.lab.service.RegistrationService.RegistrationResult.error("");
        java.lang.String str2 = registrationResult1.toString();
        com.yorku.lab.model.User user5 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult6 = new com.yorku.lab.service.RegistrationService.RegistrationResult(true, "", user5);
        java.lang.String str7 = registrationResult6.message();
        boolean boolean8 = registrationResult1.equals((java.lang.Object) registrationResult6);
        com.yorku.lab.service.RegistrationService registrationService9 = new com.yorku.lab.service.RegistrationService();
        boolean boolean11 = registrationService9.isPasswordStrong("");
        java.util.Optional<com.yorku.lab.model.User> userOptional13 = registrationService9.findById("");
        java.util.Optional<com.yorku.lab.model.User> userOptional15 = registrationService9.findById("hi!");
        com.yorku.lab.enums.UserType userType19 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult21 = registrationService9.registerUser("RegistrationResult[success=false, message=hi!, user=null]", "RegistrationResult[success=false, message=, user=null]", "RegistrationResult[success=true, message=, user=null]", userType19, "RegistrationResult[success=true, message=Account created successfully, user=null]");
        boolean boolean22 = registrationResult1.equals((java.lang.Object) userType19);
        com.yorku.lab.service.RegistrationService registrationService23 = new com.yorku.lab.service.RegistrationService();
        registrationService23.rejectAccount("", "");
        java.util.Optional<com.yorku.lab.model.User> userOptional28 = registrationService23.findById("");
        boolean boolean30 = registrationService23.isPasswordStrong("");
        java.util.Optional<com.yorku.lab.model.User> userOptional32 = registrationService23.findById("RegistrationResult[success=true, message=, user=null]");
        boolean boolean33 = registrationResult1.equals((java.lang.Object) "RegistrationResult[success=true, message=, user=null]");
        org.junit.Assert.assertNotNull(registrationResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RegistrationResult[success=false, message=, user=null]" + "'", str2, "RegistrationResult[success=false, message=, user=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(userOptional13);
        org.junit.Assert.assertNotNull(userOptional15);
        org.junit.Assert.assertNotNull(registrationResult21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userOptional28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(userOptional32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType4 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult6 = registrationService0.registerUser("hi!", "", "", userType4, "");
        java.lang.String str7 = registrationResult6.message();
        boolean boolean8 = registrationResult6.success();
        boolean boolean9 = registrationResult6.success();
        com.yorku.lab.model.User user10 = registrationResult6.user();
        org.junit.Assert.assertNotNull(registrationResult6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password must contain uppercase, lowercase, numbers, and symbols" + "'", str7, "Password must contain uppercase, lowercase, numbers, and symbols");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(user10);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult1 = com.yorku.lab.service.RegistrationService.RegistrationResult.error("hi!");
        java.lang.String str2 = registrationResult1.toString();
        boolean boolean3 = registrationResult1.success();
        java.lang.Class<?> wildcardClass4 = registrationResult1.getClass();
        org.junit.Assert.assertNotNull(registrationResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RegistrationResult[success=false, message=hi!, user=null]" + "'", str2, "RegistrationResult[success=false, message=hi!, user=null]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType4 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult6 = registrationService0.registerUser("hi!", "", "", userType4, "");
        registrationService0.rejectAccount("", "");
        registrationService0.rejectAccount("RegistrationResult[success=true, message=Account created successfully, user=null]", "hi!");
        com.yorku.lab.enums.UserType userType16 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult18 = registrationService0.registerUser("RegistrationResult[success=true, message=Account created successfully, user=null]", "RegistrationResult[success=false, message=, user=null]", "", userType16, "");
        com.yorku.lab.enums.UserType userType22 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult24 = registrationService0.registerUser("hi!", "RegistrationResult[success=false, message=, user=null]", "", userType22, "RegistrationResult[success=true, message=Account created successfully, user=null]");
        registrationService0.approveAccount("RegistrationResult[success=true, message=, user=null]");
        org.junit.Assert.assertNotNull(registrationResult6);
        org.junit.Assert.assertNotNull(registrationResult18);
        org.junit.Assert.assertNotNull(registrationResult24);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult1 = com.yorku.lab.service.RegistrationService.RegistrationResult.error("hi!");
        com.yorku.lab.service.RegistrationService registrationService2 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType6 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult8 = registrationService2.registerUser("hi!", "", "", userType6, "");
        registrationService2.rejectAccount("", "");
        java.util.Optional<com.yorku.lab.model.User> userOptional13 = registrationService2.findById("");
        boolean boolean14 = registrationResult1.equals((java.lang.Object) registrationService2);
        com.yorku.lab.model.User user17 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult18 = new com.yorku.lab.service.RegistrationService.RegistrationResult(true, "", user17);
        java.lang.String str19 = registrationResult18.message();
        boolean boolean20 = registrationResult1.equals((java.lang.Object) registrationResult18);
        boolean boolean21 = registrationResult18.success();
        org.junit.Assert.assertNotNull(registrationResult1);
        org.junit.Assert.assertNotNull(registrationResult8);
        org.junit.Assert.assertNotNull(userOptional13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult1 = com.yorku.lab.service.RegistrationService.RegistrationResult.pendingApproval("RegistrationResult[success=false, message=hi!, user=null]");
        java.lang.String str2 = registrationResult1.toString();
        java.lang.Object obj3 = null;
        boolean boolean4 = registrationResult1.equals(obj3);
        org.junit.Assert.assertNotNull(registrationResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RegistrationResult[success=true, message=RegistrationResult[success=false, message=hi!, user=null], user=null]" + "'", str2, "RegistrationResult[success=true, message=RegistrationResult[success=false, message=hi!, user=null], user=null]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        boolean boolean2 = registrationService0.isPasswordStrong("RegistrationResult[success=false, message=hi!, user=null]");
        com.yorku.lab.enums.UserType userType6 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult8 = registrationService0.registerUser("", "", "", userType6, "");
        java.util.Optional<com.yorku.lab.model.User> userOptional10 = registrationService0.findByEmail("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(registrationResult8);
        org.junit.Assert.assertNotNull(userOptional10);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType4 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult6 = registrationService0.registerUser("hi!", "", "", userType4, "");
        registrationService0.rejectAccount("", "");
        java.util.Optional<com.yorku.lab.model.User> userOptional11 = registrationService0.findByEmail("hi!");
        boolean boolean13 = registrationService0.isPasswordStrong("");
        registrationService0.approveAccount("hi!");
        registrationService0.approveAccount("RegistrationResult[success=false, message=, user=null]");
        registrationService0.approveAccount("hi!");
        java.util.Optional<com.yorku.lab.model.User> userOptional21 = registrationService0.findById("");
        org.junit.Assert.assertNotNull(registrationResult6);
        org.junit.Assert.assertNotNull(userOptional11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userOptional21);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        boolean boolean2 = registrationService0.isPasswordStrong("RegistrationResult[success=false, message=hi!, user=null]");
        java.util.Optional<com.yorku.lab.model.User> userOptional4 = registrationService0.findByEmail("");
        registrationService0.approveAccount("");
        boolean boolean8 = registrationService0.isPasswordStrong("hi!");
        java.util.Optional<com.yorku.lab.model.User> userOptional10 = registrationService0.findById("RegistrationResult[success=true, message=RegistrationResult[success=false, message=hi!, user=null], user=null]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userOptional4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(userOptional10);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType4 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult6 = registrationService0.registerUser("hi!", "", "", userType4, "");
        java.lang.Class<?> wildcardClass7 = registrationResult6.getClass();
        org.junit.Assert.assertNotNull(registrationResult6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        boolean boolean2 = registrationService0.isPasswordStrong("RegistrationResult[success=false, message=hi!, user=null]");
        java.util.Optional<com.yorku.lab.model.User> userOptional4 = registrationService0.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional6 = registrationService0.findByEmail("");
        boolean boolean8 = registrationService0.isPasswordStrong("");
        boolean boolean10 = registrationService0.isPasswordStrong("RegistrationResult[success=true, message=RegistrationResult[success=false, message=hi!, user=null], user=null]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userOptional4);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult1 = com.yorku.lab.service.RegistrationService.RegistrationResult.error("");
        java.lang.String str2 = registrationResult1.toString();
        com.yorku.lab.model.User user3 = registrationResult1.user();
        com.yorku.lab.model.User user4 = registrationResult1.user();
        org.junit.Assert.assertNotNull(registrationResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RegistrationResult[success=false, message=, user=null]" + "'", str2, "RegistrationResult[success=false, message=, user=null]");
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        registrationService0.rejectAccount("", "");
        boolean boolean5 = registrationService0.isPasswordStrong("RegistrationResult[success=false, message=hi!, user=null]");
        registrationService0.rejectAccount("", "RegistrationResult[success=true, message=RegistrationResult[success=false, message=hi!, user=null], user=null]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult1 = com.yorku.lab.service.RegistrationService.RegistrationResult.error("RegistrationResult[success=false, message=hi!, user=null]");
        org.junit.Assert.assertNotNull(registrationResult1);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult1 = com.yorku.lab.service.RegistrationService.RegistrationResult.error("hi!");
        com.yorku.lab.service.RegistrationService registrationService2 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType6 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult8 = registrationService2.registerUser("hi!", "", "", userType6, "");
        registrationService2.rejectAccount("", "");
        java.util.Optional<com.yorku.lab.model.User> userOptional13 = registrationService2.findById("");
        boolean boolean14 = registrationResult1.equals((java.lang.Object) registrationService2);
        java.lang.String str15 = registrationResult1.message();
        org.junit.Assert.assertNotNull(registrationResult1);
        org.junit.Assert.assertNotNull(registrationResult8);
        org.junit.Assert.assertNotNull(userOptional13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType4 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult6 = registrationService0.registerUser("hi!", "", "", userType4, "");
        java.lang.String str7 = registrationResult6.message();
        boolean boolean8 = registrationResult6.success();
        boolean boolean9 = registrationResult6.success();
        boolean boolean10 = registrationResult6.success();
        com.yorku.lab.model.User user11 = registrationResult6.user();
        org.junit.Assert.assertNotNull(registrationResult6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password must contain uppercase, lowercase, numbers, and symbols" + "'", str7, "Password must contain uppercase, lowercase, numbers, and symbols");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(user11);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType4 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult6 = registrationService0.registerUser("hi!", "", "", userType4, "");
        registrationService0.rejectAccount("", "");
        java.util.Optional<com.yorku.lab.model.User> userOptional11 = registrationService0.findById("");
        java.util.Optional<com.yorku.lab.model.User> userOptional13 = registrationService0.findByEmail("RegistrationResult[success=true, message=, user=null]");
        org.junit.Assert.assertNotNull(registrationResult6);
        org.junit.Assert.assertNotNull(userOptional11);
        org.junit.Assert.assertNotNull(userOptional13);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType4 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult6 = registrationService0.registerUser("RegistrationResult[success=true, message=Account created successfully, user=null]", "RegistrationResult[success=false, message=, user=null]", "", userType4, "RegistrationResult[success=false, message=Password must contain uppercase, lowercase, numbers, and symbols, user=null]");
        com.yorku.lab.service.RegistrationService registrationService7 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType11 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult13 = registrationService7.registerUser("hi!", "", "", userType11, "");
        registrationService7.rejectAccount("", "");
        registrationService7.rejectAccount("RegistrationResult[success=true, message=Account created successfully, user=null]", "hi!");
        com.yorku.lab.enums.UserType userType23 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult25 = registrationService7.registerUser("RegistrationResult[success=true, message=Account created successfully, user=null]", "RegistrationResult[success=false, message=, user=null]", "", userType23, "");
        registrationService7.rejectAccount("", "");
        java.util.Optional<com.yorku.lab.model.User> userOptional30 = registrationService7.findById("");
        boolean boolean31 = registrationResult6.equals((java.lang.Object) registrationService7);
        registrationService7.approveAccount("Password must contain uppercase, lowercase, numbers, and symbols");
        boolean boolean35 = registrationService7.isPasswordStrong("");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList36 = registrationService7.getPendingApprovals();
        org.junit.Assert.assertNotNull(registrationResult6);
        org.junit.Assert.assertNotNull(registrationResult13);
        org.junit.Assert.assertNotNull(registrationResult25);
        org.junit.Assert.assertNotNull(userOptional30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(approvalRequestList36);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult1 = com.yorku.lab.service.RegistrationService.RegistrationResult.error("hi!");
        com.yorku.lab.service.RegistrationService registrationService2 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType6 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult8 = registrationService2.registerUser("hi!", "", "", userType6, "");
        registrationService2.rejectAccount("", "");
        java.util.Optional<com.yorku.lab.model.User> userOptional13 = registrationService2.findById("");
        boolean boolean14 = registrationResult1.equals((java.lang.Object) registrationService2);
        java.util.Optional<com.yorku.lab.model.User> userOptional16 = registrationService2.findByEmail("RegistrationResult[success=true, message=Account created successfully, user=null]");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList17 = registrationService2.getPendingApprovals();
        org.junit.Assert.assertNotNull(registrationResult1);
        org.junit.Assert.assertNotNull(registrationResult8);
        org.junit.Assert.assertNotNull(userOptional13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userOptional16);
        org.junit.Assert.assertNotNull(approvalRequestList17);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.yorku.lab.model.User user0 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult1 = com.yorku.lab.service.RegistrationService.RegistrationResult.success(user0);
        java.lang.String str2 = registrationResult1.toString();
        boolean boolean3 = registrationResult1.success();
        boolean boolean4 = registrationResult1.success();
        java.lang.Object obj5 = null;
        boolean boolean6 = registrationResult1.equals(obj5);
        com.yorku.lab.service.RegistrationService registrationService7 = new com.yorku.lab.service.RegistrationService();
        boolean boolean9 = registrationService7.isPasswordStrong("");
        java.util.Optional<com.yorku.lab.model.User> userOptional11 = registrationService7.findById("");
        java.util.Optional<com.yorku.lab.model.User> userOptional13 = registrationService7.findById("hi!");
        com.yorku.lab.enums.UserType userType17 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult19 = registrationService7.registerUser("RegistrationResult[success=false, message=hi!, user=null]", "RegistrationResult[success=false, message=, user=null]", "RegistrationResult[success=true, message=, user=null]", userType17, "RegistrationResult[success=true, message=Account created successfully, user=null]");
        java.util.Optional<com.yorku.lab.model.User> userOptional21 = registrationService7.findByEmail("");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList22 = registrationService7.getPendingApprovals();
        registrationService7.approveAccount("");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList25 = registrationService7.getPendingApprovals();
        boolean boolean26 = registrationResult1.equals((java.lang.Object) approvalRequestList25);
        boolean boolean27 = registrationResult1.success();
        org.junit.Assert.assertNotNull(registrationResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RegistrationResult[success=true, message=Account created successfully, user=null]" + "'", str2, "RegistrationResult[success=true, message=Account created successfully, user=null]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(userOptional11);
        org.junit.Assert.assertNotNull(userOptional13);
        org.junit.Assert.assertNotNull(registrationResult19);
        org.junit.Assert.assertNotNull(userOptional21);
        org.junit.Assert.assertNotNull(approvalRequestList22);
        org.junit.Assert.assertNotNull(approvalRequestList25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        registrationService0.rejectAccount("", "");
        boolean boolean5 = registrationService0.isPasswordStrong("RegistrationResult[success=false, message=hi!, user=null]");
        java.util.Optional<com.yorku.lab.model.User> userOptional7 = registrationService0.findByEmail("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userOptional7);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        registrationService0.rejectAccount("", "");
        java.util.Optional<com.yorku.lab.model.User> userOptional5 = registrationService0.findById("");
        boolean boolean7 = registrationService0.isPasswordStrong("");
        registrationService0.approveAccount("");
        boolean boolean11 = registrationService0.isPasswordStrong("RegistrationResult[success=true, message=, user=null]");
        registrationService0.rejectAccount("", "Password must contain uppercase, lowercase, numbers, and symbols");
        java.util.Optional<com.yorku.lab.model.User> userOptional16 = registrationService0.findById("hi!");
        boolean boolean18 = registrationService0.isPasswordStrong("");
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(userOptional16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        boolean boolean2 = registrationService0.isPasswordStrong("RegistrationResult[success=false, message=hi!, user=null]");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList3 = registrationService0.getPendingApprovals();
        boolean boolean5 = registrationService0.isPasswordStrong("");
        registrationService0.approveAccount("");
        registrationService0.approveAccount("RegistrationResult[success=true, message=Account created successfully, user=null]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(approvalRequestList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult1 = com.yorku.lab.service.RegistrationService.RegistrationResult.pendingApproval("RegistrationResult[success=false, message=, user=null]");
        org.junit.Assert.assertNotNull(registrationResult1);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType4 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult6 = registrationService0.registerUser("hi!", "", "", userType4, "");
        registrationService0.rejectAccount("", "");
        registrationService0.rejectAccount("RegistrationResult[success=true, message=Account created successfully, user=null]", "hi!");
        com.yorku.lab.enums.UserType userType16 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult18 = registrationService0.registerUser("RegistrationResult[success=false, message=, user=null]", "", "RegistrationResult[success=false, message=, user=null]", userType16, "RegistrationResult[success=false, message=, user=null]");
        java.util.Optional<com.yorku.lab.model.User> userOptional20 = registrationService0.findByEmail("");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList21 = registrationService0.getPendingApprovals();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList22 = registrationService0.getPendingApprovals();
        org.junit.Assert.assertNotNull(registrationResult6);
        org.junit.Assert.assertNotNull(registrationResult18);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertNotNull(approvalRequestList21);
        org.junit.Assert.assertNotNull(approvalRequestList22);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        boolean boolean2 = registrationService0.isPasswordStrong("");
        java.util.Optional<com.yorku.lab.model.User> userOptional4 = registrationService0.findById("");
        java.util.Optional<com.yorku.lab.model.User> userOptional6 = registrationService0.findById("hi!");
        com.yorku.lab.enums.UserType userType10 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult12 = registrationService0.registerUser("RegistrationResult[success=false, message=hi!, user=null]", "RegistrationResult[success=false, message=, user=null]", "RegistrationResult[success=true, message=, user=null]", userType10, "RegistrationResult[success=true, message=Account created successfully, user=null]");
        java.util.Optional<com.yorku.lab.model.User> userOptional14 = registrationService0.findByEmail("");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList15 = registrationService0.getPendingApprovals();
        com.yorku.lab.enums.UserType userType19 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult21 = registrationService0.registerUser("hi!", "", "RegistrationResult[success=false, message=Password must contain uppercase, lowercase, numbers, and symbols, user=null]", userType19, "");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList22 = registrationService0.getPendingApprovals();
        java.lang.Class<?> wildcardClass23 = approvalRequestList22.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userOptional4);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(registrationResult12);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(approvalRequestList15);
        org.junit.Assert.assertNotNull(registrationResult21);
        org.junit.Assert.assertNotNull(approvalRequestList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        boolean boolean2 = registrationService0.isPasswordStrong("RegistrationResult[success=false, message=hi!, user=null]");
        registrationService0.approveAccount("RegistrationResult[success=false, message=hi!, user=null]");
        java.util.Optional<com.yorku.lab.model.User> userOptional6 = registrationService0.findById("RegistrationResult[success=false, message=hi!, user=null]");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = registrationService0.getPendingApprovals();
        registrationService0.approveAccount("RegistrationResult[success=true, message=, user=null]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(approvalRequestList7);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.yorku.lab.model.User user2 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult3 = new com.yorku.lab.service.RegistrationService.RegistrationResult(true, "RegistrationResult[success=false, message=hi!, user=null]", user2);
        java.lang.Object obj4 = null;
        boolean boolean5 = registrationResult3.equals(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType4 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult6 = registrationService0.registerUser("hi!", "", "", userType4, "");
        registrationService0.rejectAccount("", "");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = registrationService0.getPendingApprovals();
        com.yorku.lab.enums.UserType userType14 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult16 = registrationService0.registerUser("", "hi!", "", userType14, "Password must contain uppercase, lowercase, numbers, and symbols");
        boolean boolean17 = registrationResult16.success();
        java.lang.Object obj18 = null;
        boolean boolean19 = registrationResult16.equals(obj18);
        org.junit.Assert.assertNotNull(registrationResult6);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(registrationResult16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult1 = com.yorku.lab.service.RegistrationService.RegistrationResult.error("");
        java.lang.String str2 = registrationResult1.toString();
        com.yorku.lab.model.User user5 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult6 = new com.yorku.lab.service.RegistrationService.RegistrationResult(true, "", user5);
        java.lang.String str7 = registrationResult6.message();
        boolean boolean8 = registrationResult1.equals((java.lang.Object) registrationResult6);
        com.yorku.lab.model.User user9 = registrationResult6.user();
        java.lang.String str10 = registrationResult6.toString();
        org.junit.Assert.assertNotNull(registrationResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RegistrationResult[success=false, message=, user=null]" + "'", str2, "RegistrationResult[success=false, message=, user=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RegistrationResult[success=true, message=, user=null]" + "'", str10, "RegistrationResult[success=true, message=, user=null]");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        boolean boolean2 = registrationService0.isPasswordStrong("RegistrationResult[success=false, message=hi!, user=null]");
        java.util.Optional<com.yorku.lab.model.User> userOptional4 = registrationService0.findByEmail("");
        registrationService0.approveAccount("");
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = registrationService0.findById("RegistrationResult[success=true, message=Account created successfully, user=null]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userOptional4);
        org.junit.Assert.assertNotNull(userOptional8);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType4 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult6 = registrationService0.registerUser("hi!", "", "", userType4, "");
        java.lang.String str7 = registrationResult6.message();
        boolean boolean8 = registrationResult6.success();
        boolean boolean9 = registrationResult6.success();
        java.lang.Class<?> wildcardClass10 = registrationResult6.getClass();
        org.junit.Assert.assertNotNull(registrationResult6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password must contain uppercase, lowercase, numbers, and symbols" + "'", str7, "Password must contain uppercase, lowercase, numbers, and symbols");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        boolean boolean2 = registrationService0.isPasswordStrong("RegistrationResult[success=false, message=hi!, user=null]");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList3 = registrationService0.getPendingApprovals();
        boolean boolean5 = registrationService0.isPasswordStrong("");
        com.yorku.lab.enums.UserType userType9 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult11 = registrationService0.registerUser("Password must contain uppercase, lowercase, numbers, and symbols", "", "hi!", userType9, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(approvalRequestList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(registrationResult11);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        boolean boolean2 = registrationService0.isPasswordStrong("");
        java.util.Optional<com.yorku.lab.model.User> userOptional4 = registrationService0.findById("");
        boolean boolean6 = registrationService0.isPasswordStrong("RegistrationResult[success=false, message=, user=null]");
        com.yorku.lab.enums.UserType userType10 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult12 = registrationService0.registerUser("RegistrationResult[success=true, message=RegistrationResult[success=true, message=Account created successfully, user=null], user=null]", "hi!", "", userType10, "");
        java.lang.String str13 = registrationResult12.message();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userOptional4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(registrationResult12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Password must contain uppercase, lowercase, numbers, and symbols" + "'", str13, "Password must contain uppercase, lowercase, numbers, and symbols");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        boolean boolean2 = registrationService0.isPasswordStrong("RegistrationResult[success=false, message=hi!, user=null]");
        registrationService0.approveAccount("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType4 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult6 = registrationService0.registerUser("hi!", "", "", userType4, "");
        registrationService0.rejectAccount("", "");
        registrationService0.rejectAccount("RegistrationResult[success=true, message=Account created successfully, user=null]", "hi!");
        com.yorku.lab.enums.UserType userType16 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult18 = registrationService0.registerUser("RegistrationResult[success=false, message=, user=null]", "", "RegistrationResult[success=false, message=, user=null]", userType16, "RegistrationResult[success=false, message=, user=null]");
        boolean boolean20 = registrationService0.isPasswordStrong("Password must contain uppercase, lowercase, numbers, and symbols");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList21 = registrationService0.getPendingApprovals();
        com.yorku.lab.enums.UserType userType25 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult27 = registrationService0.registerUser("RegistrationResult[success=true, message=, user=null]", "", "RegistrationResult[success=false, message=hi!, user=null]", userType25, "RegistrationResult[success=false, message=Password must contain uppercase, lowercase, numbers, and symbols, user=null]");
        org.junit.Assert.assertNotNull(registrationResult6);
        org.junit.Assert.assertNotNull(registrationResult18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(approvalRequestList21);
        org.junit.Assert.assertNotNull(registrationResult27);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType4 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult6 = registrationService0.registerUser("hi!", "", "", userType4, "");
        registrationService0.rejectAccount("", "");
        registrationService0.rejectAccount("RegistrationResult[success=true, message=Account created successfully, user=null]", "hi!");
        com.yorku.lab.enums.UserType userType16 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult18 = registrationService0.registerUser("RegistrationResult[success=false, message=, user=null]", "", "RegistrationResult[success=false, message=, user=null]", userType16, "RegistrationResult[success=false, message=, user=null]");
        java.util.Optional<com.yorku.lab.model.User> userOptional20 = registrationService0.findByEmail("");
        com.yorku.lab.enums.UserType userType24 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult26 = registrationService0.registerUser("RegistrationResult[success=true, message=, user=null]", "", "", userType24, "hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList27 = registrationService0.getPendingApprovals();
        registrationService0.rejectAccount("", "RegistrationResult[success=false, message=Password must contain uppercase, lowercase, numbers, and symbols, user=null]");
        java.util.Optional<com.yorku.lab.model.User> userOptional32 = registrationService0.findById("RegistrationResult[success=true, message=, user=null]");
        org.junit.Assert.assertNotNull(registrationResult6);
        org.junit.Assert.assertNotNull(registrationResult18);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertNotNull(registrationResult26);
        org.junit.Assert.assertNotNull(approvalRequestList27);
        org.junit.Assert.assertNotNull(userOptional32);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType4 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult6 = registrationService0.registerUser("hi!", "", "", userType4, "");
        registrationService0.rejectAccount("", "");
        registrationService0.rejectAccount("RegistrationResult[success=true, message=Account created successfully, user=null]", "hi!");
        com.yorku.lab.enums.UserType userType16 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult18 = registrationService0.registerUser("RegistrationResult[success=true, message=Account created successfully, user=null]", "RegistrationResult[success=false, message=, user=null]", "", userType16, "");
        registrationService0.approveAccount("RegistrationResult[success=true, message=Account created successfully, user=null]");
        org.junit.Assert.assertNotNull(registrationResult6);
        org.junit.Assert.assertNotNull(registrationResult18);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult1 = com.yorku.lab.service.RegistrationService.RegistrationResult.pendingApproval("RegistrationResult[success=true, message=Account created successfully, user=null]");
        java.lang.Object obj2 = null;
        boolean boolean3 = registrationResult1.equals(obj2);
        com.yorku.lab.model.User user4 = registrationResult1.user();
        org.junit.Assert.assertNotNull(registrationResult1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.yorku.lab.model.User user2 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult3 = new com.yorku.lab.service.RegistrationService.RegistrationResult(true, "RegistrationResult[success=true, message=, user=null]", user2);
        boolean boolean4 = registrationResult3.success();
        com.yorku.lab.model.User user5 = registrationResult3.user();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(user5);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType4 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult6 = registrationService0.registerUser("hi!", "", "", userType4, "");
        registrationService0.rejectAccount("", "");
        registrationService0.rejectAccount("RegistrationResult[success=true, message=Account created successfully, user=null]", "hi!");
        com.yorku.lab.enums.UserType userType16 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult18 = registrationService0.registerUser("RegistrationResult[success=true, message=Account created successfully, user=null]", "RegistrationResult[success=false, message=, user=null]", "", userType16, "");
        java.lang.String str19 = registrationResult18.message();
        com.yorku.lab.model.User user20 = registrationResult18.user();
        com.yorku.lab.model.User user21 = registrationResult18.user();
        boolean boolean22 = registrationResult18.success();
        com.yorku.lab.model.User user23 = registrationResult18.user();
        org.junit.Assert.assertNotNull(registrationResult6);
        org.junit.Assert.assertNotNull(registrationResult18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Password must contain uppercase, lowercase, numbers, and symbols" + "'", str19, "Password must contain uppercase, lowercase, numbers, and symbols");
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertNull(user21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(user23);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType4 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult6 = registrationService0.registerUser("hi!", "", "", userType4, "");
        registrationService0.rejectAccount("", "");
        registrationService0.rejectAccount("RegistrationResult[success=true, message=Account created successfully, user=null]", "hi!");
        com.yorku.lab.enums.UserType userType16 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult18 = registrationService0.registerUser("RegistrationResult[success=true, message=Account created successfully, user=null]", "RegistrationResult[success=false, message=, user=null]", "", userType16, "");
        registrationService0.rejectAccount("", "");
        java.util.Optional<com.yorku.lab.model.User> userOptional23 = registrationService0.findById("RegistrationResult[success=true, message=RegistrationResult[success=false, message=hi!, user=null], user=null]");
        org.junit.Assert.assertNotNull(registrationResult6);
        org.junit.Assert.assertNotNull(registrationResult18);
        org.junit.Assert.assertNotNull(userOptional23);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.yorku.lab.model.User user0 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult1 = com.yorku.lab.service.RegistrationService.RegistrationResult.success(user0);
        java.lang.String str2 = registrationResult1.toString();
        java.lang.String str3 = registrationResult1.message();
        org.junit.Assert.assertNotNull(registrationResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RegistrationResult[success=true, message=Account created successfully, user=null]" + "'", str2, "RegistrationResult[success=true, message=Account created successfully, user=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Account created successfully" + "'", str3, "Account created successfully");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        registrationService0.rejectAccount("", "");
        java.util.Optional<com.yorku.lab.model.User> userOptional5 = registrationService0.findById("");
        boolean boolean7 = registrationService0.isPasswordStrong("RegistrationResult[success=true, message=Account created successfully, user=null]");
        com.yorku.lab.enums.UserType userType11 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult13 = registrationService0.registerUser("", "", "RegistrationResult[success=true, message=, user=null]", userType11, "RegistrationResult[success=true, message=, user=null]");
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(registrationResult13);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        boolean boolean2 = registrationService0.isPasswordStrong("RegistrationResult[success=false, message=hi!, user=null]");
        com.yorku.lab.enums.UserType userType6 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult8 = registrationService0.registerUser("", "", "", userType6, "");
        registrationService0.approveAccount("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(registrationResult8);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult1 = com.yorku.lab.service.RegistrationService.RegistrationResult.error("hi!");
        java.lang.Object obj2 = null;
        boolean boolean3 = registrationResult1.equals(obj2);
        java.lang.String str4 = registrationResult1.message();
        org.junit.Assert.assertNotNull(registrationResult1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        boolean boolean2 = registrationService0.isPasswordStrong("");
        java.util.Optional<com.yorku.lab.model.User> userOptional4 = registrationService0.findById("");
        java.util.Optional<com.yorku.lab.model.User> userOptional6 = registrationService0.findById("hi!");
        com.yorku.lab.enums.UserType userType10 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult12 = registrationService0.registerUser("RegistrationResult[success=false, message=hi!, user=null]", "RegistrationResult[success=false, message=, user=null]", "RegistrationResult[success=true, message=, user=null]", userType10, "RegistrationResult[success=true, message=Account created successfully, user=null]");
        java.lang.String str13 = registrationResult12.toString();
        com.yorku.lab.model.User user16 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult17 = new com.yorku.lab.service.RegistrationService.RegistrationResult(true, "", user16);
        boolean boolean18 = registrationResult17.success();
        java.lang.String str19 = registrationResult17.message();
        boolean boolean20 = registrationResult12.equals((java.lang.Object) str19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userOptional4);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(registrationResult12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "RegistrationResult[success=false, message=Password must contain uppercase, lowercase, numbers, and symbols, user=null]" + "'", str13, "RegistrationResult[success=false, message=Password must contain uppercase, lowercase, numbers, and symbols, user=null]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType4 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult6 = registrationService0.registerUser("RegistrationResult[success=true, message=Account created successfully, user=null]", "RegistrationResult[success=false, message=, user=null]", "", userType4, "RegistrationResult[success=false, message=Password must contain uppercase, lowercase, numbers, and symbols, user=null]");
        com.yorku.lab.service.RegistrationService registrationService7 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType11 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult13 = registrationService7.registerUser("hi!", "", "", userType11, "");
        registrationService7.rejectAccount("", "");
        registrationService7.rejectAccount("RegistrationResult[success=true, message=Account created successfully, user=null]", "hi!");
        com.yorku.lab.enums.UserType userType23 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult25 = registrationService7.registerUser("RegistrationResult[success=true, message=Account created successfully, user=null]", "RegistrationResult[success=false, message=, user=null]", "", userType23, "");
        registrationService7.rejectAccount("", "");
        java.util.Optional<com.yorku.lab.model.User> userOptional30 = registrationService7.findById("");
        boolean boolean31 = registrationResult6.equals((java.lang.Object) registrationService7);
        registrationService7.rejectAccount("", "");
        boolean boolean36 = registrationService7.isPasswordStrong("RegistrationResult[success=true, message=RegistrationResult[success=false, message=hi!, user=null], user=null]");
        org.junit.Assert.assertNotNull(registrationResult6);
        org.junit.Assert.assertNotNull(registrationResult13);
        org.junit.Assert.assertNotNull(registrationResult25);
        org.junit.Assert.assertNotNull(userOptional30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType4 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult6 = registrationService0.registerUser("hi!", "", "", userType4, "");
        registrationService0.rejectAccount("", "");
        java.util.Optional<com.yorku.lab.model.User> userOptional11 = registrationService0.findById("RegistrationResult[success=true, message=, user=null]");
        java.util.Optional<com.yorku.lab.model.User> userOptional13 = registrationService0.findByEmail("RegistrationResult[success=true, message=RegistrationResult[success=true, message=Account created successfully, user=null], user=null]");
        org.junit.Assert.assertNotNull(registrationResult6);
        org.junit.Assert.assertNotNull(userOptional11);
        org.junit.Assert.assertNotNull(userOptional13);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType4 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult6 = registrationService0.registerUser("RegistrationResult[success=true, message=Account created successfully, user=null]", "RegistrationResult[success=false, message=, user=null]", "", userType4, "RegistrationResult[success=false, message=Password must contain uppercase, lowercase, numbers, and symbols, user=null]");
        com.yorku.lab.service.RegistrationService registrationService7 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType11 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult13 = registrationService7.registerUser("hi!", "", "", userType11, "");
        registrationService7.rejectAccount("", "");
        registrationService7.rejectAccount("RegistrationResult[success=true, message=Account created successfully, user=null]", "hi!");
        com.yorku.lab.enums.UserType userType23 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult25 = registrationService7.registerUser("RegistrationResult[success=true, message=Account created successfully, user=null]", "RegistrationResult[success=false, message=, user=null]", "", userType23, "");
        registrationService7.rejectAccount("", "");
        java.util.Optional<com.yorku.lab.model.User> userOptional30 = registrationService7.findById("");
        boolean boolean31 = registrationResult6.equals((java.lang.Object) registrationService7);
        boolean boolean33 = registrationService7.isPasswordStrong("RegistrationResult[success=true, message=, user=null]");
        java.util.Optional<com.yorku.lab.model.User> userOptional35 = registrationService7.findById("");
        org.junit.Assert.assertNotNull(registrationResult6);
        org.junit.Assert.assertNotNull(registrationResult13);
        org.junit.Assert.assertNotNull(registrationResult25);
        org.junit.Assert.assertNotNull(userOptional30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(userOptional35);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType4 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult6 = registrationService0.registerUser("hi!", "", "", userType4, "");
        registrationService0.rejectAccount("", "");
        registrationService0.rejectAccount("RegistrationResult[success=true, message=Account created successfully, user=null]", "hi!");
        com.yorku.lab.enums.UserType userType16 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult18 = registrationService0.registerUser("RegistrationResult[success=false, message=, user=null]", "", "RegistrationResult[success=false, message=, user=null]", userType16, "RegistrationResult[success=false, message=, user=null]");
        java.util.Optional<com.yorku.lab.model.User> userOptional20 = registrationService0.findByEmail("");
        com.yorku.lab.enums.UserType userType24 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult26 = registrationService0.registerUser("RegistrationResult[success=true, message=, user=null]", "", "", userType24, "hi!");
        registrationService0.rejectAccount("", "hi!");
        registrationService0.rejectAccount("", "");
        org.junit.Assert.assertNotNull(registrationResult6);
        org.junit.Assert.assertNotNull(registrationResult18);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertNotNull(registrationResult26);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType4 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult6 = registrationService0.registerUser("RegistrationResult[success=true, message=Account created successfully, user=null]", "RegistrationResult[success=false, message=, user=null]", "", userType4, "RegistrationResult[success=false, message=Password must contain uppercase, lowercase, numbers, and symbols, user=null]");
        com.yorku.lab.service.RegistrationService registrationService7 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType11 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult13 = registrationService7.registerUser("hi!", "", "", userType11, "");
        registrationService7.rejectAccount("", "");
        registrationService7.rejectAccount("RegistrationResult[success=true, message=Account created successfully, user=null]", "hi!");
        com.yorku.lab.enums.UserType userType23 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult25 = registrationService7.registerUser("RegistrationResult[success=true, message=Account created successfully, user=null]", "RegistrationResult[success=false, message=, user=null]", "", userType23, "");
        registrationService7.rejectAccount("", "");
        java.util.Optional<com.yorku.lab.model.User> userOptional30 = registrationService7.findById("");
        boolean boolean31 = registrationResult6.equals((java.lang.Object) registrationService7);
        registrationService7.approveAccount("Password must contain uppercase, lowercase, numbers, and symbols");
        com.yorku.lab.enums.UserType userType37 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult39 = registrationService7.registerUser("", "", "", userType37, "");
        com.yorku.lab.model.User user40 = registrationResult39.user();
        org.junit.Assert.assertNotNull(registrationResult6);
        org.junit.Assert.assertNotNull(registrationResult13);
        org.junit.Assert.assertNotNull(registrationResult25);
        org.junit.Assert.assertNotNull(userOptional30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(registrationResult39);
        org.junit.Assert.assertNull(user40);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        boolean boolean2 = registrationService0.isPasswordStrong("RegistrationResult[success=false, message=hi!, user=null]");
        registrationService0.approveAccount("RegistrationResult[success=false, message=hi!, user=null]");
        java.util.Optional<com.yorku.lab.model.User> userOptional6 = registrationService0.findById("RegistrationResult[success=false, message=hi!, user=null]");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = registrationService0.getPendingApprovals();
        registrationService0.rejectAccount("", "Account created successfully");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(approvalRequestList7);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        boolean boolean2 = registrationService0.isPasswordStrong("RegistrationResult[success=false, message=hi!, user=null]");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList3 = registrationService0.getPendingApprovals();
        boolean boolean5 = registrationService0.isPasswordStrong("");
        registrationService0.approveAccount("RegistrationResult[success=true, message=, user=null]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(approvalRequestList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        boolean boolean2 = registrationService0.isPasswordStrong("RegistrationResult[success=false, message=hi!, user=null]");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList3 = registrationService0.getPendingApprovals();
        boolean boolean5 = registrationService0.isPasswordStrong("");
        java.util.Optional<com.yorku.lab.model.User> userOptional7 = registrationService0.findByEmail("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(approvalRequestList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userOptional7);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType4 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult6 = registrationService0.registerUser("hi!", "", "", userType4, "");
        registrationService0.rejectAccount("", "");
        registrationService0.rejectAccount("RegistrationResult[success=true, message=Account created successfully, user=null]", "hi!");
        com.yorku.lab.enums.UserType userType16 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult18 = registrationService0.registerUser("RegistrationResult[success=true, message=Account created successfully, user=null]", "RegistrationResult[success=false, message=, user=null]", "", userType16, "");
        java.lang.String str19 = registrationResult18.message();
        com.yorku.lab.model.User user20 = registrationResult18.user();
        boolean boolean21 = registrationResult18.success();
        org.junit.Assert.assertNotNull(registrationResult6);
        org.junit.Assert.assertNotNull(registrationResult18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Password must contain uppercase, lowercase, numbers, and symbols" + "'", str19, "Password must contain uppercase, lowercase, numbers, and symbols");
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType4 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult6 = registrationService0.registerUser("hi!", "", "", userType4, "");
        registrationService0.rejectAccount("", "");
        java.util.Optional<com.yorku.lab.model.User> userOptional11 = registrationService0.findById("RegistrationResult[success=true, message=, user=null]");
        com.yorku.lab.enums.UserType userType15 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult17 = registrationService0.registerUser("hi!", "", "RegistrationResult[success=true, message=RegistrationResult[success=false, message=hi!, user=null], user=null]", userType15, "RegistrationResult[success=true, message=RegistrationResult[success=true, message=Account created successfully, user=null], user=null]");
        org.junit.Assert.assertNotNull(registrationResult6);
        org.junit.Assert.assertNotNull(userOptional11);
        org.junit.Assert.assertNotNull(registrationResult17);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.yorku.lab.model.User user0 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult1 = com.yorku.lab.service.RegistrationService.RegistrationResult.success(user0);
        com.yorku.lab.service.RegistrationService registrationService2 = new com.yorku.lab.service.RegistrationService();
        boolean boolean4 = registrationService2.isPasswordStrong("");
        java.util.Optional<com.yorku.lab.model.User> userOptional6 = registrationService2.findById("");
        boolean boolean7 = registrationResult1.equals((java.lang.Object) "");
        boolean boolean9 = registrationResult1.equals((java.lang.Object) "RegistrationResult[success=false, message=hi!, user=null]");
        com.yorku.lab.service.RegistrationService registrationService10 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType14 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult16 = registrationService10.registerUser("hi!", "", "", userType14, "");
        registrationService10.rejectAccount("", "");
        java.util.Optional<com.yorku.lab.model.User> userOptional21 = registrationService10.findById("RegistrationResult[success=true, message=, user=null]");
        boolean boolean22 = registrationResult1.equals((java.lang.Object) userOptional21);
        org.junit.Assert.assertNotNull(registrationResult1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(registrationResult16);
        org.junit.Assert.assertNotNull(userOptional21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.yorku.lab.service.RegistrationService registrationService0 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType4 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult6 = registrationService0.registerUser("RegistrationResult[success=true, message=Account created successfully, user=null]", "RegistrationResult[success=false, message=, user=null]", "", userType4, "RegistrationResult[success=false, message=Password must contain uppercase, lowercase, numbers, and symbols, user=null]");
        com.yorku.lab.service.RegistrationService registrationService7 = new com.yorku.lab.service.RegistrationService();
        com.yorku.lab.enums.UserType userType11 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult13 = registrationService7.registerUser("hi!", "", "", userType11, "");
        registrationService7.rejectAccount("", "");
        registrationService7.rejectAccount("RegistrationResult[success=true, message=Account created successfully, user=null]", "hi!");
        com.yorku.lab.enums.UserType userType23 = null;
        com.yorku.lab.service.RegistrationService.RegistrationResult registrationResult25 = registrationService7.registerUser("RegistrationResult[success=true, message=Account created successfully, user=null]", "RegistrationResult[success=false, message=, user=null]", "", userType23, "");
        registrationService7.rejectAccount("", "");
        java.util.Optional<com.yorku.lab.model.User> userOptional30 = registrationService7.findById("");
        boolean boolean31 = registrationResult6.equals((java.lang.Object) registrationService7);
        registrationService7.rejectAccount("", "");
        boolean boolean36 = registrationService7.isPasswordStrong("RegistrationResult[success=true, message=RegistrationResult[success=true, message=Account created successfully, user=null], user=null]");
        org.junit.Assert.assertNotNull(registrationResult6);
        org.junit.Assert.assertNotNull(registrationResult13);
        org.junit.Assert.assertNotNull(registrationResult25);
        org.junit.Assert.assertNotNull(userOptional30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }
}

