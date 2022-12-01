import java.util.Scanner; 
public class paintFence
{
    public static long pf(int n ,int k , long [][]dp)
    {
        for(int i =2 ; i<=n;i++)
        {
            if(i==2)
            {
                dp[0][i]=k;
                dp[1][i]=k*(k-1);
                continue;
            }
            dp[0][i]=dp[1][i-1];
            dp[1][i]=(k-1)*(dp[0][i-1]+dp[1][i-1]);
        }
        return dp[0][n]+dp[1][n];
    }

    public static int pff(int n ,int k)
    {
        int xx=k;
        int xy=k*(k-1);
        for(int i=3;i<=n;i++)
        {
            int newXX=xy;
            int newXY=(k-1)*(xx+xy);
            xx=newXX;
            xy=newXY;
        }
        return (xx+xy);
    }
    public static void main(String []args)
    {
        Scanner scn= new Scanner (System.in);
        int n = scn .nextInt();
        int k = scn.nextInt();
        long [][]dp= new long[2][n+1];
        long ans = pf (n,k,dp);
        int anss= pff(n,k);
        System.out.println(ans);
        System.out.print(anss);
    }
}