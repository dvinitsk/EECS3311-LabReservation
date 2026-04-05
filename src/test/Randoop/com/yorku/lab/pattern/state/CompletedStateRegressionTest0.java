package test.Randoop.com.yorku.lab.pattern.state;

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

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
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
        java.lang.Class<?> wildcardClass33 = completedState0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
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
            completedState0.cancel(reservation31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot cancel a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
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
        completedState0.complete(reservation35);
        java.lang.Class<?> wildcardClass37 = completedState0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.cancel(reservation37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot cancel a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
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
        java.lang.Class<?> wildcardClass31 = completedState0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
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
        java.time.LocalDateTime localDateTime34 = null;
        java.time.LocalDateTime localDateTime35 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.modify(reservation33, localDateTime34, localDateTime35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot modify a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markNoShow(reservation37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
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
        java.time.LocalDateTime localDateTime34 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.extend(reservation33, localDateTime34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot extend a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markNoShow(reservation39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        java.time.LocalDateTime localDateTime40 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.extend(reservation39, localDateTime40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot extend a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        java.time.LocalDateTime localDateTime38 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.extend(reservation37, localDateTime38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot extend a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.modify(reservation39, localDateTime40, localDateTime41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot modify a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
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
        java.time.LocalDateTime localDateTime37 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.modify(reservation35, localDateTime36, localDateTime37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot modify a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.cancel(reservation39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot cancel a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markArrived(reservation37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markArrived(reservation39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
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
            completedState0.markArrived(reservation31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markArrived(reservation41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.cancel(reservation41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot cancel a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.cancel(reservation43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot cancel a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        java.time.LocalDateTime localDateTime42 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.extend(reservation41, localDateTime42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot extend a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        java.lang.Class<?> wildcardClass39 = completedState0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        java.lang.Class<?> wildcardClass43 = completedState0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        java.time.LocalDateTime localDateTime42 = null;
        java.time.LocalDateTime localDateTime43 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.modify(reservation41, localDateTime42, localDateTime43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot modify a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markNoShow(reservation41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.cancel(reservation47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot cancel a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markNoShow(reservation47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.cancel(reservation45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot cancel a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        java.time.LocalDateTime localDateTime48 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.extend(reservation47, localDateTime48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot extend a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markArrived(reservation45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        java.lang.Class<?> wildcardClass47 = completedState0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        java.time.LocalDateTime localDateTime46 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.extend(reservation45, localDateTime46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot extend a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        java.lang.Class<?> wildcardClass41 = completedState0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        java.time.LocalDateTime localDateTime38 = null;
        java.time.LocalDateTime localDateTime39 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.modify(reservation37, localDateTime38, localDateTime39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot modify a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        java.time.LocalDateTime localDateTime44 = null;
        java.time.LocalDateTime localDateTime45 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.modify(reservation43, localDateTime44, localDateTime45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot modify a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markNoShow(reservation45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        java.time.LocalDateTime localDateTime44 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.extend(reservation43, localDateTime44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot extend a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markArrived(reservation47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        java.lang.Class<?> wildcardClass45 = completedState0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markNoShow(reservation43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        java.lang.Class<?> wildcardClass51 = completedState0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.cancel(reservation51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot cancel a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markArrived(reservation49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.cancel(reservation49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot cancel a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markArrived(reservation51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markArrived(reservation43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        java.lang.Class<?> wildcardClass49 = completedState0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        java.time.LocalDateTime localDateTime46 = null;
        java.time.LocalDateTime localDateTime47 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.modify(reservation45, localDateTime46, localDateTime47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot modify a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        java.time.LocalDateTime localDateTime52 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.extend(reservation51, localDateTime52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot extend a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        java.time.LocalDateTime localDateTime54 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.extend(reservation53, localDateTime54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot extend a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        java.time.LocalDateTime localDateTime52 = null;
        java.time.LocalDateTime localDateTime53 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.modify(reservation51, localDateTime52, localDateTime53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot modify a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        java.time.LocalDateTime localDateTime54 = null;
        java.time.LocalDateTime localDateTime55 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.modify(reservation53, localDateTime54, localDateTime55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot modify a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markArrived(reservation53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.cancel(reservation53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot cancel a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        java.time.LocalDateTime localDateTime48 = null;
        java.time.LocalDateTime localDateTime49 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.modify(reservation47, localDateTime48, localDateTime49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot modify a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markNoShow(reservation49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markNoShow(reservation53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        java.time.LocalDateTime localDateTime50 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.extend(reservation49, localDateTime50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot extend a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        java.time.LocalDateTime localDateTime56 = null;
        java.time.LocalDateTime localDateTime57 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.modify(reservation55, localDateTime56, localDateTime57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot modify a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        java.time.LocalDateTime localDateTime50 = null;
        java.time.LocalDateTime localDateTime51 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.modify(reservation49, localDateTime50, localDateTime51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot modify a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markNoShow(reservation51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        java.lang.Class<?> wildcardClass57 = completedState0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        java.lang.Class<?> wildcardClass55 = completedState0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.cancel(reservation55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot cancel a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        java.time.LocalDateTime localDateTime56 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.extend(reservation55, localDateTime56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot extend a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        java.time.LocalDateTime localDateTime60 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.extend(reservation59, localDateTime60);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot extend a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.cancel(reservation59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot cancel a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markArrived(reservation55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        java.lang.Class<?> wildcardClass53 = completedState0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.cancel(reservation61);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot cancel a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markArrived(reservation59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        java.time.LocalDateTime localDateTime62 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.extend(reservation61, localDateTime62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot extend a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        java.time.LocalDateTime localDateTime60 = null;
        java.time.LocalDateTime localDateTime61 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.modify(reservation59, localDateTime60, localDateTime61);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot modify a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markNoShow(reservation57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        java.time.LocalDateTime localDateTime62 = null;
        java.time.LocalDateTime localDateTime63 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.modify(reservation61, localDateTime62, localDateTime63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot modify a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        java.lang.Class<?> wildcardClass59 = completedState0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markArrived(reservation61);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        java.time.LocalDateTime localDateTime64 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.extend(reservation63, localDateTime64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot extend a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markNoShow(reservation61);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markArrived(reservation63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markNoShow(reservation63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markArrived(reservation57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        java.lang.Class<?> wildcardClass63 = completedState0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        completedState0.complete(reservation63);
        com.yorku.lab.model.Reservation reservation65 = null;
        completedState0.complete(reservation65);
        com.yorku.lab.model.Reservation reservation67 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markArrived(reservation67);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        completedState0.complete(reservation63);
        com.yorku.lab.model.Reservation reservation65 = null;
        completedState0.complete(reservation65);
        com.yorku.lab.model.Reservation reservation67 = null;
        java.time.LocalDateTime localDateTime68 = null;
        java.time.LocalDateTime localDateTime69 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.modify(reservation67, localDateTime68, localDateTime69);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot modify a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        completedState0.complete(reservation63);
        com.yorku.lab.model.Reservation reservation65 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markNoShow(reservation65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        completedState0.complete(reservation63);
        com.yorku.lab.model.Reservation reservation65 = null;
        completedState0.complete(reservation65);
        com.yorku.lab.model.Reservation reservation67 = null;
        completedState0.complete(reservation67);
        java.lang.Class<?> wildcardClass69 = completedState0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        java.time.LocalDateTime localDateTime64 = null;
        java.time.LocalDateTime localDateTime65 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.modify(reservation63, localDateTime64, localDateTime65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot modify a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        completedState0.complete(reservation63);
        com.yorku.lab.model.Reservation reservation65 = null;
        completedState0.complete(reservation65);
        com.yorku.lab.model.Reservation reservation67 = null;
        completedState0.complete(reservation67);
        com.yorku.lab.model.Reservation reservation69 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markNoShow(reservation69);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        completedState0.complete(reservation63);
        com.yorku.lab.model.Reservation reservation65 = null;
        completedState0.complete(reservation65);
        com.yorku.lab.model.Reservation reservation67 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.cancel(reservation67);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot cancel a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.cancel(reservation63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot cancel a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        completedState0.complete(reservation63);
        com.yorku.lab.model.Reservation reservation65 = null;
        completedState0.complete(reservation65);
        com.yorku.lab.model.Reservation reservation67 = null;
        completedState0.complete(reservation67);
        com.yorku.lab.model.Reservation reservation69 = null;
        java.time.LocalDateTime localDateTime70 = null;
        java.time.LocalDateTime localDateTime71 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.modify(reservation69, localDateTime70, localDateTime71);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot modify a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        completedState0.complete(reservation63);
        com.yorku.lab.model.Reservation reservation65 = null;
        java.time.LocalDateTime localDateTime66 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.extend(reservation65, localDateTime66);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot extend a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        completedState0.complete(reservation63);
        com.yorku.lab.model.Reservation reservation65 = null;
        completedState0.complete(reservation65);
        com.yorku.lab.model.Reservation reservation67 = null;
        completedState0.complete(reservation67);
        com.yorku.lab.model.Reservation reservation69 = null;
        java.time.LocalDateTime localDateTime70 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.extend(reservation69, localDateTime70);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot extend a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        completedState0.complete(reservation63);
        com.yorku.lab.model.Reservation reservation65 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markArrived(reservation65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markNoShow(reservation59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        java.time.LocalDateTime localDateTime58 = null;
        java.time.LocalDateTime localDateTime59 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.modify(reservation57, localDateTime58, localDateTime59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot modify a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        completedState0.complete(reservation63);
        com.yorku.lab.model.Reservation reservation65 = null;
        completedState0.complete(reservation65);
        java.lang.Class<?> wildcardClass67 = completedState0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        completedState0.complete(reservation63);
        com.yorku.lab.model.Reservation reservation65 = null;
        completedState0.complete(reservation65);
        com.yorku.lab.model.Reservation reservation67 = null;
        java.time.LocalDateTime localDateTime68 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.extend(reservation67, localDateTime68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot extend a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        completedState0.complete(reservation63);
        java.lang.Class<?> wildcardClass65 = completedState0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.cancel(reservation57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot cancel a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        java.lang.Class<?> wildcardClass61 = completedState0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        java.time.LocalDateTime localDateTime58 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.extend(reservation57, localDateTime58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot extend a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        completedState0.complete(reservation63);
        com.yorku.lab.model.Reservation reservation65 = null;
        java.time.LocalDateTime localDateTime66 = null;
        java.time.LocalDateTime localDateTime67 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.modify(reservation65, localDateTime66, localDateTime67);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot modify a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        completedState0.complete(reservation63);
        com.yorku.lab.model.Reservation reservation65 = null;
        completedState0.complete(reservation65);
        com.yorku.lab.model.Reservation reservation67 = null;
        completedState0.complete(reservation67);
        com.yorku.lab.model.Reservation reservation69 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markArrived(reservation69);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markNoShow(reservation55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        completedState0.complete(reservation63);
        com.yorku.lab.model.Reservation reservation65 = null;
        completedState0.complete(reservation65);
        com.yorku.lab.model.Reservation reservation67 = null;
        completedState0.complete(reservation67);
        com.yorku.lab.model.Reservation reservation69 = null;
        completedState0.complete(reservation69);
        com.yorku.lab.model.Reservation reservation71 = null;
        java.time.LocalDateTime localDateTime72 = null;
        java.time.LocalDateTime localDateTime73 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.modify(reservation71, localDateTime72, localDateTime73);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot modify a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        completedState0.complete(reservation63);
        com.yorku.lab.model.Reservation reservation65 = null;
        completedState0.complete(reservation65);
        com.yorku.lab.model.Reservation reservation67 = null;
        completedState0.complete(reservation67);
        com.yorku.lab.model.Reservation reservation69 = null;
        completedState0.complete(reservation69);
        com.yorku.lab.model.Reservation reservation71 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markArrived(reservation71);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        completedState0.complete(reservation63);
        com.yorku.lab.model.Reservation reservation65 = null;
        completedState0.complete(reservation65);
        com.yorku.lab.model.Reservation reservation67 = null;
        completedState0.complete(reservation67);
        com.yorku.lab.model.Reservation reservation69 = null;
        completedState0.complete(reservation69);
        com.yorku.lab.model.Reservation reservation71 = null;
        java.time.LocalDateTime localDateTime72 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.extend(reservation71, localDateTime72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot extend a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        completedState0.complete(reservation63);
        com.yorku.lab.model.Reservation reservation65 = null;
        completedState0.complete(reservation65);
        com.yorku.lab.model.Reservation reservation67 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markNoShow(reservation67);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        completedState0.complete(reservation63);
        com.yorku.lab.model.Reservation reservation65 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.cancel(reservation65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot cancel a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        completedState0.complete(reservation63);
        com.yorku.lab.model.Reservation reservation65 = null;
        completedState0.complete(reservation65);
        com.yorku.lab.model.Reservation reservation67 = null;
        completedState0.complete(reservation67);
        com.yorku.lab.model.Reservation reservation69 = null;
        completedState0.complete(reservation69);
        com.yorku.lab.model.Reservation reservation71 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markNoShow(reservation71);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        completedState0.complete(reservation63);
        com.yorku.lab.model.Reservation reservation65 = null;
        completedState0.complete(reservation65);
        com.yorku.lab.model.Reservation reservation67 = null;
        completedState0.complete(reservation67);
        com.yorku.lab.model.Reservation reservation69 = null;
        completedState0.complete(reservation69);
        com.yorku.lab.model.Reservation reservation71 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.cancel(reservation71);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot cancel a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        completedState0.complete(reservation63);
        com.yorku.lab.model.Reservation reservation65 = null;
        completedState0.complete(reservation65);
        com.yorku.lab.model.Reservation reservation67 = null;
        completedState0.complete(reservation67);
        com.yorku.lab.model.Reservation reservation69 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.cancel(reservation69);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot cancel a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        completedState0.complete(reservation63);
        com.yorku.lab.model.Reservation reservation65 = null;
        completedState0.complete(reservation65);
        com.yorku.lab.model.Reservation reservation67 = null;
        completedState0.complete(reservation67);
        com.yorku.lab.model.Reservation reservation69 = null;
        completedState0.complete(reservation69);
        java.lang.Class<?> wildcardClass71 = completedState0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        completedState0.complete(reservation63);
        com.yorku.lab.model.Reservation reservation65 = null;
        completedState0.complete(reservation65);
        com.yorku.lab.model.Reservation reservation67 = null;
        completedState0.complete(reservation67);
        com.yorku.lab.model.Reservation reservation69 = null;
        completedState0.complete(reservation69);
        com.yorku.lab.model.Reservation reservation71 = null;
        completedState0.complete(reservation71);
        com.yorku.lab.model.Reservation reservation73 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.cancel(reservation73);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot cancel a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        completedState0.complete(reservation63);
        com.yorku.lab.model.Reservation reservation65 = null;
        completedState0.complete(reservation65);
        com.yorku.lab.model.Reservation reservation67 = null;
        completedState0.complete(reservation67);
        com.yorku.lab.model.Reservation reservation69 = null;
        completedState0.complete(reservation69);
        com.yorku.lab.model.Reservation reservation71 = null;
        completedState0.complete(reservation71);
        com.yorku.lab.model.Reservation reservation73 = null;
        java.time.LocalDateTime localDateTime74 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.extend(reservation73, localDateTime74);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot extend a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        completedState0.complete(reservation63);
        com.yorku.lab.model.Reservation reservation65 = null;
        completedState0.complete(reservation65);
        com.yorku.lab.model.Reservation reservation67 = null;
        completedState0.complete(reservation67);
        com.yorku.lab.model.Reservation reservation69 = null;
        completedState0.complete(reservation69);
        com.yorku.lab.model.Reservation reservation71 = null;
        completedState0.complete(reservation71);
        com.yorku.lab.model.Reservation reservation73 = null;
        java.time.LocalDateTime localDateTime74 = null;
        java.time.LocalDateTime localDateTime75 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.modify(reservation73, localDateTime74, localDateTime75);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot modify a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        completedState0.complete(reservation63);
        com.yorku.lab.model.Reservation reservation65 = null;
        completedState0.complete(reservation65);
        com.yorku.lab.model.Reservation reservation67 = null;
        completedState0.complete(reservation67);
        com.yorku.lab.model.Reservation reservation69 = null;
        completedState0.complete(reservation69);
        com.yorku.lab.model.Reservation reservation71 = null;
        completedState0.complete(reservation71);
        com.yorku.lab.model.Reservation reservation73 = null;
        completedState0.complete(reservation73);
        com.yorku.lab.model.Reservation reservation75 = null;
        java.time.LocalDateTime localDateTime76 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.extend(reservation75, localDateTime76);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot extend a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        completedState0.complete(reservation63);
        com.yorku.lab.model.Reservation reservation65 = null;
        completedState0.complete(reservation65);
        com.yorku.lab.model.Reservation reservation67 = null;
        completedState0.complete(reservation67);
        com.yorku.lab.model.Reservation reservation69 = null;
        completedState0.complete(reservation69);
        com.yorku.lab.model.Reservation reservation71 = null;
        completedState0.complete(reservation71);
        java.lang.Class<?> wildcardClass73 = completedState0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        completedState0.complete(reservation63);
        com.yorku.lab.model.Reservation reservation65 = null;
        completedState0.complete(reservation65);
        com.yorku.lab.model.Reservation reservation67 = null;
        completedState0.complete(reservation67);
        com.yorku.lab.model.Reservation reservation69 = null;
        completedState0.complete(reservation69);
        com.yorku.lab.model.Reservation reservation71 = null;
        completedState0.complete(reservation71);
        com.yorku.lab.model.Reservation reservation73 = null;
        completedState0.complete(reservation73);
        com.yorku.lab.model.Reservation reservation75 = null;
        java.time.LocalDateTime localDateTime76 = null;
        java.time.LocalDateTime localDateTime77 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.modify(reservation75, localDateTime76, localDateTime77);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot modify a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        completedState0.complete(reservation63);
        com.yorku.lab.model.Reservation reservation65 = null;
        completedState0.complete(reservation65);
        com.yorku.lab.model.Reservation reservation67 = null;
        completedState0.complete(reservation67);
        com.yorku.lab.model.Reservation reservation69 = null;
        completedState0.complete(reservation69);
        com.yorku.lab.model.Reservation reservation71 = null;
        completedState0.complete(reservation71);
        com.yorku.lab.model.Reservation reservation73 = null;
        completedState0.complete(reservation73);
        com.yorku.lab.model.Reservation reservation75 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markArrived(reservation75);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        completedState0.complete(reservation63);
        com.yorku.lab.model.Reservation reservation65 = null;
        completedState0.complete(reservation65);
        com.yorku.lab.model.Reservation reservation67 = null;
        completedState0.complete(reservation67);
        com.yorku.lab.model.Reservation reservation69 = null;
        completedState0.complete(reservation69);
        com.yorku.lab.model.Reservation reservation71 = null;
        completedState0.complete(reservation71);
        com.yorku.lab.model.Reservation reservation73 = null;
        completedState0.complete(reservation73);
        com.yorku.lab.model.Reservation reservation75 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.cancel(reservation75);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot cancel a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        completedState0.complete(reservation63);
        com.yorku.lab.model.Reservation reservation65 = null;
        completedState0.complete(reservation65);
        com.yorku.lab.model.Reservation reservation67 = null;
        completedState0.complete(reservation67);
        com.yorku.lab.model.Reservation reservation69 = null;
        completedState0.complete(reservation69);
        com.yorku.lab.model.Reservation reservation71 = null;
        completedState0.complete(reservation71);
        com.yorku.lab.model.Reservation reservation73 = null;
        completedState0.complete(reservation73);
        com.yorku.lab.model.Reservation reservation75 = null;
        completedState0.complete(reservation75);
        com.yorku.lab.model.Reservation reservation77 = null;
        java.time.LocalDateTime localDateTime78 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.extend(reservation77, localDateTime78);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot extend a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        completedState0.complete(reservation63);
        com.yorku.lab.model.Reservation reservation65 = null;
        completedState0.complete(reservation65);
        com.yorku.lab.model.Reservation reservation67 = null;
        completedState0.complete(reservation67);
        com.yorku.lab.model.Reservation reservation69 = null;
        completedState0.complete(reservation69);
        com.yorku.lab.model.Reservation reservation71 = null;
        completedState0.complete(reservation71);
        com.yorku.lab.model.Reservation reservation73 = null;
        completedState0.complete(reservation73);
        com.yorku.lab.model.Reservation reservation75 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markNoShow(reservation75);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        completedState0.complete(reservation63);
        com.yorku.lab.model.Reservation reservation65 = null;
        completedState0.complete(reservation65);
        com.yorku.lab.model.Reservation reservation67 = null;
        completedState0.complete(reservation67);
        com.yorku.lab.model.Reservation reservation69 = null;
        completedState0.complete(reservation69);
        com.yorku.lab.model.Reservation reservation71 = null;
        completedState0.complete(reservation71);
        com.yorku.lab.model.Reservation reservation73 = null;
        completedState0.complete(reservation73);
        com.yorku.lab.model.Reservation reservation75 = null;
        completedState0.complete(reservation75);
        com.yorku.lab.model.Reservation reservation77 = null;
        completedState0.complete(reservation77);
        com.yorku.lab.model.Reservation reservation79 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markArrived(reservation79);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        completedState0.complete(reservation63);
        com.yorku.lab.model.Reservation reservation65 = null;
        completedState0.complete(reservation65);
        com.yorku.lab.model.Reservation reservation67 = null;
        completedState0.complete(reservation67);
        com.yorku.lab.model.Reservation reservation69 = null;
        completedState0.complete(reservation69);
        com.yorku.lab.model.Reservation reservation71 = null;
        completedState0.complete(reservation71);
        com.yorku.lab.model.Reservation reservation73 = null;
        completedState0.complete(reservation73);
        com.yorku.lab.model.Reservation reservation75 = null;
        completedState0.complete(reservation75);
        com.yorku.lab.model.Reservation reservation77 = null;
        completedState0.complete(reservation77);
        java.lang.Class<?> wildcardClass79 = completedState0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        completedState0.complete(reservation63);
        com.yorku.lab.model.Reservation reservation65 = null;
        completedState0.complete(reservation65);
        com.yorku.lab.model.Reservation reservation67 = null;
        completedState0.complete(reservation67);
        com.yorku.lab.model.Reservation reservation69 = null;
        completedState0.complete(reservation69);
        com.yorku.lab.model.Reservation reservation71 = null;
        completedState0.complete(reservation71);
        com.yorku.lab.model.Reservation reservation73 = null;
        completedState0.complete(reservation73);
        com.yorku.lab.model.Reservation reservation75 = null;
        completedState0.complete(reservation75);
        com.yorku.lab.model.Reservation reservation77 = null;
        java.time.LocalDateTime localDateTime78 = null;
        java.time.LocalDateTime localDateTime79 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.modify(reservation77, localDateTime78, localDateTime79);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot modify a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        completedState0.complete(reservation63);
        com.yorku.lab.model.Reservation reservation65 = null;
        completedState0.complete(reservation65);
        com.yorku.lab.model.Reservation reservation67 = null;
        completedState0.complete(reservation67);
        com.yorku.lab.model.Reservation reservation69 = null;
        completedState0.complete(reservation69);
        com.yorku.lab.model.Reservation reservation71 = null;
        completedState0.complete(reservation71);
        com.yorku.lab.model.Reservation reservation73 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markArrived(reservation73);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        completedState0.complete(reservation63);
        com.yorku.lab.model.Reservation reservation65 = null;
        completedState0.complete(reservation65);
        com.yorku.lab.model.Reservation reservation67 = null;
        completedState0.complete(reservation67);
        com.yorku.lab.model.Reservation reservation69 = null;
        completedState0.complete(reservation69);
        com.yorku.lab.model.Reservation reservation71 = null;
        completedState0.complete(reservation71);
        com.yorku.lab.model.Reservation reservation73 = null;
        completedState0.complete(reservation73);
        java.lang.Class<?> wildcardClass75 = completedState0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        completedState0.complete(reservation63);
        com.yorku.lab.model.Reservation reservation65 = null;
        completedState0.complete(reservation65);
        com.yorku.lab.model.Reservation reservation67 = null;
        completedState0.complete(reservation67);
        com.yorku.lab.model.Reservation reservation69 = null;
        completedState0.complete(reservation69);
        com.yorku.lab.model.Reservation reservation71 = null;
        completedState0.complete(reservation71);
        com.yorku.lab.model.Reservation reservation73 = null;
        completedState0.complete(reservation73);
        com.yorku.lab.model.Reservation reservation75 = null;
        completedState0.complete(reservation75);
        com.yorku.lab.model.Reservation reservation77 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markArrived(reservation77);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        completedState0.complete(reservation63);
        com.yorku.lab.model.Reservation reservation65 = null;
        completedState0.complete(reservation65);
        com.yorku.lab.model.Reservation reservation67 = null;
        completedState0.complete(reservation67);
        com.yorku.lab.model.Reservation reservation69 = null;
        completedState0.complete(reservation69);
        com.yorku.lab.model.Reservation reservation71 = null;
        completedState0.complete(reservation71);
        com.yorku.lab.model.Reservation reservation73 = null;
        completedState0.complete(reservation73);
        com.yorku.lab.model.Reservation reservation75 = null;
        completedState0.complete(reservation75);
        com.yorku.lab.model.Reservation reservation77 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markNoShow(reservation77);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        completedState0.complete(reservation63);
        com.yorku.lab.model.Reservation reservation65 = null;
        completedState0.complete(reservation65);
        com.yorku.lab.model.Reservation reservation67 = null;
        completedState0.complete(reservation67);
        com.yorku.lab.model.Reservation reservation69 = null;
        completedState0.complete(reservation69);
        com.yorku.lab.model.Reservation reservation71 = null;
        completedState0.complete(reservation71);
        com.yorku.lab.model.Reservation reservation73 = null;
        completedState0.complete(reservation73);
        com.yorku.lab.model.Reservation reservation75 = null;
        completedState0.complete(reservation75);
        com.yorku.lab.model.Reservation reservation77 = null;
        completedState0.complete(reservation77);
        com.yorku.lab.model.Reservation reservation79 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.cancel(reservation79);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot cancel a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        completedState0.complete(reservation63);
        com.yorku.lab.model.Reservation reservation65 = null;
        completedState0.complete(reservation65);
        com.yorku.lab.model.Reservation reservation67 = null;
        completedState0.complete(reservation67);
        com.yorku.lab.model.Reservation reservation69 = null;
        completedState0.complete(reservation69);
        com.yorku.lab.model.Reservation reservation71 = null;
        completedState0.complete(reservation71);
        com.yorku.lab.model.Reservation reservation73 = null;
        completedState0.complete(reservation73);
        com.yorku.lab.model.Reservation reservation75 = null;
        completedState0.complete(reservation75);
        com.yorku.lab.model.Reservation reservation77 = null;
        completedState0.complete(reservation77);
        com.yorku.lab.model.Reservation reservation79 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markNoShow(reservation79);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        completedState0.complete(reservation63);
        com.yorku.lab.model.Reservation reservation65 = null;
        completedState0.complete(reservation65);
        com.yorku.lab.model.Reservation reservation67 = null;
        completedState0.complete(reservation67);
        com.yorku.lab.model.Reservation reservation69 = null;
        completedState0.complete(reservation69);
        com.yorku.lab.model.Reservation reservation71 = null;
        completedState0.complete(reservation71);
        com.yorku.lab.model.Reservation reservation73 = null;
        completedState0.complete(reservation73);
        com.yorku.lab.model.Reservation reservation75 = null;
        completedState0.complete(reservation75);
        com.yorku.lab.model.Reservation reservation77 = null;
        completedState0.complete(reservation77);
        com.yorku.lab.model.Reservation reservation79 = null;
        completedState0.complete(reservation79);
        java.lang.Class<?> wildcardClass81 = completedState0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        completedState0.complete(reservation63);
        com.yorku.lab.model.Reservation reservation65 = null;
        completedState0.complete(reservation65);
        com.yorku.lab.model.Reservation reservation67 = null;
        completedState0.complete(reservation67);
        com.yorku.lab.model.Reservation reservation69 = null;
        completedState0.complete(reservation69);
        com.yorku.lab.model.Reservation reservation71 = null;
        completedState0.complete(reservation71);
        com.yorku.lab.model.Reservation reservation73 = null;
        completedState0.complete(reservation73);
        com.yorku.lab.model.Reservation reservation75 = null;
        completedState0.complete(reservation75);
        com.yorku.lab.model.Reservation reservation77 = null;
        completedState0.complete(reservation77);
        com.yorku.lab.model.Reservation reservation79 = null;
        completedState0.complete(reservation79);
        com.yorku.lab.model.Reservation reservation81 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.cancel(reservation81);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot cancel a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        completedState0.complete(reservation63);
        com.yorku.lab.model.Reservation reservation65 = null;
        completedState0.complete(reservation65);
        com.yorku.lab.model.Reservation reservation67 = null;
        completedState0.complete(reservation67);
        com.yorku.lab.model.Reservation reservation69 = null;
        completedState0.complete(reservation69);
        com.yorku.lab.model.Reservation reservation71 = null;
        completedState0.complete(reservation71);
        com.yorku.lab.model.Reservation reservation73 = null;
        completedState0.complete(reservation73);
        com.yorku.lab.model.Reservation reservation75 = null;
        completedState0.complete(reservation75);
        com.yorku.lab.model.Reservation reservation77 = null;
        completedState0.complete(reservation77);
        com.yorku.lab.model.Reservation reservation79 = null;
        completedState0.complete(reservation79);
        com.yorku.lab.model.Reservation reservation81 = null;
        completedState0.complete(reservation81);
        com.yorku.lab.model.Reservation reservation83 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.cancel(reservation83);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot cancel a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        completedState0.complete(reservation63);
        com.yorku.lab.model.Reservation reservation65 = null;
        completedState0.complete(reservation65);
        com.yorku.lab.model.Reservation reservation67 = null;
        completedState0.complete(reservation67);
        com.yorku.lab.model.Reservation reservation69 = null;
        completedState0.complete(reservation69);
        com.yorku.lab.model.Reservation reservation71 = null;
        completedState0.complete(reservation71);
        com.yorku.lab.model.Reservation reservation73 = null;
        completedState0.complete(reservation73);
        com.yorku.lab.model.Reservation reservation75 = null;
        completedState0.complete(reservation75);
        com.yorku.lab.model.Reservation reservation77 = null;
        completedState0.complete(reservation77);
        com.yorku.lab.model.Reservation reservation79 = null;
        completedState0.complete(reservation79);
        com.yorku.lab.model.Reservation reservation81 = null;
        completedState0.complete(reservation81);
        com.yorku.lab.model.Reservation reservation83 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markNoShow(reservation83);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        completedState0.complete(reservation63);
        com.yorku.lab.model.Reservation reservation65 = null;
        completedState0.complete(reservation65);
        com.yorku.lab.model.Reservation reservation67 = null;
        completedState0.complete(reservation67);
        com.yorku.lab.model.Reservation reservation69 = null;
        completedState0.complete(reservation69);
        com.yorku.lab.model.Reservation reservation71 = null;
        completedState0.complete(reservation71);
        com.yorku.lab.model.Reservation reservation73 = null;
        completedState0.complete(reservation73);
        com.yorku.lab.model.Reservation reservation75 = null;
        completedState0.complete(reservation75);
        com.yorku.lab.model.Reservation reservation77 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.cancel(reservation77);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot cancel a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        completedState0.complete(reservation63);
        com.yorku.lab.model.Reservation reservation65 = null;
        completedState0.complete(reservation65);
        com.yorku.lab.model.Reservation reservation67 = null;
        completedState0.complete(reservation67);
        com.yorku.lab.model.Reservation reservation69 = null;
        completedState0.complete(reservation69);
        com.yorku.lab.model.Reservation reservation71 = null;
        completedState0.complete(reservation71);
        com.yorku.lab.model.Reservation reservation73 = null;
        completedState0.complete(reservation73);
        com.yorku.lab.model.Reservation reservation75 = null;
        completedState0.complete(reservation75);
        java.lang.Class<?> wildcardClass77 = completedState0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        completedState0.complete(reservation63);
        com.yorku.lab.model.Reservation reservation65 = null;
        completedState0.complete(reservation65);
        com.yorku.lab.model.Reservation reservation67 = null;
        completedState0.complete(reservation67);
        com.yorku.lab.model.Reservation reservation69 = null;
        completedState0.complete(reservation69);
        com.yorku.lab.model.Reservation reservation71 = null;
        completedState0.complete(reservation71);
        com.yorku.lab.model.Reservation reservation73 = null;
        completedState0.complete(reservation73);
        com.yorku.lab.model.Reservation reservation75 = null;
        completedState0.complete(reservation75);
        com.yorku.lab.model.Reservation reservation77 = null;
        completedState0.complete(reservation77);
        com.yorku.lab.model.Reservation reservation79 = null;
        completedState0.complete(reservation79);
        com.yorku.lab.model.Reservation reservation81 = null;
        java.time.LocalDateTime localDateTime82 = null;
        java.time.LocalDateTime localDateTime83 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.modify(reservation81, localDateTime82, localDateTime83);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot modify a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        completedState0.complete(reservation63);
        com.yorku.lab.model.Reservation reservation65 = null;
        completedState0.complete(reservation65);
        com.yorku.lab.model.Reservation reservation67 = null;
        completedState0.complete(reservation67);
        com.yorku.lab.model.Reservation reservation69 = null;
        completedState0.complete(reservation69);
        com.yorku.lab.model.Reservation reservation71 = null;
        completedState0.complete(reservation71);
        com.yorku.lab.model.Reservation reservation73 = null;
        completedState0.complete(reservation73);
        com.yorku.lab.model.Reservation reservation75 = null;
        completedState0.complete(reservation75);
        com.yorku.lab.model.Reservation reservation77 = null;
        completedState0.complete(reservation77);
        com.yorku.lab.model.Reservation reservation79 = null;
        completedState0.complete(reservation79);
        com.yorku.lab.model.Reservation reservation81 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markArrived(reservation81);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        completedState0.complete(reservation63);
        com.yorku.lab.model.Reservation reservation65 = null;
        completedState0.complete(reservation65);
        com.yorku.lab.model.Reservation reservation67 = null;
        completedState0.complete(reservation67);
        com.yorku.lab.model.Reservation reservation69 = null;
        completedState0.complete(reservation69);
        com.yorku.lab.model.Reservation reservation71 = null;
        completedState0.complete(reservation71);
        com.yorku.lab.model.Reservation reservation73 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markNoShow(reservation73);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        completedState0.complete(reservation63);
        com.yorku.lab.model.Reservation reservation65 = null;
        completedState0.complete(reservation65);
        com.yorku.lab.model.Reservation reservation67 = null;
        completedState0.complete(reservation67);
        com.yorku.lab.model.Reservation reservation69 = null;
        completedState0.complete(reservation69);
        com.yorku.lab.model.Reservation reservation71 = null;
        completedState0.complete(reservation71);
        com.yorku.lab.model.Reservation reservation73 = null;
        completedState0.complete(reservation73);
        com.yorku.lab.model.Reservation reservation75 = null;
        completedState0.complete(reservation75);
        com.yorku.lab.model.Reservation reservation77 = null;
        completedState0.complete(reservation77);
        com.yorku.lab.model.Reservation reservation79 = null;
        completedState0.complete(reservation79);
        com.yorku.lab.model.Reservation reservation81 = null;
        completedState0.complete(reservation81);
        com.yorku.lab.model.Reservation reservation83 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markArrived(reservation83);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        completedState0.complete(reservation63);
        com.yorku.lab.model.Reservation reservation65 = null;
        completedState0.complete(reservation65);
        com.yorku.lab.model.Reservation reservation67 = null;
        completedState0.complete(reservation67);
        com.yorku.lab.model.Reservation reservation69 = null;
        completedState0.complete(reservation69);
        com.yorku.lab.model.Reservation reservation71 = null;
        completedState0.complete(reservation71);
        com.yorku.lab.model.Reservation reservation73 = null;
        completedState0.complete(reservation73);
        com.yorku.lab.model.Reservation reservation75 = null;
        completedState0.complete(reservation75);
        com.yorku.lab.model.Reservation reservation77 = null;
        completedState0.complete(reservation77);
        com.yorku.lab.model.Reservation reservation79 = null;
        completedState0.complete(reservation79);
        com.yorku.lab.model.Reservation reservation81 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markNoShow(reservation81);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        completedState0.complete(reservation63);
        com.yorku.lab.model.Reservation reservation65 = null;
        completedState0.complete(reservation65);
        com.yorku.lab.model.Reservation reservation67 = null;
        completedState0.complete(reservation67);
        com.yorku.lab.model.Reservation reservation69 = null;
        completedState0.complete(reservation69);
        com.yorku.lab.model.Reservation reservation71 = null;
        completedState0.complete(reservation71);
        com.yorku.lab.model.Reservation reservation73 = null;
        completedState0.complete(reservation73);
        com.yorku.lab.model.Reservation reservation75 = null;
        completedState0.complete(reservation75);
        com.yorku.lab.model.Reservation reservation77 = null;
        completedState0.complete(reservation77);
        com.yorku.lab.model.Reservation reservation79 = null;
        completedState0.complete(reservation79);
        com.yorku.lab.model.Reservation reservation81 = null;
        completedState0.complete(reservation81);
        java.lang.Class<?> wildcardClass83 = completedState0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        completedState0.complete(reservation63);
        com.yorku.lab.model.Reservation reservation65 = null;
        completedState0.complete(reservation65);
        com.yorku.lab.model.Reservation reservation67 = null;
        completedState0.complete(reservation67);
        com.yorku.lab.model.Reservation reservation69 = null;
        completedState0.complete(reservation69);
        com.yorku.lab.model.Reservation reservation71 = null;
        completedState0.complete(reservation71);
        com.yorku.lab.model.Reservation reservation73 = null;
        completedState0.complete(reservation73);
        com.yorku.lab.model.Reservation reservation75 = null;
        completedState0.complete(reservation75);
        com.yorku.lab.model.Reservation reservation77 = null;
        completedState0.complete(reservation77);
        com.yorku.lab.model.Reservation reservation79 = null;
        java.time.LocalDateTime localDateTime80 = null;
        java.time.LocalDateTime localDateTime81 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.modify(reservation79, localDateTime80, localDateTime81);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot modify a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        completedState0.complete(reservation63);
        com.yorku.lab.model.Reservation reservation65 = null;
        completedState0.complete(reservation65);
        com.yorku.lab.model.Reservation reservation67 = null;
        completedState0.complete(reservation67);
        com.yorku.lab.model.Reservation reservation69 = null;
        completedState0.complete(reservation69);
        com.yorku.lab.model.Reservation reservation71 = null;
        completedState0.complete(reservation71);
        com.yorku.lab.model.Reservation reservation73 = null;
        completedState0.complete(reservation73);
        com.yorku.lab.model.Reservation reservation75 = null;
        completedState0.complete(reservation75);
        com.yorku.lab.model.Reservation reservation77 = null;
        completedState0.complete(reservation77);
        com.yorku.lab.model.Reservation reservation79 = null;
        completedState0.complete(reservation79);
        com.yorku.lab.model.Reservation reservation81 = null;
        java.time.LocalDateTime localDateTime82 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.extend(reservation81, localDateTime82);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot extend a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        completedState0.complete(reservation63);
        com.yorku.lab.model.Reservation reservation65 = null;
        completedState0.complete(reservation65);
        com.yorku.lab.model.Reservation reservation67 = null;
        completedState0.complete(reservation67);
        com.yorku.lab.model.Reservation reservation69 = null;
        completedState0.complete(reservation69);
        com.yorku.lab.model.Reservation reservation71 = null;
        completedState0.complete(reservation71);
        com.yorku.lab.model.Reservation reservation73 = null;
        completedState0.complete(reservation73);
        com.yorku.lab.model.Reservation reservation75 = null;
        completedState0.complete(reservation75);
        com.yorku.lab.model.Reservation reservation77 = null;
        completedState0.complete(reservation77);
        com.yorku.lab.model.Reservation reservation79 = null;
        java.time.LocalDateTime localDateTime80 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.extend(reservation79, localDateTime80);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot extend a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        completedState0.complete(reservation63);
        com.yorku.lab.model.Reservation reservation65 = null;
        completedState0.complete(reservation65);
        com.yorku.lab.model.Reservation reservation67 = null;
        completedState0.complete(reservation67);
        com.yorku.lab.model.Reservation reservation69 = null;
        completedState0.complete(reservation69);
        com.yorku.lab.model.Reservation reservation71 = null;
        completedState0.complete(reservation71);
        com.yorku.lab.model.Reservation reservation73 = null;
        completedState0.complete(reservation73);
        com.yorku.lab.model.Reservation reservation75 = null;
        completedState0.complete(reservation75);
        com.yorku.lab.model.Reservation reservation77 = null;
        completedState0.complete(reservation77);
        com.yorku.lab.model.Reservation reservation79 = null;
        completedState0.complete(reservation79);
        com.yorku.lab.model.Reservation reservation81 = null;
        completedState0.complete(reservation81);
        com.yorku.lab.model.Reservation reservation83 = null;
        java.time.LocalDateTime localDateTime84 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.extend(reservation83, localDateTime84);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot extend a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        completedState0.complete(reservation63);
        com.yorku.lab.model.Reservation reservation65 = null;
        completedState0.complete(reservation65);
        com.yorku.lab.model.Reservation reservation67 = null;
        completedState0.complete(reservation67);
        com.yorku.lab.model.Reservation reservation69 = null;
        completedState0.complete(reservation69);
        com.yorku.lab.model.Reservation reservation71 = null;
        completedState0.complete(reservation71);
        com.yorku.lab.model.Reservation reservation73 = null;
        completedState0.complete(reservation73);
        com.yorku.lab.model.Reservation reservation75 = null;
        completedState0.complete(reservation75);
        com.yorku.lab.model.Reservation reservation77 = null;
        completedState0.complete(reservation77);
        com.yorku.lab.model.Reservation reservation79 = null;
        completedState0.complete(reservation79);
        com.yorku.lab.model.Reservation reservation81 = null;
        completedState0.complete(reservation81);
        com.yorku.lab.model.Reservation reservation83 = null;
        completedState0.complete(reservation83);
        com.yorku.lab.model.Reservation reservation85 = null;
        completedState0.complete(reservation85);
        com.yorku.lab.model.Reservation reservation87 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markNoShow(reservation87);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        completedState0.complete(reservation63);
        com.yorku.lab.model.Reservation reservation65 = null;
        completedState0.complete(reservation65);
        com.yorku.lab.model.Reservation reservation67 = null;
        completedState0.complete(reservation67);
        com.yorku.lab.model.Reservation reservation69 = null;
        completedState0.complete(reservation69);
        com.yorku.lab.model.Reservation reservation71 = null;
        completedState0.complete(reservation71);
        com.yorku.lab.model.Reservation reservation73 = null;
        completedState0.complete(reservation73);
        com.yorku.lab.model.Reservation reservation75 = null;
        completedState0.complete(reservation75);
        com.yorku.lab.model.Reservation reservation77 = null;
        completedState0.complete(reservation77);
        com.yorku.lab.model.Reservation reservation79 = null;
        completedState0.complete(reservation79);
        com.yorku.lab.model.Reservation reservation81 = null;
        completedState0.complete(reservation81);
        com.yorku.lab.model.Reservation reservation83 = null;
        completedState0.complete(reservation83);
        com.yorku.lab.model.Reservation reservation85 = null;
        completedState0.complete(reservation85);
        com.yorku.lab.model.Reservation reservation87 = null;
        completedState0.complete(reservation87);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        completedState0.complete(reservation63);
        com.yorku.lab.model.Reservation reservation65 = null;
        completedState0.complete(reservation65);
        com.yorku.lab.model.Reservation reservation67 = null;
        completedState0.complete(reservation67);
        com.yorku.lab.model.Reservation reservation69 = null;
        completedState0.complete(reservation69);
        com.yorku.lab.model.Reservation reservation71 = null;
        completedState0.complete(reservation71);
        com.yorku.lab.model.Reservation reservation73 = null;
        completedState0.complete(reservation73);
        com.yorku.lab.model.Reservation reservation75 = null;
        completedState0.complete(reservation75);
        com.yorku.lab.model.Reservation reservation77 = null;
        completedState0.complete(reservation77);
        com.yorku.lab.model.Reservation reservation79 = null;
        completedState0.complete(reservation79);
        com.yorku.lab.model.Reservation reservation81 = null;
        completedState0.complete(reservation81);
        com.yorku.lab.model.Reservation reservation83 = null;
        completedState0.complete(reservation83);
        com.yorku.lab.model.Reservation reservation85 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.markArrived(reservation85);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Reservation is already completed.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
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
        completedState0.complete(reservation35);
        com.yorku.lab.model.Reservation reservation37 = null;
        completedState0.complete(reservation37);
        com.yorku.lab.model.Reservation reservation39 = null;
        completedState0.complete(reservation39);
        com.yorku.lab.model.Reservation reservation41 = null;
        completedState0.complete(reservation41);
        com.yorku.lab.model.Reservation reservation43 = null;
        completedState0.complete(reservation43);
        com.yorku.lab.model.Reservation reservation45 = null;
        completedState0.complete(reservation45);
        com.yorku.lab.model.Reservation reservation47 = null;
        completedState0.complete(reservation47);
        com.yorku.lab.model.Reservation reservation49 = null;
        completedState0.complete(reservation49);
        com.yorku.lab.model.Reservation reservation51 = null;
        completedState0.complete(reservation51);
        com.yorku.lab.model.Reservation reservation53 = null;
        completedState0.complete(reservation53);
        com.yorku.lab.model.Reservation reservation55 = null;
        completedState0.complete(reservation55);
        com.yorku.lab.model.Reservation reservation57 = null;
        completedState0.complete(reservation57);
        com.yorku.lab.model.Reservation reservation59 = null;
        completedState0.complete(reservation59);
        com.yorku.lab.model.Reservation reservation61 = null;
        completedState0.complete(reservation61);
        com.yorku.lab.model.Reservation reservation63 = null;
        completedState0.complete(reservation63);
        com.yorku.lab.model.Reservation reservation65 = null;
        completedState0.complete(reservation65);
        com.yorku.lab.model.Reservation reservation67 = null;
        completedState0.complete(reservation67);
        com.yorku.lab.model.Reservation reservation69 = null;
        completedState0.complete(reservation69);
        com.yorku.lab.model.Reservation reservation71 = null;
        completedState0.complete(reservation71);
        com.yorku.lab.model.Reservation reservation73 = null;
        completedState0.complete(reservation73);
        com.yorku.lab.model.Reservation reservation75 = null;
        completedState0.complete(reservation75);
        com.yorku.lab.model.Reservation reservation77 = null;
        completedState0.complete(reservation77);
        com.yorku.lab.model.Reservation reservation79 = null;
        completedState0.complete(reservation79);
        com.yorku.lab.model.Reservation reservation81 = null;
        completedState0.complete(reservation81);
        com.yorku.lab.model.Reservation reservation83 = null;
        completedState0.complete(reservation83);
        com.yorku.lab.model.Reservation reservation85 = null;
        completedState0.complete(reservation85);
        com.yorku.lab.model.Reservation reservation87 = null;
        java.time.LocalDateTime localDateTime88 = null;
        // The following exception was thrown during execution in test generation
        try {
            completedState0.extend(reservation87, localDateTime88);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot extend a completed reservation.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }
}

