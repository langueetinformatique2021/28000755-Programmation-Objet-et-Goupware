package exercice4;
/** Création et gestion de Arbre */
public class Arbre extends Végétal {
	// ajout d'attributs propres à la sous-classe
	protected boolean fruit_comestible = false;
	protected int taille = 0;
	/** le constructeur de Arbre fait appel au constructeur de la sur-classe Végétal */
	public Arbre(String type, int mesure, boolean oui_non) {
		super(type, true);
		taille = mesure;
		fruit_comestible = oui_non;
	}
	/** présentation des caractéristiques de l'arbre */
	public void présente() {
		super.présente();
		if (fruit_comestible == true){
			System.out.println("Je suis un arbre et mon fruit est comestible. Ma taille est de "+taille+" mètres") ;
		}
		else{
			System.out.println("Je suis un arbre et mon fruit n'est pas comestible. Ma taille est de "+taille+" mètres");
		}
	}
	
	public void couper(){
		System.out.println("NOOOOON NE ME COUPEZ PAS AAAAAAAAAAHHHH!!!!!");
		taille = 0;
	};
}