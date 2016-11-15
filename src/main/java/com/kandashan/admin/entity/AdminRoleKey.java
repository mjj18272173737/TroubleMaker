package com.kandashan.admin.entity;

public class AdminRoleKey {
    private String adminSetId;

    private String roleSetId;

    public String getAdminSetId() {
        return adminSetId;
    }

    public void setAdminSetId(String adminSetId) {
        this.adminSetId = adminSetId == null ? null : adminSetId.trim();
    }

    public String getRoleSetId() {
        return roleSetId;
    }

    public void setRoleSetId(String roleSetId) {
        this.roleSetId = roleSetId == null ? null : roleSetId.trim();
    }
}