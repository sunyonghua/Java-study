package com.abstracts;

/**
 * @author sun yong hua
 * @description 抽象类学习 由于抽象类不能实例化对象，所以抽象类必须被继承，才能被使用。
 * @createDate 2019-04-18 16:12
 */
public abstract class AbstractApplication {


  public String name;
  public int age;

  public AbstractApplication(String name, int age) {
    System.out.println(name + age);
    this.name = name;
    this.age = age;
  }

  public void setUser(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  // 如果一个类包含抽象方法，那么该类必须是抽象类。
  // 任何子类必须重写父类的抽象方法，或者声明自身为抽象类。
  public abstract int add(int a, int b);
}

/*
在面向对象的概念中，所有的对象都是通过类来描绘的，但是反过来，并不是所有的类都是用来描绘对象的，如果一个类中没有包含足够的信息来描绘一个具体的对象，这样的类就是抽象类。
抽象类除了不能实例化对象之外，类的其它功能依然存在，成员变量、成员方法和构造方法的访问方式和普通类一样。
由于抽象类不能实例化对象，所以抽象类必须被继承，才能被使用。也是因为这个原因，通常在设计阶段决定要不要设计抽象类。
父类包含了子类集合的常见的方法，但是由于父类本身是抽象的，所以不能使用这些方法。
 */