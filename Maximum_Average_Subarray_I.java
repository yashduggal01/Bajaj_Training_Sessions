class Maximum_Average_Subarray_I {
    public double findMaxAverage(int[] nums, int k) {
        // Calculate sum of first k elements
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        
        double maxSum = sum;
        
        // Sliding window: remove first element and add next element
        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[i - k] + nums[i];
            maxSum = Math.max(maxSum, sum);
        }
        
        return maxSum / k;
    }
}
