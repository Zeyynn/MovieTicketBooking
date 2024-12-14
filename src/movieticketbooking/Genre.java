package movieticketbooking;
/*
1. HARIZ RAZIN BIN MOHAMMAD (CB21082)
2. WAN ASHRAF MUZAFFER BIN WAN MOHD ZAINI (CB21042)
3. DAYANG SYAHINDAH ARIBAH BINTI ABANG AHMAD (CB21075)
4. INTAN NURFARIZAH BINTI RAMLI (CB21017)
*/
public abstract class Genre // abstract class for the movie genres
{
    public abstract Genre[] movieList();
    public abstract String getTitle();
    public abstract double movieTime();
    public abstract int movieChoice();
    public abstract double getMoviePrice();
    public abstract String getMovieCode();
}