package movieticketbooking;

import java.util.Scanner;

/*
1. HARIZ RAZIN BIN MOHAMMAD (CB21082)
2. WAN ASHRAF MUZAFFER BIN WAN MOHD ZAINI (CB21042)
3. DAYANG SYAHINDAH ARIBAH BINTI ABANG AHMAD (CB21075)
4. INTAN NURFARIZAH BINTI RAMLI (CB21017)
*/
public class MovieTicketBooking
{   
    public static void main(String[] args)
    {   
       
       Scanner scan = new Scanner(System.in);
       
       //assign & declaration
       User[] usr = new User[10];
       int regCount = 0;
       int regID = 0;
       String choice2;

       System.out.println("------Movie Time------");
       
        do
        {
            System.out.print("New User or Login?: \n1.Register\n2.Login\n3.Staff Login\nEnter: ");
            String choice = scan.nextLine();
            
            switch (choice)
            {
                case "1" -> {
                    //Registration for user
                    Registration reg = new Registration();
                    reg.register();
                }
                    
                case"2" -> {
                    //Login, after registration
                    Login log = new Login();
                    log.Login();
                }
                
                case"3" -> {
                    //Login for staff
                    StaffLogin slog = new StaffLogin();
                    slog.Login();
                }
            }   
            
            System.out.print("\nContinue with Registration and Login? [Y/N]: ");
            choice2 = scan.nextLine();
            choice2 = choice2.toUpperCase(); //Change the user input to uppercase if it is in lowercase
        }
        
        while("Y".equals(choice2));
        
        
        
        System.out.println("\n---------Thank You---------");

    }    
    }
    
