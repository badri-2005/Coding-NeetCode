class Solution {
    public boolean isPalindrome(String s) {
        String res ="";
        for(int i = 0 ; i<s.length() ; i++)
        {
            char ch = s.charAt(i);
            if(ch>='a' && ch<='z' || ch>='A' && ch<='Z' || ch>='0' && ch<='9')
            {
                res = res + ch;
            }
        }
        char ch[] = res.toCharArray();

        for(int i = 0 ; i < ch.length ; i++)
        {
            if(ch[i]>='A' && ch[i]<='Z')
            {
                ch[i] = (char) (ch[i] + 32);
            }
        }

        int i = 0;
        int j = ch.length-1;
        while(i<j)
        {
            if(ch[i]!=ch[j])
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
