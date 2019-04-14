package com.yonghua;

/**
 * 修饰符
 * Java语言提供了很多修饰符，主要分为以下两类：
 * 访问修饰符
 * 非访问修饰符
 * <p>
 * 修饰符用来定义类、方法或者变量
 * default (即缺省，什么也不写）: 在同一包内可见，不使用任何修饰符。使用对象：类、接口、变量、方法。
 * private : 在同一类内可见。使用对象：变量、方法。 注意：不能修饰类（外部类,我理解为文件类）。
 * public : 对所有类可见。使用对象：类、接口、变量、方法
 * protected : 对同一包内的类和所有子类可见。使用对象：变量、方法。 注意：不能修饰类（外部类）。
 * 类和接口不能声明为 private
 */
public class ModifierApplication {
  String name = "sun yong hua "; // 同一包内可见变量
  private boolean myFlag; //只在当前类可用
  public boolean beautify = true; // 所有类可用  -> VariableApplication main方法中查看调用
  public static final double weeks = 9.5; // 类调用 凡是当前类可见此变量即可用
  protected static final int BOXWIDTH = 42;// protected : 对同一包内的类和所有子类可见。使用对象：变量、方法。 注意：不能修饰类（外部类）。

  public static void main(String[] arguments) {
    System.out.println(ModifierApplication.weeks);// 9.5
  }

  // 内部类
  public class Son {

  }

}
