package basic_data;

/**
 * @author sun yong hua
 * @description Long
 * @createDate 2019-05-20 16:20
 * long 数据类型是 64 位、有符号的以二进制补码表示的整数；
 * 最小值是 -9,223,372,036,854,775,808（-2^63）；
 * 最大值是 9,223,372,036,854,775,807（2^63 -1）；
 * 这种类型主要使用在需要比较大整数的系统上；
 * 默认值是 0L；
 * 例子： long a = 100000L，Long b = -200000L。
 * "L"理论上不分大小写，但是若写成"l"容易与数字"1"混淆，不容易分辩。所以最好大写。
 */
public class Long {
  // 因为整型默认值是int 所以在表达特别大的值是需要用L来表达long
  public static void main(String[] args) {
    long a = 100000000000000000L;
    long b = 1000000000;
//    long c = 10000000000;  error 加L
    System.out.println(a);
    System.out.println(b);
  }
}
