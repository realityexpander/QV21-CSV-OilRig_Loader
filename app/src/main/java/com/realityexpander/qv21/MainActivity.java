package com.realityexpander.qv21;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.io.InputStream;
import java.util.Arrays;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private ItemArrayAdapter itemArrayAdapter;

    List<String[]> wellList;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listView);
        itemArrayAdapter = new ItemArrayAdapter(getApplicationContext(), R.layout.item_layout);

        Parcelable state = listView.onSaveInstanceState();
        listView.setAdapter(itemArrayAdapter);
        listView.onRestoreInstanceState(state);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(),ScrollingActivity.class);
                intent.putExtra( "wellListRow", wellList.get(i));
                intent.putExtra("index", i);

                Log.d("CDA:", Arrays.toString(wellList.get(i)) );
                startActivityForResult(intent, 10000);
            }
        });

        // Need to load data?
        if (wellList == null) {
            InputStream inputStream = getResources().openRawResource(R.raw.welldata);
            WellDataCSVFile wellDataCSVFile = new WellDataCSVFile(inputStream);
            wellList = wellDataCSVFile.read();

            for (String[] wellData : wellList) {
                itemArrayAdapter.add(wellData);
            }
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        Log.d("CDA onActivityResult:", requestCode +" "+ resultCode +" "+ data);
//        // Check which request we're responding to
//        if (requestCode == PICK_CONTACT_REQUEST) {
//            // Make sure the request was successful
//            if (resultCode == RESULT_OK) {
//                // The user picked a contact.
//                // The Intent's data Uri identifies which contact was selected.
//
//                // Do something with the contact here (bigger example below)
//            }
//        }
    }
}