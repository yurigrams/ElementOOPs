package entites;

import java.util.Random;

public class Criaturas {
	private int PODER;
	private int ATAQUE;
	private int DEFESA;
	private int VELOCIDADE;
	private int PONTOS_DE_VIDA;
	
	public Criaturas() {
		Random rand = new Random();
		this.PODER = rand.nextInt(21) + 10;
		this.ATAQUE = rand.nextInt(11) + 5;
		this.DEFESA = rand.nextInt(11) + 5;
		this.VELOCIDADE = rand.nextInt(10) + 1;
		this.PONTOS_DE_VIDA = rand.nextInt(201) + 200;
	}

	public int getPODER() {
		return PODER;
	}

	public void setPODER(int pODER) {
		PODER = pODER;
	}

	public int getATAQUE() {
		return ATAQUE;
	}

	public void setATAQUE(int aTAQUE) {
		ATAQUE = aTAQUE;
	}

	public int getDEFESA() {
		return DEFESA;
	}

	public void setDEFESA(int dEFESA) {
		DEFESA = dEFESA;
	}

	public int getVELOCIDADE() {
		return VELOCIDADE;
	}

	public void setVELOCIDADE(int vELOCIDADE) {
		VELOCIDADE = vELOCIDADE;
	}

	public int getPONTOS_DE_VIDA() {
		return PONTOS_DE_VIDA;
	}

	public void setPONTOS_DE_VIDA(int pONTOS_DE_VIDA) {
		PONTOS_DE_VIDA = pONTOS_DE_VIDA;
	}
}