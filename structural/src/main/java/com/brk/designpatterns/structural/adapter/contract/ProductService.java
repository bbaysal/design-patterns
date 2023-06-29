package com.brk.designpatterns.structural.adapter.contract;

import java.util.List;

import com.brk.designpatterns.structural.adapter.contract.model.ProductModel;

public interface ProductService {
	List<ProductModel> getProducts();
}
