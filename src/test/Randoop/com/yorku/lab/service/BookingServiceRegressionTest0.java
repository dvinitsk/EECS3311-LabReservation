package test.Randoop.com.yorku.lab.service;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BookingServiceRegressionTest0 {

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
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        com.yorku.lab.model.User user2 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = bookingService0.calculateHourlyRate(user2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        com.yorku.lab.model.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double2 = bookingService0.calculateDeposit(user1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        java.util.List<com.yorku.lab.model.Reservation> reservationList3 = bookingService0.getReservationsByUser("");
        java.time.LocalDateTime localDateTime5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.time.LocalDateTime> localDateTimeList7 = bookingService0.suggestNextAvailableSlots("", localDateTime5, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.plusDays(long)\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(reservationList3);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.UserRepository userRepository2 = null;
        com.yorku.lab.service.BookingService bookingService3 = new com.yorku.lab.service.BookingService(reservationRepository0, equipmentRepository1, userRepository2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.yorku.lab.model.Equipment> equipmentList4 = bookingService3.browseEquipment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.repository.EquipmentRepository.findAll()\" because \"this.equipmentRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        java.util.List<com.yorku.lab.model.Reservation> reservationList3 = bookingService0.getReservationsByUser("");
        java.lang.Class<?> wildcardClass4 = reservationList3.getClass();
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        java.time.LocalDateTime localDateTime3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.time.LocalDateTime> localDateTimeList5 = bookingService0.suggestNextAvailableSlots("", localDateTime3, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.plusDays(long)\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList1);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        boolean boolean3 = bookingService0.cancelBooking("");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean8 = bookingService0.isSlotAvailable("", localDateTime5, localDateTime6, "");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional10 = bookingService0.getReservation("");
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bookingService0.calculateReservationCost((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PricingStrategy.calculateDeposit(int)\" because \"this.pricingStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationOptional10);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = bookingService0.findAvailableEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList3 = bookingService0.findAvailableEquipment();
        java.lang.Class<?> wildcardClass4 = bookingService0.getClass();
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = bookingService0.findAvailableEquipment();
        java.lang.Class<?> wildcardClass3 = bookingService0.getClass();
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = bookingService0.findAvailableEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList3 = bookingService0.findAvailableEquipment();
        java.util.List<com.yorku.lab.model.Reservation> reservationList5 = bookingService0.getReservationsByUser("hi!");
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNotNull(reservationList5);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        boolean boolean3 = bookingService0.cancelBooking("");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean8 = bookingService0.isSlotAvailable("", localDateTime5, localDateTime6, "");
        com.yorku.lab.model.User user9 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional13 = bookingService0.createReservation(user9, "", localDateTime11, localDateTime12);
        boolean boolean15 = bookingService0.cancelBooking("hi!");
        // The following exception was thrown during execution in test generation
        try {
            double double17 = bookingService0.calculateReservationCost((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PricingStrategy.calculateDeposit(int)\" because \"this.pricingStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationOptional13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = bookingService0.modifyBooking("", localDateTime2, localDateTime3);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional6 = bookingService0.getEquipment("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList7 = bookingService0.findAvailableEquipment();
        com.yorku.lab.model.User user8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bookingService0.calculateDeposit(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional6);
        org.junit.Assert.assertNotNull(equipmentList7);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        java.util.List<com.yorku.lab.model.Reservation> reservationList3 = bookingService0.getReservationsByUser("");
        com.yorku.lab.model.User user4 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional8 = bookingService0.createReservation(user4, "", localDateTime6, localDateTime7);
        com.yorku.lab.model.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bookingService0.calculateHourlyRate(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNotNull(reservationOptional8);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.UserRepository userRepository2 = null;
        com.yorku.lab.service.BookingService bookingService3 = new com.yorku.lab.service.BookingService(reservationRepository0, equipmentRepository1, userRepository2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = bookingService3.cancelBooking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.repository.ReservationRepository.findById(String)\" because \"this.reservationRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = bookingService0.modifyBooking("", localDateTime2, localDateTime3);
        java.util.List<com.yorku.lab.model.Reservation> reservationList6 = bookingService0.getReservationsByUser("");
        boolean boolean8 = bookingService0.cancelBooking("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList10 = bookingService0.getReservationsByUser("hi!");
        com.yorku.lab.model.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bookingService0.calculateHourlyRate(user11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationOptional4);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(reservationList10);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.UserRepository userRepository2 = null;
        com.yorku.lab.service.BookingService bookingService3 = new com.yorku.lab.service.BookingService(reservationRepository0, equipmentRepository1, userRepository2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = bookingService3.cancelBooking("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.repository.ReservationRepository.findById(String)\" because \"this.reservationRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.UserRepository userRepository2 = null;
        com.yorku.lab.service.BookingService bookingService3 = new com.yorku.lab.service.BookingService(reservationRepository0, equipmentRepository1, userRepository2);
        java.time.LocalDateTime localDateTime5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional6 = bookingService3.extendReservation("", localDateTime5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.repository.ReservationRepository.findById(String)\" because \"this.reservationRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.UserRepository userRepository2 = null;
        com.yorku.lab.service.BookingService bookingService3 = new com.yorku.lab.service.BookingService(reservationRepository0, equipmentRepository1, userRepository2);
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional7 = bookingService3.modifyBooking("hi!", localDateTime5, localDateTime6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.repository.ReservationRepository.findById(String)\" because \"this.reservationRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = bookingService0.modifyBooking("", localDateTime2, localDateTime3);
        java.util.List<com.yorku.lab.model.Reservation> reservationList6 = bookingService0.getReservationsByUser("");
        boolean boolean8 = bookingService0.cancelBooking("");
        java.lang.Class<?> wildcardClass9 = bookingService0.getClass();
        org.junit.Assert.assertNotNull(reservationOptional4);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = bookingService0.findAvailableEquipment();
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy3 = null;
        bookingService0.setPricingStrategy(pricingStrategy3);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean9 = bookingService0.isSlotAvailable("", localDateTime6, localDateTime7, "");
        java.lang.Class<?> wildcardClass10 = bookingService0.getClass();
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        boolean boolean3 = bookingService0.cancelBooking("");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean8 = bookingService0.isSlotAvailable("", localDateTime5, localDateTime6, "");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional10 = bookingService0.getReservation("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList11 = bookingService0.browseEquipment();
        java.lang.Class<?> wildcardClass12 = bookingService0.getClass();
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationOptional10);
        org.junit.Assert.assertNotNull(equipmentList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = bookingService0.findAvailableEquipment();
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy3 = null;
        bookingService0.setPricingStrategy(pricingStrategy3);
        java.time.LocalDateTime localDateTime6 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional7 = bookingService0.extendReservation("", localDateTime6);
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(reservationOptional7);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = bookingService0.findAvailableEquipment();
        com.yorku.lab.model.User user3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = bookingService0.calculateDeposit(user3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional2 = bookingService0.getReservation("");
        java.time.LocalDateTime localDateTime4 = null;
        java.util.List<java.time.LocalDateTime> localDateTimeList6 = bookingService0.suggestNextAvailableSlots("", localDateTime4, 0);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bookingService0.calculateReservationCost(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PricingStrategy.calculateDeposit(int)\" because \"this.pricingStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationOptional2);
        org.junit.Assert.assertNotNull(localDateTimeList6);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        boolean boolean3 = bookingService0.cancelBooking("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional5 = bookingService0.getReservation("");
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(reservationOptional5);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = bookingService0.modifyBooking("", localDateTime2, localDateTime3);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional6 = bookingService0.getEquipment("");
        java.lang.Class<?> wildcardClass7 = equipmentOptional6.getClass();
        org.junit.Assert.assertNotNull(reservationOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        java.util.List<com.yorku.lab.model.Reservation> reservationList3 = bookingService0.getReservationsByUser("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList4 = bookingService0.browseEquipment();
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNotNull(equipmentList4);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = bookingService0.modifyBooking("", localDateTime2, localDateTime3);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional6 = bookingService0.getEquipment("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList7 = bookingService0.findAvailableEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList8 = bookingService0.findAvailableEquipment();
        com.yorku.lab.model.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bookingService0.calculateDeposit(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNotNull(equipmentList8);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = bookingService0.modifyBooking("", localDateTime2, localDateTime3);
        java.util.List<com.yorku.lab.model.Reservation> reservationList6 = bookingService0.getReservationsByUser("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList7 = bookingService0.findAvailableEquipment();
        org.junit.Assert.assertNotNull(reservationOptional4);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(equipmentList7);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        boolean boolean3 = bookingService0.cancelBooking("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional5 = bookingService0.getReservation("hi!");
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        boolean boolean10 = bookingService0.isSlotAvailable("hi!", localDateTime7, localDateTime8, "hi!");
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(reservationOptional5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = bookingService0.modifyBooking("", localDateTime2, localDateTime3);
        java.util.List<com.yorku.lab.model.Reservation> reservationList6 = bookingService0.getReservationsByUser("");
        boolean boolean8 = bookingService0.cancelBooking("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList10 = bookingService0.getReservationsByUser("hi!");
        java.time.LocalDateTime localDateTime12 = null;
        java.util.List<java.time.LocalDateTime> localDateTimeList14 = bookingService0.suggestNextAvailableSlots("", localDateTime12, (int) (byte) -1);
        org.junit.Assert.assertNotNull(reservationOptional4);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(localDateTimeList14);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = bookingService0.findAvailableEquipment();
        java.util.List<com.yorku.lab.model.Reservation> reservationList4 = bookingService0.getReservationsByUser("");
        java.time.LocalDateTime localDateTime6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.time.LocalDateTime> localDateTimeList8 = bookingService0.suggestNextAvailableSlots("", localDateTime6, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.plusDays(long)\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(reservationList4);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = bookingService0.modifyBooking("", localDateTime2, localDateTime3);
        java.util.List<com.yorku.lab.model.Reservation> reservationList6 = bookingService0.getReservationsByUser("");
        boolean boolean8 = bookingService0.cancelBooking("");
        com.yorku.lab.model.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bookingService0.calculateHourlyRate(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationOptional4);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = bookingService0.findAvailableEquipment();
        java.util.List<com.yorku.lab.model.Reservation> reservationList4 = bookingService0.getReservationsByUser("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional6 = bookingService0.getReservation("");
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(reservationList4);
        org.junit.Assert.assertNotNull(reservationOptional6);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional2 = bookingService0.getReservation("");
        java.time.LocalDateTime localDateTime4 = null;
        java.util.List<java.time.LocalDateTime> localDateTimeList6 = bookingService0.suggestNextAvailableSlots("", localDateTime4, 0);
        com.yorku.lab.model.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bookingService0.calculateDeposit(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationOptional2);
        org.junit.Assert.assertNotNull(localDateTimeList6);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = bookingService0.modifyBooking("", localDateTime2, localDateTime3);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList5 = bookingService0.browseEquipment();
        com.yorku.lab.model.User user6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = bookingService0.calculateHourlyRate(user6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationOptional4);
        org.junit.Assert.assertNotNull(equipmentList5);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = bookingService0.modifyBooking("", localDateTime2, localDateTime3);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional6 = bookingService0.getEquipment("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList7 = bookingService0.findAvailableEquipment();
        java.lang.Class<?> wildcardClass8 = bookingService0.getClass();
        org.junit.Assert.assertNotNull(reservationOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = bookingService0.findAvailableEquipment();
        java.util.List<com.yorku.lab.model.Reservation> reservationList4 = bookingService0.getReservationsByUser("");
        com.yorku.lab.model.User user5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double6 = bookingService0.calculateHourlyRate(user5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(reservationList4);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = bookingService0.modifyBooking("", localDateTime2, localDateTime3);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional6 = bookingService0.getEquipment("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList7 = bookingService0.findAvailableEquipment();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bookingService0.calculateReservationCost((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PricingStrategy.calculateDeposit(int)\" because \"this.pricingStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional6);
        org.junit.Assert.assertNotNull(equipmentList7);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        java.util.List<com.yorku.lab.model.Reservation> reservationList3 = bookingService0.getReservationsByUser("");
        java.lang.Class<?> wildcardClass4 = bookingService0.getClass();
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = bookingService0.findAvailableEquipment();
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy3 = null;
        bookingService0.setPricingStrategy(pricingStrategy3);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = bookingService0.calculateReservationCost(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PricingStrategy.calculateDeposit(int)\" because \"this.pricingStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = bookingService0.findAvailableEquipment();
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy3 = null;
        bookingService0.setPricingStrategy(pricingStrategy3);
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional6 = bookingService0.getReservation("hi!");
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(reservationOptional6);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional2 = bookingService0.getReservation("");
        java.time.LocalDateTime localDateTime4 = null;
        java.util.List<java.time.LocalDateTime> localDateTimeList6 = bookingService0.suggestNextAvailableSlots("", localDateTime4, 0);
        java.util.List<com.yorku.lab.model.Reservation> reservationList8 = bookingService0.getReservationsByUser("hi!");
        org.junit.Assert.assertNotNull(reservationOptional2);
        org.junit.Assert.assertNotNull(localDateTimeList6);
        org.junit.Assert.assertNotNull(reservationList8);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = bookingService0.findAvailableEquipment();
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy3 = null;
        bookingService0.setPricingStrategy(pricingStrategy3);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean9 = bookingService0.isSlotAvailable("", localDateTime6, localDateTime7, "");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional13 = bookingService0.modifyBooking("hi!", localDateTime11, localDateTime12);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean18 = bookingService0.isSlotAvailable("", localDateTime15, localDateTime16, "hi!");
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(reservationOptional13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        boolean boolean3 = bookingService0.cancelBooking("");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean8 = bookingService0.isSlotAvailable("", localDateTime5, localDateTime6, "");
        com.yorku.lab.model.User user9 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional13 = bookingService0.createReservation(user9, "", localDateTime11, localDateTime12);
        boolean boolean15 = bookingService0.cancelBooking("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList17 = bookingService0.getReservationsByUser("");
        java.time.LocalDateTime localDateTime19 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional20 = bookingService0.extendReservation("hi!", localDateTime19);
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy21 = null;
        bookingService0.setPricingStrategy(pricingStrategy21);
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional26 = bookingService0.modifyBooking("", localDateTime24, localDateTime25);
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional30 = bookingService0.modifyBooking("", localDateTime28, localDateTime29);
        com.yorku.lab.model.User user31 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double32 = bookingService0.calculateDeposit(user31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationOptional13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(reservationList17);
        org.junit.Assert.assertNotNull(reservationOptional20);
        org.junit.Assert.assertNotNull(reservationOptional26);
        org.junit.Assert.assertNotNull(reservationOptional30);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = bookingService0.findAvailableEquipment();
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy3 = null;
        bookingService0.setPricingStrategy(pricingStrategy3);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean9 = bookingService0.isSlotAvailable("", localDateTime6, localDateTime7, "");
        boolean boolean11 = bookingService0.cancelBooking("");
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional2 = bookingService0.getReservation("");
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy3 = null;
        bookingService0.setPricingStrategy(pricingStrategy3);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList5 = bookingService0.findAvailableEquipment();
        java.lang.Class<?> wildcardClass6 = equipmentList5.getClass();
        org.junit.Assert.assertNotNull(reservationOptional2);
        org.junit.Assert.assertNotNull(equipmentList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        boolean boolean3 = bookingService0.cancelBooking("");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean8 = bookingService0.isSlotAvailable("", localDateTime5, localDateTime6, "");
        com.yorku.lab.model.User user9 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional13 = bookingService0.createReservation(user9, "", localDateTime11, localDateTime12);
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy14 = null;
        bookingService0.setPricingStrategy(pricingStrategy14);
        boolean boolean17 = bookingService0.cancelBooking("hi!");
        boolean boolean19 = bookingService0.cancelBooking("");
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationOptional13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        boolean boolean3 = bookingService0.cancelBooking("");
        java.time.LocalDateTime localDateTime5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.time.LocalDateTime> localDateTimeList7 = bookingService0.suggestNextAvailableSlots("", localDateTime5, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.plusDays(long)\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = bookingService0.findAvailableEquipment();
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy3 = null;
        bookingService0.setPricingStrategy(pricingStrategy3);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean9 = bookingService0.isSlotAvailable("", localDateTime6, localDateTime7, "");
        com.yorku.lab.model.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bookingService0.calculateHourlyRate(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        boolean boolean3 = bookingService0.cancelBooking("");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean8 = bookingService0.isSlotAvailable("", localDateTime5, localDateTime6, "");
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        boolean boolean13 = bookingService0.isSlotAvailable("", localDateTime10, localDateTime11, "");
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = bookingService0.modifyBooking("", localDateTime2, localDateTime3);
        java.util.List<com.yorku.lab.model.Reservation> reservationList6 = bookingService0.getReservationsByUser("");
        com.yorku.lab.model.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bookingService0.calculateDeposit(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationOptional4);
        org.junit.Assert.assertNotNull(reservationList6);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = bookingService0.findAvailableEquipment();
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy3 = null;
        bookingService0.setPricingStrategy(pricingStrategy3);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean9 = bookingService0.isSlotAvailable("", localDateTime6, localDateTime7, "");
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bookingService0.calculateReservationCost(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PricingStrategy.calculateDeposit(int)\" because \"this.pricingStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        boolean boolean3 = bookingService0.cancelBooking("");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean8 = bookingService0.isSlotAvailable("", localDateTime5, localDateTime6, "");
        com.yorku.lab.model.User user9 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional13 = bookingService0.createReservation(user9, "", localDateTime11, localDateTime12);
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy14 = null;
        bookingService0.setPricingStrategy(pricingStrategy14);
        boolean boolean17 = bookingService0.cancelBooking("hi!");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList18 = bookingService0.findAvailableEquipment();
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationOptional13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(equipmentList18);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = bookingService0.modifyBooking("", localDateTime2, localDateTime3);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional6 = bookingService0.getEquipment("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList7 = bookingService0.findAvailableEquipment();
        java.util.List<com.yorku.lab.model.Reservation> reservationList9 = bookingService0.getReservationsByUser("");
        java.time.LocalDateTime localDateTime11 = null;
        java.util.List<java.time.LocalDateTime> localDateTimeList13 = bookingService0.suggestNextAvailableSlots("", localDateTime11, 0);
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional15 = bookingService0.getReservation("");
        org.junit.Assert.assertNotNull(reservationOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertNotNull(localDateTimeList13);
        org.junit.Assert.assertNotNull(reservationOptional15);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional2 = bookingService0.getReservation("");
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy3 = null;
        bookingService0.setPricingStrategy(pricingStrategy3);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = bookingService0.calculateReservationCost(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PricingStrategy.calculateDeposit(int)\" because \"this.pricingStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationOptional2);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = bookingService0.findAvailableEquipment();
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy3 = null;
        bookingService0.setPricingStrategy(pricingStrategy3);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean9 = bookingService0.isSlotAvailable("", localDateTime6, localDateTime7, "");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional13 = bookingService0.modifyBooking("hi!", localDateTime11, localDateTime12);
        java.lang.Class<?> wildcardClass14 = bookingService0.getClass();
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(reservationOptional13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        java.util.List<com.yorku.lab.model.Reservation> reservationList3 = bookingService0.getReservationsByUser("");
        com.yorku.lab.model.User user4 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double5 = bookingService0.calculateHourlyRate(user4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(reservationList3);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = bookingService0.findAvailableEquipment();
        java.util.List<com.yorku.lab.model.Reservation> reservationList4 = bookingService0.getReservationsByUser("");
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy5 = null;
        bookingService0.setPricingStrategy(pricingStrategy5);
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(reservationList4);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        boolean boolean3 = bookingService0.cancelBooking("");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean8 = bookingService0.isSlotAvailable("", localDateTime5, localDateTime6, "");
        com.yorku.lab.model.User user9 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional13 = bookingService0.createReservation(user9, "", localDateTime11, localDateTime12);
        boolean boolean15 = bookingService0.cancelBooking("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList17 = bookingService0.getReservationsByUser("");
        java.time.LocalDateTime localDateTime19 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional20 = bookingService0.extendReservation("hi!", localDateTime19);
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy21 = null;
        bookingService0.setPricingStrategy(pricingStrategy21);
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional26 = bookingService0.modifyBooking("", localDateTime24, localDateTime25);
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional30 = bookingService0.modifyBooking("", localDateTime28, localDateTime29);
        com.yorku.lab.model.User user31 = null;
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional35 = bookingService0.createReservation(user31, "", localDateTime33, localDateTime34);
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationOptional13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(reservationList17);
        org.junit.Assert.assertNotNull(reservationOptional20);
        org.junit.Assert.assertNotNull(reservationOptional26);
        org.junit.Assert.assertNotNull(reservationOptional30);
        org.junit.Assert.assertNotNull(reservationOptional35);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = bookingService0.modifyBooking("", localDateTime2, localDateTime3);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional6 = bookingService0.getEquipment("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList7 = bookingService0.findAvailableEquipment();
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional9 = bookingService0.getReservation("");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional13 = bookingService0.modifyBooking("", localDateTime11, localDateTime12);
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy14 = null;
        bookingService0.setPricingStrategy(pricingStrategy14);
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional17 = bookingService0.getReservation("");
        org.junit.Assert.assertNotNull(reservationOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNotNull(reservationOptional9);
        org.junit.Assert.assertNotNull(reservationOptional13);
        org.junit.Assert.assertNotNull(reservationOptional17);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        java.util.List<com.yorku.lab.model.Reservation> reservationList3 = bookingService0.getReservationsByUser("");
        java.time.LocalDateTime localDateTime5 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional6 = bookingService0.extendReservation("", localDateTime5);
        com.yorku.lab.model.User user7 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional11 = bookingService0.createReservation(user7, "", localDateTime9, localDateTime10);
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNotNull(reservationOptional6);
        org.junit.Assert.assertNotNull(reservationOptional11);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        boolean boolean3 = bookingService0.cancelBooking("");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean8 = bookingService0.isSlotAvailable("", localDateTime5, localDateTime6, "");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional10 = bookingService0.getReservation("");
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean15 = bookingService0.isSlotAvailable("", localDateTime12, localDateTime13, "");
        java.util.List<com.yorku.lab.model.Reservation> reservationList17 = bookingService0.getReservationsByUser("");
        java.lang.Class<?> wildcardClass18 = bookingService0.getClass();
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationOptional10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(reservationList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = bookingService0.findAvailableEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList3 = bookingService0.findAvailableEquipment();
        java.time.LocalDateTime localDateTime5 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional6 = bookingService0.extendReservation("", localDateTime5);
        com.yorku.lab.model.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bookingService0.calculateDeposit(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNotNull(reservationOptional6);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        boolean boolean3 = bookingService0.cancelBooking("");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean8 = bookingService0.isSlotAvailable("", localDateTime5, localDateTime6, "");
        com.yorku.lab.model.User user9 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional13 = bookingService0.createReservation(user9, "", localDateTime11, localDateTime12);
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy14 = null;
        bookingService0.setPricingStrategy(pricingStrategy14);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional17 = bookingService0.getEquipment("");
        com.yorku.lab.model.User user18 = null;
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional22 = bookingService0.createReservation(user18, "hi!", localDateTime20, localDateTime21);
        com.yorku.lab.model.User user23 = null;
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional27 = bookingService0.createReservation(user23, "hi!", localDateTime25, localDateTime26);
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationOptional13);
        org.junit.Assert.assertNotNull(equipmentOptional17);
        org.junit.Assert.assertNotNull(reservationOptional22);
        org.junit.Assert.assertNotNull(reservationOptional27);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = bookingService0.findAvailableEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList3 = bookingService0.findAvailableEquipment();
        com.yorku.lab.model.User user4 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double5 = bookingService0.calculateDeposit(user4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(equipmentList3);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        java.util.List<com.yorku.lab.model.Reservation> reservationList3 = bookingService0.getReservationsByUser("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList5 = bookingService0.getReservationsByUser("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList7 = bookingService0.getReservationsByUser("hi!");
        com.yorku.lab.model.User user8 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional12 = bookingService0.createReservation(user8, "hi!", localDateTime10, localDateTime11);
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNotNull(reservationList5);
        org.junit.Assert.assertNotNull(reservationList7);
        org.junit.Assert.assertNotNull(reservationOptional12);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        boolean boolean3 = bookingService0.cancelBooking("");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean8 = bookingService0.isSlotAvailable("", localDateTime5, localDateTime6, "");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional10 = bookingService0.getReservation("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList11 = bookingService0.browseEquipment();
        com.yorku.lab.model.User user12 = null;
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional16 = bookingService0.createReservation(user12, "hi!", localDateTime14, localDateTime15);
        boolean boolean18 = bookingService0.cancelBooking("hi!");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional20 = bookingService0.getReservation("");
        com.yorku.lab.model.User user21 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double22 = bookingService0.calculateHourlyRate(user21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationOptional10);
        org.junit.Assert.assertNotNull(equipmentList11);
        org.junit.Assert.assertNotNull(reservationOptional16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(reservationOptional20);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        boolean boolean3 = bookingService0.cancelBooking("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList5 = bookingService0.getReservationsByUser("");
        com.yorku.lab.model.User user6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = bookingService0.calculateDeposit(user6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(reservationList5);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        boolean boolean3 = bookingService0.cancelBooking("");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean8 = bookingService0.isSlotAvailable("", localDateTime5, localDateTime6, "");
        com.yorku.lab.model.User user9 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional13 = bookingService0.createReservation(user9, "", localDateTime11, localDateTime12);
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy14 = null;
        bookingService0.setPricingStrategy(pricingStrategy14);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional17 = bookingService0.getEquipment("");
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional21 = bookingService0.modifyBooking("hi!", localDateTime19, localDateTime20);
        com.yorku.lab.model.User user22 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double23 = bookingService0.calculateDeposit(user22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationOptional13);
        org.junit.Assert.assertNotNull(equipmentOptional17);
        org.junit.Assert.assertNotNull(reservationOptional21);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = bookingService0.modifyBooking("", localDateTime2, localDateTime3);
        java.util.List<com.yorku.lab.model.Reservation> reservationList6 = bookingService0.getReservationsByUser("");
        java.lang.Class<?> wildcardClass7 = bookingService0.getClass();
        org.junit.Assert.assertNotNull(reservationOptional4);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        boolean boolean3 = bookingService0.cancelBooking("");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean8 = bookingService0.isSlotAvailable("", localDateTime5, localDateTime6, "");
        com.yorku.lab.model.User user9 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional13 = bookingService0.createReservation(user9, "", localDateTime11, localDateTime12);
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy14 = null;
        bookingService0.setPricingStrategy(pricingStrategy14);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional17 = bookingService0.getEquipment("");
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional21 = bookingService0.modifyBooking("hi!", localDateTime19, localDateTime20);
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        boolean boolean26 = bookingService0.isSlotAvailable("", localDateTime23, localDateTime24, "hi!");
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationOptional13);
        org.junit.Assert.assertNotNull(equipmentOptional17);
        org.junit.Assert.assertNotNull(reservationOptional21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        java.util.List<com.yorku.lab.model.Reservation> reservationList3 = bookingService0.getReservationsByUser("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList5 = bookingService0.getReservationsByUser("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional7 = bookingService0.getReservation("");
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNotNull(reservationList5);
        org.junit.Assert.assertNotNull(reservationOptional7);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        java.util.List<com.yorku.lab.model.Reservation> reservationList3 = bookingService0.getReservationsByUser("");
        com.yorku.lab.model.User user4 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional8 = bookingService0.createReservation(user4, "", localDateTime6, localDateTime7);
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional12 = bookingService0.modifyBooking("hi!", localDateTime10, localDateTime11);
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNotNull(reservationOptional8);
        org.junit.Assert.assertNotNull(reservationOptional12);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = bookingService0.modifyBooking("", localDateTime2, localDateTime3);
        java.util.List<com.yorku.lab.model.Reservation> reservationList6 = bookingService0.getReservationsByUser("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList7 = bookingService0.browseEquipment();
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional11 = bookingService0.modifyBooking("", localDateTime9, localDateTime10);
        java.util.List<com.yorku.lab.model.Reservation> reservationList13 = bookingService0.getReservationsByUser("");
        org.junit.Assert.assertNotNull(reservationOptional4);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNotNull(reservationOptional11);
        org.junit.Assert.assertNotNull(reservationList13);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = bookingService0.findAvailableEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList3 = bookingService0.findAvailableEquipment();
        java.time.LocalDateTime localDateTime5 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional6 = bookingService0.extendReservation("", localDateTime5);
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional10 = bookingService0.modifyBooking("", localDateTime8, localDateTime9);
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNotNull(reservationOptional6);
        org.junit.Assert.assertNotNull(reservationOptional10);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = bookingService0.modifyBooking("", localDateTime2, localDateTime3);
        java.util.List<com.yorku.lab.model.Reservation> reservationList6 = bookingService0.getReservationsByUser("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList7 = bookingService0.browseEquipment();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bookingService0.calculateReservationCost(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PricingStrategy.calculateDeposit(int)\" because \"this.pricingStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationOptional4);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(equipmentList7);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional2 = bookingService0.getReservation("");
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy3 = null;
        bookingService0.setPricingStrategy(pricingStrategy3);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional8 = bookingService0.modifyBooking("hi!", localDateTime6, localDateTime7);
        java.time.LocalDateTime localDateTime10 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional11 = bookingService0.extendReservation("", localDateTime10);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional13 = bookingService0.getEquipment("");
        com.yorku.lab.model.User user14 = null;
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional18 = bookingService0.createReservation(user14, "", localDateTime16, localDateTime17);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList19 = bookingService0.browseEquipment();
        // The following exception was thrown during execution in test generation
        try {
            double double21 = bookingService0.calculateReservationCost((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PricingStrategy.calculateDeposit(int)\" because \"this.pricingStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationOptional2);
        org.junit.Assert.assertNotNull(reservationOptional8);
        org.junit.Assert.assertNotNull(reservationOptional11);
        org.junit.Assert.assertNotNull(equipmentOptional13);
        org.junit.Assert.assertNotNull(reservationOptional18);
        org.junit.Assert.assertNotNull(equipmentList19);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        boolean boolean3 = bookingService0.cancelBooking("");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean8 = bookingService0.isSlotAvailable("", localDateTime5, localDateTime6, "");
        com.yorku.lab.model.User user9 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional13 = bookingService0.createReservation(user9, "", localDateTime11, localDateTime12);
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy14 = null;
        bookingService0.setPricingStrategy(pricingStrategy14);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional17 = bookingService0.getEquipment("");
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional21 = bookingService0.modifyBooking("hi!", localDateTime19, localDateTime20);
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional25 = bookingService0.modifyBooking("", localDateTime23, localDateTime24);
        java.util.List<com.yorku.lab.model.Reservation> reservationList27 = bookingService0.getReservationsByUser("");
        java.time.LocalDateTime localDateTime29 = null;
        java.util.List<java.time.LocalDateTime> localDateTimeList31 = bookingService0.suggestNextAvailableSlots("", localDateTime29, (int) (short) 0);
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationOptional13);
        org.junit.Assert.assertNotNull(equipmentOptional17);
        org.junit.Assert.assertNotNull(reservationOptional21);
        org.junit.Assert.assertNotNull(reservationOptional25);
        org.junit.Assert.assertNotNull(reservationList27);
        org.junit.Assert.assertNotNull(localDateTimeList31);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = bookingService0.modifyBooking("", localDateTime2, localDateTime3);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList5 = bookingService0.browseEquipment();
        boolean boolean7 = bookingService0.cancelBooking("hi!");
        java.lang.Class<?> wildcardClass8 = bookingService0.getClass();
        org.junit.Assert.assertNotNull(reservationOptional4);
        org.junit.Assert.assertNotNull(equipmentList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = bookingService0.modifyBooking("", localDateTime2, localDateTime3);
        java.util.List<com.yorku.lab.model.Reservation> reservationList6 = bookingService0.getReservationsByUser("");
        boolean boolean8 = bookingService0.cancelBooking("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList10 = bookingService0.getReservationsByUser("hi!");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional12 = bookingService0.getReservation("");
        com.yorku.lab.model.User user13 = null;
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional17 = bookingService0.createReservation(user13, "", localDateTime15, localDateTime16);
        org.junit.Assert.assertNotNull(reservationOptional4);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(reservationOptional12);
        org.junit.Assert.assertNotNull(reservationOptional17);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = bookingService0.modifyBooking("", localDateTime2, localDateTime3);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList5 = bookingService0.browseEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList6 = bookingService0.browseEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList7 = bookingService0.browseEquipment();
        org.junit.Assert.assertNotNull(reservationOptional4);
        org.junit.Assert.assertNotNull(equipmentList5);
        org.junit.Assert.assertNotNull(equipmentList6);
        org.junit.Assert.assertNotNull(equipmentList7);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        boolean boolean3 = bookingService0.cancelBooking("");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean8 = bookingService0.isSlotAvailable("", localDateTime5, localDateTime6, "");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional10 = bookingService0.getReservation("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList11 = bookingService0.browseEquipment();
        com.yorku.lab.model.User user12 = null;
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional16 = bookingService0.createReservation(user12, "hi!", localDateTime14, localDateTime15);
        com.yorku.lab.model.User user17 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = bookingService0.calculateHourlyRate(user17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationOptional10);
        org.junit.Assert.assertNotNull(equipmentList11);
        org.junit.Assert.assertNotNull(reservationOptional16);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        boolean boolean3 = bookingService0.cancelBooking("");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean8 = bookingService0.isSlotAvailable("", localDateTime5, localDateTime6, "");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional10 = bookingService0.getReservation("");
        java.lang.Class<?> wildcardClass11 = bookingService0.getClass();
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationOptional10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional2 = bookingService0.getReservation("");
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy3 = null;
        bookingService0.setPricingStrategy(pricingStrategy3);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional8 = bookingService0.modifyBooking("hi!", localDateTime6, localDateTime7);
        java.time.LocalDateTime localDateTime10 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional11 = bookingService0.extendReservation("", localDateTime10);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional13 = bookingService0.getEquipment("");
        com.yorku.lab.model.User user14 = null;
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional18 = bookingService0.createReservation(user14, "", localDateTime16, localDateTime17);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList19 = bookingService0.browseEquipment();
        boolean boolean21 = bookingService0.cancelBooking("");
        org.junit.Assert.assertNotNull(reservationOptional2);
        org.junit.Assert.assertNotNull(reservationOptional8);
        org.junit.Assert.assertNotNull(reservationOptional11);
        org.junit.Assert.assertNotNull(equipmentOptional13);
        org.junit.Assert.assertNotNull(reservationOptional18);
        org.junit.Assert.assertNotNull(equipmentList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional2 = bookingService0.getReservation("");
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy3 = null;
        bookingService0.setPricingStrategy(pricingStrategy3);
        java.time.LocalDateTime localDateTime6 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional7 = bookingService0.extendReservation("hi!", localDateTime6);
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy8 = null;
        bookingService0.setPricingStrategy(pricingStrategy8);
        org.junit.Assert.assertNotNull(reservationOptional2);
        org.junit.Assert.assertNotNull(reservationOptional7);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = bookingService0.modifyBooking("", localDateTime2, localDateTime3);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional6 = bookingService0.getEquipment("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList7 = bookingService0.findAvailableEquipment();
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional9 = bookingService0.getReservation("");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional13 = bookingService0.modifyBooking("", localDateTime11, localDateTime12);
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional15 = bookingService0.getReservation("");
        com.yorku.lab.model.User user16 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = bookingService0.calculateHourlyRate(user16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNotNull(reservationOptional9);
        org.junit.Assert.assertNotNull(reservationOptional13);
        org.junit.Assert.assertNotNull(reservationOptional15);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        boolean boolean3 = bookingService0.cancelBooking("");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean8 = bookingService0.isSlotAvailable("", localDateTime5, localDateTime6, "");
        com.yorku.lab.model.User user9 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional13 = bookingService0.createReservation(user9, "", localDateTime11, localDateTime12);
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy14 = null;
        bookingService0.setPricingStrategy(pricingStrategy14);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = bookingService0.calculateReservationCost((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PricingStrategy.calculateDeposit(int)\" because \"this.pricingStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationOptional13);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        boolean boolean3 = bookingService0.cancelBooking("");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean8 = bookingService0.isSlotAvailable("", localDateTime5, localDateTime6, "");
        com.yorku.lab.model.User user9 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional13 = bookingService0.createReservation(user9, "", localDateTime11, localDateTime12);
        boolean boolean15 = bookingService0.cancelBooking("hi!");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList16 = bookingService0.findAvailableEquipment();
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy17 = null;
        bookingService0.setPricingStrategy(pricingStrategy17);
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional22 = bookingService0.modifyBooking("hi!", localDateTime20, localDateTime21);
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationOptional13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(equipmentList16);
        org.junit.Assert.assertNotNull(reservationOptional22);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        java.util.List<com.yorku.lab.model.Reservation> reservationList3 = bookingService0.getReservationsByUser("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList5 = bookingService0.getReservationsByUser("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList7 = bookingService0.getReservationsByUser("hi!");
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy8 = null;
        bookingService0.setPricingStrategy(pricingStrategy8);
        com.yorku.lab.model.User user10 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional14 = bookingService0.createReservation(user10, "", localDateTime12, localDateTime13);
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNotNull(reservationList5);
        org.junit.Assert.assertNotNull(reservationList7);
        org.junit.Assert.assertNotNull(reservationOptional14);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = bookingService0.modifyBooking("", localDateTime2, localDateTime3);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional6 = bookingService0.getEquipment("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList7 = bookingService0.findAvailableEquipment();
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional9 = bookingService0.getReservation("");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional13 = bookingService0.modifyBooking("", localDateTime11, localDateTime12);
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy14 = null;
        bookingService0.setPricingStrategy(pricingStrategy14);
        java.time.LocalDateTime localDateTime17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.time.LocalDateTime> localDateTimeList19 = bookingService0.suggestNextAvailableSlots("", localDateTime17, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.plusDays(long)\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNotNull(reservationOptional9);
        org.junit.Assert.assertNotNull(reservationOptional13);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional2 = bookingService0.getReservation("");
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy3 = null;
        bookingService0.setPricingStrategy(pricingStrategy3);
        java.time.LocalDateTime localDateTime6 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional7 = bookingService0.extendReservation("hi!", localDateTime6);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional9 = bookingService0.getEquipment("");
        org.junit.Assert.assertNotNull(reservationOptional2);
        org.junit.Assert.assertNotNull(reservationOptional7);
        org.junit.Assert.assertNotNull(equipmentOptional9);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        boolean boolean3 = bookingService0.cancelBooking("");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean8 = bookingService0.isSlotAvailable("", localDateTime5, localDateTime6, "");
        com.yorku.lab.model.User user9 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional13 = bookingService0.createReservation(user9, "", localDateTime11, localDateTime12);
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy14 = null;
        bookingService0.setPricingStrategy(pricingStrategy14);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional17 = bookingService0.getEquipment("");
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional21 = bookingService0.modifyBooking("hi!", localDateTime19, localDateTime20);
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional25 = bookingService0.modifyBooking("", localDateTime23, localDateTime24);
        java.util.List<com.yorku.lab.model.Reservation> reservationList27 = bookingService0.getReservationsByUser("");
        com.yorku.lab.model.User user28 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double29 = bookingService0.calculateDeposit(user28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationOptional13);
        org.junit.Assert.assertNotNull(equipmentOptional17);
        org.junit.Assert.assertNotNull(reservationOptional21);
        org.junit.Assert.assertNotNull(reservationOptional25);
        org.junit.Assert.assertNotNull(reservationList27);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional2 = bookingService0.getReservation("");
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy3 = null;
        bookingService0.setPricingStrategy(pricingStrategy3);
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional6 = bookingService0.getReservation("hi!");
        com.yorku.lab.model.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bookingService0.calculateHourlyRate(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationOptional2);
        org.junit.Assert.assertNotNull(reservationOptional6);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = bookingService0.findAvailableEquipment();
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy3 = null;
        bookingService0.setPricingStrategy(pricingStrategy3);
        com.yorku.lab.model.User user5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double6 = bookingService0.calculateHourlyRate(user5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        boolean boolean3 = bookingService0.cancelBooking("");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean8 = bookingService0.isSlotAvailable("", localDateTime5, localDateTime6, "");
        com.yorku.lab.model.User user9 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional13 = bookingService0.createReservation(user9, "", localDateTime11, localDateTime12);
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy14 = null;
        bookingService0.setPricingStrategy(pricingStrategy14);
        boolean boolean17 = bookingService0.cancelBooking("hi!");
        com.yorku.lab.model.User user18 = null;
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional22 = bookingService0.createReservation(user18, "hi!", localDateTime20, localDateTime21);
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional26 = bookingService0.modifyBooking("", localDateTime24, localDateTime25);
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationOptional13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(reservationOptional22);
        org.junit.Assert.assertNotNull(reservationOptional26);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        boolean boolean3 = bookingService0.cancelBooking("");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean8 = bookingService0.isSlotAvailable("", localDateTime5, localDateTime6, "");
        com.yorku.lab.model.User user9 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional13 = bookingService0.createReservation(user9, "", localDateTime11, localDateTime12);
        boolean boolean15 = bookingService0.cancelBooking("hi!");
        // The following exception was thrown during execution in test generation
        try {
            double double17 = bookingService0.calculateReservationCost((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PricingStrategy.calculateDeposit(int)\" because \"this.pricingStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationOptional13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        boolean boolean3 = bookingService0.cancelBooking("");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean8 = bookingService0.isSlotAvailable("", localDateTime5, localDateTime6, "");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional10 = bookingService0.getReservation("");
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean15 = bookingService0.isSlotAvailable("", localDateTime12, localDateTime13, "");
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional19 = bookingService0.modifyBooking("hi!", localDateTime17, localDateTime18);
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationOptional10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(reservationOptional19);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = bookingService0.modifyBooking("", localDateTime2, localDateTime3);
        com.yorku.lab.model.User user5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double6 = bookingService0.calculateDeposit(user5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationOptional4);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional2 = bookingService0.getReservation("");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional6 = bookingService0.modifyBooking("", localDateTime4, localDateTime5);
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional10 = bookingService0.modifyBooking("", localDateTime8, localDateTime9);
        java.util.List<com.yorku.lab.model.Reservation> reservationList12 = bookingService0.getReservationsByUser("hi!");
        java.lang.Class<?> wildcardClass13 = bookingService0.getClass();
        org.junit.Assert.assertNotNull(reservationOptional2);
        org.junit.Assert.assertNotNull(reservationOptional6);
        org.junit.Assert.assertNotNull(reservationOptional10);
        org.junit.Assert.assertNotNull(reservationList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = bookingService0.modifyBooking("", localDateTime2, localDateTime3);
        java.util.List<com.yorku.lab.model.Reservation> reservationList6 = bookingService0.getReservationsByUser("");
        boolean boolean8 = bookingService0.cancelBooking("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList10 = bookingService0.getReservationsByUser("hi!");
        java.time.LocalDateTime localDateTime12 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional13 = bookingService0.extendReservation("hi!", localDateTime12);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean18 = bookingService0.isSlotAvailable("hi!", localDateTime15, localDateTime16, "");
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy19 = null;
        bookingService0.setPricingStrategy(pricingStrategy19);
        org.junit.Assert.assertNotNull(reservationOptional4);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(reservationOptional13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = bookingService0.findAvailableEquipment();
        com.yorku.lab.model.User user3 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional7 = bookingService0.createReservation(user3, "", localDateTime5, localDateTime6);
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(reservationOptional7);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        boolean boolean3 = bookingService0.cancelBooking("");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean8 = bookingService0.isSlotAvailable("", localDateTime5, localDateTime6, "");
        com.yorku.lab.model.User user9 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional13 = bookingService0.createReservation(user9, "", localDateTime11, localDateTime12);
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy14 = null;
        bookingService0.setPricingStrategy(pricingStrategy14);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional17 = bookingService0.getEquipment("");
        com.yorku.lab.model.User user18 = null;
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional22 = bookingService0.createReservation(user18, "hi!", localDateTime20, localDateTime21);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional24 = bookingService0.getEquipment("");
        boolean boolean26 = bookingService0.cancelBooking("");
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationOptional13);
        org.junit.Assert.assertNotNull(equipmentOptional17);
        org.junit.Assert.assertNotNull(reservationOptional22);
        org.junit.Assert.assertNotNull(equipmentOptional24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        boolean boolean3 = bookingService0.cancelBooking("");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean8 = bookingService0.isSlotAvailable("", localDateTime5, localDateTime6, "");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional10 = bookingService0.getReservation("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList11 = bookingService0.browseEquipment();
        java.time.LocalDateTime localDateTime13 = null;
        java.util.List<java.time.LocalDateTime> localDateTimeList15 = bookingService0.suggestNextAvailableSlots("hi!", localDateTime13, 0);
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationOptional10);
        org.junit.Assert.assertNotNull(equipmentList11);
        org.junit.Assert.assertNotNull(localDateTimeList15);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = bookingService0.findAvailableEquipment();
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy3 = null;
        bookingService0.setPricingStrategy(pricingStrategy3);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean9 = bookingService0.isSlotAvailable("", localDateTime6, localDateTime7, "");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional13 = bookingService0.modifyBooking("hi!", localDateTime11, localDateTime12);
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy14 = null;
        bookingService0.setPricingStrategy(pricingStrategy14);
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional19 = bookingService0.modifyBooking("", localDateTime17, localDateTime18);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList20 = bookingService0.browseEquipment();
        java.lang.Class<?> wildcardClass21 = equipmentList20.getClass();
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(reservationOptional13);
        org.junit.Assert.assertNotNull(reservationOptional19);
        org.junit.Assert.assertNotNull(equipmentList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional2 = bookingService0.getReservation("");
        com.yorku.lab.model.User user3 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional7 = bookingService0.createReservation(user3, "", localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional11 = bookingService0.modifyBooking("hi!", localDateTime9, localDateTime10);
        com.yorku.lab.model.User user12 = null;
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional16 = bookingService0.createReservation(user12, "hi!", localDateTime14, localDateTime15);
        com.yorku.lab.model.User user17 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = bookingService0.calculateHourlyRate(user17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationOptional2);
        org.junit.Assert.assertNotNull(reservationOptional7);
        org.junit.Assert.assertNotNull(reservationOptional11);
        org.junit.Assert.assertNotNull(reservationOptional16);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = bookingService0.modifyBooking("", localDateTime2, localDateTime3);
        java.util.List<com.yorku.lab.model.Reservation> reservationList6 = bookingService0.getReservationsByUser("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList7 = bookingService0.browseEquipment();
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional11 = bookingService0.modifyBooking("", localDateTime9, localDateTime10);
        com.yorku.lab.model.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bookingService0.calculateDeposit(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationOptional4);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNotNull(reservationOptional11);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        java.util.List<com.yorku.lab.model.Reservation> reservationList3 = bookingService0.getReservationsByUser("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList5 = bookingService0.getReservationsByUser("");
        com.yorku.lab.model.User user6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = bookingService0.calculateHourlyRate(user6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNotNull(reservationList5);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = bookingService0.findAvailableEquipment();
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy3 = null;
        bookingService0.setPricingStrategy(pricingStrategy3);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean9 = bookingService0.isSlotAvailable("", localDateTime6, localDateTime7, "");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional13 = bookingService0.modifyBooking("hi!", localDateTime11, localDateTime12);
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy14 = null;
        bookingService0.setPricingStrategy(pricingStrategy14);
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional19 = bookingService0.modifyBooking("", localDateTime17, localDateTime18);
        com.yorku.lab.model.User user20 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double21 = bookingService0.calculateHourlyRate(user20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(reservationOptional13);
        org.junit.Assert.assertNotNull(reservationOptional19);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        boolean boolean3 = bookingService0.cancelBooking("");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean8 = bookingService0.isSlotAvailable("", localDateTime5, localDateTime6, "");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional10 = bookingService0.getReservation("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList11 = bookingService0.browseEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList12 = bookingService0.findAvailableEquipment();
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationOptional10);
        org.junit.Assert.assertNotNull(equipmentList11);
        org.junit.Assert.assertNotNull(equipmentList12);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional2 = bookingService0.getReservation("");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional6 = bookingService0.modifyBooking("", localDateTime4, localDateTime5);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList7 = bookingService0.browseEquipment();
        org.junit.Assert.assertNotNull(reservationOptional2);
        org.junit.Assert.assertNotNull(reservationOptional6);
        org.junit.Assert.assertNotNull(equipmentList7);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.yorku.lab.repository.ReservationRepository reservationRepository0 = null;
        com.yorku.lab.repository.EquipmentRepository equipmentRepository1 = null;
        com.yorku.lab.repository.UserRepository userRepository2 = null;
        com.yorku.lab.service.BookingService bookingService3 = new com.yorku.lab.service.BookingService(reservationRepository0, equipmentRepository1, userRepository2);
        com.yorku.lab.model.User user4 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double5 = bookingService3.calculateHourlyRate(user4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = bookingService0.modifyBooking("", localDateTime2, localDateTime3);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList5 = bookingService0.browseEquipment();
        boolean boolean7 = bookingService0.cancelBooking("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList9 = bookingService0.getReservationsByUser("");
        org.junit.Assert.assertNotNull(reservationOptional4);
        org.junit.Assert.assertNotNull(equipmentList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reservationList9);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = bookingService0.modifyBooking("", localDateTime2, localDateTime3);
        java.util.List<com.yorku.lab.model.Reservation> reservationList6 = bookingService0.getReservationsByUser("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = bookingService0.getEquipment("");
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bookingService0.calculateReservationCost(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PricingStrategy.calculateDeposit(int)\" because \"this.pricingStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationOptional4);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        boolean boolean3 = bookingService0.cancelBooking("");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean8 = bookingService0.isSlotAvailable("", localDateTime5, localDateTime6, "");
        java.time.LocalDateTime localDateTime10 = null;
        java.util.List<java.time.LocalDateTime> localDateTimeList12 = bookingService0.suggestNextAvailableSlots("hi!", localDateTime10, (int) (short) 0);
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDateTimeList12);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = bookingService0.modifyBooking("", localDateTime2, localDateTime3);
        java.lang.Class<?> wildcardClass5 = bookingService0.getClass();
        org.junit.Assert.assertNotNull(reservationOptional4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        boolean boolean3 = bookingService0.cancelBooking("");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean8 = bookingService0.isSlotAvailable("", localDateTime5, localDateTime6, "");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional10 = bookingService0.getReservation("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList11 = bookingService0.browseEquipment();
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional15 = bookingService0.modifyBooking("hi!", localDateTime13, localDateTime14);
        boolean boolean17 = bookingService0.cancelBooking("");
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationOptional10);
        org.junit.Assert.assertNotNull(equipmentList11);
        org.junit.Assert.assertNotNull(reservationOptional15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional2 = bookingService0.getReservation("");
        com.yorku.lab.model.User user3 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional7 = bookingService0.createReservation(user3, "", localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional11 = bookingService0.modifyBooking("hi!", localDateTime9, localDateTime10);
        com.yorku.lab.model.User user12 = null;
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional16 = bookingService0.createReservation(user12, "hi!", localDateTime14, localDateTime15);
        java.util.List<com.yorku.lab.model.Reservation> reservationList18 = bookingService0.getReservationsByUser("hi!");
        com.yorku.lab.model.User user19 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double20 = bookingService0.calculateDeposit(user19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationOptional2);
        org.junit.Assert.assertNotNull(reservationOptional7);
        org.junit.Assert.assertNotNull(reservationOptional11);
        org.junit.Assert.assertNotNull(reservationOptional16);
        org.junit.Assert.assertNotNull(reservationList18);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = bookingService0.findAvailableEquipment();
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy3 = null;
        bookingService0.setPricingStrategy(pricingStrategy3);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean9 = bookingService0.isSlotAvailable("", localDateTime6, localDateTime7, "");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional13 = bookingService0.modifyBooking("hi!", localDateTime11, localDateTime12);
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy14 = null;
        bookingService0.setPricingStrategy(pricingStrategy14);
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional19 = bookingService0.modifyBooking("", localDateTime17, localDateTime18);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList20 = bookingService0.browseEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional22 = bookingService0.getEquipment("");
        boolean boolean24 = bookingService0.cancelBooking("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList25 = bookingService0.browseEquipment();
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(reservationOptional13);
        org.junit.Assert.assertNotNull(reservationOptional19);
        org.junit.Assert.assertNotNull(equipmentList20);
        org.junit.Assert.assertNotNull(equipmentOptional22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(equipmentList25);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        boolean boolean3 = bookingService0.cancelBooking("");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean8 = bookingService0.isSlotAvailable("", localDateTime5, localDateTime6, "");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional10 = bookingService0.getReservation("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList11 = bookingService0.browseEquipment();
        com.yorku.lab.model.User user12 = null;
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional16 = bookingService0.createReservation(user12, "hi!", localDateTime14, localDateTime15);
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        boolean boolean21 = bookingService0.isSlotAvailable("hi!", localDateTime18, localDateTime19, "");
        com.yorku.lab.model.User user22 = null;
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional26 = bookingService0.createReservation(user22, "", localDateTime24, localDateTime25);
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional28 = bookingService0.getReservation("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional30 = bookingService0.getReservation("");
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationOptional10);
        org.junit.Assert.assertNotNull(equipmentList11);
        org.junit.Assert.assertNotNull(reservationOptional16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(reservationOptional26);
        org.junit.Assert.assertNotNull(reservationOptional28);
        org.junit.Assert.assertNotNull(reservationOptional30);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = bookingService0.findAvailableEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList3 = bookingService0.findAvailableEquipment();
        java.time.LocalDateTime localDateTime5 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional6 = bookingService0.extendReservation("", localDateTime5);
        com.yorku.lab.model.User user7 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional11 = bookingService0.createReservation(user7, "", localDateTime9, localDateTime10);
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNotNull(reservationOptional6);
        org.junit.Assert.assertNotNull(reservationOptional11);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = bookingService0.modifyBooking("", localDateTime2, localDateTime3);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList5 = bookingService0.browseEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList6 = bookingService0.findAvailableEquipment();
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional10 = bookingService0.modifyBooking("", localDateTime8, localDateTime9);
        java.lang.Class<?> wildcardClass11 = bookingService0.getClass();
        org.junit.Assert.assertNotNull(reservationOptional4);
        org.junit.Assert.assertNotNull(equipmentList5);
        org.junit.Assert.assertNotNull(equipmentList6);
        org.junit.Assert.assertNotNull(reservationOptional10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional2 = bookingService0.getReservation("");
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy3 = null;
        bookingService0.setPricingStrategy(pricingStrategy3);
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional6 = bookingService0.getReservation("hi!");
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional10 = bookingService0.modifyBooking("", localDateTime8, localDateTime9);
        org.junit.Assert.assertNotNull(reservationOptional2);
        org.junit.Assert.assertNotNull(reservationOptional6);
        org.junit.Assert.assertNotNull(reservationOptional10);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = bookingService0.findAvailableEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList3 = bookingService0.findAvailableEquipment();
        java.time.LocalDateTime localDateTime5 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional6 = bookingService0.extendReservation("", localDateTime5);
        com.yorku.lab.model.User user7 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional11 = bookingService0.createReservation(user7, "hi!", localDateTime9, localDateTime10);
        java.lang.Class<?> wildcardClass12 = bookingService0.getClass();
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNotNull(reservationOptional6);
        org.junit.Assert.assertNotNull(reservationOptional11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        boolean boolean3 = bookingService0.cancelBooking("");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean8 = bookingService0.isSlotAvailable("", localDateTime5, localDateTime6, "");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional10 = bookingService0.getReservation("");
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean15 = bookingService0.isSlotAvailable("", localDateTime12, localDateTime13, "");
        java.util.List<com.yorku.lab.model.Reservation> reservationList17 = bookingService0.getReservationsByUser("");
        boolean boolean19 = bookingService0.cancelBooking("");
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy20 = null;
        bookingService0.setPricingStrategy(pricingStrategy20);
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationOptional10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(reservationList17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        boolean boolean3 = bookingService0.cancelBooking("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList5 = bookingService0.getReservationsByUser("");
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy6 = null;
        bookingService0.setPricingStrategy(pricingStrategy6);
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(reservationList5);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        java.util.List<com.yorku.lab.model.Reservation> reservationList3 = bookingService0.getReservationsByUser("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList5 = bookingService0.getReservationsByUser("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList7 = bookingService0.getReservationsByUser("hi!");
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy8 = null;
        bookingService0.setPricingStrategy(pricingStrategy8);
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional13 = bookingService0.modifyBooking("", localDateTime11, localDateTime12);
        com.yorku.lab.model.User user14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bookingService0.calculateDeposit(user14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNotNull(reservationList5);
        org.junit.Assert.assertNotNull(reservationList7);
        org.junit.Assert.assertNotNull(reservationOptional13);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = bookingService0.modifyBooking("", localDateTime2, localDateTime3);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional6 = bookingService0.getEquipment("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList7 = bookingService0.findAvailableEquipment();
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional9 = bookingService0.getReservation("");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional13 = bookingService0.modifyBooking("", localDateTime11, localDateTime12);
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional15 = bookingService0.getReservation("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional17 = bookingService0.getReservation("");
        org.junit.Assert.assertNotNull(reservationOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNotNull(reservationOptional9);
        org.junit.Assert.assertNotNull(reservationOptional13);
        org.junit.Assert.assertNotNull(reservationOptional15);
        org.junit.Assert.assertNotNull(reservationOptional17);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = bookingService0.modifyBooking("", localDateTime2, localDateTime3);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional6 = bookingService0.getEquipment("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList7 = bookingService0.findAvailableEquipment();
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional9 = bookingService0.getReservation("");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional13 = bookingService0.modifyBooking("", localDateTime11, localDateTime12);
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional15 = bookingService0.getReservation("");
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy16 = null;
        bookingService0.setPricingStrategy(pricingStrategy16);
        org.junit.Assert.assertNotNull(reservationOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNotNull(reservationOptional9);
        org.junit.Assert.assertNotNull(reservationOptional13);
        org.junit.Assert.assertNotNull(reservationOptional15);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        boolean boolean3 = bookingService0.cancelBooking("");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean8 = bookingService0.isSlotAvailable("", localDateTime5, localDateTime6, "");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional10 = bookingService0.getReservation("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList11 = bookingService0.browseEquipment();
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional15 = bookingService0.modifyBooking("hi!", localDateTime13, localDateTime14);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList16 = bookingService0.browseEquipment();
        java.lang.Class<?> wildcardClass17 = bookingService0.getClass();
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationOptional10);
        org.junit.Assert.assertNotNull(equipmentList11);
        org.junit.Assert.assertNotNull(reservationOptional15);
        org.junit.Assert.assertNotNull(equipmentList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        boolean boolean3 = bookingService0.cancelBooking("");
        com.yorku.lab.model.User user4 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional8 = bookingService0.createReservation(user4, "", localDateTime6, localDateTime7);
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(reservationOptional8);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = bookingService0.modifyBooking("", localDateTime2, localDateTime3);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional6 = bookingService0.getEquipment("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList7 = bookingService0.findAvailableEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList8 = bookingService0.findAvailableEquipment();
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy9 = null;
        bookingService0.setPricingStrategy(pricingStrategy9);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional12 = bookingService0.getEquipment("");
        org.junit.Assert.assertNotNull(reservationOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNotNull(equipmentList8);
        org.junit.Assert.assertNotNull(equipmentOptional12);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        boolean boolean3 = bookingService0.cancelBooking("");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean8 = bookingService0.isSlotAvailable("", localDateTime5, localDateTime6, "");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional10 = bookingService0.getReservation("");
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        boolean boolean15 = bookingService0.isSlotAvailable("", localDateTime12, localDateTime13, "");
        java.util.List<com.yorku.lab.model.Reservation> reservationList17 = bookingService0.getReservationsByUser("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList18 = bookingService0.findAvailableEquipment();
        com.yorku.lab.model.User user19 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double20 = bookingService0.calculateDeposit(user19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationOptional10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(reservationList17);
        org.junit.Assert.assertNotNull(equipmentList18);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = bookingService0.modifyBooking("", localDateTime2, localDateTime3);
        java.util.List<com.yorku.lab.model.Reservation> reservationList6 = bookingService0.getReservationsByUser("");
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional8 = bookingService0.getEquipment("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional10 = bookingService0.getReservation("");
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bookingService0.calculateReservationCost(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PricingStrategy.calculateDeposit(int)\" because \"this.pricingStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationOptional4);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(equipmentOptional8);
        org.junit.Assert.assertNotNull(reservationOptional10);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        boolean boolean3 = bookingService0.cancelBooking("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList4 = bookingService0.browseEquipment();
        java.util.List<com.yorku.lab.model.Reservation> reservationList6 = bookingService0.getReservationsByUser("hi!");
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(equipmentList4);
        org.junit.Assert.assertNotNull(reservationList6);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        boolean boolean3 = bookingService0.cancelBooking("");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean8 = bookingService0.isSlotAvailable("", localDateTime5, localDateTime6, "");
        com.yorku.lab.model.User user9 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional13 = bookingService0.createReservation(user9, "", localDateTime11, localDateTime12);
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy14 = null;
        bookingService0.setPricingStrategy(pricingStrategy14);
        com.yorku.lab.model.User user16 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = bookingService0.calculateHourlyRate(user16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationOptional13);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional2 = bookingService0.getReservation("");
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy3 = null;
        bookingService0.setPricingStrategy(pricingStrategy3);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional8 = bookingService0.modifyBooking("hi!", localDateTime6, localDateTime7);
        java.lang.Class<?> wildcardClass9 = reservationOptional8.getClass();
        org.junit.Assert.assertNotNull(reservationOptional2);
        org.junit.Assert.assertNotNull(reservationOptional8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = bookingService0.findAvailableEquipment();
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy3 = null;
        bookingService0.setPricingStrategy(pricingStrategy3);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean9 = bookingService0.isSlotAvailable("", localDateTime6, localDateTime7, "");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional11 = bookingService0.getReservation("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList12 = bookingService0.browseEquipment();
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(reservationOptional11);
        org.junit.Assert.assertNotNull(equipmentList12);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        boolean boolean3 = bookingService0.cancelBooking("");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean8 = bookingService0.isSlotAvailable("", localDateTime5, localDateTime6, "");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional10 = bookingService0.getReservation("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList11 = bookingService0.browseEquipment();
        com.yorku.lab.model.User user12 = null;
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional16 = bookingService0.createReservation(user12, "hi!", localDateTime14, localDateTime15);
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        boolean boolean21 = bookingService0.isSlotAvailable("hi!", localDateTime18, localDateTime19, "");
        com.yorku.lab.model.User user22 = null;
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional26 = bookingService0.createReservation(user22, "", localDateTime24, localDateTime25);
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional30 = bookingService0.modifyBooking("", localDateTime28, localDateTime29);
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional32 = bookingService0.getReservation("");
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationOptional10);
        org.junit.Assert.assertNotNull(equipmentList11);
        org.junit.Assert.assertNotNull(reservationOptional16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(reservationOptional26);
        org.junit.Assert.assertNotNull(reservationOptional30);
        org.junit.Assert.assertNotNull(reservationOptional32);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        boolean boolean3 = bookingService0.cancelBooking("");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean8 = bookingService0.isSlotAvailable("", localDateTime5, localDateTime6, "");
        com.yorku.lab.model.User user9 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional13 = bookingService0.createReservation(user9, "", localDateTime11, localDateTime12);
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy14 = null;
        bookingService0.setPricingStrategy(pricingStrategy14);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional17 = bookingService0.getEquipment("");
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional21 = bookingService0.modifyBooking("hi!", localDateTime19, localDateTime20);
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional25 = bookingService0.modifyBooking("", localDateTime23, localDateTime24);
        java.lang.Class<?> wildcardClass26 = bookingService0.getClass();
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationOptional13);
        org.junit.Assert.assertNotNull(equipmentOptional17);
        org.junit.Assert.assertNotNull(reservationOptional21);
        org.junit.Assert.assertNotNull(reservationOptional25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional2 = bookingService0.getReservation("");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional6 = bookingService0.modifyBooking("", localDateTime4, localDateTime5);
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional10 = bookingService0.modifyBooking("", localDateTime8, localDateTime9);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional14 = bookingService0.modifyBooking("", localDateTime12, localDateTime13);
        com.yorku.lab.model.User user15 = null;
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional19 = bookingService0.createReservation(user15, "hi!", localDateTime17, localDateTime18);
        org.junit.Assert.assertNotNull(reservationOptional2);
        org.junit.Assert.assertNotNull(reservationOptional6);
        org.junit.Assert.assertNotNull(reservationOptional10);
        org.junit.Assert.assertNotNull(reservationOptional14);
        org.junit.Assert.assertNotNull(reservationOptional19);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = bookingService0.modifyBooking("", localDateTime2, localDateTime3);
        java.util.List<com.yorku.lab.model.Reservation> reservationList6 = bookingService0.getReservationsByUser("");
        boolean boolean8 = bookingService0.cancelBooking("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList10 = bookingService0.getReservationsByUser("hi!");
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy11 = null;
        bookingService0.setPricingStrategy(pricingStrategy11);
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        boolean boolean17 = bookingService0.isSlotAvailable("", localDateTime14, localDateTime15, "hi!");
        org.junit.Assert.assertNotNull(reservationOptional4);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = bookingService0.modifyBooking("", localDateTime2, localDateTime3);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional6 = bookingService0.getEquipment("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList7 = bookingService0.findAvailableEquipment();
        java.util.List<com.yorku.lab.model.Reservation> reservationList9 = bookingService0.getReservationsByUser("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList10 = bookingService0.findAvailableEquipment();
        java.util.List<com.yorku.lab.model.Reservation> reservationList12 = bookingService0.getReservationsByUser("hi!");
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        boolean boolean17 = bookingService0.isSlotAvailable("", localDateTime14, localDateTime15, "hi!");
        org.junit.Assert.assertNotNull(reservationOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertNotNull(equipmentList10);
        org.junit.Assert.assertNotNull(reservationList12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = bookingService0.modifyBooking("", localDateTime2, localDateTime3);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList5 = bookingService0.browseEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList6 = bookingService0.browseEquipment();
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy7 = null;
        bookingService0.setPricingStrategy(pricingStrategy7);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList9 = bookingService0.findAvailableEquipment();
        org.junit.Assert.assertNotNull(reservationOptional4);
        org.junit.Assert.assertNotNull(equipmentList5);
        org.junit.Assert.assertNotNull(equipmentList6);
        org.junit.Assert.assertNotNull(equipmentList9);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = bookingService0.modifyBooking("", localDateTime2, localDateTime3);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList5 = bookingService0.browseEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList6 = bookingService0.findAvailableEquipment();
        boolean boolean8 = bookingService0.cancelBooking("hi!");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional10 = bookingService0.getReservation("");
        java.util.List<com.yorku.lab.model.Reservation> reservationList12 = bookingService0.getReservationsByUser("hi!");
        org.junit.Assert.assertNotNull(reservationOptional4);
        org.junit.Assert.assertNotNull(equipmentList5);
        org.junit.Assert.assertNotNull(equipmentList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(reservationOptional10);
        org.junit.Assert.assertNotNull(reservationList12);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional2 = bookingService0.getReservation("");
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy3 = null;
        bookingService0.setPricingStrategy(pricingStrategy3);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional8 = bookingService0.modifyBooking("hi!", localDateTime6, localDateTime7);
        java.time.LocalDateTime localDateTime10 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional11 = bookingService0.extendReservation("", localDateTime10);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional13 = bookingService0.getEquipment("");
        com.yorku.lab.model.User user14 = null;
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional18 = bookingService0.createReservation(user14, "", localDateTime16, localDateTime17);
        com.yorku.lab.model.User user19 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double20 = bookingService0.calculateHourlyRate(user19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationOptional2);
        org.junit.Assert.assertNotNull(reservationOptional8);
        org.junit.Assert.assertNotNull(reservationOptional11);
        org.junit.Assert.assertNotNull(equipmentOptional13);
        org.junit.Assert.assertNotNull(reservationOptional18);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = bookingService0.findAvailableEquipment();
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy3 = null;
        bookingService0.setPricingStrategy(pricingStrategy3);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean9 = bookingService0.isSlotAvailable("", localDateTime6, localDateTime7, "");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional13 = bookingService0.modifyBooking("hi!", localDateTime11, localDateTime12);
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy14 = null;
        bookingService0.setPricingStrategy(pricingStrategy14);
        java.util.List<com.yorku.lab.model.Reservation> reservationList17 = bookingService0.getReservationsByUser("");
        // The following exception was thrown during execution in test generation
        try {
            double double19 = bookingService0.calculateReservationCost(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PricingStrategy.calculateDeposit(int)\" because \"this.pricingStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(reservationOptional13);
        org.junit.Assert.assertNotNull(reservationList17);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional2 = bookingService0.getReservation("");
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy3 = null;
        bookingService0.setPricingStrategy(pricingStrategy3);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional8 = bookingService0.modifyBooking("hi!", localDateTime6, localDateTime7);
        java.util.List<com.yorku.lab.model.Reservation> reservationList10 = bookingService0.getReservationsByUser("");
        org.junit.Assert.assertNotNull(reservationOptional2);
        org.junit.Assert.assertNotNull(reservationOptional8);
        org.junit.Assert.assertNotNull(reservationList10);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        boolean boolean3 = bookingService0.cancelBooking("");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean8 = bookingService0.isSlotAvailable("", localDateTime5, localDateTime6, "");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional10 = bookingService0.getReservation("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList11 = bookingService0.browseEquipment();
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional13 = bookingService0.getReservation("");
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationOptional10);
        org.junit.Assert.assertNotNull(equipmentList11);
        org.junit.Assert.assertNotNull(reservationOptional13);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy1 = null;
        bookingService0.setPricingStrategy(pricingStrategy1);
        java.time.LocalDateTime localDateTime4 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional5 = bookingService0.extendReservation("", localDateTime4);
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional7 = bookingService0.getReservation("");
        org.junit.Assert.assertNotNull(reservationOptional5);
        org.junit.Assert.assertNotNull(reservationOptional7);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional2 = bookingService0.getReservation("");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional6 = bookingService0.modifyBooking("", localDateTime4, localDateTime5);
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional10 = bookingService0.modifyBooking("", localDateTime8, localDateTime9);
        java.util.List<com.yorku.lab.model.Reservation> reservationList12 = bookingService0.getReservationsByUser("hi!");
        com.yorku.lab.model.User user13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bookingService0.calculateHourlyRate(user13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationOptional2);
        org.junit.Assert.assertNotNull(reservationOptional6);
        org.junit.Assert.assertNotNull(reservationOptional10);
        org.junit.Assert.assertNotNull(reservationList12);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional2 = bookingService0.getReservation("");
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy3 = null;
        bookingService0.setPricingStrategy(pricingStrategy3);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional8 = bookingService0.modifyBooking("hi!", localDateTime6, localDateTime7);
        boolean boolean10 = bookingService0.cancelBooking("");
        org.junit.Assert.assertNotNull(reservationOptional2);
        org.junit.Assert.assertNotNull(reservationOptional8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = bookingService0.findAvailableEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList3 = bookingService0.findAvailableEquipment();
        java.time.LocalDateTime localDateTime5 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional6 = bookingService0.extendReservation("", localDateTime5);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList7 = bookingService0.browseEquipment();
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNotNull(reservationOptional6);
        org.junit.Assert.assertNotNull(equipmentList7);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy1 = null;
        bookingService0.setPricingStrategy(pricingStrategy1);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = bookingService0.calculateReservationCost((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PricingStrategy.calculateDeposit(int)\" because \"this.pricingStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = bookingService0.modifyBooking("", localDateTime2, localDateTime3);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional6 = bookingService0.getEquipment("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList7 = bookingService0.findAvailableEquipment();
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional9 = bookingService0.getReservation("");
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bookingService0.calculateReservationCost((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PricingStrategy.calculateDeposit(int)\" because \"this.pricingStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNotNull(reservationOptional9);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = bookingService0.modifyBooking("", localDateTime2, localDateTime3);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList5 = bookingService0.browseEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList6 = bookingService0.findAvailableEquipment();
        boolean boolean8 = bookingService0.cancelBooking("hi!");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional10 = bookingService0.getReservation("");
        com.yorku.lab.model.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bookingService0.calculateDeposit(user11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationOptional4);
        org.junit.Assert.assertNotNull(equipmentList5);
        org.junit.Assert.assertNotNull(equipmentList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(reservationOptional10);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = bookingService0.findAvailableEquipment();
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy3 = null;
        bookingService0.setPricingStrategy(pricingStrategy3);
        java.util.List<com.yorku.lab.model.Reservation> reservationList6 = bookingService0.getReservationsByUser("");
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(reservationList6);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional2 = bookingService0.getReservation("");
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy3 = null;
        bookingService0.setPricingStrategy(pricingStrategy3);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList5 = bookingService0.findAvailableEquipment();
        java.time.LocalDateTime localDateTime7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.time.LocalDateTime> localDateTimeList9 = bookingService0.suggestNextAvailableSlots("", localDateTime7, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.plusDays(long)\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationOptional2);
        org.junit.Assert.assertNotNull(equipmentList5);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = bookingService0.modifyBooking("", localDateTime2, localDateTime3);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional6 = bookingService0.getEquipment("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList7 = bookingService0.findAvailableEquipment();
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional9 = bookingService0.getReservation("");
        com.yorku.lab.model.User user10 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional14 = bookingService0.createReservation(user10, "", localDateTime12, localDateTime13);
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy15 = null;
        bookingService0.setPricingStrategy(pricingStrategy15);
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy17 = null;
        bookingService0.setPricingStrategy(pricingStrategy17);
        com.yorku.lab.model.User user19 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double20 = bookingService0.calculateDeposit(user19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNotNull(reservationOptional9);
        org.junit.Assert.assertNotNull(reservationOptional14);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        boolean boolean3 = bookingService0.cancelBooking("");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean8 = bookingService0.isSlotAvailable("", localDateTime5, localDateTime6, "");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional10 = bookingService0.getReservation("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList11 = bookingService0.browseEquipment();
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional15 = bookingService0.modifyBooking("hi!", localDateTime13, localDateTime14);
        java.time.LocalDateTime localDateTime17 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional18 = bookingService0.extendReservation("hi!", localDateTime17);
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationOptional10);
        org.junit.Assert.assertNotNull(equipmentList11);
        org.junit.Assert.assertNotNull(reservationOptional15);
        org.junit.Assert.assertNotNull(reservationOptional18);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional2 = bookingService0.getReservation("");
        java.time.LocalDateTime localDateTime4 = null;
        java.util.List<java.time.LocalDateTime> localDateTimeList6 = bookingService0.suggestNextAvailableSlots("", localDateTime4, 0);
        com.yorku.lab.model.User user7 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional11 = bookingService0.createReservation(user7, "hi!", localDateTime9, localDateTime10);
        org.junit.Assert.assertNotNull(reservationOptional2);
        org.junit.Assert.assertNotNull(localDateTimeList6);
        org.junit.Assert.assertNotNull(reservationOptional11);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional2 = bookingService0.getReservation("");
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy3 = null;
        bookingService0.setPricingStrategy(pricingStrategy3);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList5 = bookingService0.findAvailableEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional7 = bookingService0.getEquipment("");
        org.junit.Assert.assertNotNull(reservationOptional2);
        org.junit.Assert.assertNotNull(equipmentList5);
        org.junit.Assert.assertNotNull(equipmentOptional7);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = bookingService0.modifyBooking("", localDateTime2, localDateTime3);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional6 = bookingService0.getEquipment("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList7 = bookingService0.findAvailableEquipment();
        java.util.List<com.yorku.lab.model.Reservation> reservationList9 = bookingService0.getReservationsByUser("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList10 = bookingService0.findAvailableEquipment();
        java.util.List<com.yorku.lab.model.Reservation> reservationList12 = bookingService0.getReservationsByUser("hi!");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList13 = bookingService0.findAvailableEquipment();
        org.junit.Assert.assertNotNull(reservationOptional4);
        org.junit.Assert.assertNotNull(equipmentOptional6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertNotNull(equipmentList10);
        org.junit.Assert.assertNotNull(reservationList12);
        org.junit.Assert.assertNotNull(equipmentList13);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        boolean boolean3 = bookingService0.cancelBooking("");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean8 = bookingService0.isSlotAvailable("", localDateTime5, localDateTime6, "");
        com.yorku.lab.model.User user9 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional13 = bookingService0.createReservation(user9, "", localDateTime11, localDateTime12);
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy14 = null;
        bookingService0.setPricingStrategy(pricingStrategy14);
        boolean boolean17 = bookingService0.cancelBooking("hi!");
        java.time.LocalDateTime localDateTime19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.time.LocalDateTime> localDateTimeList21 = bookingService0.suggestNextAvailableSlots("", localDateTime19, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.plusDays(long)\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationOptional13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        boolean boolean3 = bookingService0.cancelBooking("");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean8 = bookingService0.isSlotAvailable("", localDateTime5, localDateTime6, "");
        com.yorku.lab.model.User user9 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional13 = bookingService0.createReservation(user9, "", localDateTime11, localDateTime12);
        boolean boolean15 = bookingService0.cancelBooking("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList17 = bookingService0.getReservationsByUser("");
        java.time.LocalDateTime localDateTime19 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional20 = bookingService0.extendReservation("hi!", localDateTime19);
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy21 = null;
        bookingService0.setPricingStrategy(pricingStrategy21);
        boolean boolean24 = bookingService0.cancelBooking("hi!");
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationOptional13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(reservationList17);
        org.junit.Assert.assertNotNull(reservationOptional20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional2 = bookingService0.getReservation("");
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy3 = null;
        bookingService0.setPricingStrategy(pricingStrategy3);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional8 = bookingService0.modifyBooking("hi!", localDateTime6, localDateTime7);
        java.time.LocalDateTime localDateTime10 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional11 = bookingService0.extendReservation("", localDateTime10);
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional13 = bookingService0.getEquipment("");
        com.yorku.lab.model.User user14 = null;
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional18 = bookingService0.createReservation(user14, "", localDateTime16, localDateTime17);
        java.lang.Class<?> wildcardClass19 = reservationOptional18.getClass();
        org.junit.Assert.assertNotNull(reservationOptional2);
        org.junit.Assert.assertNotNull(reservationOptional8);
        org.junit.Assert.assertNotNull(reservationOptional11);
        org.junit.Assert.assertNotNull(equipmentOptional13);
        org.junit.Assert.assertNotNull(reservationOptional18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList2 = bookingService0.findAvailableEquipment();
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy3 = null;
        bookingService0.setPricingStrategy(pricingStrategy3);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean9 = bookingService0.isSlotAvailable("", localDateTime6, localDateTime7, "");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional13 = bookingService0.modifyBooking("hi!", localDateTime11, localDateTime12);
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional15 = bookingService0.getReservation("");
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(reservationOptional13);
        org.junit.Assert.assertNotNull(reservationOptional15);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        boolean boolean3 = bookingService0.cancelBooking("");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean8 = bookingService0.isSlotAvailable("", localDateTime5, localDateTime6, "");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional10 = bookingService0.getReservation("");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList11 = bookingService0.browseEquipment();
        com.yorku.lab.model.User user12 = null;
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional16 = bookingService0.createReservation(user12, "hi!", localDateTime14, localDateTime15);
        boolean boolean18 = bookingService0.cancelBooking("hi!");
        // The following exception was thrown during execution in test generation
        try {
            double double20 = bookingService0.calculateReservationCost(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PricingStrategy.calculateDeposit(int)\" because \"this.pricingStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationOptional10);
        org.junit.Assert.assertNotNull(equipmentList11);
        org.junit.Assert.assertNotNull(reservationOptional16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        boolean boolean3 = bookingService0.cancelBooking("");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean8 = bookingService0.isSlotAvailable("", localDateTime5, localDateTime6, "");
        com.yorku.lab.model.User user9 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional13 = bookingService0.createReservation(user9, "", localDateTime11, localDateTime12);
        boolean boolean15 = bookingService0.cancelBooking("hi!");
        boolean boolean17 = bookingService0.cancelBooking("");
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationOptional13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        boolean boolean3 = bookingService0.cancelBooking("");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional5 = bookingService0.getReservation("hi!");
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional7 = bookingService0.getReservation("hi!");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList8 = bookingService0.browseEquipment();
        java.util.Optional<com.yorku.lab.model.Equipment> equipmentOptional10 = bookingService0.getEquipment("");
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(reservationOptional5);
        org.junit.Assert.assertNotNull(reservationOptional7);
        org.junit.Assert.assertNotNull(equipmentList8);
        org.junit.Assert.assertNotNull(equipmentOptional10);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional2 = bookingService0.getReservation("");
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy3 = null;
        bookingService0.setPricingStrategy(pricingStrategy3);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional8 = bookingService0.modifyBooking("hi!", localDateTime6, localDateTime7);
        java.time.LocalDateTime localDateTime10 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional11 = bookingService0.extendReservation("", localDateTime10);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bookingService0.calculateReservationCost((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.pattern.strategy.PricingStrategy.calculateDeposit(int)\" because \"this.pricingStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationOptional2);
        org.junit.Assert.assertNotNull(reservationOptional8);
        org.junit.Assert.assertNotNull(reservationOptional11);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional4 = bookingService0.modifyBooking("", localDateTime2, localDateTime3);
        com.yorku.lab.model.User user5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double6 = bookingService0.calculateHourlyRate(user5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.lab.model.User.getType()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationOptional4);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional2 = bookingService0.getReservation("");
        com.yorku.lab.model.User user3 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional7 = bookingService0.createReservation(user3, "", localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional11 = bookingService0.modifyBooking("hi!", localDateTime9, localDateTime10);
        java.util.List<com.yorku.lab.model.Equipment> equipmentList12 = bookingService0.findAvailableEquipment();
        org.junit.Assert.assertNotNull(reservationOptional2);
        org.junit.Assert.assertNotNull(reservationOptional7);
        org.junit.Assert.assertNotNull(reservationOptional11);
        org.junit.Assert.assertNotNull(equipmentList12);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        boolean boolean3 = bookingService0.cancelBooking("");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean8 = bookingService0.isSlotAvailable("", localDateTime5, localDateTime6, "");
        com.yorku.lab.model.User user9 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional13 = bookingService0.createReservation(user9, "", localDateTime11, localDateTime12);
        boolean boolean15 = bookingService0.cancelBooking("hi!");
        java.util.List<com.yorku.lab.model.Reservation> reservationList17 = bookingService0.getReservationsByUser("");
        java.time.LocalDateTime localDateTime19 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional20 = bookingService0.extendReservation("hi!", localDateTime19);
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy21 = null;
        bookingService0.setPricingStrategy(pricingStrategy21);
        java.time.LocalDateTime localDateTime24 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional25 = bookingService0.extendReservation("", localDateTime24);
        boolean boolean27 = bookingService0.cancelBooking("hi!");
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationOptional13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(reservationList17);
        org.junit.Assert.assertNotNull(reservationOptional20);
        org.junit.Assert.assertNotNull(reservationOptional25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional2 = bookingService0.getReservation("");
        com.yorku.lab.model.User user3 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional7 = bookingService0.createReservation(user3, "", localDateTime5, localDateTime6);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional11 = bookingService0.modifyBooking("hi!", localDateTime9, localDateTime10);
        com.yorku.lab.model.User user12 = null;
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional16 = bookingService0.createReservation(user12, "hi!", localDateTime14, localDateTime15);
        java.util.List<com.yorku.lab.model.Reservation> reservationList18 = bookingService0.getReservationsByUser("hi!");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList19 = bookingService0.browseEquipment();
        org.junit.Assert.assertNotNull(reservationOptional2);
        org.junit.Assert.assertNotNull(reservationOptional7);
        org.junit.Assert.assertNotNull(reservationOptional11);
        org.junit.Assert.assertNotNull(reservationOptional16);
        org.junit.Assert.assertNotNull(reservationList18);
        org.junit.Assert.assertNotNull(equipmentList19);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        com.yorku.lab.service.BookingService bookingService0 = new com.yorku.lab.service.BookingService();
        java.util.List<com.yorku.lab.model.Equipment> equipmentList1 = bookingService0.browseEquipment();
        boolean boolean3 = bookingService0.cancelBooking("");
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean8 = bookingService0.isSlotAvailable("", localDateTime5, localDateTime6, "");
        com.yorku.lab.model.User user9 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.util.Optional<com.yorku.lab.model.Reservation> reservationOptional13 = bookingService0.createReservation(user9, "", localDateTime11, localDateTime12);
        boolean boolean15 = bookingService0.cancelBooking("hi!");
        java.util.List<com.yorku.lab.model.Equipment> equipmentList16 = bookingService0.findAvailableEquipment();
        com.yorku.lab.pattern.strategy.PricingStrategy pricingStrategy17 = null;
        bookingService0.setPricingStrategy(pricingStrategy17);
        java.util.List<com.yorku.lab.model.Reservation> reservationList20 = bookingService0.getReservationsByUser("");
        org.junit.Assert.assertNotNull(equipmentList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reservationOptional13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(equipmentList16);
        org.junit.Assert.assertNotNull(reservationList20);
    }
}

