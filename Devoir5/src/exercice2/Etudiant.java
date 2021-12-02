package exercice2;

public class Etudiant {
	private String nom_, prenom_, parcours_;
	private int num_etu_;
	
	/**
	 * creation d'un étudiant
	 * 
	 * @param nom	nom de famille de l'étudiant
	 * @param prenom	prenom de l'étudiant
	 * @param parcours	filière actuelle de l'étudiant
	 * @param num_etu	numéro d'étudiant
	 */
	public Etudiant(String nom,String prenom,String parcours,int num_etu) {
		nom_ = nom;
		prenom_ = prenom;
		parcours_ = parcours;
		num_etu_ = num_etu;
	}
	
	/** Affichage des informations de l'étudiant */
	public void Afficher() { 
		System.out.println(nom_+" "+prenom_);
		System.out.println(parcours_);
		System.out.println(num_etu_);
	}
}
