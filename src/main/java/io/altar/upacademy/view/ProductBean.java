package io.altar.upacademy.view;

import java.util.Collection;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.context.RequestContext;
import org.primefaces.event.CellEditEvent;
import org.primefaces.event.SelectEvent;



import io.altar.upacademy.Product;
import io.altar.upacademy.services.ProductService;

@Named("productManager")
@RequestScoped
public class ProductBean {

	private boolean editable = true;
	private Product product = new Product();
	private Product selectedProduct;
	private List<Product> list;
	
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
		return productService.consultProduct() ;
		
		//return "product";
	}
	
	public String removeProduct(){
		
		productService.removeProduct(list);
		
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
	
//	public void onCellEdit(CellEditEvent event){
//		
////		Product oldValue = (Product) event.getOldValue();
////		Product newValue = (Product) event.getNewValue();
//		
////		if(newValue != null && !newValue.equals(oldValue)) {
////            product=newValue;
////            productService.updateProduct(product);
////        }
////        readProduct();
//	}

	public List<Product> getList() {
		return list;
	}

	public void setList(List<Product> list) {
		this.list = list;
	}
}
