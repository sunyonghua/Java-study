package com.study;

public class Factorial {

  public static void main(String[] args) {

    long d1 = System.currentTimeMillis();
    System.out.printf("递归结果：%s%n",factorial(3));
    long d2 = System.currentTimeMillis();
    System.out.printf("递归循环耗时：%s%n", d2 - d1);

    long d3 = System.currentTimeMillis();
    System.out.printf("普通结果：%s%n",whileFactorial(3));
    long d4 = System.currentTimeMillis();
    System.out.printf("普通循环耗时：%s%n", d4 - d3);

  }

  // 递归阶乘
  private static int factorial(int n) {
    if (n == 1) {
      return 1;
    } else {
      return n * factorial(n - 1);
    }
  }

  private static int whileFactorial(int n) {
    int result = 1;
    while (n > 1) {
      result *= n * (n - 1);
      n -= 2;
    }
    return result;
  }
}
