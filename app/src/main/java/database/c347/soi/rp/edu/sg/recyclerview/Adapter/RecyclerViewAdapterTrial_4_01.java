package database.c347.soi.rp.edu.sg.recyclerview.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import database.c347.soi.rp.edu.sg.recyclerview.R;

public class RecyclerViewAdapterTrial_4_01 extends RecyclerView.Adapter<RecyclerViewAdapterTrial_4_01.MyViewHolder> {

    private Context mContext;
    private List<Integer> mData;

    public RecyclerViewAdapterTrial_4_01(Context mContext, List<Integer> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.card_trial_4_01, parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.ivTrial4Img.setImageResource(mData.get(position));
        if(mData.get(position) == mData.get(getItemCount() -1)){
            holder.tvDisplayMore.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView ivTrial4Img;
        TextView tvDisplayMore;

        public MyViewHolder(View itemView){
            super(itemView);
            ivTrial4Img = (ImageView) itemView.findViewById(R.id.ivTrial4Img);
            tvDisplayMore = (TextView) itemView.findViewById(R.id.tvDisplayMore);
        }
    }
}
