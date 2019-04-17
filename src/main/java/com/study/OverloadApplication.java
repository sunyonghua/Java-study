package com.study;

/**
 * @title 方法的重载
 * @desc 在一个类中出现相同的方法名 作用不同
 * @desc 1，形参个数不同， 类型不同，形参顺序不同构成重载
 * 2，
 */
public class OverloadApplication {

  public static void main(String[] args) {
    // 根据形参个数，类型来判断采用哪个add,跟调用顺序无关

    // 根据形参匹配到第二次add
    int abc = OverloadApplication.add(1, 2, 3);
    System.out.println(abc);//6

    // 根据形参匹配到第一次add
    int ab = OverloadApplication.add(1, 2);
    System.out.println(ab);//3

    // 根据形参匹配到第三次add
    double ba = OverloadApplication.add(1, 2.1);
    System.out.println(ba);//3.1

    // 根据形参匹配到第三次add
    double ba2 = OverloadApplication.add(3.2, 2);
    System.out.println(ba2);//5.2

  }

  // 第一次书写add
  private static int add(int a, int b) {
    return a + b;
  }

  // 第一次书写add
  private static int add(int a, int b, int c) {
    return a + b + c;
  }

  // 第三次调用 形参类型不同
  private static double add(int a, double b) {
    return a + b;
  }

  // 第四次调用 形参类型不同
  private static double add(double b, int a) {
    return a + b;
  }

  /*
   // 返回值不同不构成重载
   private static double add(int a, int b) {
   return a + b;
   }

   // 参数名称不同不构成重载
   private static int add(int a2, int b2, int c2) {
   return a2 + b2 + c2;
   }
   */
}
