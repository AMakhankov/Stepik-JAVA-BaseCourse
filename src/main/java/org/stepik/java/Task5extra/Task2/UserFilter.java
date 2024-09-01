package org.stepik.java.Task5extra.Task2;

import java.util.ArrayList;
import java.util.List;

public class UserFilter {
    public List<UserResourcesConsumption> filter(List<UserResourcesConsumption> users, int limitConsumption) {
        List<UserResourcesConsumption> ecoFriendlyUsers = new ArrayList<>();

        for (UserResourcesConsumption user : users) {
            if (user.isEcoFriendly(limitConsumption)) {
                ecoFriendlyUsers.add(user);
            }
        }

        return ecoFriendlyUsers;
    }
}