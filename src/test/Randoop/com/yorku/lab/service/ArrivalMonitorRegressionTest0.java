package test.Randoop.com.yorku.lab.service;

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
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@512d6e60[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@6a818392[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000007800120abd0@489091bd]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@b1534d3[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 0]");
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
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@19d3f6ad[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@556aed22[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000007800120abd0@57a982f9]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@7227926b[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 0]");
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
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@12bcf7c6[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@54a5496f[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000007800120abd0@3a116ca6]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@4a0c512b[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 0]");
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
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@3fdbb7ee[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@1add90e0[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000007800120abd0@7bf94e91]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@5e5a2b74[Shutting down, pool size = 2, active threads = 2, queued tasks = 0, completed tasks = 2]");
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
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@4a7c72af[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@7f9d40b3[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000007800120abd0@ca2a03f]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@639cb0c8[Shutting down, pool size = 1, active threads = 1, queued tasks = 0, completed tasks = 2]");
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
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@2b55ea4d[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@7e1953f7[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000007800120abd0@26f07261]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@60256d1b[Shutting down, pool size = 1, active threads = 0, queued tasks = 0, completed tasks = 7]");
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
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@47f4dc8d[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@6e3acd7[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000007800120abd0@55b78dad]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@48614fb3[Shutting down, pool size = 1, active threads = 1, queued tasks = 0, completed tasks = 3]");
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
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@56739ee9[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@678db8be[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000007800120abd0@77b7a4b2]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@54eea16c[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 0]");
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
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@9d455a6[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@892f1fa[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000007800120abd0@68f1e261]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@4f75c627[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 0]");
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
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@743167c7[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@497ccf3[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000007800120abd0@55732ae6]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@213f2d00[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 2]");
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
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@3b30409[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@1aae50f9[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000007800120abd0@2b53d6fc]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@6354a50a[Shutting down, pool size = 1, active threads = 1, queued tasks = 0, completed tasks = 1]");
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
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@1c027237[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@279e9c95[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000007800120abd0@5546a9e0]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@62ae5180[Shutting down, pool size = 1, active threads = 0, queued tasks = 0, completed tasks = 2]");
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
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@7072606[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@7105d271[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000007800120abd0@12e25b4b]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@316a682b[Shutting down, pool size = 2, active threads = 2, queued tasks = 0, completed tasks = 1]");
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
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@2132629e[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@64514009[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000007800120abd0@40b2aae9]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@38eb2140[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 0]");
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
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@583f6270[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@785dbe3a[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000007800120abd0@58230224]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@2a654f27[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 0]");
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
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@4d19ddeb[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@48d588dd[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000007800120abd0@b09df69]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@397ff526[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 0]");
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
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@7cc7769d[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@6d575cd8[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000007800120abd0@69c00140]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@419fc1d6[Shutting down, pool size = 1, active threads = 0, queued tasks = 0, completed tasks = 2]");
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
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@570fc662[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@6f798e5a[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000007800120abd0@cbbc0ac]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@2c6ee031[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 0]");
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
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@5dca9fd8[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@200eaca[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000007800120abd0@29f68e88]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@3ea95c22[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 0]");
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
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@41f53068[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@2f9b33f1[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000007800120abd0@69a0e285]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@5bae7a7b[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 0]");
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
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@f66ac80[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@3836ba63[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000007800120abd0@455805b3]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@3d6e18b4[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 5]");
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
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@435df9a1[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@67c492fc[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000007800120abd0@2349aa88]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@39ab2bf3[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 0]");
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
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@945b2f[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@1cdece3d[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000007800120abd0@263b0a8d]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@8d27060[Shutting down, pool size = 1, active threads = 0, queued tasks = 0, completed tasks = 5]");
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
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@23f7ed9d[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@683cd50d[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000007800120abd0@280c955c]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@785e65cd[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 0]");
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
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@66132947[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@3c3c0916[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000007800120abd0@255cc703]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@22fc3e19[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 0]");
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
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@79871eeb[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@20df24c0[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000007800120abd0@6256d908]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@2547d1b8[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 0]");
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
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@6c4de249[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@354de44[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000007800120abd0@7dc56c0a]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@2cf78ff[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 2]");
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
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@5a42eadc[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@7e0aab75[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000007800120abd0@9d45e6e]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@2294d35c[Shutting down, pool size = 1, active threads = 1, queued tasks = 0, completed tasks = 3]");
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
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@5c0104df[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@5f59d707[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000007800120abd0@7aafe7b8]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@74aa4446[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 0]");
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
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@10330ade[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@26308d2a[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000007800120abd0@401e1872]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@69473758[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 0]");
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
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@63c7beef[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@109ef880[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000007800120abd0@5412a7c6]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@56ec31ca[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 0]");
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
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@70cbe9f9[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@b7c3b07[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000007800120abd0@67452d8]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@c9cc09f[Shutting down, pool size = 2, active threads = 0, queued tasks = 0, completed tasks = 2]");
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
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@194c7ec5[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@664da60d[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000007800120abd0@3213df1d]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@5b2e0b59[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 0]");
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
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@2f4c9046[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@d4b922c[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000007800120abd0@6fd48fa4]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@320e5ad2[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 0]");
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
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@23df8e14[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@feac812[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000007800120abd0@2e36a6dc]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@5a6af1c7[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 0]");
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
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@4c89f372[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@323fff38[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000007800120abd0@388f6d63]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@7ff735d7[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 6]");
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
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@2760d9e4[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@61781c28[Wrapped task = com.yorku.lab.service.ArrivalMonitor$$Lambda/0x000007800120abd0@61ec3639]] rejected from java.util.concurrent.ScheduledThreadPoolExecutor@4140e149[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 0]");
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

