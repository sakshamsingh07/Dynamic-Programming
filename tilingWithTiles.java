import java.util.Scanner;
public class tilingWithTiles
{
    public static int tiling(int n , int []dp)
    {
        if (n<=2)
        {
            return dp[n]=n;
        }
        if(dp[n]!=0)
        {
            return dp[n];
        }
        int nm1=tiling(n-1,dp);
        int nm2=tiling(n-2,dp);
        return dp[n]=(nm1+nm2);
    }

    public static int tilingT(int N , int []dp)
    {
        for(int n=0;n<dp.length;n++)
        {
            if (n<=2)
            {
                dp[n]=n;
                continue;
            }
            int nm1=dp[n-1];
            int nm2=dp[n-2];
            dp[n]=(nm1+nm2);
        }
        return dp[N];
       
    }
    public static void main (String []args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []dp=new int [n+1];
        int ans = tiling(n,dp);
        int anss = tilingT(n,dp);
        System.out.println(anss);
    }
}