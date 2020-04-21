package com.example.my_cards;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String[] data = {"A","B","C","D"};//设置菜单数据

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){              //分别设置菜单键逻辑
            case R.id.Setting:
                Toast.makeText(this,"你点击了设置（设置未完成）",Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(MainActivity.this,SettingActivity.class);
                startActivity(intent1);
                finish();
                break;
            case R.id.More: //设置更多逻辑
                Toast.makeText(this,"了解更多",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://47.102.139.96/"));
                startActivity(intent);
                break;
            case  R.id.Exit: //退出
                Toast.makeText(this,"退出",Toast.LENGTH_SHORT).show();
                finish();
                break;
            default:
        }
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                MainActivity.this,android.R.layout.simple_list_item_1,data);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter); //将菜单数据设置

        Button button1 = findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "你已经单抽", Toast.LENGTH_SHORT).show();
            }
        });

        Button button2 =findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"你已经十连",Toast.LENGTH_SHORT).show();
            }
        });
/*
        Button button3 = findViewById(R.id.button_3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.button:
                        EditText editText = findViewById(R.id.edit1);
                        String inputText = editText.getText().toString();
                        Toast.makeText(MainActivity.this,inputText,
                                Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;




                }
            }
        });*/






    }
}
