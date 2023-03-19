package packegeExercises;

public class currencyConverter {
	
	public static final double IOF = 0.06; 
	
	
	public static double valorPago (double dolar ,double dolarComprado) {
		return dolar*dolarComprado * (1.0 + IOF);
	}
}
