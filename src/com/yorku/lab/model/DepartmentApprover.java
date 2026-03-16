package com.yorku.lab.model;

public class DepartmentApprover {
    private String approverId;
    private String name;

    public DepartmentApprover(String approverId, String name, String department) {
        this.approverId = approverId;
        this.name = name;
    }

    public void approve(ApprovalRequest request) {
        request.approve();
    }

    public void reject(ApprovalRequest request, String reason) {
        request.reject(reason);
    }

    //G and S
    public String getApproverId() { 
    	return approverId; 
    }
    
    public String getName() { 
    	return name;
    }
    
}
