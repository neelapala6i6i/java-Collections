class Solution {
    public int[] shortestToChar(String s, char c) {
        int n=s.length();
      int a[]=new int[n];
      int d=n;
      for(int i=0;i<n;i++)
      {
        if(s.charAt(i)==c)
        {
            d=0;

        }
        else
        {
            d++;
        }
        a[i]=d;
      }
      d=n;
      for(int i=n-1;i>=0;i--)
      {
        if(s.charAt(i)==c)
        {
            d=0;
        }
        else
        {
            d++;
        }
        a[i]=Math.min(a[i],d);
      }
      return a;
    }
}