package movieticketbooking;

import java.util.Scanner;
/*
1. HARIZ RAZIN BIN MOHAMMAD (CB21082)
2. WAN ASHRAF MUZAFFER BIN WAN MOHD ZAINI (CB21042)
3. DAYANG SYAHINDAH ARIBAH BINTI ABANG AHMAD (CB21075)
4. INTAN NURFARIZAH BINTI RAMLI (CB21017)
*/
public class Seats
{
    Scanner scan = new Scanner(System.in);
    
    public int seatAmount()
    {
        //assign and declaration
        DisplayView Display = new DisplayView();
        
        //display the seats
        Display.getDisplaySeat();
        
        //ask the user to input how many seats they want to book
        System.out.print("\nAmount of seats: ");
        int numOfSeats = scan.nextInt();
        
        scan.nextLine();
        
        return numOfSeats;
    }
    
    
    public String[] seatNumber(int numOfSeats)
    {
        String[] seatChoice = {null,null};
        
        System.out.println("Enter Seat Number ");
        for (int i = 0; i < numOfSeats; i++)
        {
            System.out.print("Seat " + (i+1) + " : ");
            seatChoice[i] = scan.nextLine();
        }
        
        return seatChoice;
    }
    
    public double getSeatPrice(double movPrice, int numOfSeats)
    {   
        return movPrice * numOfSeats;
    }
}
