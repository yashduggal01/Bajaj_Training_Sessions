class SqrtX {
        public int mySqrt(int x) {
                if (x <= 1)
                        return x;
                int s = 0, e = x;
                while (s <= e) {
                        int mid = s + (e - s) / 2;
                        if (mid == x / mid) {
                                return mid;
                        } else if (mid < x / mid) {
                                s = mid + 1;
                        } else {
                                e = mid - 1;
                        }
                }
                return e;
        }
}

