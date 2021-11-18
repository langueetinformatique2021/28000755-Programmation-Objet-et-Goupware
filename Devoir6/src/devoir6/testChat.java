package devoir6;

public class testChat {
	public static void main(String[] args) {
		String espèce = "Tigré";
		Chat chaton = new Chat(espèce);
		chaton.domestiquer(espèce);
		chaton.présente();
		chaton.crie();
	}
}
