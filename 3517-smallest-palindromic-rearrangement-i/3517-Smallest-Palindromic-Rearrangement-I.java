class Solution {
    public String smallestPalindrome(String s) {
        int freq[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        StringBuilder left = new StringBuilder();
        char middle = '\0';
        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 != 0) {
                middle = ((char) ('a' + i));
            }
            for (int j = 0; j < freq[i] / 2; j++) {
                left.append((char) ('a' + i));
            }
        }
        StringBuilder right = new StringBuilder(left); //right and left are same
        right.reverse();

        if (middle != '\0') {
            left.append(middle);
        }

        left.append(right);

        return left.toString();

    }
}
