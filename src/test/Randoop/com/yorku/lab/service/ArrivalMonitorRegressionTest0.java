package com.yorku.lab.service;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ArrivalMonitorRegressionTest0 {

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
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        java.lang.Class<?> wildcardClass2 = arrivalMonitor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        java.lang.Class<?> wildcardClass1 = arrivalMonitor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        com.yorku.lab.model.Reservation reservation1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = arrivalMonitor0.isWithinArrivalWindow(reservation1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getStartTime()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.markNoShow("hi!");
        // The following exception was thrown during execution in test generation
        try {
            arrivalMonitor0.startMonitoring();
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@1e9469b8[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@625dfff3[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000000002d280660@26350ea2]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@74e6094b[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 0]");
        } catch (java.util.concurrent.RejectedExecutionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.stopMonitoring();
        java.lang.Class<?> wildcardClass3 = arrivalMonitor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.stopMonitoring();
        com.yorku.lab.model.Reservation reservation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = arrivalMonitor0.isWithinArrivalWindow(reservation5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getStartTime()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.startMonitoring();
        com.yorku.lab.model.Reservation reservation6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = arrivalMonitor0.isWithinArrivalWindow(reservation6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getStartTime()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.startMonitoring();
        com.yorku.lab.model.Reservation reservation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = arrivalMonitor0.isWithinArrivalWindow(reservation5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getStartTime()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.startMonitoring();
        com.yorku.lab.model.Reservation reservation3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = arrivalMonitor0.isWithinArrivalWindow(reservation3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getStartTime()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.markNoShow("");
        com.yorku.lab.model.Reservation reservation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = arrivalMonitor0.isWithinArrivalWindow(reservation4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getStartTime()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        com.yorku.lab.model.Reservation reservation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = arrivalMonitor0.isWithinArrivalWindow(reservation5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getStartTime()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.markNoShow("hi!");
        com.yorku.lab.model.Reservation reservation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = arrivalMonitor0.isWithinArrivalWindow(reservation4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getStartTime()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.startMonitoring();
        java.lang.Class<?> wildcardClass7 = arrivalMonitor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.startMonitoring();
        java.lang.Class<?> wildcardClass5 = arrivalMonitor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.stopMonitoring();
        // The following exception was thrown during execution in test generation
        try {
            arrivalMonitor0.startMonitoring();
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@422ba9b7[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@45b27ad3[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000000002d280660@3f908bc0]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@3359c3f6[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 0]");
        } catch (java.util.concurrent.RejectedExecutionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.markNoShow("");
        java.lang.Class<?> wildcardClass4 = arrivalMonitor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.handleArrivalDetected("");
        java.lang.Class<?> wildcardClass6 = arrivalMonitor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.stopMonitoring();
        // The following exception was thrown during execution in test generation
        try {
            arrivalMonitor0.startMonitoring();
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@20155dae[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@7e2a76be[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000000002d280660@24b8a393]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@34f60be9[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 0]");
        } catch (java.util.concurrent.RejectedExecutionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.stopMonitoring();
        com.yorku.lab.model.Reservation reservation3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = arrivalMonitor0.isWithinArrivalWindow(reservation3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getStartTime()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("");
        com.yorku.lab.model.Reservation reservation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = arrivalMonitor0.isWithinArrivalWindow(reservation5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getStartTime()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.markNoShow("hi!");
        java.lang.Class<?> wildcardClass4 = arrivalMonitor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("");
        java.lang.Class<?> wildcardClass7 = arrivalMonitor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.handleArrivalDetected("");
        com.yorku.lab.model.Reservation reservation7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = arrivalMonitor0.isWithinArrivalWindow(reservation7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getStartTime()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.stopMonitoring();
        // The following exception was thrown during execution in test generation
        try {
            arrivalMonitor0.startMonitoring();
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@5186b78a[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@af57949[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000000002d280660@f833223]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@6956eb58[Shutting down, pool size = 1, active threads = 1, queued tasks = 0, completed tasks = 3]");
        } catch (java.util.concurrent.RejectedExecutionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.stopMonitoring();
        // The following exception was thrown during execution in test generation
        try {
            arrivalMonitor0.startMonitoring();
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@5f81507a[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@ed1d2cf[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000000002d280660@b814e23]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@575fe6da[Shutting down, pool size = 2, active threads = 2, queued tasks = 0, completed tasks = 0]");
        } catch (java.util.concurrent.RejectedExecutionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        java.lang.Class<?> wildcardClass5 = arrivalMonitor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.stopMonitoring();
        // The following exception was thrown during execution in test generation
        try {
            arrivalMonitor0.startMonitoring();
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@1f5f4d48[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@1a06ec24[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000000002d280660@1715193f]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@3891b430[Shutting down, pool size = 2, active threads = 2, queued tasks = 0, completed tasks = 0]");
        } catch (java.util.concurrent.RejectedExecutionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.markNoShow("hi!");
        com.yorku.lab.model.Reservation reservation6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = arrivalMonitor0.isWithinArrivalWindow(reservation6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getStartTime()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("");
        com.yorku.lab.model.Reservation reservation7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = arrivalMonitor0.isWithinArrivalWindow(reservation7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getStartTime()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.stopMonitoring();
        // The following exception was thrown during execution in test generation
        try {
            arrivalMonitor0.startMonitoring();
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@69a031a4[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@41271320[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000000002d280660@3a2881d6]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@1dfd6023[Shutting down, pool size = 2, active threads = 2, queued tasks = 0, completed tasks = 2]");
        } catch (java.util.concurrent.RejectedExecutionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.stopMonitoring();
        java.lang.Class<?> wildcardClass7 = arrivalMonitor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.markNoShow("");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.stopMonitoring();
        com.yorku.lab.model.Reservation reservation9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = arrivalMonitor0.isWithinArrivalWindow(reservation9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getStartTime()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.stopMonitoring();
        java.lang.Class<?> wildcardClass8 = arrivalMonitor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.markNoShow("");
        // The following exception was thrown during execution in test generation
        try {
            arrivalMonitor0.startMonitoring();
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@49a46f29[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@5ea24702[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000000002d280660@1da2219c]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@27ae6f9e[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 0]");
        } catch (java.util.concurrent.RejectedExecutionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.stopMonitoring();
        // The following exception was thrown during execution in test generation
        try {
            arrivalMonitor0.startMonitoring();
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@275ff5f8[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@1786e49f[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000000002d280660@3bfbe2a6]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@5f386009[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 0]");
        } catch (java.util.concurrent.RejectedExecutionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.stopMonitoring();
        com.yorku.lab.model.Reservation reservation6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = arrivalMonitor0.isWithinArrivalWindow(reservation6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getStartTime()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.markNoShow("");
        // The following exception was thrown during execution in test generation
        try {
            arrivalMonitor0.startMonitoring();
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@b41ceac[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@5feceb2f[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000000002d280660@5327c503]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@1b1434ce[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 3]");
        } catch (java.util.concurrent.RejectedExecutionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.stopMonitoring();
        // The following exception was thrown during execution in test generation
        try {
            arrivalMonitor0.startMonitoring();
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@456c6754[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@7441eed3[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000000002d280660@284e68ae]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@3c72c488[Shutting down, pool size = 2, active threads = 2, queued tasks = 0, completed tasks = 0]");
        } catch (java.util.concurrent.RejectedExecutionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.stopMonitoring();
        // The following exception was thrown during execution in test generation
        try {
            arrivalMonitor0.startMonitoring();
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@20fdd484[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@130901fd[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000000002d280660@659f5f32]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@3d1b91d1[Shutting down, pool size = 2, active threads = 2, queued tasks = 0, completed tasks = 0]");
        } catch (java.util.concurrent.RejectedExecutionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.stopMonitoring();
        // The following exception was thrown during execution in test generation
        try {
            arrivalMonitor0.startMonitoring();
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@15d41953[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@3abe1c9e[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000000002d280660@71586f]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@2d4e6bb2[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 4]");
        } catch (java.util.concurrent.RejectedExecutionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.handleArrivalDetected("");
        com.yorku.lab.model.Reservation reservation12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = arrivalMonitor0.isWithinArrivalWindow(reservation12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getStartTime()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.handleArrivalDetected("hi!");
        // The following exception was thrown during execution in test generation
        try {
            arrivalMonitor0.startMonitoring();
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@6859f102[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@2cef4321[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000000002d280660@29c471f6]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@6654e105[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 0]");
        } catch (java.util.concurrent.RejectedExecutionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.handleArrivalDetected("");
        // The following exception was thrown during execution in test generation
        try {
            arrivalMonitor0.startMonitoring();
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@40ab1491[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@55b9ffd0[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000000002d280660@a5f5b96]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@36bf903c[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 0]");
        } catch (java.util.concurrent.RejectedExecutionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.markNoShow("");
        // The following exception was thrown during execution in test generation
        try {
            arrivalMonitor0.startMonitoring();
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@14d294f4[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@2162b22d[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000000002d280660@6a4ec62d]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@204bd52d[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 0]");
        } catch (java.util.concurrent.RejectedExecutionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.stopMonitoring();
        // The following exception was thrown during execution in test generation
        try {
            arrivalMonitor0.startMonitoring();
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@6ea48ca1[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@216fe151[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000000002d280660@5cdf6bb1]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@70d3b49c[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 2]");
        } catch (java.util.concurrent.RejectedExecutionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.handleArrivalDetected("hi!");
        java.lang.Class<?> wildcardClass6 = arrivalMonitor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.handleArrivalDetected("");
        com.yorku.lab.model.Reservation reservation6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = arrivalMonitor0.isWithinArrivalWindow(reservation6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getStartTime()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.startMonitoring();
        java.lang.Class<?> wildcardClass7 = arrivalMonitor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.startMonitoring();
        com.yorku.lab.model.Reservation reservation7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = arrivalMonitor0.isWithinArrivalWindow(reservation7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getStartTime()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.stopMonitoring();
        // The following exception was thrown during execution in test generation
        try {
            arrivalMonitor0.startMonitoring();
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@67127bb1[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@66161fee[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000000002d280660@547a79cd]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@2542d320[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 0]");
        } catch (java.util.concurrent.RejectedExecutionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.markNoShow("");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.markNoShow("hi!");
        // The following exception was thrown during execution in test generation
        try {
            arrivalMonitor0.startMonitoring();
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@7101fb1c[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@7ec9780b[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000000002d280660@8d0dcd9]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@299a0651[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 0]");
        } catch (java.util.concurrent.RejectedExecutionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.handleArrivalDetected("");
        com.yorku.lab.model.Reservation reservation10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = arrivalMonitor0.isWithinArrivalWindow(reservation10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getStartTime()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.handleArrivalDetected("");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.handleArrivalDetected("");
        // The following exception was thrown during execution in test generation
        try {
            arrivalMonitor0.startMonitoring();
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@ae8aade[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@3d6527bf[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000000002d280660@46f322ab]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@296ca76c[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 0]");
        } catch (java.util.concurrent.RejectedExecutionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.markNoShow("");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.stopMonitoring();
        java.lang.Class<?> wildcardClass9 = arrivalMonitor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.stopMonitoring();
        com.yorku.lab.model.Reservation reservation7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = arrivalMonitor0.isWithinArrivalWindow(reservation7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getStartTime()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.stopMonitoring();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.markNoShow("");
        java.lang.Class<?> wildcardClass8 = arrivalMonitor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        java.lang.Class<?> wildcardClass8 = arrivalMonitor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.stopMonitoring();
        // The following exception was thrown during execution in test generation
        try {
            arrivalMonitor0.startMonitoring();
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@283693af[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@4d8decd1[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000000002d280660@55607e6d]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@67c602e9[Shutting down, pool size = 2, active threads = 2, queued tasks = 0, completed tasks = 0]");
        } catch (java.util.concurrent.RejectedExecutionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        // The following exception was thrown during execution in test generation
        try {
            arrivalMonitor0.startMonitoring();
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@680a5de1[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@58a5b377[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000000002d280660@54c8b990]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@7279d0f8[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 0]");
        } catch (java.util.concurrent.RejectedExecutionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.handleArrivalDetected("");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.markNoShow("hi!");
        java.lang.Class<?> wildcardClass7 = arrivalMonitor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.markNoShow("hi!");
        com.yorku.lab.model.Reservation reservation9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = arrivalMonitor0.isWithinArrivalWindow(reservation9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getStartTime()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.stopMonitoring();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        com.yorku.lab.model.Reservation reservation7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = arrivalMonitor0.isWithinArrivalWindow(reservation7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getStartTime()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.markNoShow("");
        java.lang.Class<?> wildcardClass10 = arrivalMonitor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.handleArrivalDetected("");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.stopMonitoring();
        // The following exception was thrown during execution in test generation
        try {
            arrivalMonitor0.startMonitoring();
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@70d49a95[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@7dcc6b08[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000000002d280660@17d6e44]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@5f0469e2[Shutting down, pool size = 2, active threads = 2, queued tasks = 0, completed tasks = 0]");
        } catch (java.util.concurrent.RejectedExecutionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.markNoShow("");
        java.lang.Class<?> wildcardClass9 = arrivalMonitor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.markNoShow("");
        com.yorku.lab.model.Reservation reservation13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = arrivalMonitor0.isWithinArrivalWindow(reservation13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getStartTime()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.handleArrivalDetected("hi!");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.handleArrivalDetected("hi!");
        java.lang.Class<?> wildcardClass9 = arrivalMonitor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.stopMonitoring();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.handleArrivalDetected("");
        com.yorku.lab.model.Reservation reservation8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = arrivalMonitor0.isWithinArrivalWindow(reservation8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getStartTime()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.markNoShow("");
        // The following exception was thrown during execution in test generation
        try {
            arrivalMonitor0.startMonitoring();
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@7728bed[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@3b8c9157[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000000002d280660@37b5203]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@7fef7c55[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 0]");
        } catch (java.util.concurrent.RejectedExecutionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.stopMonitoring();
        java.lang.Class<?> wildcardClass10 = arrivalMonitor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        java.lang.Class<?> wildcardClass4 = arrivalMonitor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.stopMonitoring();
        java.lang.Class<?> wildcardClass10 = arrivalMonitor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        // The following exception was thrown during execution in test generation
        try {
            arrivalMonitor0.startMonitoring();
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@43e07d88[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@32640b6d[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000000002d280660@2e26eed3]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@7842ad22[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 0]");
        } catch (java.util.concurrent.RejectedExecutionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.startMonitoring();
        java.lang.Class<?> wildcardClass6 = arrivalMonitor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.handleArrivalDetected("");
        // The following exception was thrown during execution in test generation
        try {
            arrivalMonitor0.startMonitoring();
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@3189c6d9[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@1ee7a438[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000000002d280660@108f5cd6]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@549ea731[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 0]");
        } catch (java.util.concurrent.RejectedExecutionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.stopMonitoring();
        // The following exception was thrown during execution in test generation
        try {
            arrivalMonitor0.startMonitoring();
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@84f12b6[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@b93aba8[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000000002d280660@1d361feb]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@2585437a[Shutting down, pool size = 1, active threads = 0, queued tasks = 0, completed tasks = 2]");
        } catch (java.util.concurrent.RejectedExecutionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.stopMonitoring();
        com.yorku.lab.model.Reservation reservation7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = arrivalMonitor0.isWithinArrivalWindow(reservation7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getStartTime()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.stopMonitoring();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.markNoShow("");
        com.yorku.lab.model.Reservation reservation6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = arrivalMonitor0.isWithinArrivalWindow(reservation6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getStartTime()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.stopMonitoring();
        // The following exception was thrown during execution in test generation
        try {
            arrivalMonitor0.startMonitoring();
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@654a4b51[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@27937c21[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000000002d280660@2242013]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@3aa6fef3[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 4]");
        } catch (java.util.concurrent.RejectedExecutionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.handleArrivalDetected("");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        com.yorku.lab.model.Reservation reservation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = arrivalMonitor0.isWithinArrivalWindow(reservation4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getStartTime()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        com.yorku.lab.model.Reservation reservation11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = arrivalMonitor0.isWithinArrivalWindow(reservation11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getStartTime()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.stopMonitoring();
        com.yorku.lab.model.Reservation reservation10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = arrivalMonitor0.isWithinArrivalWindow(reservation10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getStartTime()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.handleArrivalDetected("hi!");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.stopMonitoring();
        com.yorku.lab.model.Reservation reservation10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = arrivalMonitor0.isWithinArrivalWindow(reservation10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getStartTime()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.handleArrivalDetected("");
        // The following exception was thrown during execution in test generation
        try {
            arrivalMonitor0.startMonitoring();
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@64eb6eda[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@1bd6c0de[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000000002d280660@2f5d95b]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@64004f10[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 0]");
        } catch (java.util.concurrent.RejectedExecutionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.stopMonitoring();
        // The following exception was thrown during execution in test generation
        try {
            arrivalMonitor0.startMonitoring();
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@76cad044[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@1b00613a[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000000002d280660@20854ebe]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@6046dbf9[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 0]");
        } catch (java.util.concurrent.RejectedExecutionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.handleArrivalDetected("");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.markNoShow("");
        com.yorku.lab.model.Reservation reservation6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = arrivalMonitor0.isWithinArrivalWindow(reservation6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getStartTime()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.markNoShow("");
        com.yorku.lab.model.Reservation reservation8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = arrivalMonitor0.isWithinArrivalWindow(reservation8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getStartTime()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.stopMonitoring();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.markNoShow("hi!");
        // The following exception was thrown during execution in test generation
        try {
            arrivalMonitor0.startMonitoring();
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@34d27ee3[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@983401e[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000000002d280660@1c067ae4]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@14a78b6c[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 0]");
        } catch (java.util.concurrent.RejectedExecutionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.markNoShow("");
        java.lang.Class<?> wildcardClass6 = arrivalMonitor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.stopMonitoring();
        java.lang.Class<?> wildcardClass4 = arrivalMonitor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.stopMonitoring();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.handleArrivalDetected("");
        com.yorku.lab.model.Reservation reservation11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = arrivalMonitor0.isWithinArrivalWindow(reservation11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getStartTime()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.markNoShow("hi!");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.startMonitoring();
        com.yorku.lab.model.Reservation reservation11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = arrivalMonitor0.isWithinArrivalWindow(reservation11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getStartTime()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.stopMonitoring();
        com.yorku.lab.model.Reservation reservation7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = arrivalMonitor0.isWithinArrivalWindow(reservation7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getStartTime()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.handleArrivalDetected("hi!");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.markNoShow("");
        java.lang.Class<?> wildcardClass4 = arrivalMonitor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.stopMonitoring();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.markNoShow("");
        java.lang.Class<?> wildcardClass8 = arrivalMonitor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.stopMonitoring();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("");
        java.lang.Class<?> wildcardClass15 = arrivalMonitor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.handleArrivalDetected("");
        com.yorku.lab.model.Reservation reservation10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = arrivalMonitor0.isWithinArrivalWindow(reservation10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getStartTime()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.stopMonitoring();
        com.yorku.lab.model.Reservation reservation10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = arrivalMonitor0.isWithinArrivalWindow(reservation10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getStartTime()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.stopMonitoring();
        // The following exception was thrown during execution in test generation
        try {
            arrivalMonitor0.startMonitoring();
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@31fc8c5e[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@37263abc[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000000002d280660@205d9921]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@4588f119[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 2]");
        } catch (java.util.concurrent.RejectedExecutionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.handleArrivalDetected("");
        java.lang.Class<?> wildcardClass7 = arrivalMonitor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.stopMonitoring();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.markNoShow("");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.stopMonitoring();
        com.yorku.lab.model.Reservation reservation8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = arrivalMonitor0.isWithinArrivalWindow(reservation8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getStartTime()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.markNoShow("");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.stopMonitoring();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.markNoShow("hi!");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.markNoShow("");
        java.lang.Class<?> wildcardClass10 = arrivalMonitor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.markNoShow("");
        java.lang.Class<?> wildcardClass7 = arrivalMonitor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.handleArrivalDetected("");
        // The following exception was thrown during execution in test generation
        try {
            arrivalMonitor0.startMonitoring();
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@5e365ad0[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@6822e70d[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000000002d280660@98474c2]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@67360a68[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 0]");
        } catch (java.util.concurrent.RejectedExecutionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.markNoShow("");
        com.yorku.lab.model.Reservation reservation6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = arrivalMonitor0.isWithinArrivalWindow(reservation6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getStartTime()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.markNoShow("hi!");
        com.yorku.lab.model.Reservation reservation7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = arrivalMonitor0.isWithinArrivalWindow(reservation7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getStartTime()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.stopMonitoring();
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.handleArrivalDetected("");
        java.lang.Class<?> wildcardClass11 = arrivalMonitor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.markNoShow("");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.handleArrivalDetected("hi!");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.markNoShow("");
        java.lang.Class<?> wildcardClass17 = arrivalMonitor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.markNoShow("");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.markNoShow("");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.handleArrivalDetected("");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.stopMonitoring();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.markNoShow("hi!");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.handleArrivalDetected("hi!");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.stopMonitoring();
        java.lang.Class<?> wildcardClass7 = arrivalMonitor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.markNoShow("hi!");
        java.lang.Class<?> wildcardClass9 = arrivalMonitor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.stopMonitoring();
        com.yorku.lab.model.Reservation reservation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = arrivalMonitor0.isWithinArrivalWindow(reservation4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getStartTime()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.startMonitoring();
        java.lang.Class<?> wildcardClass9 = arrivalMonitor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.stopMonitoring();
        java.lang.Class<?> wildcardClass16 = arrivalMonitor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.stopMonitoring();
        java.lang.Class<?> wildcardClass8 = arrivalMonitor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.stopMonitoring();
        // The following exception was thrown during execution in test generation
        try {
            arrivalMonitor0.startMonitoring();
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@1b7999b7[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@11a44b24[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000000002d280660@147ee167]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@47d91a2d[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 0]");
        } catch (java.util.concurrent.RejectedExecutionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.handleArrivalDetected("");
        com.yorku.lab.model.Reservation reservation14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = arrivalMonitor0.isWithinArrivalWindow(reservation14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getStartTime()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.markNoShow("");
        java.lang.Class<?> wildcardClass11 = arrivalMonitor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.stopMonitoring();
        java.lang.Class<?> wildcardClass7 = arrivalMonitor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.handleArrivalDetected("");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.markNoShow("");
        com.yorku.lab.model.Reservation reservation8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = arrivalMonitor0.isWithinArrivalWindow(reservation8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getStartTime()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.stopMonitoring();
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.stopMonitoring();
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.stopMonitoring();
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.markNoShow("hi!");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.handleArrivalDetected("");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.markNoShow("");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.stopMonitoring();
        java.lang.Class<?> wildcardClass6 = arrivalMonitor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.stopMonitoring();
        // The following exception was thrown during execution in test generation
        try {
            arrivalMonitor0.startMonitoring();
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@24a89473[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@79ef14d2[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000000002d280660@593707c6]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@50f5a2f9[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 0]");
        } catch (java.util.concurrent.RejectedExecutionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.markNoShow("");
        // The following exception was thrown during execution in test generation
        try {
            arrivalMonitor0.startMonitoring();
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@2bfe98a0[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@7566010e[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000000002d280660@1f79523a]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@6875d979[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 1]");
        } catch (java.util.concurrent.RejectedExecutionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.stopMonitoring();
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.markNoShow("");
        com.yorku.lab.model.Reservation reservation12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = arrivalMonitor0.isWithinArrivalWindow(reservation12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getStartTime()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.stopMonitoring();
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.handleArrivalDetected("");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        com.yorku.lab.model.Reservation reservation8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = arrivalMonitor0.isWithinArrivalWindow(reservation8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getStartTime()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.markNoShow("hi!");
        // The following exception was thrown during execution in test generation
        try {
            arrivalMonitor0.startMonitoring();
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@2369db96[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@e57c95[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000000002d280660@7d6d120b]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@21bffcac[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 0]");
        } catch (java.util.concurrent.RejectedExecutionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.startMonitoring();
        java.lang.Class<?> wildcardClass3 = arrivalMonitor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.handleArrivalDetected("");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.markNoShow("hi!");
        com.yorku.lab.model.Reservation reservation9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = arrivalMonitor0.isWithinArrivalWindow(reservation9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getStartTime()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.startMonitoring();
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.handleArrivalDetected("");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.markNoShow("");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.handleArrivalDetected("hi!");
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.markNoShow("");
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.handleArrivalDetected("");
        arrivalMonitor0.stopMonitoring();
        java.lang.Class<?> wildcardClass13 = arrivalMonitor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        com.yorku.lab.service.ArrivalMonitor arrivalMonitor0 = new com.yorku.lab.service.ArrivalMonitor();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.markNoShow("hi!");
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.startMonitoring();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.stopMonitoring();
        arrivalMonitor0.stopMonitoring();
        com.yorku.lab.model.Reservation reservation9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = arrivalMonitor0.isWithinArrivalWindow(reservation9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.Reservation.getStartTime()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

