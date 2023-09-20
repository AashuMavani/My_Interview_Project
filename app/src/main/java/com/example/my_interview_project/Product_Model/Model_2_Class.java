package com.example.my_interview_project.Product_Model;

public class Model_2_Class {
    String title1;
    String type;
    String isViewAll;
    String isBorder;
    String screenNo1;
    String bgColor1;

    public Model_2_Class(String title1, String type, String isViewAll, String isBorder, String screenNo1, String bgColor1) {
        this.title1 = title1;
        this.type = type;
        this.isViewAll = isViewAll;
        this.isBorder = isBorder;
        this.screenNo1 = screenNo1;
        this.bgColor1 = bgColor1;
    }

    public String getTitle1() {
        return title1;
    }

    public void setTitle1(String title1) {
        this.title1 = title1;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIsViewAll() {
        return isViewAll;
    }

    public void setIsViewAll(String isViewAll) {
        this.isViewAll = isViewAll;
    }

    public String getIsBorder() {
        return isBorder;
    }

    public void setIsBorder(String isBorder) {
        this.isBorder = isBorder;
    }

    public String getScreenNo1() {
        return screenNo1;
    }

    public void setScreenNo1(String screenNo1) {
        this.screenNo1 = screenNo1;
    }

    public String getBgColor1() {
        return bgColor1;
    }

    public void setBgColor1(String bgColor1) {
        this.bgColor1 = bgColor1;
    }

    @Override
    public String toString() {
        return "Model_2_Class{" +
                "title1='" + title1 + '\'' +
                ", type='" + type + '\'' +
                ", isViewAll='" + isViewAll + '\'' +
                ", isBorder='" + isBorder + '\'' +
                ", screenNo1='" + screenNo1 + '\'' +
                ", bgColor1='" + bgColor1 + '\'' +
                '}';
    }
}
