package com.coupons.service;

import java.util.ArrayList;
import java.util.List;

import com.coupons.entity.coupons;

import org.springframework.stereotype.Service;

@Service
public class CouponsServiceImpl implements CouponsService {
	
	List<coupons> coupons=new ArrayList<>();
    //List<coupons>coupons=List.of(
    		///new coupons(1234L,"FoodC",100000,"Food",2,"www.google.com"),
    	//	new coupons(12345L,"clothC",199999,"cloth",3,"www.google.com")
    		
    		//);
	@Override
	public coupons getCoupons(Integer id) {
		// TODO Auto-generated method stub
		return this.coupons.stream().filter(coupons->coupons.getCouponId()==id).findAny().orElse(null);
		
	}
	@Override
	public List<com.coupons.entity.coupons> getAllCoupons() {
		// TODO Auto-generated method stub
		return this.coupons;
	}
	@Override
	public void addCoupons(com.coupons.entity.coupons coupons) {
		// TODO Auto-generated method stub
		this.coupons.add(coupons);
	}
	@Override
	public com.coupons.entity.coupons fetchCouponsByCouponsId(Integer id) {
		// TODO Auto-generated method stub
		return this.coupons.stream().filter(coupons->coupons.getCouponId()==id).findAny().orElse(null);
	}
	
	@Override
	public void updateCoupon(coupons coupon , Integer Id) {
		coupons tempCoupon=this.getCoupons(Id);
		tempCoupon.setCouponCode(coupon.getCouponCode());
		tempCoupon.setCouponCounts(coupon.getCouponCounts());
		tempCoupon.setCouponName(coupon.getCouponName());
		tempCoupon.setCouponType(coupon.getCouponType());
		tempCoupon.setLinkUrl(coupon.getLinkUrl());
		tempCoupon.setImgUrl(coupon.getImgUrl());
	}
	
	

}
