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
 * 选择排序
 * 原理：每次从指定数组里找出最小/大值，然后放到最前/后
 * 稳定性：由于存在位置跨越交换，所以不稳定
 * 时间复杂度：O(n²)，最好最坏情况都是O(n²)
 * 空间复杂度：O(1)
 * 优化方案：每次循环找出最小值和最大值
 * 使用场景：因为排序效率低且不稳定，所以工作中基本不用，只用于学术研究
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
