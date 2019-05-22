package study;

/**
 * @author sun yong hua
 * @description ClassesApplication
 * @createDate 2019-05-20 15:16
 */
public class ClassesApplication {
  static int age = 10; // 静态变量 类调用
  String userName = "sunyonghua"; // 成员变量

  private String play(String name) {
    String ball = "篮球"; // 方法变量
    System.out.println(name + ball);
    return name + ball;
  }

  public static void main(String[] args) {
    ClassesApplication study = new ClassesApplication();
    String school = "xx大学"; // 方法变量
    System.out.println(study.userName);
    System.out.println(study.play(study.userName));
    System.out.println(ClassesSon.name);
  }
}

class ClassesSon {
  static String name = "ClassesSon";

  public static void main(String[] args) {
    System.out.println("我也是个类");
  }
}


/**
 * 源文件声明规则
 * 在本节的最后部分，我们将学习源文件的声明规则。当在一个源文件中定义多个类，并且还有import语句和package语句时，要特别注意这些规则。
 * <p>
 * 一个源文件中只能有一个public类
 * 一个源文件可以有多个非public类
 * 源文件的名称应该和public类的类名保持一致。例如：源文件中public类的类名是Employee，那么源文件应该命名为Employee.java。
 * 如果一个类定义在某个包中，那么package语句应该在源文件的首行。
 * 如果源文件包含import语句，那么应该放在package语句和类定义之间。如果没有package语句，那么import语句应该在源文件中最前面。
 * import语句和package语句对源文件中定义的所有类都有效。在同一源文件中，不能给不同的类不同的包声明。
 * 类有若干种访问级别，并且类也分不同的类型：抽象类和final类等。这些将在访问控制章节介绍。
 * 除了上面提到的几种类型，Java还有一些特殊的类，如：内部类、匿名类。
 */
