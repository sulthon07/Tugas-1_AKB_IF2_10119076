package com.example.tugas1_akb_10119076_sulthonnaufalakmal;
//Nama : Sulthon Naufal Akmal
//Kelas : IF2
//NIM : 10119076
//TGL PENGERJAAN : 23 APRIL 2022
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread thread = new Thread(){

            public void run() {
                try{
                    sleep(3000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                } finally{
                    startActivity(new Intent(SplashActivity.this,LoginActivity .class));
                    finish();
                }
            }
        };
        thread.start();
    }
}