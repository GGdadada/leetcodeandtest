package com.zyw.array;

import java.util.Arrays;

/**
 * @Package: com.zyw.array <br>
 * @description: 最接近的三数之和
 * @ClassName: T16 <br>
 * @Author: zyw <br>
 * @CreateDate: 2021/4/30 20:04 <br>
 */
public class T16 {

    //1、
    private static int threeSumClosest(int[] nums, int target) {
        int len = nums.length;
        int sum = 0;
        int res = 0;
        int temp = 0;
        int result = 0;

        for (int k = 0; k < len; k++) {
            int i = k + 1;

            while (i < len) {
                int j = len - 1;
                while (i < j) {
                    //求和
                    sum = nums[k] + nums[i] + nums[j];
                    //求差值
                    if (target > sum) {
                        res = target - sum;
                    } else {
                        res = sum - target;
                    }
                    //保存第一个差值
                    if (i == 1 && j == len - 1) {
                        temp = res;
                    }
                    if (res <= temp) {
                        temp = res;
                        result = sum;
                    }
                    j--;
                }
                i++;
            }
        }

        return result;
    }

    //2、先排序
    private static int threeSumClosest1(int[] nums, int target) {
        Arrays.sort(nums);
        int sum = 0;
        int res = nums[0] + nums[1] + nums[2];

        for (int k = 0; k < nums.length; k++) {
            int i = k + 1;
            int j = nums.length - 1;

            while (i < j) {
                sum = nums[k] + nums[i] + nums[j];
                //Math.abs()去绝对值
                if (Math.abs(sum - target) < Math.abs(res - target)) {
                    res = sum;
                }
                if (sum < target) {
                    i++;
                }
                if (sum > target) {
                    j--;
                }
                if (sum == target) {
                    return sum;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2};
        int target = 3;

        int i = threeSumClosest1(nums, target);
        System.out.println(i);
    }
}
