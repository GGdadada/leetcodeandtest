package com.zyw.array;

/**
 * @Package: com.zyw.array <br>
 * @description: 盛最多的水：双指针法
 * @ClassName: T11 <br>
 * @Author: zyw <br>
 * @CreateDate: 2021/4/24 17:56 <br>
 */
public class T11 {
    public int maxArea(int[] height) {
        int len = height.length - 1;
        int i = 0;
        int j = len - 1;
        int temp = 0;
        int res = 0;

        //小边收缩
        while (i != j) {
            if (height[i] < height[j]) {
                temp = height[i] * (j - i);
                i++;
            } else {
                temp = height[j] * (j - i);
                j++;
            }
            if (temp > res) {
                res = temp;
            }
        }
        return res;
    }
}
