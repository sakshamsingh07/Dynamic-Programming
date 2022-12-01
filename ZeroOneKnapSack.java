import java.util.Scanner; 
public class ZeroOneKnapSack
{
    public static int zeroOneknapSack(int cap , int []wt ,int []val ,int [][]dp)
    {
        int n =dp.length;
        int m =dp[0].length;
        for(int i =0 ;i<n;i++)
        {
            for(int j=0 ; j<m; j++)
            {
                if(j==0)
                {
                    dp[i][j]=0;
                }
                if(i==0)
                {
                    dp[i][j]=0;
                }
                else
                {
                    int noCall = dp[i-1][j];
                    int yesCall = -1;
                    if(j-wt[i-1]>=0)
                    {
                        yesCall = dp[i-1][j-wt[i-1]] + val[i-1];
                    }
                    int ans =Math.max(yesCall,noCall);
                    dp[i][j]=ans;

                }

            }
        }
        return dp[n-1][m-1];
    }

    public static void main(String []args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []value= new int[n];
        for(int i =0;i<n;i++)
        {
            value[i]=scn.nextInt();
        }
        int []wt= new int[n];
        for(int i =0;i<n;i++)
        {
            wt[i]=scn.nextInt();
        }
        int cap =scn.nextInt();
        int [][]dp =new int [n+1][cap+1];
        int answer = zeroOneknapSack( cap , wt , value , dp);
        System.out.println(answer);
    }
}