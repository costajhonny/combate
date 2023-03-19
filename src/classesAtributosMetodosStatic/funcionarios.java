package classesAtributosMetodosStatic;

import java.util.Locale;
import java.util.Scanner;
import packegeExercises.Employee;

public class funcionarios {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();
		
		System.out.println("Nome: ");
		employee.name =sc.nextLine();
		System.out.println("Salário bruto: ");
		employee.grossSalary =sc.nextDouble();
		System.out.println("Imposto: ");
		employee.tax =sc.nextDouble();
		
		System.out.println("Funcionário: " + employee.name + ", " + employee.netSalary());

		System.out.println("Qual a porcentagem para aumentar o salário? ");
		employee.percentage=sc.nextDouble();
		
		System.out.println("Dados atualizados: " + employee );
		
		sc.close();

	}

}
