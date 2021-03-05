package entities;

public class Employee_00 {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	} // Fim do método netSalary
	
	public void increaseSalary(double percentage) {
		grossSalary += grossSalary * (percentage/100);
	} // Fim do método increaseSalary
	
	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary());
	} // Fim do método toString

} // Fim da classe Employee_00
