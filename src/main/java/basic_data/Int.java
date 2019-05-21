package basic_data;

/**
 * @author sun yong hua
 * @description Int
 * @createDate 2019-05-20 16:18
 * int 数据类型是32位、有符号的以二进制补码表示的整数；
 * 最小值是 -2,147,483,648（-2^31）；
 * 最大值是 2,147,483,647（2^31 - 1）；
 * 一般地整型变量默认为 int 类型；
 * 默认值是 0 ；
 * 例子：int a = 100000, int b = -200000。
 */
public class Int {
  private static int a = 1000;
  private static int b;
//  private static int b = 1.0; // 不能赋值小数

  public static void main(String[] args) {
    System.out.println(Int.a);
    System.out.println(Int.b); // 0 默认值是0
  }
}
