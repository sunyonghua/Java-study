package com.inherit;

public class User extends Person {
  public User(String name, int card) {
    super(name, card);
  }

  public static void main(String[] args) {
    User user = new User("sunyonghua", 2008);
    System.out.println(user.name);
    System.out.println(user.card);
    user.eat();
  }
}
