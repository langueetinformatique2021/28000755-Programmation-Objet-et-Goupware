package Exercice2;

public class TroisDés {
	public static void main(String[] args) {
		Des dice1 = new Des();
		Des dice2 = new Des();
		Des dice3 = new Des();
		lancerDes(dice1,dice2,dice3);
		
	}
	
	public static void lancerDes(Des d1, Des d2, Des d3){
		int val1 = d1.lancer();
		int val2 = d2.lancer();
		int val3 = d3.lancer();
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);
		if(val1 == 4 && val2 == 2 && val3 == 1){
			System.out.println("C'est gagné ! Vous les avez même dans l'ordre !");
		}
		else if((val1 == 4 && val2 == 1 && val3 == 2)|
				(val1 == 2 && val2 == 4 && val3 == 1)|
				(val1 == 1 && val2 == 4 && val3 == 2)|
				(val1 == 2 && val2 == 1 && val3 == 4)|
				(val1 == 1 && val2 == 2 && val3 == 4)
				){
			System.out.println("C'est gagné !");
		}
		else{
			System.out.println("Perdu !");
		}
	}
}
