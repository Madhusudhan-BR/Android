package com.example.madhusudhanbr.assignment4;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.Map;

/**
 * Created by madhusudhanb.r on 9/29/17.
 */

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.ViewHolder> {

    public interface OnItemClickListener {
        public void onItemClick(View view, int position);
        public void onItemLongClick(View view, int position);
        public void onCheckBoxClick(View view, int position);
    }

    private List<Map<String, ?>> mDataSet = new MovieData().getMoviesList();
    private Context mContext;
    OnItemClickListener mItemClickListener;

    public void SetOnItemClickListener(final OnItemClickListener mItemClick){
        this.mItemClickListener = mItemClick;
    }

    public MyRecyclerViewAdapter(Context myContext, List<Map<String, ?>> myDataSet) {
        mContext = myContext;
        myDataSet =  myDataSet;
    }

//    public MyRecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        View v;
//        v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item_row, parent, false);
//
//        ViewHolder vh = new ViewHolder(v);
//        return vh;
//    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Map<String, ?> movie = mDataSet.get(position);
        holder.bindMovieData(movie);
    }

    @Override
    public int getItemCount() {
        return mDataSet.size();
    }

    @Override
    public int getItemViewType(int position) {
        if(position >= 0 && position <=4){
            return 0;
        } else if (position > 4 && position <20){
            return 1;
        } else {
            return 2;
        }
    }

    @Override
    public  MyRecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View v;

        switch(viewType){
            case 0 : v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item_row,parent,false);
                        break;
            case 1: v =  LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_2,parent,false);
                break;
            case 2 : v =  LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_3,parent,false);
                    break;
            default: v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item_row,parent,false);
                break;
        }



        return new ViewHolder(v);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView vIcon;
        public TextView vTitle;
        public TextView vDescription;
        public CheckBox vCheckbox;

        public ViewHolder(View v){
            super(v);
            vIcon = (ImageView) v.findViewById(R.id.IconImageView);
            vTitle = (TextView) v.findViewById(R.id.titleTextView);
            vDescription = (TextView) v.findViewById(R.id.DescriptionTextView);
            vCheckbox = (CheckBox) v.findViewById(R.id.checkBox);

            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(mItemClickListener != null) {
                        mItemClickListener.onItemClick(v,getPosition());
                    }
                }
            });

            v.setOnLongClickListener(new View.OnLongClickListener(){

                @Override
                public boolean onLongClick(View v) {
                    if(mItemClickListener != null) {
                        mItemClickListener.onItemLongClick(v,getPosition());
                    }
                    //doubt
                    return true;
                }
            });

            vCheckbox.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View v) {
                    mItemClickListener.onCheckBoxClick(v,getAdapterPosition());
                }
            });

        }

        public void bindMovieData(Map<String, ?> movie) {
            vTitle.setText((String) movie.get("title"));
            vDescription.setText((String) movie.get("overview"));
            vIcon.setImageResource((Integer) movie.get("image"));
            vCheckbox.setChecked((Boolean) movie.get("selection"));
        }

    }
}
