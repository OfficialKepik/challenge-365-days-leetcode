package uladzislau.kapusto.leetcode.month1.week1;

import java.util.Arrays;

public class RemoveDuplicatesSortedArray {

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int k = 1;
        int insertIndex = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[insertIndex] = nums[i];
                insertIndex++;
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        RemoveDuplicatesSortedArray rd = new RemoveDuplicatesSortedArray();

        int[] nums1 = {1, 1, 2};
        int k1 = rd.removeDuplicates(nums1);
        System.out.println(k1); // 2
        System.out.println(Arrays.toString(Arrays.copyOf(nums1, k1))); // [1, 2]

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k2 = rd.removeDuplicates(nums2);
        System.out.println(k2); // 5
        System.out.println(Arrays.toString(Arrays.copyOf(nums2, k2))); // [0, 1, 2, 3, 4]
    }
}
