import java . util.Scanner;
public class tillingWithTileM
{
    public static int ways(int n ,int m,int[]dp)
    {
        for(int i=1;i<dp.length;i++)
        {
           
            if(i<m)
            {
                dp[i] = 1;
            }
            else if(i==m)
            {
                dp[i]=2;
            }
            else
            {
                int op1 = dp[i-1];
                int op2 = dp[i-m];
                dp[i]=op1+op2;
            }
        }
        return dp[n];
    }

    public static int waysR(int n , int m , int []dp)
    {
        if(n<=2)
        {
            return dp[n]=n;
        }
        if(dp[n]!=0)
        {
            return dp[n];
        }
        int op1=waysR(n-1,m,dp);
        int op2=waysR(n-m,m,dp);
        return dp[n]=op1+op2;
    }
    public static void main(String []args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int dp[]= new int[n+1];
        int ans = ways(n,m,dp);
        // int anss=waysR(n,m,dp);
        System.out.println(ans);
    }
    
}
