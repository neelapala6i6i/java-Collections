class Solution {
    public int[] smallerNumbersThanCurrent(int[] a) {
    
        int n=a.length;
            int[] b=new int[n];
            int s=0;
           for(int i=0;i<n;i++)
           {
            int c=0;
            for(int j=0;j<n;j++)
            {
                if(j!=i && a[j]<a[i])
                {
                    c++;
                }
            }
            b[s++]=c;
           }
           return b;
    }
}