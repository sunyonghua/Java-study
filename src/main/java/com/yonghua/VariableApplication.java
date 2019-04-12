package com.yonghua;

public class VariableApplication {
  private String name = "sun yong hua"; // 字符串变量
  private byte age = 100; // 整数变量
  private short book = 32767; // 整数常量 -2^16~2^15   (-32768 ~ 32767)   
  //  private short book2 = 32768; // 整数常量 -2^16~2^15   (-32768 ~ 32767)    报错
  private int phone = 0; // 整数常量
  private long mobile = 13467131119L; // 默认int 使用long 结尾就要加L 不区分大小写 L比较合适
  private float money = 1.18888F; // 默认double 使用float 结尾就要加F
  private double balance = 1111111111111.121;
  // TODO 为什么超过11位整数会报错 double 默认使用int? why?
  private double balanceMoney = 11111111111111111D;

  // TODO ps: 疑惑，float 存在的意义？
  private char nation = '美'; // 字符常量
  private boolean beautify = false; // 布尔变量

  public static void main(String[] args) {
    VariableApplication user = new VariableApplication();
    user.name = "yong hua";
    user.age = 18;
    user.nation = '汉';
    user.beautify = true;
//    user.mobile = 17909876789;
//    user.phone = 17909876789; -2147483648 ~ 2147483647 超出取值范围
    System.out.println(user.name); // yong hua
    System.out.println(user.age); // 18
    System.out.println(user.nation); // 汉
    System.out.println(user.beautify); // true
    //    user.age = 129;  //强类型报错 因为byte取值范围在-128~127之间 包括127 -128
    //    user.age = -129;  //强类型报错 因为byte取值范围在-128~127之间

    //
    System.out.println(ModifierApplication.BOXWIDTH); // 42 同一包的类 无需引入
    ModifierApplication modifier = new ModifierApplication();
    System.out.println(ModifierApplication.weeks); //9.5-> 指向ModifierApplication类中定义变量 --- 测试static修饰符
    System.out.println(modifier.beautify); //true -> 指向ModifierApplication类中定义变量 --- 测试public修饰符

  }
}
