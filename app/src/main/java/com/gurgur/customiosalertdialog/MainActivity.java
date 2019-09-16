package com.gurgur.customiosalertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
        Button exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        exit = findViewById(R.id.exit_btn);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                View view = getLayoutInflater().inflate(R.layout.custom_exit_card_view, null);
                Button cancel_ = view.findViewById(R.id.cancelbtn);
                Button exit_ = view.findViewById(R.id.exitbtn);

                TextView exit_title = view.findViewById(R.id.exit_title);
                TextView exit_desc = view.findViewById(R.id.exit_desc);

                exit_title.setText(R.string.exit_title);
                exit_desc.setText(R.string.exit_desc);

                builder.setView(view);
                final AlertDialog dialogExit = builder.create();
                dialogExit.requestWindowFeature(Window.FEATURE_NO_TITLE);
                WindowManager.LayoutParams wmlpLogin = dialogExit.getWindow().getAttributes();
                wmlpLogin.gravity = Gravity.CENTER;
                dialogExit.show();
                dialogExit.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                cancel_.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialogExit.cancel();
                    }
                });
                exit_.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "Exit Code", Toast.LENGTH_SHORT).show();
                    }
                });

            }
        });


    }
}
