package org.stepik.java.Task5extra.TaskDecorator;

class Knife extends Tool {
    public Knife(Tool anotherTool) {
        super(anotherTool);
    }

    @Override
    public void work() {
        System.out.println("Звук резанья ножом");
    }
}