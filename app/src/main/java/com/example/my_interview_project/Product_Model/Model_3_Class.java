package com.example.my_interview_project.Product_Model;

public class Model_3_Class {
   String titleColor;
   String title;
   String icon;
   String isLoginNeed;

    public Model_3_Class(String titleColor, String title, String icon, String isLoginNeed) {
        this.titleColor = titleColor;
        this.title = title;
        this.icon = icon;
        this.isLoginNeed = isLoginNeed;
    }

    public String getTitleColor() {
        return titleColor;
    }

    public void setTitleColor(String titleColor) {
        this.titleColor = titleColor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getIsLoginNeed() {
        return isLoginNeed;
    }

    public void setIsLoginNeed(String isLoginNeed) {
        this.isLoginNeed = isLoginNeed;
    }

    @Override
    public String toString() {
        return "Model_3_Class{" +
                "titleColor='" + titleColor + '\'' +
                ", title='" + title + '\'' +
                ", icon='" + icon + '\'' +
                ", isLoginNeed='" + isLoginNeed + '\'' +
                '}';
    }
}
