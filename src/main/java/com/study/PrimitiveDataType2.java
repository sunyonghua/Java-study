package com.study;

import java.math.BigDecimal;

public class PrimitiveDataType2 {
  public static void main(String[] args) {
//    float num = 3.14; // 默认是double 报错
    float num = 3.14F; // 使用float

    float a = 0.1F;
    double b = 1.0 / 10;
    System.out.println(b == a); // false 浮点型不精确 尽量不要用作比较
//    System.out.println(a.equals(b));
//    BigDecimal
  }
}
