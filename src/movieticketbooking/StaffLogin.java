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
public class StaffLogin
{
    Connection myConn;
    Statement myStmt;
    ResultSet myRs;
    PreparedStatement pstmt;
    
    Scanner scan = new Scanner(System.in);
    
    public void Login()
    {
        //SQL Declarations
        String address = "jdbc:mysql://localhost:3306/movieticketing";
        String user = "root";
        String pass = "";
        
        //Declarations
        String nameCheck;
        String passCheck;
        
        System.out.println("\nLogin");
        
        //Getting login details
        System.out.print("Username: ");
        nameCheck = scan.nextLine();
        System.out.print("Password: ");
        passCheck = scan.nextLine();
        
        //SQL Parts for Login
        String SQL = "SELECT * FROM stafflogin";
        try
        {
            //connect to database
            myConn = DriverManager.getConnection(address, user, pass);
            myStmt = myConn.createStatement();
            
            myRs = myStmt.executeQuery(SQL);
            
            while (myRs.next()) //checking
            {
                if ((nameCheck.equals(myRs.getString(1))) && (passCheck.equals(myRs.getString(2))))
                {
                    MovieManager manage = new MovieManager();
                    System.out.println("\nWelcome To Work " + myRs.getString(1) + "!");
                    System.out.println("\n----------MANAGE MOVIES----------");
                    
                    String genre = null;
                    int choice;
                    String genreLoop = "N";
                    
                    do
                    {
                        System.out.print("1. Romance\n2. Horror\n3. Comedy\n4. Action\nChoose genre to manage: ");
                        choice = scan.nextInt();
                    
                        switch (choice)
                        {
                            case 1 -> {
                                genre = "romance";
                            }
                            case 2 -> {
                                genre = "horror";
                            }
                            case 3 -> {
                                genre = "comedy";
                            }
                            case 4 -> {
                                genre = "action";
                            }
                        }
                        
                        System.out.print("\n---------CHANGES----------");
                        int movieNum = manage.viewMovieList(genre); //list all movies of a genre
                        
                        String movieLoop;
                        do
                        {
                            System.out.println("\n1. Title\n2. Duration\n3. Movie Code\n4. Price");
                            System.out.print("What aspect would you like to change?: ");
                            int aspect = scan.nextInt();
                            String newline = scan.nextLine(); //remove lingering newline
                            
                            switch (aspect)
                            {
                                case 1 -> manage.updateMovieTitle(genre, movieNum);
                                case 2 -> manage.updateMovieDuration(genre, movieNum);
                                case 3 -> manage.updateMovieCode(genre, movieNum);
                                case 4 -> manage.updateMoviePrice(genre, movieNum);
                            }
                            
                            System.out.print("\nContinue with changing? [Y/N]: ");
                            movieLoop = scan.nextLine();
                            movieLoop = movieLoop.toUpperCase(); //Change the user input to uppercase if it is in lowercase
                        }while("Y".equals(movieLoop));
                        
                        System.out.print("Continue movie managing? [Y/N]: ");
                        movieLoop = scan.nextLine();
                        movieLoop = movieLoop.toUpperCase(); //Change the user input to uppercase if it is in lowercase
                        System.out.println("");
                    }while(genreLoop.equals("Y"));
                }
            }
                            
        }catch (Exception e)
        {
            System.out.print("");
            e.printStackTrace();
        }
        
    }
}