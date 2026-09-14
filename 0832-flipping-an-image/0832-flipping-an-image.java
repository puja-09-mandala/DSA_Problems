class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
                int n=image.length;
        int ans[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
               int k=0;
            for(int j=n-1;j>=0;j--)
            {
               if(image[i][j]==0)
               {
                ans[i][k]=1;
               }
               else
               {
                ans[i][k]=0;
               }
               k++;
            }
        }
        return ans;
    }
}