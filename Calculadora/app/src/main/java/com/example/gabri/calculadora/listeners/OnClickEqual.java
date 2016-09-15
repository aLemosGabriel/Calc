package com.example.gabri.calculadora.listeners;

import android.view.View;

import com.example.gabri.calculadora.MainActivity;

/**
 * Created by gabri on 15/09/2016.
 */
public class OnClickEqual implements View.OnClickListener {
    MainActivity main;

    public OnClickEqual (MainActivity main){
        this.main = main;
    }

    @Override
    public void onClick(View view) {

        main.screen.setText( String.valueOf (main.result()) );

    }

}