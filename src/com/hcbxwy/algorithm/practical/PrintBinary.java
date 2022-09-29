/*
 * <ul>
 * <li>项目名称：learn-algorithm</li>
 * <li>文件名称：PrintBinary.java</li>
 * <li>日期：2022/8/12 15:07</li>
 * <li>Copyright ©2016-2022 广州职赢未来信息科技有限公司 All Rights Reserved.</li>
 * </ul>
 */
package com.hcbxwy.algorithm.practical;

/**
 * 打印给定整型的32位二进制
 *
 * @author Billson
 * @date 2022/8/12 15:07
 */
public class PrintBinary {

    private static final int BIT_INT = 32;

    public static void print32(int num) {
        for (int i = BIT_INT - 1; i >= 0; i--) {
            System.out.print((num & (1 << i)) == 0 ? "0" : "1");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        print32(1);
        print32(2);
        System.out.println((1 << 1) & 1);
    }
}
