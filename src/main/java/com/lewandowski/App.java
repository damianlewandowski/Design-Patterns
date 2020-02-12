package com.lewandowski;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.lewandowski.chickens.Chicken;
import com.lewandowski.chickens.ChickenTypes;

public final class App {
    public static void main(String[] args) {
        Farm polishFarm = new PolishFarm();
        Farm chineeseFarm = new ChineeseFarm();
        ArrayList<Chicken> polishChickens = new ArrayList<>();

        Chicken polishBlackChicken1 = polishFarm.createChicken(ChickenTypes.BLACK_CHICKEN, "Stefan", 2, 10);
        Chicken polishBlackChicken2 = polishFarm.createChicken(ChickenTypes.BLACK_CHICKEN, "Jozef", 5, 12);
        Chicken polishBlackChicken3 = polishFarm.createChicken(ChickenTypes.BLACK_CHICKEN, "Henryk", 7, 14);

        Chicken polishWhiteChicken1 = polishFarm.createChicken(ChickenTypes.BLACK_CHICKEN, "Tomek", 1, 5);
        Chicken polishWhiteChicken2 = polishFarm.createChicken(ChickenTypes.BLACK_CHICKEN, "Maurycy", 3, 16);
        Chicken polishWhiteChicken3 = polishFarm.createChicken(ChickenTypes.BLACK_CHICKEN, "Michal", 10, 17);

        List<Chicken> polishChickensList = Arrays.asList(polishBlackChicken1, polishBlackChicken2, polishBlackChicken3,
                polishWhiteChicken1, polishWhiteChicken2, polishWhiteChicken3);
        polishChickens.addAll(polishChickensList);

        int totalMeatFromPolishFarm = 0;
        for (Chicken chicken : polishChickens) {
            Chicken butcheredChicken = chicken.butcher();

            if (butcheredChicken != null) {
                totalMeatFromPolishFarm += butcheredChicken.getWeight();
            }
        }

        System.out.println("Total poultry collected from polish farm: " + totalMeatFromPolishFarm);

    }
}
