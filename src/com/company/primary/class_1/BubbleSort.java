package com.company.primary.class_1;

import com.company.common.CommonVO;

/**
 * 冒泡排序  [0 - N-1] [0 - N-2] ...  两两比较，将最大值传递到右边
 */
public class BubbleSort extends CommonVO {

    public static void main(String[] args) {
        int[] test = getArray();
        bubbleSort(test);
        print(test);


    }

    /**
     * 冒泡排序
     *
     * @param arr
     */
    private static void bubbleSort(int[] arr) {
        if (arr == null || arr.length == 1) {
            return;
        }
        int N = arr.length;
        for (int i = N - 1; i > 0; i--) {
            for (int end = 1; end <= i; end++) {
                if (arr[end] < arr[end - 1]) {
                    swap(arr, end, end - 1);
                }
            }
        }

    }
}
