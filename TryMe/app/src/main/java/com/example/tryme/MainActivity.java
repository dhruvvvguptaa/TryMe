package com.example.tryme;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private View windowView;
    private Button tryMeButton;
    private int[] colors;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colors= new int[] {Color.RED,Color.GRAY,Color.MAGENTA,Color.YELLOW,Color.CYAN,Color.BLACK,
                            Color.BLUE,Color.WHITE,Color.GREEN};
        windowView=findViewById(R.id.windowViewID);


        tryMeButton=(Button) findViewById(R.id.button2);

        tryMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int colorsarraylen = colors.length;
                Random random = new Random();
                int randomint = random.nextInt(colorsarraylen);

                windowView.setBackgroundColor(colors[randomint]);

                Log.d("Random",String.valueOf(randomint));
            }
        });
    }
}
