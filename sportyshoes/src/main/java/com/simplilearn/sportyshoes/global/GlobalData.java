package com.simplilearn.sportyshoes.global;

import java.util.ArrayList;
import java.util.List;

import com.simplilearn.sportyshoes.model.Product;

public class GlobalData {

	
	public static List<Product> cart;
	static {
		cart =new ArrayList<Product>();
	}
}