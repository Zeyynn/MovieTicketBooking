package movieticketbooking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Registration
{
    Connection myConn;
    Statement myStmt;
    ResultSet myRs;
    PreparedStatement pstmt;
    
    public void register()
    {
       //SQL Declarations
       String address = "jdbc:mysql://localhost:3306/movieticketing";
       String user = "root";
       String pass = "";
       
       Scanner scan = new Scanner(System.in);
       
       //assign & declaration
       User[] usr = new User[1];
       int regCount = 0;
       int regID = 0;

        usr[regID] = new User(null, null, null);
                    
        System.out.println("\n------Register an Account------");
        System.out.print("Username: ");
        usr[regID].userName = scan.nextLine();
        System.out.print("Password: ");
        usr[regID].userPass = scan.nextLine();
        System.out.print("Email: ");
        usr[regID].userEmail = scan.nextLine();
                        
        //SQL Parts for Registration
        String SQL = "INSERT INTO userlogin VALUES (?,?,?)";
        try
        {
            //connecto to database
            myConn = DriverManager.getConnection(address, user, pass);
            
            //Insertion
            pstmt = myConn.prepareStatement(SQL);
            pstmt.setString(1, usr[regID].userName);
            pstmt.setString(2, usr[regID].userPass);
            pstmt.setString(3, usr[regID].userEmail);
            pstmt.executeUpdate();
                            
        }catch (Exception e) {System.out.println("Registration Failed");}
                        
        System.out.println("\nWELCOME " + usr[regID].userName + "! THANKS FOR REGISTERING!");
    }
    
}
