public class Solution {
    public boolean checkValidString(String s) {
        int Min = 0;
        int Max = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                Min++;
                Max++;
            } else if (c == ')') {
                Min--;
                Max--;
            } else {
                Min--;
                Max++;
            }
            if (Max < 0) return false;
            if (Min < 0) Min = 0;

        }
        
        return Min == 0;
    }
}