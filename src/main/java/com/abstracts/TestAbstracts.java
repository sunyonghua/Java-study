package com.abstracts;

/**
 * @author sun yong hua
 * @description TestAbstracts
 * @createDate 2019-04-18 16:20
 */
public class TestAbstracts extends AbstractApplication {
  public TestAbstracts(String name, int age) {
    super(name, age);
  }

  // 抽象方法必须被子类重载或重写 或者声明自身为抽象类。
  @Override
  public int add(int a, int b) {
    return a + b;
  }

  public static void main(String[] args) {
    //  AbstractApplication user = new AbstractApplication(); 语法错误，抽象类不能被实例化
    TestAbstracts user = new TestAbstracts("sun yong hua ", 18);

    System.out.println(user.name); // sun yong hua
    System.out.println(user.age); // 18
    System.out.println(user.getName());
    System.out.println(user.getAge());
    //    AbstractApplication user2 = new TestAbstracts("sun yong hua ", 18); // 编译通过，可使用
    //    System.out.println(user2.name);
  }
}
