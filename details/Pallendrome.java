package com.onebill.shoppingcartbill.details;

public class Pallendrome {

	public boolean isPallendrome(String str) {

		int i = 0;
		int j = str.length() - 1;
		while (i <= j) {
			if (str.charAt(i) == str.charAt(j)) {
				
				System.out.println("pallendrome");
				return true;
			}
			System.out.println("not a pallendrome");
			return false;
		}

		
		return false;

	}

	public static void main(String[] args) {
		Pallendrome pallendrome = new Pallendrome();
		pallendrome.isPallendrome("sindhu");
	}

}
