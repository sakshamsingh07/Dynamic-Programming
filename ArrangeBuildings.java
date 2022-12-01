import java.util.Scanner; 
public class ArrangeBuildings
{
    public static int mod=(int) 1e9+7;
    public static long CountString(int n)
    {
        long oldcountS= 1;
        long oldcountB=1;
        for(int i =2 ;i<=n;i++)
        {
            long NcountS=(oldcountS+oldcountB)%mod;
            long NcountB=oldcountB;
            oldcountS= NcountS;
            oldcountB= NcountB;
        }
        return (((oldcountS+oldcountB))%mod);
    }
    public static void main (String []args)
    {
        Scanner scn = new Scanner (System.in);
        int n= scn.nextInt();
        long ans=  CountString(n);
        System.out.println(ans);
        
    }

    
}
