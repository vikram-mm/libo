package com.example.arvind.libo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class generate_bill extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generate_bill);
    }

    @Override
    public void onBackPressed(){
        Intent intent = new Intent (generate_bill.this,librarian_main.class);
        generate_bill.this.startActivity(intent);
    }
}
