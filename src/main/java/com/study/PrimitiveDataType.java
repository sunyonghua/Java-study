package com.study;

/**
 * 整数类型 (byte,short,int,long);
 * 浮点类型 (float，double);
 * 字符类型 (char)
 * 布尔类型 (boolean)
 */
public class PrimitiveDataType {
  public static void main(String[] args) {
    int a = 15;
    int b = 015;
    int c = 0x15;
    int d = 0b1101;

    System.out.println(a); // 15 十进制
    System.out.println(b); // 13 八进制
    System.out.println(c); // 21 十六进制
    System.out.println(d); // 13 二进制


  }
}
