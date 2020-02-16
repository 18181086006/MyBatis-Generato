package com.model;

public class Sort {
    private Integer id;

    private String title;

    private String icon;

    private String desc;

    public Sort(Integer id, String title, String icon, String desc) {
        this.id = id;
        this.title = title;
        this.icon = icon;
        this.desc = desc;
    }

    public Sort() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }
}