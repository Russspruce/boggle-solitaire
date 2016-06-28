package com.epicodus.android.boggle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
    public char[] letters = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
    public ArrayList<Character> randomStringArray = new ArrayList<Character>();
    public String randomString = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random randomGenerator = new Random();

        for(int index = 0; index < 2; index++) {
            int randomInt = randomGenerator.nextInt(4);
            randomStringArray.add(vowels[randomInt]);
        }

        for (int index = 0; index < 6; index++) {
            int randomInt = randomGenerator.nextInt(25);
            randomStringArray.add(letters[randomInt]);
        }

        Collections.shuffle(randomStringArray);

        for (Character character : randomStringArray) {
            randomString += character;
        }

        Toast.makeText(MainActivity.this, randomString, Toast.LENGTH_LONG).show();
    }
}
