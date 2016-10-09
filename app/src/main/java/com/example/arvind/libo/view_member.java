package com.example.arvind.libo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class view_member extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_member);
    }

    @Override
    public void onBackPressed(){
        Intent intent = new Intent (view_member.this,librarian_main.class);
        view_member.this.startActivity(intent);
    }
}
