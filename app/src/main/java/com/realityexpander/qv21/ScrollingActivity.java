package com.realityexpander.qv21;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static com.realityexpander.qv21.MainActivity.WELLDATA_NUMBER_COLS_IN_CSV;

public class ScrollingActivity extends AppCompatActivity {

  String[] wellListRow;
  int wellListIdx;
  EditText[] editTextArr = new EditText[WELLDATA_NUMBER_COLS_IN_CSV + 1];

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_scrolling);
    Toolbar toolbar = findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);

    // Save the edits
    FloatingActionButton fab = findViewById(R.id.fab);
    fab.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
      Intent intent = new Intent(); //getApplicationContext(), MainActivity.class);
      intent.putExtra("wellListRow", wellListRow);
      intent.putExtra("index", wellListIdx);
      setResult(Activity.RESULT_OK, intent);

      // Collect the edits
      for (int i = 0; i <= wellListRow.length-1; i++) {
        wellListRow[i] = editTextArr[i].getText().toString();
      }

      Toast.makeText(getApplicationContext(), "Well Data Saved!",
        Toast.LENGTH_LONG).show();

      finish();
      }
    });

    // Get the incoming data  to be displayed for editing
    Bundle bundle = getIntent().getExtras();
    if (bundle != null) {
      wellListRow = bundle.getStringArray("wellListRow");
    }
    wellListIdx = bundle.getInt("index");

    setTitle("Editing: " + wellListRow[5]);

    int[] editTextResIds = new int[]{
            R.id.dump_text0,
            R.id.dump_text1,
            R.id.dump_text2,
            R.id.dump_text3,
            R.id.dump_text4,
            R.id.dump_text5,
            R.id.dump_text6,
            R.id.dump_text7,
            R.id.dump_text8,
            R.id.dump_text9,
            R.id.dump_text10,
            R.id.dump_text11,
            R.id.dump_text12,
            R.id.dump_text13,
            R.id.dump_text14 };

    // populate the UI with data from the editing row
    for (int i = 0; i <= editTextResIds.length-1; i++) {
      editTextArr[i] = findViewById(editTextResIds[i]);
      editTextArr[i].setText(wellListRow[i], EditText.BufferType.EDITABLE);
    }

  }
}
