package com.example.gabri.calculadora;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.regex.Pattern;

import com.example.gabri.calculadora.listeners.OnClickEqual;
import com.example.gabri.calculadora.listeners.OnClickNumber;
import com.example.gabri.calculadora.listeners.OnClickOperador;
import com.example.gabri.calculadora.listeners.OnClickClear;

public class MainActivity extends Activity {
    public TextView screen;
    public String tela = "";
    public String op = "";
    public Double number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        screen = (TextView) findViewById(R.id.screen);
        updateScreen();

        Button bt_0 = (Button) findViewById(R.id.bt_0);
        Button bt_1 = (Button) findViewById(R.id.bt_1);
        Button bt_2 = (Button) findViewById(R.id.bt_2);
        Button bt_3 = (Button) findViewById(R.id.bt_3);
        Button bt_4 = (Button) findViewById(R.id.bt_4);
        Button bt_5 = (Button) findViewById(R.id.bt_5);
        Button bt_6 = (Button) findViewById(R.id.bt_6);
        Button bt_7 = (Button) findViewById(R.id.bt_7);
        Button bt_8 = (Button) findViewById(R.id.bt_8);
        Button bt_9 = (Button) findViewById(R.id.bt_9);
        Button bt_p = (Button) findViewById(R.id.bt_p);

        Button bt_div = (Button) findViewById(R.id.bt_div);
        Button bt_mult = (Button) findViewById(R.id.bt_mult);
        Button bt_sub = (Button) findViewById(R.id.bt_sub);
        Button bt_ad = (Button) findViewById(R.id.bt_ad);

        Button bt_c = (Button) findViewById(R.id.bt_c);
        Button bt_ig = (Button) findViewById(R.id.bt_ig);


        bt_0.setOnClickListener(new OnClickNumber(this));
        bt_1.setOnClickListener(new OnClickNumber(this));
        bt_2.setOnClickListener(new OnClickNumber(this));
        bt_3.setOnClickListener(new OnClickNumber(this));
        bt_4.setOnClickListener(new OnClickNumber(this));
        bt_5.setOnClickListener(new OnClickNumber(this));
        bt_6.setOnClickListener(new OnClickNumber(this));
        bt_7.setOnClickListener(new OnClickNumber(this));
        bt_8.setOnClickListener(new OnClickNumber(this));
        bt_9.setOnClickListener(new OnClickNumber(this));
        bt_p.setOnClickListener(new OnClickNumber(this));

        bt_div.setOnClickListener(new OnClickOperador(this));
        bt_mult.setOnClickListener(new OnClickOperador(this));
        bt_sub.setOnClickListener(new OnClickOperador(this));
        bt_ad.setOnClickListener(new OnClickOperador(this));

        bt_c.setOnClickListener(new OnClickClear(this));

        bt_ig.setOnClickListener(new OnClickEqual(this));
    }

    public void updateScreen() {
        screen.setText(tela);
    }

    public double result() {
        String[] numbers = tela.split(Pattern.quote(op));
        if (numbers.length == 1) {
            return Double.parseDouble(numbers[0]);
        } else {
            switch (op) {
                case "+":
                    return Double.parseDouble(numbers[0]) + Double.parseDouble(numbers[1]);
                case "-":
                    return Double.parseDouble(numbers[0]) - Double.parseDouble(numbers[1]);
                case "/":
                    return Double.parseDouble(numbers[0]) / Double.parseDouble(numbers[1]);
                case "*":
                    return Double.parseDouble(numbers[0]) * Double.parseDouble(numbers[1]);
                default:
                    return 0;
            }
        }
    }

    public void t() {
        double add = 0, sub = 0, div = 1, mult = 1;
        String[] numbAdd = tela.split(Pattern.quote("+"));
        for (int A = 0; A < numbAdd.length; A++) {
            if (numbAdd.length == 1) {
                String[] numbSub = numbAdd[A].split(Pattern.quote("-"));
                if (numbSub.length == 1) {
                    for (int S = 0; S < numbSub.length; S++) {
                        String[] numbDiv = numbSub[S].split(Pattern.quote("/"));
                        if (numbDiv.length == 1){
                            for (int D = 0; D < numbDiv.length; D++) {
                                String[] numbMult = numbDiv[D].split(Pattern.quote("*"));
                                for (int M = 0; M < numbMult.length; M++) {
                                    mult *= Double.parseDouble(numbMult[M]);
                                }
                            }
                        }

                    }
                }

            }
            String[] numbSub = numbAdd[A].split(Pattern.quote("-"));

        }

    }

}