class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> nums = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums1) {
            map.put(num , 1);
        }
        for(int num : nums2) {
            if(map.containsKey(num)) {
                nums.add(num);
                map.remove(num);
            }
        }
        int[] result = new int[nums.size()];
        for(int i = 0; i < nums.size(); i++) {
            result[i] = nums.get(i);
        }
        return result;
    }
}