package org.stepik.java.Task5extra.TaskDecorator;

public class TurnScrew extends Tool{

    public TurnScrew(Tool anotherTool) {
        super(anotherTool);
    }

    @Override
    public void work() {
        System.out.println("Звук вращения отвертки");
    }
}
