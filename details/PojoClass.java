package com.onebill.shoppingcartbill.details;

import java.sql.Date;

public class PojoClass {

	private String Subscriber_Account_Number;
	private String Bundle_Name;
	private String Product_Name;
	private String Price_Plan_Name;
	private String Subscription_Identifier;
	private String Subscription_Quantity;
	private String Coupon_Code;

//	private String Address_Line1;
//	private String Address_Line2;
//	private String City;
//	private String Country;

	public PojoClass() {
		
	}

	public PojoClass(String subscriber_Account_Number, String bundle_Name, String product_Name, String price_Plan_Name,
			String subscription_Identifier, String subscription_Quantity, String coupon_Code
		//,String address_Line1, String address_Line2, String city, String country
			) {
		super();
		Subscriber_Account_Number = subscriber_Account_Number;
		Bundle_Name = bundle_Name;
		Product_Name = product_Name;
		Price_Plan_Name = price_Plan_Name;
		Subscription_Identifier = subscription_Identifier;
		Subscription_Quantity = subscription_Quantity;
		Coupon_Code = coupon_Code;
		
//		Address_Line1 = address_Line1;
//		Address_Line2 = address_Line2;
//		City = city;
//		Country = country;
	}

	@Override
	public String toString() {
		return "[Subscriber_Account_Number=" + Subscriber_Account_Number + ", Bundle_Name=" + Bundle_Name
				+ ", Product_Name=" + Product_Name + ", Price_Plan_Name=" + Price_Plan_Name
				+ ", Subscription_Identifier=" + Subscription_Identifier + ", Subscription_Quantity="
				+ Subscription_Quantity + ", Coupon_Code=" + Coupon_Code
				//+ ", Address_Line1=" + Address_Line1 + ", Address_Line2=" + Address_Line2 + ", City=" + City
				//+ ", Country=" + Country + 
				+"]";
	}

	public String getSubscriber_Account_Number() {
		return Subscriber_Account_Number;
	}

	public void setSubscriber_Account_Number(String subscriber_Account_Number) {
		Subscriber_Account_Number = subscriber_Account_Number;
	}

	public String getBundle_Name() {
		return Bundle_Name;
	}

	public void setBundle_Name(String bundle_Name) {
		Bundle_Name = bundle_Name;
	}

	public String getProduct_Name() {
		return Product_Name;
	}

	public void setProduct_Name(String product_Name) {
		Product_Name = product_Name;
	}

	public String getPrice_Plan_Name() {
		return Price_Plan_Name;
	}

	public void setPrice_Plan_Name(String price_Plan_Name) {
		Price_Plan_Name = price_Plan_Name;
	}

	public String getSubscription_Identifier() {
		return Subscription_Identifier;
	}

	public void setSubscription_Identifier(String subscription_Identifier) {
		Subscription_Identifier = subscription_Identifier;
	}

	public String getSubscription_Quantity() {
		return Subscription_Quantity;
	}

	public void setSubscription_Quantity(String subscription_Quantity) {
		Subscription_Quantity = subscription_Quantity;
	}

	public String getCoupon_Code() {
		return Coupon_Code;
	}

	public void setCoupon_Code(String coupon_Code) {
		Coupon_Code = coupon_Code;
	}

//	
//	public String getAddress_Line1() {
//		return Address_Line1;
//	}
//
//	public void setAddress_Line1(String address_Line1) {
//		Address_Line1 = address_Line1;
//	}
//
//	public String getAddress_Line2() {
//		return Address_Line2;
//	}
//
//	public void setAddress_Line2(String address_Line2) {
//		Address_Line2 = address_Line2;
//	}
//
//	public String getCity() {
//		return City;
//	}
//
//	public void setCity(String city) {
//		City = city;
//	}
//
//	public String getCountry() {
//		return Country;
//	}
//
//	public void setCountry(String country) {
//		Country = country;
//	}

	
}
