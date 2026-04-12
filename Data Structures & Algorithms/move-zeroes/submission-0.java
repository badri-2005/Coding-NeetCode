class Solution {
    public void moveZeroes(int[] arr) {
        int k = 0;
        int n = arr.length;
        for(int i = 0 ; i < arr.length ; i++ )
        {
            if(arr[i]!=0)
            {
                arr[k++] = arr[i];
            }
        }
        for(int i=k ; i<n ;i++)
        {
            arr[i] = 0;
        }
    }
}