package com.example.sreevidyak.findmyroute;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sreevidya K on 3/30/2017.
 */

public class DirectionsRecyclerAdpter extends RecyclerView.Adapter<DirectionsRecyclerAdpter.DirectionViewHolder>{


    private List<Steps> mList;
    public DirectionsRecyclerAdpter(ArrayList<Steps> list){
        mList = list;
    }

    @Override
    public DirectionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;

        LayoutInflater inflater = (LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.directions_info_layout,parent, false);
        DirectionViewHolder viewHolder = new DirectionViewHolder(view);
        Toast.makeText(view.getContext(),"Entered",Toast.LENGTH_SHORT).show();
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(DirectionViewHolder holder, int position) {

        Steps info = mList.get(position);
        holder.txtDistance.setText(info.distance.text);
        holder.txtDuration.setText(info.duration.text);
        holder.txtDirection.setText(Html.fromHtml(info.htmlInstruction));
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    class DirectionViewHolder extends RecyclerView.ViewHolder{

        TextView txtDistance;
        TextView txtDuration;
        TextView txtDirection;
        public DirectionViewHolder(View itemView) {
            super(itemView);
            txtDistance = (TextView)itemView.findViewById(R.id.distance);
            txtDuration = (TextView)itemView.findViewById(R.id.duration);
            txtDirection = (TextView)itemView.findViewById(R.id.direction);
        }
    }
}
