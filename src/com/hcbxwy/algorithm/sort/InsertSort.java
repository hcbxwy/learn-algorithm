/*
 * <ul>
 * <li>项目名称：learn-algorithm</li>
 * <li>文件名称：InsertSort.java</li>
 * <li>日期：2022/9/29 9:28</li>
 * <li>Copyright ©2016-2022 广州职赢未来信息科技有限公司 All Rights Reserved.</li>
 * </ul>
 */
package com.hcbxwy.algorithm.sort;

import com.hcbxwy.algorithm.AlgorithmUtil;

/**
 * 插入排序
 * <ul>
 *     <li>原理：给定数组中，依次从未排序部分取出一个数插入到已排序部分的适合位置</li>
 *     <li>时间复杂度：最好情况O(n)，最坏情况O(n²)</li>
 *     <li>空间复杂度：O(1)</li>
 *     <li>稳定性：稳定</li>
 *     <li>优化方案：</li>
 * </ul>
 *
 * @author Billson
 * @since 2022/9/29 9:28
 */
public class InsertSort {

    /**
     * 普通写法
     */
    public static void sort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        for (int i = 1; i < arr.length; i++) {
            int end = i;
            while (end > 0 && arr[end - 1] > arr[end]) {
                AlgorithmUtil.swap(arr, end - 1, end);
                end--;
            }
        }
    }
    
    /**
     * 改进写法
     */
    public static void sort1(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 && arr[j - 1] > arr[j]; j--) {
                AlgorithmUtil.swap(arr, j - 1, j);
            }
        }
    }

    public static void main(String[] args) {
        int[] srcArr = AlgorithmUtil.randomArr(10);
        AlgorithmUtil.printBeforeSort(srcArr);
        int[] targetArr = srcArr;
        sort1(targetArr);
        AlgorithmUtil.printAfterSort(targetArr);
    }
}
