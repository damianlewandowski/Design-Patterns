package com.lewandowski;

import com.lewandowski.chickens.BlackChicken;
import com.lewandowski.chickens.Chicken;
import com.lewandowski.chickens.ChickenTypes;
import com.lewandowski.chickens.WhiteChicken;

/**
 * PolishFarm
 */
public class PolishFarm extends Farm {
    // Polish chickens actually weigh more for some reason
    // This is to add some sense to why would I need multiple types of farms
    int polishWeight = 4;

    protected Chicken createChicken(final ChickenTypes chickenType, final String name, final int age,
            final int weight) {
        int properWeight = weight + polishWeight;
        switch (chickenType) {
        case WHITE_CHICKEN:
            return new WhiteChicken(name, age, properWeight);
        case BLACK_CHICKEN:
            return new BlackChicken(name, age, properWeight);
        default:
            return null;
        }
    }

}
