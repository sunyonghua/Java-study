package com.inherit;

/**
 * 子类拥有父类非 private 的属性、方法。
 * 子类可以拥有自己的属性和方法，即子类可以对父类进行扩展。
 * 子类可以用自己的方式实现父类的方法。
 * Java 的继承是单继承，但是可以多重继承，单继承就是一个子类只能继承一个父类，多重继承就是，例如 A 类继承 B 类，B 类继承 C 类，所以按照关系就是 C 类是 B 类的父类，B 类是 A 类的父类，这是 Java 继承区别于 C++ 继承的一个特性。
 * 提高了类之间的耦合性（继承的缺点，耦合度高就会造成代码之间的联系越紧密，代码独立性越差）。
 */
public class Person {
  public String name; // 注意这里是父类，子类能够继承public的属性即方法，不能继承private的方法
  public int card;

  public Person(String name, int card) {
    this.name = name;
    this.card = card;
  }

  public void eat() {
    System.out.println(name + "在吃饭");
    this.meal();
  }

  public void meal() {
    System.out.println("吃火锅");
  }

  public void play() {
    System.out.println(name + "在play");
  }

  public void study() {
    System.out.println(name + "学习,学号是" + card);
  }
}
