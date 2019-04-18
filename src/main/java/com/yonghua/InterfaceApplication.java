package com.yonghua;

/**
 * 接口
 * 接口中的方法，常量都是对外公开的
 */
public interface InterfaceApplication {
  //public static final 接口中定义常量默认直接有前缀
  int MAX_VALUE = 10;

  void play();

  int add(int a, int b);
}
