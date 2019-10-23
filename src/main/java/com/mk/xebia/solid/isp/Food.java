package com.mk.xebia.solid.isp;

import java.util.Date;
import java.util.List;

public interface Food {
    boolean isVegan();
    boolean isVegetarian();
    boolean containsEgg();
    boolean containsSeafood();
    boolean containsMeat();
    boolean containsBeaf();
    boolean containsMilk();
    boolean isNonVeg();
    float getCalories();
    float getCarbohydrates();
    float getFats();
    float getProteins();
    List<String> getVitamins();
    List<String> getMinarals();
    boolean isHalal();
    Date cropYear();
    String bhutcharName();
}
