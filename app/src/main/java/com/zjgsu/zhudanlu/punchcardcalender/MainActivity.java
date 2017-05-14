package com.zjgsu.zhudanlu.punchcardcalender;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button but2 = (Button) findViewById(R.id.button_2);
        but2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });




        Button but1 = (Button) findViewById(R.id.button);
        but1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText username = (EditText) findViewById(R.id.editText1);
                EditText pass = (EditText) findViewById(R.id.editText2);

                if (username.getText().toString().equals("zhudanlu") &&
                        pass.getText().toString().equals("1512180310")) {
                    String data = "zhudanlu";
                    String password = "1512180310";

                    Intent intent = new Intent(MainActivity.this, SuccessActivity.class);
                    intent.putExtra("extra_data", data);
                    intent.putExtra("extra_password", password);
                    startActivity(intent);
                } else {
                    Intent intent = new Intent(MainActivity.this, FailActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
