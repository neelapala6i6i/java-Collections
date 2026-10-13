class Solution {
    public int[] getConcatenation(int[] a) {
        int n=a.length;
        int[] b=new int[2*n];
        for(int i=0;i<n;i++)
        {
            b[i]=a[i];
        }
        for(int i=n;i<2*n;i++)
        {
            b[i]=b[i-n];
        }
        return b;
    }
}