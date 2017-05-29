package io.altar.upacademy.services;

import java.util.Collection;
import java.util.List;

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
	
	public Collection<Product> consulteProduct(){
			
		return	productRepository.consultar();
		
	}
	
	public Product consulteOneProduct(long id){
		 
		return productRepository.consultar(id);	
	}
	
	public Product removeProduct(Product product){
		
		productRepository.remover(product);
		return product;
	}
	

}
