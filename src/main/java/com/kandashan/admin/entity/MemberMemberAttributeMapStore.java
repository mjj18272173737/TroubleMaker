package com.kandashan.admin.entity;

public class MemberMemberAttributeMapStore extends MemberMemberAttributeMapStoreKey {
    private String memberAttributeMapStoreElement;

    public String getMemberAttributeMapStoreElement() {
        return memberAttributeMapStoreElement;
    }

    public void setMemberAttributeMapStoreElement(String memberAttributeMapStoreElement) {
        this.memberAttributeMapStoreElement = memberAttributeMapStoreElement == null ? null : memberAttributeMapStoreElement.trim();
    }
}