class Solution {
    public void sortColors(int[] nums) {
        // if(nums.length == 1)
            // return;
        int h = nums.length-1,mid = 0,l = 0;
        while(mid <= h){
            if(nums[mid] == 0){
                int temp = nums[mid];
                nums[mid] = nums[l];
                nums[l] = temp;
                l++;
                mid++;
            }else if(nums[mid] == 1){
                mid++;
            }else{
                int temp = nums[mid];
                nums[mid] = nums[h];
                nums[h] = temp;
                h--;
            }
        }
    }
}