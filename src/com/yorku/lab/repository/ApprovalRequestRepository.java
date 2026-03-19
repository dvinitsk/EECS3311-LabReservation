package com.yorku.lab.repository;

import com.yorku.lab.enums.ApprovalStatus;
import com.yorku.lab.model.ApprovalRequest;
import com.yorku.lab.model.User;

import java.util.List;
import java.util.Optional;

public class ApprovalRequestRepository extends CsvRepository<ApprovalRequest> {

    private final UserRepository userRepository = new UserRepository();

    @Override
    protected String getFileName() { return "approval_requests.csv"; }

    @Override
    protected String toCsvLine(ApprovalRequest ar) {
        return escape(ar.getRequestId()) + "|" +
            escape(ar.getUser().getUserId()) + "|" +
            escape(ar.getStatus().name()) + "|" +
            escape(ar.getRejectReason());
    }

    @Override
    protected ApprovalRequest fromCsvLine(String line) {
        String[] parts = splitCsv(line);
        if (parts.length < 3) return null;

        User user = userRepository.findById(parts[1]).orElse(null);
        if (user == null) return null;

        ApprovalRequest ar = new ApprovalRequest(parts[0], user);
        ar.setStatus(ApprovalStatus.valueOf(parts[2]));
        if (parts.length > 3 && parts[3] != null && !parts[3].isEmpty()) {
            ar.setRejectReason(parts[3]);
        }
        return ar;
    }

    public Optional<ApprovalRequest> findById(String requestId) {
        return findAll().stream()
            .filter(ar -> requestId.equals(ar.getRequestId()))
            .findFirst();
    }

    public List<ApprovalRequest> findPending() {
        return findAll().stream()
            .filter(ar -> ar.getStatus() == ApprovalStatus.PENDING)
            .toList();
    }

    public void save(ApprovalRequest request) {
        List<ApprovalRequest> all = findAll();
        all.removeIf(ar -> ar.getRequestId().equals(request.getRequestId()));
        all.add(request);
        saveAll(all);
    }
}
