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
import java.util.Random;

/**
 * selection sort
 *
 * @author Billson
 * @date 2022/3/9 9:14
 */
public class SelectionSort {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            check();
            System.out.println("-------------------------");
        }
    }

    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                minPos = arr[j] < arr[minPos] ? j : minPos;
            }
            swap(arr, i, minPos);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void check() {
        int[] arr = new int[10000];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10000);
        }
        int[] arr2 = arr;
        System.out.println("随机数组arr：" + Arrays.toString(arr));
        System.out.println("随机数组arr2：" + Arrays.toString(arr));
        long t1 = System.currentTimeMillis();
        sort(arr);
        long t2 = System.currentTimeMillis();
        System.out.println("选择排序耗时：" + (t2 - t1) + " ms");
        Arrays.sort(arr2);
        long t3 = System.currentTimeMillis();
        System.out.println("Arrays.sort耗时：" + (t3 - t2) + " ms");
        boolean same = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr2[i]) {
                same = false;
            }
        }
        System.out.println("验证结果：" + (same ? "验证通过" : "验证不通过"));
        System.out.println("排序后数组arr：" + Arrays.toString(arr));
        System.out.println("排序后数组arr2：" + Arrays.toString(arr));
    }
}
