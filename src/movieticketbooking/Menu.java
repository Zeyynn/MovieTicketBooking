package movieticketbooking;

import java.util.Scanner;
/*
1. HARIZ RAZIN BIN MOHAMMAD (CB21082)
2. WAN ASHRAF MUZAFFER BIN WAN MOHD ZAINI (CB21042)
3. DAYANG SYAHINDAH ARIBAH BINTI ABANG AHMAD (CB21075)
4. INTAN NURFARIZAH BINTI RAMLI (CB21017)
*/
public class Menu {
    Scanner scan = new Scanner(System.in);
    
    public void selectFunction()
    {
        DisplayView display = new DisplayView();
        
        display.getDisplayMenu();
        
        System.out.print("Choose: ");
        String choice = scan.nextLine();
        
        switch (choice)
        {
            case "1" -> {
                Payment pay = new Payment();
                
                pay.calculatePayment();
            }
                
            case "2" -> {
                System.exit(0); //terminate the programme
            }
                
            default -> {
            }
        }
    }
}
