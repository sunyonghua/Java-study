package com.study;

/**
 * 两个字节
 * 用单引号包裹一个字符来表示
 * 可以使用unicode编码来表示
 */
public class charApplication {
  public static void main(String[] args) {
//    char s = "abc"; // error 字符串不能赋值给字符
    char a = 'A';
    System.out.println(a); // A
    char b = '\u0061';
    System.out.println(b); // a

    // 转义字符
    System.out.println('a' + 'b'); // 遇到+号 char转为了数字
    System.out.println("" + 'a' + 'b'); // 遇到字符串链接
    System.out.println("" + 'a' + '\n' + 'b'); // \n换行

  }
}
