package io.altar.upacademy;

public class Shelf extends Entity{
	
	private String idLocal;
	private int capacity;
	private Product product;
	private double rentCost;
	
	public Shelf(){
		
	}
	
	public Shelf(String localiId, int capacity,Product product,double rentCost){
		this.idLocal=localiId;
		this.capacity=capacity;
		this.product=product;
		this.rentCost=rentCost;
		
	}
		
	public String getIdLocal() {
		return idLocal;
	}
	public void setLocaliId(String localiId) {
		this.idLocal = localiId;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public double getRentCost() {
		return rentCost;
	}
	public void setRentCost(double rentCost) {
		this.rentCost = rentCost;
	}
	
	public String devolverPrateleira(Shelf prateleira){
		
		long id = prateleira.getEntityId();
		//String local = prateleira.get
		int capacity = prateleira.getCapacity();
		Product produto = prateleira.getProduct();
		long idProdutoPrateleira = getEntityId();
		double rentCost = prateleira.getRentCost();
		
		
		String finalP="A capacidade da prateleira e : "+capacity+" \n o id do produto da prateleira e : "+idProdutoPrateleira+" \n o custo de aluguer da prateleira e : "+rentCost;
		
		return finalP;
	}
	
	@Override
	public String toString(){
		return this.getEntityId().toString();
	}
	
}