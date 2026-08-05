class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int small = nums[0];
        int large = nums[0];
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < small){
                small = nums[i];
            }
            if(nums[i] > large){
                large = nums[i];
            }
        }
        HashSet<Integer> set = new HashSet<>();
        List<Integer> ans = new ArrayList<>();
        for(int num : nums) {
            set.add(num);
        }
        for(int j = small; j <= large; j++) {
            if(!set.contains(j)) {
                ans.add(j);
            }
        }
        return ans;
    }
}