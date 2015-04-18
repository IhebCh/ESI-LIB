package com.devmobile.cs2.esi_lib.Adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.devmobile.cs2.esi_lib.Models.NavMenuItem;
import com.devmobile.cs2.esi_lib.R;

import java.util.ArrayList;

/**
 * Created by Ahmed-PC on 11-04-2015.
 */
public class MenuItemAdapter extends BaseAdapter{

    private Context context;
    private ArrayList<NavMenuItem> NavMenuItems;

    public MenuItemAdapter(Context context, ArrayList<NavMenuItem> NavMenuItems){
        this.context = context;
        this.NavMenuItems = NavMenuItems;
    }
    @Override
    public int getCount() {
        return NavMenuItems.size();
    }

    @Override
    public Object getItem(int position) {
        return NavMenuItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position ;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater mInflater = (LayoutInflater)
                    context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.liste_menu_range, null);
        }

        ImageView imgIcon = (ImageView) convertView.findViewById(R.id.icon);
        TextView txtTitle = (TextView) convertView.findViewById(R.id.title);
        TextView txtCount = (TextView) convertView.findViewById(R.id.counter);

        imgIcon.setImageResource(NavMenuItems.get(position).getIcon());
        txtTitle.setText(NavMenuItems.get(position).getTitre());
        return convertView;
    }

}
