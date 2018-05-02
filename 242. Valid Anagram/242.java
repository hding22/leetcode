class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s_arr = s.toCharArray();
        char[] t_arr = t.toCharArray();
        for (char c = 'a'; c <= 'z'; c++) {
            // s 里面含有几个这种字母
            int sa = 0;
            for (int j = 0; j < s_arr.length; j++) {
                if (s_arr[j] == c) {
                    sa++;
                }
            }
            // t 里面含有几个这种字母
            int ta = 0;
            for (int j = 0; j < t_arr.length; j++) {
                if (t_arr[j] == c) {
                    ta++;
                }
            }
            if (sa != ta) {
                return false;
            }
        }
        return true;
    }
}
