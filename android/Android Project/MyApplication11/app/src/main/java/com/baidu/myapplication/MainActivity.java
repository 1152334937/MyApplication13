package com.baidu.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {

    private EditText edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit = findViewById(R.id.edit);
        Button btu1=findViewById(R.id.)
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //把edit中字符串求出来
        String str=edit.getText().toString();
        save(str);
        //保存
    }

    private void save(String str) {
        FileOutputStream out = null;
        BufferedWriter w = null;
        try {
            out = openFileOutput("data", MainActivity.MODE_PRIVATE);
            w = new BufferedWriter(new OutputStreamWriter(out));
            w.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try {
                if (w != null){
                    w.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}