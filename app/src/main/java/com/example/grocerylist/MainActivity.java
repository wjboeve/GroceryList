package com.example.grocerylist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    //The TextView objects to be assigned/saved.
    private TextView line1;
    private TextView line2;
    private TextView line3;
    private TextView line4;
    private TextView line5;
    private TextView line6;
    private TextView line7;
    private TextView line8;
    private TextView line9;
    private TextView line10;
    private int listIterator = 0; //This is so it doesn't crash at the end.

    public static final int ITEM_REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        line1 = findViewById(R.id.item1);
        line2 = findViewById(R.id.item2);
        line3 = findViewById(R.id.item3);
        line4 = findViewById(R.id.item4);
        line5 = findViewById(R.id.item5);
        line6 = findViewById(R.id.item6);
        line7 = findViewById(R.id.item7);
        line8 = findViewById(R.id.item8);
        line9 = findViewById(R.id.item9);
        line10 = findViewById(R.id.item10);
        if (savedInstanceState != null) {
            if (savedInstanceState.getString("line_1") != null)
                line1.setText(savedInstanceState.getString("line_1"));
            if (savedInstanceState.getString("line_2") != null)
                line2.setText(savedInstanceState.getString("line_2"));
            if (savedInstanceState.getString("line_3") != null)
                line3.setText(savedInstanceState.getString("line_3"));
            if (savedInstanceState.getString("line_4") != null)
                line4.setText(savedInstanceState.getString("line_4"));
            if (savedInstanceState.getString("line_5") != null)
                line5.setText(savedInstanceState.getString("line_5"));
            if (savedInstanceState.getString("line_6") != null)
                line6.setText(savedInstanceState.getString("line_6"));
            if (savedInstanceState.getString("line_7") != null)
                line7.setText(savedInstanceState.getString("line_7"));
            if (savedInstanceState.getString("line_8") != null)
                line8.setText(savedInstanceState.getString("line_8"));
            if (savedInstanceState.getString("line_9") != null)
                line9.setText(savedInstanceState.getString("line_9"));
            if (savedInstanceState.getString("line_10") != null)
                line10.setText(savedInstanceState.getString("line_10"));
        }

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        if (line1 != null)
            outState.putString("line_1", line1.getText().toString());
        if (line2 != null)
            outState.putString("line_2", line2.getText().toString());
        if (line3 != null)
            outState.putString("line_3", line3.getText().toString());
        if (line4 != null)
            outState.putString("line_4", line4.getText().toString());
        if (line5 != null)
            outState.putString("line_5", line5.getText().toString());
        if (line6 != null)
            outState.putString("line_6", line6.getText().toString());
        if (line7 != null)
            outState.putString("line_7", line7.getText().toString());
        if (line8 != null)
            outState.putString("line_8", line8.getText().toString());
        if (line9 != null)
            outState.putString("line_9", line9.getText().toString());
        if (line10 != null)
            outState.putString("line_10", line10.getText().toString());

    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            //switch to set the appropriate label
            String reply = data.getStringExtra(ItemsToAdd.EXTRA_REPLY);
            switch (listIterator) {
                case 0:
                    line1.setText(reply);
                    break;
                case 1:
                    line2.setText(reply);
                    break;
                case 2:
                    line3.setText(reply);
                    break;
                case 3:
                    line4.setText(reply);
                    break;
                case 4:
                    line5.setText(reply);
                    break;
                case 5:
                    line6.setText(reply);
                    break;
                case 6:
                    line7.setText(reply);
                    break;
                case 7:
                    line8.setText(reply);
                    break;
                case 8:
                    line9.setText(reply);
                    break;
                case 9:
                    line10.setText(reply);
                    break;
            }
            if (listIterator == 9) {
                listIterator = 0;
            } else {
                listIterator++;
            }
        }
    }

    public void launchItemsToAdd(View view) {
        Intent intent = new Intent(this, ItemsToAdd.class);
        startActivityForResult(intent, ITEM_REQUEST);
    }
}
