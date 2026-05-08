import java.util.*;
class MajorityElement {
        public int majorityElement(int[] nums) {
                int cnt = 0, el = -1;
                for (int i = 0; i < nums.length; i++) {
                        if (cnt == 0) {
                                el = nums[i];
                        }
                        if (nums[i] == el) {
                                cnt++;
                        } else {
                                cnt--;
                        }
                }
                if (cnt == 0) {
                        return -1;
                }
                int count = 0;
                for (int i = 0; i < nums.length; i++) {
                        if (nums[i] == el) {
                                count++;
                        }
                }
                return count > nums.length / 2 ? el : -1;
        }
}
