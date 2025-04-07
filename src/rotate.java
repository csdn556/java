/**
 * 给定一个整数数组 nums，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。 **/
import java.util.ArrayList;
import java.util.Arrays;

public class rotate {

/**    public int[] rotate(int[] nums, int k) {
        int m;
        for (int i = 0; i < k; i++) {
            m=nums[nums.length-1];
            for (int j = 0; j < nums.length; j++) {

                if(nums.length-j-1==0){
                    nums[0]=m;
                }else {
                    nums[nums.length - j - 1] = nums[nums.length - j - 2];

                }
            }
        }
        return nums;
    }
 *
 * 个人思路，时间复杂度O(n*k)     当K过大不适用     */

/**三次翻转
先整体翻转，之后0-k-1 k-n-1再分别翻转即可，考研408真题**/
void reverse(int[] nums,int l,int r){
    while(l<r){
        int t = nums[l];
        nums[l++] = nums[r];
        nums[r--] = t;
    }
}
    void rotate(int[] nums,  int k) {
        k = k%nums.length;//注意防止k过大
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    public static void main(String[] args){

        int[] nums = {1,2,3,4,5,6,7,8,9};
        rotate rot=new rotate();
        rot.rotate(nums,3);
        System.out.println(Arrays.toString(nums));
    }
}
