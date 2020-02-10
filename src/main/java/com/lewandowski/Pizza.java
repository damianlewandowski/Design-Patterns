package com.lewandowski;

import java.util.ArrayList;

abstract class Pizza {
  String name;
  String dough;
  String sauce;
  ArrayList<String> toppings = new ArrayList<>();

  void prepare() {
    System.out.println("Preparing " + name);
    System.out.println("Tossing dough");
    System.out.println("Adding sauce");
    System.out.println("Adding toppings");

    for (String topping : toppings) {
      System.out.println(topping);
    }
  }

  void bake() {
    System.out.println("Bake at 250 degrees for 5 minutes");
  }

  void cut() {
    System.out.println("Cutting into triangular shapes");
  }

  void box() {
    System.out.println("Boxing in rectangles");
  }

}
