package com.example.laptophome.amerhw1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txt1=(TextView)findViewById(R.id.textView1);
        TextView txt2=(TextView)findViewById(R.id.textView2);
        TextView btn1=(TextView)findViewById(R.id.button);
        TextView btn2=(TextView)findViewById(R.id.button2);
        EditText edt=(EditText)findViewById(R.id.editText1);
        txt1.setVisibility(View.INVISIBLE);
        txt2.setVisibility(View.INVISIBLE);
        btn1.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.INVISIBLE);
        edt.setVisibility(View.INVISIBLE);


    }
    public Random r;
    public int number1,number2;
    public void start(View view)
    {
        TextView txt1=(TextView)findViewById(R.id.textView1);
        TextView txt2=(TextView)findViewById(R.id.textView2);
        TextView btn1=(TextView)findViewById(R.id.button);
        TextView btn2=(TextView)findViewById(R.id.button2);
        EditText edt=(EditText)findViewById(R.id.editText1);
        txt1.setVisibility(View.VISIBLE);
        txt2.setVisibility(View.VISIBLE);
        btn1.setVisibility(View.INVISIBLE);
        btn2.setVisibility(View.VISIBLE);
        edt.setVisibility(View.VISIBLE);
        r = new Random();

        number1 = r.nextInt(999)+1;

    }

    public void check(View view)
    {
        TextView txt1=(TextView)findViewById(R.id.textView1);
        TextView txt2=(TextView)findViewById(R.id.textView2);
        TextView btn1=(TextView)findViewById(R.id.button);
        TextView btn2=(TextView)findViewById(R.id.button2);
        EditText edt=(EditText)findViewById(R.id.editText1);
        txt2.setText("");


        number2= Integer.valueOf(edt.getText().toString());


        if(number2>=1000)
        {
            txt2.setText("Please enter number between 1 and 1000");
        }


        else if(number2<number1){


        txt2.setText("the number is greater, try larg number");

        }


        else if(number2>number1){


        txt2.setText("the number is smaller, try small number");


        }
        else if(number2==number1)
         {

            txt2.setText("You guessed the number");

             txt1.setVisibility(View.INVISIBLE);

             btn1.setVisibility(View.VISIBLE);
             btn2.setVisibility(View.INVISIBLE);
             edt.setVisibility(View.INVISIBLE);



         }

    }
}
