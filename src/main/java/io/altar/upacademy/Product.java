package io.altar.upacademy;


public class Product extends Entity {
	
	private String name;
	//private Shelf listaPrateleiras[];
	private double discount;
	private int iva;
	private double pvp;

	public Product(){
		
	}

	public Product(String name, double desconto,int iva,double pvp){
		//this.listaPrateleiras = listaPrateleiras;
		this.discount = desconto;
		this.iva = iva;
		this.pvp = pvp;
		this.name=name;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
	/*public Shelf[] getListaPrateleiras() {
		return listaPrateleiras;
	}
	public void setListaPrateleiras(Shelf[] listaPrateleiras) {
		this.listaPrateleiras = listaPrateleiras;
	}
	*/
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public int getIva() {
		return iva;
	}
	public void setIva(int IVA) {
		this.iva = IVA;
	}
	public double getPvp() {
		return pvp;
	}
	public void setPvp(double PVP) {
		this.pvp = PVP;
	}
	
	public String devolverProduto(Product produto){
		
		String name = produto.getName();
		long id = produto.getEntityId();
		// get shelf
		double desconto = produto.getDiscount();
		int iva = produto.getIva();
		double pvp = produto.getPvp();
		
		
		String finalP="O name do Produto e : "+name+"\n O desconto do produto e : "+desconto+" \n O iva do produto e : "+iva+" \n O pvp do produto e : "+pvp;
		
		return finalP;
	}
	
	@Override
	public String toString(){
		return this.getEntityId().toString();
	}
	
}

	
	