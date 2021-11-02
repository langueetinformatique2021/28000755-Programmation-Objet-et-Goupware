package branchmentCondition;

public class Conditionnelle4 {
	public static void main(String[] args){
		
		int p1 = 10, p2 = 9, p3 = -1, p4 = 4, p5 = 8;
		int p6;
		int liste[] = {p1,p2,p3,p4,p5};
		int max1 = 0, max2 = 0, max3 = 0;
		
		//Médiane
		//On cherche les trois plus grand nombres. Le troisième est la médiane.
		for(int i = 0; i < 5; i++) {
			if(liste[i] > max1) {
				max1 = liste[i];
			}
		}
		for(int i = 0; i < 5; i++) {
			if(liste[i] > max2) {
				if(liste[i] != max1)
					max2 = liste[i];
			}
		}
		for(int i = 0; i < 5; i++) {
			if(liste[i] > max3) {
				if(liste[i] != max1 && liste[i] != max2) {
					max3 = liste[i];
				}
			}
		}
		p6 = max3;
		System.out.println(p6);

	}
}
