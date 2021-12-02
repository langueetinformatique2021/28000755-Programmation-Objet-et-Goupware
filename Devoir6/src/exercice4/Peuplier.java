package exercice4;
/** Création et gestion de Peuplier */
public class Peuplier extends Arbre{
	String habitat;
	/**
	 * Constructeur de Peuplier
	 */
	public Peuplier(String type,int taille,String habite) {
		super(type,taille,false);
		habitat = habite;
	}
	
	public void présente() {
		super.présente();
		System.out.println("J'habite en "+habitat);
	}
}