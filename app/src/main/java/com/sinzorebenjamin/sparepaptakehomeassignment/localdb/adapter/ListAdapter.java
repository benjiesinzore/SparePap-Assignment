package com.sinzorebenjamin.sparepaptakehomeassignment.localdb.adapter;


import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

import com.sinzorebenjamin.sparepaptakehomeassignment.localdb.models.DataModel;

public class ListAdapter extends androidx.recyclerview.widget.ListAdapter<DataModel, ViewHolder> {

//    private final List<DataModel> list;
//
//    private final Context context;

    public ListAdapter(@NonNull DiffUtil.ItemCallback<DataModel> diffCallback/*,
                       List<DataModel> list, Context context*/) {
        super(diffCallback);
//        this.list = list;
//        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return ViewHolder.create(parent);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

//        holder.bind("KES "+ list.get(position).getVal());

        DataModel current = getItem(position);
        holder.bind("KES "+ current.getVal());

    }

//    @Override
//    public int getItemCount() {
//        return list.size();
//    }



    public static class ProductDiff extends DiffUtil.ItemCallback<DataModel> {


        @Override
        public boolean areItemsTheSame(@NonNull DataModel oldItem, @NonNull DataModel newItem) {
            return false;
        }

        @Override
        public boolean areContentsTheSame(@NonNull DataModel oldItem, @NonNull DataModel newItem) {
            return false;
        }
    }

}
