class Permutation_in_String {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        
        // Frequency array for s1
        int[] s1Count = new int[26];
        int[] windowCount = new int[26];
        
        for (char c : s1.toCharArray()) {
            s1Count[c - 'a']++;
        }
        
        // Sliding window of size s1.length()
        for (int i = 0; i < s2.length(); i++) {
            windowCount[s2.charAt(i) - 'a']++;
            
            // Remove the leftmost character when window size exceeds s1.length()
            if (i >= s1.length()) {
                windowCount[s2.charAt(i - s1.length()) - 'a']--;
            }
            
            // Check if current window matches s1
            if (i >= s1.length() - 1 && matches(s1Count, windowCount)) {
                return true;
            }
        }
        
        return false;
    }
    
    private boolean matches(int[] arr1, int[] arr2) {
        for (int i = 0; i < 26; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
