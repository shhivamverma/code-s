class trickyPattern
{
    public static void main(String args[])
    {
        
        int n=5;
        int m=5;
        int matrix[][]=new int[n][m];
        int num=1;
        int rowStart = 0;
        int rowEnd = n-1;
        int colStart = 0;
        int colEnd = m-1;
        while(rowStart <= rowEnd && colStart <= colEnd)
        {
            for(int col=colStart;col<=colEnd;col++)
            {
                matrix[rowStart][col]=num++;
                
            }
            rowStart++;
            for(int row=rowStart;row<=rowEnd;row++)
            {
                matrix[row][colEnd]=num++;
                
            }
            colEnd--;
            for(int col=colEnd;col>=colStart;col--)
            {
                matrix[rowEnd][col]=num++;
                
            }
            rowEnd--;
            for(int row=rowEnd;row>=rowStart;row--)
            {
                matrix[row][colStart]=num++;
                
            }
            colStart++;
            if(colStart==1 && rowStart == 1)
            {
                for(int roww=rowStart;roww<=rowEnd;roww++)
                {
                    matrix[roww][colStart]=num++;
                    
                }
                colStart++;
                for(int coll=colStart;coll<=colEnd;coll++)
                {
                    matrix[rowEnd][coll]=num++;
                    
                }
                rowEnd--;
                for(int rows=rowEnd;rows>=rowStart;rows--)
                {
                    matrix[rows][colEnd]=num++;
                    
                }
                colEnd--;
                for(int cols=colEnd;cols>=colStart;cols--)
                {
                    matrix[rowStart][cols] = num++;
                    
                }
                rowStart++;
                for(int rw=rowStart;rw<=rowEnd;rw++)
                {
                    matrix[rw][colEnd]=num;
                    
                }
            }
            System.out.println();
        }
        for(int j=0;j<m;j++)
        {
            for(int k=0;k<n;k++)
            {
                System.out.print(matrix[j][k]+"    ");
            }
            System.out.println();
        }
    }
}