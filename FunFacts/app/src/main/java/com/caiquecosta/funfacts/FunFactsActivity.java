package com.caiquecosta.funfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {
    public static final String TAG = FunFactsActivity.class.getSimpleName();
    private ColorWheel colorWheel = new ColorWheel();
    private FactBook factBook = new FactBook();
    //declare our view variables
    private TextView factTextView;
    private Button showFactButton;
    private RelativeLayout relativeLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Assign the views from the layout to the corresponding layout variables
        factTextView = (TextView)findViewById(R.id.factTextView);
        showFactButton = (Button)findViewById(R.id.ShowFactButton);
        relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        View.OnClickListener Listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fact = factBook.getFact();
                // update the screen with our new fact
                factTextView.setText(fact);
                int color = colorWheel.getColor();
                relativeLayout.setBackgroundColor(color);
                showFactButton.setTextColor(color);
            }
        };
        showFactButton.setOnClickListener(Listener);
        // Toast.makeText(this, "Yay! Our activity was created!", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "We're logging from the onCreate() method!");
    }
}





