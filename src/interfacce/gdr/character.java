package interfacce.gdr;

public abstract class character {
	
	private String nome;
	
	private int puntiVita;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPuntiVita() {
		return puntiVita;
	}

	public void setPuntiVita(int puntiVita) {
		this.puntiVita = puntiVita;
	}
	
}
