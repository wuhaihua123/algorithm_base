package com.company.primary.class_1;

import com.company.common.CommonVO;

/**
 * 选择排序 [0 - n-1],[1- n-1],[i - n-1] 左侧找寻范围最小值
 */
public class SelectSort extends CommonVO {

    public static void main(String[] args) {
        int[] test = getArray();
        selectSort(test);
        print(test);


    }




    /**
     * 选择排序
     * @param nums
     */
    public static void selectSort(int[] nums) {
        if (nums == null || nums.length == 1) {
            return;
        }
        int N = nums.length;
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (nums[i] > nums[j]) {
                    swap(nums, i, j);
                }
            }
        }

    }


}
