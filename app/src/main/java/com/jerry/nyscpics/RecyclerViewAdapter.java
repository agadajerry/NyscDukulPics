package com.jerry.nyscpics;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.CorperViewHolder> {

    ArrayList<Corps>newCorperList;

    private OnItemClickListener mListener;
    Context context;

    public interface OnItemClickListener{
        void onItemClick(int position);
    }
    public void setOnItemClickListener(OnItemClickListener listener){
        mListener = listener;
    }


    public RecyclerViewAdapter(ArrayList<Corps> newCorperList) {
        this.newCorperList = newCorperList;
    }

    public static class CorperViewHolder extends RecyclerView.ViewHolder {

         CardView cardView;
         ImageView imageView;
         TextView corpName;
         TextView phoneNo;
        View view;
        public CorperViewHolder(@NonNull View itemView, final OnItemClickListener myListener) {
            super(itemView);
            this.view = itemView;
            cardView = itemView.findViewById(R.id.cardView);
            imageView = itemView.findViewById(R.id.imageId);
            corpName = itemView.findViewById(R.id.corpNameId);
            phoneNo = itemView.findViewById(R.id.phoneNo);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if(myListener!=null){
                        int position = getAdapterPosition();
                        if(position!= RecyclerView.NO_POSITION){
                            myListener.onItemClick(position);
                        }
                    }
                }
            });



        }
    }


    @NonNull
    @Override
    public CorperViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View myView = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_layout, parent, false);
        return new CorperViewHolder(myView,mListener);
    }

    @Override
    public void onBindViewHolder(@NonNull CorperViewHolder holder, int position) {

        Corps myCorps = newCorperList.get(position);
        holder.corpName.setText((myCorps.getName()));
       // holder.imageView.setImageResource(myCorps.getLogoId());

        Picasso.with(holder.itemView.getContext()).load(myCorps.getLogoId()).into(holder.imageView);
        holder.phoneNo.setText(myCorps.getPhoneNo());


    }

    @Override
    public int getItemCount() {

        if(newCorperList!=null) {
            return newCorperList.size();
        }else{
            return 0;
        }
    }


}
