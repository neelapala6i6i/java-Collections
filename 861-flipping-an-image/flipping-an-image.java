class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++)
        {
            int l=0;
            int r=image.length-1;
            while(l<=r)
            {
                int t=image[i][l];
                image[i][l]=1-image[i][r];
                image[i][r]=1-t;
                l++;
                r--;
            }
        }
        return image;
        
    }
}