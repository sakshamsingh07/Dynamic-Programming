import java .util.Scanner; 
public class climbStairs 
{
    // public static int climbStairss(int n ,int []dp)
    // {
        // if(n==0)
        // {
        //     return dp[n]=1;
        // }
        // if (dp[n]!=0)
        // {
        //     return dp[n];
        // }
        // int count =0;
        // if (n-1>=0)
        // {
        //    count+= climbStairss(n-1 ,dp);
        // }    
        // if (n-2>=0)
        // {
        //    count+= climbStairss(n-2 ,dp);
        // }
        // if (n-3>=0)
        // {
        //    count+= climbStairss(n-3 ,dp);
        // }  
        // return dp[n]=count;  


        public static int climbStairssT(int N ,int []dp)
        {
            for(int n =0 ; n<dp.length;n++ )
            {
                if(n==0)
                {
                     dp[n]=1;
                     continue;
                }
                int count =0;
                if (n-1>=0)
                {
                   count+= dp[n-1];
                }    
                if (n-2>=0)
                {
                   count+= dp[n-2];
                }
                if (n-3>=0)
                {
                   count+= dp[n-3];
                }  
                 dp[n]=count;  
            }
            return dp[N];
    
        }
    public static void main (String []args)
    {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int []dp = new int [n+1];
        // for (int i =0 ;i<dp.length;i++)
        // {
        //     dp[i]=-1;
        // } 
        int ans =climbStairssT(n,dp);
        System.out.println(ans);

    }
    
}
