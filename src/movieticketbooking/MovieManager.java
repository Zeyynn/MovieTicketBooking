package movieticketbooking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.Scanner;
/*
1. HARIZ RAZIN BIN MOHAMMAD (CB21082)
2. WAN ASHRAF MUZAFFER BIN WAN MOHD ZAINI (CB21042)
3. DAYANG SYAHINDAH ARIBAH BINTI ABANG AHMAD (CB21075)
4. INTAN NURFARIZAH BINTI RAMLI (CB21017)
*/
public class MovieManager
{   
    Connection myConn;
    Statement myStmt;
    ResultSet myRs;
    PreparedStatement pstmt;
    
    //SQL Declarations
    String address = "jdbc:mysql://localhost:3306/movieticketing";
    String user = "root";
    String pass = "";
    
    Scanner scan = new Scanner(System.in);
    
    public int viewMovieList(String genre)
    {
        String SQL = "SELECT * FROM " + genre;
        System.out.println("\nList of " + genre + " Movies");
        System.out.println("\nChoice    Title             Duration    Price     Movie Code");

        try{
            //connect to database
            myConn = DriverManager.getConnection(address, user, pass);
            myStmt = myConn.createStatement();
            
            myRs = myStmt.executeQuery(SQL);
            int i = 0;
            while (myRs.next())
            {
                String title = myRs.getString(1);
                double duration = myRs.getDouble(2);
                String movCode = myRs.getString(3);
                double price = myRs.getDouble(4);
                int movNum = myRs.getInt(5);
                
                System.out.println((i+1) + "         " + title + "     " + duration + "            " + price + "     " + movCode);
                i++;
            }
            
        }catch (Exception e){System.out.println("Error");}
        
        System.out.print("Choose movie number to change: ");
        int choice = scan.nextInt();
        String newline = scan.nextLine(); //remove lingering newline
        return choice;
    }
    
    public void updateMovieTitle(String genre, int choice)
    {
        String change;
        System.out.print("\nEnter a new Title: ");
        change = scan.nextLine();
        
        String SQL = "UPDATE " + genre + " SET title='" + change + "' WHERE movieNumber=" + choice;
        
        try{
            myStmt.executeUpdate(SQL);
        }catch (Exception e){e.printStackTrace();}
    }
    
    public void updateMovieDuration(String genre, int choice)
    {
        double change;
        System.out.print("\nEnter a new Duration: ");
        change = scan.nextDouble();
        String newline = scan.nextLine(); //remove lingering newline
        
        String SQL = "UPDATE " + genre + " SET duration='" + change + "' WHERE movieNumber=" + choice;
        
        try{
            myStmt.executeUpdate(SQL);
        }catch (Exception e){e.printStackTrace();}
    }
    
    public void updateMoviePrice(String genre, int choice)
    {
        double change;
        System.out.print("\nEnter a new Price: ");
        change = scan.nextDouble();
        String newline = scan.nextLine(); //remove lingering newline
        
        String SQL = "UPDATE " + genre + " SET price='" + change + "' WHERE movieNumber=" + choice;
        
        try{
            myStmt.executeUpdate(SQL);
        }catch (Exception e){e.printStackTrace();}
    }
    
    public void updateMovieCode(String genre, int choice)
    {
        String change;
        System.out.print("\nEnter a new Code: ");
        change = scan.nextLine();
        
        String SQL = "UPDATE " + genre + " SET code='" + change + "' WHERE movieNumber=" + choice;
        
        try{
            myStmt.executeUpdate(SQL);
        }catch (Exception e){e.printStackTrace();}
    }
}
