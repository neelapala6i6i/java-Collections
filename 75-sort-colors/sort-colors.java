class Solution {
    public void sortColors(int[] a) {
          int c0=0,c1=0,c2=0;
      for(int n:a)
      {
      if(n==0)
       {
           c0++;
       }
       else if(n==1)
       {
           c1++;
       }
       else
       {
           c2++;
       }
      
   }
   int l=0;
   
   
   while(c0>0)
   {
       a[l++]=0;
       c0--;
   }
   while(c1>0)
   {
       a[l++]=1;
       c1--;
   }
   while(c2>0)
   {
       a[l++]=2;
       c2--;
   }
        
    }
}