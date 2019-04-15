package com.yonghua;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DateApplication {
  public static void main(String[] args) {
    Date date = new Date();
    System.out.println(date);
    System.out.println(date.getTime()); // 获取毫秒值

    SimpleDateFormat ft = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
    System.out.println(ft.format(date));
  }
}
