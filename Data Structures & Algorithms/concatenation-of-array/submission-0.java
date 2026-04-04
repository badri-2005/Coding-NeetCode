class Solution {
    public int[] getConcatenation(int[] nums) {
        int arr[] = new int[nums.length*2];

        int i;
        for(i = 0 ; i < nums.length ; i++)
        {
            arr[i] = nums[i];
        }
        for(int j = 0 ; j < nums.length ; j++)
        {
            arr[i++] = nums[j];
        }
        return arr;

    }
}