package devoir7;

public class testCercle {
	public static void main(String args[]){
		Cercle r = new Cercle((float)2);
		Cercle e = new Cercle((float)5);
		System.out.println(r.perimetre());
		System.out.println(e.perimetre());
		System.out.println(r.compareTo(e));
	}
}
