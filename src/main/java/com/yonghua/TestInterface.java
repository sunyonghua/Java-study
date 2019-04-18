package com.yonghua;

public class TestInterface implements InterfaceApplication {
  public static void main(String[] args) {
    System.out.println(MAX_VALUE);
    TestInterface test = new TestInterface();
    System.out.println(test.add(1, 2));
  }

  @Override
  public void play() {
    System.out.println("play");
  }

  @Override
  public int add(int a, int b) {
    System.out.println(MAX_VALUE);
    return a + b;
  }
}
