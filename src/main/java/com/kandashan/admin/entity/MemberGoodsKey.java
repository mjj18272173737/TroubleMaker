package com.kandashan.admin.entity;

public class MemberGoodsKey {
    private String favoriteMemberSetId;

    private String favoriteGoodsSetId;

    public String getFavoriteMemberSetId() {
        return favoriteMemberSetId;
    }

    public void setFavoriteMemberSetId(String favoriteMemberSetId) {
        this.favoriteMemberSetId = favoriteMemberSetId == null ? null : favoriteMemberSetId.trim();
    }

    public String getFavoriteGoodsSetId() {
        return favoriteGoodsSetId;
    }

    public void setFavoriteGoodsSetId(String favoriteGoodsSetId) {
        this.favoriteGoodsSetId = favoriteGoodsSetId == null ? null : favoriteGoodsSetId.trim();
    }
}