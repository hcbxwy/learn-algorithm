/*
 * <ul>
 * <li>项目名称：learn-algorithm</li>
 * <li>文件名称：SelectionSort.java</li>
 * <li>日期：2022/3/9 9:14</li>
 * <li>Copyright ©2016-2022 广州职赢未来信息科技有限公司 All Rights Reserved.</li>
 * </ul>
 */
package com.hcbxwy.algorithm;

/**
 * selection sort
 *
 * @author Billson
 * @date 2022/3/9 9:14
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 1, 8, 9, 3, 6, 7};
        sort(arr);
        AlgorithmUtil.print(arr);
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                minPos = arr[j] < arr[minPos] ? j : minPos;
            }
            AlgorithmUtil.swap(arr, i, minPos);
        }
    }

}
