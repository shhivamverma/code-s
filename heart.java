import java.util.*;
class heart
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n/2;i<n;i+=2)
        {
         for(int j=1;j<n-i;j+=2)
        {
            System.out.print(" ");
        }
        for(int m=1;m<=i;m++)
        {
            System.out.print("*");
        }
        for(int k=1;k<=n-i;k++)
        {
            System.out.print(" ");
        }
        for(int v=1;v<=i;v++)
        {
            System.out.print("*");
        }
    System.out.println();
    }
    for(int y=n;y>0;y--)
    {
        for(int b=n;b>y;b--)
        {
            System.out.print(" ");
        }
        for(int c=y*2;c>1;c--)
        {
        System.out.print("*");
        }
        System.out.println();
    }
}
}