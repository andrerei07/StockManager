package io.altar.upacademy.repositories;

import io.altar.upacademy.Product;


public class ProductRepository extends EntityRepository<Product> {

	private static final ProductRepository instance = new ProductRepository();
	
	public static ProductRepository getInstance(){
		return instance;
	}
	
	private ProductRepository(){			
	}
}


