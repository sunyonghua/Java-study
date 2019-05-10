package com;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author sun yong hua
 * @description JsonApplication
 * @createDate 2019-05-10 09:38
 */
public class JsonApplication {

  public static void main(String[] args) {
    JSONObject jsonObject = new JSONObject();
    jsonObject.put("success", true);
    jsonObject.put("message", "获取成功");
    List<String> data = new ArrayList<String>();
    data.add("1");
    data.add("2");
    data.add("3");
    data.add("4");
    jsonObject.put("data", data);
    System.out.println(jsonObject);
  }
}
