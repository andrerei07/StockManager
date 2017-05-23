package io.altar.upacademy.view;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import io.altar.upacademy.Product;

@Named("productManager")
@RequestScoped

public class ManagedProduct {

	private boolean editable = true;
	private Product produto;

	public ManagedProduct() {
		this.produto = new Product();
	}

	public Product getProduto() {
		return produto;
	}

	public void setProduto(Product produto) {
		this.produto = produto;
	}

	public boolean isEditable() {
		return editable;
	}

	public void setEditable(boolean editable) {
		this.editable = editable;
	}
}
