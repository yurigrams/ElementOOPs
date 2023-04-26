package application;

import java.util.Scanner;

import entites.BreezeHacker;
import entites.BurnCoder;
import entites.Criaturas;
import entites.StoneDev;
import entites.WaveNerd;

public class Menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Criaturas[] C = new Criaturas[1];

		System.out.println("iniciar um novo jogo: Digite (1)\n" + "Sair do programa: Digite (2)");
		int y = sc.nextInt();
		if (y == 1) {
			System.out.println("Informe qual criatura deseja inicar o jogo: \n" + "StoneDev(terra)\n"
					+ "WaveNerd(água)\n" + "BurnCoder(fogo)\n" + "BreezeHacker(ar)\n" + "Para sair digite(sair)");

			String x = sc.next();
			switch (x) {
			case "terra":
				System.out.println("Você escolheu o StoneDev");
				C[0] = new StoneDev();

				break;

			case "agua":
				System.out.println("Você escolheu o WaveNerd");
				C[0] = new WaveNerd();
				break;

			case "fogo":
				System.out.println("Você escolheu o BurnCoder");
				C[0] = new BurnCoder();
				break;

			case "ar":
				System.out.println("Você escolheu o BreezeHacker");
				C[0] = new BreezeHacker();
				break;

			case "sair":
				System.out.println("Processando..");
				System.out.println("Jogo finalizado!");
				break;
			}
		} else if (y == 2) {
			System.out.println("Processando..");
			System.out.println("Jogo finalizado!");
		}
		
		sc.close();
	}

}
