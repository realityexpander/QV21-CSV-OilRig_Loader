package com.realityexpander.qv21;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;

public class ScrollingActivity extends AppCompatActivity {

    String[] wellListRow;
    int wellListIdx;

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
//                Snackbar.make(view, "Well Data Saved", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
                Toast.makeText(getApplicationContext(), "Well Data Saved!",
                        Toast.LENGTH_LONG).show();

                Intent intent = new Intent(); //getApplicationContext(), MainActivity.class);
                intent.putExtra( "wellListRow", wellListRow);
                intent.putExtra("index", wellListIdx);
                setResult(Activity.RESULT_OK, intent);

                // FIXME - Collect the edits
                Log.d("CDA sending back edits:", Arrays.toString(wellListRow) );
                //startActivity(intent);
                finish();
            }
        });

        Bundle bundle = getIntent().getExtras();
        String[] wellListRow = bundle.getStringArray("wellListRow");
        int wellListIdx = bundle.getInt("index");
        Log.d("CDA in ScrollingActivity", Arrays.toString(wellListRow) );

        setTitle("Editing: " + wellListRow[5]);

        TextView editText0 = (TextView)findViewById(R.id.dump_text0);
        editText0.setText(wellListRow[0], TextView.BufferType.EDITABLE);

        TextView editText1 = (TextView)findViewById(R.id.dump_text1);
        editText1.setText(wellListRow[1], TextView.BufferType.EDITABLE);

        TextView editText2 = (TextView)findViewById(R.id.dump_text2);
        editText2.setText(wellListRow[2], TextView.BufferType.EDITABLE);

        TextView editText3 = (TextView)findViewById(R.id.dump_text3);
        editText3.setText(wellListRow[3], TextView.BufferType.EDITABLE);

        TextView editText4 = (TextView)findViewById(R.id.dump_text4);
        editText4.setText(wellListRow[4], TextView.BufferType.EDITABLE);

        TextView editText5 = (TextView)findViewById(R.id.dump_text5);
        editText5.setText(wellListRow[5], TextView.BufferType.EDITABLE);

        TextView editText6 = (TextView)findViewById(R.id.dump_text6);
        editText6.setText(wellListRow[6], TextView.BufferType.EDITABLE);

        TextView editText7 = (TextView)findViewById(R.id.dump_text7);
        editText7.setText(wellListRow[7], TextView.BufferType.EDITABLE);

        TextView editText8 = (TextView)findViewById(R.id.dump_text8);
        editText8.setText(wellListRow[8], TextView.BufferType.EDITABLE);

        TextView editText9 = (TextView)findViewById(R.id.dump_text9);
        editText9.setText(wellListRow[9], TextView.BufferType.EDITABLE);

        TextView editText10 = (TextView)findViewById(R.id.dump_text10);
        editText10.setText(wellListRow[10], TextView.BufferType.EDITABLE);

        TextView editText11 = (TextView)findViewById(R.id.dump_text11);
        editText11.setText(wellListRow[11], TextView.BufferType.EDITABLE);

        TextView editText12 = (TextView)findViewById(R.id.dump_text12);
        editText12.setText(wellListRow[12], TextView.BufferType.EDITABLE);

        TextView editText13 = (TextView)findViewById(R.id.dump_text13);
        editText13.setText(wellListRow[13], TextView.BufferType.EDITABLE);

        TextView editText14 = (TextView)findViewById(R.id.dump_text14);
        editText14.setText(wellListRow[14], TextView.BufferType.EDITABLE);




    }
}
