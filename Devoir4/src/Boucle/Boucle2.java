package Boucle;

public class Boucle2 {

	public static void main(String[] args) {
		String s1 = "azerty", s2 = "ytreza";
		int i1 = 0, i2 = s2.length() - 1;
		char c1, c2;
		boolean flag = false;
		
		while(i1 < s2.length()){
			c1 = s1.charAt(i1);
			c2 = s2.charAt(i2);
			
			if(c1==c2){
				flag = true;}
			else{
				flag = false;
				break;}
			i1 += 1;
			i2 -= 1;
		};
		System.out.println(flag);
	}

}