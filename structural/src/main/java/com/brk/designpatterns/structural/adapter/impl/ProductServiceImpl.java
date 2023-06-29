package com.brk.designpatterns.structural.adapter.impl;

import java.util.ArrayList;
import java.util.List;

import com.brk.designpatterns.structural.adapter.contract.ProductService;
import com.brk.designpatterns.structural.adapter.contract.model.ProductModel;
import com.brk.designpatterns.structural.adapter.model.LegacyProduct;
import com.brk.designpatterns.structural.adapter.model.ProductAdapterModel;
import com.brk.designpatterns.structural.adapter.model.ProductAgentModel;
import com.brk.designpatterns.structural.adapter.model.ProductDBModel;

public class ProductServiceImpl implements ProductService {

	@Override
	public List<ProductModel> getProducts() {
		List<ProductModel> products = new ArrayList<>();
		ProductModel dbModel = new ProductDBModel("S001", "Dell G15 5520", "Notebook", 1111);
		ProductModel agentModel = new ProductAgentModel("S002", "Dell Vostro 14", "Notebook", 1234, "Seller A");

		products.add(dbModel);
		products.add(agentModel);

		LegacyProduct legacyProduct = new LegacyProduct("S003", "Apple iPhone 14", "Mobile", 2222);
		products.add(new ProductAdapterModel(legacyProduct));

		return products;
	}

}
