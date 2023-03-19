package classesAtributosMetodosStatic;

import java.util.Locale;
import java.util.Scanner;

import packegeExercises.currencyConverter;

public class cambio {

	public static void main(String[] args) {
	 Locale.setDefault(Locale.US);
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Qual o valor do dólar? ");
	 double dolar = sc.nextDouble();
	 System.out.println("Quantos dólares serão comprados? ");
	 double dolarComprado = sc.nextDouble();
	 
	 double valor = currencyConverter.valorPago(dolar, dolarComprado);
	 System.out.printf("Valor a ser pago em reais = %.2f%n", valor);
	 
	 sc.close();

	}

}
