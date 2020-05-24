package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private Button btnTop, btnBottom;
    private TextView textViewStory;
    private int mStoryIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializeComponents();
        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        btnTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mStoryIndex == 1 || mStoryIndex == 2) {
                    textViewStory.setText(R.string.T3_Story);
                    btnTop.setText(R.string.T3_Ans1);
                    btnBottom.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                } else  {
                    textViewStory.setText(R.string.T6_End);
                    btnTop.setVisibility(View.GONE);
                    btnBottom.setVisibility(View.GONE);
                }
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        btnBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mStoryIndex == 1) {
                    textViewStory.setText(R.string.T2_Story);
                    btnTop.setText(R.string.T2_Ans1);
                    btnBottom.setText(R.string.T2_Ans2);
                    mStoryIndex = 2;
                } else if(mStoryIndex == 2) {
                    textViewStory.setText(R.string.T4_End);
                    btnTop.setVisibility(View.GONE);
                    btnBottom.setVisibility(View.GONE);
                } else {
                    textViewStory.setText(R.string.T5_End);
                    btnTop.setVisibility(View.GONE);
                    btnBottom.setVisibility(View.GONE);
                }
            }
        });

    }

    public void inicializeComponents () {
        btnTop = findViewById(R.id.buttonTop);
        btnBottom = findViewById(R.id.buttonBottom);
        textViewStory = findViewById(R.id.storyTextView);
    }

}
