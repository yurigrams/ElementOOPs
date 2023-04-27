package entites;

import java.util.Random;
import java.util.Scanner;

public class Criaturas{
	Scanner sc = new Scanner(System.in);

	private int PODER;
	private int ATAQUE;
	private int DEFESA;
	private int VELOCIDADE;
	private int PONTOS_DE_VIDA;
	private int DANO;

	public Criaturas() {
		Random rand = new Random();
		this.PODER = rand.nextInt(21) + 10;
		this.ATAQUE = rand.nextInt(11) + 5;
		this.DEFESA = rand.nextInt(11) + 5;
		this.VELOCIDADE = rand.nextInt(10) + 1;
		this.PONTOS_DE_VIDA = rand.nextInt(201) + 200;
	} // Define os atributos de forma aleátoria quando instanciado

	public void iniciarJogo() {
		System.out.println("" 
				+ "1. iniciar um novo jogo \n" 
				+ "2. Sair do programa");
		int escolha = sc.nextInt();
		if (escolha >= 1 && escolha <= 2) {
			switch (escolha) {
			case 1:
				escolhaCriatura();
				break;
			case 2:
				System.out.println("Processando..");
				System.out.println("Jogo finalizado!");
				break;
			}
		} else {
			System.out.println("Escolha inválida. Tente novamente.");
			iniciarJogo();
		}
	}

	public void escolhaCriatura() {
		System.out.println("Informe qual criatura deseja inicar o jogo: \n" + "1. StoneDev \n" + "2. WaveNerd \n"
				+ "3. BurnCoder \n" + "4. BreezeHacker \n" + "5. (sair) ");
		int escolha = sc.nextInt();
		
		Criaturas[] criaturasNaoEscolhidas = new Criaturas[3]; 
		Criaturas CriaturaEscolhida = null;
		
		if (escolha >= 1 && escolha <= 5) {
			switch (escolha) {
			case 1:
				System.out.println("Você escolheu o StoneDev");
				CriaturaEscolhida = new StoneDev();
				criaturasNaoEscolhidas[0] = new WaveNerd();
                criaturasNaoEscolhidas[1] = new BurnCoder();
                criaturasNaoEscolhidas[2] = new BreezeHacker();
				break;

			case 2:
				System.out.println("Você escolheu o WaveNerd");
				CriaturaEscolhida = new WaveNerd();
				
				criaturasNaoEscolhidas[0] = new StoneDev();
                criaturasNaoEscolhidas[1] = new BurnCoder();
                criaturasNaoEscolhidas[2] = new BreezeHacker();
				break;

			case 3:
				System.out.println("Você escolheu o BurnCoder");
				CriaturaEscolhida = new BurnCoder();
				
				criaturasNaoEscolhidas[0] = new WaveNerd();
                criaturasNaoEscolhidas[1] = new StoneDev();
                criaturasNaoEscolhidas[2] = new BreezeHacker();
				break;

			case 4:
				System.out.println("Você escolheu o BreezeHacker");
				CriaturaEscolhida = new BreezeHacker();
				
				criaturasNaoEscolhidas[0] = new WaveNerd();
                criaturasNaoEscolhidas[1] = new StoneDev();
                criaturasNaoEscolhidas[2] = new BurnCoder();
				break;

			case 5:
				System.out.println("Processando..");
				System.out.println("Jogo finalizado!");
				break;
			}
				batalhar();
				
		} else {
			System.out.println("Escolha inválida. Tente novamente.");
			escolhaCriatura();
		}
	} // fim metodo escolhaCriaturas

	public void batalhar() {
		System.out.println("1. iniciar o torneio \n" 
				+ "2. Sair do programa");
		int escolha = sc.nextInt();
		if (escolha >= 1 && escolha <= 2) {
			switch (escolha) {
			case 1:
				
				

			case 2:
				
			}
		}
	}

	public void DANO() {
		this.DANO = (PODER * ATAQUE) / DEFESA;
	} // DANO DOS PERSONAGENS

	public int getDANO() {
		return DANO;
	}

	public int getPODER() {
		return PODER;
	}

	public int getATAQUE() {
		return ATAQUE;
	}

	public int getDEFESA() {
		return DEFESA;
	}

	public int getVELOCIDADE() {
		return VELOCIDADE;
	}

	public int getPONTOS_DE_VIDA() {
		return PONTOS_DE_VIDA;
	}
} // FIM DA CLASSE CRIATURAS