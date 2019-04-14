package com.yonghua;

public class Variable {
  private String name = "sunyonghua"; // 成员变量 属于对象
  private int num; // 默认赋值0
  private static int age = 20;

  public static void main(String[] args) {
    Variable user = new Variable();
    System.out.println(user.num); //0
    System.out.println(Variable.age); //20 属于类
    // 局部变量声明必须初始化
    {
      int num = 2; // 属于语句块
      System.out.println(num); //2
    }
    int num = 1;
    System.out.println(num); // 1 属于方法
  }
}
