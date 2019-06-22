package com.aknu.lpcalculator;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//Instantiating the Variables needed here
    private int mLifePoints = 4000;
    private TextView mShowLP;
    private EditText mEdit;
    private EditText mEdit2;
    private Button mButton;
    private Button mButton2;
    private String value;
    private int LPVal;
    private int LPVal2;

//So far, we have the creation of the mShowLP TextView view here
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowLP = findViewById(R.id.LP);
        mButton = findViewById(R.id.Submit);
        mEdit = findViewById(R.id.DecreaseLP);
        mButton2 = findViewById(R.id.Submit2);
        mEdit2 =  findViewById(R.id.IncreaseLP);


        mButton.setOnClickListener(
                new View.OnClickListener()
                {
                    //Here, we are making a listener to listen for button click.
                    //If the user DOES click after inputting a value, then it will
                    //cast it to an int (LPVal)
                    //Next, mLifePoints subtracts that value, and if it's not 0,
                    //Then it will set it's text to that
                    public void onClick(View view)
                    {
                        //Log.v("EditText",mEdit.getText().toString());
                        value = mEdit.getText().toString();
                        LPVal2 = new Integer(value).intValue();
                        mLifePoints -= LPVal2;
                        if (mShowLP != null) {
                            mShowLP.setText(Integer.toString(mLifePoints));
                        }
                    }
                });
        mButton2.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        value = mEdit2.getText().toString();
                        LPVal = new Integer(value).intValue();
                        mLifePoints += LPVal;
                        if (mShowLP != null) {
                            mShowLP.setText(Integer.toString(mLifePoints));
                        }
                    }
                });
    }

//From here until the end, our buttons are decreasing the LP in increments whenever they are clicked
    @SuppressLint("SetTextI18n")
    public void DecreaseLP100(View view) {
        mLifePoints -= 100;
        if(mShowLP != null) {
            mShowLP.setText(Integer.toString(mLifePoints));
        }
    }
//Increments of 100 Increase
    public void IncreaseLP100(View view) {
        mLifePoints += 100;
        if(mShowLP != null) {
            mShowLP.setText (Integer.toString(mLifePoints));
        }
    }
//Increments of 25 Decrease
    public void DecreaseLP25(View view) {
        mLifePoints -= 25;
        if(mShowLP != null) {
            mShowLP.setText(Integer.toString(mLifePoints));
        }
    }
//Increments of 25 Increase
    public void IncreaseLP25(View view) {
        mLifePoints += 25;
        if(mShowLP != null) {
            mShowLP.setText(Integer.toString(mLifePoints));
        }
    }

}
