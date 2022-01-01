package com.modelsFC;

import java.util.List;

public class Tag {
    String name;

    List<UserTags> userTagsList;

    public Tag(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<UserTags> getUserTagsList() {
        return userTagsList;
    }
}
