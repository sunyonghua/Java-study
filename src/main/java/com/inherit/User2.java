package com.inherit;

public class User2 extends Person {
  public User2(String name, int card) {
    super(name, card); // 调用父类的方法
  }

  public static void main(String[] args) {
    User2 user = new User2("yongyong", 124);
    System.out.println(user.name);
    System.out.println(user.card);
    user.eat();
    user.play();
    user.study();
  }
}
