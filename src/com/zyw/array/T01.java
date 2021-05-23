package com.zyw.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @Package: com.zyw.array <br>
 * @description: 方法描述
 * @ClassName: Test01 <br>
 * @Author: zyw <br>
 * @CreateDate: 2021/4/14 23:40 <br>
 */
public class T01 {

    /**
     * 输入：nums = [2,7,11,15], target = 9
     * 输出：[0,1]
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                res[0] = map.get(i);
                res[1] = map.get(target - nums[i]);
            }
            map.put(nums[i], i);
        }
        return res;
    }


}
