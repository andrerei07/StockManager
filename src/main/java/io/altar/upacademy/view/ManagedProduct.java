package io.altar.upacademy.view;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import io.altar.upacademy.Product;
import io.altar.upacademy.services.ProductService;

@Named("productManager")
@RequestScoped
public class ManagedProduct {

	private boolean editable = true;
	private Product product = new Product();
	
	@Inject
	private ProductService productService;

	public boolean isEditable() {
		return editable;
	}

	public void setEditable(boolean editable) {
		this.editable = editable;
	}
	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	public String createProduct() {
		if(product.getEntityId() == null) {
			throw new IllegalArgumentException("Invalid Product: Id not null!");
		}
		
		productService.createProduct(product);
		
		return "product";
	}
	
	public String updateProduct(){
		if(product.getEntityId() == null){
			throw new IllegalArgumentException("Entity must have a ID");
		}
		
		productService.updateProduct(product);
		
		return "product";
	}
	
	public String readProduct(){
		if(product.getEntityId() == null){
			throw new IllegalArgumentException("Entity must have a ID");
		}
		
		productService.consulteProduct(product);
		
		return "product";
	}
	
	public String removeProduct(){
		if(product.getEntityId() == null){
			throw new IllegalArgumentException("Entity must have a ID");
		}
		
		productService.removeProduct(product);
		
		return "product";
	}
}
