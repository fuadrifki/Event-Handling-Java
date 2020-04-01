package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Use Event Handling
        final Button buttonView = findViewById(R.id.btnView);
        buttonView.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                TextView say = findViewById((R.id.tvOnClick));
                String result = (String) say.getText();

                System.out.println("Cek isi 1 ===>" + result);

                if(result.equals("Halo, salam mahasiswa!")) {
                    say.setText("Hi, nama saya Fuad Rifqi Zamzami");
                }
                else {
                    say.setText("Halo, salam mahasiswa!");
                }
            }
        });
    }

//    Use Activity
    @SuppressLint("SetTextI18n")
    public void clickButton(View view) {
        TextView say = findViewById((R.id.tvOnClick));
        String result = (String) say.getText();

        System.out.println("Cek isi 1 ===>" + result);

        if(result.equals("Halo, salam mahasiswa!")) {
            say.setText("Hi, nama saya Fuad Rifqi Zamzami");
        } else {
            say.setText("Halo, salam mahasiswa!");
        }
    }

}
