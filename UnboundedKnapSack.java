import java.util.Scanner;
public class UnboundedKnapSack
{
    public static int uks(int cap ,int []wt,int []val, int[]dp)
    {
        dp[0]=0;
        int max =0;
        for(int bag=1; bag<dp.length; bag++)
        {
            
            for(int i=0;i<wt.length;i++)
            {
                if(wt[i]<=bag)
                {
                    int remaining=bag-wt[i];
                    int remOptimalval=dp[remaining];
                    int myOptimal=val[i]+remOptimalval;
                    if (myOptimal>max)
                    {
                        max=myOptimal;
                    }
                }
            }
            dp[bag]=max;
        }
        return dp[cap];
      
    }
    public static void main(String[]args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []val=new int [n];
        for(int i =0 ; i<n;i++)
        {
            val[i]=scn.nextInt();
        }
        int []wt=new int [n];
        for(int i =0 ; i<n;i++)
        {
            wt[i]=scn.nextInt();
        }
        int cap =scn.nextInt();
        int []dp = new int[cap+1];
        int ans =uks(cap ,wt,val, dp);
        System.out.println(ans);
    }
}
