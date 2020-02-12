package com.lewandowski.chickens;

/**
 * WhiteChicken
 */
public class WhiteChicken extends Chicken {
    private int butcheringAge = 7;

    public WhiteChicken(String name, int age, int weight) {
        super(name, age, weight);
    }

    public Chicken butcher() {
        if (age > butcheringAge) {
            System.out.println(String.format("%s %s is %d years old. It weighs %d. Butcher time",
                    this.getClass().getName(), name, age, weight));
            return this;
        }
        return null;
    }

}
