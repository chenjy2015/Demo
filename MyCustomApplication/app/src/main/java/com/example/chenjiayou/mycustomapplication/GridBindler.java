package com.example.chenjiayou.mycustomapplication;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.chenjiayou.mycustomapplication.databinding.ItemGridBindlerBinding;

import me.drakeet.multitype.ItemViewBinder;

/**
 * Created by chenjiayou on 2018/4/13.
 */

public class GridBindler extends ItemViewBinder<String, GridBindler.ViewHolder> {

    interface onItemClickListener{
        void onItemClick(String s);
    }

    @NonNull
    @Override
    protected ViewHolder onCreateViewHolder(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        return new ViewHolder(inflater.inflate(R.layout.item_grid_bindler, parent, false));
    }

    @Override
    protected void onBindViewHolder(@NonNull ViewHolder holder, @NonNull String item) {
        holder.bind(item);
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        ItemGridBindlerBinding mBinding;

        public ViewHolder(View itemView) {
            super(itemView);
            mBinding = DataBindingUtil.bind(itemView);
        }

        public void bind(String item) {
            mBinding.setStr(item);
        }
    }

}
