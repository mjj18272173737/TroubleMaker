package com.kandashan.admin.entity;

public class MemberMemberAttributeMapStoreKey {
    private String memberId;

    private String memberAttributeMapStoreMapkeyId;

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId == null ? null : memberId.trim();
    }

    public String getMemberAttributeMapStoreMapkeyId() {
        return memberAttributeMapStoreMapkeyId;
    }

    public void setMemberAttributeMapStoreMapkeyId(String memberAttributeMapStoreMapkeyId) {
        this.memberAttributeMapStoreMapkeyId = memberAttributeMapStoreMapkeyId == null ? null : memberAttributeMapStoreMapkeyId.trim();
    }
}