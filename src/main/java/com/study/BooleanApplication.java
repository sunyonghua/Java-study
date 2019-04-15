package com.study;

/**
 * boolean
 */
public class BooleanApplication {
  public static void main(String[] args) {
    boolean man = true;
    int a = 0;
//    if(a){ // int 不能转为boolean 不能像js中直接用作判断
//      System.out.println("男");
//    }
    if (man) {
      System.out.println("男");
    } else {
      System.out.println("女");
    }
  }
}
