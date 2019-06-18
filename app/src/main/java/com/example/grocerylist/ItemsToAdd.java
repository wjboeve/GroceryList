package com.example.grocerylist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ItemsToAdd extends AppCompatActivity {

    //private static final String LOG_TAG = ItemsToAdd.class.getSimpleName();
    public static final String EXTRA_REPLY = "com.example.grocerylist.extra.REPLY";
    private String pressed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items_to_add);
        //Log.d(LOG_TAG,"-------");
        //Log.d(LOG_TAG,"On Create");
    }

    public void returnReply(View view){
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY,pressed);
        setResult(RESULT_OK,replyIntent);
        finish();
    }
    public void rice_reply(View view) {
        pressed = findViewById(R.id.rice_button).toString();
        pressed = "Rice";
        returnReply(view);
    }

    public void apple_reply(View view) {
        pressed = "Apple";
        returnReply(view);
    }

    public void cheese_reply(View view) {
        pressed = "Cheese";
        returnReply(view);
    }

    public void bread_reply(View view) {
        pressed = "Bread";
        returnReply(view);
    }

    public void milk_reply(View view) {
        pressed = "Milk";
        returnReply(view);
    }

    public void orange_reply(View view) {
        pressed = "Oranges";
        returnReply(view);
    }

    public void broc_reply(View view) {
        pressed = "Broccoli";
        returnReply(view);
    }

    public void caul_reply(View view) {
        pressed = "Cauliflower";
        returnReply(view);
    }

    public void bean_reply(View view) {
        pressed = "Beans";
        returnReply(view);
    }

    public void pea_reply(View view) {
        pressed = "Peas";
        returnReply(view);
    }

    public void lettuce_reply(View view) {
        pressed = "Lettuce";
        returnReply(view);
    }

    public void oj_reply(View view) {
        pressed = "OJ";
        returnReply(view);
    }

    public void carrot_reply(View view) {
        pressed = "Carrots";
        returnReply(view);
    }

    public void cuc_reply(View view) {
        pressed = "Cucumbers";
        returnReply(view);
    }

    public void butter_reply(View view) {
        pressed = "Butter";
        returnReply(view);
    }

    public void egg_reply(View view) {
        pressed = "Eggs";
        returnReply(view);
    }

    public void steak_reply(View view) {
        pressed = "Steak";
        returnReply(view);
    }

    public void bacon_reply(View view) {
        pressed = "Bacon";
        returnReply(view);
    }

}

