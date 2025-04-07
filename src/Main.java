public class Main {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // 设置指针  
        int i = m - 1; // nums1 的末尾  
        int j = n - 1; // nums2 的末尾  
        int k = m + n - 1; // 合并后的末尾  

        // 从后向前合并数组  
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // 如果 nums2 还有剩余元素，则复制到 nums1 中  
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }

        // 如果 nums1 还有剩余元素，不需要做任何操作，因为已经在正确的位置  
    }

    public static void main(String[] args) {
        int[] nums1 = new int[6]; // nums1 的初始长度是 m + n  
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        // 填充 nums1 的前 m 个元素  
        nums1[0] = 1;
        nums1[1] = 2;
        nums1[2] = 3;

        // 执行合并  
        merge(nums1, m, nums2, n);

        // 打印合并后的数组  
        System.out.print("合并后的数组是: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}  