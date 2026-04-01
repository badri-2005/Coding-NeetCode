class Solution {
    public void toLower(char ch[])
    {
        for(int i = 0 ; i<ch.length;i++)
        {
            if(ch[i]>='A' && ch[i]<='Z')
            {
                ch[i] = (char) (ch[i] + 32);
            }
        }
    }
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length())
        {
            return false;
        }

        char ch1[] = s.toCharArray();
        char ch2[] = t.toCharArray();

        toLower(ch1);
        toLower(ch2);

        int freq[] = new int[26];

        for(int i = 0 ; i<ch1.length;i++)
        {
            freq[ch1[i]-97]++;
        }

        for(int i = 0 ; i< ch2.length;i++)
        {
            freq[ch2[i]-97]--;
        }

        for(int i = 0 ; i<26 ;i++)
        {
            if(freq[i]!=0)
            {
                return false;
            }
        }
        return true;

    }
}
