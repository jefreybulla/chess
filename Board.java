// This approach tries to Model the chess game from the perspective of the chess pieces as the object
public class Board {

    String[][] grid = new String[8][8];


    public Board() {

      //grid represents the location of the positions on the board
      //Format: grid[row][column]. Player should follow this format to make moves.

      grid[0][0] = "wr1";
      grid[0][1] = "wn1";
      grid[0][2] = "wb1";
      grid[0][3] = "wqu";
      grid[0][4] = "wki";
      grid[0][5] = "wb2";
      grid[0][6] = "wn2";
      grid[0][7] = "wr2";

      grid[1][0] = "wp1";
      grid[1][1] = "wp2";
      grid[1][2] = "wp3";
      grid[1][3] = "wp4";
      grid[1][4] = "wp5";
      grid[1][5] = "wp6";
      grid[1][6] = "wp7";
      grid[1][7] = "wp8";

      grid[2][0] = "   ";
      grid[2][1] = "   ";
      grid[2][2] = "   ";
      grid[2][3] = "   ";
      grid[2][4] = "   ";
      grid[2][5] = "   ";
      grid[2][6] = "   ";
      grid[2][7] = "   ";

      grid[3][0] = "   ";
      grid[3][1] = "   ";
      grid[3][2] = "   ";
      grid[3][3] = "   ";
      grid[3][4] = "   ";
      grid[3][5] = "   ";
      grid[3][6] = "   ";
      grid[3][7] = "   ";

      grid[4][0] = "   ";
      grid[4][1] = "   ";
      grid[4][2] = "   ";
      grid[4][3] = "   ";
      grid[4][4] = "   ";
      grid[4][5] = "   ";
      grid[4][6] = "   ";
      grid[4][7] = "   ";

      grid[5][0] = "   ";
      grid[5][1] = "   ";
      grid[5][2] = "   ";
      grid[5][3] = "   ";
      grid[5][4] = "   ";
      grid[5][5] = "   ";
      grid[5][6] = "   ";
      grid[5][7] = "   ";

      grid[6][0] = "bp1";
      grid[6][1] = "bp2";
      grid[6][2] = "bp3";
      grid[6][3] = "bp4";
      grid[6][4] = "bp5";
      grid[6][5] = "bp6";
      grid[6][6] = "bp7";
      grid[6][7] = "bp8";

      grid[7][0] = "br1";
      grid[7][1] = "bn1";
      grid[7][2] = "bb1";
      grid[7][3] = "bqu";
      grid[7][4] = "bki";
      grid[7][5] = "bb2";
      grid[7][6] = "bn2";
      grid[7][7] = "br2";

    }

    public void renderBoard() {
      System.out.println("");
      System.out.println("        ### CHESS ###");
      System.out.println("");
      System.out.println("    0   1   2   3   4   5   6   7  ");
      System.out.println("  ---------------------------------");

      int counter = 0;
      while(counter<8){
        System.out.println(counter + " |"+grid[counter][0]+"|"+grid[counter][1]+"|"+grid[counter][2]+"|"+grid[counter][3]+"|"+grid[counter][4]+"|"+grid[counter][5]+"|"+grid[counter][6]+"|"+grid[counter][7]+"|");
        System.out.println("  ---------------------------------");
        counter = counter + 1;
      }
    }

    public void updateBoard(String piece,int newVerticalPosition, int newHorizontalPosition) {
      int horizontalCounter = 0;
      int verticalCounter = 0;
      boolean found = false;

      while(verticalCounter<8 && !found ){
        while(horizontalCounter<8 && !found ){
          System.out.println("V:"+ verticalCounter +" H:"+ horizontalCounter);
          if (grid[verticalCounter][horizontalCounter].equals(piece)){
            found = true;
            grid[verticalCounter][horizontalCounter] = "   ";
            grid[newVerticalPosition][newHorizontalPosition] = piece;
          }
          horizontalCounter = horizontalCounter + 1;
        }
        horizontalCounter = 0;
        verticalCounter = verticalCounter + 1;
      }
    }

    public static void main(String[] args) {
      Board myBoard = new Board();
      myBoard.renderBoard();
      //myBoard.updateBoard("wn1",2,0);
      //myBoard.renderBoard();

      boolean gameOver = false;
      String turn = "white";

      while (!gameOver) {
        System.out.println(turn + " turn. Choose your piece:");
        String piece = System.console().readLine();
        if (piece.equals("quit")){
          gameOver = true;
          System.out.println("exiting game...");
        }
        else {
          System.out.println(turn + " turn. Enter new vertical location (row) for " + piece + ":");
          String input1 = System.console().readLine();
          int pieceVerticalLocation = Integer.parseInt(input1);

          System.out.println(turn + " turn. Enter new horizontal location (column) for " + piece + ":");
          String input2 = System.console().readLine();
          int pieceHorizontalLocation = Integer.parseInt(input2);

          System.out.println("Your move was: " + piece + " to " + pieceVerticalLocation + pieceHorizontalLocation);
          myBoard.updateBoard(piece,pieceVerticalLocation,pieceHorizontalLocation);
          myBoard.renderBoard();

          if (turn.equals("white")) {
            turn = "black";
          }
          else {
            turn = "white";
          }
        }
      }



    }

}
