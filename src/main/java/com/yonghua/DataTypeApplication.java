package com.yonghua;

/*
 * @user sun yong hua
 * Java
 * 基本数据类型
 * Java语言提供了八种基本类型。六种数字类型（四个整数型，两个浮点型），一种字符类型char，还有一种布尔型。boolean
 *  整数类：byte (-128-127*1个字节) short(2个字节) int(4个字节) long(8个字节2的63次方-1)
 *  浮点类: float(4个字节 单精度) double(8个字节 更加精确双精度)
 *  字符类型:char(2个字节 0  ~ 65535)
 *  布尔型:boolean (1个字节 true false)
 *
 * 先看一个基本概念
 * 引用数据类型
 *  字符串
 *  数组
 *  对象
 *  类
 *  接口
 *
 *
 * 注意：
 * 1，字符串不是基本类型，而是引用类型
 * 2，浮点型可能是一个近似的值，并非精确
 * 3，字节数跟数值范围并无关系
 * 4，浮点数类型Java 默认是double 如果一定要使用float类型，后缀需要+F
 *    如果是正式类型，默认是int,如果一定要使用long 后缀需要+L
 *
 * */
public class DataTypeApplication {
  /**
   * bit           比特     是 二进位制信息单位，即0，1
   * 然后看8种基本类型
   * 整型
   * byte        1字节     8位元组，即8位bit，   可存储-2^8~2^7   (-128 ~ 127)
   * short       2字节           2*8 = 16 bit           -2^16~2^15   (-32768 ~ 32767)     
   * int           4字节           4*8 = 32 bit  -2^32~2^31   (-2147483648 ~ 2147483647)
   * long 8字节 8*8 = 64 bit -2^64~2^63   (-18446744073709551616 ~ 18446744073709551615)
   * 浮点型
   * float 4字节           4*8 = 32 bit  -2^32~2^31   (-2147483648 ~ 2147483647)
   * double 8字节 8*8 = 64 bit -2^64~2^63   (-18446744073709551616 ~ 18446744073709551615)
   * 字符型
   * char 2字节           2*8 = 16 bit          英文字符所占字节 2，中文字符根据编码不同
   * 布尔型
   * boolean 1字节 8bit true|false
   */
  public static void main(String[] args) {
  }
}