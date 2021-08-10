package com.company.common;

public class CommonVO {

    /**
     * 两数交换
     * @param nums
     * @param i
     * @param j
     */
    protected static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    /**
     * 打印
     * @param test
     */
    protected static void print(int[] test) {
        for (int i : test) {
            System.out.print(i + " ");
        }
    }
}
