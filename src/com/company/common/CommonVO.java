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

    protected static int[] getArray() {
        int[] test = {5, 56, 8, 4, 7, 67, 345, 4, 1, 2, 5, 3, 6};
        return test;
    }
}
