class Solution {
    public int numIdenticalPairs(int[] a) {
         int n=a.length;
         int c=0;
         for(int i=0;i<n;i++)
         {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    c++;
                }
            }
         }
        return c;
    }
}