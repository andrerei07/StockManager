package io.altar.upacademy;

public class Shelf extends Entity{
	
	private long idLocal;
	private int capacity;
	private Product product;
	private double rentCost;
	private String location;
	
	public Shelf(){
		
	}
	
	public Shelf(long localiId, int capacity,Product product,double rentCost){
		this.idLocal=localiId;
		this.capacity=capacity;
		this.product=product;
		this.rentCost=rentCost;
		
	}
		
	public long getIdLocal() {
		return idLocal;
	}
	public void setIdLocal(long idLocal) {
		this.idLocal = idLocal;
	}
	public void setLocaliId(long localiId) {
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	
	
}