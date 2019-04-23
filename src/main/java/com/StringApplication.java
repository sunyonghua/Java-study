package com;

/**
 * @author sun yong hua
 * @description StringApplication
 * @createDate 2019-04-23 17:34
 */
public class StringApplication {
  private static String name = "孙勇华";

  public static void main(String[] args) {
    System.out.println(String.format(StringApplication.name, "yong hua"));
  }
}
