package com.lewandowski.chickens;

/**
 * Chicken
 */
public abstract class Chicken {
    protected String name;
    protected int age;
    protected int weight;

    public Chicken(final String name, final int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public int getWeight() {
        return this.weight;
    }

    public abstract Chicken butcher();

}
