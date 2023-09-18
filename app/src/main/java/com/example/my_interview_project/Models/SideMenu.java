
package com.example.my_interview_project.Models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class SideMenu {

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("isLoginNeed")
    @Expose
    private String isLoginNeed;
    @SerializedName("titleColor")
    @Expose
    private String titleColor;
    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("labelColor")
    @Expose
    private String labelColor;
    @SerializedName("labelBGColor")
    @Expose
    private String labelBGColor;
    @SerializedName("isBlink")
    @Expose
    private String isBlink;
    @SerializedName("offerId")
    @Expose
    private String offerId;
    @SerializedName("gameId")
    @Expose
    private String gameId;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("screenNo")
    @Expose
    private String screenNo;
    @SerializedName("icon")
    @Expose
    private String icon;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsLoginNeed() {
        return isLoginNeed;
    }

    public void setIsLoginNeed(String isLoginNeed) {
        this.isLoginNeed = isLoginNeed;
    }

    public String getTitleColor() {
        return titleColor;
    }

    public void setTitleColor(String titleColor) {
        this.titleColor = titleColor;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getLabelColor() {
        return labelColor;
    }

    public void setLabelColor(String labelColor) {
        this.labelColor = labelColor;
    }

    public String getLabelBGColor() {
        return labelBGColor;
    }

    public void setLabelBGColor(String labelBGColor) {
        this.labelBGColor = labelBGColor;
    }

    public String getIsBlink() {
        return isBlink;
    }

    public void setIsBlink(String isBlink) {
        this.isBlink = isBlink;
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

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SideMenu.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("isLoginNeed");
        sb.append('=');
        sb.append(((this.isLoginNeed == null)?"<null>":this.isLoginNeed));
        sb.append(',');
        sb.append("titleColor");
        sb.append('=');
        sb.append(((this.titleColor == null)?"<null>":this.titleColor));
        sb.append(',');
        sb.append("label");
        sb.append('=');
        sb.append(((this.label == null)?"<null>":this.label));
        sb.append(',');
        sb.append("labelColor");
        sb.append('=');
        sb.append(((this.labelColor == null)?"<null>":this.labelColor));
        sb.append(',');
        sb.append("labelBGColor");
        sb.append('=');
        sb.append(((this.labelBGColor == null)?"<null>":this.labelBGColor));
        sb.append(',');
        sb.append("isBlink");
        sb.append('=');
        sb.append(((this.isBlink == null)?"<null>":this.isBlink));
        sb.append(',');
        sb.append("offerId");
        sb.append('=');
        sb.append(((this.offerId == null)?"<null>":this.offerId));
        sb.append(',');
        sb.append("gameId");
        sb.append('=');
        sb.append(((this.gameId == null)?"<null>":this.gameId));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("screenNo");
        sb.append('=');
        sb.append(((this.screenNo == null)?"<null>":this.screenNo));
        sb.append(',');
        sb.append("icon");
        sb.append('=');
        sb.append(((this.icon == null)?"<null>":this.icon));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
