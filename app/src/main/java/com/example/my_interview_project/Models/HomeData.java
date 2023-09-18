
package com.example.my_interview_project.Models;

import java.util.List;



import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class HomeData {

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("isViewAll")
    @Expose
    private String isViewAll;
    @SerializedName("isBorder")
    @Expose
    private String isBorder;
    @SerializedName("screenNo")
    @Expose
    private String screenNo;
    @SerializedName("bgColor")
    @Expose
    private String bgColor;
    @SerializedName("data")
    @Expose
    private List<Home_Slider_Data> data;
    @SerializedName("horizontalTaskList")
    @Expose
    private List<HorizontalTask> horizontalTaskList;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("subTitle")
    @Expose
    private String subTitle;
    @SerializedName("icon")
    @Expose
    private String icon;
    @SerializedName("isActive")
    @Expose
    private String isActive;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public List<Home_Slider_Data> getData() {
        return data;
    }

    public void setData(List<Home_Slider_Data> data) {
        this.data = data;
    }

    public List<HorizontalTask> getHorizontalTaskList() {
        return horizontalTaskList;
    }

    public void setHorizontalTaskList(List<HorizontalTask> horizontalTaskList) {
        this.horizontalTaskList = horizontalTaskList;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(HomeData.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("isViewAll");
        sb.append('=');
        sb.append(((this.isViewAll == null)?"<null>":this.isViewAll));
        sb.append(',');
        sb.append("isBorder");
        sb.append('=');
        sb.append(((this.isBorder == null)?"<null>":this.isBorder));
        sb.append(',');
        sb.append("screenNo");
        sb.append('=');
        sb.append(((this.screenNo == null)?"<null>":this.screenNo));
        sb.append(',');
        sb.append("bgColor");
        sb.append('=');
        sb.append(((this.bgColor == null)?"<null>":this.bgColor));
        sb.append(',');
        sb.append("data");
        sb.append('=');
        sb.append(((this.data == null)?"<null>":this.data));
        sb.append(',');
        sb.append("horizontalTaskList");
        sb.append('=');
        sb.append(((this.horizontalTaskList == null)?"<null>":this.horizontalTaskList));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("subTitle");
        sb.append('=');
        sb.append(((this.subTitle == null)?"<null>":this.subTitle));
        sb.append(',');
        sb.append("icon");
        sb.append('=');
        sb.append(((this.icon == null)?"<null>":this.icon));
        sb.append(',');
        sb.append("isActive");
        sb.append('=');
        sb.append(((this.isActive == null)?"<null>":this.isActive));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
