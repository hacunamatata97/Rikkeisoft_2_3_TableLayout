package com.example.hacunamatata.rikkeisoft_2_tablelayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button mRed, mYellow, mBlue, mClear;
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize variables
        mRed = (Button) findViewById(R.id.Red);
        mYellow = (Button) findViewById(R.id.Yellow);
        mBlue = (Button) findViewById(R.id.Blue);
        mClear = (Button) findViewById(R.id.clearButton);
        mTextView = (TextView) findViewById(R.id.textView);

        //Action Performed
        actionPerformed();
    }

    private void actionPerformed() {

        //Red Button
        mRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTextView.setBackgroundResource(R.color.colorRed);
            }
        });

        //Yellow Button
        mYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTextView.setBackgroundResource(R.color.colorYellow);
            }
        });

        //Blue button
        mBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTextView.setBackgroundResource(R.color.colorBlue);
            }
        });

        //Clear button
        mClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTextView.setBackgroundResource(R.color.tablerow_white);
            }
        });
    }
}
