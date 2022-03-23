/*
 * <ul>
 * <li>项目名称：learn-algorithm</li>
 * <li>文件名称：BubbleSort.java</li>
 * <li>日期：2022/3/23 9:22</li>
 * <li>Copyright ©2016-2022 广州职赢未来信息科技有限公司 All Rights Reserved.</li>
 * </ul>
 */
package com.hcbxwy.algorithm;

/**
 * 冒泡排序
 * 原理：两两比较，大的放后面
 * 稳定性：因为只存在相邻两个位置交换，所以稳定
 * 时间复杂度：O(n²)，最好最坏情况都是O(n²)
 * 空间复杂度：O(1)
 * 改进思想：
 *  1. 处理数组整体已经有序的情况：标记是否发生过交换，若没有则表示数组整体有序，时间复杂度降到O(n)
 *  2. 处理数组局部有序的情况：记录最后一次发生交换的位置，该位置后面的元素就是整体有序
 *  3. 同时将最大值和最小值归位，也叫双向冒泡
 *
 * @author Billson
 * @date 2022/3/23 9:22
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 1, 8, 9, 3, 6, 7};
        sort(arr);
        AlgorithmUtil.print(arr);
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    AlgorithmUtil.swap(arr, j, j+1);
                }
            }
        }
    }
}
