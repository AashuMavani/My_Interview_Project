
package com.example.my_interview_project.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class LoginSlider {

    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("screenNo")
    @Expose
    private String screenNo;

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LoginSlider.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("image");
        sb.append('=');
        sb.append(((this.image == null)?"<null>":this.image));
        sb.append(',');
        sb.append("screenNo");
        sb.append('=');
        sb.append(((this.screenNo == null)?"<null>":this.screenNo));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
