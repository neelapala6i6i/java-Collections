class Solution {
    public int[] searchRange(int[] a, int x) {
        int n=a.length;
        int l=0;
        int h=n-1;
        int first=-1;
        while(l<=h)
        {
          int m=l+(h-l)/2;
        if(a[m]==x)
        {
        first=m;
        h=m-1;
        }
        else if(a[m]>x)
        {
        h=m-1;
        }
        else
        {
        l=m+1;
        }
        }

        l=0;
        h=n-1;
        int last=-1;
        while(l<=h)
        {
          int m=l+(h-l)/2;
        if(a[m]==x)
        {
        last=m;
        l=m+1;
        }
        else if(a[m]>x)
        {
        h=m-1;
        }
        else
        {
        l=m+1;
        }
        }

        return new int[]{first,last};
    }
}