package com.example.my_interview_project.Product_Model;

public class Model_1_Class {

    String id;
    String title;
    String image;
    String screenNo;
    String bgColor;
    String entryData;

    public Model_1_Class(String id, String title, String image, String screenNo, String bgColor, String entryData) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.screenNo = screenNo;
        this.bgColor = bgColor;
        this.entryData = entryData;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getScreenNo() {
        return screenNo;
    }

    public void setScreenNo(String screenNo) {
        this.screenNo = screenNo;
    }

    public String getBgColor() {
        return bgColor;
    }

    public void setBgColor(String bgColor) {
        this.bgColor = bgColor;
    }

    public String getEntryData() {
        return entryData;
    }

    public void setEntryData(String entryData) {
        this.entryData = entryData;
    }

    @Override
    public String toString() {
        return "Model_1_Class{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", image='" + image + '\'' +
                ", screenNo='" + screenNo + '\'' +
                ", bgColor='" + bgColor + '\'' +
                ", entryData='" + entryData + '\'' +
                '}';
    }
}
