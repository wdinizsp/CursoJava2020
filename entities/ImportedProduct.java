/*
 * Curso Java Completo 2020
 * Prof. Nelio Alves
 * 
 * Se��o 14: Heran�a e Polimorfismo
 * 131. Exerc�cio de Fixa��o
 * 
 * Esta classe est� vinculada a classe Product_03.java
 */

package entities;

public class ImportedProduct extends Product_03{
	
	private Double customsFee;
	
	
	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	@Override
	public String priceTag() {
		double total = super.price + customsFee;
		return super.getName() + " $" + String.format("%.2f", total) + " Customs fee: $" + String.format("%.2f", customsFee);
	}
	
	
	

	
	
	
	
	

} // Fim da classe ImportedProduct
