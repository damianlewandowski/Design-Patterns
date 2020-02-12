package com.lewandowski;

import com.lewandowski.chickens.BlackChicken;
import com.lewandowski.chickens.Chicken;
import com.lewandowski.chickens.ChickenTypes;
import com.lewandowski.chickens.WhiteChicken;

/**
 * PolishFarm
 */
public class ChineeseFarm extends Farm {
    // For some reason chineese chickens have a weird prefix to their names
    String namePrefix = "Xin ";

    protected Chicken createChicken(final ChickenTypes chickenType, final String name, final int age,
            final int weight) {
        String properName = namePrefix.concat(name);
        switch (chickenType) {
        case WHITE_CHICKEN:
            return new WhiteChicken(properName, age, weight);
        case BLACK_CHICKEN:
            return new BlackChicken(properName, age, weight);
        default:
            return null;
        }
    }

}
