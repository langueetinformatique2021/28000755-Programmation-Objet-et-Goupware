package devoir5;
public class Promotion {
	private Etudiant[] liste_etu_;
	
	/** Cr�ation de la promotion � partir d'une liste
	 * 
	 * @param liste	liste d'�l�ments de type Etudiant
	 */
	public Promotion(Etudiant[] liste) {
		liste_etu_ = liste;
	}
	
	/**Affichage des �tudiants de la promotion*/
	public void Afficher() { 
		System.out.println("Liste des �tudiants:");
		for (Etudiant temp : liste_etu_) {
			System.out.println("----------------");
			temp.Afficher();
        }
		System.out.println("\n");
	}
	
	/**Squelette des autres m�thodes*/
	
	/**Ajouter un �tudiant � la promotion
	 * 
	 * @param etudiant	�tudiant � ajouter � la promotion
	 */
	public void AjouterEtudiant(Etudiant etudiant) { 
	}
	
	/**Retirer un �tudiant de la promotion
	 * 
	 * @param etudiant	�tudiant � retirer de la promotion
	 */
	public void RetirerEtudiant(Etudiant etudiant) {
	}
	
	/**Fusionner deux promotions
	 * 
	 * @param AutrePromotion	l'autre promotion avec laquelle la promotion actuelle doit �tre fusionn�e
	 */
	public void Fusionner(Promotion AutrePromotion) {
	}
}
