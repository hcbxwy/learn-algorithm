/*
 * <ul>
 * <li>项目名称：learn-algorithm</li>
 * <li>文件名称：SelectionSort.java</li>
 * <li>日期：2022/3/9 9:14</li>
 * <li>Copyright ©2016-2022 广州职赢未来信息科技有限公司 All Rights Reserved.</li>
 * </ul>
 */
package com.hcbxwy.algorithm;

import java.util.Arrays;

/**
 * selection sort
 *
 * @author Billson
 * @date 2022/3/9 9:14
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {8, 5, 3, 7, 10, 6, 1, 2, 9, 4};
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                minPos = arr[j] < arr[minPos] ? j : minPos;
            }
            swap(arr, i, minPos);
            System.out.println("经过第" + (i + 1) + "次排序，minPos=" + minPos + ", arr=" + Arrays.toString(Arrays.stream(arr).toArray()));
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
