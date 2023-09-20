package com.example.my_interview_project.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.my_interview_project.MainActivity;
import com.example.my_interview_project.Product_Model.Model_3_Class;
import com.example.my_interview_project.R;

import java.util.ArrayList;

public class Recyclerview_3_Adapter extends RecyclerView.Adapter<Recyclerview_3_Adapter.Holder> {
    MainActivity mainActivity;
    ArrayList<Model_3_Class> productModellist3;

    public Recyclerview_3_Adapter(MainActivity mainActivity, ArrayList<Model_3_Class> productModellist3) {
        this.mainActivity=mainActivity;
        this.productModellist3=productModellist3;
    }

    @NonNull
    @Override
    public Recyclerview_3_Adapter.Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(mainActivity).inflate(R.layout.recyclerview_3_itemfile,parent,false);
        Holder holder=new Holder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Recyclerview_3_Adapter.Holder holder, int position) {
        holder.t1.setText(""+productModellist3.get(position).getTitle());
        holder.t2.setText(""+productModellist3.get(position).getTitleColor());
        holder.t3.setText(""+productModellist3.get(position).getIsLoginNeed());
        Glide
                .with(mainActivity)
                .load(productModellist3.get(position).getIcon())
                .centerCrop()
                .placeholder(R.drawable.rotation)
                .into(holder.img);

    }

    @Override
    public int getItemCount() {
        return productModellist3.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        TextView t1,t2,t3;
        ImageView img;
        public Holder(@NonNull View itemView) {
            super(itemView);
            t1=itemView.findViewById(R.id.t1);
            t2=itemView.findViewById(R.id.t2);
            t3=itemView.findViewById(R.id.t3);
            img=itemView.findViewById(R.id.img);
        }
    }
}
