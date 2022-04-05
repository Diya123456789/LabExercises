package com.example.shopping_list;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    public static final String EXTRA_REPLY =
            "com.example.android.twoactivities.extra.REPLY";
    private Button replyCheese;
    private Button replyRice;
    private Button replyApples;
    private Button replyBanana;
    private Button replyMilk;
    private Button replyFish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        replyCheese = findViewById(R.id.buttonCheese);
        replyRice = findViewById(R.id.buttonRice);
        replyApples = findViewById(R.id.buttonApples);
        replyBanana = findViewById(R.id.buttonBanana);
        replyMilk = findViewById(R.id.buttonMilk);
        replyFish = findViewById(R.id.buttonFish);

    }

    public void returnReplyCheese(View view) {
        String reply = replyCheese.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK,replyIntent);
        finish();
    }

    public void returnReplyRice(View view) {
        String reply = replyRice.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK,replyIntent);
        finish();

    }

    public void returnReplyApples(View view) {
        String reply = replyApples.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK,replyIntent);
        finish();
    }

    public void returnReplyBanana(View view) {
        String reply = replyBanana.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK,replyIntent);
        finish();
    }

    public void returnReplyMilk(View view) {
        String reply = replyMilk.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK,replyIntent);
        finish();
    }

    public void returnReplyFish(View view) {
        String reply = replyFish.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK,replyIntent);
        finish();
    }
}