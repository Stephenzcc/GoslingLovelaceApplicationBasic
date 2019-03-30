package com.example.goslinglovelaceapplicationbasic;

import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String str;
        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
            setContentView(R.layout.landscape);
            if(ifZH() == true){
                TextView namePort = (TextView)findViewById(R.id.adaName);
                namePort.setText("艾达·洛维斯");
                TextView tvPort = (TextView)findViewById(R.id.adaText);
                str = getResources().getString(R.string.ada_text_zh);
                tvPort.setText(str);
            }
        }
        else if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
            setContentView(R.layout.activity_main);
            if(ifZH() == true){
                TextView namePort = (TextView)findViewById(R.id.jamesName);
                namePort.setText("詹姆斯·高斯林");
                TextView tvPort = (TextView)findViewById(R.id.jamesText);
                str = getResources().getString(R.string.james_text_zh);
                tvPort.setText(str);
            }
        }
    }


    public boolean ifZH(){

        Locale locale = this.getResources().getConfiguration().locale;
        String language = locale.getLanguage();
        if(language.endsWith("zh")){
            return true;
        }
        else
            return false;

    }


}
