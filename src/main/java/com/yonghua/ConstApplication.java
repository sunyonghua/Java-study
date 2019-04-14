package com.yonghua;

/**
 * 程序运行中固定不变的量叫做常量
 * 用final 修饰的变量叫做常量
 *
 * 常量命名 全部使用大写字母中间使用下划线分割
 * 常量分类
 * 1,字符串常量:'abc','123'
 * 2,整数常量:123
 * 3,浮点数常量:1.1
 * 4,字符常量：'A'
 * 5,布尔常量：true false
 * 6,空常量：null
 */
public class ConstApplication {
  public static void main(String[] args) {
    int age = 18;
    final String NAME = "sun yong hua";
    // 右边常量，左边变量
    // name = "yong hua"; //用final修饰的变量 不可修改叫做常量
    // 字符串常量
    System.out.println("ABC");
  }
}
