package com.example.niftydialogbuilder.dialog.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.example.niftydialogbuilder.R;

import java.util.List;

/**
 * Created by chen on 18/1/31.
 */

public class DialogIosStyleAdapter extends MyBaseAdapter<String>{

    public DialogIosStyleAdapter(Activity act, List<String> list) {
        super(act, list);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {

        ViewHolder viewHolder = null;
        if (convertView == null) {
            convertView = LayoutInflater.from(mAct).inflate(R.layout.item_ios_style_dialog_list, null);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.mItemView.setText(mList.get(position));
        return convertView;
    }

    class ViewHolder{
        TextView mItemView;

        ViewHolder(View view){
            mItemView = view.findViewById(R.id.item);
        }
    }
}
