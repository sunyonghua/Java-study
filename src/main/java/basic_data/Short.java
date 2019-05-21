package basic_data;

/**
 * @author sun yong hua
 * @description Short
 * @createDate 2019-05-20 16:15
 * short 数据类型是 16 位、有符号的以二进制补码表示的整数
 * 最小值是 -32768（-2^15）；
 * 最大值是 32767（2^15 - 1）；
 * Short 数据类型也可以像 byte 那样节省空间。一个short变量是int型变量所占空间的二分之一；
 * 默认值是 0；
 * 例子：short s = 1000，short r = -20000。
 */
public class Short {
  private static short a = 32767;
  private static short b = '中'; // 1个中文 = 2个字节 = 16bit
//  private static short c = 'AB'; // char 是只能有一个字符的
//  private static short b = '中国'; // error 2个中文 = 4个字节 = 32bit
//  private static short b = 1.2; // 同样不能赋值浮点数

  public static void main(String[] args) {
    System.out.println(Short.a); //1
  }
}
