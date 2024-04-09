package interfacce.gdr;

public class paladino extends character implements warriorInterface, mageInterface {

	int forzaFisica = 10; //diciamo che possiamo fare di meglio
	int forzaMagica = 10; //
	
	public paladino() {
		super.setPuntiVita(50);
	}
	
	public void attaccoMagico(character c) {
		int vitaAvversario = c.getPuntiVita();
		c.setPuntiVita(vitaAvversario-forzaMagica);
	}

	public void attaccoFisico(character c) {
		int vitaAvversario = c.getPuntiVita();
		c.setPuntiVita(vitaAvversario-forzaFisica);
	}

}
