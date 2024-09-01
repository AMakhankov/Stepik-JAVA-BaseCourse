package org.stepik.java.Task5extra.Task2;

import java.io.IOException;
import java.util.List;

public interface Writer {
    void writeLines(List<UserResourcesConsumption> users) throws IOException;
}
