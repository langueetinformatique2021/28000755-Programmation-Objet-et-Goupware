package Exercice2;

public class PileFace {
	public static void main(String[] args) { 
		Aleat random = new Aleat(2); //Chiffre entre 1 (pile) et 2 (face)
		float moyenneFace = 0;
		float moyennePile;
		
		for(int i = 0; i < 1000; i++){
			moyenneFace += random.get()-1;
		}
		moyenneFace /= 10;
		moyennePile = 100 - moyenneFace;
		System.out.println("Face: "+moyenneFace+"%");
		System.out.println("Pile: "+moyennePile+"%");
	}
}
