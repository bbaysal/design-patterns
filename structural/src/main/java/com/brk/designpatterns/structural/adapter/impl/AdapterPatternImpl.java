package com.brk.designpatterns.structural.adapter.impl;

import java.util.List;

import com.brk.designpatterns.structural.adapter.contract.ProductService;
import com.brk.designpatterns.structural.adapter.contract.model.ProductModel;
import com.brk.designpatterns.structural.contract.StructralPattern;

public class AdapterPatternImpl implements StructralPattern {

	@Override
	public void apply() {
		ProductService service = new ProductServiceImpl();
		List<ProductModel> products = service.getProducts();
		products.stream().forEach(product -> System.out.println(product.toString()));

	}

	@Override
	public String getName() {
		return "Adapter Pattern";
	}

}
