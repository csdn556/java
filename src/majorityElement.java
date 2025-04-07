public class majorityElement {
    public static int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 1;

        // 1. Find the candidate for majority element  
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                candidate = nums[i];
                count = 1;
            } else if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // Since the problem guarantees a majority element, we don't need to check the candidate  
        return candidate;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 3}; // Example input  
        int result = majorityElement(nums);
        System.out.println("Majority Element: " + result); // Output: 3  
    }
}  