package org.stepik.java.Task5extra.Task2;

public class User {

    private int id;
    private int name;
    private int waterCountDay;
    private int waterCountNight;
    private int gasCount;
    private int electroCountDay;
    private int electroCountNight;

    public User(int id, int name, int waterCountDay, int waterCountNight,
                int gasCount, int electroCountDay, int electroCountNight) {
        this.id = id;
        this.name = name;
        this.waterCountDay = waterCountDay;
        this.waterCountNight = waterCountNight;
        this.gasCount = gasCount;
        this.electroCountDay = electroCountDay;
        this.electroCountNight = electroCountNight;
    }


}
