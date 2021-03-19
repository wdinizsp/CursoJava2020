/*
 * Curso Java Completo 2020
 * Prof. Nelio Alves
 * 
 * Seção 14: Herança e Polimorfismo
 * 134. Exercicio de fixação
 * 
 * Vinculado a classe Program_27
 */

package entities;

public abstract class TaxPayer {
	
	private String name;
	private Double anualIncome;
	
	public TaxPayer() {
		
	}

	public TaxPayer(String name, Double anualIncome) {
		this.name = name;
		this.anualIncome = anualIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(Double anualIncome) {
		this.anualIncome = anualIncome;
	}
	
	public abstract double tax();

} // Fim da classe TaxPayer
