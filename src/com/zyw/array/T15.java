package com.zyw.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @Package: com.zyw.array <br>
 * @description: 三数之和
 * @ClassName: T15 <br>
 * @Author: zyw <br>
 * @CreateDate: 2021/4/26 21:21 <br>
 */
public class T15 {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        if (len < 3) {
            return res;
        }
        int temp = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[i] > nums[j]) {
                    temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        for (int k = 0; k < len - 2; k++) {
            if (k != 0 && nums[k] == nums[k - 1]) {
                continue;
            }
            if (nums[k] > 0) {
                break;
            }
            int i = k + 1;
            int j = len - 1;
            while (i < j) {
                List<Integer> arr = new ArrayList<>();
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    arr.add(nums[i]);
                    arr.add(nums[j]);
                    arr.add(nums[k]);
                    res.add(arr);
                    while (i < j && nums[i] == nums[i + 1]) {
                        i++;
                    }
                    while (i < j && nums[j] == nums[j - 1]) {
                        j--;
                    }
                    i++;
                    j--;
                } else if (sum < 0) {
                    i++;
                } else {
                    j--;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> lists = threeSum(arr);
        System.out.println(lists);
    }
}
