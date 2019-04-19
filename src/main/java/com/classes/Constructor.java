package com.classes;

/**
 * @author sun yong hua
 * @description Constructor
 * @createDate 2019-04-18 22:47
 */
public class Constructor {
  int a;
  int b;

  // 方法名称必须跟类名保持一致
  /*
   * 通过new 关键字调用
   * 构造器虽然有返回值但是不能定义返回值类型（返回值的类型是本类） 不能在构造器里return某个值 可以return;结束 return 1:返回值2:结束方法的运行
   * 如果没有定义构造函数，编译器会自动定义一个无参的构造函数，如果已经定义则编译器不会自动添加
   */
  // 构造函数也可以重载，用于生成不对的对象
  public Constructor() {
//    super(); 构造方法的第一句总是super() 编译器默认会生成
  }

  public Constructor(int a, int b) {
    this.a = a;
    this.b = b;
  }
}

