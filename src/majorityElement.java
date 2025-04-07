class Solution {
    public int majorityElement(int[] nums) {
        int m = 0;
        int count = 0;

        for (int n : nums) {
            if (count == 0) {
                m = n;
                count += 1;
            } else if (m == n) {
                count += 1;
            } else {
                count -= 1;
            }
        }

        return m;
    }
}