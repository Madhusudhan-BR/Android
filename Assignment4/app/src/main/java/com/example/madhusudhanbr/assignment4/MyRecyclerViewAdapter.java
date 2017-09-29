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

    private List<Map<String, ?>> mDataSet = new MovieData().getMoviesList();
    private Context mContext;
    AdapterView.OnItemClickListener mItemClickListener;

    public MyRecyclerViewAdapter(Context myContext, List<Map<String, ?>> myDataSet) {
        mContext = myContext;
        myDataSet =  myDataSet;
    }

    public MyRecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item_row, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Map<String, ?> movie = mDataSet.get(position);
        holder.bindMovieData(movie);
    }

    @Override
    public int getItemCount() {
        return mDataSet.size();
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

//            v.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    if(mItemClickListener != null) {
//                        mItemClickListener.onItemClick(v,);
//                    }
//                }
//            });

        }

        public void bindMovieData(Map<String, ?> movie) {
            vTitle.setText((String) movie.get("title"));
            vDescription.setText((String) movie.get("overview"));
            vIcon.setImageResource((Integer) movie.get("image"));
           // vCheckbox.setChecked((Boolean) movie.get("selection"));
        }

    }
}
