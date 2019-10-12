// Java program to demonstrate working of System.console()
// Note that this program does not work on IDEs as
// System.console() may require console
public class ChessPiece
{
    String codeName;
    String role;
    String location;
    boolean captured;

    public ChessPiece(String pieceCodeName, String pieceRole, String initialLocation) {
      codeName = pieceCodeName;
      role = pieceRole;
      location = initialLocation;
      captured = false;
    }

    public static void main(String[] args)
    {
      ChessPiece wr1 = new ChessPiece("wr1","rook","A1");
      ChessPiece wn1 = new ChessPiece("wn1","knight","B1");

      //###Setting the board###
      //The following String variables represent the data the should be displayed in each of the sqaures of the cheess board
      //The first letter s makes reference to Square the the two followig letters represent the squaere location
      //For instance sc1 means Square located at position C1
      String sa1 = "wr1";
      String sb1 = "wn1";
      String sc1 = "wb1";
      String sd1 = "wq1";
      String se1 = "wk1";
      String sf1 = "wb2";
      String sg1 = "wn2";
      String sh1 = "wr2";
      String sa2 = "wp1";
      String sb2 = "wp2";
      String sc2 = "wp3";
      String sd2 = "wp4";
      String se2 = "wp5";
      String sf2 = "wp6";
      String sg2 = "wp7";
      String sh2 = "wp8";
      String sa3 = "   ";
      String sb3 = "   ";
      String sc3 = "   ";
      String sd3 = "   ";
      String se3 = "   ";
      String sf3 = "   ";
      String sg3 = "   ";
      String sh3 = "   ";
      String sa4 = "   ";
      String sb4 = "   ";
      String sc4 = "   ";
      String sd4 = "   ";
      String se4 = "   ";
      String sf4 = "   ";
      String sg4 = "   ";
      String sh4 = "   ";
      String sa5 = "   ";
      String sb5 = "   ";
      String sc5 = "   ";
      String sd5 = "   ";
      String se5 = "   ";
      String sf5 = "   ";
      String sg5 = "   ";
      String sh5 = "   ";
      String sa6 = "   ";
      String sb6 = "   ";
      String sc6 = "   ";
      String sd6 = "   ";
      String se6 = "   ";
      String sf6 = "   ";
      String sg6 = "   ";
      String sh6 = "   ";
      String sa7 = "bp1";
      String sb7 = "bp2";
      String sc7 = "bp3";
      String sd7 = "bp4";
      String se7 = "bp5";
      String sf7 = "bp6";
      String sg7 = "bp7";
      String sh7 = "bp8";
      String sa8 = "br1";
      String sb8 = "bn1";
      String sc8 = "bb1";
      String sd8 = "bqu";
      String se8 = "bki";
      String sf8 = "bb2";
      String sg8 = "bn2";
      String sh8 = "br2";

      //Display chess board
      System.out.println("");
      System.out.println("        ### CHESS ###");
      System.out.println("");
      System.out.println("  ---------------------------------");
      System.out.println("8 |"+sa8+"|"+sb8+"|"+sc8+"|"+sd8+"|"+se8+"|"+sf8+"|"+sg8+"|"+sh8+"|");
      System.out.println("  ---------------------------------");
      System.out.println("7 |"+sa7+"|"+sb7+"|"+sc7+"|"+sd7+"|"+se7+"|"+sf7+"|"+sg7+"|"+sh7+"|");
      System.out.println("  ---------------------------------");
      System.out.println("6 |"+sa6+"|"+sb6+"|"+sc6+"|"+sd6+"|"+se6+"|"+sf6+"|"+sg6+"|"+sh6+"|");
      System.out.println("  ---------------------------------");
      System.out.println("5 |"+sa5+"|"+sb5+"|"+sc5+"|"+sd5+"|"+se5+"|"+sf5+"|"+sg5+"|"+sh5+"|");
      System.out.println("  ---------------------------------");
      System.out.println("4 |"+sa4+"|"+sb4+"|"+sc4+"|"+sd4+"|"+se4+"|"+sf4+"|"+sg4+"|"+sh4+"|");
      System.out.println("  ---------------------------------");
      System.out.println("3 |"+sa3+"|"+sb3+"|"+sc3+"|"+sd3+"|"+se3+"|"+sf3+"|"+sg3+"|"+sh3+"|");
      System.out.println("  ---------------------------------");
      System.out.println("2 |"+sa2+"|"+sb2+"|"+sc2+"|"+sd2+"|"+se2+"|"+sf2+"|"+sg2+"|"+sh2+"|");
      System.out.println("  ---------------------------------");
      System.out.println("1 |"+sa1+"|"+sb1+"|"+sc1+"|"+sd1+"|"+se1+"|"+sf1+"|"+sg1+"|"+sh1+"|");
      System.out.println("  ---------------------------------");
      System.out.println("    A   B   C   D   E   F   G   H  ");
      System.out.println("");


      /*
      System.out.println("Enter you move:");
      String name = System.console().readLine();

      System.out.println("");
      System.out.println("        ### CHESS ###");
      System.out.println("");
      System.out.println("---------------------------------");
      System.out.println("|BR1|BN1|BB1|BQU|BKI|BB2|BN2|BR2|");
      System.out.println("---------------------------------");
      System.out.println("|BP1|BP2|BP3|BP4|BP6|BP7|BP8|BP9|");
      System.out.println("---------------------------------");
      System.out.println("|   |   |   |   |   |   |   |   |");
      System.out.println("---------------------------------");
      System.out.println("|   |   |   |   |   |   |   |   |");
      System.out.println("---------------------------------");
      System.out.println("|   |   |   |   |   |   |   |   |");
      System.out.println("---------------------------------");
      System.out.println("|   |   |WP3|   |   |   |   |   |");
      System.out.println("---------------------------------");
      System.out.println("|WP1|WP2|   |WP4|WP6|WP7|WP8|WP9|");
      System.out.println("---------------------------------");
      System.out.println("|WR1|WN1|WB3|WQU|WKI|WB2|WN2|WR2|");
      System.out.println("---------------------------------");
      System.out.println("");
      */

    }
}
