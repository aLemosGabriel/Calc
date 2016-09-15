package com.example.gabri.calculadora.listeners;

import android.view.View;

import com.example.gabri.calculadora.MainActivity;

/**
 * Created by gabri on 15/09/2016.
 */
public class OnClickClear implements View.OnClickListener {

    MainActivity main;

    public OnClickClear(MainActivity main){
        this.main = main;
    }

    @Override
    public void onClick(View view) {
        main.tela = "";
        main.op = "";
        main.updateScreen();

    }
}
