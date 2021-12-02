package exercice2;

public class testEtudiant {
	public static void main(String[] args) {
		Etudiant richy = new Etudiant("BUTH","Richy","M1 SDL",28000755);
		Etudiant john = new Etudiant("PRINGLES","John","L3 SUS",27558923);
		richy.Afficher();
		john.Afficher();
	}
}
