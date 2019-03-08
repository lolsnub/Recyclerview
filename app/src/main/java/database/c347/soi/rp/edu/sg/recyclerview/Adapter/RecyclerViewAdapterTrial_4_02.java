package database.c347.soi.rp.edu.sg.recyclerview.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import database.c347.soi.rp.edu.sg.recyclerview.PostModel;
import database.c347.soi.rp.edu.sg.recyclerview.R;
import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapterTrial_4_02 extends RecyclerView.Adapter<RecyclerViewAdapterTrial_4_02.MyViewHolder> {

    private Context mContext;
    private List<PostModel> mData;

    public RecyclerViewAdapterTrial_4_02(Context mContext, List<PostModel> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.card_trial_4_02, parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.ivTrialIcon.setImageResource(mData.get(position).getImgName());
        holder.tvName.setText(mData.get(position).getName());
        holder.tvPost.setText(mData.get(position).getPost());
        holder.tvTimestamp.setText(mData.get(position).getTimestamp());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        CircleImageView ivTrialIcon;
        TextView tvName, tvTimestamp, tvPost;

        public MyViewHolder(View itemView){
            super(itemView);
            tvName = (TextView) itemView.findViewById(R.id.tvName);
            tvTimestamp = (TextView) itemView.findViewById(R.id.tvTimestamp);
            tvPost = (TextView) itemView.findViewById(R.id.tvPost);
            ivTrialIcon = (CircleImageView) itemView.findViewById(R.id.ivTrialIcon);

        }
    }
}
