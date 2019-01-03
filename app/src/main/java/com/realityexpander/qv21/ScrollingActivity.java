package com.realityexpander.qv21;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;

public class ScrollingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Bundle bundle = getIntent().getExtras();
        String[] wellListRow = bundle.getStringArray("wellListRow");
        int wellListIdx = bundle.getInt("index");
        Log.d("CDA in ScrollingActivity", Arrays.toString(wellListRow) );

        TextView editText = (TextView)findViewById(R.id.dump_text);
        editText.setText(Arrays.toString(wellListRow), TextView.BufferType.EDITABLE);

        TextView editText2 = (TextView)findViewById(R.id.dump_text2);
        editText2.setText(wellListRow[2], TextView.BufferType.EDITABLE);

        setTitle("Editing: " + wellListRow[5]);

        // Remove this comment more comments
    }
}
