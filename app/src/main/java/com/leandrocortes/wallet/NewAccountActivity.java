package com.leandrocortes.wallet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class NewAccountActivity extends AppCompatActivity {

    private ImageView ivBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_account);

        ivBack =findViewById(R.id.iv_back);

        ivBack.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Intent myIntent = new Intent(NewAccountActivity.this, MainActivity.class);
                startActivity(myIntent);

            }


        });
    }
}