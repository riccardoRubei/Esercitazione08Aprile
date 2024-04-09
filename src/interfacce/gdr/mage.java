package interfacce.gdr;

public class mage extends character {
	
	int forzaMagica = 10;
	
	public void colpisci(character c) {
		int vitaAvversario = c.getPuntiVita();
		c.setPuntiVita(vitaAvversario-forzaMagica);
	}

	public mage() {
		super.setPuntiVita(50);
	}
	
}
