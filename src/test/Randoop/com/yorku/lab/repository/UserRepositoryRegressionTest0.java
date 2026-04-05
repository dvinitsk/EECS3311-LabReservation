package test.Randoop.com.yorku.lab.repository;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserRepositoryRegressionTest0 {

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
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList3 = userRepository0.findAll();
        java.util.List<com.yorku.lab.model.User> userList4 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository0.saveAll(userList4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userList3);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        userRepository0.delete("");
        java.lang.Class<?> wildcardClass5 = userRepository0.getClass();
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("hi!");
        com.yorku.lab.model.User user3 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository0.save(user3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        userRepository0.delete("");
        com.yorku.lab.repository.UserRepository userRepository5 = new com.yorku.lab.repository.UserRepository();
        userRepository5.delete("");
        com.yorku.lab.model.User[] userArray8 = new com.yorku.lab.model.User[] {};
        java.util.ArrayList<com.yorku.lab.model.User> userList9 = new java.util.ArrayList<com.yorku.lab.model.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.User>) userList9, userArray8);
        userRepository5.saveAll((java.util.List<com.yorku.lab.model.User>) userList9);
        userRepository0.saveAll((java.util.List<com.yorku.lab.model.User>) userList9);
        java.lang.Class<?> wildcardClass13 = userList9.getClass();
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userArray8);
        org.junit.Assert.assertArrayEquals(userArray8, new com.yorku.lab.model.User[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("");
        com.yorku.lab.model.User[] userArray3 = new com.yorku.lab.model.User[] {};
        java.util.ArrayList<com.yorku.lab.model.User> userList4 = new java.util.ArrayList<com.yorku.lab.model.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.User>) userList4, userArray3);
        userRepository0.saveAll((java.util.List<com.yorku.lab.model.User>) userList4);
        com.yorku.lab.model.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository0.save(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new com.yorku.lab.model.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.lang.Class<?> wildcardClass1 = userRepository0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        userRepository0.delete("");
        java.util.List<com.yorku.lab.model.User> userList5 = userRepository0.findAll();
        java.lang.Class<?> wildcardClass6 = userList5.getClass();
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("hi!");
        java.lang.Class<?> wildcardClass3 = userRepository0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList3 = userRepository0.findAll();
        userRepository0.delete("hi!");
        com.yorku.lab.model.User user6 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository0.save(user6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userList3);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("");
        userRepository0.delete("hi!");
        com.yorku.lab.model.User user5 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository0.save(user5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("");
        com.yorku.lab.model.User[] userArray3 = new com.yorku.lab.model.User[] {};
        java.util.ArrayList<com.yorku.lab.model.User> userList4 = new java.util.ArrayList<com.yorku.lab.model.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.User>) userList4, userArray3);
        userRepository0.saveAll((java.util.List<com.yorku.lab.model.User>) userList4);
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository0.findByEmail("hi!");
        java.lang.Class<?> wildcardClass9 = userOptional8.getClass();
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new com.yorku.lab.model.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        java.lang.Class<?> wildcardClass3 = userRepository0.getClass();
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("hi!");
        java.util.Optional<com.yorku.lab.model.User> userOptional4 = userRepository0.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList5 = userRepository0.findAll();
        java.lang.Class<?> wildcardClass6 = userRepository0.getClass();
        org.junit.Assert.assertNotNull(userOptional4);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        userRepository0.delete("");
        com.yorku.lab.repository.UserRepository userRepository5 = new com.yorku.lab.repository.UserRepository();
        userRepository5.delete("");
        com.yorku.lab.model.User[] userArray8 = new com.yorku.lab.model.User[] {};
        java.util.ArrayList<com.yorku.lab.model.User> userList9 = new java.util.ArrayList<com.yorku.lab.model.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.User>) userList9, userArray8);
        userRepository5.saveAll((java.util.List<com.yorku.lab.model.User>) userList9);
        userRepository0.saveAll((java.util.List<com.yorku.lab.model.User>) userList9);
        com.yorku.lab.model.User user13 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository0.save(user13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userArray8);
        org.junit.Assert.assertArrayEquals(userArray8, new com.yorku.lab.model.User[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        userRepository0.delete("");
        java.util.List<com.yorku.lab.model.User> userList5 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional7 = userRepository0.findByEmail("hi!");
        java.util.List<com.yorku.lab.model.User> userList8 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional10 = userRepository0.findById("");
        com.yorku.lab.model.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository0.save(user11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userOptional10);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        userRepository0.delete("");
        java.util.List<com.yorku.lab.model.User> userList5 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional7 = userRepository0.findByEmail("hi!");
        java.util.List<com.yorku.lab.model.User> userList8 = userRepository0.findAll();
        java.util.List<com.yorku.lab.model.User> userList9 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository0.saveAll(userList9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userList8);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        userRepository0.delete("");
        com.yorku.lab.repository.UserRepository userRepository5 = new com.yorku.lab.repository.UserRepository();
        userRepository5.delete("");
        com.yorku.lab.model.User[] userArray8 = new com.yorku.lab.model.User[] {};
        java.util.ArrayList<com.yorku.lab.model.User> userList9 = new java.util.ArrayList<com.yorku.lab.model.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.User>) userList9, userArray8);
        userRepository5.saveAll((java.util.List<com.yorku.lab.model.User>) userList9);
        userRepository0.saveAll((java.util.List<com.yorku.lab.model.User>) userList9);
        userRepository0.delete("");
        com.yorku.lab.repository.UserRepository userRepository15 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional17 = userRepository15.findByEmail("");
        userRepository15.delete("");
        java.util.List<com.yorku.lab.model.User> userList20 = userRepository15.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional22 = userRepository15.findByEmail("hi!");
        java.util.List<com.yorku.lab.model.User> userList23 = userRepository15.findAll();
        userRepository0.saveAll(userList23);
        com.yorku.lab.model.User user25 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository0.save(user25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userArray8);
        org.junit.Assert.assertArrayEquals(userArray8, new com.yorku.lab.model.User[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(userOptional17);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(userOptional22);
        org.junit.Assert.assertNotNull(userList23);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList3 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional5 = userRepository0.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional7 = userRepository0.findByEmail("");
        com.yorku.lab.model.User user8 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository0.save(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userOptional7);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        userRepository0.delete("");
        java.util.List<com.yorku.lab.model.User> userList5 = userRepository0.findAll();
        com.yorku.lab.model.User user6 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository0.save(user6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userList5);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("hi!");
        java.util.Optional<com.yorku.lab.model.User> userOptional4 = userRepository0.findByEmail("");
        userRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository0.findByEmail("");
        java.lang.Class<?> wildcardClass9 = userRepository0.getClass();
        org.junit.Assert.assertNotNull(userOptional4);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList3 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional5 = userRepository0.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList6 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository0.saveAll(userList6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional5);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("hi!");
        java.util.Optional<com.yorku.lab.model.User> userOptional4 = userRepository0.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList5 = userRepository0.findAll();
        com.yorku.lab.repository.UserRepository userRepository6 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository6.findByEmail("");
        userRepository6.delete("");
        com.yorku.lab.repository.UserRepository userRepository11 = new com.yorku.lab.repository.UserRepository();
        userRepository11.delete("");
        com.yorku.lab.model.User[] userArray14 = new com.yorku.lab.model.User[] {};
        java.util.ArrayList<com.yorku.lab.model.User> userList15 = new java.util.ArrayList<com.yorku.lab.model.User>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.User>) userList15, userArray14);
        userRepository11.saveAll((java.util.List<com.yorku.lab.model.User>) userList15);
        userRepository6.saveAll((java.util.List<com.yorku.lab.model.User>) userList15);
        userRepository6.delete("");
        com.yorku.lab.repository.UserRepository userRepository21 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional23 = userRepository21.findByEmail("");
        userRepository21.delete("");
        java.util.List<com.yorku.lab.model.User> userList26 = userRepository21.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional28 = userRepository21.findByEmail("hi!");
        java.util.List<com.yorku.lab.model.User> userList29 = userRepository21.findAll();
        userRepository6.saveAll(userList29);
        userRepository0.saveAll(userList29);
        com.yorku.lab.model.User user32 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository0.save(user32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional4);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userArray14);
        org.junit.Assert.assertArrayEquals(userArray14, new com.yorku.lab.model.User[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(userOptional23);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertNotNull(userOptional28);
        org.junit.Assert.assertNotNull(userList29);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        userRepository0.delete("");
        com.yorku.lab.repository.UserRepository userRepository5 = new com.yorku.lab.repository.UserRepository();
        userRepository5.delete("");
        com.yorku.lab.model.User[] userArray8 = new com.yorku.lab.model.User[] {};
        java.util.ArrayList<com.yorku.lab.model.User> userList9 = new java.util.ArrayList<com.yorku.lab.model.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.User>) userList9, userArray8);
        userRepository5.saveAll((java.util.List<com.yorku.lab.model.User>) userList9);
        userRepository0.saveAll((java.util.List<com.yorku.lab.model.User>) userList9);
        userRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.User> userOptional16 = userRepository0.findByEmail("hi!");
        java.lang.Class<?> wildcardClass17 = userOptional16.getClass();
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userArray8);
        org.junit.Assert.assertArrayEquals(userArray8, new com.yorku.lab.model.User[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(userOptional16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList3 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional5 = userRepository0.findById("");
        java.util.List<com.yorku.lab.model.User> userList6 = userRepository0.findAll();
        com.yorku.lab.model.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository0.save(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("");
        com.yorku.lab.model.User[] userArray3 = new com.yorku.lab.model.User[] {};
        java.util.ArrayList<com.yorku.lab.model.User> userList4 = new java.util.ArrayList<com.yorku.lab.model.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.User>) userList4, userArray3);
        userRepository0.saveAll((java.util.List<com.yorku.lab.model.User>) userList4);
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository0.findByEmail("hi!");
        userRepository0.delete("");
        com.yorku.lab.model.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository0.save(user11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new com.yorku.lab.model.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userOptional8);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        com.yorku.lab.model.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository0.save(user1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList3 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional5 = userRepository0.findById("");
        java.util.List<com.yorku.lab.model.User> userList6 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository0.saveAll(userList6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional5);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        userRepository0.delete("");
        com.yorku.lab.repository.UserRepository userRepository5 = new com.yorku.lab.repository.UserRepository();
        userRepository5.delete("");
        com.yorku.lab.model.User[] userArray8 = new com.yorku.lab.model.User[] {};
        java.util.ArrayList<com.yorku.lab.model.User> userList9 = new java.util.ArrayList<com.yorku.lab.model.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.User>) userList9, userArray8);
        userRepository5.saveAll((java.util.List<com.yorku.lab.model.User>) userList9);
        userRepository0.saveAll((java.util.List<com.yorku.lab.model.User>) userList9);
        userRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.User> userOptional16 = userRepository0.findByEmail("hi!");
        com.yorku.lab.model.User user17 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository0.save(user17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userArray8);
        org.junit.Assert.assertArrayEquals(userArray8, new com.yorku.lab.model.User[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(userOptional16);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        userRepository0.delete("");
        java.util.List<com.yorku.lab.model.User> userList5 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional7 = userRepository0.findByEmail("");
        java.lang.Class<?> wildcardClass8 = userOptional7.getClass();
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList3 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional5 = userRepository0.findById("");
        java.util.List<com.yorku.lab.model.User> userList6 = userRepository0.findAll();
        java.lang.Class<?> wildcardClass7 = userRepository0.getClass();
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("hi!");
        java.util.Optional<com.yorku.lab.model.User> userOptional4 = userRepository0.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList5 = userRepository0.findAll();
        com.yorku.lab.model.User user6 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository0.save(user6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional4);
        org.junit.Assert.assertNotNull(userList5);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList3 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional5 = userRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.User> userOptional7 = userRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.User> userOptional9 = userRepository0.findByEmail("");
        java.lang.Class<?> wildcardClass10 = userOptional9.getClass();
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("");
        com.yorku.lab.model.User[] userArray3 = new com.yorku.lab.model.User[] {};
        java.util.ArrayList<com.yorku.lab.model.User> userList4 = new java.util.ArrayList<com.yorku.lab.model.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.User>) userList4, userArray3);
        userRepository0.saveAll((java.util.List<com.yorku.lab.model.User>) userList4);
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository0.findByEmail("");
        java.lang.Class<?> wildcardClass9 = userOptional8.getClass();
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new com.yorku.lab.model.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        userRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.User> userOptional6 = userRepository0.findByEmail("");
        userRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.User> userOptional10 = userRepository0.findByEmail("hi!");
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(userOptional10);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        userRepository0.delete("");
        java.util.List<com.yorku.lab.model.User> userList5 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional7 = userRepository0.findByEmail("hi!");
        java.util.List<com.yorku.lab.model.User> userList8 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional10 = userRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.User> userOptional12 = userRepository0.findByEmail("");
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertNotNull(userOptional12);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList3 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional5 = userRepository0.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional7 = userRepository0.findByEmail("");
        userRepository0.delete("hi!");
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userOptional7);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList3 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional5 = userRepository0.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional7 = userRepository0.findById("");
        userRepository0.delete("hi!");
        java.lang.Class<?> wildcardClass10 = userRepository0.getClass();
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList3 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional5 = userRepository0.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional7 = userRepository0.findByEmail("");
        userRepository0.delete("");
        com.yorku.lab.repository.UserRepository userRepository10 = new com.yorku.lab.repository.UserRepository();
        userRepository10.delete("");
        com.yorku.lab.model.User[] userArray13 = new com.yorku.lab.model.User[] {};
        java.util.ArrayList<com.yorku.lab.model.User> userList14 = new java.util.ArrayList<com.yorku.lab.model.User>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.User>) userList14, userArray13);
        userRepository10.saveAll((java.util.List<com.yorku.lab.model.User>) userList14);
        java.util.Optional<com.yorku.lab.model.User> userOptional18 = userRepository10.findByEmail("hi!");
        java.util.List<com.yorku.lab.model.User> userList19 = userRepository10.findAll();
        userRepository0.saveAll(userList19);
        java.lang.Class<?> wildcardClass21 = userRepository0.getClass();
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userArray13);
        org.junit.Assert.assertArrayEquals(userArray13, new com.yorku.lab.model.User[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(userOptional18);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        userRepository0.delete("");
        java.util.List<com.yorku.lab.model.User> userList5 = userRepository0.findAll();
        java.lang.Class<?> wildcardClass6 = userRepository0.getClass();
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("");
        userRepository0.delete("hi!");
        java.util.Optional<com.yorku.lab.model.User> userOptional6 = userRepository0.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository0.findById("");
        java.lang.Class<?> wildcardClass9 = userRepository0.getClass();
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("");
        com.yorku.lab.model.User[] userArray3 = new com.yorku.lab.model.User[] {};
        java.util.ArrayList<com.yorku.lab.model.User> userList4 = new java.util.ArrayList<com.yorku.lab.model.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.User>) userList4, userArray3);
        userRepository0.saveAll((java.util.List<com.yorku.lab.model.User>) userList4);
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository0.findByEmail("hi!");
        userRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.User> userOptional12 = userRepository0.findById("");
        java.util.List<com.yorku.lab.model.User> userList13 = userRepository0.findAll();
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new com.yorku.lab.model.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertNotNull(userList13);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("");
        userRepository0.delete("hi!");
        java.util.Optional<com.yorku.lab.model.User> userOptional6 = userRepository0.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList7 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository0.saveAll(userList7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional6);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("");
        com.yorku.lab.model.User[] userArray3 = new com.yorku.lab.model.User[] {};
        java.util.ArrayList<com.yorku.lab.model.User> userList4 = new java.util.ArrayList<com.yorku.lab.model.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.User>) userList4, userArray3);
        userRepository0.saveAll((java.util.List<com.yorku.lab.model.User>) userList4);
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository0.findByEmail("hi!");
        userRepository0.delete("");
        java.lang.Class<?> wildcardClass11 = userRepository0.getClass();
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new com.yorku.lab.model.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList3 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional5 = userRepository0.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional7 = userRepository0.findById("");
        java.lang.Class<?> wildcardClass8 = userRepository0.getClass();
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("hi!");
        com.yorku.lab.repository.UserRepository userRepository3 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional5 = userRepository3.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList6 = userRepository3.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository3.findById("");
        java.util.List<com.yorku.lab.model.User> userList9 = userRepository3.findAll();
        userRepository0.saveAll(userList9);
        com.yorku.lab.repository.UserRepository userRepository11 = new com.yorku.lab.repository.UserRepository();
        userRepository11.delete("");
        com.yorku.lab.model.User[] userArray14 = new com.yorku.lab.model.User[] {};
        java.util.ArrayList<com.yorku.lab.model.User> userList15 = new java.util.ArrayList<com.yorku.lab.model.User>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.User>) userList15, userArray14);
        userRepository11.saveAll((java.util.List<com.yorku.lab.model.User>) userList15);
        java.util.Optional<com.yorku.lab.model.User> userOptional19 = userRepository11.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional21 = userRepository11.findByEmail("hi!");
        java.util.List<com.yorku.lab.model.User> userList22 = userRepository11.findAll();
        userRepository0.saveAll(userList22);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userArray14);
        org.junit.Assert.assertArrayEquals(userArray14, new com.yorku.lab.model.User[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(userOptional19);
        org.junit.Assert.assertNotNull(userOptional21);
        org.junit.Assert.assertNotNull(userList22);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("hi!");
        com.yorku.lab.repository.UserRepository userRepository3 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional5 = userRepository3.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList6 = userRepository3.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository3.findById("");
        java.util.List<com.yorku.lab.model.User> userList9 = userRepository3.findAll();
        userRepository0.saveAll(userList9);
        com.yorku.lab.repository.UserRepository userRepository11 = new com.yorku.lab.repository.UserRepository();
        userRepository11.delete("");
        userRepository11.delete("hi!");
        java.util.Optional<com.yorku.lab.model.User> userOptional17 = userRepository11.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList18 = userRepository11.findAll();
        userRepository0.saveAll(userList18);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userOptional17);
        org.junit.Assert.assertNotNull(userList18);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("");
        com.yorku.lab.model.User[] userArray3 = new com.yorku.lab.model.User[] {};
        java.util.ArrayList<com.yorku.lab.model.User> userList4 = new java.util.ArrayList<com.yorku.lab.model.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.User>) userList4, userArray3);
        userRepository0.saveAll((java.util.List<com.yorku.lab.model.User>) userList4);
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository0.findByEmail("hi!");
        userRepository0.delete("hi!");
        com.yorku.lab.model.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository0.save(user11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new com.yorku.lab.model.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userOptional8);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.User> userOptional4 = userRepository0.findByEmail("");
        com.yorku.lab.model.User user5 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository0.save(user5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional4);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("");
        com.yorku.lab.model.User[] userArray3 = new com.yorku.lab.model.User[] {};
        java.util.ArrayList<com.yorku.lab.model.User> userList4 = new java.util.ArrayList<com.yorku.lab.model.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.User>) userList4, userArray3);
        userRepository0.saveAll((java.util.List<com.yorku.lab.model.User>) userList4);
        userRepository0.delete("");
        java.util.List<com.yorku.lab.model.User> userList9 = userRepository0.findAll();
        com.yorku.lab.model.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository0.save(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new com.yorku.lab.model.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userList9);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList3 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional5 = userRepository0.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional7 = userRepository0.findByEmail("");
        java.lang.Class<?> wildcardClass8 = userRepository0.getClass();
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("hi!");
        java.util.List<com.yorku.lab.model.User> userList3 = userRepository0.findAll();
        com.yorku.lab.model.User user4 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository0.save(user4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList3);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("");
        com.yorku.lab.model.User[] userArray3 = new com.yorku.lab.model.User[] {};
        java.util.ArrayList<com.yorku.lab.model.User> userList4 = new java.util.ArrayList<com.yorku.lab.model.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.User>) userList4, userArray3);
        userRepository0.saveAll((java.util.List<com.yorku.lab.model.User>) userList4);
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository0.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional10 = userRepository0.findByEmail("hi!");
        java.lang.Class<?> wildcardClass11 = userRepository0.getClass();
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new com.yorku.lab.model.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("");
        com.yorku.lab.model.User[] userArray3 = new com.yorku.lab.model.User[] {};
        java.util.ArrayList<com.yorku.lab.model.User> userList4 = new java.util.ArrayList<com.yorku.lab.model.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.User>) userList4, userArray3);
        userRepository0.saveAll((java.util.List<com.yorku.lab.model.User>) userList4);
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository0.findByEmail("hi!");
        userRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.User> userOptional12 = userRepository0.findByEmail("hi!");
        com.yorku.lab.repository.UserRepository userRepository13 = new com.yorku.lab.repository.UserRepository();
        userRepository13.delete("");
        userRepository13.delete("hi!");
        java.util.List<com.yorku.lab.model.User> userList18 = userRepository13.findAll();
        userRepository0.saveAll(userList18);
        java.util.List<com.yorku.lab.model.User> userList20 = userRepository0.findAll();
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new com.yorku.lab.model.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(userList20);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("");
        userRepository0.delete("hi!");
        java.util.Optional<com.yorku.lab.model.User> userOptional6 = userRepository0.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList7 = userRepository0.findAll();
        userRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.User> userOptional11 = userRepository0.findByEmail("");
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userOptional11);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        userRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.User> userOptional6 = userRepository0.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository0.findByEmail("hi!");
        java.util.Optional<com.yorku.lab.model.User> userOptional10 = userRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.User> userOptional12 = userRepository0.findById("hi!");
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertNotNull(userOptional12);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList3 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional5 = userRepository0.findByEmail("");
        java.lang.Class<?> wildcardClass6 = userRepository0.getClass();
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList3 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional5 = userRepository0.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional7 = userRepository0.findById("");
        java.util.List<com.yorku.lab.model.User> userList8 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional10 = userRepository0.findByEmail("hi!");
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userOptional10);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        userRepository0.delete("");
        com.yorku.lab.repository.UserRepository userRepository5 = new com.yorku.lab.repository.UserRepository();
        userRepository5.delete("");
        com.yorku.lab.model.User[] userArray8 = new com.yorku.lab.model.User[] {};
        java.util.ArrayList<com.yorku.lab.model.User> userList9 = new java.util.ArrayList<com.yorku.lab.model.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.User>) userList9, userArray8);
        userRepository5.saveAll((java.util.List<com.yorku.lab.model.User>) userList9);
        userRepository0.saveAll((java.util.List<com.yorku.lab.model.User>) userList9);
        userRepository0.delete("");
        com.yorku.lab.repository.UserRepository userRepository15 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional17 = userRepository15.findByEmail("");
        userRepository15.delete("");
        java.util.List<com.yorku.lab.model.User> userList20 = userRepository15.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional22 = userRepository15.findByEmail("hi!");
        java.util.List<com.yorku.lab.model.User> userList23 = userRepository15.findAll();
        userRepository0.saveAll(userList23);
        userRepository0.delete("hi!");
        java.util.List<com.yorku.lab.model.User> userList27 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository0.saveAll(userList27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userArray8);
        org.junit.Assert.assertArrayEquals(userArray8, new com.yorku.lab.model.User[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(userOptional17);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(userOptional22);
        org.junit.Assert.assertNotNull(userList23);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList3 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional5 = userRepository0.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional7 = userRepository0.findById("hi!");
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userOptional7);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        com.yorku.lab.repository.UserRepository userRepository3 = new com.yorku.lab.repository.UserRepository();
        userRepository3.delete("hi!");
        com.yorku.lab.repository.UserRepository userRepository6 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository6.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList9 = userRepository6.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional11 = userRepository6.findById("");
        java.util.List<com.yorku.lab.model.User> userList12 = userRepository6.findAll();
        userRepository3.saveAll(userList12);
        userRepository0.saveAll(userList12);
        java.util.List<com.yorku.lab.model.User> userList15 = userRepository0.findAll();
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userOptional11);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(userList15);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("");
        com.yorku.lab.model.User[] userArray3 = new com.yorku.lab.model.User[] {};
        java.util.ArrayList<com.yorku.lab.model.User> userList4 = new java.util.ArrayList<com.yorku.lab.model.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.User>) userList4, userArray3);
        userRepository0.saveAll((java.util.List<com.yorku.lab.model.User>) userList4);
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository0.findByEmail("");
        userRepository0.delete("hi!");
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new com.yorku.lab.model.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userOptional8);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        userRepository0.delete("");
        com.yorku.lab.repository.UserRepository userRepository5 = new com.yorku.lab.repository.UserRepository();
        userRepository5.delete("hi!");
        java.util.List<com.yorku.lab.model.User> userList8 = userRepository5.findAll();
        userRepository0.saveAll(userList8);
        com.yorku.lab.model.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository0.save(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userList8);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("hi!");
        com.yorku.lab.repository.UserRepository userRepository3 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional5 = userRepository3.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList6 = userRepository3.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository3.findById("");
        java.util.List<com.yorku.lab.model.User> userList9 = userRepository3.findAll();
        userRepository0.saveAll(userList9);
        java.util.Optional<com.yorku.lab.model.User> userOptional12 = userRepository0.findById("hi!");
        userRepository0.delete("");
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userOptional12);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList3 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional5 = userRepository0.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional7 = userRepository0.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList8 = userRepository0.findAll();
        java.util.List<com.yorku.lab.model.User> userList9 = userRepository0.findAll();
        java.lang.Class<?> wildcardClass10 = userRepository0.getClass();
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList3 = userRepository0.findAll();
        java.util.List<com.yorku.lab.model.User> userList4 = userRepository0.findAll();
        java.lang.Class<?> wildcardClass5 = userRepository0.getClass();
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        userRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.User> userOptional6 = userRepository0.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository0.findByEmail("hi!");
        java.util.Optional<com.yorku.lab.model.User> userOptional10 = userRepository0.findById("");
        java.util.List<com.yorku.lab.model.User> userList11 = userRepository0.findAll();
        java.util.List<com.yorku.lab.model.User> userList12 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository0.saveAll(userList12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertNotNull(userList11);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        userRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.User> userOptional6 = userRepository0.findByEmail("");
        userRepository0.delete("");
        java.util.List<com.yorku.lab.model.User> userList9 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository0.saveAll(userList9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userOptional6);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        userRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.User> userOptional6 = userRepository0.findById("");
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userOptional6);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("hi!");
        com.yorku.lab.repository.UserRepository userRepository3 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional5 = userRepository3.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList6 = userRepository3.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository3.findById("");
        java.util.List<com.yorku.lab.model.User> userList9 = userRepository3.findAll();
        userRepository0.saveAll(userList9);
        java.util.List<com.yorku.lab.model.User> userList11 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository0.saveAll(userList11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userList9);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList3 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional5 = userRepository0.findById("");
        userRepository0.delete("hi!");
        userRepository0.delete("");
        java.lang.Class<?> wildcardClass10 = userRepository0.getClass();
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        userRepository0.delete("");
        com.yorku.lab.repository.UserRepository userRepository5 = new com.yorku.lab.repository.UserRepository();
        userRepository5.delete("");
        com.yorku.lab.model.User[] userArray8 = new com.yorku.lab.model.User[] {};
        java.util.ArrayList<com.yorku.lab.model.User> userList9 = new java.util.ArrayList<com.yorku.lab.model.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.User>) userList9, userArray8);
        userRepository5.saveAll((java.util.List<com.yorku.lab.model.User>) userList9);
        userRepository0.saveAll((java.util.List<com.yorku.lab.model.User>) userList9);
        userRepository0.delete("");
        com.yorku.lab.repository.UserRepository userRepository15 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional17 = userRepository15.findByEmail("");
        userRepository15.delete("");
        java.util.List<com.yorku.lab.model.User> userList20 = userRepository15.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional22 = userRepository15.findByEmail("hi!");
        java.util.List<com.yorku.lab.model.User> userList23 = userRepository15.findAll();
        userRepository0.saveAll(userList23);
        userRepository0.delete("hi!");
        userRepository0.delete("");
        java.util.List<com.yorku.lab.model.User> userList29 = userRepository0.findAll();
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userArray8);
        org.junit.Assert.assertArrayEquals(userArray8, new com.yorku.lab.model.User[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(userOptional17);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(userOptional22);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userList29);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("");
        userRepository0.delete("");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList3 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional5 = userRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.User> userOptional7 = userRepository0.findByEmail("");
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userOptional7);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("hi!");
        java.util.Optional<com.yorku.lab.model.User> userOptional4 = userRepository0.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList5 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository0.saveAll(userList5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional4);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        userRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.User> userOptional6 = userRepository0.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository0.findByEmail("hi!");
        java.util.Optional<com.yorku.lab.model.User> userOptional10 = userRepository0.findById("");
        java.lang.Class<?> wildcardClass11 = userRepository0.getClass();
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("hi!");
        java.util.Optional<com.yorku.lab.model.User> userOptional4 = userRepository0.findByEmail("");
        userRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository0.findByEmail("");
        com.yorku.lab.model.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository0.save(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional4);
        org.junit.Assert.assertNotNull(userOptional8);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("hi!");
        java.util.Optional<com.yorku.lab.model.User> userOptional4 = userRepository0.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList5 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional7 = userRepository0.findByEmail("");
        userRepository0.delete("");
        java.util.List<com.yorku.lab.model.User> userList10 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository0.saveAll(userList10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional4);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userOptional7);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("hi!");
        java.util.Optional<com.yorku.lab.model.User> userOptional4 = userRepository0.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList5 = userRepository0.findAll();
        com.yorku.lab.repository.UserRepository userRepository6 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository6.findByEmail("");
        userRepository6.delete("");
        com.yorku.lab.repository.UserRepository userRepository11 = new com.yorku.lab.repository.UserRepository();
        userRepository11.delete("");
        com.yorku.lab.model.User[] userArray14 = new com.yorku.lab.model.User[] {};
        java.util.ArrayList<com.yorku.lab.model.User> userList15 = new java.util.ArrayList<com.yorku.lab.model.User>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.User>) userList15, userArray14);
        userRepository11.saveAll((java.util.List<com.yorku.lab.model.User>) userList15);
        userRepository6.saveAll((java.util.List<com.yorku.lab.model.User>) userList15);
        userRepository6.delete("");
        com.yorku.lab.repository.UserRepository userRepository21 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional23 = userRepository21.findByEmail("");
        userRepository21.delete("");
        java.util.List<com.yorku.lab.model.User> userList26 = userRepository21.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional28 = userRepository21.findByEmail("hi!");
        java.util.List<com.yorku.lab.model.User> userList29 = userRepository21.findAll();
        userRepository6.saveAll(userList29);
        userRepository0.saveAll(userList29);
        com.yorku.lab.repository.UserRepository userRepository32 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional34 = userRepository32.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList35 = userRepository32.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional37 = userRepository32.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional39 = userRepository32.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList40 = userRepository32.findAll();
        java.util.List<com.yorku.lab.model.User> userList41 = userRepository32.findAll();
        userRepository0.saveAll(userList41);
        org.junit.Assert.assertNotNull(userOptional4);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userArray14);
        org.junit.Assert.assertArrayEquals(userArray14, new com.yorku.lab.model.User[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(userOptional23);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertNotNull(userOptional28);
        org.junit.Assert.assertNotNull(userList29);
        org.junit.Assert.assertNotNull(userOptional34);
        org.junit.Assert.assertNotNull(userList35);
        org.junit.Assert.assertNotNull(userOptional37);
        org.junit.Assert.assertNotNull(userOptional39);
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(userList41);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("");
        com.yorku.lab.model.User[] userArray3 = new com.yorku.lab.model.User[] {};
        java.util.ArrayList<com.yorku.lab.model.User> userList4 = new java.util.ArrayList<com.yorku.lab.model.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.User>) userList4, userArray3);
        userRepository0.saveAll((java.util.List<com.yorku.lab.model.User>) userList4);
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository0.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional10 = userRepository0.findByEmail("hi!");
        java.util.List<com.yorku.lab.model.User> userList11 = userRepository0.findAll();
        com.yorku.lab.repository.UserRepository userRepository12 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional14 = userRepository12.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList15 = userRepository12.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional17 = userRepository12.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional19 = userRepository12.findById("");
        userRepository12.delete("hi!");
        com.yorku.lab.repository.UserRepository userRepository22 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional24 = userRepository22.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList25 = userRepository22.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional27 = userRepository22.findById("");
        java.util.List<com.yorku.lab.model.User> userList28 = userRepository22.findAll();
        java.util.List<com.yorku.lab.model.User> userList29 = userRepository22.findAll();
        userRepository12.saveAll(userList29);
        userRepository0.saveAll(userList29);
        userRepository0.delete("hi!");
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new com.yorku.lab.model.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(userOptional17);
        org.junit.Assert.assertNotNull(userOptional19);
        org.junit.Assert.assertNotNull(userOptional24);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(userOptional27);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(userList29);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        userRepository0.delete("");
        java.util.List<com.yorku.lab.model.User> userList5 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional7 = userRepository0.findByEmail("");
        userRepository0.delete("hi!");
        com.yorku.lab.model.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository0.save(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userOptional7);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList3 = userRepository0.findAll();
        userRepository0.delete("hi!");
        userRepository0.delete("");
        java.util.List<com.yorku.lab.model.User> userList8 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository0.saveAll(userList8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userList3);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        com.yorku.lab.repository.UserRepository userRepository3 = new com.yorku.lab.repository.UserRepository();
        userRepository3.delete("hi!");
        com.yorku.lab.repository.UserRepository userRepository6 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository6.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList9 = userRepository6.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional11 = userRepository6.findById("");
        java.util.List<com.yorku.lab.model.User> userList12 = userRepository6.findAll();
        userRepository3.saveAll(userList12);
        userRepository0.saveAll(userList12);
        userRepository0.delete("hi!");
        com.yorku.lab.model.User user17 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository0.save(user17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userOptional11);
        org.junit.Assert.assertNotNull(userList12);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("");
        com.yorku.lab.model.User[] userArray3 = new com.yorku.lab.model.User[] {};
        java.util.ArrayList<com.yorku.lab.model.User> userList4 = new java.util.ArrayList<com.yorku.lab.model.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.User>) userList4, userArray3);
        userRepository0.saveAll((java.util.List<com.yorku.lab.model.User>) userList4);
        userRepository0.delete("");
        java.util.List<com.yorku.lab.model.User> userList9 = userRepository0.findAll();
        userRepository0.delete("");
        java.util.List<com.yorku.lab.model.User> userList12 = userRepository0.findAll();
        com.yorku.lab.repository.UserRepository userRepository13 = new com.yorku.lab.repository.UserRepository();
        userRepository13.delete("hi!");
        com.yorku.lab.repository.UserRepository userRepository16 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional18 = userRepository16.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList19 = userRepository16.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional21 = userRepository16.findById("");
        java.util.List<com.yorku.lab.model.User> userList22 = userRepository16.findAll();
        userRepository13.saveAll(userList22);
        userRepository0.saveAll(userList22);
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new com.yorku.lab.model.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(userOptional18);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(userOptional21);
        org.junit.Assert.assertNotNull(userList22);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList3 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional5 = userRepository0.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional7 = userRepository0.findById("");
        userRepository0.delete("hi!");
        userRepository0.delete("hi!");
        userRepository0.delete("");
        com.yorku.lab.model.User user14 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository0.save(user14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userOptional7);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("hi!");
        com.yorku.lab.repository.UserRepository userRepository3 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional5 = userRepository3.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList6 = userRepository3.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository3.findById("");
        java.util.List<com.yorku.lab.model.User> userList9 = userRepository3.findAll();
        userRepository0.saveAll(userList9);
        java.util.Optional<com.yorku.lab.model.User> userOptional12 = userRepository0.findById("hi!");
        com.yorku.lab.repository.UserRepository userRepository13 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional15 = userRepository13.findByEmail("");
        userRepository13.delete("");
        com.yorku.lab.repository.UserRepository userRepository18 = new com.yorku.lab.repository.UserRepository();
        userRepository18.delete("");
        com.yorku.lab.model.User[] userArray21 = new com.yorku.lab.model.User[] {};
        java.util.ArrayList<com.yorku.lab.model.User> userList22 = new java.util.ArrayList<com.yorku.lab.model.User>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.User>) userList22, userArray21);
        userRepository18.saveAll((java.util.List<com.yorku.lab.model.User>) userList22);
        userRepository13.saveAll((java.util.List<com.yorku.lab.model.User>) userList22);
        userRepository13.delete("");
        com.yorku.lab.repository.UserRepository userRepository28 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional30 = userRepository28.findByEmail("");
        userRepository28.delete("");
        java.util.List<com.yorku.lab.model.User> userList33 = userRepository28.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional35 = userRepository28.findByEmail("hi!");
        java.util.List<com.yorku.lab.model.User> userList36 = userRepository28.findAll();
        userRepository13.saveAll(userList36);
        userRepository0.saveAll(userList36);
        java.util.List<com.yorku.lab.model.User> userList39 = userRepository0.findAll();
        java.util.List<com.yorku.lab.model.User> userList40 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional42 = userRepository0.findByEmail("");
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertNotNull(userOptional15);
        org.junit.Assert.assertNotNull(userArray21);
        org.junit.Assert.assertArrayEquals(userArray21, new com.yorku.lab.model.User[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(userOptional30);
        org.junit.Assert.assertNotNull(userList33);
        org.junit.Assert.assertNotNull(userOptional35);
        org.junit.Assert.assertNotNull(userList36);
        org.junit.Assert.assertNotNull(userList39);
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(userOptional42);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("");
        com.yorku.lab.model.User[] userArray3 = new com.yorku.lab.model.User[] {};
        java.util.ArrayList<com.yorku.lab.model.User> userList4 = new java.util.ArrayList<com.yorku.lab.model.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.User>) userList4, userArray3);
        userRepository0.saveAll((java.util.List<com.yorku.lab.model.User>) userList4);
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository0.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional10 = userRepository0.findByEmail("hi!");
        java.util.List<com.yorku.lab.model.User> userList11 = userRepository0.findAll();
        userRepository0.delete("hi!");
        java.util.Optional<com.yorku.lab.model.User> userOptional15 = userRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.User> userOptional17 = userRepository0.findByEmail("hi!");
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new com.yorku.lab.model.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userOptional15);
        org.junit.Assert.assertNotNull(userOptional17);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("hi!");
        com.yorku.lab.repository.UserRepository userRepository3 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional5 = userRepository3.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList6 = userRepository3.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository3.findById("");
        java.util.List<com.yorku.lab.model.User> userList9 = userRepository3.findAll();
        userRepository0.saveAll(userList9);
        java.util.Optional<com.yorku.lab.model.User> userOptional12 = userRepository0.findById("hi!");
        com.yorku.lab.model.User user13 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository0.save(user13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userOptional12);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        userRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.User> userOptional6 = userRepository0.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository0.findByEmail("hi!");
        java.util.Optional<com.yorku.lab.model.User> userOptional10 = userRepository0.findById("");
        java.util.List<com.yorku.lab.model.User> userList11 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional13 = userRepository0.findByEmail("hi!");
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userOptional13);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("hi!");
        java.util.Optional<com.yorku.lab.model.User> userOptional4 = userRepository0.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional6 = userRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.User> userOptional10 = userRepository0.findByEmail("");
        org.junit.Assert.assertNotNull(userOptional4);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userOptional10);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("");
        userRepository0.delete("hi!");
        com.yorku.lab.repository.UserRepository userRepository5 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional7 = userRepository5.findByEmail("");
        userRepository5.delete("");
        com.yorku.lab.repository.UserRepository userRepository10 = new com.yorku.lab.repository.UserRepository();
        userRepository10.delete("");
        com.yorku.lab.model.User[] userArray13 = new com.yorku.lab.model.User[] {};
        java.util.ArrayList<com.yorku.lab.model.User> userList14 = new java.util.ArrayList<com.yorku.lab.model.User>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.User>) userList14, userArray13);
        userRepository10.saveAll((java.util.List<com.yorku.lab.model.User>) userList14);
        userRepository5.saveAll((java.util.List<com.yorku.lab.model.User>) userList14);
        userRepository0.saveAll((java.util.List<com.yorku.lab.model.User>) userList14);
        userRepository0.delete("");
        userRepository0.delete("hi!");
        java.lang.Class<?> wildcardClass23 = userRepository0.getClass();
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userArray13);
        org.junit.Assert.assertArrayEquals(userArray13, new com.yorku.lab.model.User[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("");
        userRepository0.delete("hi!");
        com.yorku.lab.repository.UserRepository userRepository5 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional7 = userRepository5.findByEmail("");
        userRepository5.delete("");
        com.yorku.lab.repository.UserRepository userRepository10 = new com.yorku.lab.repository.UserRepository();
        userRepository10.delete("");
        com.yorku.lab.model.User[] userArray13 = new com.yorku.lab.model.User[] {};
        java.util.ArrayList<com.yorku.lab.model.User> userList14 = new java.util.ArrayList<com.yorku.lab.model.User>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.User>) userList14, userArray13);
        userRepository10.saveAll((java.util.List<com.yorku.lab.model.User>) userList14);
        userRepository5.saveAll((java.util.List<com.yorku.lab.model.User>) userList14);
        userRepository0.saveAll((java.util.List<com.yorku.lab.model.User>) userList14);
        userRepository0.delete("");
        userRepository0.delete("hi!");
        userRepository0.delete("hi!");
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userArray13);
        org.junit.Assert.assertArrayEquals(userArray13, new com.yorku.lab.model.User[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("");
        com.yorku.lab.model.User[] userArray3 = new com.yorku.lab.model.User[] {};
        java.util.ArrayList<com.yorku.lab.model.User> userList4 = new java.util.ArrayList<com.yorku.lab.model.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.User>) userList4, userArray3);
        userRepository0.saveAll((java.util.List<com.yorku.lab.model.User>) userList4);
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository0.findByEmail("hi!");
        userRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.User> userOptional12 = userRepository0.findByEmail("hi!");
        java.util.List<com.yorku.lab.model.User> userList13 = userRepository0.findAll();
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new com.yorku.lab.model.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertNotNull(userList13);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList3 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional5 = userRepository0.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional7 = userRepository0.findById("");
        java.util.List<com.yorku.lab.model.User> userList8 = userRepository0.findAll();
        java.lang.Class<?> wildcardClass9 = userRepository0.getClass();
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList3 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional5 = userRepository0.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional7 = userRepository0.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList8 = userRepository0.findAll();
        userRepository0.delete("hi!");
        java.util.List<com.yorku.lab.model.User> userList11 = userRepository0.findAll();
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userList11);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("hi!");
        java.util.Optional<com.yorku.lab.model.User> userOptional4 = userRepository0.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList5 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional7 = userRepository0.findByEmail("");
        com.yorku.lab.repository.UserRepository userRepository8 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional10 = userRepository8.findByEmail("");
        userRepository8.delete("");
        java.util.Optional<com.yorku.lab.model.User> userOptional14 = userRepository8.findByEmail("");
        com.yorku.lab.repository.UserRepository userRepository15 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional17 = userRepository15.findByEmail("");
        com.yorku.lab.repository.UserRepository userRepository18 = new com.yorku.lab.repository.UserRepository();
        userRepository18.delete("hi!");
        com.yorku.lab.repository.UserRepository userRepository21 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional23 = userRepository21.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList24 = userRepository21.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional26 = userRepository21.findById("");
        java.util.List<com.yorku.lab.model.User> userList27 = userRepository21.findAll();
        userRepository18.saveAll(userList27);
        userRepository15.saveAll(userList27);
        userRepository8.saveAll(userList27);
        userRepository0.saveAll(userList27);
        java.util.Optional<com.yorku.lab.model.User> userOptional33 = userRepository0.findById("");
        org.junit.Assert.assertNotNull(userOptional4);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userOptional17);
        org.junit.Assert.assertNotNull(userOptional23);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(userOptional26);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(userOptional33);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("");
        com.yorku.lab.model.User[] userArray3 = new com.yorku.lab.model.User[] {};
        java.util.ArrayList<com.yorku.lab.model.User> userList4 = new java.util.ArrayList<com.yorku.lab.model.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.User>) userList4, userArray3);
        userRepository0.saveAll((java.util.List<com.yorku.lab.model.User>) userList4);
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository0.findByEmail("hi!");
        java.util.List<com.yorku.lab.model.User> userList9 = userRepository0.findAll();
        userRepository0.delete("");
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new com.yorku.lab.model.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userList9);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList3 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional5 = userRepository0.findById("");
        java.util.List<com.yorku.lab.model.User> userList6 = userRepository0.findAll();
        java.util.List<com.yorku.lab.model.User> userList7 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional9 = userRepository0.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional11 = userRepository0.findById("");
        java.lang.Class<?> wildcardClass12 = userRepository0.getClass();
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertNotNull(userOptional11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("");
        com.yorku.lab.model.User[] userArray3 = new com.yorku.lab.model.User[] {};
        java.util.ArrayList<com.yorku.lab.model.User> userList4 = new java.util.ArrayList<com.yorku.lab.model.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.User>) userList4, userArray3);
        userRepository0.saveAll((java.util.List<com.yorku.lab.model.User>) userList4);
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository0.findByEmail("hi!");
        userRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.User> userOptional12 = userRepository0.findByEmail("hi!");
        java.util.Optional<com.yorku.lab.model.User> userOptional14 = userRepository0.findByEmail("");
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new com.yorku.lab.model.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertNotNull(userOptional14);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList3 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional5 = userRepository0.findById("");
        java.util.List<com.yorku.lab.model.User> userList6 = userRepository0.findAll();
        java.util.List<com.yorku.lab.model.User> userList7 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional9 = userRepository0.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional11 = userRepository0.findById("hi!");
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertNotNull(userOptional11);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("hi!");
        java.util.Optional<com.yorku.lab.model.User> userOptional4 = userRepository0.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList5 = userRepository0.findAll();
        java.util.List<com.yorku.lab.model.User> userList6 = userRepository0.findAll();
        com.yorku.lab.repository.UserRepository userRepository7 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional9 = userRepository7.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList10 = userRepository7.findAll();
        userRepository0.saveAll(userList10);
        org.junit.Assert.assertNotNull(userOptional4);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertNotNull(userList10);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("hi!");
        com.yorku.lab.repository.UserRepository userRepository3 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional5 = userRepository3.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList6 = userRepository3.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository3.findById("");
        java.util.List<com.yorku.lab.model.User> userList9 = userRepository3.findAll();
        userRepository0.saveAll(userList9);
        java.util.Optional<com.yorku.lab.model.User> userOptional12 = userRepository0.findById("hi!");
        com.yorku.lab.repository.UserRepository userRepository13 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional15 = userRepository13.findByEmail("");
        userRepository13.delete("");
        com.yorku.lab.repository.UserRepository userRepository18 = new com.yorku.lab.repository.UserRepository();
        userRepository18.delete("");
        com.yorku.lab.model.User[] userArray21 = new com.yorku.lab.model.User[] {};
        java.util.ArrayList<com.yorku.lab.model.User> userList22 = new java.util.ArrayList<com.yorku.lab.model.User>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.User>) userList22, userArray21);
        userRepository18.saveAll((java.util.List<com.yorku.lab.model.User>) userList22);
        userRepository13.saveAll((java.util.List<com.yorku.lab.model.User>) userList22);
        userRepository13.delete("");
        com.yorku.lab.repository.UserRepository userRepository28 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional30 = userRepository28.findByEmail("");
        userRepository28.delete("");
        java.util.List<com.yorku.lab.model.User> userList33 = userRepository28.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional35 = userRepository28.findByEmail("hi!");
        java.util.List<com.yorku.lab.model.User> userList36 = userRepository28.findAll();
        userRepository13.saveAll(userList36);
        userRepository0.saveAll(userList36);
        java.util.Optional<com.yorku.lab.model.User> userOptional40 = userRepository0.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional42 = userRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.User> userOptional44 = userRepository0.findById("");
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertNotNull(userOptional15);
        org.junit.Assert.assertNotNull(userArray21);
        org.junit.Assert.assertArrayEquals(userArray21, new com.yorku.lab.model.User[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(userOptional30);
        org.junit.Assert.assertNotNull(userList33);
        org.junit.Assert.assertNotNull(userOptional35);
        org.junit.Assert.assertNotNull(userList36);
        org.junit.Assert.assertNotNull(userOptional40);
        org.junit.Assert.assertNotNull(userOptional42);
        org.junit.Assert.assertNotNull(userOptional44);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("hi!");
        userRepository0.delete("");
        java.util.List<com.yorku.lab.model.User> userList5 = userRepository0.findAll();
        org.junit.Assert.assertNotNull(userList5);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("");
        userRepository0.delete("hi!");
        java.util.List<com.yorku.lab.model.User> userList5 = userRepository0.findAll();
        com.yorku.lab.model.User user6 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository0.save(user6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList5);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("");
        com.yorku.lab.model.User[] userArray3 = new com.yorku.lab.model.User[] {};
        java.util.ArrayList<com.yorku.lab.model.User> userList4 = new java.util.ArrayList<com.yorku.lab.model.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.User>) userList4, userArray3);
        userRepository0.saveAll((java.util.List<com.yorku.lab.model.User>) userList4);
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository0.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional10 = userRepository0.findByEmail("hi!");
        java.util.List<com.yorku.lab.model.User> userList11 = userRepository0.findAll();
        com.yorku.lab.repository.UserRepository userRepository12 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional14 = userRepository12.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList15 = userRepository12.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional17 = userRepository12.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional19 = userRepository12.findById("");
        userRepository12.delete("hi!");
        com.yorku.lab.repository.UserRepository userRepository22 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional24 = userRepository22.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList25 = userRepository22.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional27 = userRepository22.findById("");
        java.util.List<com.yorku.lab.model.User> userList28 = userRepository22.findAll();
        java.util.List<com.yorku.lab.model.User> userList29 = userRepository22.findAll();
        userRepository12.saveAll(userList29);
        userRepository0.saveAll(userList29);
        java.util.List<com.yorku.lab.model.User> userList32 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository0.saveAll(userList32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new com.yorku.lab.model.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(userOptional17);
        org.junit.Assert.assertNotNull(userOptional19);
        org.junit.Assert.assertNotNull(userOptional24);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(userOptional27);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(userList29);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("");
        com.yorku.lab.model.User[] userArray3 = new com.yorku.lab.model.User[] {};
        java.util.ArrayList<com.yorku.lab.model.User> userList4 = new java.util.ArrayList<com.yorku.lab.model.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.User>) userList4, userArray3);
        userRepository0.saveAll((java.util.List<com.yorku.lab.model.User>) userList4);
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository0.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional10 = userRepository0.findByEmail("hi!");
        java.util.List<com.yorku.lab.model.User> userList11 = userRepository0.findAll();
        com.yorku.lab.repository.UserRepository userRepository12 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional14 = userRepository12.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList15 = userRepository12.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional17 = userRepository12.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional19 = userRepository12.findById("");
        userRepository12.delete("hi!");
        com.yorku.lab.repository.UserRepository userRepository22 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional24 = userRepository22.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList25 = userRepository22.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional27 = userRepository22.findById("");
        java.util.List<com.yorku.lab.model.User> userList28 = userRepository22.findAll();
        java.util.List<com.yorku.lab.model.User> userList29 = userRepository22.findAll();
        userRepository12.saveAll(userList29);
        userRepository0.saveAll(userList29);
        com.yorku.lab.model.User user32 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository0.save(user32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new com.yorku.lab.model.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(userOptional17);
        org.junit.Assert.assertNotNull(userOptional19);
        org.junit.Assert.assertNotNull(userOptional24);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(userOptional27);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(userList29);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        userRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.User> userOptional6 = userRepository0.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository0.findByEmail("hi!");
        java.util.Optional<com.yorku.lab.model.User> userOptional10 = userRepository0.findById("");
        java.util.List<com.yorku.lab.model.User> userList11 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional13 = userRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.User> userOptional15 = userRepository0.findById("hi!");
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userOptional13);
        org.junit.Assert.assertNotNull(userOptional15);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("");
        com.yorku.lab.model.User[] userArray3 = new com.yorku.lab.model.User[] {};
        java.util.ArrayList<com.yorku.lab.model.User> userList4 = new java.util.ArrayList<com.yorku.lab.model.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.User>) userList4, userArray3);
        userRepository0.saveAll((java.util.List<com.yorku.lab.model.User>) userList4);
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository0.findByEmail("hi!");
        java.util.List<com.yorku.lab.model.User> userList9 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional11 = userRepository0.findByEmail("");
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new com.yorku.lab.model.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userOptional11);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("hi!");
        java.util.Optional<com.yorku.lab.model.User> userOptional4 = userRepository0.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional6 = userRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.User> userOptional10 = userRepository0.findById("");
        org.junit.Assert.assertNotNull(userOptional4);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userOptional10);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("hi!");
        java.util.Optional<com.yorku.lab.model.User> userOptional4 = userRepository0.findByEmail("");
        userRepository0.delete("hi!");
        org.junit.Assert.assertNotNull(userOptional4);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        userRepository0.delete("");
        userRepository0.delete("hi!");
        com.yorku.lab.model.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository0.save(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional2);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        userRepository0.delete("");
        java.util.List<com.yorku.lab.model.User> userList5 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional7 = userRepository0.findByEmail("hi!");
        java.util.List<com.yorku.lab.model.User> userList8 = userRepository0.findAll();
        com.yorku.lab.repository.UserRepository userRepository9 = new com.yorku.lab.repository.UserRepository();
        userRepository9.delete("");
        com.yorku.lab.model.User[] userArray12 = new com.yorku.lab.model.User[] {};
        java.util.ArrayList<com.yorku.lab.model.User> userList13 = new java.util.ArrayList<com.yorku.lab.model.User>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.User>) userList13, userArray12);
        userRepository9.saveAll((java.util.List<com.yorku.lab.model.User>) userList13);
        userRepository0.saveAll((java.util.List<com.yorku.lab.model.User>) userList13);
        java.lang.Class<?> wildcardClass17 = userRepository0.getClass();
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userArray12);
        org.junit.Assert.assertArrayEquals(userArray12, new com.yorku.lab.model.User[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        userRepository0.delete("");
        java.util.List<com.yorku.lab.model.User> userList5 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional7 = userRepository0.findByEmail("hi!");
        java.util.List<com.yorku.lab.model.User> userList8 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional10 = userRepository0.findById("");
        java.lang.Class<?> wildcardClass11 = userOptional10.getClass();
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList3 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional5 = userRepository0.findById("");
        java.util.List<com.yorku.lab.model.User> userList6 = userRepository0.findAll();
        java.util.List<com.yorku.lab.model.User> userList7 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional9 = userRepository0.findByEmail("");
        userRepository0.delete("");
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userOptional9);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("");
        userRepository0.delete("hi!");
        com.yorku.lab.repository.UserRepository userRepository5 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional7 = userRepository5.findByEmail("");
        userRepository5.delete("");
        com.yorku.lab.repository.UserRepository userRepository10 = new com.yorku.lab.repository.UserRepository();
        userRepository10.delete("");
        com.yorku.lab.model.User[] userArray13 = new com.yorku.lab.model.User[] {};
        java.util.ArrayList<com.yorku.lab.model.User> userList14 = new java.util.ArrayList<com.yorku.lab.model.User>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.User>) userList14, userArray13);
        userRepository10.saveAll((java.util.List<com.yorku.lab.model.User>) userList14);
        userRepository5.saveAll((java.util.List<com.yorku.lab.model.User>) userList14);
        userRepository0.saveAll((java.util.List<com.yorku.lab.model.User>) userList14);
        userRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.User> userOptional22 = userRepository0.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional24 = userRepository0.findByEmail("hi!");
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userArray13);
        org.junit.Assert.assertArrayEquals(userArray13, new com.yorku.lab.model.User[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(userOptional22);
        org.junit.Assert.assertNotNull(userOptional24);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        userRepository0.delete("");
        java.util.List<com.yorku.lab.model.User> userList5 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional7 = userRepository0.findByEmail("hi!");
        java.util.List<com.yorku.lab.model.User> userList8 = userRepository0.findAll();
        com.yorku.lab.repository.UserRepository userRepository9 = new com.yorku.lab.repository.UserRepository();
        userRepository9.delete("");
        com.yorku.lab.model.User[] userArray12 = new com.yorku.lab.model.User[] {};
        java.util.ArrayList<com.yorku.lab.model.User> userList13 = new java.util.ArrayList<com.yorku.lab.model.User>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.User>) userList13, userArray12);
        userRepository9.saveAll((java.util.List<com.yorku.lab.model.User>) userList13);
        userRepository0.saveAll((java.util.List<com.yorku.lab.model.User>) userList13);
        com.yorku.lab.model.User user17 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository0.save(user17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userArray12);
        org.junit.Assert.assertArrayEquals(userArray12, new com.yorku.lab.model.User[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("hi!");
        java.util.Optional<com.yorku.lab.model.User> userOptional4 = userRepository0.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional6 = userRepository0.findById("");
        java.util.List<com.yorku.lab.model.User> userList7 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository0.saveAll(userList7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional4);
        org.junit.Assert.assertNotNull(userOptional6);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("hi!");
        java.util.List<com.yorku.lab.model.User> userList3 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional5 = userRepository0.findById("");
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional5);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("");
        com.yorku.lab.model.User[] userArray3 = new com.yorku.lab.model.User[] {};
        java.util.ArrayList<com.yorku.lab.model.User> userList4 = new java.util.ArrayList<com.yorku.lab.model.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.User>) userList4, userArray3);
        userRepository0.saveAll((java.util.List<com.yorku.lab.model.User>) userList4);
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository0.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList9 = userRepository0.findAll();
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new com.yorku.lab.model.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userList9);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("");
        com.yorku.lab.model.User[] userArray3 = new com.yorku.lab.model.User[] {};
        java.util.ArrayList<com.yorku.lab.model.User> userList4 = new java.util.ArrayList<com.yorku.lab.model.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.User>) userList4, userArray3);
        userRepository0.saveAll((java.util.List<com.yorku.lab.model.User>) userList4);
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository0.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional10 = userRepository0.findByEmail("hi!");
        java.util.List<com.yorku.lab.model.User> userList11 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional13 = userRepository0.findById("");
        userRepository0.delete("hi!");
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new com.yorku.lab.model.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userOptional13);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("hi!");
        java.util.Optional<com.yorku.lab.model.User> userOptional4 = userRepository0.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional6 = userRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository0.findById("hi!");
        java.util.Optional<com.yorku.lab.model.User> userOptional10 = userRepository0.findByEmail("hi!");
        com.yorku.lab.repository.UserRepository userRepository11 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional13 = userRepository11.findByEmail("");
        userRepository11.delete("");
        java.util.Optional<com.yorku.lab.model.User> userOptional17 = userRepository11.findByEmail("");
        com.yorku.lab.repository.UserRepository userRepository18 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional20 = userRepository18.findByEmail("");
        com.yorku.lab.repository.UserRepository userRepository21 = new com.yorku.lab.repository.UserRepository();
        userRepository21.delete("hi!");
        com.yorku.lab.repository.UserRepository userRepository24 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional26 = userRepository24.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList27 = userRepository24.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional29 = userRepository24.findById("");
        java.util.List<com.yorku.lab.model.User> userList30 = userRepository24.findAll();
        userRepository21.saveAll(userList30);
        userRepository18.saveAll(userList30);
        userRepository11.saveAll(userList30);
        java.util.List<com.yorku.lab.model.User> userList34 = userRepository11.findAll();
        userRepository0.saveAll(userList34);
        org.junit.Assert.assertNotNull(userOptional4);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertNotNull(userOptional13);
        org.junit.Assert.assertNotNull(userOptional17);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertNotNull(userOptional26);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(userOptional29);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertNotNull(userList34);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("hi!");
        java.util.Optional<com.yorku.lab.model.User> userOptional4 = userRepository0.findByEmail("");
        userRepository0.delete("");
        userRepository0.delete("");
        org.junit.Assert.assertNotNull(userOptional4);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList3 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional5 = userRepository0.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional7 = userRepository0.findById("");
        userRepository0.delete("hi!");
        userRepository0.delete("hi!");
        userRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.User> userOptional15 = userRepository0.findByEmail("");
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userOptional15);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        userRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.User> userOptional6 = userRepository0.findByEmail("");
        com.yorku.lab.repository.UserRepository userRepository7 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional9 = userRepository7.findByEmail("");
        com.yorku.lab.repository.UserRepository userRepository10 = new com.yorku.lab.repository.UserRepository();
        userRepository10.delete("hi!");
        com.yorku.lab.repository.UserRepository userRepository13 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional15 = userRepository13.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList16 = userRepository13.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional18 = userRepository13.findById("");
        java.util.List<com.yorku.lab.model.User> userList19 = userRepository13.findAll();
        userRepository10.saveAll(userList19);
        userRepository7.saveAll(userList19);
        userRepository0.saveAll(userList19);
        java.util.List<com.yorku.lab.model.User> userList23 = userRepository0.findAll();
        userRepository0.delete("hi!");
        java.util.List<com.yorku.lab.model.User> userList26 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional28 = userRepository0.findByEmail("");
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertNotNull(userOptional15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(userOptional18);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertNotNull(userOptional28);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("hi!");
        com.yorku.lab.repository.UserRepository userRepository3 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional5 = userRepository3.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList6 = userRepository3.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository3.findById("");
        java.util.List<com.yorku.lab.model.User> userList9 = userRepository3.findAll();
        userRepository0.saveAll(userList9);
        java.util.Optional<com.yorku.lab.model.User> userOptional12 = userRepository0.findById("");
        com.yorku.lab.model.User user13 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository0.save(user13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userOptional12);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        userRepository0.delete("");
        java.util.List<com.yorku.lab.model.User> userList5 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional7 = userRepository0.findByEmail("hi!");
        java.util.List<com.yorku.lab.model.User> userList8 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional10 = userRepository0.findByEmail("");
        userRepository0.delete("");
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userOptional10);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("hi!");
        java.util.Optional<com.yorku.lab.model.User> userOptional4 = userRepository0.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional6 = userRepository0.findById("");
        userRepository0.delete("");
        org.junit.Assert.assertNotNull(userOptional4);
        org.junit.Assert.assertNotNull(userOptional6);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("hi!");
        com.yorku.lab.repository.UserRepository userRepository3 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional5 = userRepository3.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList6 = userRepository3.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository3.findById("");
        java.util.List<com.yorku.lab.model.User> userList9 = userRepository3.findAll();
        userRepository0.saveAll(userList9);
        java.util.Optional<com.yorku.lab.model.User> userOptional12 = userRepository0.findById("hi!");
        com.yorku.lab.repository.UserRepository userRepository13 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional15 = userRepository13.findByEmail("");
        userRepository13.delete("");
        com.yorku.lab.repository.UserRepository userRepository18 = new com.yorku.lab.repository.UserRepository();
        userRepository18.delete("");
        com.yorku.lab.model.User[] userArray21 = new com.yorku.lab.model.User[] {};
        java.util.ArrayList<com.yorku.lab.model.User> userList22 = new java.util.ArrayList<com.yorku.lab.model.User>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.User>) userList22, userArray21);
        userRepository18.saveAll((java.util.List<com.yorku.lab.model.User>) userList22);
        userRepository13.saveAll((java.util.List<com.yorku.lab.model.User>) userList22);
        userRepository13.delete("");
        com.yorku.lab.repository.UserRepository userRepository28 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional30 = userRepository28.findByEmail("");
        userRepository28.delete("");
        java.util.List<com.yorku.lab.model.User> userList33 = userRepository28.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional35 = userRepository28.findByEmail("hi!");
        java.util.List<com.yorku.lab.model.User> userList36 = userRepository28.findAll();
        userRepository13.saveAll(userList36);
        userRepository0.saveAll(userList36);
        java.util.Optional<com.yorku.lab.model.User> userOptional40 = userRepository0.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional42 = userRepository0.findById("");
        com.yorku.lab.repository.UserRepository userRepository43 = new com.yorku.lab.repository.UserRepository();
        userRepository43.delete("");
        userRepository43.delete("hi!");
        com.yorku.lab.repository.UserRepository userRepository48 = new com.yorku.lab.repository.UserRepository();
        userRepository48.delete("");
        com.yorku.lab.model.User[] userArray51 = new com.yorku.lab.model.User[] {};
        java.util.ArrayList<com.yorku.lab.model.User> userList52 = new java.util.ArrayList<com.yorku.lab.model.User>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.User>) userList52, userArray51);
        userRepository48.saveAll((java.util.List<com.yorku.lab.model.User>) userList52);
        java.util.Optional<com.yorku.lab.model.User> userOptional56 = userRepository48.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional58 = userRepository48.findByEmail("hi!");
        java.util.List<com.yorku.lab.model.User> userList59 = userRepository48.findAll();
        com.yorku.lab.repository.UserRepository userRepository60 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional62 = userRepository60.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList63 = userRepository60.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional65 = userRepository60.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional67 = userRepository60.findById("");
        userRepository60.delete("hi!");
        com.yorku.lab.repository.UserRepository userRepository70 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional72 = userRepository70.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList73 = userRepository70.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional75 = userRepository70.findById("");
        java.util.List<com.yorku.lab.model.User> userList76 = userRepository70.findAll();
        java.util.List<com.yorku.lab.model.User> userList77 = userRepository70.findAll();
        userRepository60.saveAll(userList77);
        userRepository48.saveAll(userList77);
        userRepository43.saveAll(userList77);
        userRepository0.saveAll(userList77);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertNotNull(userOptional15);
        org.junit.Assert.assertNotNull(userArray21);
        org.junit.Assert.assertArrayEquals(userArray21, new com.yorku.lab.model.User[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(userOptional30);
        org.junit.Assert.assertNotNull(userList33);
        org.junit.Assert.assertNotNull(userOptional35);
        org.junit.Assert.assertNotNull(userList36);
        org.junit.Assert.assertNotNull(userOptional40);
        org.junit.Assert.assertNotNull(userOptional42);
        org.junit.Assert.assertNotNull(userArray51);
        org.junit.Assert.assertArrayEquals(userArray51, new com.yorku.lab.model.User[] {});
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(userOptional56);
        org.junit.Assert.assertNotNull(userOptional58);
        org.junit.Assert.assertNotNull(userList59);
        org.junit.Assert.assertNotNull(userOptional62);
        org.junit.Assert.assertNotNull(userList63);
        org.junit.Assert.assertNotNull(userOptional65);
        org.junit.Assert.assertNotNull(userOptional67);
        org.junit.Assert.assertNotNull(userOptional72);
        org.junit.Assert.assertNotNull(userList73);
        org.junit.Assert.assertNotNull(userOptional75);
        org.junit.Assert.assertNotNull(userList76);
        org.junit.Assert.assertNotNull(userList77);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList3 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional5 = userRepository0.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional7 = userRepository0.findById("");
        userRepository0.delete("hi!");
        userRepository0.delete("hi!");
        java.util.Optional<com.yorku.lab.model.User> userOptional13 = userRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.User> userOptional15 = userRepository0.findByEmail("hi!");
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userOptional13);
        org.junit.Assert.assertNotNull(userOptional15);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("hi!");
        java.util.Optional<com.yorku.lab.model.User> userOptional4 = userRepository0.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional6 = userRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository0.findById("");
        java.util.List<com.yorku.lab.model.User> userList9 = userRepository0.findAll();
        com.yorku.lab.model.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository0.save(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional4);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userList9);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("");
        com.yorku.lab.model.User[] userArray3 = new com.yorku.lab.model.User[] {};
        java.util.ArrayList<com.yorku.lab.model.User> userList4 = new java.util.ArrayList<com.yorku.lab.model.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.User>) userList4, userArray3);
        userRepository0.saveAll((java.util.List<com.yorku.lab.model.User>) userList4);
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository0.findByEmail("hi!");
        userRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.User> userOptional12 = userRepository0.findById("");
        userRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.User> userOptional16 = userRepository0.findById("");
        com.yorku.lab.model.User user17 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository0.save(user17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new com.yorku.lab.model.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertNotNull(userOptional16);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList3 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional5 = userRepository0.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional7 = userRepository0.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList8 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional10 = userRepository0.findById("hi!");
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userOptional10);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList3 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional5 = userRepository0.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional7 = userRepository0.findByEmail("");
        userRepository0.delete("");
        userRepository0.delete("");
        java.util.List<com.yorku.lab.model.User> userList12 = userRepository0.findAll();
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userList12);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        userRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.User> userOptional6 = userRepository0.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository0.findByEmail("hi!");
        java.util.Optional<com.yorku.lab.model.User> userOptional10 = userRepository0.findById("");
        java.lang.Class<?> wildcardClass11 = userOptional10.getClass();
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("");
        com.yorku.lab.model.User[] userArray3 = new com.yorku.lab.model.User[] {};
        java.util.ArrayList<com.yorku.lab.model.User> userList4 = new java.util.ArrayList<com.yorku.lab.model.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.User>) userList4, userArray3);
        userRepository0.saveAll((java.util.List<com.yorku.lab.model.User>) userList4);
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository0.findByEmail("hi!");
        userRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.User> userOptional12 = userRepository0.findById("");
        com.yorku.lab.model.User user13 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository0.save(user13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new com.yorku.lab.model.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userOptional12);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("");
        com.yorku.lab.model.User[] userArray3 = new com.yorku.lab.model.User[] {};
        java.util.ArrayList<com.yorku.lab.model.User> userList4 = new java.util.ArrayList<com.yorku.lab.model.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.User>) userList4, userArray3);
        userRepository0.saveAll((java.util.List<com.yorku.lab.model.User>) userList4);
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository0.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional10 = userRepository0.findByEmail("hi!");
        java.util.List<com.yorku.lab.model.User> userList11 = userRepository0.findAll();
        userRepository0.delete("hi!");
        java.util.Optional<com.yorku.lab.model.User> userOptional15 = userRepository0.findById("");
        userRepository0.delete("");
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new com.yorku.lab.model.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userOptional15);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("hi!");
        com.yorku.lab.repository.UserRepository userRepository3 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional5 = userRepository3.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList6 = userRepository3.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository3.findById("");
        java.util.List<com.yorku.lab.model.User> userList9 = userRepository3.findAll();
        userRepository0.saveAll(userList9);
        java.util.Optional<com.yorku.lab.model.User> userOptional12 = userRepository0.findById("hi!");
        com.yorku.lab.repository.UserRepository userRepository13 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional15 = userRepository13.findByEmail("");
        userRepository13.delete("");
        com.yorku.lab.repository.UserRepository userRepository18 = new com.yorku.lab.repository.UserRepository();
        userRepository18.delete("");
        com.yorku.lab.model.User[] userArray21 = new com.yorku.lab.model.User[] {};
        java.util.ArrayList<com.yorku.lab.model.User> userList22 = new java.util.ArrayList<com.yorku.lab.model.User>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.User>) userList22, userArray21);
        userRepository18.saveAll((java.util.List<com.yorku.lab.model.User>) userList22);
        userRepository13.saveAll((java.util.List<com.yorku.lab.model.User>) userList22);
        userRepository13.delete("");
        com.yorku.lab.repository.UserRepository userRepository28 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional30 = userRepository28.findByEmail("");
        userRepository28.delete("");
        java.util.List<com.yorku.lab.model.User> userList33 = userRepository28.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional35 = userRepository28.findByEmail("hi!");
        java.util.List<com.yorku.lab.model.User> userList36 = userRepository28.findAll();
        userRepository13.saveAll(userList36);
        userRepository0.saveAll(userList36);
        userRepository0.delete("hi!");
        java.util.Optional<com.yorku.lab.model.User> userOptional42 = userRepository0.findByEmail("");
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertNotNull(userOptional15);
        org.junit.Assert.assertNotNull(userArray21);
        org.junit.Assert.assertArrayEquals(userArray21, new com.yorku.lab.model.User[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(userOptional30);
        org.junit.Assert.assertNotNull(userList33);
        org.junit.Assert.assertNotNull(userOptional35);
        org.junit.Assert.assertNotNull(userList36);
        org.junit.Assert.assertNotNull(userOptional42);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("hi!");
        java.util.Optional<com.yorku.lab.model.User> userOptional4 = userRepository0.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional6 = userRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository0.findById("");
        java.util.List<com.yorku.lab.model.User> userList9 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional11 = userRepository0.findByEmail("hi!");
        org.junit.Assert.assertNotNull(userOptional4);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userOptional11);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("");
        userRepository0.delete("hi!");
        java.util.Optional<com.yorku.lab.model.User> userOptional6 = userRepository0.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.User> userOptional10 = userRepository0.findByEmail("");
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userOptional10);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("");
        userRepository0.delete("hi!");
        java.util.Optional<com.yorku.lab.model.User> userOptional6 = userRepository0.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList7 = userRepository0.findAll();
        userRepository0.delete("");
        java.util.List<com.yorku.lab.model.User> userList10 = userRepository0.findAll();
        com.yorku.lab.model.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository0.save(user11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList10);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("hi!");
        java.util.Optional<com.yorku.lab.model.User> userOptional4 = userRepository0.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional6 = userRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository0.findById("hi!");
        userRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.User> userOptional12 = userRepository0.findByEmail("hi!");
        org.junit.Assert.assertNotNull(userOptional4);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userOptional12);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("");
        com.yorku.lab.model.User[] userArray3 = new com.yorku.lab.model.User[] {};
        java.util.ArrayList<com.yorku.lab.model.User> userList4 = new java.util.ArrayList<com.yorku.lab.model.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.User>) userList4, userArray3);
        userRepository0.saveAll((java.util.List<com.yorku.lab.model.User>) userList4);
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository0.findByEmail("hi!");
        userRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.User> userOptional12 = userRepository0.findByEmail("hi!");
        userRepository0.delete("");
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new com.yorku.lab.model.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userOptional12);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList3 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional5 = userRepository0.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional7 = userRepository0.findById("");
        com.yorku.lab.repository.UserRepository userRepository8 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional10 = userRepository8.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList11 = userRepository8.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional13 = userRepository8.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional15 = userRepository8.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList16 = userRepository8.findAll();
        userRepository0.saveAll(userList16);
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userOptional13);
        org.junit.Assert.assertNotNull(userOptional15);
        org.junit.Assert.assertNotNull(userList16);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("");
        userRepository0.delete("hi!");
        com.yorku.lab.repository.UserRepository userRepository5 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional7 = userRepository5.findByEmail("");
        userRepository5.delete("");
        com.yorku.lab.repository.UserRepository userRepository10 = new com.yorku.lab.repository.UserRepository();
        userRepository10.delete("");
        com.yorku.lab.model.User[] userArray13 = new com.yorku.lab.model.User[] {};
        java.util.ArrayList<com.yorku.lab.model.User> userList14 = new java.util.ArrayList<com.yorku.lab.model.User>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.User>) userList14, userArray13);
        userRepository10.saveAll((java.util.List<com.yorku.lab.model.User>) userList14);
        userRepository5.saveAll((java.util.List<com.yorku.lab.model.User>) userList14);
        userRepository0.saveAll((java.util.List<com.yorku.lab.model.User>) userList14);
        java.util.Optional<com.yorku.lab.model.User> userOptional20 = userRepository0.findById("hi!");
        java.lang.Class<?> wildcardClass21 = userRepository0.getClass();
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userArray13);
        org.junit.Assert.assertArrayEquals(userArray13, new com.yorku.lab.model.User[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(userOptional20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        userRepository0.delete("");
        com.yorku.lab.repository.UserRepository userRepository5 = new com.yorku.lab.repository.UserRepository();
        userRepository5.delete("");
        com.yorku.lab.model.User[] userArray8 = new com.yorku.lab.model.User[] {};
        java.util.ArrayList<com.yorku.lab.model.User> userList9 = new java.util.ArrayList<com.yorku.lab.model.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.User>) userList9, userArray8);
        userRepository5.saveAll((java.util.List<com.yorku.lab.model.User>) userList9);
        userRepository0.saveAll((java.util.List<com.yorku.lab.model.User>) userList9);
        userRepository0.delete("");
        userRepository0.delete("");
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userArray8);
        org.junit.Assert.assertArrayEquals(userArray8, new com.yorku.lab.model.User[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("hi!");
        java.util.Optional<com.yorku.lab.model.User> userOptional4 = userRepository0.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList5 = userRepository0.findAll();
        java.util.List<com.yorku.lab.model.User> userList6 = userRepository0.findAll();
        java.lang.Class<?> wildcardClass7 = userList6.getClass();
        org.junit.Assert.assertNotNull(userOptional4);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("");
        userRepository0.delete("hi!");
        java.util.List<com.yorku.lab.model.User> userList5 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository0.saveAll(userList5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("hi!");
        java.util.Optional<com.yorku.lab.model.User> userOptional4 = userRepository0.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional6 = userRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository0.findById("");
        java.util.List<com.yorku.lab.model.User> userList9 = userRepository0.findAll();
        com.yorku.lab.repository.UserRepository userRepository10 = new com.yorku.lab.repository.UserRepository();
        userRepository10.delete("hi!");
        java.util.Optional<com.yorku.lab.model.User> userOptional14 = userRepository10.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList15 = userRepository10.findAll();
        userRepository0.saveAll(userList15);
        org.junit.Assert.assertNotNull(userOptional4);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userOptional14);
        org.junit.Assert.assertNotNull(userList15);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("hi!");
        java.util.Optional<com.yorku.lab.model.User> userOptional4 = userRepository0.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList5 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional7 = userRepository0.findByEmail("");
        com.yorku.lab.repository.UserRepository userRepository8 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional10 = userRepository8.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList11 = userRepository8.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional13 = userRepository8.findById("");
        java.util.List<com.yorku.lab.model.User> userList14 = userRepository8.findAll();
        userRepository0.saveAll(userList14);
        org.junit.Assert.assertNotNull(userOptional4);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userOptional13);
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("");
        com.yorku.lab.model.User[] userArray3 = new com.yorku.lab.model.User[] {};
        java.util.ArrayList<com.yorku.lab.model.User> userList4 = new java.util.ArrayList<com.yorku.lab.model.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.User>) userList4, userArray3);
        userRepository0.saveAll((java.util.List<com.yorku.lab.model.User>) userList4);
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository0.findByEmail("hi!");
        userRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.User> userOptional12 = userRepository0.findByEmail("hi!");
        java.util.Optional<com.yorku.lab.model.User> userOptional14 = userRepository0.findById("");
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new com.yorku.lab.model.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertNotNull(userOptional14);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList3 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional5 = userRepository0.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional7 = userRepository0.findById("");
        userRepository0.delete("hi!");
        com.yorku.lab.repository.UserRepository userRepository10 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional12 = userRepository10.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList13 = userRepository10.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional15 = userRepository10.findById("");
        java.util.List<com.yorku.lab.model.User> userList16 = userRepository10.findAll();
        java.util.List<com.yorku.lab.model.User> userList17 = userRepository10.findAll();
        userRepository0.saveAll(userList17);
        java.util.List<com.yorku.lab.model.User> userList19 = userRepository0.findAll();
        java.lang.Class<?> wildcardClass20 = userList19.getClass();
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userOptional15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        userRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.User> userOptional6 = userRepository0.findByEmail("");
        com.yorku.lab.repository.UserRepository userRepository7 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional9 = userRepository7.findByEmail("");
        com.yorku.lab.repository.UserRepository userRepository10 = new com.yorku.lab.repository.UserRepository();
        userRepository10.delete("hi!");
        com.yorku.lab.repository.UserRepository userRepository13 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional15 = userRepository13.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList16 = userRepository13.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional18 = userRepository13.findById("");
        java.util.List<com.yorku.lab.model.User> userList19 = userRepository13.findAll();
        userRepository10.saveAll(userList19);
        userRepository7.saveAll(userList19);
        userRepository0.saveAll(userList19);
        java.util.List<com.yorku.lab.model.User> userList23 = userRepository0.findAll();
        userRepository0.delete("hi!");
        com.yorku.lab.repository.UserRepository userRepository26 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional28 = userRepository26.findByEmail("");
        com.yorku.lab.repository.UserRepository userRepository29 = new com.yorku.lab.repository.UserRepository();
        userRepository29.delete("hi!");
        com.yorku.lab.repository.UserRepository userRepository32 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional34 = userRepository32.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList35 = userRepository32.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional37 = userRepository32.findById("");
        java.util.List<com.yorku.lab.model.User> userList38 = userRepository32.findAll();
        userRepository29.saveAll(userList38);
        userRepository26.saveAll(userList38);
        userRepository0.saveAll(userList38);
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertNotNull(userOptional15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(userOptional18);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userOptional28);
        org.junit.Assert.assertNotNull(userOptional34);
        org.junit.Assert.assertNotNull(userList35);
        org.junit.Assert.assertNotNull(userOptional37);
        org.junit.Assert.assertNotNull(userList38);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        userRepository0.delete("");
        java.util.List<com.yorku.lab.model.User> userList5 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional7 = userRepository0.findByEmail("hi!");
        java.util.List<com.yorku.lab.model.User> userList8 = userRepository0.findAll();
        com.yorku.lab.repository.UserRepository userRepository9 = new com.yorku.lab.repository.UserRepository();
        userRepository9.delete("");
        com.yorku.lab.model.User[] userArray12 = new com.yorku.lab.model.User[] {};
        java.util.ArrayList<com.yorku.lab.model.User> userList13 = new java.util.ArrayList<com.yorku.lab.model.User>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.User>) userList13, userArray12);
        userRepository9.saveAll((java.util.List<com.yorku.lab.model.User>) userList13);
        userRepository0.saveAll((java.util.List<com.yorku.lab.model.User>) userList13);
        java.util.Optional<com.yorku.lab.model.User> userOptional18 = userRepository0.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional20 = userRepository0.findById("");
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userArray12);
        org.junit.Assert.assertArrayEquals(userArray12, new com.yorku.lab.model.User[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userOptional18);
        org.junit.Assert.assertNotNull(userOptional20);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList3 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional5 = userRepository0.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional7 = userRepository0.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList8 = userRepository0.findAll();
        java.util.List<com.yorku.lab.model.User> userList9 = userRepository0.findAll();
        com.yorku.lab.model.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository0.save(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userList9);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("hi!");
        com.yorku.lab.repository.UserRepository userRepository3 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional5 = userRepository3.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList6 = userRepository3.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository3.findById("");
        java.util.List<com.yorku.lab.model.User> userList9 = userRepository3.findAll();
        userRepository0.saveAll(userList9);
        java.util.Optional<com.yorku.lab.model.User> userOptional12 = userRepository0.findById("hi!");
        com.yorku.lab.repository.UserRepository userRepository13 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional15 = userRepository13.findByEmail("");
        userRepository13.delete("");
        com.yorku.lab.repository.UserRepository userRepository18 = new com.yorku.lab.repository.UserRepository();
        userRepository18.delete("");
        com.yorku.lab.model.User[] userArray21 = new com.yorku.lab.model.User[] {};
        java.util.ArrayList<com.yorku.lab.model.User> userList22 = new java.util.ArrayList<com.yorku.lab.model.User>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.User>) userList22, userArray21);
        userRepository18.saveAll((java.util.List<com.yorku.lab.model.User>) userList22);
        userRepository13.saveAll((java.util.List<com.yorku.lab.model.User>) userList22);
        userRepository13.delete("");
        com.yorku.lab.repository.UserRepository userRepository28 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional30 = userRepository28.findByEmail("");
        userRepository28.delete("");
        java.util.List<com.yorku.lab.model.User> userList33 = userRepository28.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional35 = userRepository28.findByEmail("hi!");
        java.util.List<com.yorku.lab.model.User> userList36 = userRepository28.findAll();
        userRepository13.saveAll(userList36);
        userRepository0.saveAll(userList36);
        com.yorku.lab.model.User user39 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository0.save(user39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertNotNull(userOptional15);
        org.junit.Assert.assertNotNull(userArray21);
        org.junit.Assert.assertArrayEquals(userArray21, new com.yorku.lab.model.User[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(userOptional30);
        org.junit.Assert.assertNotNull(userList33);
        org.junit.Assert.assertNotNull(userOptional35);
        org.junit.Assert.assertNotNull(userList36);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("hi!");
        java.util.Optional<com.yorku.lab.model.User> userOptional4 = userRepository0.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional6 = userRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository0.findById("hi!");
        com.yorku.lab.repository.UserRepository userRepository9 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional11 = userRepository9.findByEmail("");
        userRepository9.delete("");
        java.util.List<com.yorku.lab.model.User> userList14 = userRepository9.findAll();
        com.yorku.lab.repository.UserRepository userRepository15 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional17 = userRepository15.findByEmail("");
        userRepository15.delete("");
        com.yorku.lab.repository.UserRepository userRepository20 = new com.yorku.lab.repository.UserRepository();
        userRepository20.delete("");
        com.yorku.lab.model.User[] userArray23 = new com.yorku.lab.model.User[] {};
        java.util.ArrayList<com.yorku.lab.model.User> userList24 = new java.util.ArrayList<com.yorku.lab.model.User>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.User>) userList24, userArray23);
        userRepository20.saveAll((java.util.List<com.yorku.lab.model.User>) userList24);
        userRepository15.saveAll((java.util.List<com.yorku.lab.model.User>) userList24);
        userRepository9.saveAll((java.util.List<com.yorku.lab.model.User>) userList24);
        userRepository0.saveAll((java.util.List<com.yorku.lab.model.User>) userList24);
        org.junit.Assert.assertNotNull(userOptional4);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userOptional11);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userOptional17);
        org.junit.Assert.assertNotNull(userArray23);
        org.junit.Assert.assertArrayEquals(userArray23, new com.yorku.lab.model.User[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList3 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional5 = userRepository0.findById("");
        java.util.List<com.yorku.lab.model.User> userList6 = userRepository0.findAll();
        java.util.List<com.yorku.lab.model.User> userList7 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional9 = userRepository0.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional11 = userRepository0.findByEmail("hi!");
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userOptional9);
        org.junit.Assert.assertNotNull(userOptional11);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList3 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional5 = userRepository0.findById("");
        userRepository0.delete("hi!");
        userRepository0.delete("");
        java.util.List<com.yorku.lab.model.User> userList10 = userRepository0.findAll();
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList10);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("");
        userRepository0.delete("hi!");
        java.util.List<com.yorku.lab.model.User> userList5 = userRepository0.findAll();
        com.yorku.lab.repository.UserRepository userRepository6 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository6.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList9 = userRepository6.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional11 = userRepository6.findById("");
        java.util.List<com.yorku.lab.model.User> userList12 = userRepository6.findAll();
        java.util.List<com.yorku.lab.model.User> userList13 = userRepository6.findAll();
        userRepository0.saveAll(userList13);
        com.yorku.lab.model.User user15 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository0.save(user15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userOptional11);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(userList13);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("");
        userRepository0.delete("hi!");
        java.util.Optional<com.yorku.lab.model.User> userOptional6 = userRepository0.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository0.findByEmail("");
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(userOptional8);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("");
        com.yorku.lab.model.User[] userArray3 = new com.yorku.lab.model.User[] {};
        java.util.ArrayList<com.yorku.lab.model.User> userList4 = new java.util.ArrayList<com.yorku.lab.model.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.User>) userList4, userArray3);
        userRepository0.saveAll((java.util.List<com.yorku.lab.model.User>) userList4);
        userRepository0.delete("");
        java.util.List<com.yorku.lab.model.User> userList9 = userRepository0.findAll();
        userRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.User> userOptional13 = userRepository0.findByEmail("hi!");
        userRepository0.delete("");
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new com.yorku.lab.model.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userOptional13);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("");
        com.yorku.lab.model.User[] userArray3 = new com.yorku.lab.model.User[] {};
        java.util.ArrayList<com.yorku.lab.model.User> userList4 = new java.util.ArrayList<com.yorku.lab.model.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.User>) userList4, userArray3);
        userRepository0.saveAll((java.util.List<com.yorku.lab.model.User>) userList4);
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository0.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional10 = userRepository0.findByEmail("hi!");
        java.util.List<com.yorku.lab.model.User> userList11 = userRepository0.findAll();
        com.yorku.lab.model.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository0.save(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new com.yorku.lab.model.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userOptional10);
        org.junit.Assert.assertNotNull(userList11);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("hi!");
        java.util.Optional<com.yorku.lab.model.User> userOptional4 = userRepository0.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional6 = userRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository0.findById("");
        java.util.List<com.yorku.lab.model.User> userList9 = userRepository0.findAll();
        java.lang.Class<?> wildcardClass10 = userList9.getClass();
        org.junit.Assert.assertNotNull(userOptional4);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("hi!");
        java.util.Optional<com.yorku.lab.model.User> userOptional4 = userRepository0.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional6 = userRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository0.findById("");
        java.util.List<com.yorku.lab.model.User> userList9 = userRepository0.findAll();
        userRepository0.delete("");
        org.junit.Assert.assertNotNull(userOptional4);
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userList9);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        userRepository0.delete("");
        userRepository0.delete("hi!");
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository0.findByEmail("");
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userOptional8);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("");
        com.yorku.lab.model.User[] userArray3 = new com.yorku.lab.model.User[] {};
        java.util.ArrayList<com.yorku.lab.model.User> userList4 = new java.util.ArrayList<com.yorku.lab.model.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.User>) userList4, userArray3);
        userRepository0.saveAll((java.util.List<com.yorku.lab.model.User>) userList4);
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository0.findByEmail("hi!");
        userRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.User> userOptional12 = userRepository0.findById("");
        userRepository0.delete("");
        com.yorku.lab.model.User user15 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRepository0.save(user15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new com.yorku.lab.model.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userOptional12);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("");
        com.yorku.lab.model.User[] userArray3 = new com.yorku.lab.model.User[] {};
        java.util.ArrayList<com.yorku.lab.model.User> userList4 = new java.util.ArrayList<com.yorku.lab.model.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.User>) userList4, userArray3);
        userRepository0.saveAll((java.util.List<com.yorku.lab.model.User>) userList4);
        userRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.User> userOptional10 = userRepository0.findByEmail("");
        org.junit.Assert.assertNotNull(userArray3);
        org.junit.Assert.assertArrayEquals(userArray3, new com.yorku.lab.model.User[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userOptional10);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional2 = userRepository0.findByEmail("");
        userRepository0.delete("");
        com.yorku.lab.repository.UserRepository userRepository5 = new com.yorku.lab.repository.UserRepository();
        userRepository5.delete("");
        com.yorku.lab.model.User[] userArray8 = new com.yorku.lab.model.User[] {};
        java.util.ArrayList<com.yorku.lab.model.User> userList9 = new java.util.ArrayList<com.yorku.lab.model.User>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.User>) userList9, userArray8);
        userRepository5.saveAll((java.util.List<com.yorku.lab.model.User>) userList9);
        userRepository0.saveAll((java.util.List<com.yorku.lab.model.User>) userList9);
        userRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.User> userOptional16 = userRepository0.findByEmail("hi!");
        userRepository0.delete("");
        java.util.Optional<com.yorku.lab.model.User> userOptional20 = userRepository0.findById("hi!");
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userArray8);
        org.junit.Assert.assertArrayEquals(userArray8, new com.yorku.lab.model.User[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(userOptional16);
        org.junit.Assert.assertNotNull(userOptional20);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("hi!");
        com.yorku.lab.repository.UserRepository userRepository3 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional5 = userRepository3.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList6 = userRepository3.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository3.findById("");
        java.util.List<com.yorku.lab.model.User> userList9 = userRepository3.findAll();
        userRepository0.saveAll(userList9);
        java.util.Optional<com.yorku.lab.model.User> userOptional12 = userRepository0.findById("hi!");
        com.yorku.lab.repository.UserRepository userRepository13 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional15 = userRepository13.findByEmail("");
        userRepository13.delete("");
        com.yorku.lab.repository.UserRepository userRepository18 = new com.yorku.lab.repository.UserRepository();
        userRepository18.delete("");
        com.yorku.lab.model.User[] userArray21 = new com.yorku.lab.model.User[] {};
        java.util.ArrayList<com.yorku.lab.model.User> userList22 = new java.util.ArrayList<com.yorku.lab.model.User>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.yorku.lab.model.User>) userList22, userArray21);
        userRepository18.saveAll((java.util.List<com.yorku.lab.model.User>) userList22);
        userRepository13.saveAll((java.util.List<com.yorku.lab.model.User>) userList22);
        userRepository13.delete("");
        com.yorku.lab.repository.UserRepository userRepository28 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional30 = userRepository28.findByEmail("");
        userRepository28.delete("");
        java.util.List<com.yorku.lab.model.User> userList33 = userRepository28.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional35 = userRepository28.findByEmail("hi!");
        java.util.List<com.yorku.lab.model.User> userList36 = userRepository28.findAll();
        userRepository13.saveAll(userList36);
        userRepository0.saveAll(userList36);
        java.util.List<com.yorku.lab.model.User> userList39 = userRepository0.findAll();
        java.util.List<com.yorku.lab.model.User> userList40 = userRepository0.findAll();
        java.util.List<com.yorku.lab.model.User> userList41 = userRepository0.findAll();
        com.yorku.lab.repository.UserRepository userRepository42 = new com.yorku.lab.repository.UserRepository();
        java.util.Optional<com.yorku.lab.model.User> userOptional44 = userRepository42.findByEmail("");
        userRepository42.delete("");
        com.yorku.lab.repository.UserRepository userRepository47 = new com.yorku.lab.repository.UserRepository();
        userRepository47.delete("hi!");
        java.util.List<com.yorku.lab.model.User> userList50 = userRepository47.findAll();
        userRepository42.saveAll(userList50);
        userRepository0.saveAll(userList50);
        org.junit.Assert.assertNotNull(userOptional5);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userOptional12);
        org.junit.Assert.assertNotNull(userOptional15);
        org.junit.Assert.assertNotNull(userArray21);
        org.junit.Assert.assertArrayEquals(userArray21, new com.yorku.lab.model.User[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(userOptional30);
        org.junit.Assert.assertNotNull(userList33);
        org.junit.Assert.assertNotNull(userOptional35);
        org.junit.Assert.assertNotNull(userList36);
        org.junit.Assert.assertNotNull(userList39);
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(userList41);
        org.junit.Assert.assertNotNull(userOptional44);
        org.junit.Assert.assertNotNull(userList50);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("hi!");
        java.util.Optional<com.yorku.lab.model.User> userOptional4 = userRepository0.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList5 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional7 = userRepository0.findByEmail("");
        java.lang.Class<?> wildcardClass8 = userOptional7.getClass();
        org.junit.Assert.assertNotNull(userOptional4);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userOptional7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("hi!");
        java.util.Optional<com.yorku.lab.model.User> userOptional4 = userRepository0.findByEmail("");
        java.util.List<com.yorku.lab.model.User> userList5 = userRepository0.findAll();
        java.util.Optional<com.yorku.lab.model.User> userOptional7 = userRepository0.findById("");
        org.junit.Assert.assertNotNull(userOptional4);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userOptional7);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        com.yorku.lab.repository.UserRepository userRepository0 = new com.yorku.lab.repository.UserRepository();
        userRepository0.delete("");
        userRepository0.delete("hi!");
        java.util.Optional<com.yorku.lab.model.User> userOptional6 = userRepository0.findByEmail("");
        java.util.Optional<com.yorku.lab.model.User> userOptional8 = userRepository0.findById("");
        java.util.Optional<com.yorku.lab.model.User> userOptional10 = userRepository0.findById("hi!");
        org.junit.Assert.assertNotNull(userOptional6);
        org.junit.Assert.assertNotNull(userOptional8);
        org.junit.Assert.assertNotNull(userOptional10);
    }
}

