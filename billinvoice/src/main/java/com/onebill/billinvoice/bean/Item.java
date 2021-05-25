package com.onebill.billinvoice.bean;

import java.math.BigDecimal;

import lombok.Data;
@Data
public class Item {

	

	    public Item(String name, int qty, BigDecimal price) {
		super();
		this.name = name;
		this.qty = qty;
		this.price = price;
	}
		private String name;
	    private int qty;
	    private BigDecimal price;


}
