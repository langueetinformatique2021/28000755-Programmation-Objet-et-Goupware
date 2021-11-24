package devoir6;

/** Création et gestion de végétaux */
public abstract class Végétal {
	private String espèce;
	private boolean tronc;

	/**
	 * création d'une nouvelle instance de la classe Végétal
	 * 
	 * @param type   nom de l'espèce
	 * @param oui_non	présence d'un tronc ou non
	 */
	public Végétal(String type, boolean oui_non) {
		espèce = type;
		tronc = oui_non;
	}

	/** présentation des caractéristiques du végétal */
	public void présente() {
		if(tronc==true){
			System.out.println("Je suis un végatal de l'espèce des " + espèce + " et j'ai un tronc");
		}
		else{
			System.out.println("Je suis un végatal de l'espèce des " + espèce + " et je n'ai pas de tronc");
		}
	}
	
	public abstract void couper();
}