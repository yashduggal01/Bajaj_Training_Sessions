import java.util.*;
class Koko_Eating_Banana {
        public int minEatingSpeed(int[] piles, int h) {
                int maxi = Integer.MIN_VALUE;
                for (int i : piles) {
                        maxi = Math.max(i, maxi);
                }
                int low = 1;
                int ans = Integer.MAX_VALUE;
                while (low <= maxi) {
                        int mid = low + (maxi - low) / 2;
                        long total = check(piles, mid);
                        if (total <= h) {
                                ans = mid;
                                maxi = mid - 1;
                        } else {
                                low = mid + 1;
                        }
                }
                return ans;
        }

        private long check(int[] piles, int hourly) {
                long sum = 0;
                for (int i : piles) {
                        if (i % hourly != 0) {
                                sum += (i + hourly - 1) / hourly;
                        } else {
                                sum += i / hourly;
                        }
                }
                return sum;
        }
}