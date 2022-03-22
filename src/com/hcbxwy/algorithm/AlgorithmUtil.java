/*
 * <ul>
 * <li>项目名称：learn-algorithm</li>
 * <li>文件名称：AlgorithmUtil.java</li>
 * <li>日期：2022/3/14 9:04</li>
 * <li>Copyright ©2016-2022 广州职赢未来信息科技有限公司 All Rights Reserved.</li>
 * </ul>
 */
package com.hcbxwy.algorithm;

import java.util.Arrays;
import java.util.Random;

/**
 * 算法工具类
 *
 * @author Billson
 * @date 2022/3/14 9:04
 */
public class AlgorithmUtil {

    private AlgorithmUtil(){}

    public static void main(String[] args) {
        int[] arr = randomArr();
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr);
        SelectionSort.sort(arr2);
        check(arr, arr2);
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
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

    private static int[] randomArr() {
        int[] arr = new int[10000];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10000);
        }
        return arr;
    }

    public static void print(int[] arr) {
        System.out.println("排序后，arr=" + Arrays.toString(arr));
    }
}
