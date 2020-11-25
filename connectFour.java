import java.util.Scanner;
//Implement
//1. Error handling: ask user to enter coordinate again if not valid, if user enters coordinate already filled in
//2. Diagonal detection

public class FinalProject {
	//controller 
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int[][] game = new int[7][6];
		for(int i = 0; i < game.length; i++) {
			for(int j = 0; j < game[0].length; j++) {
				game[i][j] = -1;
			}
		}
		System.out.println("Enter Coordinate without spaces.");
		boolean gameInProgress = true;
		int count = -1;
		while(gameInProgress == true) {
			count++;
			printGame(game);
			if(count % 2 == 0) {
				System.out.print("Y: ");
				int[] redPosition = acceptInput(stdin.nextLine());
				game[redPosition[0]-1][redPosition[1]-1] = 1;
			}else {
				System.out.print("R: ");
				int[] yellowPosition = acceptInput(stdin.nextLine());
				game[yellowPosition[0]-1][yellowPosition[1]-1] = 0;
			}
			gameInProgress = gameProgress(game);			
		}
		printGame(game);
		if(gameWin(game) == 1) {
			System.out.println("Yellow win!");
		}else if(gameWin(game) == 0){
			System.out.println("Red win!");
		}
		stdin.close();
	}
	//model
	public static boolean gameProgress(int[][] game) {
		boolean inProgress = true;
		//3 ways
		for(int i = 0; i < game.length; i++) {
			for(int j = 0; j < game[0].length; j++) {
				//horizontal, vertical direction
				if(i+3 < game.length && j+3 < game[0].length) {
					//horizontal
					if(game[i][j] == game[i][j+1] && game[i][j] == game[i][j+2] && game[i][j] == game[i][j+3] && game[i][j] != -1) {
						inProgress = false;
					}
					//vertical
					if(game[i][j] == game[i+1][j] && game[i][j] == game[i+2][j] && game[i][j] == game[i+3][j] && game[i][j] != -1) {
						inProgress = false;
					}
				}
				//diagonal direction down
				if(i+3 < game.length && j+3 < game[0].length) {
					if(game[i][j] == game[i+1][j+1] && game[i][j] == game[i+2][j+2] && game[i][j] == game[i+3][j+3] && game[i][j] != -1) {
						inProgress = false;
					}
				}
				//diagonal direction up
				if(i >= 3 && j >= 3) {
					if(game[i][j] == game[i-1][j-1] && game[i][j] == game[i-2][j-2] && game[i][j] == game[i-3][j-3] && game[i][j] != -1) {
						inProgress = false;
					}
				}

			}
		}
		return inProgress;
	}
	
	//return 0 if Y wins 1 if R wins
	public static int gameWin(int[][] game) {
		int whoWins = -1;
		for(int i = 0; i < game.length; i++) {
			for(int j = 0; j < game[0].length; j++) {
				//horizontal, vertical direction
				if(i+3 < game.length && j+3 < game[0].length) {
					//horizontal
					if(game[i][j] == game[i][j+1] && game[i][j] == game[i][j+2] && game[i][j] == game[i][j+3] && game[i][j] != -1) {
						if(game[i][j] == 0) {
							whoWins = 0;
						}else {
							whoWins = 1;
						}
					}
					//vertical
					if(game[i][j] == game[i+1][j] && game[i][j] == game[i+2][j] && game[i][j] == game[i+3][j] && game[i][j] != -1) {
						if(game[i][j] == 0) {
							whoWins = 0;
						}else {
							whoWins = 1;
						}
					}
				}
				//diagonal direction down
				if(i+3 < game.length && j+3 < game[0].length) {
					if(game[i][j] == game[i+1][j+1] && game[i][j] == game[i+2][j+2] && game[i][j] == game[i+3][j+3] && game[i][j] != -1) {
						if(game[i][j] == 0) {
							whoWins = 0;
						}else {
							whoWins = 1;
						}
					}
				}
				//diagonal direction up
				if(i >= 3 && j >= 3) {
					if(game[i][j] == game[i-1][j-1] && game[i][j] == game[i-2][j-2] && game[i][j] == game[i-3][j-3] && game[i][j] != -1) {
						if(game[i][j] == 0) {
							whoWins = 0;
						}else {
							whoWins = 1;
						}
					}
				}

			}
		}
		return whoWins;
	}
	
	//accept coordinate of the player
	public static int[] acceptInput(String inStr) {
		int[] outArr = new int[2];
		char firstElement = inStr.charAt(0);
		char secondElement = inStr.charAt(1);
		outArr[0] = Integer.parseInt(String.valueOf(firstElement));
		outArr[1] = Integer.parseInt(String.valueOf(secondElement));
		return outArr;
	}
	
	//view
	public static void printGame(int[][] game) {
		for(int i = 0; i < game.length; i++) {
			for(int j = 0; j < game[0].length; j++) {
				System.out.print("|");
				if(game[i][j] == 0) {
					System.out.print("R");
				}else if(game[i][j] == 1) {
					System.out.print("Y");
				}else {
					System.out.print(" ");
				}
				if(j == game[0].length-1) {
					System.out.print("|\n");
				}
			}
		}
	}
}
