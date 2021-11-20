package devoir5;
public class Promotion {
	private Etudiant[] liste_etu_;
	
	/** Création de la promotion à partir d'une liste
	 * 
	 * @param liste	liste d'éléments de type Etudiant
	 */
	public Promotion(Etudiant[] liste) {
		liste_etu_ = liste;
	}
	
	/**Affichage des étudiants de la promotion*/
	public void Afficher() { 
		System.out.println("Liste des étudiants:");
		for (Etudiant temp : liste_etu_) {
			System.out.println("----------------");
			temp.Afficher();
        }
		System.out.println("\n");
	}
	
	/**Squelette des autres méthodes*/
	
	/**Ajouter un étudiant à la promotion
	 * 
	 * @param etudiant	étudiant à ajouter à la promotion
	 */
	public void AjouterEtudiant(Etudiant etudiant) { 
	}
	
	/**Retirer un étudiant de la promotion
	 * 
	 * @param etudiant	étudiant à retirer de la promotion
	 */
	public void RetirerEtudiant(Etudiant etudiant) {
	}
	
	/**Fusionner deux promotions
	 * 
	 * @param AutrePromotion	l'autre promotion avec laquelle la promotion actuelle doit être fusionnée
	 */
	public void Fusionner(Promotion AutrePromotion) {
	}
}
