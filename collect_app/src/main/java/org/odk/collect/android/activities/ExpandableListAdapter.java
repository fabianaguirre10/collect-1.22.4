package org.odk.collect.android.activities;
import java.util.HashMap;
import java.util.List;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;
import java.util.HashMap;
import java.util.List;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import androidx.annotation.ColorInt;

import org.odk.collect.android.R;

public class ExpandableListAdapter extends BaseExpandableListAdapter {

    private Context _context;
    private List<itemlist> _listDataHeader; // header titles
    // child data in format of header title, child title
    private HashMap<itemlist, List<itemlist>> _listDataChild;

    public ExpandableListAdapter(Context context, List<itemlist> listDataHeader,
                                 HashMap<itemlist, List<itemlist>> listChildData) {
        this._context = context;
        this._listDataHeader = listDataHeader;
        this._listDataChild = listChildData;
    }

    @Override
    public Object getChild(int groupPosition, int childPosititon) {
        return this._listDataChild.get(this._listDataHeader.get(groupPosition))
                .get(childPosititon);
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public View getChildView(int groupPosition, final int childPosition,
                             boolean isLastChild, View convertView, ViewGroup parent) {

        final itemlist childText = (itemlist) getChild(groupPosition, childPosition);

        if (convertView == null) {
            LayoutInflater infalInflater = (LayoutInflater) this._context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.list_item, null);
        }

        TextView txtListChild = (TextView) convertView
                .findViewById(R.id.lblListItem);
        TextView txtListChildTexto = (TextView) convertView
                .findViewById(R.id.texto);
        TextView lblListcout = (TextView) convertView
                .findViewById(R.id.lblListcout);

        txtListChild.setText(String.valueOf(childText.getCodigo2()));
        txtListChildTexto.setText(childText.getDescripcion());
        lblListcout.setTypeface(null, Typeface.BOLD);
        lblListcout.setText(String.valueOf(childText.getCantidad()));
        if(childText.getCantidad()==0)
            lblListcout.setTextColor(Color.RED);
        if(childText.getCantidad()>0 && childText.getCantidad()<=10)
            lblListcout.setTextColor(Color.MAGENTA);
        if(childText.getCantidad()>10 && childText.getCantidad()<=20)
            lblListcout.setTextColor(Color.YELLOW);
        if(childText.getCantidad()>20)
            lblListcout.setTextColor(Color.GREEN);
        return convertView;
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return this._listDataChild.get(this._listDataHeader.get(groupPosition))
                .size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return this._listDataHeader.get(groupPosition);
    }

    @Override
    public int getGroupCount() {
        return this._listDataHeader.size();
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded,
                             View convertView, ViewGroup parent) {
        itemlist headerTitle = (itemlist) getGroup(groupPosition);
        if (convertView == null) {
            LayoutInflater infalInflater = (LayoutInflater) this._context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.list_group, null);
        }

        TextView lblListHeader = (TextView) convertView
                .findViewById(R.id.lblListHeader);
        TextView lblListHeadercout = (TextView) convertView
                .findViewById(R.id.lblListHeadercout);
        lblListHeader.setTypeface(null, Typeface.BOLD);
        lblListHeader.setText(headerTitle.getDescripcion());
        lblListHeadercout.setTypeface(null, Typeface.BOLD);
        lblListHeadercout.setText(String.valueOf(headerTitle.getCantidad()));


        return convertView;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}