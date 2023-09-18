
package com.example.my_interview_project.Models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Home_Slider_Data {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("appId")
    @Expose
    private String appId;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("jsonImage")
    @Expose
    private String jsonImage;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("screenNo")
    @Expose
    private String screenNo;
    @SerializedName("btnName")
    @Expose
    private String btnName;
    @SerializedName("btnColor")
    @Expose
    private String btnColor;
    @SerializedName("btnTextColor")
    @Expose
    private String btnTextColor;
    @SerializedName("sliderIndex")
    @Expose
    private String sliderIndex;
    @SerializedName("bgColor")
    @Expose
    private String bgColor;
    @SerializedName("lable")
    @Expose
    private String lable;
    @SerializedName("lableColor")
    @Expose
    private String lableColor;
    @SerializedName("offerId")
    @Expose
    private String offerId;
    @SerializedName("gameId")
    @Expose
    private String gameId;
    @SerializedName("taskId")
    @Expose
    private String taskId;
    @SerializedName("isActive")
    @Expose
    private String isActive;
    @SerializedName("startDate")
    @Expose
    private String startDate;
    @SerializedName("entryDate")
    @Expose
    private String entryDate;
    @SerializedName("endDate")
    @Expose
    private String endDate;
    @SerializedName("displayImage")
    @Expose
    private String displayImage;

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

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getJsonImage() {
        return jsonImage;
    }

    public void setJsonImage(String jsonImage) {
        this.jsonImage = jsonImage;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getScreenNo() {
        return screenNo;
    }

    public void setScreenNo(String screenNo) {
        this.screenNo = screenNo;
    }

    public String getBtnName() {
        return btnName;
    }

    public void setBtnName(String btnName) {
        this.btnName = btnName;
    }

    public String getBtnColor() {
        return btnColor;
    }

    public void setBtnColor(String btnColor) {
        this.btnColor = btnColor;
    }

    public String getBtnTextColor() {
        return btnTextColor;
    }

    public void setBtnTextColor(String btnTextColor) {
        this.btnTextColor = btnTextColor;
    }

    public String getSliderIndex() {
        return sliderIndex;
    }

    public void setSliderIndex(String sliderIndex) {
        this.sliderIndex = sliderIndex;
    }

    public String getBgColor() {
        return bgColor;
    }

    public void setBgColor(String bgColor) {
        this.bgColor = bgColor;
    }

    public String getLable() {
        return lable;
    }

    public void setLable(String lable) {
        this.lable = lable;
    }

    public String getLableColor() {
        return lableColor;
    }

    public void setLableColor(String lableColor) {
        this.lableColor = lableColor;
    }

    public String getOfferId() {
        return offerId;
    }

    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getDisplayImage() {
        return displayImage;
    }

    public void setDisplayImage(String displayImage) {
        this.displayImage = displayImage;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Home_Slider_Data.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("appId");
        sb.append('=');
        sb.append(((this.appId == null)?"<null>":this.appId));
        sb.append(',');
        sb.append("image");
        sb.append('=');
        sb.append(((this.image == null)?"<null>":this.image));
        sb.append(',');
        sb.append("jsonImage");
        sb.append('=');
        sb.append(((this.jsonImage == null)?"<null>":this.jsonImage));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("screenNo");
        sb.append('=');
        sb.append(((this.screenNo == null)?"<null>":this.screenNo));
        sb.append(',');
        sb.append("btnName");
        sb.append('=');
        sb.append(((this.btnName == null)?"<null>":this.btnName));
        sb.append(',');
        sb.append("btnColor");
        sb.append('=');
        sb.append(((this.btnColor == null)?"<null>":this.btnColor));
        sb.append(',');
        sb.append("btnTextColor");
        sb.append('=');
        sb.append(((this.btnTextColor == null)?"<null>":this.btnTextColor));
        sb.append(',');
        sb.append("sliderIndex");
        sb.append('=');
        sb.append(((this.sliderIndex == null)?"<null>":this.sliderIndex));
        sb.append(',');
        sb.append("bgColor");
        sb.append('=');
        sb.append(((this.bgColor == null)?"<null>":this.bgColor));
        sb.append(',');
        sb.append("lable");
        sb.append('=');
        sb.append(((this.lable == null)?"<null>":this.lable));
        sb.append(',');
        sb.append("lableColor");
        sb.append('=');
        sb.append(((this.lableColor == null)?"<null>":this.lableColor));
        sb.append(',');
        sb.append("offerId");
        sb.append('=');
        sb.append(((this.offerId == null)?"<null>":this.offerId));
        sb.append(',');
        sb.append("gameId");
        sb.append('=');
        sb.append(((this.gameId == null)?"<null>":this.gameId));
        sb.append(',');
        sb.append("taskId");
        sb.append('=');
        sb.append(((this.taskId == null)?"<null>":this.taskId));
        sb.append(',');
        sb.append("isActive");
        sb.append('=');
        sb.append(((this.isActive == null)?"<null>":this.isActive));
        sb.append(',');
        sb.append("startDate");
        sb.append('=');
        sb.append(((this.startDate == null)?"<null>":this.startDate));
        sb.append(',');
        sb.append("entryDate");
        sb.append('=');
        sb.append(((this.entryDate == null)?"<null>":this.entryDate));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("displayImage");
        sb.append('=');
        sb.append(((this.displayImage == null)?"<null>":this.displayImage));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
