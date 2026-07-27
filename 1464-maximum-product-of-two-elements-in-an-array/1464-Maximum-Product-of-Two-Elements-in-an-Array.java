class Solution {
    public int maxProduct(int[] nums) {
        int largest = nums[0];
        int secondlargest = nums[1]; 
        if(secondlargest > largest) {
            int temp = secondlargest;
            secondlargest = largest;
            largest = temp;
        }
        for(int i = 2; i < nums.length; i++) {
            if(nums[i] > largest){
                secondlargest = largest;
                largest = nums[i];
            } else if(nums[i] > secondlargest && nums[i] <= largest) {
                secondlargest = nums[i];
            }
        }
        return (largest - 1) * (secondlargest - 1);
    }
}