class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int nums1[] = new int[2];
         HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++) {
            int j = target - nums[i];
            if(map.containsKey(j)) {
                nums1[0] = map.get(j);
                nums1[1] = i;
                return nums1;
            } else {
                map.put(nums[i],i);
            }

        }
        return nums1;
    }
}