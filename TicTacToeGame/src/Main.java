import java.util.Scanner;
class Main
  {
  static String [][] board = new String [3][3];
   
  public static void main(String[] args) 
    {
      prepareBoard();
      displayBoard();
      
      boolean gameIsGoing = true;
      while (gameIsGoing)
        {
      playerMove();
      displayBoard();
      isWonGame();
      computerMove();
      displayBoard();
      isWonGame();
        }   
    }
  public static void displayBoard()
    {
      //String [][] board = new String [3][3];
      System.out.println("    1   2   3");
      System.out.println("  -------------");
      System.out.println("A | "+board[0][0]+" | "+board[0][1]+" | "+board[0][2]+" |");
      System.out.println("  -------------");
      System.out.println("B | "+board[1][0]+" | "+board[1][1]+" | "+board[1][2]+" |");
      System.out.println("  -------------");
      System.out.println("C | "+board[2][0]+" | "+board[2][1]+" | "+board[2][2]+" |");
      System.out.println("  -------------");
      System.out.println( );
    }
  public static void prepareBoard()
    {
      //make a nested for loop that puts a space in each box
      for (int row = 0; row < board.length; row ++)
        {
          for (int col = 0; col < board.length; col++)
            {
              board [row][col] = " ";
            }
        }
     
    }
  public static void playerMove()
    {
      Scanner userStringInput = new Scanner (System.in); 
     // System.out.println("Hello there! Would you like to be X or O ?");
    //  String choice = userStringInput.nextLine();
             
      System.out.println("Type in coordinates for a square on the board to play a move.");
      String coordinates = userStringInput.nextLine();


      //if statements
      coordinates = coordinates.toUpperCase();
      if (coordinates.equals("A1"))
      {
      //  board [0][0]="X"; 
        if (board[0][0].equals ("0"))
        {
          System.out.println("Hey, you can't go there! Start over!");
            System.exit(0);
        }
       if (board[0][0].equals (" "))
        {
           board [0][0]="X";
        } 
      }
      else if (coordinates.equals("A2"))
      {
       // board [0][1]="X"; 
        if (board[0][1].equals ("0"))
        {
          System.out.println("Hey, you can't go there! Start over!");
          System.exit(0);
        }
        if (board[0][1].equals (" "))
        {
           board [0][1]="X";
        } 
      }
      else if (coordinates.equals("A3"))
      {
        //board [0][2]="X"; 
        if (board[0][2].equals ("0"))
        {
          System.out.println("Hey, you can't go there! Start over!");
          System.exit(0);
        }
        if (board[0][2].equals (" "))
        {
           board [0][2]="X";
        }
      }
      else if (coordinates.equals("B1"))
      {
        //board [1][0]="X"; 
        if (board[1][0].equals ("0"))
        {
          System.out.println("Hey, you can't go there! Start over!");
          System.exit(0);
        }
        if (board[1][0].equals (" "))
        {
           board [1][0]="X";
        }    
      }
      else if (coordinates.equals("B2"))
      {
        //board [1][1]="X"; 
        if (board[1][1].equals ("0"))
        {
          System.out.println("Hey, you can't go there! Start over!");
          System.exit(0);
        }
        if (board[1][1].equals (" "))
        {
           board [1][1]="X";
        }
      }
      else if (coordinates.equals("B3"))
      {
       // board [1][2]="X";
        if (board[1][2].equals ("0"))
        {
          System.out.println("Hey, you can't go there! Start over!");
          System.exit(0);
        }
       if (board[1][2].equals (" "))
        {
           board [1][2]="X";
        }
      }
      else if (coordinates.equals("C1"))
      {
       // board [2][0]="X"; 
        if (board[2][0].equals ("0"))
        {
          System.out.println("Hey, you can't go there! Start over!");
          System.exit(0);
        }
        if (board[2][0].equals (" "))
        {
           board [2][0]="X";
        }   
      }
      else if (coordinates.equals("C2"))
      {
        //board [2][1]="X"; 
        if (board[2][1].equals  ("0"))
        {
          System.out.println("Hey, you can't go there! Start over!");
          System.exit(0);
        }
        if (board[2][1].equals (" "))
        {
           board [2][1]="X";
        }
      }
      else if (coordinates.equals("C3"))
      {
       // board [2][2]="X"; 
        if (board[2][2].equals ("0"))
        {
          System.out.println("Hey, you can't go there! Start over!");
          System.exit(0);
        }
       if (board[2][2].equals (" "))
        {
           board [2][2]="X";
        }
           
      }
      else 
      {
        System.out.println("That's not a choice! Restart.");
      }
      
             
    }
  public static void computerMove()
    {
     int randomRow = (int) (Math.random()*3);
     int randomCol = (int) (Math.random()*3);

      if (board [randomRow] [randomCol].equals(" "))
      {
        board [randomRow] [randomCol] = "0";
      }
      else 
      {
        computerMove();
      }
     // displayBoard();
      
    }
  public static void isWonGame()
		{
		if ((board[0][0].equals(board[0][1]) && board[0][1].equals(board[0][2]) && !board[0][1].equals(" ")) ||
			(board[1][0].equals(board[1][1]) && board[1][1].equals(board[1][2]) && !board[1][1].equals(" ")) ||
			(board[2][0].equals(board[2][1]) && board[2][1].equals(board[2][2]) && !board[2][1].equals(" ")) ||
			(board[0][0].equals(board[1][0]) && board[1][0].equals(board[2][0]) && !board[1][0].equals(" ")) ||				
			(board[0][1].equals(board[1][1]) && board[1][1].equals(board[2][1]) && !board[1][1].equals(" ")) ||
			(board[0][2].equals(board[1][2]) && board[1][2].equals(board[2][2]) && !board[1][2].equals(" ")) ||
			(board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]) && !board[1][1].equals(" ")) ||
			(board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0]) && !board[1][1].equals(" ")))
			{
			System.out.println("The game is over!");
			System.exit(0);
			}
		}

}