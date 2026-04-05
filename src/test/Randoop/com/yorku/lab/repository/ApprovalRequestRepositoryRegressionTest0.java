package com.yorku.lab.repository;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ApprovalRequestRepositoryRegressionTest0 {

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
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.lang.Class<?> wildcardClass1 = approvalRequestRepository0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList1 = approvalRequestRepository0.findAll();
        java.lang.Class<?> wildcardClass2 = approvalRequestRepository0.getClass();
        org.junit.Assert.assertNotNull(approvalRequestList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList1 = approvalRequestRepository0.findAll();
        com.yorku.lab.model.ApprovalRequest approvalRequest2 = null;
        // The following exception was thrown during execution in test generation
        try {
            approvalRequestRepository0.save(approvalRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.ApprovalRequest.getRequestId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(approvalRequestList1);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.model.ApprovalRequest approvalRequest1 = null;
        // The following exception was thrown during execution in test generation
        try {
            approvalRequestRepository0.save(approvalRequest1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.ApprovalRequest.getRequestId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.lang.Class<?> wildcardClass4 = approvalRequestRepository0.getClass();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList1 = approvalRequestRepository0.findAll();
        java.lang.Class<?> wildcardClass2 = approvalRequestList1.getClass();
        org.junit.Assert.assertNotNull(approvalRequestList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList5 = null;
        // The following exception was thrown during execution in test generation
        try {
            approvalRequestRepository0.saveAll(approvalRequestList5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.lang.Class<?> wildcardClass4 = approvalRequestList2.getClass();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList1 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = null;
        // The following exception was thrown during execution in test generation
        try {
            approvalRequestRepository0.saveAll(approvalRequestList2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(approvalRequestList1);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        com.yorku.lab.model.ApprovalRequest approvalRequest5 = null;
        // The following exception was thrown during execution in test generation
        try {
            approvalRequestRepository0.save(approvalRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.ApprovalRequest.getRequestId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList1 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList3 = null;
        // The following exception was thrown during execution in test generation
        try {
            approvalRequestRepository0.saveAll(approvalRequestList3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(approvalRequestList1);
        org.junit.Assert.assertNotNull(approvalRequestList2);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository6 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository6.findAll();
        approvalRequestRepository5.saveAll(approvalRequestList7);
        approvalRequestRepository0.saveAll(approvalRequestList7);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList12 = null;
        // The following exception was thrown during execution in test generation
        try {
            approvalRequestRepository0.saveAll(approvalRequestList12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository6 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository6.findAll();
        approvalRequestRepository5.saveAll(approvalRequestList7);
        approvalRequestRepository0.saveAll(approvalRequestList7);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository0.findAll();
        com.yorku.lab.model.ApprovalRequest approvalRequest12 = null;
        // The following exception was thrown during execution in test generation
        try {
            approvalRequestRepository0.save(approvalRequest12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.ApprovalRequest.getRequestId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository6 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository6.findAll();
        approvalRequestRepository5.saveAll(approvalRequestList7);
        approvalRequestRepository0.saveAll(approvalRequestList7);
        com.yorku.lab.model.ApprovalRequest approvalRequest10 = null;
        // The following exception was thrown during execution in test generation
        try {
            approvalRequestRepository0.save(approvalRequest10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.ApprovalRequest.getRequestId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList7);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList5 = approvalRequestRepository0.findPending();
        java.lang.Class<?> wildcardClass6 = approvalRequestRepository0.getClass();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList1 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList3 = approvalRequestRepository0.findAll();
        java.lang.Class<?> wildcardClass4 = approvalRequestRepository0.getClass();
        org.junit.Assert.assertNotNull(approvalRequestList1);
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository6 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository6.findAll();
        approvalRequestRepository5.saveAll(approvalRequestList7);
        approvalRequestRepository0.saveAll(approvalRequestList7);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository0.findAll();
        java.lang.Class<?> wildcardClass12 = approvalRequestList11.getClass();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository4 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList6 = approvalRequestRepository5.findAll();
        approvalRequestRepository4.saveAll(approvalRequestList6);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository4.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList8);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository0.findAll();
        java.lang.Class<?> wildcardClass12 = approvalRequestList11.getClass();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList6);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository6 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository6.findAll();
        approvalRequestRepository5.saveAll(approvalRequestList7);
        approvalRequestRepository0.saveAll(approvalRequestList7);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional12 = approvalRequestRepository0.findById("");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList13 = null;
        // The following exception was thrown during execution in test generation
        try {
            approvalRequestRepository0.saveAll(approvalRequestList13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestOptional12);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository6 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository6.findAll();
        approvalRequestRepository5.saveAll(approvalRequestList7);
        approvalRequestRepository0.saveAll(approvalRequestList7);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional12 = approvalRequestRepository0.findById("");
        java.lang.Class<?> wildcardClass13 = approvalRequestRepository0.getClass();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestOptional12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository6 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository6.findAll();
        approvalRequestRepository5.saveAll(approvalRequestList7);
        approvalRequestRepository0.saveAll(approvalRequestList7);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional12 = approvalRequestRepository0.findById("");
        com.yorku.lab.model.ApprovalRequest approvalRequest13 = null;
        // The following exception was thrown during execution in test generation
        try {
            approvalRequestRepository0.save(approvalRequest13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.ApprovalRequest.getRequestId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestOptional12);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional2 = approvalRequestRepository0.findById("");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList3 = null;
        // The following exception was thrown during execution in test generation
        try {
            approvalRequestRepository0.saveAll(approvalRequestList3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(approvalRequestOptional2);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository6 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository6.findAll();
        approvalRequestRepository5.saveAll(approvalRequestList7);
        approvalRequestRepository0.saveAll(approvalRequestList7);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository0.findPending();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository6 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository6.findAll();
        approvalRequestRepository5.saveAll(approvalRequestList7);
        approvalRequestRepository0.saveAll(approvalRequestList7);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional12 = approvalRequestRepository0.findById("hi!");
        com.yorku.lab.model.ApprovalRequest approvalRequest13 = null;
        // The following exception was thrown during execution in test generation
        try {
            approvalRequestRepository0.save(approvalRequest13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.ApprovalRequest.getRequestId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestOptional12);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository4 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList6 = approvalRequestRepository5.findAll();
        approvalRequestRepository4.saveAll(approvalRequestList6);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository4.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList8);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList12 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList13 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList14 = approvalRequestRepository0.findAll();
        java.lang.Class<?> wildcardClass15 = approvalRequestRepository0.getClass();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList6);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(approvalRequestList12);
        org.junit.Assert.assertNotNull(approvalRequestList13);
        org.junit.Assert.assertNotNull(approvalRequestList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository6 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository6.findAll();
        approvalRequestRepository5.saveAll(approvalRequestList7);
        approvalRequestRepository0.saveAll(approvalRequestList7);
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional11 = approvalRequestRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList12 = approvalRequestRepository0.findAll();
        java.lang.Class<?> wildcardClass13 = approvalRequestRepository0.getClass();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestOptional11);
        org.junit.Assert.assertNotNull(approvalRequestList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional2 = approvalRequestRepository0.findById("");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList3 = approvalRequestRepository0.findAll();
        com.yorku.lab.model.ApprovalRequest approvalRequest4 = null;
        // The following exception was thrown during execution in test generation
        try {
            approvalRequestRepository0.save(approvalRequest4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.ApprovalRequest.getRequestId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(approvalRequestOptional2);
        org.junit.Assert.assertNotNull(approvalRequestList3);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList5 = approvalRequestRepository0.findPending();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional7 = approvalRequestRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional10 = approvalRequestRepository0.findById("");
        java.lang.Class<?> wildcardClass11 = approvalRequestOptional10.getClass();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList5);
        org.junit.Assert.assertNotNull(approvalRequestOptional7);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestOptional10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository6 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository6.findAll();
        approvalRequestRepository5.saveAll(approvalRequestList7);
        approvalRequestRepository0.saveAll(approvalRequestList7);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository12 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository13 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList14 = approvalRequestRepository13.findAll();
        approvalRequestRepository12.saveAll(approvalRequestList14);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList16 = approvalRequestRepository12.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository17 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository18 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList19 = approvalRequestRepository18.findAll();
        approvalRequestRepository17.saveAll(approvalRequestList19);
        approvalRequestRepository12.saveAll(approvalRequestList19);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList22 = approvalRequestRepository12.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList23 = approvalRequestRepository12.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList23);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList25 = approvalRequestRepository0.findPending();
        java.lang.Class<?> wildcardClass26 = approvalRequestList25.getClass();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(approvalRequestList14);
        org.junit.Assert.assertNotNull(approvalRequestList16);
        org.junit.Assert.assertNotNull(approvalRequestList19);
        org.junit.Assert.assertNotNull(approvalRequestList22);
        org.junit.Assert.assertNotNull(approvalRequestList23);
        org.junit.Assert.assertNotNull(approvalRequestList25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository4 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList6 = approvalRequestRepository5.findAll();
        approvalRequestRepository4.saveAll(approvalRequestList6);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository4.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList8);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList12 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList13 = approvalRequestRepository0.findPending();
        java.lang.Class<?> wildcardClass14 = approvalRequestList13.getClass();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList6);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(approvalRequestList12);
        org.junit.Assert.assertNotNull(approvalRequestList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList5 = approvalRequestRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional7 = approvalRequestRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository0.findPending();
        com.yorku.lab.model.ApprovalRequest approvalRequest9 = null;
        // The following exception was thrown during execution in test generation
        try {
            approvalRequestRepository0.save(approvalRequest9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.ApprovalRequest.getRequestId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList5);
        org.junit.Assert.assertNotNull(approvalRequestOptional7);
        org.junit.Assert.assertNotNull(approvalRequestList8);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList5 = approvalRequestRepository0.findPending();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional7 = approvalRequestRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional10 = approvalRequestRepository0.findById("");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository0.findPending();
        java.lang.Class<?> wildcardClass12 = approvalRequestList11.getClass();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList5);
        org.junit.Assert.assertNotNull(approvalRequestOptional7);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestOptional10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository6 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository6.findAll();
        approvalRequestRepository5.saveAll(approvalRequestList7);
        approvalRequestRepository0.saveAll(approvalRequestList7);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional12 = approvalRequestRepository0.findById("hi!");
        java.lang.Class<?> wildcardClass13 = approvalRequestRepository0.getClass();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestOptional12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList5 = approvalRequestRepository0.findPending();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional7 = approvalRequestRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional10 = approvalRequestRepository0.findById("");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList12 = approvalRequestRepository0.findPending();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList5);
        org.junit.Assert.assertNotNull(approvalRequestOptional7);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestOptional10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(approvalRequestList12);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList5 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList6 = approvalRequestRepository0.findPending();
        com.yorku.lab.model.ApprovalRequest approvalRequest7 = null;
        // The following exception was thrown during execution in test generation
        try {
            approvalRequestRepository0.save(approvalRequest7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.ApprovalRequest.getRequestId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList5);
        org.junit.Assert.assertNotNull(approvalRequestList6);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository4 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList6 = approvalRequestRepository5.findAll();
        approvalRequestRepository4.saveAll(approvalRequestList6);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository4.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList8);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository0.findPending();
        com.yorku.lab.model.ApprovalRequest approvalRequest12 = null;
        // The following exception was thrown during execution in test generation
        try {
            approvalRequestRepository0.save(approvalRequest12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.ApprovalRequest.getRequestId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList6);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList1 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional4 = approvalRequestRepository0.findById("");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository6 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository6.findAll();
        approvalRequestRepository5.saveAll(approvalRequestList7);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList9 = approvalRequestRepository5.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository10 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository11 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList12 = approvalRequestRepository11.findAll();
        approvalRequestRepository10.saveAll(approvalRequestList12);
        approvalRequestRepository5.saveAll(approvalRequestList12);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList15 = approvalRequestRepository5.findPending();
        approvalRequestRepository0.saveAll(approvalRequestList15);
        org.junit.Assert.assertNotNull(approvalRequestList1);
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestOptional4);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestList9);
        org.junit.Assert.assertNotNull(approvalRequestList12);
        org.junit.Assert.assertNotNull(approvalRequestList15);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList5 = approvalRequestRepository0.findPending();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional7 = approvalRequestRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional10 = approvalRequestRepository0.findById("");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository0.findPending();
        java.lang.Class<?> wildcardClass12 = approvalRequestRepository0.getClass();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList5);
        org.junit.Assert.assertNotNull(approvalRequestOptional7);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestOptional10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository6 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository6.findAll();
        approvalRequestRepository5.saveAll(approvalRequestList7);
        approvalRequestRepository0.saveAll(approvalRequestList7);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional12 = approvalRequestRepository0.findById("");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList13 = approvalRequestRepository0.findPending();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional15 = approvalRequestRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList16 = null;
        // The following exception was thrown during execution in test generation
        try {
            approvalRequestRepository0.saveAll(approvalRequestList16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestOptional12);
        org.junit.Assert.assertNotNull(approvalRequestList13);
        org.junit.Assert.assertNotNull(approvalRequestOptional15);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository4 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList6 = approvalRequestRepository5.findAll();
        approvalRequestRepository4.saveAll(approvalRequestList6);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository4.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList8);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList12 = approvalRequestRepository0.findAll();
        com.yorku.lab.model.ApprovalRequest approvalRequest13 = null;
        // The following exception was thrown during execution in test generation
        try {
            approvalRequestRepository0.save(approvalRequest13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.ApprovalRequest.getRequestId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList6);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(approvalRequestList12);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList5 = approvalRequestRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional7 = approvalRequestRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList9 = null;
        // The following exception was thrown during execution in test generation
        try {
            approvalRequestRepository0.saveAll(approvalRequestList9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList5);
        org.junit.Assert.assertNotNull(approvalRequestOptional7);
        org.junit.Assert.assertNotNull(approvalRequestList8);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList1 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository3 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository4 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList5 = approvalRequestRepository4.findAll();
        approvalRequestRepository3.saveAll(approvalRequestList5);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository3.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository3.findPending();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional10 = approvalRequestRepository3.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository3.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList11);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList13 = approvalRequestRepository0.findAll();
        com.yorku.lab.model.ApprovalRequest approvalRequest14 = null;
        // The following exception was thrown during execution in test generation
        try {
            approvalRequestRepository0.save(approvalRequest14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.ApprovalRequest.getRequestId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(approvalRequestList1);
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList5);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestOptional10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(approvalRequestList13);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository4 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList6 = approvalRequestRepository5.findAll();
        approvalRequestRepository4.saveAll(approvalRequestList6);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository4.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList8);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList12 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList13 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList14 = approvalRequestRepository0.findPending();
        java.lang.Class<?> wildcardClass15 = approvalRequestList14.getClass();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList6);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(approvalRequestList12);
        org.junit.Assert.assertNotNull(approvalRequestList13);
        org.junit.Assert.assertNotNull(approvalRequestList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList5 = approvalRequestRepository0.findPending();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional7 = approvalRequestRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList9 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = null;
        // The following exception was thrown during execution in test generation
        try {
            approvalRequestRepository0.saveAll(approvalRequestList10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList5);
        org.junit.Assert.assertNotNull(approvalRequestOptional7);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestList9);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository6 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository6.findAll();
        approvalRequestRepository5.saveAll(approvalRequestList7);
        approvalRequestRepository0.saveAll(approvalRequestList7);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional12 = approvalRequestRepository0.findById("");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList13 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList14 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList15 = null;
        // The following exception was thrown during execution in test generation
        try {
            approvalRequestRepository0.saveAll(approvalRequestList15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestOptional12);
        org.junit.Assert.assertNotNull(approvalRequestList13);
        org.junit.Assert.assertNotNull(approvalRequestList14);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository6 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository6.findAll();
        approvalRequestRepository5.saveAll(approvalRequestList7);
        approvalRequestRepository0.saveAll(approvalRequestList7);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional12 = approvalRequestRepository0.findById("");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList13 = approvalRequestRepository0.findPending();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional15 = approvalRequestRepository0.findById("hi!");
        java.lang.Class<?> wildcardClass16 = approvalRequestRepository0.getClass();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestOptional12);
        org.junit.Assert.assertNotNull(approvalRequestList13);
        org.junit.Assert.assertNotNull(approvalRequestOptional15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList5 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList6 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository0.findPending();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional9 = approvalRequestRepository0.findById("hi!");
        com.yorku.lab.model.ApprovalRequest approvalRequest10 = null;
        // The following exception was thrown during execution in test generation
        try {
            approvalRequestRepository0.save(approvalRequest10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.ApprovalRequest.getRequestId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList5);
        org.junit.Assert.assertNotNull(approvalRequestList6);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestOptional9);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList5 = approvalRequestRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional7 = approvalRequestRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository0.findPending();
        java.lang.Class<?> wildcardClass9 = approvalRequestRepository0.getClass();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList5);
        org.junit.Assert.assertNotNull(approvalRequestOptional7);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository6 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository6.findAll();
        approvalRequestRepository5.saveAll(approvalRequestList7);
        approvalRequestRepository0.saveAll(approvalRequestList7);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional12 = approvalRequestRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional14 = approvalRequestRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList15 = approvalRequestRepository0.findPending();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestOptional12);
        org.junit.Assert.assertNotNull(approvalRequestOptional14);
        org.junit.Assert.assertNotNull(approvalRequestList15);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList1 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository3 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository4 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList5 = approvalRequestRepository4.findAll();
        approvalRequestRepository3.saveAll(approvalRequestList5);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository3.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository3.findPending();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional10 = approvalRequestRepository3.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository3.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList11);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList13 = approvalRequestRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional15 = approvalRequestRepository0.findById("hi!");
        org.junit.Assert.assertNotNull(approvalRequestList1);
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList5);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestOptional10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(approvalRequestList13);
        org.junit.Assert.assertNotNull(approvalRequestOptional15);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList1 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository3 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository4 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList5 = approvalRequestRepository4.findAll();
        approvalRequestRepository3.saveAll(approvalRequestList5);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository3.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository3.findPending();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional10 = approvalRequestRepository3.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository3.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList11);
        java.lang.Class<?> wildcardClass13 = approvalRequestList11.getClass();
        org.junit.Assert.assertNotNull(approvalRequestList1);
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList5);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestOptional10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList5 = approvalRequestRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional7 = approvalRequestRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = null;
        // The following exception was thrown during execution in test generation
        try {
            approvalRequestRepository0.saveAll(approvalRequestList8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList5);
        org.junit.Assert.assertNotNull(approvalRequestOptional7);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository4 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList6 = approvalRequestRepository5.findAll();
        approvalRequestRepository4.saveAll(approvalRequestList6);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository4.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList8);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList12 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList13 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList14 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList15 = approvalRequestRepository0.findAll();
        com.yorku.lab.model.ApprovalRequest approvalRequest16 = null;
        // The following exception was thrown during execution in test generation
        try {
            approvalRequestRepository0.save(approvalRequest16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.ApprovalRequest.getRequestId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList6);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(approvalRequestList12);
        org.junit.Assert.assertNotNull(approvalRequestList13);
        org.junit.Assert.assertNotNull(approvalRequestList14);
        org.junit.Assert.assertNotNull(approvalRequestList15);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList5 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList6 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository0.findPending();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional9 = approvalRequestRepository0.findById("hi!");
        java.lang.Class<?> wildcardClass10 = approvalRequestRepository0.getClass();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList5);
        org.junit.Assert.assertNotNull(approvalRequestList6);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestOptional9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository6 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository6.findAll();
        approvalRequestRepository5.saveAll(approvalRequestList7);
        approvalRequestRepository0.saveAll(approvalRequestList7);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional12 = approvalRequestRepository0.findById("");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList13 = approvalRequestRepository0.findPending();
        com.yorku.lab.model.ApprovalRequest approvalRequest14 = null;
        // The following exception was thrown during execution in test generation
        try {
            approvalRequestRepository0.save(approvalRequest14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.ApprovalRequest.getRequestId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestOptional12);
        org.junit.Assert.assertNotNull(approvalRequestList13);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional2 = approvalRequestRepository0.findById("");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList3 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        org.junit.Assert.assertNotNull(approvalRequestOptional2);
        org.junit.Assert.assertNotNull(approvalRequestList3);
        org.junit.Assert.assertNotNull(approvalRequestList4);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository6 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository6.findAll();
        approvalRequestRepository5.saveAll(approvalRequestList7);
        approvalRequestRepository0.saveAll(approvalRequestList7);
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional11 = approvalRequestRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList12 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList13 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList14 = approvalRequestRepository0.findAll();
        com.yorku.lab.model.ApprovalRequest approvalRequest15 = null;
        // The following exception was thrown during execution in test generation
        try {
            approvalRequestRepository0.save(approvalRequest15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.ApprovalRequest.getRequestId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestOptional11);
        org.junit.Assert.assertNotNull(approvalRequestList12);
        org.junit.Assert.assertNotNull(approvalRequestList13);
        org.junit.Assert.assertNotNull(approvalRequestList14);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository6 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository6.findAll();
        approvalRequestRepository5.saveAll(approvalRequestList7);
        approvalRequestRepository0.saveAll(approvalRequestList7);
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional11 = approvalRequestRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList12 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList13 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList14 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList15 = null;
        // The following exception was thrown during execution in test generation
        try {
            approvalRequestRepository0.saveAll(approvalRequestList15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestOptional11);
        org.junit.Assert.assertNotNull(approvalRequestList12);
        org.junit.Assert.assertNotNull(approvalRequestList13);
        org.junit.Assert.assertNotNull(approvalRequestList14);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository4 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList6 = approvalRequestRepository5.findAll();
        approvalRequestRepository4.saveAll(approvalRequestList6);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository4.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList8);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository0.findAll();
        java.lang.Class<?> wildcardClass12 = approvalRequestRepository0.getClass();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList6);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository6 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository6.findAll();
        approvalRequestRepository5.saveAll(approvalRequestList7);
        approvalRequestRepository0.saveAll(approvalRequestList7);
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional11 = approvalRequestRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList12 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList13 = approvalRequestRepository0.findPending();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestOptional11);
        org.junit.Assert.assertNotNull(approvalRequestList12);
        org.junit.Assert.assertNotNull(approvalRequestList13);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository6 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository6.findAll();
        approvalRequestRepository5.saveAll(approvalRequestList7);
        approvalRequestRepository0.saveAll(approvalRequestList7);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional12 = approvalRequestRepository0.findById("");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList13 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList14 = approvalRequestRepository0.findAll();
        java.lang.Class<?> wildcardClass15 = approvalRequestRepository0.getClass();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestOptional12);
        org.junit.Assert.assertNotNull(approvalRequestList13);
        org.junit.Assert.assertNotNull(approvalRequestList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository6 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository6.findAll();
        approvalRequestRepository5.saveAll(approvalRequestList7);
        approvalRequestRepository0.saveAll(approvalRequestList7);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository12 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository13 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList14 = approvalRequestRepository13.findAll();
        approvalRequestRepository12.saveAll(approvalRequestList14);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList16 = approvalRequestRepository12.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository17 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository18 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList19 = approvalRequestRepository18.findAll();
        approvalRequestRepository17.saveAll(approvalRequestList19);
        approvalRequestRepository12.saveAll(approvalRequestList19);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList22 = approvalRequestRepository12.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList23 = approvalRequestRepository12.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList23);
        com.yorku.lab.model.ApprovalRequest approvalRequest25 = null;
        // The following exception was thrown during execution in test generation
        try {
            approvalRequestRepository0.save(approvalRequest25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.ApprovalRequest.getRequestId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(approvalRequestList14);
        org.junit.Assert.assertNotNull(approvalRequestList16);
        org.junit.Assert.assertNotNull(approvalRequestList19);
        org.junit.Assert.assertNotNull(approvalRequestList22);
        org.junit.Assert.assertNotNull(approvalRequestList23);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList5 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList6 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository0.findAll();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList5);
        org.junit.Assert.assertNotNull(approvalRequestList6);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestList8);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional2 = approvalRequestRepository0.findById("");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList3 = approvalRequestRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional5 = approvalRequestRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList6 = null;
        // The following exception was thrown during execution in test generation
        try {
            approvalRequestRepository0.saveAll(approvalRequestList6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(approvalRequestOptional2);
        org.junit.Assert.assertNotNull(approvalRequestList3);
        org.junit.Assert.assertNotNull(approvalRequestOptional5);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional2 = approvalRequestRepository0.findById("");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList3 = approvalRequestRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional5 = approvalRequestRepository0.findById("hi!");
        java.lang.Class<?> wildcardClass6 = approvalRequestOptional5.getClass();
        org.junit.Assert.assertNotNull(approvalRequestOptional2);
        org.junit.Assert.assertNotNull(approvalRequestList3);
        org.junit.Assert.assertNotNull(approvalRequestOptional5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository6 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository6.findAll();
        approvalRequestRepository5.saveAll(approvalRequestList7);
        approvalRequestRepository0.saveAll(approvalRequestList7);
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional11 = approvalRequestRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList12 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList13 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList14 = approvalRequestRepository0.findPending();
        com.yorku.lab.model.ApprovalRequest approvalRequest15 = null;
        // The following exception was thrown during execution in test generation
        try {
            approvalRequestRepository0.save(approvalRequest15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.ApprovalRequest.getRequestId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestOptional11);
        org.junit.Assert.assertNotNull(approvalRequestList12);
        org.junit.Assert.assertNotNull(approvalRequestList13);
        org.junit.Assert.assertNotNull(approvalRequestList14);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository6 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository6.findAll();
        approvalRequestRepository5.saveAll(approvalRequestList7);
        approvalRequestRepository0.saveAll(approvalRequestList7);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository12 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository13 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList14 = approvalRequestRepository13.findAll();
        approvalRequestRepository12.saveAll(approvalRequestList14);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList16 = approvalRequestRepository12.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository17 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository18 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList19 = approvalRequestRepository18.findAll();
        approvalRequestRepository17.saveAll(approvalRequestList19);
        approvalRequestRepository12.saveAll(approvalRequestList19);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList22 = approvalRequestRepository12.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList23 = approvalRequestRepository12.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList23);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList25 = null;
        // The following exception was thrown during execution in test generation
        try {
            approvalRequestRepository0.saveAll(approvalRequestList25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(approvalRequestList14);
        org.junit.Assert.assertNotNull(approvalRequestList16);
        org.junit.Assert.assertNotNull(approvalRequestList19);
        org.junit.Assert.assertNotNull(approvalRequestList22);
        org.junit.Assert.assertNotNull(approvalRequestList23);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository6 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository6.findAll();
        approvalRequestRepository5.saveAll(approvalRequestList7);
        approvalRequestRepository0.saveAll(approvalRequestList7);
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional11 = approvalRequestRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList12 = approvalRequestRepository0.findAll();
        java.lang.Class<?> wildcardClass13 = approvalRequestList12.getClass();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestOptional11);
        org.junit.Assert.assertNotNull(approvalRequestList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList5 = approvalRequestRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional7 = approvalRequestRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList9 = approvalRequestRepository0.findAll();
        com.yorku.lab.model.ApprovalRequest approvalRequest10 = null;
        // The following exception was thrown during execution in test generation
        try {
            approvalRequestRepository0.save(approvalRequest10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.ApprovalRequest.getRequestId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList5);
        org.junit.Assert.assertNotNull(approvalRequestOptional7);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestList9);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList1 = approvalRequestRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional3 = approvalRequestRepository0.findById("");
        java.lang.Class<?> wildcardClass4 = approvalRequestOptional3.getClass();
        org.junit.Assert.assertNotNull(approvalRequestList1);
        org.junit.Assert.assertNotNull(approvalRequestOptional3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository6 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository6.findAll();
        approvalRequestRepository5.saveAll(approvalRequestList7);
        approvalRequestRepository0.saveAll(approvalRequestList7);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findPending();
        com.yorku.lab.model.ApprovalRequest approvalRequest11 = null;
        // The following exception was thrown during execution in test generation
        try {
            approvalRequestRepository0.save(approvalRequest11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.ApprovalRequest.getRequestId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestList10);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList5 = approvalRequestRepository0.findPending();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional7 = approvalRequestRepository0.findById("hi!");
        java.lang.Class<?> wildcardClass8 = approvalRequestRepository0.getClass();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList5);
        org.junit.Assert.assertNotNull(approvalRequestOptional7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList1 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository3 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository4 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList5 = approvalRequestRepository4.findAll();
        approvalRequestRepository3.saveAll(approvalRequestList5);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository3.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository3.findPending();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional10 = approvalRequestRepository3.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository3.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList11);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList13 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository14 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository15 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList16 = approvalRequestRepository15.findAll();
        approvalRequestRepository14.saveAll(approvalRequestList16);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList18 = approvalRequestRepository14.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository19 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository20 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList21 = approvalRequestRepository20.findAll();
        approvalRequestRepository19.saveAll(approvalRequestList21);
        approvalRequestRepository14.saveAll(approvalRequestList21);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList24 = approvalRequestRepository14.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList25 = approvalRequestRepository14.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository26 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository27 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList28 = approvalRequestRepository27.findAll();
        approvalRequestRepository26.saveAll(approvalRequestList28);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList30 = approvalRequestRepository26.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository31 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository32 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList33 = approvalRequestRepository32.findAll();
        approvalRequestRepository31.saveAll(approvalRequestList33);
        approvalRequestRepository26.saveAll(approvalRequestList33);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList36 = approvalRequestRepository26.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList37 = approvalRequestRepository26.findAll();
        approvalRequestRepository14.saveAll(approvalRequestList37);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList39 = approvalRequestRepository14.findPending();
        approvalRequestRepository0.saveAll(approvalRequestList39);
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository41 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList42 = approvalRequestRepository41.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList42);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList44 = approvalRequestRepository0.findAll();
        com.yorku.lab.model.ApprovalRequest approvalRequest45 = null;
        // The following exception was thrown during execution in test generation
        try {
            approvalRequestRepository0.save(approvalRequest45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.ApprovalRequest.getRequestId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(approvalRequestList1);
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList5);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestOptional10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(approvalRequestList13);
        org.junit.Assert.assertNotNull(approvalRequestList16);
        org.junit.Assert.assertNotNull(approvalRequestList18);
        org.junit.Assert.assertNotNull(approvalRequestList21);
        org.junit.Assert.assertNotNull(approvalRequestList24);
        org.junit.Assert.assertNotNull(approvalRequestList25);
        org.junit.Assert.assertNotNull(approvalRequestList28);
        org.junit.Assert.assertNotNull(approvalRequestList30);
        org.junit.Assert.assertNotNull(approvalRequestList33);
        org.junit.Assert.assertNotNull(approvalRequestList36);
        org.junit.Assert.assertNotNull(approvalRequestList37);
        org.junit.Assert.assertNotNull(approvalRequestList39);
        org.junit.Assert.assertNotNull(approvalRequestList42);
        org.junit.Assert.assertNotNull(approvalRequestList44);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList5 = approvalRequestRepository0.findPending();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional7 = approvalRequestRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional10 = approvalRequestRepository0.findById("");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = null;
        // The following exception was thrown during execution in test generation
        try {
            approvalRequestRepository0.saveAll(approvalRequestList11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList5);
        org.junit.Assert.assertNotNull(approvalRequestOptional7);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestOptional10);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository6 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository6.findAll();
        approvalRequestRepository5.saveAll(approvalRequestList7);
        approvalRequestRepository0.saveAll(approvalRequestList7);
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional11 = approvalRequestRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList12 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList13 = null;
        // The following exception was thrown during execution in test generation
        try {
            approvalRequestRepository0.saveAll(approvalRequestList13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestOptional11);
        org.junit.Assert.assertNotNull(approvalRequestList12);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList1 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional4 = approvalRequestRepository0.findById("");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList5 = approvalRequestRepository0.findPending();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional7 = approvalRequestRepository0.findById("");
        org.junit.Assert.assertNotNull(approvalRequestList1);
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestOptional4);
        org.junit.Assert.assertNotNull(approvalRequestList5);
        org.junit.Assert.assertNotNull(approvalRequestOptional7);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList5 = approvalRequestRepository0.findPending();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional7 = approvalRequestRepository0.findById("hi!");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository8 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository9 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository9.findAll();
        approvalRequestRepository8.saveAll(approvalRequestList10);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList12 = approvalRequestRepository8.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository13 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository14 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList15 = approvalRequestRepository14.findAll();
        approvalRequestRepository13.saveAll(approvalRequestList15);
        approvalRequestRepository8.saveAll(approvalRequestList15);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList18 = approvalRequestRepository8.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList19 = approvalRequestRepository8.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository20 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository21 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList22 = approvalRequestRepository21.findAll();
        approvalRequestRepository20.saveAll(approvalRequestList22);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList24 = approvalRequestRepository20.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository25 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository26 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList27 = approvalRequestRepository26.findAll();
        approvalRequestRepository25.saveAll(approvalRequestList27);
        approvalRequestRepository20.saveAll(approvalRequestList27);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList30 = approvalRequestRepository20.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList31 = approvalRequestRepository20.findAll();
        approvalRequestRepository8.saveAll(approvalRequestList31);
        approvalRequestRepository0.saveAll(approvalRequestList31);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList34 = null;
        // The following exception was thrown during execution in test generation
        try {
            approvalRequestRepository0.saveAll(approvalRequestList34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList5);
        org.junit.Assert.assertNotNull(approvalRequestOptional7);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestList12);
        org.junit.Assert.assertNotNull(approvalRequestList15);
        org.junit.Assert.assertNotNull(approvalRequestList18);
        org.junit.Assert.assertNotNull(approvalRequestList19);
        org.junit.Assert.assertNotNull(approvalRequestList22);
        org.junit.Assert.assertNotNull(approvalRequestList24);
        org.junit.Assert.assertNotNull(approvalRequestList27);
        org.junit.Assert.assertNotNull(approvalRequestList30);
        org.junit.Assert.assertNotNull(approvalRequestList31);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList5 = approvalRequestRepository0.findPending();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional7 = approvalRequestRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList9 = approvalRequestRepository0.findAll();
        com.yorku.lab.model.ApprovalRequest approvalRequest10 = null;
        // The following exception was thrown during execution in test generation
        try {
            approvalRequestRepository0.save(approvalRequest10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.ApprovalRequest.getRequestId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList5);
        org.junit.Assert.assertNotNull(approvalRequestOptional7);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestList9);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList1 = approvalRequestRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional3 = approvalRequestRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional5 = approvalRequestRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional7 = approvalRequestRepository0.findById("hi!");
        org.junit.Assert.assertNotNull(approvalRequestList1);
        org.junit.Assert.assertNotNull(approvalRequestOptional3);
        org.junit.Assert.assertNotNull(approvalRequestOptional5);
        org.junit.Assert.assertNotNull(approvalRequestOptional7);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList5 = approvalRequestRepository0.findPending();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional7 = approvalRequestRepository0.findById("hi!");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository8 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository9 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository9.findAll();
        approvalRequestRepository8.saveAll(approvalRequestList10);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList12 = approvalRequestRepository8.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository13 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository14 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList15 = approvalRequestRepository14.findAll();
        approvalRequestRepository13.saveAll(approvalRequestList15);
        approvalRequestRepository8.saveAll(approvalRequestList15);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList18 = approvalRequestRepository8.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList19 = approvalRequestRepository8.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository20 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository21 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList22 = approvalRequestRepository21.findAll();
        approvalRequestRepository20.saveAll(approvalRequestList22);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList24 = approvalRequestRepository20.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository25 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository26 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList27 = approvalRequestRepository26.findAll();
        approvalRequestRepository25.saveAll(approvalRequestList27);
        approvalRequestRepository20.saveAll(approvalRequestList27);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList30 = approvalRequestRepository20.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList31 = approvalRequestRepository20.findAll();
        approvalRequestRepository8.saveAll(approvalRequestList31);
        approvalRequestRepository0.saveAll(approvalRequestList31);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList34 = approvalRequestRepository0.findAll();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList5);
        org.junit.Assert.assertNotNull(approvalRequestOptional7);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestList12);
        org.junit.Assert.assertNotNull(approvalRequestList15);
        org.junit.Assert.assertNotNull(approvalRequestList18);
        org.junit.Assert.assertNotNull(approvalRequestList19);
        org.junit.Assert.assertNotNull(approvalRequestList22);
        org.junit.Assert.assertNotNull(approvalRequestList24);
        org.junit.Assert.assertNotNull(approvalRequestList27);
        org.junit.Assert.assertNotNull(approvalRequestList30);
        org.junit.Assert.assertNotNull(approvalRequestList31);
        org.junit.Assert.assertNotNull(approvalRequestList34);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList5 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList6 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository0.findPending();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList5);
        org.junit.Assert.assertNotNull(approvalRequestList6);
        org.junit.Assert.assertNotNull(approvalRequestList7);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository4 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList6 = approvalRequestRepository5.findAll();
        approvalRequestRepository4.saveAll(approvalRequestList6);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository4.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList8);
        java.lang.Class<?> wildcardClass10 = approvalRequestList8.getClass();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList6);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository4 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList6 = approvalRequestRepository5.findAll();
        approvalRequestRepository4.saveAll(approvalRequestList6);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository4.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList8);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList12 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList13 = approvalRequestRepository0.findPending();
        java.lang.Class<?> wildcardClass14 = approvalRequestList13.getClass();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList6);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(approvalRequestList12);
        org.junit.Assert.assertNotNull(approvalRequestList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository4 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList6 = approvalRequestRepository5.findAll();
        approvalRequestRepository4.saveAll(approvalRequestList6);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository4.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList8);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList12 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository13 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository14 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList15 = approvalRequestRepository14.findAll();
        approvalRequestRepository13.saveAll(approvalRequestList15);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList17 = approvalRequestRepository13.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository18 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository19 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList20 = approvalRequestRepository19.findAll();
        approvalRequestRepository18.saveAll(approvalRequestList20);
        approvalRequestRepository13.saveAll(approvalRequestList20);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList23 = approvalRequestRepository13.findPending();
        approvalRequestRepository0.saveAll(approvalRequestList23);
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional26 = approvalRequestRepository0.findById("");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList27 = approvalRequestRepository0.findPending();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList6);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(approvalRequestList12);
        org.junit.Assert.assertNotNull(approvalRequestList15);
        org.junit.Assert.assertNotNull(approvalRequestList17);
        org.junit.Assert.assertNotNull(approvalRequestList20);
        org.junit.Assert.assertNotNull(approvalRequestList23);
        org.junit.Assert.assertNotNull(approvalRequestOptional26);
        org.junit.Assert.assertNotNull(approvalRequestList27);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList5 = approvalRequestRepository0.findPending();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional7 = approvalRequestRepository0.findById("hi!");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository8 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository9 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository9.findAll();
        approvalRequestRepository8.saveAll(approvalRequestList10);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList12 = approvalRequestRepository8.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository13 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository14 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList15 = approvalRequestRepository14.findAll();
        approvalRequestRepository13.saveAll(approvalRequestList15);
        approvalRequestRepository8.saveAll(approvalRequestList15);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList18 = approvalRequestRepository8.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList19 = approvalRequestRepository8.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository20 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository21 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList22 = approvalRequestRepository21.findAll();
        approvalRequestRepository20.saveAll(approvalRequestList22);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList24 = approvalRequestRepository20.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository25 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository26 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList27 = approvalRequestRepository26.findAll();
        approvalRequestRepository25.saveAll(approvalRequestList27);
        approvalRequestRepository20.saveAll(approvalRequestList27);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList30 = approvalRequestRepository20.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList31 = approvalRequestRepository20.findAll();
        approvalRequestRepository8.saveAll(approvalRequestList31);
        approvalRequestRepository0.saveAll(approvalRequestList31);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList34 = approvalRequestRepository0.findPending();
        java.lang.Class<?> wildcardClass35 = approvalRequestList34.getClass();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList5);
        org.junit.Assert.assertNotNull(approvalRequestOptional7);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestList12);
        org.junit.Assert.assertNotNull(approvalRequestList15);
        org.junit.Assert.assertNotNull(approvalRequestList18);
        org.junit.Assert.assertNotNull(approvalRequestList19);
        org.junit.Assert.assertNotNull(approvalRequestList22);
        org.junit.Assert.assertNotNull(approvalRequestList24);
        org.junit.Assert.assertNotNull(approvalRequestList27);
        org.junit.Assert.assertNotNull(approvalRequestList30);
        org.junit.Assert.assertNotNull(approvalRequestList31);
        org.junit.Assert.assertNotNull(approvalRequestList34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository6 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository6.findAll();
        approvalRequestRepository5.saveAll(approvalRequestList7);
        approvalRequestRepository0.saveAll(approvalRequestList7);
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional11 = approvalRequestRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional13 = approvalRequestRepository0.findById("");
        java.lang.Class<?> wildcardClass14 = approvalRequestRepository0.getClass();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestOptional11);
        org.junit.Assert.assertNotNull(approvalRequestOptional13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository4 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList6 = approvalRequestRepository5.findAll();
        approvalRequestRepository4.saveAll(approvalRequestList6);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository4.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList8);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList12 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList13 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList14 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList15 = approvalRequestRepository0.findAll();
        java.lang.Class<?> wildcardClass16 = approvalRequestRepository0.getClass();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList6);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(approvalRequestList12);
        org.junit.Assert.assertNotNull(approvalRequestList13);
        org.junit.Assert.assertNotNull(approvalRequestList14);
        org.junit.Assert.assertNotNull(approvalRequestList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository4 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList6 = approvalRequestRepository5.findAll();
        approvalRequestRepository4.saveAll(approvalRequestList6);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository4.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList8);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList12 = approvalRequestRepository0.findAll();
        java.lang.Class<?> wildcardClass13 = approvalRequestRepository0.getClass();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList6);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(approvalRequestList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository4 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList6 = approvalRequestRepository5.findAll();
        approvalRequestRepository4.saveAll(approvalRequestList6);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository4.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList8);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList12 = approvalRequestRepository0.findAll();
        java.lang.Class<?> wildcardClass13 = approvalRequestRepository0.getClass();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList6);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(approvalRequestList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList1 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList3 = approvalRequestRepository0.findPending();
        org.junit.Assert.assertNotNull(approvalRequestList1);
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList3);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository4 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList6 = approvalRequestRepository5.findAll();
        approvalRequestRepository4.saveAll(approvalRequestList6);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository4.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList8);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList12 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList13 = approvalRequestRepository0.findPending();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional15 = approvalRequestRepository0.findById("");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList16 = approvalRequestRepository0.findPending();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList6);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(approvalRequestList12);
        org.junit.Assert.assertNotNull(approvalRequestList13);
        org.junit.Assert.assertNotNull(approvalRequestOptional15);
        org.junit.Assert.assertNotNull(approvalRequestList16);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository4 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList6 = approvalRequestRepository5.findAll();
        approvalRequestRepository4.saveAll(approvalRequestList6);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository4.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList8);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository0.findPending();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository12 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList13 = approvalRequestRepository12.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList14 = approvalRequestRepository12.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository15 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository16 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList17 = approvalRequestRepository16.findAll();
        approvalRequestRepository15.saveAll(approvalRequestList17);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList19 = approvalRequestRepository15.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList20 = approvalRequestRepository15.findPending();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional22 = approvalRequestRepository15.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList23 = approvalRequestRepository15.findAll();
        approvalRequestRepository12.saveAll(approvalRequestList23);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList25 = approvalRequestRepository12.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList25);
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional28 = approvalRequestRepository0.findById("hi!");
        com.yorku.lab.model.ApprovalRequest approvalRequest29 = null;
        // The following exception was thrown during execution in test generation
        try {
            approvalRequestRepository0.save(approvalRequest29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.ApprovalRequest.getRequestId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList6);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(approvalRequestList13);
        org.junit.Assert.assertNotNull(approvalRequestList14);
        org.junit.Assert.assertNotNull(approvalRequestList17);
        org.junit.Assert.assertNotNull(approvalRequestList19);
        org.junit.Assert.assertNotNull(approvalRequestList20);
        org.junit.Assert.assertNotNull(approvalRequestOptional22);
        org.junit.Assert.assertNotNull(approvalRequestList23);
        org.junit.Assert.assertNotNull(approvalRequestList25);
        org.junit.Assert.assertNotNull(approvalRequestOptional28);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList1 = approvalRequestRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional3 = approvalRequestRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional5 = approvalRequestRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList6 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository7 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository8 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList9 = approvalRequestRepository8.findAll();
        approvalRequestRepository7.saveAll(approvalRequestList9);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository7.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository12 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository13 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList14 = approvalRequestRepository13.findAll();
        approvalRequestRepository12.saveAll(approvalRequestList14);
        approvalRequestRepository7.saveAll(approvalRequestList14);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList17 = approvalRequestRepository7.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList18 = approvalRequestRepository7.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList19 = approvalRequestRepository7.findPending();
        approvalRequestRepository0.saveAll(approvalRequestList19);
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository21 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository22 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList23 = approvalRequestRepository22.findAll();
        approvalRequestRepository21.saveAll(approvalRequestList23);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList25 = approvalRequestRepository21.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList26 = approvalRequestRepository21.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList26);
        org.junit.Assert.assertNotNull(approvalRequestList1);
        org.junit.Assert.assertNotNull(approvalRequestOptional3);
        org.junit.Assert.assertNotNull(approvalRequestOptional5);
        org.junit.Assert.assertNotNull(approvalRequestList6);
        org.junit.Assert.assertNotNull(approvalRequestList9);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(approvalRequestList14);
        org.junit.Assert.assertNotNull(approvalRequestList17);
        org.junit.Assert.assertNotNull(approvalRequestList18);
        org.junit.Assert.assertNotNull(approvalRequestList19);
        org.junit.Assert.assertNotNull(approvalRequestList23);
        org.junit.Assert.assertNotNull(approvalRequestList25);
        org.junit.Assert.assertNotNull(approvalRequestList26);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository4 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList6 = approvalRequestRepository5.findAll();
        approvalRequestRepository4.saveAll(approvalRequestList6);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository4.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList8);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList12 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList13 = approvalRequestRepository0.findAll();
        com.yorku.lab.model.ApprovalRequest approvalRequest14 = null;
        // The following exception was thrown during execution in test generation
        try {
            approvalRequestRepository0.save(approvalRequest14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.ApprovalRequest.getRequestId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList6);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(approvalRequestList12);
        org.junit.Assert.assertNotNull(approvalRequestList13);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository6 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository6.findAll();
        approvalRequestRepository5.saveAll(approvalRequestList7);
        approvalRequestRepository0.saveAll(approvalRequestList7);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findPending();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional12 = approvalRequestRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional14 = approvalRequestRepository0.findById("");
        java.lang.Class<?> wildcardClass15 = approvalRequestOptional14.getClass();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestOptional12);
        org.junit.Assert.assertNotNull(approvalRequestOptional14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository4 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList6 = approvalRequestRepository5.findAll();
        approvalRequestRepository4.saveAll(approvalRequestList6);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository4.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList8);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList12 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository13 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository14 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList15 = approvalRequestRepository14.findAll();
        approvalRequestRepository13.saveAll(approvalRequestList15);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList17 = approvalRequestRepository13.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository18 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository19 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList20 = approvalRequestRepository19.findAll();
        approvalRequestRepository18.saveAll(approvalRequestList20);
        approvalRequestRepository13.saveAll(approvalRequestList20);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList23 = approvalRequestRepository13.findPending();
        approvalRequestRepository0.saveAll(approvalRequestList23);
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional26 = approvalRequestRepository0.findById("hi!");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository27 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository28 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList29 = approvalRequestRepository28.findAll();
        approvalRequestRepository27.saveAll(approvalRequestList29);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList31 = approvalRequestRepository27.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository32 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository33 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList34 = approvalRequestRepository33.findAll();
        approvalRequestRepository32.saveAll(approvalRequestList34);
        approvalRequestRepository27.saveAll(approvalRequestList34);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList37 = approvalRequestRepository27.findPending();
        approvalRequestRepository0.saveAll(approvalRequestList37);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList39 = null;
        // The following exception was thrown during execution in test generation
        try {
            approvalRequestRepository0.saveAll(approvalRequestList39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList6);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(approvalRequestList12);
        org.junit.Assert.assertNotNull(approvalRequestList15);
        org.junit.Assert.assertNotNull(approvalRequestList17);
        org.junit.Assert.assertNotNull(approvalRequestList20);
        org.junit.Assert.assertNotNull(approvalRequestList23);
        org.junit.Assert.assertNotNull(approvalRequestOptional26);
        org.junit.Assert.assertNotNull(approvalRequestList29);
        org.junit.Assert.assertNotNull(approvalRequestList31);
        org.junit.Assert.assertNotNull(approvalRequestList34);
        org.junit.Assert.assertNotNull(approvalRequestList37);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository4 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList6 = approvalRequestRepository5.findAll();
        approvalRequestRepository4.saveAll(approvalRequestList6);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository4.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList8);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList12 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList13 = approvalRequestRepository0.findPending();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional15 = approvalRequestRepository0.findById("");
        java.lang.Class<?> wildcardClass16 = approvalRequestOptional15.getClass();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList6);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(approvalRequestList12);
        org.junit.Assert.assertNotNull(approvalRequestList13);
        org.junit.Assert.assertNotNull(approvalRequestOptional15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList1 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional4 = approvalRequestRepository0.findById("");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList5 = approvalRequestRepository0.findPending();
        com.yorku.lab.model.ApprovalRequest approvalRequest6 = null;
        // The following exception was thrown during execution in test generation
        try {
            approvalRequestRepository0.save(approvalRequest6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.ApprovalRequest.getRequestId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(approvalRequestList1);
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestOptional4);
        org.junit.Assert.assertNotNull(approvalRequestList5);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList1 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository3 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository4 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList5 = approvalRequestRepository4.findAll();
        approvalRequestRepository3.saveAll(approvalRequestList5);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository3.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository3.findPending();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional10 = approvalRequestRepository3.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository3.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList11);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList13 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository14 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository15 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList16 = approvalRequestRepository15.findAll();
        approvalRequestRepository14.saveAll(approvalRequestList16);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList18 = approvalRequestRepository14.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository19 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository20 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList21 = approvalRequestRepository20.findAll();
        approvalRequestRepository19.saveAll(approvalRequestList21);
        approvalRequestRepository14.saveAll(approvalRequestList21);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList24 = approvalRequestRepository14.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList25 = approvalRequestRepository14.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository26 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository27 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList28 = approvalRequestRepository27.findAll();
        approvalRequestRepository26.saveAll(approvalRequestList28);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList30 = approvalRequestRepository26.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository31 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository32 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList33 = approvalRequestRepository32.findAll();
        approvalRequestRepository31.saveAll(approvalRequestList33);
        approvalRequestRepository26.saveAll(approvalRequestList33);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList36 = approvalRequestRepository26.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList37 = approvalRequestRepository26.findAll();
        approvalRequestRepository14.saveAll(approvalRequestList37);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList39 = approvalRequestRepository14.findPending();
        approvalRequestRepository0.saveAll(approvalRequestList39);
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository41 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList42 = approvalRequestRepository41.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList42);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList44 = approvalRequestRepository0.findPending();
        org.junit.Assert.assertNotNull(approvalRequestList1);
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList5);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestOptional10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(approvalRequestList13);
        org.junit.Assert.assertNotNull(approvalRequestList16);
        org.junit.Assert.assertNotNull(approvalRequestList18);
        org.junit.Assert.assertNotNull(approvalRequestList21);
        org.junit.Assert.assertNotNull(approvalRequestList24);
        org.junit.Assert.assertNotNull(approvalRequestList25);
        org.junit.Assert.assertNotNull(approvalRequestList28);
        org.junit.Assert.assertNotNull(approvalRequestList30);
        org.junit.Assert.assertNotNull(approvalRequestList33);
        org.junit.Assert.assertNotNull(approvalRequestList36);
        org.junit.Assert.assertNotNull(approvalRequestList37);
        org.junit.Assert.assertNotNull(approvalRequestList39);
        org.junit.Assert.assertNotNull(approvalRequestList42);
        org.junit.Assert.assertNotNull(approvalRequestList44);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList1 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository3 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository4 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList5 = approvalRequestRepository4.findAll();
        approvalRequestRepository3.saveAll(approvalRequestList5);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository3.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository3.findPending();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional10 = approvalRequestRepository3.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository3.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList11);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList13 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository14 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository15 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList16 = approvalRequestRepository15.findAll();
        approvalRequestRepository14.saveAll(approvalRequestList16);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList18 = approvalRequestRepository14.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository19 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository20 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList21 = approvalRequestRepository20.findAll();
        approvalRequestRepository19.saveAll(approvalRequestList21);
        approvalRequestRepository14.saveAll(approvalRequestList21);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList24 = approvalRequestRepository14.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList25 = approvalRequestRepository14.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository26 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository27 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList28 = approvalRequestRepository27.findAll();
        approvalRequestRepository26.saveAll(approvalRequestList28);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList30 = approvalRequestRepository26.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository31 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository32 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList33 = approvalRequestRepository32.findAll();
        approvalRequestRepository31.saveAll(approvalRequestList33);
        approvalRequestRepository26.saveAll(approvalRequestList33);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList36 = approvalRequestRepository26.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList37 = approvalRequestRepository26.findAll();
        approvalRequestRepository14.saveAll(approvalRequestList37);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList39 = approvalRequestRepository14.findPending();
        approvalRequestRepository0.saveAll(approvalRequestList39);
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional42 = approvalRequestRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList43 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository44 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository45 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList46 = approvalRequestRepository45.findAll();
        approvalRequestRepository44.saveAll(approvalRequestList46);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList48 = approvalRequestRepository44.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList49 = approvalRequestRepository44.findAll();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional51 = approvalRequestRepository44.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList52 = approvalRequestRepository44.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList53 = approvalRequestRepository44.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList53);
        java.lang.Class<?> wildcardClass55 = approvalRequestList53.getClass();
        org.junit.Assert.assertNotNull(approvalRequestList1);
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList5);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestOptional10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(approvalRequestList13);
        org.junit.Assert.assertNotNull(approvalRequestList16);
        org.junit.Assert.assertNotNull(approvalRequestList18);
        org.junit.Assert.assertNotNull(approvalRequestList21);
        org.junit.Assert.assertNotNull(approvalRequestList24);
        org.junit.Assert.assertNotNull(approvalRequestList25);
        org.junit.Assert.assertNotNull(approvalRequestList28);
        org.junit.Assert.assertNotNull(approvalRequestList30);
        org.junit.Assert.assertNotNull(approvalRequestList33);
        org.junit.Assert.assertNotNull(approvalRequestList36);
        org.junit.Assert.assertNotNull(approvalRequestList37);
        org.junit.Assert.assertNotNull(approvalRequestList39);
        org.junit.Assert.assertNotNull(approvalRequestOptional42);
        org.junit.Assert.assertNotNull(approvalRequestList43);
        org.junit.Assert.assertNotNull(approvalRequestList46);
        org.junit.Assert.assertNotNull(approvalRequestList48);
        org.junit.Assert.assertNotNull(approvalRequestList49);
        org.junit.Assert.assertNotNull(approvalRequestOptional51);
        org.junit.Assert.assertNotNull(approvalRequestList52);
        org.junit.Assert.assertNotNull(approvalRequestList53);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList1 = approvalRequestRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional3 = approvalRequestRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional5 = approvalRequestRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList6 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository0.findPending();
        org.junit.Assert.assertNotNull(approvalRequestList1);
        org.junit.Assert.assertNotNull(approvalRequestOptional3);
        org.junit.Assert.assertNotNull(approvalRequestOptional5);
        org.junit.Assert.assertNotNull(approvalRequestList6);
        org.junit.Assert.assertNotNull(approvalRequestList7);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList5 = approvalRequestRepository0.findPending();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional7 = approvalRequestRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional10 = approvalRequestRepository0.findById("");
        com.yorku.lab.model.ApprovalRequest approvalRequest11 = null;
        // The following exception was thrown during execution in test generation
        try {
            approvalRequestRepository0.save(approvalRequest11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.ApprovalRequest.getRequestId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList5);
        org.junit.Assert.assertNotNull(approvalRequestOptional7);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestOptional10);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList1 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository3 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository4 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList5 = approvalRequestRepository4.findAll();
        approvalRequestRepository3.saveAll(approvalRequestList5);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository3.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository3.findPending();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional10 = approvalRequestRepository3.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository3.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList11);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList13 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository14 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository15 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList16 = approvalRequestRepository15.findAll();
        approvalRequestRepository14.saveAll(approvalRequestList16);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList18 = approvalRequestRepository14.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository19 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository20 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList21 = approvalRequestRepository20.findAll();
        approvalRequestRepository19.saveAll(approvalRequestList21);
        approvalRequestRepository14.saveAll(approvalRequestList21);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList24 = approvalRequestRepository14.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList25 = approvalRequestRepository14.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository26 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository27 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList28 = approvalRequestRepository27.findAll();
        approvalRequestRepository26.saveAll(approvalRequestList28);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList30 = approvalRequestRepository26.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository31 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository32 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList33 = approvalRequestRepository32.findAll();
        approvalRequestRepository31.saveAll(approvalRequestList33);
        approvalRequestRepository26.saveAll(approvalRequestList33);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList36 = approvalRequestRepository26.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList37 = approvalRequestRepository26.findAll();
        approvalRequestRepository14.saveAll(approvalRequestList37);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList39 = approvalRequestRepository14.findPending();
        approvalRequestRepository0.saveAll(approvalRequestList39);
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional42 = approvalRequestRepository0.findById("hi!");
        java.lang.Class<?> wildcardClass43 = approvalRequestRepository0.getClass();
        org.junit.Assert.assertNotNull(approvalRequestList1);
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList5);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestOptional10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(approvalRequestList13);
        org.junit.Assert.assertNotNull(approvalRequestList16);
        org.junit.Assert.assertNotNull(approvalRequestList18);
        org.junit.Assert.assertNotNull(approvalRequestList21);
        org.junit.Assert.assertNotNull(approvalRequestList24);
        org.junit.Assert.assertNotNull(approvalRequestList25);
        org.junit.Assert.assertNotNull(approvalRequestList28);
        org.junit.Assert.assertNotNull(approvalRequestList30);
        org.junit.Assert.assertNotNull(approvalRequestList33);
        org.junit.Assert.assertNotNull(approvalRequestList36);
        org.junit.Assert.assertNotNull(approvalRequestList37);
        org.junit.Assert.assertNotNull(approvalRequestList39);
        org.junit.Assert.assertNotNull(approvalRequestOptional42);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository6 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository6.findAll();
        approvalRequestRepository5.saveAll(approvalRequestList7);
        approvalRequestRepository0.saveAll(approvalRequestList7);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList12 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList13 = approvalRequestRepository0.findPending();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(approvalRequestList12);
        org.junit.Assert.assertNotNull(approvalRequestList13);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList5 = approvalRequestRepository0.findPending();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional7 = approvalRequestRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository0.findAll();
        java.lang.Class<?> wildcardClass9 = approvalRequestRepository0.getClass();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList5);
        org.junit.Assert.assertNotNull(approvalRequestOptional7);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList5 = approvalRequestRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional7 = approvalRequestRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList9 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findPending();
        java.lang.Class<?> wildcardClass11 = approvalRequestRepository0.getClass();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList5);
        org.junit.Assert.assertNotNull(approvalRequestOptional7);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestList9);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository6 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository6.findAll();
        approvalRequestRepository5.saveAll(approvalRequestList7);
        approvalRequestRepository0.saveAll(approvalRequestList7);
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional11 = approvalRequestRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList12 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList13 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList14 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList15 = approvalRequestRepository0.findAll();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestOptional11);
        org.junit.Assert.assertNotNull(approvalRequestList12);
        org.junit.Assert.assertNotNull(approvalRequestList13);
        org.junit.Assert.assertNotNull(approvalRequestList14);
        org.junit.Assert.assertNotNull(approvalRequestList15);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository4 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList6 = approvalRequestRepository5.findAll();
        approvalRequestRepository4.saveAll(approvalRequestList6);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository4.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList8);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList12 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository13 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository14 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList15 = approvalRequestRepository14.findAll();
        approvalRequestRepository13.saveAll(approvalRequestList15);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList17 = approvalRequestRepository13.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository18 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository19 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList20 = approvalRequestRepository19.findAll();
        approvalRequestRepository18.saveAll(approvalRequestList20);
        approvalRequestRepository13.saveAll(approvalRequestList20);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList23 = approvalRequestRepository13.findPending();
        approvalRequestRepository0.saveAll(approvalRequestList23);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList25 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList26 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList27 = approvalRequestRepository0.findPending();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList6);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(approvalRequestList12);
        org.junit.Assert.assertNotNull(approvalRequestList15);
        org.junit.Assert.assertNotNull(approvalRequestList17);
        org.junit.Assert.assertNotNull(approvalRequestList20);
        org.junit.Assert.assertNotNull(approvalRequestList23);
        org.junit.Assert.assertNotNull(approvalRequestList25);
        org.junit.Assert.assertNotNull(approvalRequestList26);
        org.junit.Assert.assertNotNull(approvalRequestList27);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository4 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList6 = approvalRequestRepository5.findAll();
        approvalRequestRepository4.saveAll(approvalRequestList6);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository4.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList8);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList12 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository13 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository14 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList15 = approvalRequestRepository14.findAll();
        approvalRequestRepository13.saveAll(approvalRequestList15);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList17 = approvalRequestRepository13.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository18 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository19 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList20 = approvalRequestRepository19.findAll();
        approvalRequestRepository18.saveAll(approvalRequestList20);
        approvalRequestRepository13.saveAll(approvalRequestList20);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList23 = approvalRequestRepository13.findPending();
        approvalRequestRepository0.saveAll(approvalRequestList23);
        com.yorku.lab.model.ApprovalRequest approvalRequest25 = null;
        // The following exception was thrown during execution in test generation
        try {
            approvalRequestRepository0.save(approvalRequest25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.ApprovalRequest.getRequestId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList6);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(approvalRequestList12);
        org.junit.Assert.assertNotNull(approvalRequestList15);
        org.junit.Assert.assertNotNull(approvalRequestList17);
        org.junit.Assert.assertNotNull(approvalRequestList20);
        org.junit.Assert.assertNotNull(approvalRequestList23);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository6 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository6.findAll();
        approvalRequestRepository5.saveAll(approvalRequestList7);
        approvalRequestRepository0.saveAll(approvalRequestList7);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional12 = approvalRequestRepository0.findById("");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList13 = approvalRequestRepository0.findPending();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional15 = approvalRequestRepository0.findById("");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList16 = approvalRequestRepository0.findPending();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestOptional12);
        org.junit.Assert.assertNotNull(approvalRequestList13);
        org.junit.Assert.assertNotNull(approvalRequestOptional15);
        org.junit.Assert.assertNotNull(approvalRequestList16);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository4 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList6 = approvalRequestRepository5.findAll();
        approvalRequestRepository4.saveAll(approvalRequestList6);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository4.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList8);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList12 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList13 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList14 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList15 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList16 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList17 = approvalRequestRepository0.findPending();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList6);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(approvalRequestList12);
        org.junit.Assert.assertNotNull(approvalRequestList13);
        org.junit.Assert.assertNotNull(approvalRequestList14);
        org.junit.Assert.assertNotNull(approvalRequestList15);
        org.junit.Assert.assertNotNull(approvalRequestList16);
        org.junit.Assert.assertNotNull(approvalRequestList17);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository4 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList6 = approvalRequestRepository5.findAll();
        approvalRequestRepository4.saveAll(approvalRequestList6);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository4.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList8);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findPending();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional12 = approvalRequestRepository0.findById("");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList13 = approvalRequestRepository0.findPending();
        com.yorku.lab.model.ApprovalRequest approvalRequest14 = null;
        // The following exception was thrown during execution in test generation
        try {
            approvalRequestRepository0.save(approvalRequest14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.ApprovalRequest.getRequestId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList6);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestOptional12);
        org.junit.Assert.assertNotNull(approvalRequestList13);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository4 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList6 = approvalRequestRepository5.findAll();
        approvalRequestRepository4.saveAll(approvalRequestList6);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository4.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList8);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList12 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList13 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList14 = approvalRequestRepository0.findPending();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional16 = approvalRequestRepository0.findById("");
        java.lang.Class<?> wildcardClass17 = approvalRequestOptional16.getClass();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList6);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(approvalRequestList12);
        org.junit.Assert.assertNotNull(approvalRequestList13);
        org.junit.Assert.assertNotNull(approvalRequestList14);
        org.junit.Assert.assertNotNull(approvalRequestOptional16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository4 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList6 = approvalRequestRepository5.findAll();
        approvalRequestRepository4.saveAll(approvalRequestList6);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository4.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList8);
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional11 = approvalRequestRepository0.findById("hi!");
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList6);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestOptional11);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository4 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList6 = approvalRequestRepository5.findAll();
        approvalRequestRepository4.saveAll(approvalRequestList6);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository4.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList8);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository0.findPending();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository12 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository13 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList14 = approvalRequestRepository13.findAll();
        approvalRequestRepository12.saveAll(approvalRequestList14);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList16 = approvalRequestRepository12.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository17 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository18 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList19 = approvalRequestRepository18.findAll();
        approvalRequestRepository17.saveAll(approvalRequestList19);
        approvalRequestRepository12.saveAll(approvalRequestList19);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList22 = approvalRequestRepository12.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList23 = approvalRequestRepository12.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository24 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository25 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList26 = approvalRequestRepository25.findAll();
        approvalRequestRepository24.saveAll(approvalRequestList26);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList28 = approvalRequestRepository24.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository29 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository30 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList31 = approvalRequestRepository30.findAll();
        approvalRequestRepository29.saveAll(approvalRequestList31);
        approvalRequestRepository24.saveAll(approvalRequestList31);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList34 = approvalRequestRepository24.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList35 = approvalRequestRepository24.findAll();
        approvalRequestRepository12.saveAll(approvalRequestList35);
        approvalRequestRepository0.saveAll(approvalRequestList35);
        com.yorku.lab.model.ApprovalRequest approvalRequest38 = null;
        // The following exception was thrown during execution in test generation
        try {
            approvalRequestRepository0.save(approvalRequest38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.ApprovalRequest.getRequestId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList6);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(approvalRequestList14);
        org.junit.Assert.assertNotNull(approvalRequestList16);
        org.junit.Assert.assertNotNull(approvalRequestList19);
        org.junit.Assert.assertNotNull(approvalRequestList22);
        org.junit.Assert.assertNotNull(approvalRequestList23);
        org.junit.Assert.assertNotNull(approvalRequestList26);
        org.junit.Assert.assertNotNull(approvalRequestList28);
        org.junit.Assert.assertNotNull(approvalRequestList31);
        org.junit.Assert.assertNotNull(approvalRequestList34);
        org.junit.Assert.assertNotNull(approvalRequestList35);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList5 = approvalRequestRepository0.findAll();
        com.yorku.lab.model.ApprovalRequest approvalRequest6 = null;
        // The following exception was thrown during execution in test generation
        try {
            approvalRequestRepository0.save(approvalRequest6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.ApprovalRequest.getRequestId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList5);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository4 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList6 = approvalRequestRepository5.findAll();
        approvalRequestRepository4.saveAll(approvalRequestList6);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository4.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList8);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository0.findPending();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository12 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository13 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList14 = approvalRequestRepository13.findAll();
        approvalRequestRepository12.saveAll(approvalRequestList14);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList16 = approvalRequestRepository12.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository17 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository18 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList19 = approvalRequestRepository18.findAll();
        approvalRequestRepository17.saveAll(approvalRequestList19);
        approvalRequestRepository12.saveAll(approvalRequestList19);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList22 = approvalRequestRepository12.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList23 = approvalRequestRepository12.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository24 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository25 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList26 = approvalRequestRepository25.findAll();
        approvalRequestRepository24.saveAll(approvalRequestList26);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList28 = approvalRequestRepository24.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository29 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository30 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList31 = approvalRequestRepository30.findAll();
        approvalRequestRepository29.saveAll(approvalRequestList31);
        approvalRequestRepository24.saveAll(approvalRequestList31);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList34 = approvalRequestRepository24.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList35 = approvalRequestRepository24.findAll();
        approvalRequestRepository12.saveAll(approvalRequestList35);
        approvalRequestRepository0.saveAll(approvalRequestList35);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList38 = null;
        // The following exception was thrown during execution in test generation
        try {
            approvalRequestRepository0.saveAll(approvalRequestList38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList6);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(approvalRequestList14);
        org.junit.Assert.assertNotNull(approvalRequestList16);
        org.junit.Assert.assertNotNull(approvalRequestList19);
        org.junit.Assert.assertNotNull(approvalRequestList22);
        org.junit.Assert.assertNotNull(approvalRequestList23);
        org.junit.Assert.assertNotNull(approvalRequestList26);
        org.junit.Assert.assertNotNull(approvalRequestList28);
        org.junit.Assert.assertNotNull(approvalRequestList31);
        org.junit.Assert.assertNotNull(approvalRequestList34);
        org.junit.Assert.assertNotNull(approvalRequestList35);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository6 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository6.findAll();
        approvalRequestRepository5.saveAll(approvalRequestList7);
        approvalRequestRepository0.saveAll(approvalRequestList7);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository12 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository13 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList14 = approvalRequestRepository13.findAll();
        approvalRequestRepository12.saveAll(approvalRequestList14);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList16 = approvalRequestRepository12.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository17 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository18 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList19 = approvalRequestRepository18.findAll();
        approvalRequestRepository17.saveAll(approvalRequestList19);
        approvalRequestRepository12.saveAll(approvalRequestList19);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList22 = approvalRequestRepository12.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList23 = approvalRequestRepository12.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList23);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList25 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList26 = approvalRequestRepository0.findAll();
        java.lang.Class<?> wildcardClass27 = approvalRequestList26.getClass();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(approvalRequestList14);
        org.junit.Assert.assertNotNull(approvalRequestList16);
        org.junit.Assert.assertNotNull(approvalRequestList19);
        org.junit.Assert.assertNotNull(approvalRequestList22);
        org.junit.Assert.assertNotNull(approvalRequestList23);
        org.junit.Assert.assertNotNull(approvalRequestList25);
        org.junit.Assert.assertNotNull(approvalRequestList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository4 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList6 = approvalRequestRepository5.findAll();
        approvalRequestRepository4.saveAll(approvalRequestList6);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository4.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList8);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList12 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList13 = approvalRequestRepository0.findPending();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional15 = approvalRequestRepository0.findById("");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository16 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository17 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList18 = approvalRequestRepository17.findAll();
        approvalRequestRepository16.saveAll(approvalRequestList18);
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository20 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository21 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList22 = approvalRequestRepository21.findAll();
        approvalRequestRepository20.saveAll(approvalRequestList22);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList24 = approvalRequestRepository20.findAll();
        approvalRequestRepository16.saveAll(approvalRequestList24);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList26 = approvalRequestRepository16.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList27 = approvalRequestRepository16.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList28 = approvalRequestRepository16.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList29 = approvalRequestRepository16.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList29);
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList6);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(approvalRequestList12);
        org.junit.Assert.assertNotNull(approvalRequestList13);
        org.junit.Assert.assertNotNull(approvalRequestOptional15);
        org.junit.Assert.assertNotNull(approvalRequestList18);
        org.junit.Assert.assertNotNull(approvalRequestList22);
        org.junit.Assert.assertNotNull(approvalRequestList24);
        org.junit.Assert.assertNotNull(approvalRequestList26);
        org.junit.Assert.assertNotNull(approvalRequestList27);
        org.junit.Assert.assertNotNull(approvalRequestList28);
        org.junit.Assert.assertNotNull(approvalRequestList29);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository4 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList6 = approvalRequestRepository5.findAll();
        approvalRequestRepository4.saveAll(approvalRequestList6);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository4.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList8);
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional11 = approvalRequestRepository0.findById("");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList12 = approvalRequestRepository0.findPending();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList6);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestOptional11);
        org.junit.Assert.assertNotNull(approvalRequestList12);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList5 = approvalRequestRepository0.findPending();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional7 = approvalRequestRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList9 = approvalRequestRepository0.findAll();
        java.lang.Class<?> wildcardClass10 = approvalRequestRepository0.getClass();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList5);
        org.junit.Assert.assertNotNull(approvalRequestOptional7);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository6 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository6.findAll();
        approvalRequestRepository5.saveAll(approvalRequestList7);
        approvalRequestRepository0.saveAll(approvalRequestList7);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findPending();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional12 = approvalRequestRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional14 = approvalRequestRepository0.findById("");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList15 = approvalRequestRepository0.findPending();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestOptional12);
        org.junit.Assert.assertNotNull(approvalRequestOptional14);
        org.junit.Assert.assertNotNull(approvalRequestList15);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository4 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList6 = approvalRequestRepository5.findAll();
        approvalRequestRepository4.saveAll(approvalRequestList6);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository4.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList8);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList12 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList13 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList14 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList15 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList16 = approvalRequestRepository0.findPending();
        java.lang.Class<?> wildcardClass17 = approvalRequestRepository0.getClass();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList6);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(approvalRequestList12);
        org.junit.Assert.assertNotNull(approvalRequestList13);
        org.junit.Assert.assertNotNull(approvalRequestList14);
        org.junit.Assert.assertNotNull(approvalRequestList15);
        org.junit.Assert.assertNotNull(approvalRequestList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository4 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList6 = approvalRequestRepository5.findAll();
        approvalRequestRepository4.saveAll(approvalRequestList6);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository4.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList8);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList12 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository13 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository14 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList15 = approvalRequestRepository14.findAll();
        approvalRequestRepository13.saveAll(approvalRequestList15);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList17 = approvalRequestRepository13.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository18 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository19 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList20 = approvalRequestRepository19.findAll();
        approvalRequestRepository18.saveAll(approvalRequestList20);
        approvalRequestRepository13.saveAll(approvalRequestList20);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList23 = approvalRequestRepository13.findPending();
        approvalRequestRepository0.saveAll(approvalRequestList23);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList25 = approvalRequestRepository0.findAll();
        com.yorku.lab.model.ApprovalRequest approvalRequest26 = null;
        // The following exception was thrown during execution in test generation
        try {
            approvalRequestRepository0.save(approvalRequest26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.ApprovalRequest.getRequestId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList6);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(approvalRequestList12);
        org.junit.Assert.assertNotNull(approvalRequestList15);
        org.junit.Assert.assertNotNull(approvalRequestList17);
        org.junit.Assert.assertNotNull(approvalRequestList20);
        org.junit.Assert.assertNotNull(approvalRequestList23);
        org.junit.Assert.assertNotNull(approvalRequestList25);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList5 = approvalRequestRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional7 = approvalRequestRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList9 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findPending();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional12 = approvalRequestRepository0.findById("hi!");
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList5);
        org.junit.Assert.assertNotNull(approvalRequestOptional7);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestList9);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestOptional12);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList5 = approvalRequestRepository0.findPending();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional7 = approvalRequestRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional10 = approvalRequestRepository0.findById("");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository11 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository12 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList13 = approvalRequestRepository12.findAll();
        approvalRequestRepository11.saveAll(approvalRequestList13);
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository15 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository16 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList17 = approvalRequestRepository16.findAll();
        approvalRequestRepository15.saveAll(approvalRequestList17);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList19 = approvalRequestRepository15.findAll();
        approvalRequestRepository11.saveAll(approvalRequestList19);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList21 = approvalRequestRepository11.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList22 = approvalRequestRepository11.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList22);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList24 = approvalRequestRepository0.findPending();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList5);
        org.junit.Assert.assertNotNull(approvalRequestOptional7);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestOptional10);
        org.junit.Assert.assertNotNull(approvalRequestList13);
        org.junit.Assert.assertNotNull(approvalRequestList17);
        org.junit.Assert.assertNotNull(approvalRequestList19);
        org.junit.Assert.assertNotNull(approvalRequestList21);
        org.junit.Assert.assertNotNull(approvalRequestList22);
        org.junit.Assert.assertNotNull(approvalRequestList24);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository6 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository6.findAll();
        approvalRequestRepository5.saveAll(approvalRequestList7);
        approvalRequestRepository0.saveAll(approvalRequestList7);
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional11 = approvalRequestRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional13 = approvalRequestRepository0.findById("");
        com.yorku.lab.model.ApprovalRequest approvalRequest14 = null;
        // The following exception was thrown during execution in test generation
        try {
            approvalRequestRepository0.save(approvalRequest14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.ApprovalRequest.getRequestId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestOptional11);
        org.junit.Assert.assertNotNull(approvalRequestOptional13);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList1 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository3 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository4 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList5 = approvalRequestRepository4.findAll();
        approvalRequestRepository3.saveAll(approvalRequestList5);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository3.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository3.findPending();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional10 = approvalRequestRepository3.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository3.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList11);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList13 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository14 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository15 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList16 = approvalRequestRepository15.findAll();
        approvalRequestRepository14.saveAll(approvalRequestList16);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList18 = approvalRequestRepository14.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository19 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository20 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList21 = approvalRequestRepository20.findAll();
        approvalRequestRepository19.saveAll(approvalRequestList21);
        approvalRequestRepository14.saveAll(approvalRequestList21);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList24 = approvalRequestRepository14.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList25 = approvalRequestRepository14.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository26 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository27 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList28 = approvalRequestRepository27.findAll();
        approvalRequestRepository26.saveAll(approvalRequestList28);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList30 = approvalRequestRepository26.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository31 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository32 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList33 = approvalRequestRepository32.findAll();
        approvalRequestRepository31.saveAll(approvalRequestList33);
        approvalRequestRepository26.saveAll(approvalRequestList33);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList36 = approvalRequestRepository26.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList37 = approvalRequestRepository26.findAll();
        approvalRequestRepository14.saveAll(approvalRequestList37);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList39 = approvalRequestRepository14.findPending();
        approvalRequestRepository0.saveAll(approvalRequestList39);
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository41 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList42 = approvalRequestRepository41.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList42);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList44 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList45 = approvalRequestRepository0.findPending();
        com.yorku.lab.model.ApprovalRequest approvalRequest46 = null;
        // The following exception was thrown during execution in test generation
        try {
            approvalRequestRepository0.save(approvalRequest46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.ApprovalRequest.getRequestId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(approvalRequestList1);
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList5);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestOptional10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(approvalRequestList13);
        org.junit.Assert.assertNotNull(approvalRequestList16);
        org.junit.Assert.assertNotNull(approvalRequestList18);
        org.junit.Assert.assertNotNull(approvalRequestList21);
        org.junit.Assert.assertNotNull(approvalRequestList24);
        org.junit.Assert.assertNotNull(approvalRequestList25);
        org.junit.Assert.assertNotNull(approvalRequestList28);
        org.junit.Assert.assertNotNull(approvalRequestList30);
        org.junit.Assert.assertNotNull(approvalRequestList33);
        org.junit.Assert.assertNotNull(approvalRequestList36);
        org.junit.Assert.assertNotNull(approvalRequestList37);
        org.junit.Assert.assertNotNull(approvalRequestList39);
        org.junit.Assert.assertNotNull(approvalRequestList42);
        org.junit.Assert.assertNotNull(approvalRequestList44);
        org.junit.Assert.assertNotNull(approvalRequestList45);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList1 = approvalRequestRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional3 = approvalRequestRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional5 = approvalRequestRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList6 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository7 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository8 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList9 = approvalRequestRepository8.findAll();
        approvalRequestRepository7.saveAll(approvalRequestList9);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository7.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository12 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository13 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList14 = approvalRequestRepository13.findAll();
        approvalRequestRepository12.saveAll(approvalRequestList14);
        approvalRequestRepository7.saveAll(approvalRequestList14);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList17 = approvalRequestRepository7.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList18 = approvalRequestRepository7.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList19 = approvalRequestRepository7.findPending();
        approvalRequestRepository0.saveAll(approvalRequestList19);
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional22 = approvalRequestRepository0.findById("");
        org.junit.Assert.assertNotNull(approvalRequestList1);
        org.junit.Assert.assertNotNull(approvalRequestOptional3);
        org.junit.Assert.assertNotNull(approvalRequestOptional5);
        org.junit.Assert.assertNotNull(approvalRequestList6);
        org.junit.Assert.assertNotNull(approvalRequestList9);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(approvalRequestList14);
        org.junit.Assert.assertNotNull(approvalRequestList17);
        org.junit.Assert.assertNotNull(approvalRequestList18);
        org.junit.Assert.assertNotNull(approvalRequestList19);
        org.junit.Assert.assertNotNull(approvalRequestOptional22);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository4 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList6 = approvalRequestRepository5.findAll();
        approvalRequestRepository4.saveAll(approvalRequestList6);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository4.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList8);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList12 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository13 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository14 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList15 = approvalRequestRepository14.findAll();
        approvalRequestRepository13.saveAll(approvalRequestList15);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList17 = approvalRequestRepository13.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository18 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository19 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList20 = approvalRequestRepository19.findAll();
        approvalRequestRepository18.saveAll(approvalRequestList20);
        approvalRequestRepository13.saveAll(approvalRequestList20);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList23 = approvalRequestRepository13.findPending();
        approvalRequestRepository0.saveAll(approvalRequestList23);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList25 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList26 = approvalRequestRepository0.findPending();
        java.lang.Class<?> wildcardClass27 = approvalRequestRepository0.getClass();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList6);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(approvalRequestList12);
        org.junit.Assert.assertNotNull(approvalRequestList15);
        org.junit.Assert.assertNotNull(approvalRequestList17);
        org.junit.Assert.assertNotNull(approvalRequestList20);
        org.junit.Assert.assertNotNull(approvalRequestList23);
        org.junit.Assert.assertNotNull(approvalRequestList25);
        org.junit.Assert.assertNotNull(approvalRequestList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList5 = approvalRequestRepository0.findPending();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional7 = approvalRequestRepository0.findById("hi!");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository8 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository9 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository9.findAll();
        approvalRequestRepository8.saveAll(approvalRequestList10);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList12 = approvalRequestRepository8.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository13 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository14 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList15 = approvalRequestRepository14.findAll();
        approvalRequestRepository13.saveAll(approvalRequestList15);
        approvalRequestRepository8.saveAll(approvalRequestList15);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList18 = approvalRequestRepository8.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList19 = approvalRequestRepository8.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository20 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository21 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList22 = approvalRequestRepository21.findAll();
        approvalRequestRepository20.saveAll(approvalRequestList22);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList24 = approvalRequestRepository20.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository25 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository26 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList27 = approvalRequestRepository26.findAll();
        approvalRequestRepository25.saveAll(approvalRequestList27);
        approvalRequestRepository20.saveAll(approvalRequestList27);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList30 = approvalRequestRepository20.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList31 = approvalRequestRepository20.findAll();
        approvalRequestRepository8.saveAll(approvalRequestList31);
        approvalRequestRepository0.saveAll(approvalRequestList31);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList34 = approvalRequestRepository0.findPending();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional36 = approvalRequestRepository0.findById("");
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList5);
        org.junit.Assert.assertNotNull(approvalRequestOptional7);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestList12);
        org.junit.Assert.assertNotNull(approvalRequestList15);
        org.junit.Assert.assertNotNull(approvalRequestList18);
        org.junit.Assert.assertNotNull(approvalRequestList19);
        org.junit.Assert.assertNotNull(approvalRequestList22);
        org.junit.Assert.assertNotNull(approvalRequestList24);
        org.junit.Assert.assertNotNull(approvalRequestList27);
        org.junit.Assert.assertNotNull(approvalRequestList30);
        org.junit.Assert.assertNotNull(approvalRequestList31);
        org.junit.Assert.assertNotNull(approvalRequestList34);
        org.junit.Assert.assertNotNull(approvalRequestOptional36);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList1 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository3 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository4 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList5 = approvalRequestRepository4.findAll();
        approvalRequestRepository3.saveAll(approvalRequestList5);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository3.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository3.findPending();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional10 = approvalRequestRepository3.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository3.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList11);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList13 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository14 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository15 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList16 = approvalRequestRepository15.findAll();
        approvalRequestRepository14.saveAll(approvalRequestList16);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList18 = approvalRequestRepository14.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository19 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository20 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList21 = approvalRequestRepository20.findAll();
        approvalRequestRepository19.saveAll(approvalRequestList21);
        approvalRequestRepository14.saveAll(approvalRequestList21);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList24 = approvalRequestRepository14.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList25 = approvalRequestRepository14.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository26 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository27 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList28 = approvalRequestRepository27.findAll();
        approvalRequestRepository26.saveAll(approvalRequestList28);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList30 = approvalRequestRepository26.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository31 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository32 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList33 = approvalRequestRepository32.findAll();
        approvalRequestRepository31.saveAll(approvalRequestList33);
        approvalRequestRepository26.saveAll(approvalRequestList33);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList36 = approvalRequestRepository26.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList37 = approvalRequestRepository26.findAll();
        approvalRequestRepository14.saveAll(approvalRequestList37);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList39 = approvalRequestRepository14.findPending();
        approvalRequestRepository0.saveAll(approvalRequestList39);
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository41 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList42 = approvalRequestRepository41.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList42);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList44 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository45 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository46 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList47 = approvalRequestRepository46.findAll();
        approvalRequestRepository45.saveAll(approvalRequestList47);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList49 = approvalRequestRepository45.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository50 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository51 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList52 = approvalRequestRepository51.findAll();
        approvalRequestRepository50.saveAll(approvalRequestList52);
        approvalRequestRepository45.saveAll(approvalRequestList52);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList55 = approvalRequestRepository45.findAll();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional57 = approvalRequestRepository45.findById("");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList58 = approvalRequestRepository45.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList59 = approvalRequestRepository45.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList59);
        org.junit.Assert.assertNotNull(approvalRequestList1);
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList5);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestOptional10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(approvalRequestList13);
        org.junit.Assert.assertNotNull(approvalRequestList16);
        org.junit.Assert.assertNotNull(approvalRequestList18);
        org.junit.Assert.assertNotNull(approvalRequestList21);
        org.junit.Assert.assertNotNull(approvalRequestList24);
        org.junit.Assert.assertNotNull(approvalRequestList25);
        org.junit.Assert.assertNotNull(approvalRequestList28);
        org.junit.Assert.assertNotNull(approvalRequestList30);
        org.junit.Assert.assertNotNull(approvalRequestList33);
        org.junit.Assert.assertNotNull(approvalRequestList36);
        org.junit.Assert.assertNotNull(approvalRequestList37);
        org.junit.Assert.assertNotNull(approvalRequestList39);
        org.junit.Assert.assertNotNull(approvalRequestList42);
        org.junit.Assert.assertNotNull(approvalRequestList44);
        org.junit.Assert.assertNotNull(approvalRequestList47);
        org.junit.Assert.assertNotNull(approvalRequestList49);
        org.junit.Assert.assertNotNull(approvalRequestList52);
        org.junit.Assert.assertNotNull(approvalRequestList55);
        org.junit.Assert.assertNotNull(approvalRequestOptional57);
        org.junit.Assert.assertNotNull(approvalRequestList58);
        org.junit.Assert.assertNotNull(approvalRequestList59);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository4 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList6 = approvalRequestRepository5.findAll();
        approvalRequestRepository4.saveAll(approvalRequestList6);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository4.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList8);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList12 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList13 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList14 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList15 = approvalRequestRepository0.findAll();
        java.lang.Class<?> wildcardClass16 = approvalRequestList15.getClass();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList6);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(approvalRequestList12);
        org.junit.Assert.assertNotNull(approvalRequestList13);
        org.junit.Assert.assertNotNull(approvalRequestList14);
        org.junit.Assert.assertNotNull(approvalRequestList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository4 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList6 = approvalRequestRepository5.findAll();
        approvalRequestRepository4.saveAll(approvalRequestList6);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository4.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList8);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList12 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList13 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList14 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList15 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList16 = approvalRequestRepository0.findAll();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList6);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(approvalRequestList12);
        org.junit.Assert.assertNotNull(approvalRequestList13);
        org.junit.Assert.assertNotNull(approvalRequestList14);
        org.junit.Assert.assertNotNull(approvalRequestList15);
        org.junit.Assert.assertNotNull(approvalRequestList16);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList1 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository3 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository4 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList5 = approvalRequestRepository4.findAll();
        approvalRequestRepository3.saveAll(approvalRequestList5);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository3.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository3.findPending();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional10 = approvalRequestRepository3.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository3.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList11);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList13 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository14 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository15 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList16 = approvalRequestRepository15.findAll();
        approvalRequestRepository14.saveAll(approvalRequestList16);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList18 = approvalRequestRepository14.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository19 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository20 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList21 = approvalRequestRepository20.findAll();
        approvalRequestRepository19.saveAll(approvalRequestList21);
        approvalRequestRepository14.saveAll(approvalRequestList21);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList24 = approvalRequestRepository14.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList25 = approvalRequestRepository14.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository26 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository27 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList28 = approvalRequestRepository27.findAll();
        approvalRequestRepository26.saveAll(approvalRequestList28);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList30 = approvalRequestRepository26.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository31 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository32 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList33 = approvalRequestRepository32.findAll();
        approvalRequestRepository31.saveAll(approvalRequestList33);
        approvalRequestRepository26.saveAll(approvalRequestList33);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList36 = approvalRequestRepository26.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList37 = approvalRequestRepository26.findAll();
        approvalRequestRepository14.saveAll(approvalRequestList37);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList39 = approvalRequestRepository14.findPending();
        approvalRequestRepository0.saveAll(approvalRequestList39);
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional42 = approvalRequestRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList43 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository44 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository45 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList46 = approvalRequestRepository45.findAll();
        approvalRequestRepository44.saveAll(approvalRequestList46);
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository48 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository49 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList50 = approvalRequestRepository49.findAll();
        approvalRequestRepository48.saveAll(approvalRequestList50);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList52 = approvalRequestRepository48.findAll();
        approvalRequestRepository44.saveAll(approvalRequestList52);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList54 = approvalRequestRepository44.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList55 = approvalRequestRepository44.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList56 = approvalRequestRepository44.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList57 = approvalRequestRepository44.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList57);
        java.lang.Class<?> wildcardClass59 = approvalRequestRepository0.getClass();
        org.junit.Assert.assertNotNull(approvalRequestList1);
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList5);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestOptional10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(approvalRequestList13);
        org.junit.Assert.assertNotNull(approvalRequestList16);
        org.junit.Assert.assertNotNull(approvalRequestList18);
        org.junit.Assert.assertNotNull(approvalRequestList21);
        org.junit.Assert.assertNotNull(approvalRequestList24);
        org.junit.Assert.assertNotNull(approvalRequestList25);
        org.junit.Assert.assertNotNull(approvalRequestList28);
        org.junit.Assert.assertNotNull(approvalRequestList30);
        org.junit.Assert.assertNotNull(approvalRequestList33);
        org.junit.Assert.assertNotNull(approvalRequestList36);
        org.junit.Assert.assertNotNull(approvalRequestList37);
        org.junit.Assert.assertNotNull(approvalRequestList39);
        org.junit.Assert.assertNotNull(approvalRequestOptional42);
        org.junit.Assert.assertNotNull(approvalRequestList43);
        org.junit.Assert.assertNotNull(approvalRequestList46);
        org.junit.Assert.assertNotNull(approvalRequestList50);
        org.junit.Assert.assertNotNull(approvalRequestList52);
        org.junit.Assert.assertNotNull(approvalRequestList54);
        org.junit.Assert.assertNotNull(approvalRequestList55);
        org.junit.Assert.assertNotNull(approvalRequestList56);
        org.junit.Assert.assertNotNull(approvalRequestList57);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository4 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList6 = approvalRequestRepository5.findAll();
        approvalRequestRepository4.saveAll(approvalRequestList6);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository4.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList8);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList12 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository13 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository14 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList15 = approvalRequestRepository14.findAll();
        approvalRequestRepository13.saveAll(approvalRequestList15);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList17 = approvalRequestRepository13.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository18 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository19 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList20 = approvalRequestRepository19.findAll();
        approvalRequestRepository18.saveAll(approvalRequestList20);
        approvalRequestRepository13.saveAll(approvalRequestList20);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList23 = approvalRequestRepository13.findPending();
        approvalRequestRepository0.saveAll(approvalRequestList23);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList25 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList26 = approvalRequestRepository0.findAll();
        java.lang.Class<?> wildcardClass27 = approvalRequestRepository0.getClass();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList6);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(approvalRequestList12);
        org.junit.Assert.assertNotNull(approvalRequestList15);
        org.junit.Assert.assertNotNull(approvalRequestList17);
        org.junit.Assert.assertNotNull(approvalRequestList20);
        org.junit.Assert.assertNotNull(approvalRequestList23);
        org.junit.Assert.assertNotNull(approvalRequestList25);
        org.junit.Assert.assertNotNull(approvalRequestList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository4 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList6 = approvalRequestRepository5.findAll();
        approvalRequestRepository4.saveAll(approvalRequestList6);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository4.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList8);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList12 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList13 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList14 = approvalRequestRepository0.findPending();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional16 = approvalRequestRepository0.findById("");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList17 = approvalRequestRepository0.findAll();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList6);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(approvalRequestList12);
        org.junit.Assert.assertNotNull(approvalRequestList13);
        org.junit.Assert.assertNotNull(approvalRequestList14);
        org.junit.Assert.assertNotNull(approvalRequestOptional16);
        org.junit.Assert.assertNotNull(approvalRequestList17);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList1 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository3 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository4 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList5 = approvalRequestRepository4.findAll();
        approvalRequestRepository3.saveAll(approvalRequestList5);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository3.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository3.findPending();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional10 = approvalRequestRepository3.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository3.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList11);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList13 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository14 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository15 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList16 = approvalRequestRepository15.findAll();
        approvalRequestRepository14.saveAll(approvalRequestList16);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList18 = approvalRequestRepository14.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository19 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository20 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList21 = approvalRequestRepository20.findAll();
        approvalRequestRepository19.saveAll(approvalRequestList21);
        approvalRequestRepository14.saveAll(approvalRequestList21);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList24 = approvalRequestRepository14.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList25 = approvalRequestRepository14.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository26 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository27 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList28 = approvalRequestRepository27.findAll();
        approvalRequestRepository26.saveAll(approvalRequestList28);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList30 = approvalRequestRepository26.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository31 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository32 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList33 = approvalRequestRepository32.findAll();
        approvalRequestRepository31.saveAll(approvalRequestList33);
        approvalRequestRepository26.saveAll(approvalRequestList33);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList36 = approvalRequestRepository26.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList37 = approvalRequestRepository26.findAll();
        approvalRequestRepository14.saveAll(approvalRequestList37);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList39 = approvalRequestRepository14.findPending();
        approvalRequestRepository0.saveAll(approvalRequestList39);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList41 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList42 = approvalRequestRepository0.findPending();
        org.junit.Assert.assertNotNull(approvalRequestList1);
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList5);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestOptional10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(approvalRequestList13);
        org.junit.Assert.assertNotNull(approvalRequestList16);
        org.junit.Assert.assertNotNull(approvalRequestList18);
        org.junit.Assert.assertNotNull(approvalRequestList21);
        org.junit.Assert.assertNotNull(approvalRequestList24);
        org.junit.Assert.assertNotNull(approvalRequestList25);
        org.junit.Assert.assertNotNull(approvalRequestList28);
        org.junit.Assert.assertNotNull(approvalRequestList30);
        org.junit.Assert.assertNotNull(approvalRequestList33);
        org.junit.Assert.assertNotNull(approvalRequestList36);
        org.junit.Assert.assertNotNull(approvalRequestList37);
        org.junit.Assert.assertNotNull(approvalRequestList39);
        org.junit.Assert.assertNotNull(approvalRequestList41);
        org.junit.Assert.assertNotNull(approvalRequestList42);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository4 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList6 = approvalRequestRepository5.findAll();
        approvalRequestRepository4.saveAll(approvalRequestList6);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository4.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList8);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList12 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository13 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository14 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList15 = approvalRequestRepository14.findAll();
        approvalRequestRepository13.saveAll(approvalRequestList15);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList17 = approvalRequestRepository13.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository18 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository19 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList20 = approvalRequestRepository19.findAll();
        approvalRequestRepository18.saveAll(approvalRequestList20);
        approvalRequestRepository13.saveAll(approvalRequestList20);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList23 = approvalRequestRepository13.findPending();
        approvalRequestRepository0.saveAll(approvalRequestList23);
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional26 = approvalRequestRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList27 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList28 = approvalRequestRepository0.findAll();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList6);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(approvalRequestList12);
        org.junit.Assert.assertNotNull(approvalRequestList15);
        org.junit.Assert.assertNotNull(approvalRequestList17);
        org.junit.Assert.assertNotNull(approvalRequestList20);
        org.junit.Assert.assertNotNull(approvalRequestList23);
        org.junit.Assert.assertNotNull(approvalRequestOptional26);
        org.junit.Assert.assertNotNull(approvalRequestList27);
        org.junit.Assert.assertNotNull(approvalRequestList28);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository4 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList6 = approvalRequestRepository5.findAll();
        approvalRequestRepository4.saveAll(approvalRequestList6);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository4.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList8);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList12 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList13 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList14 = approvalRequestRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional16 = approvalRequestRepository0.findById("");
        java.lang.Class<?> wildcardClass17 = approvalRequestOptional16.getClass();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList6);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(approvalRequestList12);
        org.junit.Assert.assertNotNull(approvalRequestList13);
        org.junit.Assert.assertNotNull(approvalRequestList14);
        org.junit.Assert.assertNotNull(approvalRequestOptional16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList1 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository3 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository4 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList5 = approvalRequestRepository4.findAll();
        approvalRequestRepository3.saveAll(approvalRequestList5);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository3.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository3.findPending();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional10 = approvalRequestRepository3.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository3.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList11);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList13 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository14 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository15 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList16 = approvalRequestRepository15.findAll();
        approvalRequestRepository14.saveAll(approvalRequestList16);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList18 = approvalRequestRepository14.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository19 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository20 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList21 = approvalRequestRepository20.findAll();
        approvalRequestRepository19.saveAll(approvalRequestList21);
        approvalRequestRepository14.saveAll(approvalRequestList21);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList24 = approvalRequestRepository14.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList25 = approvalRequestRepository14.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository26 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository27 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList28 = approvalRequestRepository27.findAll();
        approvalRequestRepository26.saveAll(approvalRequestList28);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList30 = approvalRequestRepository26.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository31 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository32 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList33 = approvalRequestRepository32.findAll();
        approvalRequestRepository31.saveAll(approvalRequestList33);
        approvalRequestRepository26.saveAll(approvalRequestList33);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList36 = approvalRequestRepository26.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList37 = approvalRequestRepository26.findAll();
        approvalRequestRepository14.saveAll(approvalRequestList37);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList39 = approvalRequestRepository14.findPending();
        approvalRequestRepository0.saveAll(approvalRequestList39);
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional42 = approvalRequestRepository0.findById("");
        java.lang.Class<?> wildcardClass43 = approvalRequestOptional42.getClass();
        org.junit.Assert.assertNotNull(approvalRequestList1);
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList5);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestOptional10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(approvalRequestList13);
        org.junit.Assert.assertNotNull(approvalRequestList16);
        org.junit.Assert.assertNotNull(approvalRequestList18);
        org.junit.Assert.assertNotNull(approvalRequestList21);
        org.junit.Assert.assertNotNull(approvalRequestList24);
        org.junit.Assert.assertNotNull(approvalRequestList25);
        org.junit.Assert.assertNotNull(approvalRequestList28);
        org.junit.Assert.assertNotNull(approvalRequestList30);
        org.junit.Assert.assertNotNull(approvalRequestList33);
        org.junit.Assert.assertNotNull(approvalRequestList36);
        org.junit.Assert.assertNotNull(approvalRequestList37);
        org.junit.Assert.assertNotNull(approvalRequestList39);
        org.junit.Assert.assertNotNull(approvalRequestOptional42);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository6 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository6.findAll();
        approvalRequestRepository5.saveAll(approvalRequestList7);
        approvalRequestRepository0.saveAll(approvalRequestList7);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional12 = approvalRequestRepository0.findById("hi!");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository13 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository14 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList15 = approvalRequestRepository14.findAll();
        approvalRequestRepository13.saveAll(approvalRequestList15);
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository17 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository18 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList19 = approvalRequestRepository18.findAll();
        approvalRequestRepository17.saveAll(approvalRequestList19);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList21 = approvalRequestRepository17.findAll();
        approvalRequestRepository13.saveAll(approvalRequestList21);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList23 = approvalRequestRepository13.findPending();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional25 = approvalRequestRepository13.findById("");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList26 = approvalRequestRepository13.findPending();
        approvalRequestRepository0.saveAll(approvalRequestList26);
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestOptional12);
        org.junit.Assert.assertNotNull(approvalRequestList15);
        org.junit.Assert.assertNotNull(approvalRequestList19);
        org.junit.Assert.assertNotNull(approvalRequestList21);
        org.junit.Assert.assertNotNull(approvalRequestList23);
        org.junit.Assert.assertNotNull(approvalRequestOptional25);
        org.junit.Assert.assertNotNull(approvalRequestList26);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository6 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository6.findAll();
        approvalRequestRepository5.saveAll(approvalRequestList7);
        approvalRequestRepository0.saveAll(approvalRequestList7);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional12 = approvalRequestRepository0.findById("");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList13 = approvalRequestRepository0.findPending();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional15 = approvalRequestRepository0.findById("hi!");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository16 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository17 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList18 = approvalRequestRepository17.findAll();
        approvalRequestRepository16.saveAll(approvalRequestList18);
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository20 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository21 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList22 = approvalRequestRepository21.findAll();
        approvalRequestRepository20.saveAll(approvalRequestList22);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList24 = approvalRequestRepository20.findAll();
        approvalRequestRepository16.saveAll(approvalRequestList24);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList26 = approvalRequestRepository16.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList27 = approvalRequestRepository16.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList28 = approvalRequestRepository16.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository29 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository30 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList31 = approvalRequestRepository30.findAll();
        approvalRequestRepository29.saveAll(approvalRequestList31);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList33 = approvalRequestRepository29.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository34 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository35 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList36 = approvalRequestRepository35.findAll();
        approvalRequestRepository34.saveAll(approvalRequestList36);
        approvalRequestRepository29.saveAll(approvalRequestList36);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList39 = approvalRequestRepository29.findPending();
        approvalRequestRepository16.saveAll(approvalRequestList39);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList41 = approvalRequestRepository16.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList42 = approvalRequestRepository16.findPending();
        approvalRequestRepository0.saveAll(approvalRequestList42);
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestOptional12);
        org.junit.Assert.assertNotNull(approvalRequestList13);
        org.junit.Assert.assertNotNull(approvalRequestOptional15);
        org.junit.Assert.assertNotNull(approvalRequestList18);
        org.junit.Assert.assertNotNull(approvalRequestList22);
        org.junit.Assert.assertNotNull(approvalRequestList24);
        org.junit.Assert.assertNotNull(approvalRequestList26);
        org.junit.Assert.assertNotNull(approvalRequestList27);
        org.junit.Assert.assertNotNull(approvalRequestList28);
        org.junit.Assert.assertNotNull(approvalRequestList31);
        org.junit.Assert.assertNotNull(approvalRequestList33);
        org.junit.Assert.assertNotNull(approvalRequestList36);
        org.junit.Assert.assertNotNull(approvalRequestList39);
        org.junit.Assert.assertNotNull(approvalRequestList41);
        org.junit.Assert.assertNotNull(approvalRequestList42);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository6 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository6.findAll();
        approvalRequestRepository5.saveAll(approvalRequestList7);
        approvalRequestRepository0.saveAll(approvalRequestList7);
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional11 = approvalRequestRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional13 = approvalRequestRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional15 = approvalRequestRepository0.findById("");
        com.yorku.lab.model.ApprovalRequest approvalRequest16 = null;
        // The following exception was thrown during execution in test generation
        try {
            approvalRequestRepository0.save(approvalRequest16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.ApprovalRequest.getRequestId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestOptional11);
        org.junit.Assert.assertNotNull(approvalRequestOptional13);
        org.junit.Assert.assertNotNull(approvalRequestOptional15);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository6 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository6.findAll();
        approvalRequestRepository5.saveAll(approvalRequestList7);
        approvalRequestRepository0.saveAll(approvalRequestList7);
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional11 = approvalRequestRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList12 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList13 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList14 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository15 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList16 = approvalRequestRepository15.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList17 = approvalRequestRepository15.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository18 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository19 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList20 = approvalRequestRepository19.findAll();
        approvalRequestRepository18.saveAll(approvalRequestList20);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList22 = approvalRequestRepository18.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList23 = approvalRequestRepository18.findPending();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional25 = approvalRequestRepository18.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList26 = approvalRequestRepository18.findAll();
        approvalRequestRepository15.saveAll(approvalRequestList26);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList28 = approvalRequestRepository15.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList28);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList30 = approvalRequestRepository0.findAll();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestOptional11);
        org.junit.Assert.assertNotNull(approvalRequestList12);
        org.junit.Assert.assertNotNull(approvalRequestList13);
        org.junit.Assert.assertNotNull(approvalRequestList14);
        org.junit.Assert.assertNotNull(approvalRequestList16);
        org.junit.Assert.assertNotNull(approvalRequestList17);
        org.junit.Assert.assertNotNull(approvalRequestList20);
        org.junit.Assert.assertNotNull(approvalRequestList22);
        org.junit.Assert.assertNotNull(approvalRequestList23);
        org.junit.Assert.assertNotNull(approvalRequestOptional25);
        org.junit.Assert.assertNotNull(approvalRequestList26);
        org.junit.Assert.assertNotNull(approvalRequestList28);
        org.junit.Assert.assertNotNull(approvalRequestList30);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository6 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository6.findAll();
        approvalRequestRepository5.saveAll(approvalRequestList7);
        approvalRequestRepository0.saveAll(approvalRequestList7);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional12 = approvalRequestRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional14 = approvalRequestRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList15 = approvalRequestRepository0.findAll();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestOptional12);
        org.junit.Assert.assertNotNull(approvalRequestOptional14);
        org.junit.Assert.assertNotNull(approvalRequestList15);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository4 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList6 = approvalRequestRepository5.findAll();
        approvalRequestRepository4.saveAll(approvalRequestList6);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository4.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList8);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList12 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList13 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList14 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList15 = approvalRequestRepository0.findAll();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList6);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(approvalRequestList12);
        org.junit.Assert.assertNotNull(approvalRequestList13);
        org.junit.Assert.assertNotNull(approvalRequestList14);
        org.junit.Assert.assertNotNull(approvalRequestList15);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList5 = approvalRequestRepository0.findPending();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional7 = approvalRequestRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional10 = approvalRequestRepository0.findById("");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository11 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository12 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList13 = approvalRequestRepository12.findAll();
        approvalRequestRepository11.saveAll(approvalRequestList13);
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository15 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository16 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList17 = approvalRequestRepository16.findAll();
        approvalRequestRepository15.saveAll(approvalRequestList17);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList19 = approvalRequestRepository15.findAll();
        approvalRequestRepository11.saveAll(approvalRequestList19);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList21 = approvalRequestRepository11.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList22 = approvalRequestRepository11.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList22);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList24 = approvalRequestRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional26 = approvalRequestRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional28 = approvalRequestRepository0.findById("hi!");
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList5);
        org.junit.Assert.assertNotNull(approvalRequestOptional7);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestOptional10);
        org.junit.Assert.assertNotNull(approvalRequestList13);
        org.junit.Assert.assertNotNull(approvalRequestList17);
        org.junit.Assert.assertNotNull(approvalRequestList19);
        org.junit.Assert.assertNotNull(approvalRequestList21);
        org.junit.Assert.assertNotNull(approvalRequestList22);
        org.junit.Assert.assertNotNull(approvalRequestList24);
        org.junit.Assert.assertNotNull(approvalRequestOptional26);
        org.junit.Assert.assertNotNull(approvalRequestOptional28);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository6 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository6.findAll();
        approvalRequestRepository5.saveAll(approvalRequestList7);
        approvalRequestRepository0.saveAll(approvalRequestList7);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findPending();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository11 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository12 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList13 = approvalRequestRepository12.findAll();
        approvalRequestRepository11.saveAll(approvalRequestList13);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList15 = approvalRequestRepository11.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList16 = approvalRequestRepository11.findPending();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional18 = approvalRequestRepository11.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList19 = approvalRequestRepository11.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList19);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList21 = approvalRequestRepository0.findAll();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestList13);
        org.junit.Assert.assertNotNull(approvalRequestList15);
        org.junit.Assert.assertNotNull(approvalRequestList16);
        org.junit.Assert.assertNotNull(approvalRequestOptional18);
        org.junit.Assert.assertNotNull(approvalRequestList19);
        org.junit.Assert.assertNotNull(approvalRequestList21);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList5 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList6 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository0.findAll();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList5);
        org.junit.Assert.assertNotNull(approvalRequestList6);
        org.junit.Assert.assertNotNull(approvalRequestList7);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository6 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository6.findAll();
        approvalRequestRepository5.saveAll(approvalRequestList7);
        approvalRequestRepository0.saveAll(approvalRequestList7);
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional11 = approvalRequestRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList12 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList13 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList14 = approvalRequestRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional16 = approvalRequestRepository0.findById("");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList17 = approvalRequestRepository0.findAll();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestOptional11);
        org.junit.Assert.assertNotNull(approvalRequestList12);
        org.junit.Assert.assertNotNull(approvalRequestList13);
        org.junit.Assert.assertNotNull(approvalRequestList14);
        org.junit.Assert.assertNotNull(approvalRequestOptional16);
        org.junit.Assert.assertNotNull(approvalRequestList17);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository4 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList6 = approvalRequestRepository5.findAll();
        approvalRequestRepository4.saveAll(approvalRequestList6);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository4.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList8);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList12 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository13 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository14 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList15 = approvalRequestRepository14.findAll();
        approvalRequestRepository13.saveAll(approvalRequestList15);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList17 = approvalRequestRepository13.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository18 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository19 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList20 = approvalRequestRepository19.findAll();
        approvalRequestRepository18.saveAll(approvalRequestList20);
        approvalRequestRepository13.saveAll(approvalRequestList20);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList23 = approvalRequestRepository13.findPending();
        approvalRequestRepository0.saveAll(approvalRequestList23);
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional26 = approvalRequestRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList27 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList28 = approvalRequestRepository0.findPending();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList6);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(approvalRequestList12);
        org.junit.Assert.assertNotNull(approvalRequestList15);
        org.junit.Assert.assertNotNull(approvalRequestList17);
        org.junit.Assert.assertNotNull(approvalRequestList20);
        org.junit.Assert.assertNotNull(approvalRequestList23);
        org.junit.Assert.assertNotNull(approvalRequestOptional26);
        org.junit.Assert.assertNotNull(approvalRequestList27);
        org.junit.Assert.assertNotNull(approvalRequestList28);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository4 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList6 = approvalRequestRepository5.findAll();
        approvalRequestRepository4.saveAll(approvalRequestList6);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository4.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList8);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findPending();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository11 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository12 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList13 = approvalRequestRepository12.findAll();
        approvalRequestRepository11.saveAll(approvalRequestList13);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList15 = approvalRequestRepository11.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository16 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository17 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList18 = approvalRequestRepository17.findAll();
        approvalRequestRepository16.saveAll(approvalRequestList18);
        approvalRequestRepository11.saveAll(approvalRequestList18);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList21 = approvalRequestRepository11.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList22 = approvalRequestRepository11.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList22);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList24 = approvalRequestRepository0.findPending();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList6);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestList13);
        org.junit.Assert.assertNotNull(approvalRequestList15);
        org.junit.Assert.assertNotNull(approvalRequestList18);
        org.junit.Assert.assertNotNull(approvalRequestList21);
        org.junit.Assert.assertNotNull(approvalRequestList22);
        org.junit.Assert.assertNotNull(approvalRequestList24);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository6 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository6.findAll();
        approvalRequestRepository5.saveAll(approvalRequestList7);
        approvalRequestRepository0.saveAll(approvalRequestList7);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional12 = approvalRequestRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList13 = approvalRequestRepository0.findPending();
        java.lang.Class<?> wildcardClass14 = approvalRequestList13.getClass();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestOptional12);
        org.junit.Assert.assertNotNull(approvalRequestList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList1 = approvalRequestRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional3 = approvalRequestRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional5 = approvalRequestRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList6 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository7 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository8 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList9 = approvalRequestRepository8.findAll();
        approvalRequestRepository7.saveAll(approvalRequestList9);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository7.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository12 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository13 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList14 = approvalRequestRepository13.findAll();
        approvalRequestRepository12.saveAll(approvalRequestList14);
        approvalRequestRepository7.saveAll(approvalRequestList14);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList17 = approvalRequestRepository7.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList18 = approvalRequestRepository7.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList19 = approvalRequestRepository7.findPending();
        approvalRequestRepository0.saveAll(approvalRequestList19);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList21 = null;
        // The following exception was thrown during execution in test generation
        try {
            approvalRequestRepository0.saveAll(approvalRequestList21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(approvalRequestList1);
        org.junit.Assert.assertNotNull(approvalRequestOptional3);
        org.junit.Assert.assertNotNull(approvalRequestOptional5);
        org.junit.Assert.assertNotNull(approvalRequestList6);
        org.junit.Assert.assertNotNull(approvalRequestList9);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(approvalRequestList14);
        org.junit.Assert.assertNotNull(approvalRequestList17);
        org.junit.Assert.assertNotNull(approvalRequestList18);
        org.junit.Assert.assertNotNull(approvalRequestList19);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList1 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository3 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository4 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList5 = approvalRequestRepository4.findAll();
        approvalRequestRepository3.saveAll(approvalRequestList5);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository3.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository3.findPending();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional10 = approvalRequestRepository3.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository3.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList11);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList13 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository14 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository15 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList16 = approvalRequestRepository15.findAll();
        approvalRequestRepository14.saveAll(approvalRequestList16);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList18 = approvalRequestRepository14.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository19 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository20 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList21 = approvalRequestRepository20.findAll();
        approvalRequestRepository19.saveAll(approvalRequestList21);
        approvalRequestRepository14.saveAll(approvalRequestList21);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList24 = approvalRequestRepository14.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList25 = approvalRequestRepository14.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository26 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository27 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList28 = approvalRequestRepository27.findAll();
        approvalRequestRepository26.saveAll(approvalRequestList28);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList30 = approvalRequestRepository26.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository31 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository32 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList33 = approvalRequestRepository32.findAll();
        approvalRequestRepository31.saveAll(approvalRequestList33);
        approvalRequestRepository26.saveAll(approvalRequestList33);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList36 = approvalRequestRepository26.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList37 = approvalRequestRepository26.findAll();
        approvalRequestRepository14.saveAll(approvalRequestList37);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList39 = approvalRequestRepository14.findPending();
        approvalRequestRepository0.saveAll(approvalRequestList39);
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional42 = approvalRequestRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList43 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList44 = approvalRequestRepository0.findPending();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional46 = approvalRequestRepository0.findById("");
        org.junit.Assert.assertNotNull(approvalRequestList1);
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList5);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestOptional10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(approvalRequestList13);
        org.junit.Assert.assertNotNull(approvalRequestList16);
        org.junit.Assert.assertNotNull(approvalRequestList18);
        org.junit.Assert.assertNotNull(approvalRequestList21);
        org.junit.Assert.assertNotNull(approvalRequestList24);
        org.junit.Assert.assertNotNull(approvalRequestList25);
        org.junit.Assert.assertNotNull(approvalRequestList28);
        org.junit.Assert.assertNotNull(approvalRequestList30);
        org.junit.Assert.assertNotNull(approvalRequestList33);
        org.junit.Assert.assertNotNull(approvalRequestList36);
        org.junit.Assert.assertNotNull(approvalRequestList37);
        org.junit.Assert.assertNotNull(approvalRequestList39);
        org.junit.Assert.assertNotNull(approvalRequestOptional42);
        org.junit.Assert.assertNotNull(approvalRequestList43);
        org.junit.Assert.assertNotNull(approvalRequestList44);
        org.junit.Assert.assertNotNull(approvalRequestOptional46);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository4 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList6 = approvalRequestRepository5.findAll();
        approvalRequestRepository4.saveAll(approvalRequestList6);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository4.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList8);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findPending();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository11 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository12 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList13 = approvalRequestRepository12.findAll();
        approvalRequestRepository11.saveAll(approvalRequestList13);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList15 = approvalRequestRepository11.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository16 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository17 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList18 = approvalRequestRepository17.findAll();
        approvalRequestRepository16.saveAll(approvalRequestList18);
        approvalRequestRepository11.saveAll(approvalRequestList18);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList21 = approvalRequestRepository11.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList22 = approvalRequestRepository11.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList22);
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional25 = approvalRequestRepository0.findById("");
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList6);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestList13);
        org.junit.Assert.assertNotNull(approvalRequestList15);
        org.junit.Assert.assertNotNull(approvalRequestList18);
        org.junit.Assert.assertNotNull(approvalRequestList21);
        org.junit.Assert.assertNotNull(approvalRequestList22);
        org.junit.Assert.assertNotNull(approvalRequestOptional25);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository4 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList6 = approvalRequestRepository5.findAll();
        approvalRequestRepository4.saveAll(approvalRequestList6);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository4.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList8);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList12 = approvalRequestRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional14 = approvalRequestRepository0.findById("");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList15 = null;
        // The following exception was thrown during execution in test generation
        try {
            approvalRequestRepository0.saveAll(approvalRequestList15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList6);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(approvalRequestList12);
        org.junit.Assert.assertNotNull(approvalRequestOptional14);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository6 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository6.findAll();
        approvalRequestRepository5.saveAll(approvalRequestList7);
        approvalRequestRepository0.saveAll(approvalRequestList7);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findPending();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional12 = approvalRequestRepository0.findById("");
        java.lang.Class<?> wildcardClass13 = approvalRequestRepository0.getClass();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestOptional12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList5 = approvalRequestRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional7 = approvalRequestRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList9 = approvalRequestRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional11 = approvalRequestRepository0.findById("");
        java.lang.Class<?> wildcardClass12 = approvalRequestRepository0.getClass();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList5);
        org.junit.Assert.assertNotNull(approvalRequestOptional7);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestList9);
        org.junit.Assert.assertNotNull(approvalRequestOptional11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList5 = approvalRequestRepository0.findPending();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional7 = approvalRequestRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional10 = approvalRequestRepository0.findById("");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository0.findPending();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional13 = approvalRequestRepository0.findById("");
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList5);
        org.junit.Assert.assertNotNull(approvalRequestOptional7);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestOptional10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(approvalRequestOptional13);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList5 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList6 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository0.findPending();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional9 = approvalRequestRepository0.findById("hi!");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository10 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository11 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList12 = approvalRequestRepository11.findAll();
        approvalRequestRepository10.saveAll(approvalRequestList12);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList14 = approvalRequestRepository10.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList15 = approvalRequestRepository10.findAll();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional17 = approvalRequestRepository10.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList18 = approvalRequestRepository10.findPending();
        approvalRequestRepository0.saveAll(approvalRequestList18);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList20 = approvalRequestRepository0.findPending();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList5);
        org.junit.Assert.assertNotNull(approvalRequestList6);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestOptional9);
        org.junit.Assert.assertNotNull(approvalRequestList12);
        org.junit.Assert.assertNotNull(approvalRequestList14);
        org.junit.Assert.assertNotNull(approvalRequestList15);
        org.junit.Assert.assertNotNull(approvalRequestOptional17);
        org.junit.Assert.assertNotNull(approvalRequestList18);
        org.junit.Assert.assertNotNull(approvalRequestList20);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList5 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList6 = approvalRequestRepository0.findAll();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList5);
        org.junit.Assert.assertNotNull(approvalRequestList6);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList5 = approvalRequestRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional7 = approvalRequestRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList9 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findPending();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository11 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository12 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList13 = approvalRequestRepository12.findAll();
        approvalRequestRepository11.saveAll(approvalRequestList13);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList15 = approvalRequestRepository11.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList16 = approvalRequestRepository11.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList17 = approvalRequestRepository11.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList18 = approvalRequestRepository11.findPending();
        approvalRequestRepository0.saveAll(approvalRequestList18);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList20 = approvalRequestRepository0.findPending();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository21 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository22 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList23 = approvalRequestRepository22.findAll();
        approvalRequestRepository21.saveAll(approvalRequestList23);
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository25 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository26 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList27 = approvalRequestRepository26.findAll();
        approvalRequestRepository25.saveAll(approvalRequestList27);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList29 = approvalRequestRepository25.findAll();
        approvalRequestRepository21.saveAll(approvalRequestList29);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList31 = approvalRequestRepository21.findPending();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional33 = approvalRequestRepository21.findById("");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList34 = approvalRequestRepository21.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList35 = approvalRequestRepository21.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList35);
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList5);
        org.junit.Assert.assertNotNull(approvalRequestOptional7);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestList9);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestList13);
        org.junit.Assert.assertNotNull(approvalRequestList15);
        org.junit.Assert.assertNotNull(approvalRequestList16);
        org.junit.Assert.assertNotNull(approvalRequestList17);
        org.junit.Assert.assertNotNull(approvalRequestList18);
        org.junit.Assert.assertNotNull(approvalRequestList20);
        org.junit.Assert.assertNotNull(approvalRequestList23);
        org.junit.Assert.assertNotNull(approvalRequestList27);
        org.junit.Assert.assertNotNull(approvalRequestList29);
        org.junit.Assert.assertNotNull(approvalRequestList31);
        org.junit.Assert.assertNotNull(approvalRequestOptional33);
        org.junit.Assert.assertNotNull(approvalRequestList34);
        org.junit.Assert.assertNotNull(approvalRequestList35);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList5 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList6 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository0.findPending();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional9 = approvalRequestRepository0.findById("hi!");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository10 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository11 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList12 = approvalRequestRepository11.findAll();
        approvalRequestRepository10.saveAll(approvalRequestList12);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList14 = approvalRequestRepository10.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList15 = approvalRequestRepository10.findAll();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional17 = approvalRequestRepository10.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList18 = approvalRequestRepository10.findPending();
        approvalRequestRepository0.saveAll(approvalRequestList18);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList20 = approvalRequestRepository0.findAll();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList5);
        org.junit.Assert.assertNotNull(approvalRequestList6);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestOptional9);
        org.junit.Assert.assertNotNull(approvalRequestList12);
        org.junit.Assert.assertNotNull(approvalRequestList14);
        org.junit.Assert.assertNotNull(approvalRequestList15);
        org.junit.Assert.assertNotNull(approvalRequestOptional17);
        org.junit.Assert.assertNotNull(approvalRequestList18);
        org.junit.Assert.assertNotNull(approvalRequestList20);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList5 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList6 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository0.findPending();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional9 = approvalRequestRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional11 = approvalRequestRepository0.findById("");
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList5);
        org.junit.Assert.assertNotNull(approvalRequestList6);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestOptional9);
        org.junit.Assert.assertNotNull(approvalRequestOptional11);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository4 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList6 = approvalRequestRepository5.findAll();
        approvalRequestRepository4.saveAll(approvalRequestList6);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository4.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList8);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList12 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList13 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList14 = approvalRequestRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional16 = approvalRequestRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional18 = approvalRequestRepository0.findById("");
        com.yorku.lab.model.ApprovalRequest approvalRequest19 = null;
        // The following exception was thrown during execution in test generation
        try {
            approvalRequestRepository0.save(approvalRequest19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.ApprovalRequest.getRequestId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList6);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(approvalRequestList12);
        org.junit.Assert.assertNotNull(approvalRequestList13);
        org.junit.Assert.assertNotNull(approvalRequestList14);
        org.junit.Assert.assertNotNull(approvalRequestOptional16);
        org.junit.Assert.assertNotNull(approvalRequestOptional18);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList5 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList6 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository0.findPending();
        com.yorku.lab.model.ApprovalRequest approvalRequest8 = null;
        // The following exception was thrown during execution in test generation
        try {
            approvalRequestRepository0.save(approvalRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.ApprovalRequest.getRequestId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList5);
        org.junit.Assert.assertNotNull(approvalRequestList6);
        org.junit.Assert.assertNotNull(approvalRequestList7);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList1 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository3 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository4 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList5 = approvalRequestRepository4.findAll();
        approvalRequestRepository3.saveAll(approvalRequestList5);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository3.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository3.findPending();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional10 = approvalRequestRepository3.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository3.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList11);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList13 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository14 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository15 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList16 = approvalRequestRepository15.findAll();
        approvalRequestRepository14.saveAll(approvalRequestList16);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList18 = approvalRequestRepository14.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository19 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository20 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList21 = approvalRequestRepository20.findAll();
        approvalRequestRepository19.saveAll(approvalRequestList21);
        approvalRequestRepository14.saveAll(approvalRequestList21);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList24 = approvalRequestRepository14.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList25 = approvalRequestRepository14.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository26 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository27 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList28 = approvalRequestRepository27.findAll();
        approvalRequestRepository26.saveAll(approvalRequestList28);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList30 = approvalRequestRepository26.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository31 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository32 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList33 = approvalRequestRepository32.findAll();
        approvalRequestRepository31.saveAll(approvalRequestList33);
        approvalRequestRepository26.saveAll(approvalRequestList33);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList36 = approvalRequestRepository26.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList37 = approvalRequestRepository26.findAll();
        approvalRequestRepository14.saveAll(approvalRequestList37);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList39 = approvalRequestRepository14.findPending();
        approvalRequestRepository0.saveAll(approvalRequestList39);
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional42 = approvalRequestRepository0.findById("");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList43 = approvalRequestRepository0.findAll();
        org.junit.Assert.assertNotNull(approvalRequestList1);
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList5);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestOptional10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(approvalRequestList13);
        org.junit.Assert.assertNotNull(approvalRequestList16);
        org.junit.Assert.assertNotNull(approvalRequestList18);
        org.junit.Assert.assertNotNull(approvalRequestList21);
        org.junit.Assert.assertNotNull(approvalRequestList24);
        org.junit.Assert.assertNotNull(approvalRequestList25);
        org.junit.Assert.assertNotNull(approvalRequestList28);
        org.junit.Assert.assertNotNull(approvalRequestList30);
        org.junit.Assert.assertNotNull(approvalRequestList33);
        org.junit.Assert.assertNotNull(approvalRequestList36);
        org.junit.Assert.assertNotNull(approvalRequestList37);
        org.junit.Assert.assertNotNull(approvalRequestList39);
        org.junit.Assert.assertNotNull(approvalRequestOptional42);
        org.junit.Assert.assertNotNull(approvalRequestList43);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList5 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList6 = approvalRequestRepository0.findPending();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList5);
        org.junit.Assert.assertNotNull(approvalRequestList6);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList1 = approvalRequestRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional3 = approvalRequestRepository0.findById("");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList5 = null;
        // The following exception was thrown during execution in test generation
        try {
            approvalRequestRepository0.saveAll(approvalRequestList5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(approvalRequestList1);
        org.junit.Assert.assertNotNull(approvalRequestOptional3);
        org.junit.Assert.assertNotNull(approvalRequestList4);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository6 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository6.findAll();
        approvalRequestRepository5.saveAll(approvalRequestList7);
        approvalRequestRepository0.saveAll(approvalRequestList7);
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional11 = approvalRequestRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList12 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList13 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList14 = approvalRequestRepository0.findPending();
        java.lang.Class<?> wildcardClass15 = approvalRequestList14.getClass();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestOptional11);
        org.junit.Assert.assertNotNull(approvalRequestList12);
        org.junit.Assert.assertNotNull(approvalRequestList13);
        org.junit.Assert.assertNotNull(approvalRequestList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository4 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList6 = approvalRequestRepository5.findAll();
        approvalRequestRepository4.saveAll(approvalRequestList6);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository4.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList8);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList12 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository13 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository14 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList15 = approvalRequestRepository14.findAll();
        approvalRequestRepository13.saveAll(approvalRequestList15);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList17 = approvalRequestRepository13.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository18 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository19 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList20 = approvalRequestRepository19.findAll();
        approvalRequestRepository18.saveAll(approvalRequestList20);
        approvalRequestRepository13.saveAll(approvalRequestList20);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList23 = approvalRequestRepository13.findPending();
        approvalRequestRepository0.saveAll(approvalRequestList23);
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional26 = approvalRequestRepository0.findById("");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList27 = approvalRequestRepository0.findAll();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList6);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(approvalRequestList12);
        org.junit.Assert.assertNotNull(approvalRequestList15);
        org.junit.Assert.assertNotNull(approvalRequestList17);
        org.junit.Assert.assertNotNull(approvalRequestList20);
        org.junit.Assert.assertNotNull(approvalRequestList23);
        org.junit.Assert.assertNotNull(approvalRequestOptional26);
        org.junit.Assert.assertNotNull(approvalRequestList27);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList4 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository6 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository6.findAll();
        approvalRequestRepository5.saveAll(approvalRequestList7);
        approvalRequestRepository0.saveAll(approvalRequestList7);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional12 = approvalRequestRepository0.findById("");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList13 = approvalRequestRepository0.findPending();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional15 = approvalRequestRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional17 = approvalRequestRepository0.findById("hi!");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository18 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository19 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList20 = approvalRequestRepository19.findAll();
        approvalRequestRepository18.saveAll(approvalRequestList20);
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository22 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository23 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList24 = approvalRequestRepository23.findAll();
        approvalRequestRepository22.saveAll(approvalRequestList24);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList26 = approvalRequestRepository22.findAll();
        approvalRequestRepository18.saveAll(approvalRequestList26);
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional29 = approvalRequestRepository18.findById("");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList30 = approvalRequestRepository18.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList30);
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList4);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestOptional12);
        org.junit.Assert.assertNotNull(approvalRequestList13);
        org.junit.Assert.assertNotNull(approvalRequestOptional15);
        org.junit.Assert.assertNotNull(approvalRequestOptional17);
        org.junit.Assert.assertNotNull(approvalRequestList20);
        org.junit.Assert.assertNotNull(approvalRequestList24);
        org.junit.Assert.assertNotNull(approvalRequestList26);
        org.junit.Assert.assertNotNull(approvalRequestOptional29);
        org.junit.Assert.assertNotNull(approvalRequestList30);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList1 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository3 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository4 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList5 = approvalRequestRepository4.findAll();
        approvalRequestRepository3.saveAll(approvalRequestList5);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList7 = approvalRequestRepository3.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository3.findPending();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional10 = approvalRequestRepository3.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository3.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList11);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList13 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository14 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository15 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList16 = approvalRequestRepository15.findAll();
        approvalRequestRepository14.saveAll(approvalRequestList16);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList18 = approvalRequestRepository14.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository19 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository20 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList21 = approvalRequestRepository20.findAll();
        approvalRequestRepository19.saveAll(approvalRequestList21);
        approvalRequestRepository14.saveAll(approvalRequestList21);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList24 = approvalRequestRepository14.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList25 = approvalRequestRepository14.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository26 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository27 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList28 = approvalRequestRepository27.findAll();
        approvalRequestRepository26.saveAll(approvalRequestList28);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList30 = approvalRequestRepository26.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository31 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository32 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList33 = approvalRequestRepository32.findAll();
        approvalRequestRepository31.saveAll(approvalRequestList33);
        approvalRequestRepository26.saveAll(approvalRequestList33);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList36 = approvalRequestRepository26.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList37 = approvalRequestRepository26.findAll();
        approvalRequestRepository14.saveAll(approvalRequestList37);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList39 = approvalRequestRepository14.findPending();
        approvalRequestRepository0.saveAll(approvalRequestList39);
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional42 = approvalRequestRepository0.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList43 = approvalRequestRepository0.findAll();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository44 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository45 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList46 = approvalRequestRepository45.findAll();
        approvalRequestRepository44.saveAll(approvalRequestList46);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList48 = approvalRequestRepository44.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList49 = approvalRequestRepository44.findAll();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional51 = approvalRequestRepository44.findById("hi!");
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList52 = approvalRequestRepository44.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList53 = approvalRequestRepository44.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList53);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList55 = approvalRequestRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.ApprovalRequest> approvalRequestOptional57 = approvalRequestRepository0.findById("");
        org.junit.Assert.assertNotNull(approvalRequestList1);
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList5);
        org.junit.Assert.assertNotNull(approvalRequestList7);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestOptional10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(approvalRequestList13);
        org.junit.Assert.assertNotNull(approvalRequestList16);
        org.junit.Assert.assertNotNull(approvalRequestList18);
        org.junit.Assert.assertNotNull(approvalRequestList21);
        org.junit.Assert.assertNotNull(approvalRequestList24);
        org.junit.Assert.assertNotNull(approvalRequestList25);
        org.junit.Assert.assertNotNull(approvalRequestList28);
        org.junit.Assert.assertNotNull(approvalRequestList30);
        org.junit.Assert.assertNotNull(approvalRequestList33);
        org.junit.Assert.assertNotNull(approvalRequestList36);
        org.junit.Assert.assertNotNull(approvalRequestList37);
        org.junit.Assert.assertNotNull(approvalRequestList39);
        org.junit.Assert.assertNotNull(approvalRequestOptional42);
        org.junit.Assert.assertNotNull(approvalRequestList43);
        org.junit.Assert.assertNotNull(approvalRequestList46);
        org.junit.Assert.assertNotNull(approvalRequestList48);
        org.junit.Assert.assertNotNull(approvalRequestList49);
        org.junit.Assert.assertNotNull(approvalRequestOptional51);
        org.junit.Assert.assertNotNull(approvalRequestList52);
        org.junit.Assert.assertNotNull(approvalRequestList53);
        org.junit.Assert.assertNotNull(approvalRequestList55);
        org.junit.Assert.assertNotNull(approvalRequestOptional57);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository0 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository1 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList2 = approvalRequestRepository1.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList2);
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository4 = new com.yorku.lab.repository.ApprovalRequestRepository();
        com.yorku.lab.repository.ApprovalRequestRepository approvalRequestRepository5 = new com.yorku.lab.repository.ApprovalRequestRepository();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList6 = approvalRequestRepository5.findAll();
        approvalRequestRepository4.saveAll(approvalRequestList6);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList8 = approvalRequestRepository4.findAll();
        approvalRequestRepository0.saveAll(approvalRequestList8);
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList10 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList11 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList12 = approvalRequestRepository0.findAll();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList13 = approvalRequestRepository0.findPending();
        java.util.List<com.yorku.lab.model.ApprovalRequest> approvalRequestList14 = approvalRequestRepository0.findAll();
        org.junit.Assert.assertNotNull(approvalRequestList2);
        org.junit.Assert.assertNotNull(approvalRequestList6);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertNotNull(approvalRequestList12);
        org.junit.Assert.assertNotNull(approvalRequestList13);
        org.junit.Assert.assertNotNull(approvalRequestList14);
    }
}

