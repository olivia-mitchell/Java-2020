package tictactoe;
import java.util.*;
// changes to be made 11/10 fixed my issues

///////////////////////////////////////////////////////////////////////////////////////
// was getting a null point exception
// need to fix check winner to not return null and change to ""
// change will to ""
// change game loop to check for "" 
// was getting a -1 out of range exception 
// add checks in to computer move i=to check for -1
// it will require in if and else if 
//if move != -1 do every thing like normal else if move == -1 continue
//clear move if it was not -1
///////////////////////////////////////////////////////////////////////////////////////

public class TicTacToeAi {
	Scanner input = new Scanner(System.in);
	String human;
	String computer;
	
	//BUILD METHODS////////////////////////////////////////////////////////////////////
	public void intro() {
		System.out.println("Welcome to Tic Tac Toe");
		System.out.println("\t\t 0 | 1 | 2 ");
		System.out.println("\t\t-----------");
		System.out.println("\t\t 3 | 4 | 5 ");
		System.out.println("\t\t-----------");
		System.out.println("\t\t 6 | 7 | 8 ");

	}
	
	public String yesNoResponse(String question) {
		String response = " ";
		while (true) {
			System.out.println(question);
			response = input.nextLine();
			if (response.equalsIgnoreCase("yes")) {
				break;
			}
			else if (response.equalsIgnoreCase("no")) {
				break;
			}
		}
		return response.toLowerCase();
	}
	
	public int getNumber(String question, int low, int high) {

		while (true) {
			int numInput;
			try {
				System.out.println(question);
				numInput = input.nextInt();
				if (!(numInput >=low && numInput <=high)) {
					System.out.println("invalad");
					continue;
				}
				return numInput;
			}
			catch(InputMismatchException e) {
				System.out.println("invalad");
				input.nextLine();
				continue;
			}
		}

	}
	
	public void pieces(String X, String O) {
		String goFirst = yesNoResponse("do you want to go first? (yes/no): ");
		if (goFirst.equals("yes")) {
			human = X;
			computer = O;
		}
		else {
			human = O;
			computer = X;
		}
	}
	
	public String[] newBoard(int NUM_SQUARES,String EMPTY) {
		String[] board = new String[NUM_SQUARES];
		for (int i = 0;i<NUM_SQUARES;i++) {
			board[i] = EMPTY;
		}
		return board;
	}
	
	public void displayBoard(String[] board) {
		System.out.println("\t\t\t+-----------+");
		System.out.println("\t\t\t| "+board[0]+" | "+board[1]+" | "+board[2]+" | ");
		System.out.println("\t\t\t|-----------|");
		System.out.println("\t\t\t| "+board[3]+" | "+board[4]+" | "+board[5]+" | ");
		System.out.println("\t\t\t|-----------|");
		System.out.println("\t\t\t| "+board[6]+" | "+board[7]+" | "+board[8]+" | ");
		System.out.println("\t\t\t+-----------+");
		
	}
	
	public int[] legalMoves(String[] board,int NUM_SQUARES, String EMPTY) {
		int[] moves = new int[NUM_SQUARES];
		for (int i =0;i<NUM_SQUARES; i++) {
			if (board[i] == EMPTY) {
				moves[i] =i;
			}
			else {
				moves[i] = -1;
			}
		}
		return moves;
	}
	
	public int humanMove(String[] board,int NUM_SQUARES,String EMPTY) {
		int[] moves = legalMoves(board,NUM_SQUARES,EMPTY);
		int move = -1;
		while (true) {
			move = getNumber("where will you move (0-8)", 0, NUM_SQUARES);
			for(int x:moves) {
				if (move == x) {
					return move;
				}
			}
			System.out.println("that square is already taken choose another");
		}
	}

	public String nextTurn(String turn) {
		if (turn == "X") {
			return "O";
		}
		else {
			return "X";
		}
	}
	
	public String checkWinner(String[] board,String EMPTY, String TIE) {
		for (int a = 0; a< 8; a++) {
			String line = null;
			switch (a) {
			case 0:
				line = board[0] + board[1] + board[2];
				break;
			case 1:
				line = board[3] + board[4] + board[5];
				break;
			case 2:
				line = board[6] + board[7] + board[8];
				break;
			case 3:
				line = board[0] + board[3] + board[6];
				break;
			case 4:
				line = board[1] + board[4] + board[7];
				break;
			case 5:
				line = board[2] + board[5] + board[8];
				break;
			case 6:
				line = board[0] + board[4] + board[8];
				break;
			case 7:
				line = board[2] + board[4] + board[6];
				break;
			}
				if (line.equals("XXX")) {
					return "X";
				}
				else if (line.equals("OOO")) {
					return "O";
				}
				for (int i = 0; i< 9; i++) {
					if (board[i] == EMPTY) {
						break;
					}
					else if (i == 8) {
						return TIE;
					}
				}
			}
			return "";
	}
	
	public int compMove(String[] board, String EMPTY, String TIE) {
		String[] testBoard = new String[9];
		//make a copy to work with since function will be changing array
		for (int i = 0; i<9; i++) {
			testBoard[i] = board[i];
		}
		int[] bestMoves = {1,2,3,4,5,6,7,8,9};
		int[] legalMoves = legalMoves(board,9,EMPTY);
		// checking if any of the legal moves the computer can win with
		for (int move: legalMoves) {
			if (move !=-1) {
				System.out.println("in if statment for checking comp move");
				testBoard[move] = computer;
				String win = checkWinner(testBoard,EMPTY,TIE);
				System.out.println(win);
				if (win.equals(computer)) {
					return move;
				}
			}
			else if (move == -1){
				continue;
			}
			testBoard[move] = EMPTY;
		}
		//if human can win
		for (int move: legalMoves) {
			if (move !=-1) {
				System.out.println("in if statment for checking human move");
				testBoard[move] = human;
				String win = checkWinner(testBoard,EMPTY,TIE);
				System.out.println(win);
				if (win.equals(human)) {
					return move;
				}
			}
			else if (move == -1) {
				continue;
			}
			testBoard[move] = EMPTY;
		}
		//choose best move
		for (int move:bestMoves) {
			boolean inarray = contains(legalMoves,move);
			if (inarray) {
				return move;
			}
		}
		return bestMoves[0];
	}
	
	public boolean contains(int[] array, int key) {
		for(int i:array) {
			if (i == key) {
				return true;
			}
		}
		return false;
	}
	
	///////////////////////////////////////////////////////////////////////////////////
	public TicTacToeAi() {
		String X = "X";
		String O = "O";
		String EMPTY = " ";
		String TIE = "TIE";
		int NUM_SQUARES = 9;
		int move;
		String win = "";

		
		intro();
		
		pieces(X,O);
		String[] board = newBoard(NUM_SQUARES,EMPTY);
		String turn = "X";
		displayBoard(board);
		while (win == "") {
			
			if (turn == human) {
				move = humanMove(board,NUM_SQUARES,EMPTY);
				board[move] = human;
			}
			else {
				System.out.println("comp turn");
				move = compMove(board,EMPTY,TIE);
				System.out.println(move);
				board[move] = computer;
			}
			displayBoard(board);
			win = checkWinner(board,EMPTY,TIE);
			turn = nextTurn(turn);
		}
		System.out.println(win);
		
		
	}
	/*TESTING//////////////////////////////////////////////////////////////////////////
		board[0] = X;
		board[8] = O;
		int[] legalMoves = legalMoves(board,NUM_SQUARES,EMPTY);
		for (int var: legalMoves) {
			System.out.println(var);
		
		
		displayBoard(board);
		
		
		for (String var: board) {
			System.out.println(var);
		}
		
		System.out.println(human);
		System.out.println(computer);
		
		String p = yesNoResponse("Is This Working?");
		System.out.println(p);
		
		int i = getNumber("Enter a Number Between 0 and 8", 0, 8);
		System.out.println(i);
		820451673
	*//////////////////////////////////////////////////////////////////////////////////


	public static void main(String[] args) {
		new TicTacToeAi();

	}

}
