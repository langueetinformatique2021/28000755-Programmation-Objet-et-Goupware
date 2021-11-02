package devoir2;

public class B {
	
	/**
	 * 
	 * Prend en entrée l'entier n, le stocke dans la variable res, puis fait appel à la méthode treize(n)
	 * de la claasse A pour vérifier s'il est divisible par 13.
	 * Si oui, renvoit le res/2, sinon renvoit res+2.
	 * @param n
	 * @return res
	 * 
	 */
	
	public static int divise(int n) {
		
		int res = n;
		
		if(A.treize(n)==true) {
			return res/2;
		}
		else {
			return res+2;
		}
	
	}
}
