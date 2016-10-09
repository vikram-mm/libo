package com.example.arvind.libo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class find_a_book extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_a_book);
    }

    @Override
    public void onBackPressed(){
        Intent intent = new Intent (find_a_book.this,librarian_main.class);
        find_a_book.this.startActivity(intent);
    }
}
