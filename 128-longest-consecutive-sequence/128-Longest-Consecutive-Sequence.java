class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int longest = 0;
        for (int n : set) { //check if it is start of a sequence ; there should be no left
            if (!set.contains(n - 1)) {
                int length = 0;
                while (set.contains(n + length)) {
                    length += 1;
                }
                longest = Math.max(longest, length);
            }

        }
        return longest;
    }
}