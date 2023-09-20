package com.example.my_interview_project.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.my_interview_project.MainActivity;
import com.example.my_interview_project.Product_Model.Model_2_Class;
import com.example.my_interview_project.R;

import java.util.ArrayList;

public class Recyclerview_2_Adapter extends RecyclerView.Adapter<Recyclerview_2_Adapter.Holder> {
    MainActivity mainActivity;
    ArrayList<Model_2_Class> productModellist_2;
    public Recyclerview_2_Adapter(MainActivity mainActivity, ArrayList<Model_2_Class> productModellist_2) {
        this.mainActivity=mainActivity;
        this.productModellist_2=productModellist_2;
    }

    @NonNull
    @Override
    public Recyclerview_2_Adapter.Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(mainActivity).inflate(R.layout.recyclerview_2_itemfile,parent,false);
        Holder holder=new Holder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Recyclerview_2_Adapter.Holder holder, int position) {
        holder.text1.setText(""+productModellist_2.get(position).getTitle1());
        holder.text2.setText(""+productModellist_2.get(position).getType());
        holder.text3.setText(""+productModellist_2.get(position).getIsViewAll());
        holder.text4.setText(""+productModellist_2.get(position).getIsBorder());
        holder.text5.setText(""+productModellist_2.get(position).getScreenNo1());
        holder.text6.setText(""+productModellist_2.get(position).getBgColor1());


    }

    @Override
    public int getItemCount() {
        return productModellist_2.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        TextView text1,text2,text3,text4,text5,text6;

        public Holder(@NonNull View itemView) {

            super(itemView);
            text1=itemView.findViewById(R.id.text1);
            text2=itemView.findViewById(R.id.text2);
            text3=itemView.findViewById(R.id.text3);
            text4=itemView.findViewById(R.id.text4);
            text5=itemView.findViewById(R.id.text5);
            text6=itemView.findViewById(R.id.text6);
        }
    }
}
