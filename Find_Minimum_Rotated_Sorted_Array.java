class Find_Minimum_Rotated_Sorted_Array {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            // If mid element is greater than right, minimum is on the right
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                // Minimum is on the left (including mid)
                right = mid;
            }
        }
        
        return nums[left];
    }
}
