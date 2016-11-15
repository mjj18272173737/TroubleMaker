package com.kandashan.admin.entity;

public class RoleWithBLOBs extends Role {
    private String authorityListStore;

    private String description;

    public String getAuthorityListStore() {
        return authorityListStore;
    }

    public void setAuthorityListStore(String authorityListStore) {
        this.authorityListStore = authorityListStore == null ? null : authorityListStore.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}