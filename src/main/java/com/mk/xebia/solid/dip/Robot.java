package com.mk.xebia.solid.dip;

public class Robot {
    private PowerProvider powerProvider ;

    public Robot(PowerProvider powerProvider) {
        this.powerProvider = powerProvider;
    }

    private TirednessIndicator tirednessIndicator = new TirednessIndicator();
    public boolean canWalk() {
        return (powerProvider.getRemainingCharge()>5) &&
                (!tirednessIndicator.getTirednessLevels().equals(TirednessIndicator.TirednessLevels.TIRED));
    }
}
