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

import static com.realityexpander.qv21.MainActivity.WELLDATA_NUMBER_COLS_IN_CSV;

public class ScrollingActivity extends AppCompatActivity {

  String[] wellListRow;
  int wellListIdx;
  EditText[] editTextArr = new EditText[WELLDATA_NUMBER_COLS_IN_CSV + 1];
//    EditText editText0;
//    EditText editText1;
//    EditText editText2;
//    EditText editText3;
//    EditText editText4;
//    EditText editText5;
//    EditText editText6;
//    EditText editText7;
//    EditText editText8;
//    EditText editText9;
//    EditText editText10;
//    EditText editText11;
//    EditText editText12;
//    EditText editText13;
//    EditText editText14;


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
      Toast.makeText(getApplicationContext(), "Well Data Saved!",
              Toast.LENGTH_LONG).show();

      Intent intent = new Intent(); //getApplicationContext(), MainActivity.class);
      intent.putExtra("wellListRow", wellListRow);
      intent.putExtra("index", wellListIdx);
      setResult(Activity.RESULT_OK, intent);

      // Collect the edits
      //wellListRow[0] = editText0.getText().toString();
      //wellListRow[1] = editText1.getText().toString();
      //wellListRow[2] = editText2.getText().toString();
      //wellListRow[3] = editText3.getText().toString();
      //wellListRow[4] = editText4.getText().toString();
      //wellListRow[5] = editText5.getText().toString();
      //wellListRow[6] = editText6.getText().toString();
      //wellListRow[7] = editText7.getText().toString();
      //wellListRow[8] = editText8.getText().toString();
      //wellListRow[9] = editText9.getText().toString();
      //wellListRow[10] = editText10.getText().toString();
      //wellListRow[11] = editText11.getText().toString();
      //wellListRow[12] = editText12.getText().toString();
      //wellListRow[13] = editText13.getText().toString();
      //wellListRow[14] = editText14.getText().toString();
      for (int i = 0; i <= wellListRow.length-1; i++) {
        wellListRow[i] = editTextArr[i].getText().toString();
      }

      finish();
      }
    });

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
      //wellListRow[i] = editTextArr[i].getText().toString();
      editTextArr[i] = findViewById(editTextResIds[i]);
      editTextArr[i].setText(wellListRow[i], EditText.BufferType.EDITABLE);
      Log.d("CDA scrollingActivity", Integer.toString(i));
    }

//        editText0 = findViewById(R.id.dump_text0);
//        editText0.setText(wellListRow[0], EditText.BufferType.EDITABLE);
//        editText1 = findViewById(R.id.dump_text1);
//        editText1.setText(wellListRow[1], EditText.BufferType.EDITABLE);
//        editText2 = findViewById(R.id.dump_text2);
//        editText2.setText(wellListRow[2], EditText.BufferType.EDITABLE);
//        editText3 = findViewById(R.id.dump_text3);
//        editText3.setText(wellListRow[3], EditText.BufferType.EDITABLE);
//        editText4 = findViewById(R.id.dump_text4);
//        editText4.setText(wellListRow[4], EditText.BufferType.EDITABLE);
//        editText5 = findViewById(R.id.dump_text5);
//        editText5.setText(wellListRow[5], EditText.BufferType.EDITABLE);
//        editText6 = findViewById(R.id.dump_text6);
//        editText6.setText(wellListRow[6], EditText.BufferType.EDITABLE);
//        editText7 = findViewById(R.id.dump_text7);
//        editText7.setText(wellListRow[7], EditText.BufferType.EDITABLE);
//        editText8 = findViewById(R.id.dump_text8);
//        editText8.setText(wellListRow[8], EditText.BufferType.EDITABLE);
//        editText9 = findViewById(R.id.dump_text9);
//        editText9.setText(wellListRow[9], EditText.BufferType.EDITABLE);
//        editText10 = findViewById(R.id.dump_text10);
//        editText10.setText(wellListRow[10], EditText.BufferType.EDITABLE);
//        editText11 = findViewById(R.id.dump_text11);
//        editText11.setText(wellListRow[11], EditText.BufferType.EDITABLE);
//        editText12 = findViewById(R.id.dump_text12);
//        editText12.setText(wellListRow[12], EditText.BufferType.EDITABLE);
//        editText13 = findViewById(R.id.dump_text13);
//        editText13.setText(wellListRow[13], EditText.BufferType.EDITABLE);
//        editText14 = findViewById(R.id.dump_text14);
//        editText14.setText(wellListRow[14], EditText.BufferType.EDITABLE);

  }
}
