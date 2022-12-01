import java.util.Scanner; 
public class tiling  
{
    public static int til(int n ,int []dp)
    {
        if(n<=3)
        {
            return dp[n]=n;
        }
        if(dp[n]!=0)
        {
            return dp[n];
        }
        int op1= til(n-1,dp);
        int op2= til(n-2,dp);
        return dp[n]=op1+op2;
    }
    public static int  tiles(int n ,int []dp)
    {
        
        dp[1]=1;
        dp[2]=2;
        dp[3]=3;
        for( int i=4;i<dp.length;i++)
        {
            int op1=dp[i-1];
            int op2=dp[i-2];
            dp[i]=op1+op2;
        }
        return dp[n];       
    }
    public static void main (String []args)
    {
        Scanner scn = new Scanner (System.in);
        int n = scn .nextInt();
        int []dp=new int[n+1];
        int ans= tiles(n,dp);
        int anss=til(n,dp);
        System.out.println(anss);
    }
    
}
