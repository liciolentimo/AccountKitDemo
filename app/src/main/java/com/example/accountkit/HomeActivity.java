package com.example.accountkit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.facebook.accountkit.AccountKit;

public class HomeActivity extends AppCompatActivity {
    Button btn_logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btn_logout = (Button)findViewById(R.id.btn_logout);

        btn_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AccountKit.logOut();
            }
        });
    }
}
