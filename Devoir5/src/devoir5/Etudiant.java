package devoir5;

public class Etudiant {
	private String nom_, prenom_, parcours_;
	private int num_etu_;
	
	/**
	 * creation d'un �tudiant
	 * 
	 * @param nom	nom de famille de l'�tudiant
	 * @param prenom	prenom de l'�tudiant
	 * @param parcours	fili�re actuelle de l'�tudiant
	 * @param num_etu	num�ro d'�tudiant
	 */
	public Etudiant(String nom,String prenom,String parcours,int num_etu) {
		nom_ = nom;
		prenom_ = prenom;
		parcours_ = parcours;
		num_etu_ = num_etu;
	}
	
	/** Affichage des informations de l'�tudiant */
	public void Afficher() { 
		System.out.println(nom_+" "+prenom_);
		System.out.println(parcours_);
		System.out.println(num_etu_);
	}
}