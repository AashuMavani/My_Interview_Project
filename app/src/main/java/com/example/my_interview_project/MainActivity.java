package com.example.my_interview_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.my_interview_project.Adapter.Recyclerview_1_Adapter;
import com.example.my_interview_project.Adapter.Recyclerview_2_Adapter;
import com.example.my_interview_project.Adapter.Recyclerview_3_Adapter;
import com.example.my_interview_project.Models.HomeData;
import com.example.my_interview_project.Models.HomeSlider;
import com.example.my_interview_project.Models.ModelClass_Main;
import com.example.my_interview_project.Models.SideMenu;
import com.example.my_interview_project.Product_Model.Model_1_Class;
import com.example.my_interview_project.Product_Model.Model_2_Class;
import com.example.my_interview_project.Product_Model.Model_3_Class;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView1,recyclerView2,recyclerView3;
    List<HomeSlider>mainmodellist=new ArrayList<>();
    List<HomeData>homeDatalist=new ArrayList<>();
    List<SideMenu>sideMenus=new ArrayList<>();

    ArrayList<Model_1_Class>productModellist_1=new ArrayList<>();
    ArrayList<Model_2_Class>productModellist_2=new ArrayList<>();
    ArrayList<Model_3_Class>productModellist_3=new ArrayList<>();


    LinearLayoutManager linearLayoutManager;
    GridLayoutManager gridLayoutManager;
    StaggeredGridLayoutManager staggeredGridLayoutManager;
  Recyclerview_1_Adapter adapter1;
  Recyclerview_2_Adapter adapter2;
  Recyclerview_3_Adapter adapter3;
    String pid,offerId,fakeEarningPoint,packageInstallTrackingUrl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       recyclerView1=findViewById(R.id.recyclerview1);
       recyclerView2=findViewById(R.id.recyclerview2);
       recyclerView3=findViewById(R.id.recyclerview3);


      //recyclerView1.setLayoutManager(new LinearLayoutManager(MainActivity.this));
     linearLayoutManager=new LinearLayoutManager(MainActivity.this,RecyclerView.HORIZONTAL,false);
      recyclerView1.setLayoutManager(linearLayoutManager);
      adapter1=new Recyclerview_1_Adapter(MainActivity.this,productModellist_1);



      staggeredGridLayoutManager=new StaggeredGridLayoutManager(3,RecyclerView.VERTICAL);
     adapter2=new Recyclerview_2_Adapter(MainActivity.this,productModellist_2);
     recyclerView2.setLayoutManager(staggeredGridLayoutManager);


      gridLayoutManager=new GridLayoutManager(MainActivity.this,1,RecyclerView.HORIZONTAL,false);
     adapter3=new Recyclerview_3_Adapter(MainActivity.this,productModellist_3);
     recyclerView3.setLayoutManager(gridLayoutManager);





        Instance_Class.CallAPI().callMain(pid,offerId,fakeEarningPoint,packageInstallTrackingUrl).enqueue(new Callback<ModelClass_Main>() {
            @Override
            public void onResponse(Call<ModelClass_Main> call, Response<ModelClass_Main> response) {
                Log.d("TTT", "onResponse:response======= "+response.body());

                mainmodellist= response.body().getHomeSlider();


                Log.d("AAA", "onResponse: homeSlider="+response.body().getHomeSlider().get(0).getBgColor());
                for (int i=0;i<mainmodellist.size();i++)
                {
                    String id=response.body().getHomeSlider().get(i).getId();
                    String title=response.body().getHomeSlider().get(i).getTitle();
                    String screenNo=response.body().getHomeSlider().get(i).getScreenNo();
                    String bgColor=response.body().getHomeSlider().get(i).getBgColor();
                    String image=response.body().getHomeSlider().get(i).getImage();
                    String entryData=response.body().getHomeSlider().get(i).getEntryDate();
                    Model_1_Class model1Class=new Model_1_Class(id,title,screenNo,bgColor,image,entryData);

                    productModellist_1.add(model1Class);

                    Log.d("CCC", "onResponse: id===="+productModellist_1.get(0).getId());
                    Log.d("CCC", "onResponse: title==="+productModellist_1.get(0).getTitle());
                    Log.d("CCC", "onResponse: bgcolor==="+productModellist_1.get(0).getBgColor());
                    Log.d("CCC", "onResponse: entrydata==="+productModellist_1.get(0).getEntryData());
                    recyclerView1.setAdapter(adapter1);
                    adapter1.notifyDataSetChanged();

                }
                homeDatalist=response.body().getHomeDataList();
                for (int j=0;j<homeDatalist.size();j++)
                {
                    String title1=response.body().getHomeDataList().get(j).getTitle();
                    String type=response.body().getHomeDataList().get(j).getType();
                    String isViewAll=response.body().getHomeDataList().get(j).getIsViewAll();
                    String isBorder=response.body().getHomeDataList().get(j).getIsBorder();
                    String screenNo1=response.body().getHomeDataList().get(j).getScreenNo();
                    String bgColor1=response.body().getHomeDataList().get(j).getBgColor();
                    Model_2_Class model2Class=new Model_2_Class(title1,type,isViewAll,isBorder,screenNo1,bgColor1);
                    productModellist_2.add(model2Class);
                    recyclerView2.setAdapter(adapter2);
                    adapter2.notifyDataSetChanged();


                }

                sideMenus=response.body().getSideMenuList();
                for (int k=0;k<sideMenus.size();k++)
                {
                    String titleColor=response.body().getSideMenuList().get(k).getTitleColor();
                    String title=response.body().getSideMenuList().get(k).getTitle();
                    String icon=response.body().getSideMenuList().get(k).getIcon();
                    String isLoginNeed=response.body().getSideMenuList().get(k).getIsLoginNeed();

                    Model_3_Class model3Class=new Model_3_Class(titleColor,title,icon,isLoginNeed);
                    productModellist_3.add(model3Class);
                    recyclerView3.setAdapter(adapter3);
                    adapter3.notifyDataSetChanged();
                }



            }

            @Override
            public void onFailure(Call<ModelClass_Main> call, Throwable t) {
                Log.d("TTT", "onFailure: Error"+t.getLocalizedMessage());
                Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();

            }
        });


    }
}