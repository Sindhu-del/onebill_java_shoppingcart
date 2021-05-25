package com.onebill.billinvoice.bean;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import lombok.Data;

@Data
public class Bean {
	

		private String Subscriber_Account_Number;
		private String Bundle_Name;
		private String Product_Name;
		private String Price_Plan_Name;
		private String Subscription_Identifier;
//		private String Subscription_Quantity;
//		private String Coupon_Code;
//		private String Address_Line1;
//		private String Address_Line2;
//		private String City;
//		private String Country;
//		
		public Bean() {
			
		}
		
		//cunstructor
		public Bean(String subscriber_Account_Number, String bundle_Name, String product_Name, String price_Plan_Name,
				String subscription_Identifier
//				, String subscription_Quantity, String coupon_Code, String address_Line1,
//				String address_Line2, String city, String country
				) {
			super();
			Subscriber_Account_Number = subscriber_Account_Number;
			Bundle_Name = bundle_Name;
			Product_Name = product_Name;
			Price_Plan_Name = price_Plan_Name;
			Subscription_Identifier = subscription_Identifier;
//			Subscription_Quantity = subscription_Quantity;
//			Coupon_Code = coupon_Code;
//			Address_Line1 = address_Line1;
//			Address_Line2 = address_Line2;
//			City = city;
//			Country = country;
		}


	}




