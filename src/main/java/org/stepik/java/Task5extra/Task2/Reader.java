package org.stepik.java.Task5extra.Task2;

import java.io.IOException;
import java.util.List;

interface Reader {
    List<ResourceConsumption> readLines (int limitConsumption) throws IOException;
}
