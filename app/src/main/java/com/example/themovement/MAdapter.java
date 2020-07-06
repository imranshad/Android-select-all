package com.example.themovement;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class MAdapter extends ArrayAdapter {

    private List<ListModal> contactsInfoList;
    private Context context;

    public MAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        this.contactsInfoList = objects;
        this.context = context;
    }

    public MAdapter(@NonNull Context context, int resource) {
        super(context, resource);
    }

    private class ViewHolder {
        CheckBox checkBox;
        TextView displayName;
        TextView phoneNumber;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder = null;

        if (convertView == null) {
            LayoutInflater vi = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = vi.inflate(R.layout.row, null);

            holder = new ViewHolder();
            holder.checkBox = convertView.findViewById(R.id.m_checkbox);
            holder.displayName = convertView.findViewById(R.id.name);
            holder.phoneNumber = convertView.findViewById(R.id.phone);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        ListModal contactsInfo = contactsInfoList.get(position);
        holder.checkBox.setChecked(contactsInfo.getChecked());
        holder.displayName.setText(contactsInfo.getName());
        holder.phoneNumber.setText(contactsInfo.getPhone());

        return convertView;
    }
}
