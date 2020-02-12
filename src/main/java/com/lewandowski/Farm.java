package com.lewandowski;

import com.lewandowski.chickens.Chicken;
import com.lewandowski.chickens.ChickenTypes;

/**
 * Farm
 */
public abstract class Farm {

    abstract protected Chicken createChicken(ChickenTypes chickenType, String name, int age, int weight);
}
