public class pattern7 extends qwertyuiop
{
    public static void main()
    {        
        for(int i=1;i<=7;i++)
        {
            for(int j=1;j<=i;j++)
            System.out.print(j);
            for(int j=i-1;j>=1;j--)
            System.out.print(j);
            System.out.println();
            
        }
        
    }
}