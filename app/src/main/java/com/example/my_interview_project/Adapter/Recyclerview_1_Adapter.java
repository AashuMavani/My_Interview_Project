package com.example.my_interview_project.Adapter;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.my_interview_project.MainActivity;
import com.example.my_interview_project.Product_Model.Model_1_Class;
import com.example.my_interview_project.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class Recyclerview_1_Adapter extends RecyclerView.Adapter<Recyclerview_1_Adapter.Holder> {
    MainActivity mainActivity;
    ArrayList<Model_1_Class> productModellist1;



    public Recyclerview_1_Adapter(MainActivity mainActivity, ArrayList<Model_1_Class> productModellist1) {
        this.mainActivity=mainActivity;
        this.productModellist1=productModellist1;
    }

    @NonNull
    @Override
    public Recyclerview_1_Adapter.Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(mainActivity).inflate(R.layout.recyclerview_1_itemfile,parent,false);
        Holder holder=new Holder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Recyclerview_1_Adapter.Holder holder, int position) {

        holder.title.setText(""+productModellist1.get(position).getTitle());
        holder.screeNo.setText(""+productModellist1.get(position).getScreenNo());
        holder.bgcolor.setText(""+productModellist1.get(position).getBgColor());
        holder.entrydata.setText(""+productModellist1.get(position).getEntryData());
        holder.id.setText(""+productModellist1.get(position).getId());
        Log.d("TTT", "onBindViewHolder:title=="+productModellist1.get(0).getTitle());
        Log.d("TTT", "onBindViewHolder:screenNo=="+productModellist1.get(0).getScreenNo());
        Log.d("TTT", "onBindViewHolder: bgcolor=="+productModellist1.get(0).getBgColor());
        Log.d("TTT", "onBindViewHolder: entrydata=="+productModellist1.get(0).getEntryData());
        Glide
                .with(mainActivity)
                .load(productModellist1.get(position).getImage())
                .centerCrop()
                .placeholder(R.drawable.rotation)
                .into(holder.url);

    }

    @Override
    public int getItemCount() {

       return productModellist1.size();
    }

    public class Holder extends RecyclerView.ViewHolder {

        TextView title,screeNo,bgcolor,entrydata,id;

        CircleImageView url;
        public Holder(@NonNull View itemView) {
            
            super(itemView);

           title=itemView.findViewById(R.id.title);
           screeNo=itemView.findViewById(R.id.screeNo);
           bgcolor=itemView.findViewById(R.id.bgcolor);
           entrydata=itemView.findViewById(R.id.entrydata);
           id=itemView.findViewById(R.id.id);
           url=itemView.findViewById(R.id.url);
        }
    }
}
