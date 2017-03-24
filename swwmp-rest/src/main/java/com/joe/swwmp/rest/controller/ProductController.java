package com.joe.swwmp.rest.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController extends RestBaseController{
	@RequestMapping("/product/{productCode}")
	public String productDetail(@PathVariable String productCode){
		return "find product with code:"+productCode;
	}
}
