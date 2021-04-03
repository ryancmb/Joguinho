package joguinho;


public class Main{

		
	
	
	
	public static void main(String[] args) {
		Personagens personagens = new Personagens();
		
		personagens.hpPlayer1 = 50;
		personagens.poderPlayer1 = 40;
		
		
		
		personagens.hpPlayer2 = 50;
		personagens.poderPlayer2 = 40;
		
		 System.out.println("Inicia a batalha.");
		 System.out.println("Player 1 ataca Player 2.");
		 personagens.Atacante = "Player1";
		 personagens.dado = Math.round(Math.random() * 100);
		 
		 if (personagens.dado <=15 ) {
			 System.out.println("Errou! - 0 HP");
			 personagens.ataque = 0;
			 }
		 else if (personagens.dado <=70) {
			 System.out.println("Normal! - 16 HP");
			 personagens.ataque = 16;
		 }
		 else if (personagens.dado <= 96) {
			 System.out.println("Sorte !!! - 19 HP");
			 personagens.ataque = 19;
		 }
		 else if (personagens.dado <=100) { 
			 
			 System.out.println("Critíco! - 32 HP");
			 personagens.ataque = 32;
		 }
		 
		  
		 System.out.println("Player2 está com " + (personagens.hpPlayer2 = (int)(personagens.hpPlayer2 - personagens.ataque)));
		 
		 personagens.ataque = Math.round(Math.random() * 100);
		 
		 System.out.println("Player2 ataca Player1");
		 
		 if (personagens.ataque <=15 ) {
			 System.out.println("Errou! - 0 HP");
			 personagens.ataque = 0;
			 }
		 else if (personagens.ataque <=70) {
			 System.out.println("Normal! - 16 HP");
			 personagens.ataque = 16;
		 }
		 else if (personagens.ataque <= 96) {
			 System.out.println("Sorte !!! - 19 HP");
			 personagens.ataque = 19;
		 }
		 else if (personagens.ataque <=100) { 
			 
			 System.out.println("Critíco! - 32 HP");
			 personagens.ataque = 32;
			 	 }
		 
		 System.out.println("Player1 está com " + (personagens.hpPlayer1 = (int)(personagens.hpPlayer1 - personagens.ataque)));
		 if (personagens.hpPlayer1 > personagens.hpPlayer2) {
			 System.out.println("Player 1 vencedor");
		 }
		 else if (personagens.hpPlayer1 < personagens.hpPlayer2) {
			 System.out.println("Player 2 vencedor");
		 }
		 else if (personagens.hpPlayer1 == personagens.hpPlayer2) {
			 
			 System.out.println("Empate"); 
			 }
		 
	}
	    
}
