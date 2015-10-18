package com.kraevskiy.vclone.app2.POJO;

public class Group {

    public static String[] TYPES = { "Group", "Public Page", "Event" };
    public static String NAME = "Name";
    public static String SCREEN_NAME = "Screen name";
    public static String NAME_SEPARATOR = "#";

    private int id;
    private String name;
    private String screenName;
    private boolean isClosed;
    private String type;
    private boolean isAdmin;
    private boolean isMember;
    private int photo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setIsClosed(boolean isClosed) {
        this.isClosed = isClosed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public boolean isMember() {
        return isMember;
    }

    public void setIsMember(boolean isMember) {
        this.isMember = isMember;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", screenName='" + screenName + '\'' +
                ", isClosed=" + isClosed +
                ", type='" + type + '\'' +
                ", isAdmin=" + isAdmin +
                ", isMember=" + isMember +
                ", photo=" + photo +
                '}';
    }
}
