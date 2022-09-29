/*
 * <ul>
 * <li>项目名称：learn-algorithm</li>
 * <li>文件名称：SumArrFromLeftToRight.java</li>
 * <li>日期：2022/9/29 14:40</li>
 * <li>Copyright ©2016-2022 广州职赢未来信息科技有限公司 All Rights Reserved.</li>
 * </ul>
 */
package com.hcbxwy.algorithm.practical;

/**
 * 计算给定数组下标从L到R的累加和
 * <ul>
 *     <li>方案一：提前维护一个二维数组，从二维数组中查询结果，arr[L][R]</li>
 *     <li>方案二：提前维护一个一维数组，每个元素为原数组0-i的累加和，则L到R的累加和 = arr[R] - arr[L]</li>
 * </ul>>
 *
 * @author Billson
 * @since 2022/9/29 14:40
 */
@SuppressWarnings("AlibabaLowerCamelCaseVariableNaming")
public class SumArrFromLeftToRight {

    /**
     * 二维数组
     */
    private static int[][] arr2 = {};
    /**
     * 一维数组
     */
    private static int[] arr1 = {};

    /**
     * 计算给定数组下标从L到R的累加和（使用方案一）
     *
     * @param arr 给定数组
     * @param L 左下标位置
     * @param R 右下标位置
     * @return L到R的累加和
     */
    public static int sumArrL2R1(int[] arr, int L, int R) {
        if (arr2.length == 0) {
            initArr2(arr);
        }
        return arr2[L][R];
    }

    /**
     * 假设数组为 {2, 5, 4, 1, 8}
     * 初始化后二维数组为arr2，如下：
     *    0  1  2   3   4
     * 0  2  7  11  12  20
     * 1  -  5  9   10  18
     * 2  -  -  4   5   13
     * 3  -  -  -   1   9
     * 4  -  -  -   -   8
     *
     */
    private static void initArr2(int[] arr) {
        if (arr == null || arr.length == 0 || arr2.length > 0) {
            return;
        }
        int len = arr.length;
        arr2 = new int[len][len];
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                arr2[i][j] = j == i ? arr[j] : arr2[i][j - 1] + arr[j];
            }
        }
    }

    /**
     * 计算给定数组下标从L到R的累加和（使用方案二）
     *
     * @param arr 给定数组
     * @param L 左下标位置
     * @param R 右下标位置
     * @return L到R的累加和
     */
    public static int sumArrL2R2(int[] arr, int L, int R) {
        if (arr1.length == 0) {
            initArr1(arr);
        }
        if (L == 0) {
            return arr1[R];
        }
        return arr1[R] - arr1[L - 1];
    }

    /**
     * 假设数组为 {2, 5, 4, 1, 8}
     * 初始化后 arr1 = {2, 7, 11, 12, 20}
     */
    private static void initArr1(int[] arr) {
        if (arr == null || arr.length == 0 || arr1.length > 0) {
            return;
        }
        int len = arr.length;
        arr1 = new int[len];
        for (int i = 0; i < len; i++) {
            arr1[i] = i == 0 ? arr[i] : arr1[i - 1] + arr[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 4, 1, 8};
        System.out.println(sumArrL2R1(arr, 1, 2));
        System.out.println(sumArrL2R2(arr, 1, 2));
    }

}
