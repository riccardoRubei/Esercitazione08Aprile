package interfacce.gdr;

public class myGame {

	public static void main(String[] args) {
		warrior myWarrior = new warrior();
		mage myMage = new mage();
		
		myWarrior.colpisci(myMage);
		System.out.println(myMage.getPuntiVita());
		
		/*
		 * interfacce
		 */
		
		paladino myPaladino = new paladino();
		myPaladino.attaccoFisico(myWarrior);
		myPaladino.attaccoMagico(myWarrior);
		System.out.println(myWarrior.getPuntiVita());

	}

}
