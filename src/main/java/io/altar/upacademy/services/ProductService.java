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
	
	public Collection<Product> consultProduct(){
			
		return	productRepository.consultar();
		
	}
	
	public Product consulteOneProduct(long id){
		 
		return productRepository.consultar(id);	
	}
	
	public String removeProduct(List<Product> list){
		
		int numProdutosSelecionados = list.size();
		for(int i=0 ;i<numProdutosSelecionados;i++){
			Product product =list.get(i);
			productRepository.remover(product);
	
		}
		return "product";
	}
	
	

}
