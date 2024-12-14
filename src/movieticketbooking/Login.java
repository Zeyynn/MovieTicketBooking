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
public class Login
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
        String SQL = "SELECT * FROM userlogin";
        try
        {
            //connect to database
            myConn = DriverManager.getConnection(address, user, pass);
            myStmt = myConn.createStatement();
            
            //checking
            myRs = myStmt.executeQuery(SQL);
            
            while (myRs.next())
            {
                if ((nameCheck.equals(myRs.getString(1))) && (passCheck.equals(myRs.getString(2))))
                {
                    Menu menu = new Menu();
                    System.out.println("\nWelcome Back " + myRs.getString(1) + "!");
                    menu.selectFunction();
                }
            }
                            
        }catch (Exception e)
        {
            System.out.println("Login info not found");
            e.printStackTrace();
        }
        
    }
}
