class Solution {
    public int search(int[] nums, int target) {
        int l = 0, h = nums.length-1, mid;
        while(l <= h){
            mid = l+(h-l)/2;
            if(target == nums[mid]){
                return mid;
            }else if(target >= nums[0] && nums[mid] >= nums[0] || nums[mid] < nums[0] && target < nums[0]){
                if(target < nums[mid])
                    h = mid-1;
                else
                    l = mid+1;
            }else{
                if(target < nums[mid]){
                    l = mid+1;
                }else{
                    h = mid-1;
                }
            }
        }
        return -1;
    }
}
