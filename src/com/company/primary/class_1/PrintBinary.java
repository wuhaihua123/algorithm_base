package com.company.primary.class_1;

/**
 * 打印整数的二进制,无符号整数---java没有
 * 底层加减乘除都是位运算，负数表达：符号位后面取反加1（为了实现加减共用一套逻辑门，提升运行效率）
 * >>>不带符号右移   >>带符号右移
 */
public class PrintBinary {

    public static void main(String[] args) {

        printB(12);
    }

    private static void printB(Integer num) {
        for (int i = 31; i >= 0; i--) {
            System.out.print(((num & (1 << i)) == 0 ? '0' : '1'));
        }
    }
}
