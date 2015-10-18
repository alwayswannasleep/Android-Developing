package com.kraevskiy.vclone.app2.POJO;

import java.io.Serializable;

public class Friend implements Serializable {

    public static final String FRIEND_FIRST_NAME = "Firstname";
    public static final String FRIEND_LAST_NAME = "Lastname";
    public static final String FRIEND_NICKNAME = "Nickname";
    public static final String FRIEND_CITY = "City";
    public static final String FRIEND_COUNTRY = "Country";
    public static final String FRIEND_EDUCATION = "Education";
    public static final String FRIEND_RELATION = "Relation";
    public static final String FRIEND_STATUS = "My status";
    public static final String FRIEND_UNIVERSITIES = "University";

    public static final long LAST_SEEN_MILLISECONDS_COUNT = 1000000000;

    public static final String FRIEND_STRING_SEPARATOR = "#";

    private int id;
    private String firstName;
    private String lastName;
    private boolean isOnline;
    private String nickName;
    private String sex;
    private String birthDate;
    private String city;
    private String country;
    private int photo;
    private boolean hasMobile;
    private String education;
    private String relation;
    private String lastSeen;
    private String status;
    private boolean canWritePrivateMessage;
    private boolean canSeeAllPosts;
    private boolean canPost;
    private String universities;

    @Override
    public String toString() {
        return "Friend{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", isOnline=" + isOnline +
                ", nickName='" + nickName + '\'' +
                ", sex='" + sex + '\'' +
                ", birthDate=" + birthDate +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", photo=" + photo +
                ", hasMobile=" + hasMobile +
                ", education='" + education + '\'' +
                ", relation=" + relation +
                ", lastSeen=" + lastSeen +
                ", status='" + status + '\'' +
                ", canWritePrivateMessage=" + canWritePrivateMessage +
                ", canSeeAllPosts=" + canSeeAllPosts +
                ", canPost=" + canPost +
                ", universities='" + universities + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setIsOnline(boolean isOnline) {
        this.isOnline = isOnline;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public boolean hasMobile() {
        return hasMobile;
    }

    public void setHasMobile(boolean hasMobile) {
        this.hasMobile = hasMobile;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public String getLastSeen() {
        return lastSeen;
    }

    public void setLastSeen(String lastSeen) {
        this.lastSeen = lastSeen;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isCanWritePrivateMessage() {
        return canWritePrivateMessage;
    }

    public void setCanWritePrivateMessage(boolean canWritePrivateMessage) {
        this.canWritePrivateMessage = canWritePrivateMessage;
    }

    public boolean canSeeAllPosts() {
        return canSeeAllPosts;
    }

    public void setCanSeeAllPosts(boolean canSeeAllPosts) {
        this.canSeeAllPosts = canSeeAllPosts;
    }

    public boolean canPost() {
        return canPost;
    }

    public void setCanPost(boolean canPost) {
        this.canPost = canPost;
    }

    public String getUniversities() {
        return universities;
    }

    public void setUniversities(String universities) {
        this.universities = universities;
    }
}
