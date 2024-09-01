package org.stepik.java.Task5extra.TaskDecorator;

abstract class Tool implements Workable {

    @Override
    public void hardWork() {
        work();
    }

    public abstract void work();
}
