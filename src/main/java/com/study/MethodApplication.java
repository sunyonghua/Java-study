package com.study;

public class MethodApplication {

  public static void main(String[] args) {
    // 通过对象调用普通方法
    MethodApplication method = new MethodApplication();
    method.printName("sun yong hua");
    System.out.println(method.add(1, 2));
  }

  private void printName(String name) {
    System.out.println(name);
  }

  int add(int a, int b) {
    return a + b;
  }
}
