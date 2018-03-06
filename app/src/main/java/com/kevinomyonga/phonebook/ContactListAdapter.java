package com.kevinomyonga.phonebook;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by kevinomyonga on 01/03/2018.
 */

public class ContactListAdapter extends ArrayAdapter {

    Context context;
    ArrayList<Contact> contacts;

    public ContactListAdapter(@NonNull Context context,
                              int resource,
                              @NonNull ArrayList<Contact> contacts) {
        super(context, resource, contacts);

        this.context = context;
        this.contacts = contacts;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView,
                        @NonNull ViewGroup parent) {
        //return super.getView(position, convertView, parent);

        if( convertView == null ) {
            convertView = ((Activity) context)
                    .getLayoutInflater()
                    .inflate(R.layout.contact_list_item, parent, false);
        }

        if (convertView != null) {

            View view = convertView.findViewById(R.id.background);

            int color1 = context.getResources()
                    .getColor(android.R.color.darker_gray);

            int color2 = context.getResources()
                    .getColor(android.R.color.white);

            if ((position % 2) == 0) {
                view.setBackgroundColor(color1);
            } else {
                view.setBackgroundColor(color2);
            }

            Contact contact = contacts.get(position);

            // Image
            ImageView image = convertView.findViewById(R.id.contactImage);

            String url = contact.getImage();

            Picasso.with(context).load(url).into(image);

            // Name
            TextView name = convertView.findViewById(R.id.contactName);

            String fullName = contact.getFname() + " " + contact.getLname();

            name.setText(fullName);
        }

        return convertView;
    }
}













