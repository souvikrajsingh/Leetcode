class Solution {
    public boolean isPalindrome(String s) {
      String newString = "";
        s = s.toLowerCase();
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                newString += ch;
            }
        }
        int left = 0;
        int right = newString.length() - 1;
        while (left <= right) {
            if (newString.charAt(left) != newString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    }
    
