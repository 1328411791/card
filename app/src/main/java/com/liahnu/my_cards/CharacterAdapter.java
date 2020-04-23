package com.liahnu.my_cards;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CharacterAdapter extends ArrayAdapter<Character> {
    private int resourcedId;

    public CharacterAdapter(Context context, int textViewResourceId,
                            List<Character> objects){
        super(context,textViewResourceId, objects);
        resourcedId = textViewResourceId;

    }
    @Override
    public View getView(int position, View converView, ViewGroup parent){
        Character character = getItem(position);
        View view= LayoutInflater.from(getContext()).inflate(resourcedId,parent,false);
        ImageView characterImage = view.findViewById(R.id.character_image);
        TextView characterName = view.findViewById(R.id.character_name);
        characterImage.setImageResource(character.getImageId());
        characterName.setText(character.getName());
        return view;
    }

}
