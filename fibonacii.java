import java .util.Scanner; 
public class fibonacii 
{
    // public static int fiboR(int n)
    // {
    //     if(n<=1)
    //     {
    //         return n ;
    //     }
    //     int nm1 = fiboR(n-1);
    //     int nm2 = fiboR(n-2);
    //     return(nm1+nm2);
    // }
    // public static void main (String []args)
    // {
    //     Scanner scn =new Scanner(System.in);
    //     int n = scn.nextInt();
    //     int ans = fiboR(n);
    //     System.out.println(ans);
    // }


    // public static int fiboM(int n, int []dp)
    // {
    //     if(n<=1)
    //     {
    //         return dp[n]= n ;
    //     }
    //     if(dp[n] != -1)
    //     {
    //         return dp[n];
    //     }
    //     int nm1 = fiboM(n-1,dp);
    //     int nm2 = fiboM(n-2,dp);
    //     return dp[n]=(nm1+nm2);
    // }
    // public static void main (String []args)
    // {
    //     Scanner scn =new Scanner(System.in);
    //     int n = scn.nextInt();
    //     int []dp =new int [n+1];
    //     for(int i =0 ; i<dp.length;i++)
    //     {
    //         dp[i]=-1;
    //     }
    //     int ans = fiboM(n,dp);
    //     System.out.println(ans);
    // }


    public static int fiboT(int N, int []dp)
    {
        for(int n=0; n<dp.length; n++)
        {
            if(n<=1)
            {
                 dp[n]= n ;
                 continue;
            }
            int nm1 = dp[n-1];//fiboM(n-1,dp);
            int nm2 = dp[n-2];//fiboM(n-2,dp);
            dp[n]=(nm1+nm2);

        }
        return dp[N];
       
    }
    public static void main (String []args)
    {
        Scanner scn =new Scanner(System.in);
        int n = scn.nextInt();
        int []dp =new int [n+1];
        for(int i =0 ; i<dp.length;i++)
        {
            dp[i]=-1;
        }
        int ans = fiboT(n,dp);
        System.out.println(ans);
    }
    
    
}
