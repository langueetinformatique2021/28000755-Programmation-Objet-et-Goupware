package Exercice2;

public class Des {
	Aleat des;
	
	public Des() {
		des = new Aleat(6);
	}
	
	int lancer() {
		return des.get();
	}

}
