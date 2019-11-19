package com.company;

import com.company.Hero;

public class Warrior extends Hero implements  Applicable {
    @Override
    public void applySuperAbility() {
        System.out.println("Warrior applies physical super Ability");
    }
}
