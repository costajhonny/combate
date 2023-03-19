package classesAtributosMetodosStatic;
import java.util.Locale;
import java.util.Scanner;

import packegeExercises.Rectangle;
public class retangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Entre com a largura e altura do retângulo: ");
		rectangle.heigth = sc.nextDouble();
		rectangle.whidth = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n ", rectangle.area());
		System.out.printf("PERIMETRO = %.2f%n  ",rectangle.perimeter());
		System.out.printf("DIAGONAL = %.2f%n  ",rectangle.diagonal());
		sc.close();

	}

}
