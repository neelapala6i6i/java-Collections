class Solution {
    public int compress(char[] c) {
        int read=0;
        int write=0;
      
        while(read<c.length)
        {
            char currentRead=c[read];
              int count=0;

            while(read<c.length && c[read]==currentRead)
            {
                read++;
                count++;
            }
            c[write++]=currentRead;
            if(count>1)
            {
                for(char c1:String.valueOf(count).toCharArray())
                {
                        c[write++]=c1;

                }
            
            }
           
        }
       return write;
        
    }
}