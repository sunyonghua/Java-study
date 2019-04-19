package com.classes;

/**
 * @author sun yong hua
 * @description Study
 * @createDate 2019-04-18 22:12
 * @study 一个java 文件可以有多个类 但是只能有一个public 修饰的类
 */
public class Study {
  // 属性 fields
  private String name;
  private int age;
  private int studyNum;

  Computer computed;

  // 方法
  void study() {
    System.out.println("使用的电脑" + computed.brand);
  }

  void play() {
    System.out.println("学生喜欢玩游戏");
  }

  /**
   * 无参的构造方法 默认就有
   */
  public Study() {
  }

  // 程序执行入口
  public static void main(String[] args) {
    Study stu = new Study(); //实例化一个对象
    stu.play();
    stu.name = "孙勇华";
    stu.age = 18;
    Computer c = new Computer();
    c.brand = "mac 2017";
    stu.computed = c;
    stu.study();
  }
}

class Computer {
  String brand;
}
