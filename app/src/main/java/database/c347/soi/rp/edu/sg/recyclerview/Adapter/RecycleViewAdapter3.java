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

import database.c347.soi.rp.edu.sg.recyclerview.Model.Book;
import database.c347.soi.rp.edu.sg.recyclerview.R;

public class RecycleViewAdapter3 extends RecyclerView.Adapter<RecycleViewAdapter3.MyViewHolder> {

    private Context mContext;
    private List<Book> mData;

    public RecycleViewAdapter3(Context mContext, List<Book> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_row_3, parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tvTitle.setText(mData.get(position).getTitle());
        holder.ivImage.setImageResource(mData.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tvTitle;
        ImageView ivImage, ivIcon;
        public MyViewHolder(View itemView){
            super(itemView);
            tvTitle = (TextView) itemView.findViewById(R.id.tvTitle);
            ivImage = (ImageView) itemView.findViewById(R.id.ivImage);
            ivIcon = (ImageView) itemView.findViewById(R.id.ivIcon);
        }
    }
}
