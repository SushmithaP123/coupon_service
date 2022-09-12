package com.coupons.entity;

public class coupons {
	private Integer couponId;
	private String couponName;
	private int couponCode;
	private String couponType;
	private int couponCounts;
	private String linkUrl;
	private String imgUrl;
	
	
	public coupons(Integer couponId, String couponName, int couponCode, String couponType, int couponCounts,
			String linkUrl, String imgUrl) {
		super();
		this.couponId = couponId;
		this.couponName = couponName;
		this.couponCode = couponCode;
		this.couponType = couponType;
		this.couponCounts = couponCounts;
		this.linkUrl = linkUrl;
		this.imgUrl = imgUrl;
	}
	
	public Integer getCouponId() {
		return couponId;
	}

	public String getCouponName() {
		return couponName;
	}

	public int getCouponCode() {
		return couponCode;
	}

	public String getCouponType() {
		return couponType;
	}

	public int getCouponCounts() {
		return couponCounts;
	}

	public String getLinkUrl() {
		return linkUrl;
	}

	public String getImgUrl() {
		return imgUrl;
	}


	public void setCouponId(Integer couponId) {
		this.couponId = couponId;
	}

	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}

	public void setCouponCode(int couponCode) {
		this.couponCode = couponCode;
	}

	public void setCouponType(String couponType) {
		this.couponType = couponType;
	}

	public void setCouponCounts(int couponCounts) {
		this.couponCounts = couponCounts;
	}

	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	

	public coupons() {
		super();
	}

}
