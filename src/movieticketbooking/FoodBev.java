package movieticketbooking; 
 
import java.util.Scanner; 
/*
1. HARIZ RAZIN BIN MOHAMMAD (CB21082)
2. WAN ASHRAF MUZAFFER BIN WAN MOHD ZAINI (CB21042)
3. DAYANG SYAHINDAH ARIBAH BINTI ABANG AHMAD (CB21075)
4. INTAN NURFARIZAH BINTI RAMLI (CB21017)
*/ 
public class FoodBev
{ 
    Scanner scan = new Scanner(System.in); 
     
     //assign and declaration
    DisplayView Display = new DisplayView();
    double setPrice; 

    public int setType()
    {  
        //Display menu for set
        Display.getDisplayFood();
       
        //User input for set
        System.out.println("\nYour choice: "); 
                 
        int setNo = scan.nextInt(); 
        scan.nextLine(); 
        
        return setNo; 
    } 
    
    public double Price(int setNo)
    { 
        //assign setPrice according to set chosen
        switch(setNo)
        { 
            case 1 -> setPrice = 15;
            case 2 -> setPrice = 30;
            case 3 -> setPrice = 50; 
        } 
        
        //print out user chosen set with price
        System.out.print("\n-----YOUR FOOD CHOICE-----"); 
        System.out.print("\nSET TYPE : " +setNo); 
        System.out.print("\nTOTAL FOOD PRICE : "+setPrice); 
        System.out.println("\n--------------------------"); 
        
        return setPrice;      
    }   
}