package movieticketbooking;
/*
1. HARIZ RAZIN BIN MOHAMMAD (CB21082)
2. WAN ASHRAF MUZAFFER BIN WAN MOHD ZAINI (CB21042)
3. DAYANG SYAHINDAH ARIBAH BINTI ABANG AHMAD (CB21075)
4. INTAN NURFARIZAH BINTI RAMLI (CB21017)
*/
public class DisplayView implements display
{

     @Override
    public void getDisplayMenu()
    {
        System.out.println("\n+-----------------------------+");
        System.out.println("|         Main Menu           |");
        System.out.println("+-------+---------------------+");
        System.out.println("|   1   |     Book Ticket     |");
        System.out.println("+-------+---------------------+");
        System.out.println("|   2   |      Log Out        |");
        System.out.println("+-------+---------------------+");  
    }
    
    
    @Override
    public void getdisplayGenre() 
    {
        System.out.println("\n+-----------------------------+");
        System.out.println("|        MOVIE GENRES         |");
        System.out.println("+-------+---------------------+");
        System.out.println("|   1   |       ROMANCE       |");
        System.out.println("+-------+---------------------+");
        System.out.println("|   2   |       HORROR        |");
        System.out.println("+-------+---------------------+");
        System.out.println("|   3   |       COMEDY        |");
        System.out.println("+-------+---------------------+");
        System.out.println("|   4   |       ACTION        |");
        System.out.println("+-------+---------------------+");
    } 

    @Override
   public void getDisplaySeat()
   {
      System.out.println("\n-------Choose Seating------");
        System.out.println("----------Screen-----------");
        System.out.println("");
        System.out.println("01 02   03 04 05 06   07 08");
        System.out.println("09 10   11 12 13 14   15 16");
        System.out.println("17 18   19 20 21 22   23 24");
        System.out.println("25 26   27 28 29 30   31 32");
        System.out.println("33 34   35 36 37 38   39 40");
        System.out.println("41 42   43 44 45 46   47 48");
        System.out.println("        49 50 51 52"); 
   }
   
   @Override
   public void getDisplayFood()
   {
        System.out.println("\n -----Choose food set-----");
        System.out.println("+-----------------------------+");
        System.out.println("|      Food & Beverages       |");
        System.out.println("+-------+---------------------+");
        System.out.println("| Set 1 |      1 Drink        |");
        System.out.println("|(RM 15)|     1 Popcorn       |");
        System.out.println("+-------+---------------------+");
        System.out.println("| Set 2 |      2 Drink        |");
        System.out.println("|(RM 30)|     2 Popcorns      |");
        System.out.println("+-------+---------------------+");
        System.out.println("| Set 3 |      3 Drink        |");
        System.out.println("|(RM 50)|     3 Popcorns      |");
        System.out.println("+-------+---------------------+");
   }
    
   
}
