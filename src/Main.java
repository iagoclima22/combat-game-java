import java.util.Scanner;

import entities.Champion;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Champion champion1, champion2;
		
		System.out.println("Digite os dados do primeiro campeão:");
		System.out.print("Nome: ");
		String name1 = sc.nextLine();
		System.out.print("Vida inicial: ");
		int life1 = sc.nextInt();
		System.out.print("Ataque: ");
		int attack1 = sc.nextInt();
		System.out.print("Armadura: ");
		int armor1 = sc.nextInt();
		champion1 = new Champion(name1, life1, attack1, armor1);
		
		System.out.println();
		
		System.out.println("Digite os dados do segundo campeão:");
		System.out.print("Nome: ");
		sc.nextLine();
		String name2 = sc.nextLine();
		System.out.print("Vida inicial: ");
		int life2 = sc.nextInt();
		System.out.print("Ataque: ");
		int attack2 = sc.nextInt();
		System.out.print("Armadura: ");
		int armor2 = sc.nextInt();
		champion2 = new Champion(name2, life2, attack2, armor2);
		
		System.out.println();
		
		System.out.print("Quantos turnos você deseja executar? ");
		int n = sc.nextInt();
		
		System.out.println();
		
		for (int i=1; i<=n; i++) {
			if (champion1.getLife() > 0 && champion2.getLife() > 0) {
				champion1.takeDamage(attack2);
				champion2.takeDamage(attack1);
				System.out.println("Resultado do turno " + i + ":");
				System.out.println(champion1.status());
				System.out.println(champion2.status());
				System.out.println();
			}
		}
		
		System.out.println("FIM DO COMBATE");
		
		sc.close();
	}
}
