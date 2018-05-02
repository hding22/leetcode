class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s_arr = s.toCharArray();
        char[] t_arr = t.toCharArray();
        Map<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s_arr.length; i++) {
            Character c = s_arr[i];
            if (!hm.containsKey(c)) {
                hm.put(c, 1);
            } else {
                hm.put(c, hm.get(c) + 1);
            }
        }
        for (int i = 0; i < t_arr.length; i++) {
            Character c = t_arr[i];
            if (!hm.containsKey(c)) {
                return false;
            } else {
                hm.put(c, hm.get(c) - 1);
            }
        }
        for (Character c : hm.keySet()) {
            if (hm.get(c) != 0) {
                return false;
            }
        }
        return true;
    }
}
