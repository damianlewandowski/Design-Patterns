package com.lewandowski;

/**
 * NyPizzaStore
 */
public class NyPizzaStore extends PizzaStore {

  public Pizza createPizza(String pizzaType) {
    switch (pizzaType) {
    case "cheese":
      return new NyCheesePizza();
    default:
      return null;
    }
  }

}
