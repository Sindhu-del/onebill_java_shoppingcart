package com.onebill.shoppingcartbill.details;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class ProductDetails {

	public static void main(String[] args) {
		//PojoClass customer:productList
		List<PojoClass> productList = getCsvDetails("C:\\Users\\SINDHU\\OneDrive\\Desktop\\onebill\\shoppingcartbill\\src\\com\\onebill\\shoppingcartbill\\bill\\Subscriptions (3) (1).csv");
		
			for( PojoClass customer:productList) {
				System.out.println(customer);
			}
		
		
	}

	
	//getting file details
	private static List<PojoClass> getCsvDetails(String file) {
		List<PojoClass> productList=new ArrayList();
		Path pathToFile=Paths.get(file);//loading 
		try(BufferedReader reader=Files.newBufferedReader(pathToFile)){
			String row=reader.readLine();  //gives first line of data
			while(row!=null) {
				String[] attributes=row.split(",");
				PojoClass customer=getOneCutomer((attributes));
				 productList.add(customer); //adds oneby one customer
				row= reader.readLine();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return productList; 
	}

	private static PojoClass getOneCutomer(String[] attributes) {
		String Subscriber_Account_Number=attributes[0];
		String Bundle_Name =attributes[1];
		String Product_Name=attributes[2];
		String Price_Plan_Name=attributes[3];
		String Subscription_Identifier=attributes[4];
		String Subscription_Quantity=attributes[5];
		String Coupon_Code=attributes[6];
//		String Address_Line1=attributes[7];
//		String Address_Line2=attributes[8];
//		String City=attributes[9];	
//		String County=attributes[10];
		
		PojoClass customerDetail=new PojoClass( Subscriber_Account_Number,  Bundle_Name,  Product_Name,  Price_Plan_Name,
			Subscription_Identifier,  Subscription_Quantity, Coupon_Code
		//	,Address_Line1, Address_Line2,  City, County
		 ); 
		return  customerDetail;
	}
	

}
