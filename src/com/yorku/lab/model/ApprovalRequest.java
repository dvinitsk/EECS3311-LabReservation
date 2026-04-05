package com.yorku.lab.model;

import com.yorku.lab.enums.AccountStatus;
import com.yorku.lab.enums.ApprovalStatus;

public class ApprovalRequest {
    private String requestId;
    private User user;
    private ApprovalStatus status;
    private String rejectReason;

    public ApprovalRequest(String requestId, User user) {
        this.requestId = requestId;
        this.user = user;
        this.status = ApprovalStatus.PENDING;
    }

    public void approve() {
        this.status = ApprovalStatus.APPROVED;
        this.user.setStatus(AccountStatus.ACTIVE);
        this.rejectReason=null;
    }

    public void reject(String reason) {
        this.status = ApprovalStatus.REJECTED;
        this.rejectReason = reason;
        this.user.setStatus(AccountStatus.REJECTED);
    }

    public String getRequestId() { return requestId; }
    public User getUser() { return user; }
    public ApprovalStatus getStatus() { return status; }
    public void setStatus(ApprovalStatus status) { this.status = status; }
    public void setRejectReason(String reason) { this.rejectReason = reason; }
    public String getRejectReason() { return rejectReason; }
}
