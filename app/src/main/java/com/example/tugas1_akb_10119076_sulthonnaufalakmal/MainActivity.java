package com.example.tugas1_akb_10119076_sulthonnaufalakmal;
//Nama : Sulthon Naufal Akmal
//Kelas : IF2
//NIM : 10119076
//TGL PENGERJAAN : 23 APRIL 2022
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Profil = findViewById(R.id.Profil);
        Profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openProfileActivity();
            }
        });
    }

    public void openProfileActivity() {
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }
}