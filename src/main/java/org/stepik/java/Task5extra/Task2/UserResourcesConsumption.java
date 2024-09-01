package org.stepik.java.Task5extra.Task2;

public class UserResourcesConsumption implements ResourceConsumption{

    //private int id;
    //private int name;
    private int waterCountDay;
    private int waterCountNight;
    private int gasCount;
    private int electroCountDay;
    private int electroCountNight;

    public UserResourcesConsumption(int waterCountDay, int waterCountNight,
                                    int gasCount, int electroCountDay, int electroCountNight) {
        //this.id = id;
        //this.name = name;
        this.waterCountDay = waterCountDay;
        this.waterCountNight = waterCountNight;
        this.gasCount = gasCount;
        this.electroCountDay = electroCountDay;
        this.electroCountNight = electroCountNight;
    }

    public int getTotalWaterConsumption() {
        return waterCountDay + waterCountNight;
    }

    public int getTotalGasConsumption() {
        return gasCount;
    }

    public int getTotalElectroConsumption() {
        return electroCountDay + electroCountNight;
    }

    @Override
    public boolean isEcoFriendly(int limit) {
        return getTotalWaterConsumption() <= limit &&
                getTotalGasConsumption() <= limit &&
                getTotalElectroConsumption() <= limit;
    }

    public String toNormalFormat() {
        return waterCountDay + "|" + waterCountNight + "|" +
                gasCount + "|" + electroCountDay + "|" +
                electroCountNight;
    }
}
