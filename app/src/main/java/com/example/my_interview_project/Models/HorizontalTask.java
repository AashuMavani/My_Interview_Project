
package com.example.my_interview_project.Models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class HorizontalTask {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("txtButtone1")
    @Expose
    private String txtButtone1;
    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("isNewLable")
    @Expose
    private String isNewLable;
    @SerializedName("points")
    @Expose
    private String points;
    @SerializedName("icon")
    @Expose
    private String icon;
    @SerializedName("btnColor")
    @Expose
    private String btnColor;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("isShowDetails")
    @Expose
    private String isShowDetails;
    @SerializedName("isBlink")
    @Expose
    private String isBlink;
    @SerializedName("bgColor")
    @Expose
    private String bgColor;

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

    public String getTxtButtone1() {
        return txtButtone1;
    }

    public void setTxtButtone1(String txtButtone1) {
        this.txtButtone1 = txtButtone1;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getIsNewLable() {
        return isNewLable;
    }

    public void setIsNewLable(String isNewLable) {
        this.isNewLable = isNewLable;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getBtnColor() {
        return btnColor;
    }

    public void setBtnColor(String btnColor) {
        this.btnColor = btnColor;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIsShowDetails() {
        return isShowDetails;
    }

    public void setIsShowDetails(String isShowDetails) {
        this.isShowDetails = isShowDetails;
    }

    public String getIsBlink() {
        return isBlink;
    }

    public void setIsBlink(String isBlink) {
        this.isBlink = isBlink;
    }

    public String getBgColor() {
        return bgColor;
    }

    public void setBgColor(String bgColor) {
        this.bgColor = bgColor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(HorizontalTask.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("txtButtone1");
        sb.append('=');
        sb.append(((this.txtButtone1 == null)?"<null>":this.txtButtone1));
        sb.append(',');
        sb.append("label");
        sb.append('=');
        sb.append(((this.label == null)?"<null>":this.label));
        sb.append(',');
        sb.append("isNewLable");
        sb.append('=');
        sb.append(((this.isNewLable == null)?"<null>":this.isNewLable));
        sb.append(',');
        sb.append("points");
        sb.append('=');
        sb.append(((this.points == null)?"<null>":this.points));
        sb.append(',');
        sb.append("icon");
        sb.append('=');
        sb.append(((this.icon == null)?"<null>":this.icon));
        sb.append(',');
        sb.append("btnColor");
        sb.append('=');
        sb.append(((this.btnColor == null)?"<null>":this.btnColor));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("isShowDetails");
        sb.append('=');
        sb.append(((this.isShowDetails == null)?"<null>":this.isShowDetails));
        sb.append(',');
        sb.append("isBlink");
        sb.append('=');
        sb.append(((this.isBlink == null)?"<null>":this.isBlink));
        sb.append(',');
        sb.append("bgColor");
        sb.append('=');
        sb.append(((this.bgColor == null)?"<null>":this.bgColor));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
