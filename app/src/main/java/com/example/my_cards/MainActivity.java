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
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;


public class MainActivity extends AppCompatActivity {

    ArrayList<String> data1 = new ArrayList<>();



    //{"姬塔","亚里莎","莫妮卡・韦斯文特","星野静流","白银纯","安芸真琴","冰川镜华","藤堂秋乃","樱井望","佐佐木咲恋",
    //"支仓伊绪","支仓伊绪","衣之咲璃乃","柊杏奈","克里斯提娜","雾原霞","伊利亚","园上矛依未","御久间智","情人节静流","圣诞绫音","圣诞千歌"};

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {              //分别设置菜单键逻辑
            case R.id.character:
                Intent intent2 = new Intent(MainActivity.this, characterActivity.class);
                startActivity(intent2);
                finish();
                break;
            case R.id.Setting:
                Toast.makeText(this, "你点击了设置（设置未完成）", Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(MainActivity.this, SettingActivity.class);
                startActivity(intent1);
                finish();
                break;
            case R.id.More: //设置更多逻辑
                Toast.makeText(this, "了解更多", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://47.102.139.96/"));
                startActivity(intent);
                break;
            case R.id.Exit: //退出
                Toast.makeText(this, "退出", Toast.LENGTH_SHORT).show();
                finish();
                break;
            default:
        }
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "你已经单抽", Toast.LENGTH_SHORT).show();
                open(1);
            }
        });

        Button button2 = findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "你已经十连", Toast.LENGTH_SHORT).show();

                open(10);

            }
        });

        ArrayAdapter<String>adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,data1);
        ListView listView = findViewById(R.id.list1);
        listView.setAdapter(adapter);
    }


    public void threeStar() {
        Random R1 = new Random();
        int r = R1.nextInt(13);
        while (true) {
            switch (r) {
                case 1:
                    data1.add("");
                    break;
                case 2:
                    data1.add("");
                    break;
                case 3:
                    data1.add("");
                    break;
                case 4:
                    data1.add("");
                    break;
                case 5:
                    data1.add("");
                    break;
                case 6:
                    data1.add("");
                    break;
                case 7:
                    data1.add("");
                    break;
                case 8:
                    data1.add("");
                    break;
                case 9:
                    data1.add("");
                    break;
                case 10:
                    data1.add("");
                    break;
                case 11:
                    data1.add("");
                    break;
                case 12:
                    data1.add("");
                    break;
                case 13:
                    data1.add("");
                    break;
                default:
            }

        }
    }

    public void twoStar() {
        Random R = new Random();
        int r = R.nextInt(13);
        while (true) {
            switch (r) {
                case 1:
                    data1.add("");
                    break;
                case 2:
                    data1.add("");
                    break;
                case 3:
                    data1.add("");
                    break;
                case 4:
                    data1.add("");
                    break;
                case 5:
                    data1.add("");
                    break;
                case 6:
                    data1.add("");
                    break;
                case 7:
                    data1.add("");
                    break;
                case 9:
                    data1.add("");
                    break;
                case 10:
                    data1.add("");
                    break;
                case 11:
                    data1.add("");
                    break;
                case 12:
                    data1.add("");
                    break;
                case 13:
                    data1.add("");
                    break;
                default:

            }
        }
    }

    public void oneStar() {
        Random R = new Random();
        int r = R.nextInt(13);
        while (true) {
            switch (r) {
                case 1:
                    data1.add("");
                    break;
                case 2:
                    data1.add("");
                    break;
                case 3:
                    data1.add("");
                    break;
                case 4:
                    data1.add("");
                    break;
                case 5:
                    data1.add("");
                    break;
                case 6:
                    data1.add("");
                    break;
                case 7:
                    data1.add("");
                    break;
                case 8:
                    data1.add("");
                    break;
                case 9:
                    data1.add("");
                    break;
                case 10:
                    data1.add("");
                    break;
                default:
            }
        }


    }

    public void open(int num){
        Random R = new Random();
        int r = R.nextInt(200);
        try {
            for (int i = 0; i < num; i++) {
                if (r <= 5) {
                    threeStar();
                } else if (6 <= r && r <= 41) {
                    twoStar();
                } else if (42 <= r && r <= 200) {
                    oneStar();
                }
            }
        }catch (OutOfMemoryError error) {
                System.gc();
                System.runFinalization();

        }


        }


    }










