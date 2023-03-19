package packegeExercises;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax ;
	public double percentage;
	
	public double netSalary () {
		return grossSalary - tax;
	}	
	public double increaseSalary (double percetange) {
		return grossSalary += grossSalary * (percentage / 100.0)-tax;
	}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f", increaseSalary (percentage));
	}
}
