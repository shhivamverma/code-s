class pattern6
{                                                                         //      1
    public static void main(String args[])                                //     2 2
    {                                                                     //    3 3 3
        int n=5;                                                          //   4 4 4 4
        for(int i=1;i<=n;i++)                                             //  5 5 5 5 5
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

    
