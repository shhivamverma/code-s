class pattern6
{
    public static void main(String args[])
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n-1;j++)
            {
                System.out.print(" ");
            }
            for(int m=1;m<=i;m++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
    