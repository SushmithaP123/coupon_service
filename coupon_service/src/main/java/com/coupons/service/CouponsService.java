package com.coupons.service;

import java.util.List;

import com.coupons.entity.coupons;

public interface CouponsService {
	public coupons getCoupons(Integer id);
	public List<coupons> getAllCoupons();
	public void addCoupons(coupons coupons);
	public coupons fetchCouponsByCouponsId(Integer id);
	public void updateCoupon(coupons coupon , Integer Id);

}
