package com.coupons.controller;

import java.util.List;

import com.coupons.entity.coupons;
import com.coupons.service.CouponsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/coupons")
public class CouponsController {
	@Autowired
	private CouponsService couponsService;
	@GetMapping("/coupons/{couponsId}")
	public coupons getCoupons(@PathVariable("couponsId") Integer couponId) {
		return this.couponsService.getCoupons(couponId);
		
	}
     @GetMapping("/coupons")
     public List<coupons> getAllCoupons()
     {
    	 return this.couponsService.getAllCoupons();
     }
     @PostMapping("/coupons")
    public void addCoupons(@RequestBody  coupons coupon) {
    	this.couponsService.addCoupons(coupon);
    }
    
    @PutMapping("/coupons/{couponsId}")
    public void update(@RequestBody coupons coupon, @PathVariable("couponsId") Integer couponId) {
    	couponsService.updateCoupon(coupon, couponId);
    }
}
