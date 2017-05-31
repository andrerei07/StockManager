package io.altar.upacademy.view;

import java.util.Collection;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import io.altar.upacademy.Product;
import io.altar.upacademy.Shelf;
import io.altar.upacademy.services.ShelfService;

@Named("shelfManager")
@RequestScoped
public class ShelfBean {

	private Shelf shelf = new Shelf();
	private boolean editable = true;
	private Shelf selectedShelf;
	private Product selectedProduct;
	private List<Shelf> list;
	
	@Inject
	private ShelfService shelfService;
	
	public Shelf getShelf() {
		return shelf;
	}
	public void setShelf(Shelf prateleira) {
		this.shelf = prateleira;
	}
	public boolean isEditable() {
		return editable;
	}
	public void setEditable(boolean editable) {
		this.editable = editable;
	}
	public Shelf getSelectedShelf() {
		return selectedShelf;
	}
	public void setSelectedShelf(Shelf selectedShelf) {
		this.selectedShelf = selectedShelf;
	}
	
	public String createShelf(){
		
		shelfService.createShelf(shelf);
		return "shelf";
	}
	
	public String updateShelf(){
		
		shelfService.updateShelf(shelf);
		return "shelf";
	}
	
	public Collection<Shelf> readShelf(){
		return shelfService.consultShelf(shelf);
	}
	public Product getSelectedProduct() {
		return selectedProduct;
	}
	public void setSelectedProduct(Product selectedProduct) {
		this.selectedProduct = selectedProduct;
	}
	public List<Shelf> getList() {
		return list;
	}
	public void setList(List<Shelf> list) {
		this.list = list;
	}
	
	public String removeShelf(){
		
		shelfService.removeShelf(list);
		return "shelf";
	}
}

