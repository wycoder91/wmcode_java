package com.ruoyi.wmencoder.domain.base;

public class Optional {
    private int id;
    private String description;
    private String category;
    private char optionalItemId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public char getOptionalItemId() {
        return optionalItemId;
    }

    public void setOptionalItemId(char optionalItemId) {
        this.optionalItemId = optionalItemId;
    }
}
