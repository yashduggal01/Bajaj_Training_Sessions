class Move_Zeros {
    public void moveZeroes(int[] nums) {
        int idx = 0 ;
    //     int[] arr = new int[nums.length];
    //     for(int i = 0 ; i<nums.length;i++){
    //         if(nums[i]!=0){
    //             arr[idx++]=nums[i];
    //         }
    //     }
    //     while(idx<nums.length){
    //         arr[idx++]=0;
    //     }
    //   for(int i = 0;i<nums.length;i++){
    //     nums[i]=arr[i];
    //   }
    for(int i = 0 ; i<nums.length;i++){
        if(nums[i]!=0){
            nums[idx++]=nums[i];
        }
    }
    while(idx<nums.length){
        nums[idx++]=0;
    }

    }
}