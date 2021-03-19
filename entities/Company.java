/*
 * Curso Java Completo 2020
 * Prof. Nelio Alves
 * 
 * Seção 14: Herança e Polimorfismo
 * 134. Exercicio de fixação
 * 
 * Vinculado a classe TaxPayer
 */

package entities;

public class Company extends TaxPayer{
	
	private Integer numberOfEmployees;

	public Company(String name, Double anualIncome, Integer numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	
	@Override
	public double tax() {
		if (numberOfEmployees >= 10) {
			return super.getAnualIncome() * 0.14;
		}
		else {
			return super.getAnualIncome() * 0.16;
		}
		
	}

} // Fim da classe Company
