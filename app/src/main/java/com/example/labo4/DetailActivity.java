package com.example.labo4;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView nameText = findViewById(R.id.detailName);
        TextView emailText = findViewById(R.id.detailEmail);

        User user = (User) getIntent().getSerializableExtra("user");

        if (user != null) {
            nameText.setText(user.getName());
            emailText.setText(user.getEmail());
        }
    }
}