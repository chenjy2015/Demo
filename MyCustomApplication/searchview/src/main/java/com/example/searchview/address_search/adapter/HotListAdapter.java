package com.example.searchview.address_search.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.searchview.R;
import com.example.searchview.address_search.bean.SortModel;

import java.util.List;


/**
 * @author cjy
 * @company 跨越速运
 * @Description 热门城市适配器
 * @createDate 2017/11/22 14:51
 * @updateAuthor
 */
public class HotListAdapter extends BaseAdapter {

    protected List<SortModel> mList;
    protected Activity mAct;

    public HotListAdapter(Activity act, List<SortModel> list) {
       this.mAct = act;
       this.mList = list;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int i) {
        return mList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if (view == null) {
            view = LayoutInflater.from(mAct).inflate(R.layout.adapter_hot_list, null);
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.cityBtn.setText(mList.get(position).getName());
        return view;
    }

    class ViewHolder {
        TextView cityBtn;
        ViewHolder(View view) {
            cityBtn = (TextView) view.findViewById(R.id.city_btn);
        }
    }
}
