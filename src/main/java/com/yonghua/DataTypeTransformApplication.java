package com.yonghua;

/*
 * 当数据不一样，会发生类型转换
 * 隐式类型转换
 *   1，代码不需要进行特殊处理，自动完成
 *   2，数据范围从小到大
 * 显示类型转换
 *
 * */
public class DataTypeTransformApplication {
  public static void main(String[] args) {
    System.out.println(2); // 整数 默认int类型
    System.out.println(1.1); // 浮点数 默认double类型

    // 左边是long 类型，右边是int类型
    // 一个等号代表赋值 右边int放到了long类型的容器当中
    // 符合数据范围从小到大 完成隐式类型转换
    long num = 100;
    System.out.println(num);

    //
    double num2 = 2.5F;

  }
}
