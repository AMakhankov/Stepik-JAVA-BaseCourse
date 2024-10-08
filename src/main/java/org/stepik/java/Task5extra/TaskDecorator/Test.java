package org.stepik.java.Task5extra.TaskDecorator;

public class Test {
    public static void main(String[] args) {
        Tool multitool = new Knife(new TurnScrew(new Hammer(null)));
        multitool.work();
        System.out.println("-----------");
        multitool.hardWork();
        System.out.println("-----------");

        Tool anotherMultitool = new Hammer(new Knife(null));
        anotherMultitool.work();
        System.out.println("-----------");
        anotherMultitool.hardWork();
        System.out.println("-----------");
    }
}
