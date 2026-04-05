package com.yorku.lab.pattern.state;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CompletedStateRegressionTest0 {

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
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        java.lang.Class<?> wildcardClass1 = completedState0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markNoShow(reservation3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        java.lang.Class<?> wildcardClass3 = completedState0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.extend(reservation3, localDateTime4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot extend a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.cancel(reservation3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot cancel a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markNoShow(reservation1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markArrived(reservation3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.modify(reservation3, localDateTime4, localDateTime5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot modify a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.extend(reservation1, localDateTime2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot extend a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.modify(reservation1, localDateTime2, localDateTime3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot modify a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markArrived(reservation1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.cancel(reservation1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot cancel a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markNoShow(reservation5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.extend(reservation5, localDateTime6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot extend a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        java.lang.Class<?> wildcardClass5 = completedState0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.modify(reservation5, localDateTime6, localDateTime7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot modify a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markArrived(reservation7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.cancel(reservation5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot cancel a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markNoShow(reservation7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        java.lang.Class<?> wildcardClass7 = completedState0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.cancel(reservation7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot cancel a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markNoShow(reservation9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.modify(reservation7, localDateTime8, localDateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot modify a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.modify(reservation9, localDateTime10, localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot modify a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markArrived(reservation5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markArrived(reservation9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        java.lang.Class<?> wildcardClass9 = completedState0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.cancel(reservation9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot cancel a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        com.yorku.lab.model.Reservation reservation13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.extend(reservation13, localDateTime14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot extend a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markNoShow(reservation11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markArrived(reservation11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        java.lang.Class<?> wildcardClass13 = completedState0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        java.lang.Class<?> wildcardClass11 = completedState0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        com.yorku.lab.model.Reservation reservation13 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markNoShow(reservation13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        com.yorku.lab.model.Reservation reservation13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.modify(reservation13, localDateTime14, localDateTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot modify a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.modify(reservation11, localDateTime12, localDateTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot modify a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        com.yorku.lab.model.Reservation reservation13 = null;
        completedState0.complete(reservation13);
        com.yorku.lab.model.Reservation reservation15 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.cancel(reservation15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot cancel a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        com.yorku.lab.model.Reservation reservation13 = null;
        completedState0.complete(reservation13);
        com.yorku.lab.model.Reservation reservation15 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markNoShow(reservation15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        com.yorku.lab.model.Reservation reservation13 = null;
        completedState0.complete(reservation13);
        java.lang.Class<?> wildcardClass15 = completedState0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        com.yorku.lab.model.Reservation reservation13 = null;
        completedState0.complete(reservation13);
        com.yorku.lab.model.Reservation reservation15 = null;
        completedState0.complete(reservation15);
        com.yorku.lab.model.Reservation reservation17 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markNoShow(reservation17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        com.yorku.lab.model.Reservation reservation13 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markArrived(reservation13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        com.yorku.lab.model.Reservation reservation13 = null;
        completedState0.complete(reservation13);
        com.yorku.lab.model.Reservation reservation15 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markArrived(reservation15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.cancel(reservation11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot cancel a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        com.yorku.lab.model.Reservation reservation13 = null;
        completedState0.complete(reservation13);
        com.yorku.lab.model.Reservation reservation15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.extend(reservation15, localDateTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot extend a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        com.yorku.lab.model.Reservation reservation13 = null;
        completedState0.complete(reservation13);
        com.yorku.lab.model.Reservation reservation15 = null;
        completedState0.complete(reservation15);
        com.yorku.lab.model.Reservation reservation17 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.cancel(reservation17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot cancel a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        com.yorku.lab.model.Reservation reservation13 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.cancel(reservation13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot cancel a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        com.yorku.lab.model.Reservation reservation13 = null;
        completedState0.complete(reservation13);
        com.yorku.lab.model.Reservation reservation15 = null;
        completedState0.complete(reservation15);
        com.yorku.lab.model.Reservation reservation17 = null;
        completedState0.complete(reservation17);
        com.yorku.lab.model.Reservation reservation19 = null;
        completedState0.complete(reservation19);
        java.lang.Class<?> wildcardClass21 = completedState0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        com.yorku.lab.model.Reservation reservation13 = null;
        completedState0.complete(reservation13);
        com.yorku.lab.model.Reservation reservation15 = null;
        completedState0.complete(reservation15);
        com.yorku.lab.model.Reservation reservation17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.extend(reservation17, localDateTime18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot extend a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        com.yorku.lab.model.Reservation reservation13 = null;
        completedState0.complete(reservation13);
        com.yorku.lab.model.Reservation reservation15 = null;
        completedState0.complete(reservation15);
        com.yorku.lab.model.Reservation reservation17 = null;
        completedState0.complete(reservation17);
        com.yorku.lab.model.Reservation reservation19 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markArrived(reservation19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        com.yorku.lab.model.Reservation reservation13 = null;
        completedState0.complete(reservation13);
        com.yorku.lab.model.Reservation reservation15 = null;
        completedState0.complete(reservation15);
        com.yorku.lab.model.Reservation reservation17 = null;
        completedState0.complete(reservation17);
        com.yorku.lab.model.Reservation reservation19 = null;
        completedState0.complete(reservation19);
        com.yorku.lab.model.Reservation reservation21 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.cancel(reservation21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot cancel a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        com.yorku.lab.model.Reservation reservation13 = null;
        completedState0.complete(reservation13);
        com.yorku.lab.model.Reservation reservation15 = null;
        completedState0.complete(reservation15);
        com.yorku.lab.model.Reservation reservation17 = null;
        completedState0.complete(reservation17);
        com.yorku.lab.model.Reservation reservation19 = null;
        completedState0.complete(reservation19);
        com.yorku.lab.model.Reservation reservation21 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markNoShow(reservation21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        com.yorku.lab.model.Reservation reservation13 = null;
        completedState0.complete(reservation13);
        com.yorku.lab.model.Reservation reservation15 = null;
        completedState0.complete(reservation15);
        com.yorku.lab.model.Reservation reservation17 = null;
        completedState0.complete(reservation17);
        com.yorku.lab.model.Reservation reservation19 = null;
        completedState0.complete(reservation19);
        com.yorku.lab.model.Reservation reservation21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.extend(reservation21, localDateTime22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot extend a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        com.yorku.lab.model.Reservation reservation13 = null;
        completedState0.complete(reservation13);
        com.yorku.lab.model.Reservation reservation15 = null;
        completedState0.complete(reservation15);
        com.yorku.lab.model.Reservation reservation17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.modify(reservation17, localDateTime18, localDateTime19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot modify a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        com.yorku.lab.model.Reservation reservation13 = null;
        completedState0.complete(reservation13);
        com.yorku.lab.model.Reservation reservation15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.modify(reservation15, localDateTime16, localDateTime17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot modify a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.extend(reservation7, localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot extend a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.extend(reservation9, localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot extend a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        com.yorku.lab.model.Reservation reservation13 = null;
        completedState0.complete(reservation13);
        com.yorku.lab.model.Reservation reservation15 = null;
        completedState0.complete(reservation15);
        com.yorku.lab.model.Reservation reservation17 = null;
        completedState0.complete(reservation17);
        com.yorku.lab.model.Reservation reservation19 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.cancel(reservation19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot cancel a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        com.yorku.lab.model.Reservation reservation13 = null;
        completedState0.complete(reservation13);
        com.yorku.lab.model.Reservation reservation15 = null;
        completedState0.complete(reservation15);
        com.yorku.lab.model.Reservation reservation17 = null;
        completedState0.complete(reservation17);
        com.yorku.lab.model.Reservation reservation19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.extend(reservation19, localDateTime20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot extend a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        com.yorku.lab.model.Reservation reservation13 = null;
        completedState0.complete(reservation13);
        com.yorku.lab.model.Reservation reservation15 = null;
        completedState0.complete(reservation15);
        com.yorku.lab.model.Reservation reservation17 = null;
        completedState0.complete(reservation17);
        com.yorku.lab.model.Reservation reservation19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.modify(reservation19, localDateTime20, localDateTime21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot modify a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        com.yorku.lab.model.Reservation reservation13 = null;
        completedState0.complete(reservation13);
        com.yorku.lab.model.Reservation reservation15 = null;
        completedState0.complete(reservation15);
        com.yorku.lab.model.Reservation reservation17 = null;
        completedState0.complete(reservation17);
        com.yorku.lab.model.Reservation reservation19 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markNoShow(reservation19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        com.yorku.lab.model.Reservation reservation13 = null;
        completedState0.complete(reservation13);
        com.yorku.lab.model.Reservation reservation15 = null;
        completedState0.complete(reservation15);
        com.yorku.lab.model.Reservation reservation17 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markArrived(reservation17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        com.yorku.lab.model.Reservation reservation13 = null;
        completedState0.complete(reservation13);
        com.yorku.lab.model.Reservation reservation15 = null;
        completedState0.complete(reservation15);
        com.yorku.lab.model.Reservation reservation17 = null;
        completedState0.complete(reservation17);
        com.yorku.lab.model.Reservation reservation19 = null;
        completedState0.complete(reservation19);
        com.yorku.lab.model.Reservation reservation21 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markArrived(reservation21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        com.yorku.lab.model.Reservation reservation13 = null;
        completedState0.complete(reservation13);
        com.yorku.lab.model.Reservation reservation15 = null;
        completedState0.complete(reservation15);
        java.lang.Class<?> wildcardClass17 = completedState0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.extend(reservation11, localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot extend a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        com.yorku.lab.model.Reservation reservation13 = null;
        completedState0.complete(reservation13);
        com.yorku.lab.model.Reservation reservation15 = null;
        completedState0.complete(reservation15);
        com.yorku.lab.model.Reservation reservation17 = null;
        completedState0.complete(reservation17);
        com.yorku.lab.model.Reservation reservation19 = null;
        completedState0.complete(reservation19);
        com.yorku.lab.model.Reservation reservation21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.modify(reservation21, localDateTime22, localDateTime23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot modify a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        com.yorku.lab.model.Reservation reservation13 = null;
        completedState0.complete(reservation13);
        com.yorku.lab.model.Reservation reservation15 = null;
        completedState0.complete(reservation15);
        com.yorku.lab.model.Reservation reservation17 = null;
        completedState0.complete(reservation17);
        java.lang.Class<?> wildcardClass19 = completedState0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        com.yorku.lab.model.Reservation reservation13 = null;
        completedState0.complete(reservation13);
        com.yorku.lab.model.Reservation reservation15 = null;
        completedState0.complete(reservation15);
        com.yorku.lab.model.Reservation reservation17 = null;
        completedState0.complete(reservation17);
        com.yorku.lab.model.Reservation reservation19 = null;
        completedState0.complete(reservation19);
        com.yorku.lab.model.Reservation reservation21 = null;
        completedState0.complete(reservation21);
        com.yorku.lab.model.Reservation reservation23 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.cancel(reservation23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot cancel a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        com.yorku.lab.model.Reservation reservation13 = null;
        completedState0.complete(reservation13);
        com.yorku.lab.model.Reservation reservation15 = null;
        completedState0.complete(reservation15);
        com.yorku.lab.model.Reservation reservation17 = null;
        completedState0.complete(reservation17);
        com.yorku.lab.model.Reservation reservation19 = null;
        completedState0.complete(reservation19);
        com.yorku.lab.model.Reservation reservation21 = null;
        completedState0.complete(reservation21);
        java.lang.Class<?> wildcardClass23 = completedState0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        com.yorku.lab.model.Reservation reservation13 = null;
        completedState0.complete(reservation13);
        com.yorku.lab.model.Reservation reservation15 = null;
        completedState0.complete(reservation15);
        com.yorku.lab.model.Reservation reservation17 = null;
        completedState0.complete(reservation17);
        com.yorku.lab.model.Reservation reservation19 = null;
        completedState0.complete(reservation19);
        com.yorku.lab.model.Reservation reservation21 = null;
        completedState0.complete(reservation21);
        com.yorku.lab.model.Reservation reservation23 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markArrived(reservation23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        com.yorku.lab.model.Reservation reservation13 = null;
        completedState0.complete(reservation13);
        com.yorku.lab.model.Reservation reservation15 = null;
        completedState0.complete(reservation15);
        com.yorku.lab.model.Reservation reservation17 = null;
        completedState0.complete(reservation17);
        com.yorku.lab.model.Reservation reservation19 = null;
        completedState0.complete(reservation19);
        com.yorku.lab.model.Reservation reservation21 = null;
        completedState0.complete(reservation21);
        com.yorku.lab.model.Reservation reservation23 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markNoShow(reservation23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        com.yorku.lab.model.Reservation reservation13 = null;
        completedState0.complete(reservation13);
        com.yorku.lab.model.Reservation reservation15 = null;
        completedState0.complete(reservation15);
        com.yorku.lab.model.Reservation reservation17 = null;
        completedState0.complete(reservation17);
        com.yorku.lab.model.Reservation reservation19 = null;
        completedState0.complete(reservation19);
        com.yorku.lab.model.Reservation reservation21 = null;
        completedState0.complete(reservation21);
        com.yorku.lab.model.Reservation reservation23 = null;
        completedState0.complete(reservation23);
        com.yorku.lab.model.Reservation reservation25 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markArrived(reservation25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        com.yorku.lab.model.Reservation reservation13 = null;
        completedState0.complete(reservation13);
        com.yorku.lab.model.Reservation reservation15 = null;
        completedState0.complete(reservation15);
        com.yorku.lab.model.Reservation reservation17 = null;
        completedState0.complete(reservation17);
        com.yorku.lab.model.Reservation reservation19 = null;
        completedState0.complete(reservation19);
        com.yorku.lab.model.Reservation reservation21 = null;
        completedState0.complete(reservation21);
        com.yorku.lab.model.Reservation reservation23 = null;
        completedState0.complete(reservation23);
        com.yorku.lab.model.Reservation reservation25 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markNoShow(reservation25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        com.yorku.lab.model.Reservation reservation13 = null;
        completedState0.complete(reservation13);
        com.yorku.lab.model.Reservation reservation15 = null;
        completedState0.complete(reservation15);
        com.yorku.lab.model.Reservation reservation17 = null;
        completedState0.complete(reservation17);
        com.yorku.lab.model.Reservation reservation19 = null;
        completedState0.complete(reservation19);
        com.yorku.lab.model.Reservation reservation21 = null;
        completedState0.complete(reservation21);
        com.yorku.lab.model.Reservation reservation23 = null;
        completedState0.complete(reservation23);
        java.lang.Class<?> wildcardClass25 = completedState0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        com.yorku.lab.model.Reservation reservation13 = null;
        completedState0.complete(reservation13);
        com.yorku.lab.model.Reservation reservation15 = null;
        completedState0.complete(reservation15);
        com.yorku.lab.model.Reservation reservation17 = null;
        completedState0.complete(reservation17);
        com.yorku.lab.model.Reservation reservation19 = null;
        completedState0.complete(reservation19);
        com.yorku.lab.model.Reservation reservation21 = null;
        completedState0.complete(reservation21);
        com.yorku.lab.model.Reservation reservation23 = null;
        completedState0.complete(reservation23);
        com.yorku.lab.model.Reservation reservation25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.extend(reservation25, localDateTime26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot extend a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        com.yorku.lab.model.Reservation reservation13 = null;
        completedState0.complete(reservation13);
        com.yorku.lab.model.Reservation reservation15 = null;
        completedState0.complete(reservation15);
        com.yorku.lab.model.Reservation reservation17 = null;
        completedState0.complete(reservation17);
        com.yorku.lab.model.Reservation reservation19 = null;
        completedState0.complete(reservation19);
        com.yorku.lab.model.Reservation reservation21 = null;
        completedState0.complete(reservation21);
        com.yorku.lab.model.Reservation reservation23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.modify(reservation23, localDateTime24, localDateTime25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot modify a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        com.yorku.lab.model.Reservation reservation13 = null;
        completedState0.complete(reservation13);
        com.yorku.lab.model.Reservation reservation15 = null;
        completedState0.complete(reservation15);
        com.yorku.lab.model.Reservation reservation17 = null;
        completedState0.complete(reservation17);
        com.yorku.lab.model.Reservation reservation19 = null;
        completedState0.complete(reservation19);
        com.yorku.lab.model.Reservation reservation21 = null;
        completedState0.complete(reservation21);
        com.yorku.lab.model.Reservation reservation23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.extend(reservation23, localDateTime24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot extend a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        com.yorku.lab.model.Reservation reservation13 = null;
        completedState0.complete(reservation13);
        com.yorku.lab.model.Reservation reservation15 = null;
        completedState0.complete(reservation15);
        com.yorku.lab.model.Reservation reservation17 = null;
        completedState0.complete(reservation17);
        com.yorku.lab.model.Reservation reservation19 = null;
        completedState0.complete(reservation19);
        com.yorku.lab.model.Reservation reservation21 = null;
        completedState0.complete(reservation21);
        com.yorku.lab.model.Reservation reservation23 = null;
        completedState0.complete(reservation23);
        com.yorku.lab.model.Reservation reservation25 = null;
        completedState0.complete(reservation25);
        com.yorku.lab.model.Reservation reservation27 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markArrived(reservation27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        com.yorku.lab.model.Reservation reservation13 = null;
        completedState0.complete(reservation13);
        com.yorku.lab.model.Reservation reservation15 = null;
        completedState0.complete(reservation15);
        com.yorku.lab.model.Reservation reservation17 = null;
        completedState0.complete(reservation17);
        com.yorku.lab.model.Reservation reservation19 = null;
        completedState0.complete(reservation19);
        com.yorku.lab.model.Reservation reservation21 = null;
        completedState0.complete(reservation21);
        com.yorku.lab.model.Reservation reservation23 = null;
        completedState0.complete(reservation23);
        com.yorku.lab.model.Reservation reservation25 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.cancel(reservation25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot cancel a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        com.yorku.lab.model.Reservation reservation13 = null;
        completedState0.complete(reservation13);
        com.yorku.lab.model.Reservation reservation15 = null;
        completedState0.complete(reservation15);
        com.yorku.lab.model.Reservation reservation17 = null;
        completedState0.complete(reservation17);
        com.yorku.lab.model.Reservation reservation19 = null;
        completedState0.complete(reservation19);
        com.yorku.lab.model.Reservation reservation21 = null;
        completedState0.complete(reservation21);
        com.yorku.lab.model.Reservation reservation23 = null;
        completedState0.complete(reservation23);
        com.yorku.lab.model.Reservation reservation25 = null;
        completedState0.complete(reservation25);
        com.yorku.lab.model.Reservation reservation27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.extend(reservation27, localDateTime28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot extend a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        com.yorku.lab.model.Reservation reservation13 = null;
        completedState0.complete(reservation13);
        com.yorku.lab.model.Reservation reservation15 = null;
        completedState0.complete(reservation15);
        com.yorku.lab.model.Reservation reservation17 = null;
        completedState0.complete(reservation17);
        com.yorku.lab.model.Reservation reservation19 = null;
        completedState0.complete(reservation19);
        com.yorku.lab.model.Reservation reservation21 = null;
        completedState0.complete(reservation21);
        com.yorku.lab.model.Reservation reservation23 = null;
        completedState0.complete(reservation23);
        com.yorku.lab.model.Reservation reservation25 = null;
        completedState0.complete(reservation25);
        com.yorku.lab.model.Reservation reservation27 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.cancel(reservation27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot cancel a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        com.yorku.lab.model.Reservation reservation13 = null;
        completedState0.complete(reservation13);
        com.yorku.lab.model.Reservation reservation15 = null;
        completedState0.complete(reservation15);
        com.yorku.lab.model.Reservation reservation17 = null;
        completedState0.complete(reservation17);
        com.yorku.lab.model.Reservation reservation19 = null;
        completedState0.complete(reservation19);
        com.yorku.lab.model.Reservation reservation21 = null;
        completedState0.complete(reservation21);
        com.yorku.lab.model.Reservation reservation23 = null;
        completedState0.complete(reservation23);
        com.yorku.lab.model.Reservation reservation25 = null;
        completedState0.complete(reservation25);
        com.yorku.lab.model.Reservation reservation27 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markNoShow(reservation27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        com.yorku.lab.model.Reservation reservation13 = null;
        completedState0.complete(reservation13);
        com.yorku.lab.model.Reservation reservation15 = null;
        completedState0.complete(reservation15);
        com.yorku.lab.model.Reservation reservation17 = null;
        completedState0.complete(reservation17);
        com.yorku.lab.model.Reservation reservation19 = null;
        completedState0.complete(reservation19);
        com.yorku.lab.model.Reservation reservation21 = null;
        completedState0.complete(reservation21);
        com.yorku.lab.model.Reservation reservation23 = null;
        completedState0.complete(reservation23);
        com.yorku.lab.model.Reservation reservation25 = null;
        completedState0.complete(reservation25);
        java.lang.Class<?> wildcardClass27 = completedState0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        com.yorku.lab.model.Reservation reservation13 = null;
        completedState0.complete(reservation13);
        com.yorku.lab.model.Reservation reservation15 = null;
        completedState0.complete(reservation15);
        com.yorku.lab.model.Reservation reservation17 = null;
        completedState0.complete(reservation17);
        com.yorku.lab.model.Reservation reservation19 = null;
        completedState0.complete(reservation19);
        com.yorku.lab.model.Reservation reservation21 = null;
        completedState0.complete(reservation21);
        com.yorku.lab.model.Reservation reservation23 = null;
        completedState0.complete(reservation23);
        com.yorku.lab.model.Reservation reservation25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.modify(reservation25, localDateTime26, localDateTime27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot modify a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        com.yorku.lab.model.Reservation reservation13 = null;
        completedState0.complete(reservation13);
        com.yorku.lab.model.Reservation reservation15 = null;
        completedState0.complete(reservation15);
        com.yorku.lab.model.Reservation reservation17 = null;
        completedState0.complete(reservation17);
        com.yorku.lab.model.Reservation reservation19 = null;
        completedState0.complete(reservation19);
        com.yorku.lab.model.Reservation reservation21 = null;
        completedState0.complete(reservation21);
        com.yorku.lab.model.Reservation reservation23 = null;
        completedState0.complete(reservation23);
        com.yorku.lab.model.Reservation reservation25 = null;
        completedState0.complete(reservation25);
        com.yorku.lab.model.Reservation reservation27 = null;
        completedState0.complete(reservation27);
        com.yorku.lab.model.Reservation reservation29 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markNoShow(reservation29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        com.yorku.lab.model.Reservation reservation13 = null;
        completedState0.complete(reservation13);
        com.yorku.lab.model.Reservation reservation15 = null;
        completedState0.complete(reservation15);
        com.yorku.lab.model.Reservation reservation17 = null;
        completedState0.complete(reservation17);
        com.yorku.lab.model.Reservation reservation19 = null;
        completedState0.complete(reservation19);
        com.yorku.lab.model.Reservation reservation21 = null;
        completedState0.complete(reservation21);
        com.yorku.lab.model.Reservation reservation23 = null;
        completedState0.complete(reservation23);
        com.yorku.lab.model.Reservation reservation25 = null;
        completedState0.complete(reservation25);
        com.yorku.lab.model.Reservation reservation27 = null;
        completedState0.complete(reservation27);
        java.lang.Class<?> wildcardClass29 = completedState0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        com.yorku.lab.model.Reservation reservation13 = null;
        completedState0.complete(reservation13);
        com.yorku.lab.model.Reservation reservation15 = null;
        completedState0.complete(reservation15);
        com.yorku.lab.model.Reservation reservation17 = null;
        completedState0.complete(reservation17);
        com.yorku.lab.model.Reservation reservation19 = null;
        completedState0.complete(reservation19);
        com.yorku.lab.model.Reservation reservation21 = null;
        completedState0.complete(reservation21);
        com.yorku.lab.model.Reservation reservation23 = null;
        completedState0.complete(reservation23);
        com.yorku.lab.model.Reservation reservation25 = null;
        completedState0.complete(reservation25);
        com.yorku.lab.model.Reservation reservation27 = null;
        completedState0.complete(reservation27);
        com.yorku.lab.model.Reservation reservation29 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markArrived(reservation29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        com.yorku.lab.model.Reservation reservation13 = null;
        completedState0.complete(reservation13);
        com.yorku.lab.model.Reservation reservation15 = null;
        completedState0.complete(reservation15);
        com.yorku.lab.model.Reservation reservation17 = null;
        completedState0.complete(reservation17);
        com.yorku.lab.model.Reservation reservation19 = null;
        completedState0.complete(reservation19);
        com.yorku.lab.model.Reservation reservation21 = null;
        completedState0.complete(reservation21);
        com.yorku.lab.model.Reservation reservation23 = null;
        completedState0.complete(reservation23);
        com.yorku.lab.model.Reservation reservation25 = null;
        completedState0.complete(reservation25);
        com.yorku.lab.model.Reservation reservation27 = null;
        completedState0.complete(reservation27);
        com.yorku.lab.model.Reservation reservation29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.extend(reservation29, localDateTime30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot extend a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        com.yorku.lab.model.Reservation reservation13 = null;
        completedState0.complete(reservation13);
        com.yorku.lab.model.Reservation reservation15 = null;
        completedState0.complete(reservation15);
        com.yorku.lab.model.Reservation reservation17 = null;
        completedState0.complete(reservation17);
        com.yorku.lab.model.Reservation reservation19 = null;
        completedState0.complete(reservation19);
        com.yorku.lab.model.Reservation reservation21 = null;
        completedState0.complete(reservation21);
        com.yorku.lab.model.Reservation reservation23 = null;
        completedState0.complete(reservation23);
        com.yorku.lab.model.Reservation reservation25 = null;
        completedState0.complete(reservation25);
        com.yorku.lab.model.Reservation reservation27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.modify(reservation27, localDateTime28, localDateTime29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot modify a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        com.yorku.lab.model.Reservation reservation13 = null;
        completedState0.complete(reservation13);
        com.yorku.lab.model.Reservation reservation15 = null;
        completedState0.complete(reservation15);
        com.yorku.lab.model.Reservation reservation17 = null;
        completedState0.complete(reservation17);
        com.yorku.lab.model.Reservation reservation19 = null;
        completedState0.complete(reservation19);
        com.yorku.lab.model.Reservation reservation21 = null;
        completedState0.complete(reservation21);
        com.yorku.lab.model.Reservation reservation23 = null;
        completedState0.complete(reservation23);
        com.yorku.lab.model.Reservation reservation25 = null;
        completedState0.complete(reservation25);
        com.yorku.lab.model.Reservation reservation27 = null;
        completedState0.complete(reservation27);
        com.yorku.lab.model.Reservation reservation29 = null;
        completedState0.complete(reservation29);
        com.yorku.lab.model.Reservation reservation31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.extend(reservation31, localDateTime32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot extend a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        com.yorku.lab.model.Reservation reservation13 = null;
        completedState0.complete(reservation13);
        com.yorku.lab.model.Reservation reservation15 = null;
        completedState0.complete(reservation15);
        com.yorku.lab.model.Reservation reservation17 = null;
        completedState0.complete(reservation17);
        com.yorku.lab.model.Reservation reservation19 = null;
        completedState0.complete(reservation19);
        com.yorku.lab.model.Reservation reservation21 = null;
        completedState0.complete(reservation21);
        com.yorku.lab.model.Reservation reservation23 = null;
        completedState0.complete(reservation23);
        com.yorku.lab.model.Reservation reservation25 = null;
        completedState0.complete(reservation25);
        com.yorku.lab.model.Reservation reservation27 = null;
        completedState0.complete(reservation27);
        com.yorku.lab.model.Reservation reservation29 = null;
        completedState0.complete(reservation29);
        com.yorku.lab.model.Reservation reservation31 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markNoShow(reservation31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        com.yorku.lab.model.Reservation reservation13 = null;
        completedState0.complete(reservation13);
        com.yorku.lab.model.Reservation reservation15 = null;
        completedState0.complete(reservation15);
        com.yorku.lab.model.Reservation reservation17 = null;
        completedState0.complete(reservation17);
        com.yorku.lab.model.Reservation reservation19 = null;
        completedState0.complete(reservation19);
        com.yorku.lab.model.Reservation reservation21 = null;
        completedState0.complete(reservation21);
        com.yorku.lab.model.Reservation reservation23 = null;
        completedState0.complete(reservation23);
        com.yorku.lab.model.Reservation reservation25 = null;
        completedState0.complete(reservation25);
        com.yorku.lab.model.Reservation reservation27 = null;
        completedState0.complete(reservation27);
        com.yorku.lab.model.Reservation reservation29 = null;
        completedState0.complete(reservation29);
        com.yorku.lab.model.Reservation reservation31 = null;
        completedState0.complete(reservation31);
        com.yorku.lab.model.Reservation reservation33 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markArrived(reservation33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        com.yorku.lab.model.Reservation reservation13 = null;
        completedState0.complete(reservation13);
        com.yorku.lab.model.Reservation reservation15 = null;
        completedState0.complete(reservation15);
        com.yorku.lab.model.Reservation reservation17 = null;
        completedState0.complete(reservation17);
        com.yorku.lab.model.Reservation reservation19 = null;
        completedState0.complete(reservation19);
        com.yorku.lab.model.Reservation reservation21 = null;
        completedState0.complete(reservation21);
        com.yorku.lab.model.Reservation reservation23 = null;
        completedState0.complete(reservation23);
        com.yorku.lab.model.Reservation reservation25 = null;
        completedState0.complete(reservation25);
        com.yorku.lab.model.Reservation reservation27 = null;
        completedState0.complete(reservation27);
        com.yorku.lab.model.Reservation reservation29 = null;
        completedState0.complete(reservation29);
        com.yorku.lab.model.Reservation reservation31 = null;
        completedState0.complete(reservation31);
        com.yorku.lab.model.Reservation reservation33 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markNoShow(reservation33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        com.yorku.lab.model.Reservation reservation13 = null;
        completedState0.complete(reservation13);
        com.yorku.lab.model.Reservation reservation15 = null;
        completedState0.complete(reservation15);
        com.yorku.lab.model.Reservation reservation17 = null;
        completedState0.complete(reservation17);
        com.yorku.lab.model.Reservation reservation19 = null;
        completedState0.complete(reservation19);
        com.yorku.lab.model.Reservation reservation21 = null;
        completedState0.complete(reservation21);
        com.yorku.lab.model.Reservation reservation23 = null;
        completedState0.complete(reservation23);
        com.yorku.lab.model.Reservation reservation25 = null;
        completedState0.complete(reservation25);
        com.yorku.lab.model.Reservation reservation27 = null;
        completedState0.complete(reservation27);
        com.yorku.lab.model.Reservation reservation29 = null;
        completedState0.complete(reservation29);
        com.yorku.lab.model.Reservation reservation31 = null;
        completedState0.complete(reservation31);
        com.yorku.lab.model.Reservation reservation33 = null;
        completedState0.complete(reservation33);
        com.yorku.lab.model.Reservation reservation35 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markNoShow(reservation35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        com.yorku.lab.model.Reservation reservation13 = null;
        completedState0.complete(reservation13);
        com.yorku.lab.model.Reservation reservation15 = null;
        completedState0.complete(reservation15);
        com.yorku.lab.model.Reservation reservation17 = null;
        completedState0.complete(reservation17);
        com.yorku.lab.model.Reservation reservation19 = null;
        completedState0.complete(reservation19);
        com.yorku.lab.model.Reservation reservation21 = null;
        completedState0.complete(reservation21);
        com.yorku.lab.model.Reservation reservation23 = null;
        completedState0.complete(reservation23);
        com.yorku.lab.model.Reservation reservation25 = null;
        completedState0.complete(reservation25);
        com.yorku.lab.model.Reservation reservation27 = null;
        completedState0.complete(reservation27);
        com.yorku.lab.model.Reservation reservation29 = null;
        completedState0.complete(reservation29);
        com.yorku.lab.model.Reservation reservation31 = null;
        completedState0.complete(reservation31);
        com.yorku.lab.model.Reservation reservation33 = null;
        completedState0.complete(reservation33);
        com.yorku.lab.model.Reservation reservation35 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.cancel(reservation35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot cancel a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        com.yorku.lab.model.Reservation reservation13 = null;
        completedState0.complete(reservation13);
        com.yorku.lab.model.Reservation reservation15 = null;
        completedState0.complete(reservation15);
        com.yorku.lab.model.Reservation reservation17 = null;
        completedState0.complete(reservation17);
        com.yorku.lab.model.Reservation reservation19 = null;
        completedState0.complete(reservation19);
        com.yorku.lab.model.Reservation reservation21 = null;
        completedState0.complete(reservation21);
        com.yorku.lab.model.Reservation reservation23 = null;
        completedState0.complete(reservation23);
        com.yorku.lab.model.Reservation reservation25 = null;
        completedState0.complete(reservation25);
        com.yorku.lab.model.Reservation reservation27 = null;
        completedState0.complete(reservation27);
        com.yorku.lab.model.Reservation reservation29 = null;
        completedState0.complete(reservation29);
        com.yorku.lab.model.Reservation reservation31 = null;
        completedState0.complete(reservation31);
        com.yorku.lab.model.Reservation reservation33 = null;
        completedState0.complete(reservation33);
        com.yorku.lab.model.Reservation reservation35 = null;
        java.time.LocalDateTime localDateTime36 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.extend(reservation35, localDateTime36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot extend a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        com.yorku.lab.model.Reservation reservation13 = null;
        completedState0.complete(reservation13);
        com.yorku.lab.model.Reservation reservation15 = null;
        completedState0.complete(reservation15);
        com.yorku.lab.model.Reservation reservation17 = null;
        completedState0.complete(reservation17);
        com.yorku.lab.model.Reservation reservation19 = null;
        completedState0.complete(reservation19);
        com.yorku.lab.model.Reservation reservation21 = null;
        completedState0.complete(reservation21);
        com.yorku.lab.model.Reservation reservation23 = null;
        completedState0.complete(reservation23);
        com.yorku.lab.model.Reservation reservation25 = null;
        completedState0.complete(reservation25);
        com.yorku.lab.model.Reservation reservation27 = null;
        completedState0.complete(reservation27);
        com.yorku.lab.model.Reservation reservation29 = null;
        completedState0.complete(reservation29);
        com.yorku.lab.model.Reservation reservation31 = null;
        completedState0.complete(reservation31);
        com.yorku.lab.model.Reservation reservation33 = null;
        completedState0.complete(reservation33);
        java.lang.Class<?> wildcardClass35 = completedState0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        com.yorku.lab.model.Reservation reservation13 = null;
        completedState0.complete(reservation13);
        com.yorku.lab.model.Reservation reservation15 = null;
        completedState0.complete(reservation15);
        com.yorku.lab.model.Reservation reservation17 = null;
        completedState0.complete(reservation17);
        com.yorku.lab.model.Reservation reservation19 = null;
        completedState0.complete(reservation19);
        com.yorku.lab.model.Reservation reservation21 = null;
        completedState0.complete(reservation21);
        com.yorku.lab.model.Reservation reservation23 = null;
        completedState0.complete(reservation23);
        com.yorku.lab.model.Reservation reservation25 = null;
        completedState0.complete(reservation25);
        com.yorku.lab.model.Reservation reservation27 = null;
        completedState0.complete(reservation27);
        com.yorku.lab.model.Reservation reservation29 = null;
        completedState0.complete(reservation29);
        com.yorku.lab.model.Reservation reservation31 = null;
        completedState0.complete(reservation31);
        com.yorku.lab.model.Reservation reservation33 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.cancel(reservation33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot cancel a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        com.yorku.lab.model.Reservation reservation13 = null;
        completedState0.complete(reservation13);
        com.yorku.lab.model.Reservation reservation15 = null;
        completedState0.complete(reservation15);
        com.yorku.lab.model.Reservation reservation17 = null;
        completedState0.complete(reservation17);
        com.yorku.lab.model.Reservation reservation19 = null;
        completedState0.complete(reservation19);
        com.yorku.lab.model.Reservation reservation21 = null;
        completedState0.complete(reservation21);
        com.yorku.lab.model.Reservation reservation23 = null;
        completedState0.complete(reservation23);
        com.yorku.lab.model.Reservation reservation25 = null;
        completedState0.complete(reservation25);
        com.yorku.lab.model.Reservation reservation27 = null;
        completedState0.complete(reservation27);
        com.yorku.lab.model.Reservation reservation29 = null;
        completedState0.complete(reservation29);
        com.yorku.lab.model.Reservation reservation31 = null;
        completedState0.complete(reservation31);
        com.yorku.lab.model.Reservation reservation33 = null;
        completedState0.complete(reservation33);
        com.yorku.lab.model.Reservation reservation35 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markArrived(reservation35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        com.yorku.lab.model.Reservation reservation13 = null;
        completedState0.complete(reservation13);
        com.yorku.lab.model.Reservation reservation15 = null;
        completedState0.complete(reservation15);
        com.yorku.lab.model.Reservation reservation17 = null;
        completedState0.complete(reservation17);
        com.yorku.lab.model.Reservation reservation19 = null;
        completedState0.complete(reservation19);
        com.yorku.lab.model.Reservation reservation21 = null;
        completedState0.complete(reservation21);
        com.yorku.lab.model.Reservation reservation23 = null;
        completedState0.complete(reservation23);
        com.yorku.lab.model.Reservation reservation25 = null;
        completedState0.complete(reservation25);
        com.yorku.lab.model.Reservation reservation27 = null;
        completedState0.complete(reservation27);
        com.yorku.lab.model.Reservation reservation29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.modify(reservation29, localDateTime30, localDateTime31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot modify a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        com.yorku.lab.model.Reservation reservation13 = null;
        completedState0.complete(reservation13);
        com.yorku.lab.model.Reservation reservation15 = null;
        completedState0.complete(reservation15);
        com.yorku.lab.model.Reservation reservation17 = null;
        completedState0.complete(reservation17);
        com.yorku.lab.model.Reservation reservation19 = null;
        completedState0.complete(reservation19);
        com.yorku.lab.model.Reservation reservation21 = null;
        completedState0.complete(reservation21);
        com.yorku.lab.model.Reservation reservation23 = null;
        completedState0.complete(reservation23);
        com.yorku.lab.model.Reservation reservation25 = null;
        completedState0.complete(reservation25);
        com.yorku.lab.model.Reservation reservation27 = null;
        completedState0.complete(reservation27);
        com.yorku.lab.model.Reservation reservation29 = null;
        completedState0.complete(reservation29);
        com.yorku.lab.model.Reservation reservation31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        java.time.LocalDateTime localDateTime33 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.modify(reservation31, localDateTime32, localDateTime33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot modify a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.yorku.lab.pattern.state.CompletedState completedState0 = new com.yorku.lab.pattern.state.CompletedState();
        com.yorku.lab.model.Reservation reservation1 = null;
        completedState0.complete(reservation1);
        com.yorku.lab.model.Reservation reservation3 = null;
        completedState0.complete(reservation3);
        com.yorku.lab.model.Reservation reservation5 = null;
        completedState0.complete(reservation5);
        com.yorku.lab.model.Reservation reservation7 = null;
        completedState0.complete(reservation7);
        com.yorku.lab.model.Reservation reservation9 = null;
        completedState0.complete(reservation9);
        com.yorku.lab.model.Reservation reservation11 = null;
        completedState0.complete(reservation11);
        com.yorku.lab.model.Reservation reservation13 = null;
        completedState0.complete(reservation13);
        com.yorku.lab.model.Reservation reservation15 = null;
        completedState0.complete(reservation15);
        com.yorku.lab.model.Reservation reservation17 = null;
        completedState0.complete(reservation17);
        com.yorku.lab.model.Reservation reservation19 = null;
        completedState0.complete(reservation19);
        com.yorku.lab.model.Reservation reservation21 = null;
        completedState0.complete(reservation21);
        com.yorku.lab.model.Reservation reservation23 = null;
        completedState0.complete(reservation23);
        com.yorku.lab.model.Reservation reservation25 = null;
        completedState0.complete(reservation25);
        com.yorku.lab.model.Reservation reservation27 = null;
        completedState0.complete(reservation27);
        com.yorku.lab.model.Reservation reservation29 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.cancel(reservation29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot cancel a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }
}

