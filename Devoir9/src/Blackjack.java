import java.util.Scanner;
public class Blackjack {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input;
		int tirage;
		boolean termine;
		int nb_cartes_j, nb_cartes_c; //Nombre de cartes du joueur et du croupier
		int total_j, total_c; //Valeur totale des cartes du joueur et du croupier
		//Deck de 52 cartes
		Carte[] deck = {new Carte(1,"Ace",false), new Carte(1,"Ace",false), new Carte(1,"Ace",false), new Carte(1,"Ace",false),
						new Carte(2,"2",false), new Carte(2,"2",false), new Carte(2,"2",false), new Carte(2,"2",false),
						new Carte(3,"3",false), new Carte(3,"3",false), new Carte(3,"3",false), new Carte(3,"3",false),
						new Carte(4,"4",false), new Carte(4,"4",false), new Carte(4,"4",false), new Carte(4,"4",false),
						new Carte(5,"5",false), new Carte(5,"5",false), new Carte(5,"5",false), new Carte(5,"5",false),
						new Carte(6,"6",false), new Carte(6,"6",false), new Carte(6,"6",false), new Carte(6,"6",false),
						new Carte(7,"7",false), new Carte(7,"7",false), new Carte(7,"7",false), new Carte(7,"7",false),
						new Carte(8,"8",false), new Carte(8,"8",false), new Carte(8,"8",false), new Carte(8,"8",false),
						new Carte(9,"9",false), new Carte(9,"9",false), new Carte(9,"9",false), new Carte(9,"9",false),
						new Carte(10,"10",false), new Carte(10,"10",false), new Carte(10,"10",false), new Carte(10,"10",false),
						new Carte(10,"Jack",false), new Carte(10,"Jack",false), new Carte(10,"Jack",false), new Carte(10,"Jack",false),
						new Carte(10,"Queen",false), new Carte(10,"Queen",false), new Carte(10,"Queen",false), new Carte(10,"Queen",false),
						new Carte(10,"King",false), new Carte(10,"King",false), new Carte(10,"King",false), new Carte(10,"King",false),
						};
		Carte cartes_joueur[] = new Carte[52];
		Carte cartes_croupier[] = new Carte[52];
		
		System.out.println("Bienvenue ! Entrez un chiffre:\n"+"1) Lancer une partie\n"+"2) Quitter");
		while(true) {
			input = scan.nextInt();
			if(input == 1){
				termine = false;
				System.out.println("Jouons !");
				while(termine != true) {
					
					//tirage des premières cartes
					tirage = (int)(Math.random()*52);
					while(deck[tirage].tiree == true) {
						tirage = (int)(Math.random()*52);
					}
					deck[tirage].tiree = true;
					cartes_joueur[0] = deck[tirage];
					total_j = cartes_joueur[0].valeur;
					nb_cartes_j = 1;
					tirage = (int)(Math.random()*52);
					while(deck[tirage].tiree == true) {
						tirage = (int)(Math.random()*52);
					}
					deck[tirage].tiree = true;
					cartes_joueur[1] = deck[tirage];
					total_j += cartes_joueur[1].valeur;
					nb_cartes_j += 1;
					
					tirage = (int)(Math.random()*52);
					while(deck[tirage].tiree == true) {
						tirage = (int)(Math.random()*52);
					}
					deck[tirage].tiree = true;
					cartes_croupier[0] = deck[tirage];
					total_c = cartes_croupier[0].valeur;
					nb_cartes_c = 1;
					tirage = (int)(Math.random()*52);
					while(deck[tirage].tiree == true) {
						tirage = (int)(Math.random()*52);
					}
					deck[tirage].tiree = true;
					cartes_croupier[1] = deck[tirage];
					total_c += cartes_croupier[1].valeur;
					nb_cartes_c += 1;
					
					System.out.println("\nVos cartes:");
					for(int i = 0; i < nb_cartes_j; i++){
						System.out.println(cartes_joueur[i].type);
					}
					System.out.println("\nCartes du croupier:");
					System.out.println(cartes_croupier[0].type+"\n???");
					
					while(true) {
						System.out.println("\nQue souhaitez-vous faire ?\n"+"1) Tirer une carte\n"+"2) Continuer");
						input = scan.nextInt();
						if(input == 1) {
							tirage = (int)(Math.random()*52);
							while(deck[tirage].tiree == true) {
								tirage = (int)(Math.random()*52);
							}
							deck[tirage].tiree = true;
							System.out.println("\nVous piochez "+deck[tirage].type);
							cartes_joueur[nb_cartes_j] = deck[tirage];
							total_j += cartes_joueur[nb_cartes_j].valeur;
							nb_cartes_j += 1;
							
							if(total_j > 21) {
								System.out.println("\nPerdu ! Vous ètes passé au-dessus de 21 !");
								termine = true;
								break;
							}
							
							System.out.println("Vos cartes:");
							for(int i = 0; i < nb_cartes_j; i++){
								System.out.println(cartes_joueur[i].type);
							}
							System.out.println("\nCartes du croupier:");
							System.out.println(cartes_croupier[0].type+"\n???");
						}
						else if(input == 2) {
							System.out.println("\nLe croupier révèle ses cartes:");
							System.out.println(cartes_croupier[0].type);
							System.out.println(cartes_croupier[1].type);
							
							if(total_j > total_c) {
								System.out.println("Vous avez gagné !");
								termine = true;
								break;
							}
							else if(total_c > total_j) {
								System.out.println("Vous avez perdu !");
								termine = true;
								break;
							}
							else {
								System.out.println("Égalité !");
								termine = true;
								break;
							}
						}
						else {
							System.out.println("Erreur ! Entrez un chiffre valable:\n"+"1) Tirer une carte\n"+"2) Continuer");
						}
					}
				}
				System.out.println("\nQue voulez-vous faire ?\n"+"1) Lancer une partie\n"+"2) Quitter");
			}
			else if(input == 2){
				System.out.println("Au revoir !");
				break;
			}
			else {
				System.out.println("Erreur ! Entrez un chiffre valable:\n"+"1) Lancer une partie\n"+"2) Quitter");
			}
		}
	}
}
