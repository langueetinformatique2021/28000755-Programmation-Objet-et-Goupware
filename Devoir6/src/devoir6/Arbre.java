package devoir6;
/** Création et gestion de félins */
public class Arbre extends Végétal {
	// ajout d'attributs propres à la sous-classe
	protected boolean domestique = false;
	/** le constructeur de Félins fait appel au constructeur de la sur-classe Animal */
	public Arbre(String type) { // les félins ont 4 pattes
		super(type, 4);
	}
	/** présentation des caractéristiques du félin */
	public void présente() {
		//appel de la méthode de la sur-classe
		super.présente();
		System.out.println("je suis vraiment un animal " + etat) ;
	}
	/** cri du félin */
	public void crie(){
		System.out.println("ROOOOAAAAAAR");
	};
}