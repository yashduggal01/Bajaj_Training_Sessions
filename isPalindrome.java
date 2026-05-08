import java.util.*;
class isPalindrome {
        public boolean isPalindrome(String s) {
                StringBuilder str = new StringBuilder();
                for (char ch : s.toCharArray()) {
                        if (Character.isLetterOrDigit(ch)) {
                                str.append(Character.toLowerCase(ch));
                        }
                }

                String ans = str.toString();
                int i = 0, j = ans.length() - 1;

                while (i < j) {
                        if (ans.charAt(i) != ans.charAt(j)) {
                                return false;
                        }
                        i++;
                        j--;
                }
                return true;
        }
}