package classesAtributosMetodosStatic;

import java.util.Locale;
import java.util.Scanner;

import packegeExercises.Student;

public class student {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		Student student = new Student();
		System.out.println("Nome :");
		student.name=sc.nextLine();
		System.out.println("Digite as tres notas : ");
		student.notaUm =sc.nextDouble();
		student.notaDois=sc.nextDouble();
		student.notaTres=sc.nextDouble();
		
		System.out.printf("NOTA FINAL = %.2f%n " , student.notaFinal());
		
		if (student.notaFinal()<60.0) {
			System.out.println("Reprovado");
			System.out.printf(" faltam : %.2f%n", student.faltam());
		}else {
			System.out.println("aprovado");
			
		}
		
		
		
		sc.close();
	}

}
