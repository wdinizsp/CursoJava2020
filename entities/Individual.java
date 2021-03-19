/*
 * Curso Java Completo 2020
 * Prof. Nelio Alves
 * 
 * Se��o 14: Heran�a e Polimorfismo
 * 134. Exercicio de fixa��o
 * 
 * Vinculado a classe TaxPayer
 */

package entities;

public class Individual extends TaxPayer{
	
	private Double healthExpenditures;

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}
	
	@Override
	public double tax() {
		
		if (super.getAnualIncome() <= 20000.0) {
			return super.getAnualIncome() * 0.15 - healthExpenditures * 0.5;
		}
		else {
			return super.getAnualIncome() * 0.25 - healthExpenditures * 0.5;
		}
			
		
	}

	
	
	


	
	

} // Fim da classe Individual
