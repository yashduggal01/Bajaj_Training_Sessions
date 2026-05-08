import java.util.*;
class find_Anagrams {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int left = 0, right = p.length();
        if(p.length() > s.length()) {
            return list;
        }
        int[] freqS = new int[26];
        int[] freqP = new int[26];
        for(char c : p.toCharArray()) {
            freqP[c-'a']++;
        }
        for(int i = left; i < right; i++) {
            freqS[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(freqP, freqS)) {
            list.add(left);
        }
        while(right < s.length()) {
            freqS[s.charAt(left)-'a']--;
            left++;
            freqS[s.charAt(right)-'a']++;
            right++;
            if(Arrays.equals(freqS, freqP)) {
                list.add(left);
            }
        }
        return list;
    }
}