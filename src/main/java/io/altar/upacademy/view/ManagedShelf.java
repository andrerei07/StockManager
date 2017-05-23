package io.altar.upacademy.view;

import io.altar.upacademy.Shelf;

public class ManagedShelf {

	private Shelf prateleira = new Shelf();
	private boolean editable = true;
	
	public Shelf getPrateleira() {
		return prateleira;
	}
	public void setPrateleira(Shelf prateleira) {
		this.prateleira = prateleira;
	}
	public boolean isEditable() {
		return editable;
	}
	public void setEditable(boolean editable) {
		this.editable = editable;
	}
}
