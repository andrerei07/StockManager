package io.altar.upacademy.view;

import java.util.Collection;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.event.SelectEvent;

import io.altar.upacademy.Product;
import io.altar.upacademy.services.ProductService;

@Named("productManager")
@RequestScoped
public class ManagedProduct {

	private boolean editable = true;
	private Product product = new Product();
	private Product selectedProduct;
	
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
		
		productService.createProduct(product);
		//System.out.println(product);
		
		return "product";
	}
	
	public String updateProduct(){
		if(product.getEntityId() == null){
			throw new IllegalArgumentException("Entity must have a ID");
		}
		
		productService.updateProduct(product);
		
		return "product";
	}

	public Collection<Product> readProduct(){
		return productService.consulteProduct() ;
		
		//return "product";
	}
	
	public String removeProduct(){
		if(product.getEntityId() == null){
			throw new IllegalArgumentException("Entity must have a ID");
		}
		
		productService.removeProduct(product);
		
		return "product";
	}

	public Product getSelectedProduct() {
		return selectedProduct;
	}

	public void setSelectedProduct(Product selectedProduct) {
		this.selectedProduct = selectedProduct;
	}
	
	
	public void loadDataUpdate(long id){
		
		product =productService.consulteOneProduct(id);
		
		
	}
	
	public long obtainSelectedProduct(SelectEvent event){
		selectedProduct = (Product) event.getObject();
		
		return selectedProduct.getEntityId();
	}

	
}
