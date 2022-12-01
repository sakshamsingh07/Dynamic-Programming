import java .util.Scanner; 
public class maximumSumNonAdjacentElement 
{
    public static int nonadj(int []arr)
    {
        int n = arr.length;
        int inc = arr[0];
        int exc = 0;
        for(int i =1 ;i<n;i++)
        {
            int newInc = exc+arr[i];
            int newExc = Math.max(inc,exc);
            inc=newInc;
            exc=newExc;
        }
        int ans = Math.max(inc,exc);
        return ans;
    }
    public static void main(String []args)
    {
        Scanner scn= new Scanner (System.in);
        int n =scn.nextInt();
        int []arr = new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        int answer= nonadj(arr);
        System.out.println(answer);
    }
    
}
