package devoir6;
/** Création et gestion de félins */
public class Chat extends Félin implements Domesticable{
	String nom;
	/**
	 * Constructeur de Chat
	 */
	public Chat(String type) { // les félins ont 4 pattes
		super("Chat "+type);
	}
	
	/**
	 * Modifie la variable domestique de la classe félin
	 */
	public void domestiquer(String nom){
		domestique = true;
		this.nom = nom();
	};
	
	public String nom(){
		return nom;
	};
	
	/** cri du chat */
	public void crie(){
		System.out.println("Miaou Miaou en enfer, sale enflure ! *appuie sur la détente* *BAM!*");
	};
}