class Solution {
    public void reverseString(char[] ch) {
        int i = 0;
        int j = ch.length -1;
        while(i<j)
        {
            char t = ch[i];
            ch[i] = ch[j];
            ch[j] = t;
            i++;
            j--;
        }
    }
}