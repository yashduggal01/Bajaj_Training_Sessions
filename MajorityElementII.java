import java.util.*;
class MajorityElementII {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int cnt1 = 0, cnt2 = 0, ele1 = -1, ele2 = -1;
        for(int i = 0 ; i < nums.length; i++) {
            if(cnt1 == 0 && ele2 != nums[i]) {
                cnt1 = 1; ele1 = nums[i];
            } else if(cnt2 == 0 && ele1 != nums[i]) {
                cnt2 = 1; ele2 = nums[i];
            } else if(ele1 == nums[i]) {
                cnt1++;
            } else if(ele2 == nums[i]) {
                cnt2++;
            } else {
                cnt1--; cnt2--;
            }
        }
        int times = nums.length/3;
        cnt1 = 0; cnt2 = 0; 
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == ele1) cnt1++;
            else if(nums[i] == ele2) cnt2++;
        }
        if(cnt1 > times) list.add(ele1);
        if(cnt2 > times) list.add(ele2);
        return list;
    }
}
