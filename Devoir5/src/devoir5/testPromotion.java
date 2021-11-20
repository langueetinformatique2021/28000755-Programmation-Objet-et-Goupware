package devoir5;
public class testPromotion {
	
	public static void main(String[] args) {
		Etudiant richy = new Etudiant("BUTH","Richy","M1 SDL",28000755);
		Etudiant john = new Etudiant("PRINGLES","John","M1 SUS",27558923);
		Etudiant ligma = new Etudiant("BALLS","Ligma","M2 TER",20000000);
		Etudiant bille = new Etudiant("CLINTONNE","Bille","M2 POULET",11092001);
		
		Etudiant[] liste_M1 = {richy,john};
		Etudiant[] liste_M2 = {ligma,bille};
		
		Promotion m1 = new Promotion(liste_M1);
		Promotion m2 = new Promotion(liste_M2);
		
		m1.Afficher();
		m2.Afficher();
	}
}
