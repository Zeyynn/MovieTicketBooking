package movieticketbooking;

import java.util.Scanner;
import java.util.Random;
/*
1. HARIZ RAZIN BIN MOHAMMAD (CB21082)
2. WAN ASHRAF MUZAFFER BIN WAN MOHD ZAINI (CB21042)
3. DAYANG SYAHINDAH ARIBAH BINTI ABANG AHMAD (CB21075)
4. INTAN NURFARIZAH BINTI RAMLI (CB21017)
*/
public class Payment {
     Scanner scan = new Scanner(System.in);
    
    public double calculatePayment()
    {
        //assign and declaration
        FoodBev food = new FoodBev();
        DisplayView display = new DisplayView();
        Genre rom = new Romance();
        Genre hor = new Horror();
        Genre com = new Comedy();
        Genre act = new Action();
        Seats seats = new Seats(); 
        
        String genreChoice;
        String title = null;
        double duration;
        String movCode = null;
        double price;
        int movChoice = 0;
        double movPrice = 0;
        double movTime = 0;
        double setPrice = 0;
        double finalPrice;
        int setNo = 0;
        String order;
      
        //display list of genre
        display.getdisplayGenre();
        
        //ask user to input genre option
        System.out.print("What Movie Genre would you like?: ");
        genreChoice = scan.nextLine();
        
        //output based on user's genre option
        switch (genreChoice)
        {
            case "1" -> 
            {
                System.out.println("\nRomance Films");
                rom.movieList();
                movChoice = rom.movieChoice();
                title = rom.getTitle();
                movTime = rom.movieTime();
                movPrice = rom.getMoviePrice();
                movCode = rom.getMovieCode();
            }
                
            case "2" -> 
            {
                System.out.println("\nHorror Films");
                hor.movieList();
                movChoice = hor.movieChoice();
                title = hor.getTitle();
                movTime = hor.movieTime();
                movPrice = hor.getMoviePrice();
                movCode = hor.getMovieCode();
            }
                
            case "3" -> 
            {
                System.out.println("\nComedic Films");
                com.movieList();
                movChoice = com.movieChoice();
                title = com.getTitle();
                movTime = com.movieTime();
                movPrice = com.getMoviePrice();
                movCode = com.getMovieCode();
            }
                
            case "4" -> 
            {
                System.out.println("\nAction Films");
                act.movieList();
                movChoice = act.movieChoice();
                title = act.getTitle();
                movTime = act.movieTime();
                movPrice = act.getMoviePrice();
                movCode = act.getMovieCode();
            }
        }       
        
        //Choose Seating
        int numOfSeats = seats.seatAmount();
        
        String[] seatChoice = seats.seatNumber(numOfSeats);
        
        double seatPrice = seats.getSeatPrice(movPrice, numOfSeats);
        
        //Order Food n Bev
        System.out.print("\n Do you want to order food and beverage? [Y/N] : "); 
        order = scan.nextLine();
        order = order.toUpperCase(); //Change the user input to uppercase if it is in lowercase
        
        switch(order)
        {
            case "Y"->
            {
                FoodBev foodbev = new FoodBev();
                setNo = foodbev.setType();
                setPrice = foodbev.Price(setNo);
            }
            case "N"-> System.out.println("\n YOU CAN PROCEED TO PAYMENT");
            
        }
        
        //calculate the final price of the ticket
        finalPrice = seatPrice + setPrice;
        
        Random rand = new Random();
        int upperbound = 100;
        int intRandom = rand.nextInt(upperbound);
        
        //Print out Ticket
        System.out.println("\n--------OOPScreen Cinema--------");
        System.out.println("Ticket ID      : " + movCode + intRandom);
        System.out.println("Movie          : " + title);
        System.out.println("Time           : " + movTime);
        System.out.print("Seat(s) Number : ");
        for(int i=0; i<numOfSeats; i++)
        {
        System.out.print(seatChoice[i] + " ");
        }
        System.out.println("\nMeal Set       : " + setNo);
        System.out.println("Price          : RM" + finalPrice);
        System.out.println("--------------------------------");
        
         return finalPrice;
    }
}
