package com.kevinomyonga.phonebook;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by kevinomyonga on 01/03/2018.
 */

public class ContactListActivity extends AppCompatActivity {

    ListView contactList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactList = findViewById(android.R.id.list);

        // Data to be displayed
        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Adam", "Monroe", "https://imgix.ranker.com/user_node_img/84/1677048/original/nicolas-cage-recording-artists-and-groups-photo-u16?w=650&q=50&fm=jpg&fit=crop&crop=faces"));
        contacts.add(new Contact("Bobby", "Brown", "https://www.thefamouspeople.com/profiles/images/ice-cube-3.jpg"));
        contacts.add(new Contact("Casper", "White", "https://www.personalityclub.com/wp-content/uploads/2016/06/Barack-Obama.jpg"));
        contacts.add(new Contact("Drogo", "Snow", "http://img.zergnet.com/2028835_300.jpg"));
        contacts.add(new Contact("Eragon", "Snow", "http://cdn.onlyinyourstate.com/wp-content/uploads/2016/07/3630750300_f1cd14cdc3_b-700x875.jpg"));
        contacts.add(new Contact("Felix", "Snow", "http://www.funcage.com/blog/wp-content/uploads/2013/10/Last-Meals-of-20-Rich-and-Famous-People-001.jpg"));
        contacts.add(new Contact("Grindelwald", "Snow", "https://imgix.ranker.com/node_img/115/2286941/original/tupac-shakur-recording-artists-and-groups-photo-2?w=650&q=50&fm=jpg&fit=crop&crop=faces"));
        contacts.add(new Contact("Hector", "Snow", "https://s.hdnux.com/photos/51/23/24/10827008/3/920x920.jpg"));

        contacts.add(5, new Contact("Sylar", "Grey", "http://assets.rebelcircus.com/blog/wp-content/uploads/2015/10/920x920.jpg"));

        ContactListAdapter adapter =
                new ContactListAdapter(this,
                        R.layout.contact_list_item,
                        contacts);

        contactList.setAdapter(adapter);
    }

}












