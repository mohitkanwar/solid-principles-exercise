package com.mk.xebia.solid.dip;

public class Battery implements PowerProvider{
    private float remainingCharge = 100;

    public float getRemainingCharge() {
        return remainingCharge;
    }

    public void consumeCharge(float charge) {
        this.remainingCharge -= charge;
    }
}
