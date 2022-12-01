import java.util.Scanner; 
public class goldmine 
{
    public static int gold(int i,int j , int [][]arr,int [][]dp)
    {
        int n = arr.length;
        int m = arr[0].length;
        if(i>=arr.length||i<0||j>=arr[0].length||j<0)
        {
            return  0;
        }
        if(dp[i][j]!=0)
        {
            return dp[i][j];
        }
        int op1 = gold(i-1,j+1,arr,dp);
        int op2 = gold(i,j+1,arr,dp);
        int op3 = gold(i+1,j+1,arr,dp);
        int maxx= Math.max(op1,Math.max(op2,op3));
        dp[i][j]=maxx+arr[i][j];
        return dp[i][j];
    }
    public static void main(String []args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int [][]arr = new int [n][m];
        for(int i=0;i<n;i++)
        {
            for(int j =0 ; j<m;j++)
            {
                arr[i][j]=scn.nextInt();
            }
        }
        int [][]dp=new int [n][m];
        int ans=0;
        for(int i =0 ;i<n;i++)
        {
            int tempAns=gold(i,0,arr,dp);
            if(tempAns>ans)
            {
                ans=tempAns;
            }
        }
        System.out.println(ans);
    }
    
}
