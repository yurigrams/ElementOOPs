package application;

import java.util.Scanner;

import entites.Criaturas;
import entites.StoneDev;

public class Menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe qual criatura deseja inicar o jogo: "
				+ "StoneDev(terra)"
				+ "WaveNerd(água)"
				+ "BurnCoder(fogo)"
				+ "BreezeHacker(ar)");
		
		int x = sc.nextInt();
		
		switch(x) {
		case 1:
			Criaturas cria = new StoneDev();
			System.out.println("PODER: " + cria.getPODER());
			System.out.println("ATAQUE: " + cria.getATAQUE());
			System.out.println("DEFESA: " + cria.getDEFESA());
			System.out.println("VELOCIDADE: " + cria.getDEFESA());
			System.out.println("PONTOS DE VIDA: " + cria.getPONTOS_DE_VIDA());
		case 2:
			Criaturas cria = new StoneDev();
			System.out.println("PODER: " + cria.getPODER());
			System.out.println("ATAQUE: " + cria.getATAQUE());
			System.out.println("DEFESA: " + cria.getDEFESA());
			System.out.println("VELOCIDADE: " + cria.getDEFESA());
			System.out.println("PONTOS DE VIDA: " + cria.getPONTOS_DE_VIDA());
		}
		
		Criaturas cria = new Criaturas();
		
		
		
		sc.close();
	}

}
