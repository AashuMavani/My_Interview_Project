package com.example.my_interview_project;

import com.example.my_interview_project.Models.ModelClass_Main;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Retro_Interface {
    @FormUrlEncoded
    @POST("HomeData")
    Call <List<ModelClass_Main>> callMain();
}
