package com.zyw.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Package: com.zyw.array <br>
 * @description: 四数之和
 * @ClassName: T18 <br>
 * @Author: zyw <br>
 * @CreateDate: 2021/5/19 16:28 <br>
 */
public class T18 {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        //排序
//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length; i++) {
//
//        }
//        return null;
        List<List<Integer>> quadruplets = new ArrayList<List<Integer>>();
        if (nums == null || nums.length < 4) {
            return quadruplets;
        }
        int len = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < len - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            if (nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target) {
                break;
            }
            if (nums[i] + nums[len - 3] + nums[len - 2] + nums[len -1] < target) {
                continue;
            }
            for (int j = i + 1; j < len - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                if (nums[i] + nums[j] + nums[j + 1] + nums[j + 2] > target) {
                    break;
                }
                if (nums[i] + nums[j] + nums[len - 2] + nums[len - 1] < target) {
                    continue;
                }
                int r = len - 1;
                int l = j + 1;
                int sum = 0;
                while (l < r) {
                    sum = nums[i] + nums[j] + nums[l] + nums[r];
                    if (sum == target) {
                        quadruplets.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));
                        while (l < r && nums[l] == nums[l + 1]) {
                            l++;
                        }
                        l++;
                        while (l < r && nums[r] == nums[r - 1]) {
                            r--;
                        }
                        r--;
                    }
                    else if (sum < target) {
                        l++;
                    }
                    else {
                        r--;
                    }
                }

            }
        }
        return quadruplets;
    }
}
