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

    private static final int BIT_INT = 32;

    private AlgorithmUtil(){}

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int[] randomArr(int length) {
        int[] arr = new int[length];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10000);
        }
        return arr;
    }

    public static void printBinary(int num) {
        for (int i = BIT_INT - 1; i >= 0; i--) {
            System.out.print((num & (1 << i)) == 0 ? "0" : "1");
        }
        System.out.println();
    }

    public static void print(int[] arr) {
        System.out.println("排序后，arr=" + Arrays.toString(arr));
    }
}
