package classesAtributosMetodosStatic;

import java.util.Locale;
import java.util.Scanner;

import packegeExercises.Champion;

public class desafioCombate {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n, i;
		System.out.println("Digite os dados do primeiro campeão: ");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Vida inicial: ");
		int life = sc.nextInt();
		System.out.print("Ataque: ");
		int attack = sc.nextInt();
		System.out.print("Armadura: ");
		int armor = sc.nextInt();

		System.out.println("Digite os dados do segundo  campeão: ");
		System.out.print("Nome: ");
		sc.nextLine();
		String name2 = sc.nextLine();
		System.out.print("Vida inicial: ");
		int life2 = sc.nextInt();
		System.out.print("Ataque: ");
		int attack2 = sc.nextInt();
		System.out.print("Armadura: ");
		int armor2 = sc.nextInt();

		Champion champion1 = new Champion(name, life, attack, armor);
		Champion champion2 = new Champion(name2, life2, attack2, armor2);

		System.out.println("Quantos turnos você deseja executar? ");
		n = sc.nextInt();

		for (i = 0; i < n; i++) {
			System.out.println("Resultado do turno " + (i + 1));

			champion1.takeDamange(champion2);
			champion2.takeDamange(champion1);
			System.out.println();

			System.out.println(champion1.status());
			System.out.println(champion2.status());
			System.out.println();

			if (champion1.getLife() == 0 || champion2.getLife() == 0) {

				break;

			}

			
		}
		sc.close();
	}

}
