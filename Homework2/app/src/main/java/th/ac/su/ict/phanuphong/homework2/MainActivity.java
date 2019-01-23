package th.ac.su.ict.phanuphong.homework2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView boxTextColor;
    private Button oneButton,twoButton,threeButton,fourButton,fiveButton,sixButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boxTextColor = findViewById(R.id.boxTextColor);
        oneButton = findViewById(R.id.oneButton);
        twoButton = findViewById(R.id.twoButton);
        threeButton = findViewById(R.id.threeButton);
        fourButton = findViewById(R.id.fourButton);
        fiveButton = findViewById(R.id.fiveButton);
        sixButton = findViewById(R.id.sixButton);


        oneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boxTextColor.setText("233-225-222");
                boxTextColor.setBackgroundColor(Color.rgb(233, 225, 222));
            }
        });

        twoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boxTextColor.setText("231-204-203");
                boxTextColor.setBackgroundColor(Color.rgb(231, 204, 203));
            }
        });

        threeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boxTextColor.setText("119-131-154");
                boxTextColor.setBackgroundColor(Color.rgb(119, 131, 154));
            }
        });

        fourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boxTextColor.setText("156-169-189");
                boxTextColor.setBackgroundColor(Color.rgb(156, 169, 189));
            }
        });

        fiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boxTextColor.setText("196-204-212");
                boxTextColor.setBackgroundColor(Color.rgb(196, 204, 212));
            }
        });

        sixButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boxTextColor.setText("222-226-229");
                boxTextColor.setBackgroundColor(Color.rgb(222, 226, 229));
            }
        });


    }
}
