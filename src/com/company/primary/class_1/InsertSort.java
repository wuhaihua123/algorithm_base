package com.company.primary.class_1;

import com.company.common.CommonVO;

/**
 * 插入排序
 * [0-1]有序，[0-2]有序，[0,3]有序 ......
 */
public class InsertSort extends CommonVO {

    public static void main(String[] args) {
        int[] test = getArray();
        insertSort(test);
        print(test);
    }

    /**
     * 插入排序
     * @param arr
     */
    private static void insertSort(int[] arr) {
        if (arr == null || arr.length == 1) {
            return;
        }
        int N = arr.length;
        for (int i = 1; i < N; i++) {
            for (int end = i; end > 0 && arr[end] < arr[end - 1]; end--) {
                swap(arr, end, end - 1);
            }
        }

    }
}
