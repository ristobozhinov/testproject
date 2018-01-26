package com.example.adamantus_pc.myapplication;

import android.app.SearchManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message_acivity);


            // Get the Intent that started this activity and extract the string
          /*  Intent intent = getIntent();
            String message = intent.getStringExtra("msg");

            // Capture the layout's TextView and set the string as its text
            TextView textView = (TextView) findViewById(R.id.textView);
           textView.setText(message);
           */

            Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
            String keyword = "your query here";
            intent.putExtra(SearchManager.QUERY, keyword);
            startActivity(intent);
        }
}
