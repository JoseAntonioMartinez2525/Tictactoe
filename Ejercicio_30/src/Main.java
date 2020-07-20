
public class Main {
	public static boolean playerTurn = true;
	static Tictactoe board = new Tictactoe();
	public static boolean play = true;
	public static void main(String[] args) {
		
		boolean playerWon = false;
		boolean pcWon = false;
		while (play == true) {
			if (board.isVisible()==false) {
			board.setVisible(true);
			}	
			
		}
		

	}

	boolean playerWon = false;
	boolean pcWon = false;
	static void winner() {
		boolean playerWon = false;
		boolean pcWon = false;
		
		//jugador 1
		if (board.button1.getText().equals("X")) {
			if (board.button4.getText().equals("X")) {
				if (board.button7.getText().equals("X")) {
					playerWon = true;
					System.out.println("Jugador 1 gana!!");
					
				}
			}
		}
		if (board.button1.getText().equals("X")) {
			if (board.button5.getText().equals("X")) {
				if (board.button9.getText().equals("X")) {
					playerWon = true;
					System.out.println("Jugador 1 gana!!");
					
				}
			}
		}
		if (board.button4.getText().equals("X")) {
			if (board.button5.getText().equals("X")) {
				if (board.button6.getText().equals("X")) {
					playerWon = true;
					System.out.println("Jugador 1 gana!!");
					
				}
			}
		}
		if (board.button2.getText().equals("X")) {
			if (board.button5.getText().equals("X")) {
				if (board.button8.getText().equals("X")) {
					playerWon = true;
					System.out.println("Ganaste!!");
					
				}
			}
		}
		//jugador 2
		if (board.button1.getText().equals("O")) {
			if (board.button4.getText().equals("O")) {
				if (board.button7.getText().equals("O")) {
					pcWon = true;
					System.out.println("Jugador 2 gana!!");
					
				}
			}
		}
		if (board.button1.getText().equals("O")) {
			if (board.button5.getText().equals("O")) {
				if (board.button9.getText().equals("O")) {
					pcWon = true;
					System.out.println("Jugador 2 gana!!");
					
				}
			}
		}
		if (board.button4.getText().equals("O")) {
			if (board.button5.getText().equals("O")) {
				if (board.button6.getText().equals("O")) {
					pcWon = true;
					System.out.println("Jugador 2 gana!!");
					
				}
			}
		}
		if (board.button2.getText().equals("O")) {
			if (board.button5.getText().equals("O")) {
				if (board.button8.getText().equals("O")) {
					pcWon = true;
					System.out.println("Jugador 2 gana!!");
					
				}
			}
		}
		if(playerWon == true || pcWon == true) {
			board.setVisible(false);
		}
			
	}
}
