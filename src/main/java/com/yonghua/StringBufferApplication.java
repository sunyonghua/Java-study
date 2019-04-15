package com.yonghua;

public class StringBufferApplication {

  public static void main(String[] args) {
    StringBuffer blog = new StringBuffer("blog:");
    //================ append
    blog.append("https://github.com/sunyonghua");
    System.out.println(blog); // blog:https://github.com/sunyonghua
    //================  insert
    System.out.println(blog.insert(2, "67")); // 插入字符串
    System.out.println(blog.insert(2, 1));      // 插入int
    //================  delete
    System.out.println(blog.delete(1, 3)); // 从1删除到3 包括1 不包括3
    try {
      System.out.println(blog.delete(1, -3)); //  不支持负数删除
    } catch (Exception e) {
      System.out.println(e);
    }
    //================ reverse
    System.out.println(blog.reverse()); //翻转

    //================ replace
    StringBuffer name = new StringBuffer("sunyonghua");
    System.out.println(name.replace(0, 3, "shuai")); // 参数 1开始位置，2结束位置（包括结束位置）3替换字符串值只能是字符串
  }
}
