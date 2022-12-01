import java.util.Scanner; 
public class CoinChangeCombination
{
    public static int ccc(int []coin ,int tar ,int []dp)
    {
        dp[0]=1;
        for(int i =0;i<coin.length;i++)
        {
            for(int j =0;j<dp.length;j++)
            {
                if(j-coin[i]>=0)
                {
                    dp[j] += dp[j-coin[i]];
                }               
            }
        }
        return dp[tar];
    }
    public static void main(String []args)
    {
        Scanner scn=new Scanner(System.in);
        int n =scn.nextInt();
        int []coin = new int [n];
        for(int i =0 ;i<n;i++)     
        {
            coin[i]=scn.nextInt();
        }
        int tar =scn.nextInt();
        int []dp= new int [tar+1];
        int ans = ccc(coin,tar,dp);
        System.out.println(ans);
    }
}
