/*
 * <ul>
 * <li>项目名称：learn-algorithm</li>
 * <li>文件名称：AlgorithmUtil.java</li>
 * <li>日期：2022/3/14 9:04</li>
 * <li>Copyright ©2016-2022 广州职赢未来信息科技有限公司 All Rights Reserved.</li>
 * </ul>
 */
package com.hcbxwy.algorithm;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

/**
 * 算法工具类
 *
 * @author Billson
 * @date 2022/3/14 9:04
 */
public class AlgorithmUtil {

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
            arr[i] = random.nextInt(10);
        }
        return arr;
    }

    public static void printAfterSort(int[] arr) {
        System.out.println("排序后，arr=" + Arrays.toString(arr));
    }

    public static void printBeforeSort(int[] arr) {
        System.out.println("排序前，arr=" + Arrays.toString(arr));
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = format.parse("2039-01-01");
        long time = parse.getTime();
        System.out.println(time);
    }
}
