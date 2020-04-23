package com.liahnu.cards;

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

        final ArrayAdapter<String>[] adapter = new ArrayAdapter[]{new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, data1)};
        final ListView listView = findViewById(R.id.list1);

        Button button1 = findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(MainActivity.this, "你已经单抽", Toast.LENGTH_SHORT).show();
                open(1);
                listView.setAdapter(adapter[0]);

            }
        });

        Button button2 = findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "你已经十连", Toast.LENGTH_SHORT).show();
                open(10);
                listView.setAdapter(adapter[0]);

            }
        });

        Button button3 = findViewById(R.id.button_3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"已重置",Toast.LENGTH_SHORT).show();
                data1.clear();
                adapter[0] = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, data1);
                listView.setAdapter(adapter[0]);

            }
        });


        listView.setAdapter(adapter[0]);
    }


    public void threeStar() {
        Random R1 = new Random();
        int r = R1.nextInt(13);
            switch (r) {
                case 0:
                    data1.add("3☆  杏奈");
                    break;
                case 1:
                    data1.add("3☆  真步");
                    break;
                case 2:
                    data1.add("3☆  璃乃");
                    break;
                case 3:
                    data1.add("3☆  初音");
                    break;
                case 4:
                    data1.add("3☆  伊绪");
                    break;
                case 5:
                    data1.add("3☆  咲恋");
                    break;
                case 6:
                    data1.add("3☆  望");
                    break;
                case 7:
                    data1.add("3☆  妮侬");
                    break;
                case 8:
                    data1.add("3☆  秋乃");
                    break;
                case 9:
                    data1.add("3☆  真琴");
                    break;
                case 10:
                    data1.add("3☆  静流");
                    break;
                case 11:
                    data1.add("3☆  莫妮卡");
                    break;
                case 12:
                    data1.add("3☆  姬塔");
                    break;
                default:
                    data1.add("null3");

            }


    }

    public void twoStar() {
        Random R = new Random();
        int r = R.nextInt(15);
            switch (r) {
                case 0:
                    data1.add("2☆  茜里");
                    break;
                case 1:
                    data1.add("2☆  宫子");
                    break;
                case 2:
                    data1.add("2☆  雪");
                    break;
                case 3:
                    data1.add("2☆  铃奈");
                    break;
                case 4:
                    data1.add("2☆  香织");
                    break;
                case 5:
                    data1.add("2☆  美美");
                    break;
                case 6:
                    data1.add("2☆  惠理子");
                    break;
                case 7:
                    data1.add("2☆  忍");
                    break;
                case 8:
                    data1.add("2☆  真阳");
                    break;
                case 9:
                    data1.add("2☆  栞");
                    break;
                case 10:
                    data1.add("2☆  千歌");
                    break;
                case 11:
                    data1.add("2☆  空花");
                    break;
                case 12:
                    data1.add("2☆  珠希");
                    break;
                case 13:
                    data1.add("2☆  美冬");
                    break;
                case 14:
                    data1.add("2☆  深月");
                    break;
                default:
                    data1.add("null2");


            }

    }

    public void oneStar() {
        Random R = new Random();
        int r = R.nextInt(10);
            switch (r) {
                case 0:
                    data1.add("1☆  日和莉");
                    break;
                case 1:
                    data1.add("1☆  怜");
                    break;
                case 2:
                    data1.add("1☆  未奏希");
                    break;
                case 3:
                    data1.add("1☆  胡桃");
                    break;
                case 4:
                    data1.add("1☆  依里");
                    break;
                case 5:
                    data1.add("1☆  铃莓");
                    break;
                case 6:
                    data1.add("1☆  由加莉");
                    break;
                case 7:
                    data1.add("1☆  碧");
                    break;
                case 8:
                    data1.add("1☆  美咲");
                    break;
                case 9:
                    data1.add("1☆  莉玛");
                    break;
                default:
                    data1.add("null1");

            }



    }

    public void open(int num){
        for (int i = 0; i < num; i++) {
            Random R = new Random();
            int r = R.nextInt(200);
            if (r <= 5) {
                threeStar();
            } else if (6 <= r && r <= 41) {
                twoStar();
            } else if (42 <= r && r <= 200) {
                oneStar();
            }
        }
        }
}










