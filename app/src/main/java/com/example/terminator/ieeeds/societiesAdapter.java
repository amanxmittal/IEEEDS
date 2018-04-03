package com.example.terminator.ieeeds;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by TERMINATOR on 3/31/2018.
 *
 * RecyclerView.Adapter
 * RecyclerView.ViewHolder
 */

public class societiesAdapter extends RecyclerView.Adapter<societiesAdapter.societiesViewHolder>{

    private Context mCtx;
    private List<societies> societiesList;

    public societiesAdapter(Context mCtx, List<societies> societiesList) {
        this.mCtx = mCtx;
        this.societiesList = societiesList;
    }

    @Override
    public societiesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.exp_list,null);
        return new societiesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(societiesViewHolder holder, int position) {
        societies societies =societiesList.get(position);

        holder.textViewTitle.setText(societies.getTitle());
        holder.textViewDesc.setText(societies.getDescription());

        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(societies.getImage()));
    }

    @Override
    public int getItemCount() {
        return societiesList.size();
    }

    class societiesViewHolder extends RecyclerView.ViewHolder{

        ImageView  imageView;
        TextView    textViewTitle, textViewDesc;

        public societiesViewHolder(View itemView) {
            super(itemView);

            imageView = (ImageView) itemView.findViewById(R.id.ivLogo1);
            textViewTitle = (TextView) itemView.findViewById(R.id.tvTitleSsn8);
            textViewDesc = (TextView) itemView.findViewById(R.id.textViewDesc);

        }
    }

}
