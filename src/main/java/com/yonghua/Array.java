package com.yonghua;

import java.util.Arrays;

public class Array {
  /**
   * 声明数组的两种声明方式
   * dataType[] list; 推荐
   * dataType list[]; 不推荐
   */

  public static void main(String[] args) {
    String[] arr = new String[3];
    arr[0] = "sun";
    arr[1] = "yong";
    arr[2] = "hua";
    System.out.println(Arrays.toString(arr));

    String[] list = {"sun", "yong", "hua"};
    System.out.println(Arrays.toString(list));

    Array array = new Array();
    int[] numArray = {1, 3, 2};
    System.out.println(array.testForEach(numArray));

    // 二维数组
    String str[][] = new String[3][4];
    System.out.println(Arrays.deepToString(str));
  }

  /**
   * 测试forEach
   *
   * @param array
   * @return total
   */
  private int testForEach(int[] array) {
    int total = 0;
    for (int ele : array) {
      total += ele;
    }
    return total;
  }

  /**
   * 多维数组
   */
  public static void testList() {

  }

}
