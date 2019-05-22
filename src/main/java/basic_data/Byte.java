package basic_data;

import java.util.Arrays;

/**
 * @author sun yong hua
 * @description Byte
 * @createDate 2019-05-20 16:10
 * byte 数据类型是8位、有符号的，以二进制补码表示的整数；
 * 最小值是 -128（-2^7）；
 * 最大值是 127（2^7-1）；
 * 默认值是 0；
 * byte 类型用在大型数组中节约空间，主要代替整数，因为 byte 变量占用的空间只有 int 类型的四分之一；
 * 例子：byte a = 100，byte b = -50。
 */
public class Byte {
  private static byte a = 123;
  private static byte c = 'A'; //  一个字母 = 1 byte = 8 bit
//  private static byte d = '中'; //error 一个汉字 = 2 byte = 16bit
//  private static byte b = 12.3; //error byte不能赋值小数

  public static void main(String[] args) {
    byte Max = 127;  // byte存储的最大值
    byte Min = -128; // byte存储的最小值
    System.out.println(Byte.a);

    byte[] values = new byte[8];
    System.out.println(Arrays.toString(values));
  }
}
