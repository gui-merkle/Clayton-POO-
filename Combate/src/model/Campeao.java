package model;

public class Campeao {
	
	//atributos
	
	private String nome;
	private int vida;
	private int armadura;
	private int ataque;
	
	//Construtor
	
	public Campeao(String nome, int vida, int armadura, int ataque) {
		this.nome = nome;
		this.vida = vida;
		this.armadura = armadura;
		this.ataque = ataque;
	}
	
	//Getters
	
	public int getVida() {
		return vida;
	}
	
	public int getAtaque() {
		return ataque;
	}
	
	//Definir ataques
	
	public void receberDano(int danoInimigo) {
		int dano = danoInimigo - this.armadura;
		if(dano < 1) {
			dano = 1;
		}
		
		this.vida -= dano;
		
		if(this.vida < 0) {
			this.vida = 0;
		}
	}
	
	//Mostrar status do campeão
	
	public String status() {
		if(this.vida == 0) {
			return this.nome + " Faleceu!";
		}else {
			return this.nome + " Está com " + this.vida + " de vida";
		}
	}
}
