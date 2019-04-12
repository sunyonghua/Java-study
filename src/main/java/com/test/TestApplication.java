package com.test;

import com.yonghua.ModifierApplication;

public class TestApplication {
  public static void main(String[] args) {
//    System.out.println(ModifierApplication.BOXWIDTH);  报错，不是同一包内 变量不可以访问 protected不可访问
    System.out.println(ModifierApplication.weeks); // 9.5 public修饰符修饰的可访问
  }
}
