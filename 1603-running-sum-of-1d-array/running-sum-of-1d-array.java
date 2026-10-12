class Solution {
    public int[] runningSum(int[] a) {
        int j=0,sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];
            a[j++]=sum;
        }
       return a; 
    }
}