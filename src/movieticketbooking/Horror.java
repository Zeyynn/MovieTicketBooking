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
public class Horror extends Genre
{
    Scanner scan = new Scanner(System.in);
    
    protected String[] title = new String[3];
    protected double[] duration = new double[3];
    protected String[] movCode = new String[3];
    protected double[] price = new double[3];
    private int movChoice;
    
    @Override
    public Horror[] movieList()
    {
        //Database Stuff
        Connection myConn;
        Statement myStmt;
        ResultSet myRs;
        PreparedStatement pstmt;

        String address = "jdbc:mysql://localhost:3306/movieticketing";
        String user = "root";
        String pass = "";
        
        String SQL = "SELECT * FROM horror";
        try
        {
            //connect to database
            myConn = DriverManager.getConnection(address, user, pass);
            myStmt = myConn.createStatement();
            
            //checking
            myRs = myStmt.executeQuery(SQL);
            
            int i = 0;
            System.out.println("Choice    Title             Duration    Price");
            while (myRs.next())
            {
                title[i] = myRs.getString(1);
                duration[i] = myRs.getDouble(2);
                movCode[i] = myRs.getString(3);
                price[i] = myRs.getDouble(4);
                
                System.out.println((i+1) + "         " + title[i] + "     " + duration[i] + "            " + price[i]);
                i++;
            }
                            
        }catch (Exception e)
        {
            System.out.println("Error");
            e.printStackTrace();
        }
        
        return null;
    }
    
    @Override
    public String getTitle()
    {
        switch (movChoice)
        {
            case 1 -> title[0] = title[0];
            case 2 -> title[0] = title[1];
            case 3 -> title[0] = title[2];
        }
        
        return title[0];
    }
    
    @Override
    public int movieChoice()
    {
        System.out.print("\nMovie Choice: ");
        movChoice = scan.nextInt();
        
        return movChoice;
    }
    
    @Override
    public double movieTime()
    {
        double[] movTime = {10.00, 13.00, 16.00, 19.00, 21.00, 23.00};
        System.out.println("\nScreening Times");
        for (int i=0; i < movTime.length; i++)
        {
            System.out.println(movTime[i]);
        }
        
        System.out.print("\nChoose Time: ");
        double timeChoice = scan.nextDouble();
        
        return timeChoice;
    }
    
    @Override
    public double getMoviePrice()
    {
        switch (movChoice)
        {
            case 1 -> price[0] = price[0];
            case 2 -> price[0] = price[1];
            case 3 -> price[0] = price[2];
        }
        
        return price[0];
    }
    
    @Override
    public String getMovieCode()
    {
        switch (movChoice)
        {
            case 1 -> movCode[0] = movCode[0];
            case 2 -> movCode[0] = movCode[1];
            case 3 -> movCode[0] = movCode[2];
        }
        
        return movCode[0];
    }
}


