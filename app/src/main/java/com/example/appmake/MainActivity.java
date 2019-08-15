package com.example.appmake;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnDialNumber,btnCallNumber,btnShowLocation,btnWebPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDialNumber=(Button)findViewById(R.id.btnDialNumber);
        btnShowLocation=(Button)findViewById(R.id.btnShowLocation);
        btnWebPage=(Button)findViewById(R.id.btnWebPage);
        btnDialNumber.setOnClickListener(this);
        btnShowLocation.setOnClickListener(this);
        btnWebPage.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.  btnDialNumber:
                dialNumber();
                break;

            case R.id.btnShowLocation:
                    showLocation();
                     break;
            case R.id.btnWebPage:
                     openWebPage();
                     break;

        }
    }

       @SuppressLint("MissingPermission")
        private void dialNumber(){
           Intent dialIntent=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:9986279744"));
           startActivity(dialIntent);
         }

    private void showLocation(){
        Intent mapIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("geo:12.902304,77.518580"));
        startActivity(mapIntent);
    }

    private void openWebPage(){
        Intent webIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
        startActivity(webIntent);
    }

}
