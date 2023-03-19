package classesAtributosMetodosStatic;
import java.util.Locale;
import java.util.Scanner;
import packegeExercises.Bill;

public class desafioBar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Sexo: ");
		char sexo = sc.next().charAt(0);
		System.out.print("Quantidade de cervejas: ");
		int beer = sc.nextInt();
		System.out.print("Quantidade de refrigerantes: ");
		int softDrink = sc.nextInt();
		System.out.print("Quantidade de espetinhos: ");
		int barbecue = sc.nextInt();

		System.out.println("RELATÓRIO:");

		double consumo = Bill.feeding(beer, softDrink, barbecue);
		System.out.println("Consumo =" + consumo);
		
		double couvert = Bill.cover(consumo);
        System.out.println("Couvert = " + (couvert == 0 ? "Isento de Couvert" : couvert ));

	
		double ingresso = Bill.ticket(sexo);
		System.out.println("Ingresso = " + ingresso);

		double valorTotal = Bill.total(consumo, ingresso, couvert);
		System.out.println("Valor a pagar = " + valorTotal);

		sc.close();

	}

}
