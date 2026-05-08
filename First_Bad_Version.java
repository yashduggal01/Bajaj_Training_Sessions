// The isBadVersion API is defined in the parent class VersionControl.
// boolean isBadVersion(int version);

class First_Bad_Version {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (isBadVersion(mid)) {
                // mid could be the first bad version, search left including mid
                right = mid;
            } else {
                // mid is good, search right
                left = mid + 1;
            }
        }
        
        return left;
    }
    
    // Mock method for testing
    private boolean isBadVersion(int version) {
        // This would be provided by the parent class
        return version >= 4;  // Example: versions 4 and onwards are bad
    }
}
