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
                startActivity(intent);
            }
        });

        InputStream inputStream = getResources().openRawResource(R.raw.welldata);
        WellDataCSVFile wellDataCSVFile = new WellDataCSVFile(inputStream);
        wellList = wellDataCSVFile.read();

        for(String[] wellData:wellList ) {
            itemArrayAdapter.add(wellData);
        }
    }
}