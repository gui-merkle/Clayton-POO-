package service;
import model.Campeao;

public class Combate {

	private Campeao campeao1;
	private Campeao campeao2;
	private int turnos;
	
	public Combate(Campeao campeao1, Campeao campeao2, int turnos) {
		this.campeao1 = campeao1;
		this.campeao2 = campeao2;
		this.turnos = turnos;
	}
	public void iniciarCombate(){
		
		for(int i = 1; i <= turnos; i++) {
			
			System.out.println("Turno "+i);
			
			campeao2.receberDano(campeao1.getAtaque());
			System.out.println(campeao2.status());
			
			if (campeao2.getVida() == 0) {
                System.out.println("FIM DO COMBATE");
                break;
            }
			
			campeao1.receberDano(campeao2.getAtaque());
			System.out.println(campeao1.status());
			
			if (campeao1.getVida() == 0) {
                System.out.println("FIM DO COMBATE");
                break;
            }
		}
		System.out.println("Fim do Combate!");
	}
}
