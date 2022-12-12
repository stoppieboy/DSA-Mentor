class Solution {
    public int[] searchRange(int[] nums, int target) {
        int res[] = {-1,-1};
        res[0] = search(nums, target, true);
        if(res[0] != -1)
            res[1] = search(nums, target, false);
        return res;
    }
    private int search(int[] nums, int target, boolean findStartIndex) {
        int left = 0, right = nums.length - 1,ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target > nums[mid])
                left = mid + 1;
            else if(target < nums[mid])
                right = mid-1;
            else {
                ans = mid;
                if(findStartIndex)
                    right = mid-1;
                else
                    left = mid+1;
            }
        }
        return ans;
    }
}
