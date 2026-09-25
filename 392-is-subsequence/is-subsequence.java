class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        int n=t.length();
        if(s.length()==0) return true;
        while(j<n&&i<s.length())
        {
            if(s.charAt(i)==t.charAt(j))
            {
                i++;
                j++;
            }
            else
            {
                j++;
            }

        }
  if(i==s.length()) return true;
        return false;
    }
}