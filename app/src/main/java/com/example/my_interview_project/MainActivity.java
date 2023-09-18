package com.example.my_interview_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.util.Log;

import com.example.my_interview_project.Models.ModelClass_Main;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView1,recyclerView2,recyclerView3;
    List<ModelClass_Main>mainmodellist=new ArrayList<>();
    ArrayList<ProductData_Model_Class>productlist=new ArrayList<>();

    LinearLayoutManager linearLayoutManager;
    GridLayoutManager gridLayoutManager;
    StaggeredGridLayoutManager staggeredGridLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       recyclerView1=findViewById(R.id.recyclerview1);
       recyclerView2=findViewById(R.id.recyclerview2);
       recyclerView3=findViewById(R.id.recyclerview3);
      gridLayoutManager=new GridLayoutManager(this,3,RecyclerView.HORIZONTAL,false);
      recyclerView1.setLayoutManager(gridLayoutManager);

     Instance_Class.CallAPI().callMain().enqueue(new Callback<List<ModelClass_Main>>() {
         @Override
         public void onResponse(Call<List<ModelClass_Main>> call, Response<List<ModelClass_Main>> response) {
             Log.d("AAA", "onResponse: "+response.body().toString());

             mainmodellist=response.body();
             for (int i=0;i<mainmodellist.size();i++)
             {

             }

         }

         @Override
         public void onFailure(Call<List<ModelClass_Main>> call, Throwable t) {

         }
     });
    }
}