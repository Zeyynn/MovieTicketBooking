package movieticketbooking;
/*
1. HARIZ RAZIN BIN MOHAMMAD (CB21082)
2. WAN ASHRAF MUZAFFER BIN WAN MOHD ZAINI (CB21042)
3. DAYANG SYAHINDAH ARIBAH BINTI ABANG AHMAD (CB21075)
4. INTAN NURFARIZAH BINTI RAMLI (CB21017)
*/
public class User {
    public String userName;
    public String userPass;
    public String userEmail;
    
    public User(String userName, String userPass, String userEmail)
    {
        this.userName = userName;
        this.userPass = userPass;
        this.userEmail = userEmail;
    }
    
    public String getName()
    {
        return userName;
    }
    
    public String getPass()
    {
        return userPass;
    }
    
    public String getEmail()
    {
        return userEmail;
    }
}
