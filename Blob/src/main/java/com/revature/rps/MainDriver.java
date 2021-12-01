package com.revature.rps;

public class MainDriver {

	public static void main(String[] args) {
		
		System.out.println(rps("rock", "paper"));
		System.out.println(rps("paper", "rock"));
		System.out.println(rps("paper", "scissors"));
		System.out.println(rps("scissors", "scissors"));
		System.out.println(rps("scissors", "paper"));
	}

	private static String rps(String player1, String player2) {
		
		if(player1.equals("rock")&&player2.equals("scissors")) {
			return "Player 1 wins";
		}else if(player1.equals("paper")&&player2.equals("rock")) {
			return "Player 1 wins";
		}else if(player1.equals("scissors")&&player2.equals("paper")) {
			return "Player 1 wins";
		}else if(player1.equals("scissors")&&player2.equals("rock")) {
			return "Player 2 wins";
		}else if(player1.equals("rock")&&player2.equals("paper")) {
			return "Player 2 wins";
		}else if(player1.equals("paper")&&player2.equals("scissors")) {
			return "Player 2 wins";
		}else if(player1.equals(player2)) {
			return "Tie";
		}
		
		return "not real input";
	}

}
