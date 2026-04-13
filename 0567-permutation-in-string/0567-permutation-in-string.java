class Solution {
    public boolean checkInclusion(String s1, String s2) {

        HashMap<Character, Integer> hp = new HashMap<>();
        HashMap<Character, Integer> hp1 = new HashMap<>();

        // build frequency map of s1
        for (int i = 0; i < s1.length(); i++) {
            hp.put(s1.charAt(i), hp.getOrDefault(s1.charAt(i), 0) + 1);
        }

        int left = 0;

        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            hp1.put(ch, hp1.getOrDefault(ch, 0) + 1);
            while (i - left + 1 > s1.length()) {
                char leftChar = s2.charAt(left);
                hp1.put(leftChar, hp1.get(leftChar) - 1);
                if (hp1.get(leftChar) == 0) {
                    hp1.remove(leftChar);
                }
                left++;
            }
            if (i - left + 1 == s1.length()) {
                if (hp.equals(hp1)) {
                    return true;
                }
            }
        }

        return false;
    }
}