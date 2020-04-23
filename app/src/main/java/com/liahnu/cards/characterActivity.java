package com.liahnu.cards;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class characterActivity extends AppCompatActivity {

    //private String[] data1 ={"姬塔","亚里莎","莫妮卡・韦斯文特","星野静流","白银纯","安芸真琴","冰川镜华","藤堂秋乃","樱井望","佐佐木咲恋",
       // "支仓伊绪","支仓伊绪","衣之咲璃乃","柊杏奈","克里斯提娜","雾原霞","伊利亚","园上矛依未","御久间智","情人节静流","圣诞绫音","圣诞千歌"};
    private List<Character>characterList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character);
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(characterActivity.this,android.R.layout.simple_list_item_1,data1);
        //ListView listView1 = findViewById(R.id.List1);
        //listView1.setAdapter(adapter);

        initcherecter();
        CharacterAdapter adapter = new CharacterAdapter(characterActivity.this,R.layout.character_item,characterList);
        ListView listView = findViewById(R.id.List1);
        listView.setAdapter(adapter);
    }

    private void initcherecter(){//分别添加人物图片，名字
            Character a1 = new Character("亚里莎", R.drawable.a1_pic);
            characterList.add(a1);
            Character a2 = new Character("姬塔", R.drawable.a2_pic);
            characterList.add(a2);
            Character a3 = new Character("莫妮卡・韦斯文特", R.drawable.a3_pic);
            characterList.add(a3);
            Character a4 = new Character("星野静流", R.drawable.a4_pic);
            characterList.add(a4);
        
    }
}
