class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
       int m=grid.length;
        int [] row=new int[m];
        int [] col=new int[m];
        
        int mxrow=0;
        int mxcol=0;
        for(int i=0;i<m;i++)
        {
             for(int j=0;j<m;j++)
             {
                 row[i]=Math.max(grid[i][j],row[i]);
                 col[j]=Math.max(grid[i][j],col[j]);
             }
            
        }
        
        int sum=0;  
       for(int i=0;i<m;i++)
        {
             for(int j=0;j<m;j++)
             {
                 sum+=(Math.min(row[i],col[j])-grid[i][j]);
             }
       }
        
        return sum; 
    }
}