class Solution {
    public int missingInteger(int[] nums) {
        ArrayList<Integer> prefix = new ArrayList<>();
        prefix.add(nums[0]);
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i - 1] + 1) {
                prefix.add(nums[i]);
            } else {
                break;
            }
        }
        int sum = 0;
        for(int num : prefix) {
            sum += num;
        }
        HashSet<Integer> array = new HashSet<>();
        for(int num : nums) {
            array.add(num);
        }
        while(array.contains(sum)) {
            sum++;
        }
        return sum;
    }
}