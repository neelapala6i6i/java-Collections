class Solution {
    public int numRescueBoats(int[] a, int limit) {
        Arrays.sort(a);
        int l=0;
        int r=a.length-1;
        int c=0;
        while(l<=r)
        {
            
            int x=a[l]+a[r];
            if(x<=limit)
            {
                c++;
                l++;
                r--;
            }
            else
            {
                c++;
                r--;
            }
        }
        return c;
        
    }
}