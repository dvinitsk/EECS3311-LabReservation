package test.AI_assistant.pattern.state;

import static org.junit.Assert.*;

import java.time.LocalDateTime;

import org.junit.Before;
import org.junit.Test;

import com.yorku.lab.enums.BookingStatus;
import com.yorku.lab.model.Reservation;
import com.yorku.lab.pattern.state.*;

public class ReservationStateFactoryAITest {

    private Reservation reservation;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private LocalDateTime futureTime;

    @Before
    public void setUp() {
        startTime = LocalDateTime.of(2026, 4, 10, 10, 0);
        endTime = LocalDateTime.of(2026, 4, 10, 12, 0);
        futureTime = LocalDateTime.of(2026, 4, 10, 14, 0);
        
        reservation = new Reservation("RES001", null, null, startTime, endTime);
        reservation.setStatus(BookingStatus.CONFIRMED);
    }

    // ===== Factory Method Tests =====
    @Test
    public void testNullStatusReturnsConfirmedState() {
        assertTrue(ReservationStateFactory.fromStatus(null) instanceof ConfirmedState);
    }

    @Test
    public void testConfirmedStatusReturnsConfirmedState() {
        assertTrue(ReservationStateFactory.fromStatus(BookingStatus.CONFIRMED) instanceof ConfirmedState);
    }

    @Test
    public void testModifiedStatusReturnsModifiedState() {
        assertTrue(ReservationStateFactory.fromStatus(BookingStatus.MODIFIED) instanceof ModifiedState);
    }

    @Test
    public void testActiveStatusReturnsActiveState() {
        assertTrue(ReservationStateFactory.fromStatus(BookingStatus.ACTIVE) instanceof ActiveState);
    }

    @Test
    public void testArrivedStatusReturnsArrivedState() {
        assertTrue(ReservationStateFactory.fromStatus(BookingStatus.ARRIVED) instanceof ArrivedState);
    }

    @Test
    public void testExtendedStatusReturnsExtendedState() {
        assertTrue(ReservationStateFactory.fromStatus(BookingStatus.EXTENDED) instanceof ExtendedState);
    }

    @Test
    public void testNoShowStatusReturnsNoShowState() {
        assertTrue(ReservationStateFactory.fromStatus(BookingStatus.NO_SHOW) instanceof NoShowState);
    }

    @Test
    public void testCancelledStatusReturnsCancelledState() {
        assertTrue(ReservationStateFactory.fromStatus(BookingStatus.CANCELLED) instanceof CancelledState);
    }

    @Test
    public void testCompletedStatusReturnsCompletedState() {
        assertTrue(ReservationStateFactory.fromStatus(BookingStatus.COMPLETED) instanceof CompletedState);
    }

    @Test
    public void testFactoryReturnsNewInstances() {
        ReservationState first = ReservationStateFactory.fromStatus(BookingStatus.CONFIRMED);
        ReservationState second = ReservationStateFactory.fromStatus(BookingStatus.CONFIRMED);
        assertNotSame(first, second);
    }

    // ===== ConfirmedState Tests =====
    @Test
    public void testConfirmedStateCanModify() {
        ReservationState confirmedState = new ConfirmedState();
        confirmedState.modify(reservation, startTime, futureTime);
        assertEquals(BookingStatus.MODIFIED, reservation.getStatus());
        assertTrue(reservation.getCurrentState() instanceof ModifiedState);
    }

    @Test
    public void testConfirmedStateCanCancel() {
        ReservationState confirmedState = new ConfirmedState();
        confirmedState.cancel(reservation);
        assertEquals(BookingStatus.CANCELLED, reservation.getStatus());
        assertTrue(reservation.getCurrentState() instanceof CancelledState);
    }

    @Test
    public void testConfirmedStateCanMarkArrived() {
        ReservationState confirmedState = new ConfirmedState();
        confirmedState.markArrived(reservation);
        assertEquals(BookingStatus.ARRIVED, reservation.getStatus());
        assertTrue(reservation.getCurrentState() instanceof ArrivedState);
        assertTrue(reservation.isArrived());
    }

    @Test
    public void testConfirmedStateCanMarkNoShow() {
        ReservationState confirmedState = new ConfirmedState();
        confirmedState.markNoShow(reservation);
        assertEquals(BookingStatus.NO_SHOW, reservation.getStatus());
        assertTrue(reservation.getCurrentState() instanceof NoShowState);
    }

    @Test(expected = IllegalStateException.class)
    public void testConfirmedStateCannotExtend() {
        ReservationState confirmedState = new ConfirmedState();
        confirmedState.extend(reservation, futureTime);
    }

    @Test(expected = IllegalStateException.class)
    public void testConfirmedStateCannotComplete() {
        ReservationState confirmedState = new ConfirmedState();
        confirmedState.complete(reservation);
    }

    // ===== ModifiedState Tests =====
    @Test
    public void testModifiedStateCanModify() {
        ReservationState modifiedState = new ModifiedState();
        modifiedState.modify(reservation, startTime, futureTime);
        assertEquals(BookingStatus.MODIFIED, reservation.getStatus());
    }

    @Test
    public void testModifiedStateCanCancel() {
        ReservationState modifiedState = new ModifiedState();
        modifiedState.cancel(reservation);
        assertEquals(BookingStatus.CANCELLED, reservation.getStatus());
        assertTrue(reservation.getCurrentState() instanceof CancelledState);
    }

    @Test
    public void testModifiedStateCanMarkArrived() {
        ReservationState modifiedState = new ModifiedState();
        modifiedState.markArrived(reservation);
        assertEquals(BookingStatus.ARRIVED, reservation.getStatus());
        assertTrue(reservation.getCurrentState() instanceof ArrivedState);
    }

    @Test
    public void testModifiedStateCanMarkNoShow() {
        ReservationState modifiedState = new ModifiedState();
        modifiedState.markNoShow(reservation);
        assertEquals(BookingStatus.NO_SHOW, reservation.getStatus());
        assertTrue(reservation.getCurrentState() instanceof NoShowState);
    }

    @Test(expected = IllegalStateException.class)
    public void testModifiedStateCannotExtend() {
        ReservationState modifiedState = new ModifiedState();
        modifiedState.extend(reservation, futureTime);
    }

    @Test(expected = IllegalStateException.class)
    public void testModifiedStateCannotComplete() {
        ReservationState modifiedState = new ModifiedState();
        modifiedState.complete(reservation);
    }

    // ===== ActiveState Tests =====
    @Test
    public void testActiveStateCanExtend() {
        ReservationState activeState = new ActiveState();
        activeState.extend(reservation, futureTime);
        assertEquals(BookingStatus.EXTENDED, reservation.getStatus());
        assertTrue(reservation.getCurrentState() instanceof ExtendedState);
    }

    @Test
    public void testActiveStateCanMarkArrived() {
        ReservationState activeState = new ActiveState();
        activeState.markArrived(reservation);
        assertEquals(BookingStatus.ARRIVED, reservation.getStatus());
        assertTrue(reservation.getCurrentState() instanceof ArrivedState);
    }

    @Test
    public void testActiveStateCanMarkNoShow() {
        ReservationState activeState = new ActiveState();
        activeState.markNoShow(reservation);
        assertEquals(BookingStatus.NO_SHOW, reservation.getStatus());
        assertTrue(reservation.getCurrentState() instanceof NoShowState);
    }

    @Test
    public void testActiveStateCanComplete() {
        ReservationState activeState = new ActiveState();
        activeState.complete(reservation);
        assertEquals(BookingStatus.COMPLETED, reservation.getStatus());
        assertTrue(reservation.getCurrentState() instanceof CompletedState);
    }

    @Test(expected = IllegalStateException.class)
    public void testActiveStateCannotModify() {
        ReservationState activeState = new ActiveState();
        activeState.modify(reservation, startTime, futureTime);
    }

    @Test(expected = IllegalStateException.class)
    public void testActiveStateCannotCancel() {
        ReservationState activeState = new ActiveState();
        activeState.cancel(reservation);
    }

    // ===== ArrivedState Tests =====
    @Test
    public void testArrivedStateCanExtend() {
        ReservationState arrivedState = new ArrivedState();
        arrivedState.extend(reservation, futureTime);
        assertEquals(BookingStatus.EXTENDED, reservation.getStatus());
        assertTrue(reservation.getCurrentState() instanceof ExtendedState);
    }

    @Test
    public void testArrivedStateCanComplete() {
        ReservationState arrivedState = new ArrivedState();
        arrivedState.complete(reservation);
        assertEquals(BookingStatus.COMPLETED, reservation.getStatus());
        assertTrue(reservation.getCurrentState() instanceof CompletedState);
    }

    @Test
    public void testArrivedStateMarkArrivedIsNoOp() {
        ReservationState arrivedState = new ArrivedState();
        reservation.setStatus(BookingStatus.ARRIVED);
        arrivedState.markArrived(reservation);
        assertEquals(BookingStatus.ARRIVED, reservation.getStatus());
    }

    @Test(expected = IllegalStateException.class)
    public void testArrivedStateCannotModify() {
        ReservationState arrivedState = new ArrivedState();
        arrivedState.modify(reservation, startTime, futureTime);
    }

    @Test(expected = IllegalStateException.class)
    public void testArrivedStateCannotCancel() {
        ReservationState arrivedState = new ArrivedState();
        arrivedState.cancel(reservation);
    }

    @Test(expected = IllegalStateException.class)
    public void testArrivedStateCannotMarkNoShow() {
        ReservationState arrivedState = new ArrivedState();
        arrivedState.markNoShow(reservation);
    }

    // ===== ExtendedState Tests =====
    @Test
    public void testExtendedStateCanExtend() {
        ReservationState extendedState = new ExtendedState();
        extendedState.extend(reservation, futureTime);
        assertEquals(BookingStatus.EXTENDED, reservation.getStatus());
    }

    @Test
    public void testExtendedStateCanMarkArrived() {
        ReservationState extendedState = new ExtendedState();
        extendedState.markArrived(reservation);
        assertEquals(BookingStatus.ARRIVED, reservation.getStatus());
        assertTrue(reservation.getCurrentState() instanceof ArrivedState);
    }

    @Test
    public void testExtendedStateCanMarkNoShow() {
        ReservationState extendedState = new ExtendedState();
        extendedState.markNoShow(reservation);
        assertEquals(BookingStatus.NO_SHOW, reservation.getStatus());
        assertTrue(reservation.getCurrentState() instanceof NoShowState);
    }

    @Test
    public void testExtendedStateCanComplete() {
        ReservationState extendedState = new ExtendedState();
        extendedState.complete(reservation);
        assertEquals(BookingStatus.COMPLETED, reservation.getStatus());
        assertTrue(reservation.getCurrentState() instanceof CompletedState);
    }

    @Test(expected = IllegalStateException.class)
    public void testExtendedStateCannotModify() {
        ReservationState extendedState = new ExtendedState();
        extendedState.modify(reservation, startTime, futureTime);
    }

    @Test(expected = IllegalStateException.class)
    public void testExtendedStateCannotCancel() {
        ReservationState extendedState = new ExtendedState();
        extendedState.cancel(reservation);
    }

    // ===== CancelledState Tests =====
    @Test
    public void testCancelledStateCancelIsNoOp() {
        ReservationState cancelledState = new CancelledState();
        reservation.setStatus(BookingStatus.CANCELLED);
        cancelledState.cancel(reservation);
        assertEquals(BookingStatus.CANCELLED, reservation.getStatus());
    }

    @Test(expected = IllegalStateException.class)
    public void testCancelledStateCannotModify() {
        ReservationState cancelledState = new CancelledState();
        cancelledState.modify(reservation, startTime, futureTime);
    }

    @Test(expected = IllegalStateException.class)
    public void testCancelledStateCannotExtend() {
        ReservationState cancelledState = new CancelledState();
        cancelledState.extend(reservation, futureTime);
    }

    @Test(expected = IllegalStateException.class)
    public void testCancelledStateCannotMarkArrived() {
        ReservationState cancelledState = new CancelledState();
        cancelledState.markArrived(reservation);
    }

    @Test(expected = IllegalStateException.class)
    public void testCancelledStateCannotMarkNoShow() {
        ReservationState cancelledState = new CancelledState();
        cancelledState.markNoShow(reservation);
    }

    @Test(expected = IllegalStateException.class)
    public void testCancelledStateCannotComplete() {
        ReservationState cancelledState = new CancelledState();
        cancelledState.complete(reservation);
    }

    // ===== CompletedState Tests =====
    @Test
    public void testCompletedStateCompleteIsNoOp() {
        ReservationState completedState = new CompletedState();
        reservation.setStatus(BookingStatus.COMPLETED);
        completedState.complete(reservation);
        assertEquals(BookingStatus.COMPLETED, reservation.getStatus());
    }

    @Test(expected = IllegalStateException.class)
    public void testCompletedStateCannotModify() {
        ReservationState completedState = new CompletedState();
        completedState.modify(reservation, startTime, futureTime);
    }

    @Test(expected = IllegalStateException.class)
    public void testCompletedStateCannotCancel() {
        ReservationState completedState = new CompletedState();
        completedState.cancel(reservation);
    }

    @Test(expected = IllegalStateException.class)
    public void testCompletedStateCannotExtend() {
        ReservationState completedState = new CompletedState();
        completedState.extend(reservation, futureTime);
    }

    @Test(expected = IllegalStateException.class)
    public void testCompletedStateCannotMarkArrived() {
        ReservationState completedState = new CompletedState();
        completedState.markArrived(reservation);
    }

    @Test(expected = IllegalStateException.class)
    public void testCompletedStateCannotMarkNoShow() {
        ReservationState completedState = new CompletedState();
        completedState.markNoShow(reservation);
    }

    // ===== NoShowState Tests =====
    @Test
    public void testNoShowStateMarkNoShowIsNoOp() {
        ReservationState noShowState = new NoShowState();
        reservation.setStatus(BookingStatus.NO_SHOW);
        noShowState.markNoShow(reservation);
        assertEquals(BookingStatus.NO_SHOW, reservation.getStatus());
    }

    @Test(expected = IllegalStateException.class)
    public void testNoShowStateCannotModify() {
        ReservationState noShowState = new NoShowState();
        noShowState.modify(reservation, startTime, futureTime);
    }

    @Test(expected = IllegalStateException.class)
    public void testNoShowStateCannotCancel() {
        ReservationState noShowState = new NoShowState();
        noShowState.cancel(reservation);
    }

    @Test(expected = IllegalStateException.class)
    public void testNoShowStateCannotExtend() {
        ReservationState noShowState = new NoShowState();
        noShowState.extend(reservation, futureTime);
    }

    @Test(expected = IllegalStateException.class)
    public void testNoShowStateCannotMarkArrived() {
        ReservationState noShowState = new NoShowState();
        noShowState.markArrived(reservation);
    }

    @Test(expected = IllegalStateException.class)
    public void testNoShowStateCannotComplete() {
        ReservationState noShowState = new NoShowState();
        noShowState.complete(reservation);
    }
}
