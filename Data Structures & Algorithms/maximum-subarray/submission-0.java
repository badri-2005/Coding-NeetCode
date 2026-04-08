class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int c = 0;
        for(int i = 0 ; i < nums.length ; i++)
        {
            c = c + nums[i];
            
            if(c > max)
            {
                max =  c;
            }
            if(c<0)
            {
                c = 0;
            }
        }
        return max;
    }
}
