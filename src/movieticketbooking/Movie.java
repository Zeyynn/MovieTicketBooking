package movieticketbooking;

import java.util.Scanner;
/*
1. HARIZ RAZIN BIN MOHAMMAD (CB21082)
2. WAN ASHRAF MUZAFFER BIN WAN MOHD ZAINI (CB21042)
3. DAYANG SYAHINDAH ARIBAH BINTI ABANG AHMAD (CB21075)
4. INTAN NURFARIZAH BINTI RAMLI (CB21017)
*/
public class Movie
{
    Scanner scan = new Scanner(System.in);
    
    protected String[] title = new String[3];
    protected double[] duration = new double[3];
    protected String[] movCode = new String[3];
    protected double[] price = new double[3];
    private int movChoice;
    
    public Movie()
    {
        int none;
    }
    
    public Movie(String[] title, double[] duration, String[] movCode)
    {
        this.title = title;
        this.duration = duration;
        this.movCode = movCode;
    }
}
