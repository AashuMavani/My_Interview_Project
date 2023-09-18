package com.example.my_interview_project;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Instance_Class {
  public static Retro_Interface CallAPI(){
      Retrofit retrofit=new Retrofit.Builder()
              .baseUrl("https://myrewardwallet.com/App/api100/")
              .addConverterFactory(GsonConverterFactory.create())
              .build();
      return retrofit.create(Retro_Interface.class);
  }
}
