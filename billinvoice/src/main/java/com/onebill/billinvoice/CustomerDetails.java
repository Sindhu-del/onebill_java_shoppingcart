package com.onebill.billinvoice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.onebill.billinvoice.bean.Bean;

public class CustomerDetails {

	
	private static List<Bean> mapCSV(String CSVFilePath) {
		List<Bean> empList = new ArrayList<Bean>();

		try {
		    File inputF = new File(CSVFilePath);
		    InputStream inputFS = new FileInputStream(inputF);
		    BufferedReader br = new BufferedReader(new InputStreamReader(inputFS));

		// Skip the header since its just coloumn name in table and in CSV file but not the data.
		    empList = br.lines().skip(1).map(csv2EmpObj).collect(Collectors.toList());
		    br.close();
		} catch (IOException e) {
		    System.err.println(e.getMessage());
		}

		return empList;
		}
	
	//
	private static Function<String, Bean> csv2EmpObj = (line) -> {
	    String[] record = line.split(",");// This can be delimiter which
	    Bean customer = new Bean();
	    if (record[0] != null && record[0].trim().length() > 0) {
	        customer.setSubscriber_Account_Number(record[0]);
	    }
	    if (record[1] != null && record[1].trim().length() > 0) {
	        customer.setBundle_Name(record[1]);
	    }
	    if (record[2] != null && record[2].trim().length() > 0) {
	        customer.setProduct_Name(record[2]);
	    }
	    if (record[3] != null && record[3].trim().length() > 0) {
	        customer.setPrice_Plan_Name(record[3]);
	    }
	    if (record[4] != null && record[3].trim().length() > 0) {
	        customer.setSubscription_Identifier(record[3]);
	    }
	     
	    return customer;
	};
	
	//
	
	public static Map<String, List<Bean>> grouprdData(List<Bean> customerList) {
	    return customerList.stream()
	    .collect(Collectors.groupingBy(
	    Bean::getSubscriber_Account_Number));
	}
	
	//
	
	public static void main(String[] args) {

	    String fileName = "C:\\Users\\SINDHU\\OneDrive\\Desktop\\onebill\\shoppingcartbill\\src\\com\\onebill\\shoppingcartbill\\bill\\Subscriptions (3) (1).csv";
	    List<Bean> listOfProduct =mapCSV(fileName); // Step 1 & Step 2.
	    Map<String, List<Bean>> groupByAcc =grouprdData (listOfProduct); // Step 3.
	    groupByAcc.entrySet().stream().forEach(System.out::println); // Step 4.

	  //

	//System.out.println("Employee with max salary : "+mostExpensiveResource(listOfProduct));
	}
	
	
	
	
}
