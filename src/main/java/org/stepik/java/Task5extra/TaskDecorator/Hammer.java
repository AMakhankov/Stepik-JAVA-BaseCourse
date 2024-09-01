package org.stepik.java.Task5extra.TaskDecorator;

public class Hammer extends Tool{

    public Hammer(Tool anotherTool) {
        super(anotherTool);
    }

    @Override
    public void work() {
        System.out.println("Звук удара молотком");
    }
}
