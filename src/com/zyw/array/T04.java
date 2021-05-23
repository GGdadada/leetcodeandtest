package com.zyw.array;

/**
 * @Package: com.zyw.array <br>
 * @description: 方法描述
 * @ClassName: T04 <br>
 * @Author: zyw <br>
 * @CreateDate: 2021/4/19 20:56 <br>
 */
public class T04 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int len = len1 + len2;
        int[] nums = new int[len1 + len2];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < len1 && j < len2) {
            if (nums1[i] < nums2[j]) {
                nums[k] = nums1[i];
                i++;
                k++;
            } else {
                nums[k] = nums2[j];
                j++;
                k++;
            }
        }
        while (i < len1) {
            nums[k] = nums1[i];
            k++;
            i++;
        }
        while (j < len2) {
            nums[k] = nums2[j];
            k++;
            j++;
        }
        double res;
        if (len % 2 == 0) {
            res = (float) (nums[len / 2] + nums[len / 2 - 1]) / 2;
        } else {
            res = nums[len / 2];
        }

        return res;
    }

    public static void main(String[] args) {
        int[] a = {1, 2};
        int[] b = {3, 4};
        System.out.println(findMedianSortedArrays(a, b));
    }
}
