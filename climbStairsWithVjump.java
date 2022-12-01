import java .util.Scanner; 
public class climbStairsWithVjump 
{
    // public static int climbM(int []arr, int src , int dest, int []dp)
    // {
    //     if (src==dest)
    //     {
    //         return dp[src]=1;
    //     }
    //     if(dp[src]!=0)
    //     {
    //         return dp[src];
    //     }
    //     int count=0;
    //     for(int jump =1;jump <= arr[src] && jump+src <=dest; jump++)
    //     {
    //         count+=climbM(arr,src+jump,dest,dp);
    //     }
    //     return dp[src]=count;
    // } 

    public static int climbT(int []arr, int SRC , int dest, int []dp)
    {
        for(int src = dp.length-1; src>=0;src--)
        {
            if (src==dest)
            {
                dp[src]=1;
                continue;
            }
           
            int count=0;
            for(int jump =1;jump <= arr[src] && jump+src <=dest; jump++)
            {
                count+=dp[src+jump];
            }
            dp[src]=count;
        }
        return dp[SRC];
       
    }
    public static void main(String []args)
    {
        Scanner scn= new Scanner(System.in);
        int n =scn.nextInt();
        int []arr=new int [n];
        for(int i =0; i<arr.length;i++)
        {
            arr[i]=scn.nextInt();
        }
        int []dp=new int [n+1];
        int ans= climbT(arr,0,n,dp);
        System.out.println(ans);
    }
    
}
