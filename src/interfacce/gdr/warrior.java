package interfacce.gdr;

public class warrior extends character{

	int forzaFisica = 10;
	
	public void colpisci(character c) {
		int vitaAvversario = c.getPuntiVita();
		c.setPuntiVita(vitaAvversario-forzaFisica);
	}
	
	public warrior() {
		super.setPuntiVita(50);
	}
}
