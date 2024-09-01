package org.stepik.java.Task5extra.TaskDecorator;

abstract class Tool implements Workable {

    Tool anotherTool;

    public Tool(Tool anotherTool) {
        this.anotherTool = anotherTool;
    }

    @Override
    public void hardWork() {

        work();

        if (anotherTool != null) {
            anotherTool.hardWork();
        }
    }

    public abstract void work();
}
