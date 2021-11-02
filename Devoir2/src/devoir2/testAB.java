package devoir2;

/**
 * 
 * Classe exécutable testAB qui fait appel à la méthode divise(int)
 * de la classe B. 
 * 
 * @author richy
 * 
 */

public class testAB {

	/**
	 * 
	 * Initialise la variable i à 1 puis affiche 20 fois de 
	 * suite le résultat de la fonction divise(i).
	 * 
	 * @param args
	 * 
	 */
	
	public static void main(String[] args) {
		
		int i = 1;
		for(int n = 0; n < 20; n++) {
			i = B.divise(i);
			System.out.println(i);
		}

	}

}
