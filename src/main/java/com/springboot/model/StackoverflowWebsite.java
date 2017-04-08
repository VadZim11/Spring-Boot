package com.springboot.model;

public class StackoverflowWebsite{
    private final String iconImageUrl;
    private final String id;
    private final String website;
    private final String title;
    private final String description;

    public StackoverflowWebsite(String iconImageUrl, String id, String website, String title, String description) {
        this.iconImageUrl = iconImageUrl;
        this.id = id;
        this.website = website;
        this.title = title;
        this.description = description;
    }

    public String getIconImageUrl() {
        return iconImageUrl;
    }

    public String getId() {
        return id;
    }

    public String getWebsite() {
        return website;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }


}
