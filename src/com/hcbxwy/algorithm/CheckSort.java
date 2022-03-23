/*
 * <ul>
 * <li>项目名称：learn-algorithm</li>
 * <li>文件名称：CheckSort.java</li>
 * <li>日期：2022/3/23 9:39</li>
 * <li>Copyright ©2016-2022 广州职赢未来信息科技有限公司 All Rights Reserved.</li>
 * </ul>
 */
package com.hcbxwy.algorithm;

import java.util.Arrays;

/**
 * 验证排序算法是否正确
 *
 * @author Billson
 * @date 2022/3/23 9:39
 */
public class CheckSort {

    public static void main(String[] args) {
        int[] arr = AlgorithmUtil.randomArr(10000);
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr);
        //SelectionSort.sort(arr2);
        BubbleSort.sort(arr2);
        check(arr, arr2);
    }

    public static void check(int[] arr, int[] arr2) {
        boolean same = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr2[i]) {
                same = false;
                break;
            }
        }
        System.out.println("验证结果：" + (same ? "right" : "wrong"));
    }
}
