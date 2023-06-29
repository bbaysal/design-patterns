package com.brk.designpatterns.structural.adapter.impl;

import java.util.List;

import com.brk.designpatterns.structural.adapter.contract.AdapterPattern;
import com.brk.designpatterns.structural.adapter.contract.ProductService;
import com.brk.designpatterns.structural.adapter.contract.model.ProductModel;

public class AdapterPatternImpl implements AdapterPattern {

	@Override
	public void apply() {
		ProductService service = new ProductServiceImpl();
		List<ProductModel> products = service.getProducts();
		System.out.println("---------------Adapter Pattern Begins---------------");
		products.stream().forEach(product -> System.out.println(product.toString()));
		System.out.println("---------------Adapter Pattern Ends---------------");

	}

}
