package com.example.spinnercustom.custom.adapter;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;

import androidx.appcompat.widget.AppCompatCheckBox;

import com.example.spinnercustom.MultiSpinner;
import com.example.spinnercustom.R;
import com.example.spinnercustom.custom.MultiSpinnerListener;

import java.util.ArrayList;
import java.util.List;

public class SpinnerAdapter extends ArrayAdapter<String> {

    private List<String> items;
    private Context context;
    private LayoutInflater layoutInflater;
    private MultiSpinnerListener listener;
    private List<String> itemName;

    public SpinnerAdapter(Context context, List<String> items) {
        super(context, R.layout.layout_adapter_multi_selection, R.id.checkSpinnerItem, items);
        this.items = items;
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
        this.listener = listener;
        itemName = new ArrayList<>();
    }

   /* @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        TextView v = (TextView) super.getView(position, convertView, parent);

        if (v == null) {
            v = new TextView(context);
        }
        v.setTextColor(Color.BLACK);
         v.setText(items.get(position));
        return v;
    }*/

    @Override
    public String getItem(int position) {
        return items.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.layout_adapter_multi_selection, parent, false);
        }
        AppCompatCheckBox lbl = convertView.findViewById(R.id.checkSpinnerItem);
        lbl.setTextColor(Color.BLACK);
        lbl.setText(items.get(position));

        return convertView;
    }
}