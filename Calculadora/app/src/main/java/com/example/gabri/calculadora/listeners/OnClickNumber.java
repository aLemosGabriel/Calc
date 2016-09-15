package com.example.gabri.calculadora.listeners;

import android.view.View;
import android.widget.Button;
import com.example.gabri.calculadora.MainActivity;


/**
 * Created by gabri on 15/09/2016.
 */
public class OnClickNumber implements View.OnClickListener {

    MainActivity main;

    public OnClickNumber(MainActivity main){
        this.main = main;
    }

    @Override
    public void onClick(View view) {
        Button b = (Button) view;
        main.tela += b.getText();
        main.updateScreen();
    }
}