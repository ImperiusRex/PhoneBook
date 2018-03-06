package com.kevinomyonga.phonebook;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_frame);

        // Create a fragment variable and instantiate instance of desired fragment.
        Fragment fragment = new ContactListFragment();

        // Create a fragment transaction.
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

        // Add the fragment to the specified container and commit the change.
        ft.add(R.id.content, fragment).commit();
    }
}
