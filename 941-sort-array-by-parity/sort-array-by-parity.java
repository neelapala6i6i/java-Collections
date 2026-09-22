class Solution {
    public int[] sortArrayByParity(int[] a) {
        int l=0;
        int r=a.length-1;
        while(l<r)
        {
            if(a[l]%2==0 &&a[r]%2!=0)
            {
                l++;
                r--;
            }
            else if(a[l]%2!=0 && a[r]%2==0)
            {
                int t=a[l];
                a[l]=a[r];
                a[r]=t;
                l++;
                r--;
            }
            else if(a[l]%2==0 && a[r]%2==0)
            {
                l++;
            }
            else
            {
                r--;
            }
        }
        return a;
        
    }
}