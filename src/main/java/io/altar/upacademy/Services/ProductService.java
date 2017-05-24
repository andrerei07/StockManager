package io.altar.upacademy.services;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import io.altar.upacademy.Product;
import io.altar.upacademy.repositories.ProductRepository;

@Named("productService")
@RequestScoped
public class ProductService {

	private ProductRepository productRepository = ProductRepository.getInstance();
	
	public Product createProduct(Product product){
	
		productRepository.criar(product);
		return product;
	}
	
	public Product updateProduct(Product product){
		
		productRepository.editar(product);
		return product;
		
	}
	
	public Product consulteProduct(Product product){
		
		long ID=product.getEntityId();
		productRepository.consultar(ID);
		return product;
	}
	
	public Product removeProduct(Product product){
		
		productRepository.remover(product);
		return product;
	}

}
