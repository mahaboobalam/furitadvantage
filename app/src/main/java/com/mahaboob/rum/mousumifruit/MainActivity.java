package com.mahaboob.rum.mousumifruit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private AdView mAdView;


    private ImageView mango, watermelon, jackfruit, lichi, banana, pineapple, guyava, pepe, jaam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





    //xml file fine
        mango = findViewById(R.id.mangoBT);
        watermelon=findViewById(R.id.watermelonBT);
        jackfruit=findViewById(R.id.jackfruitBT);
        lichi=findViewById(R.id.lichiBT);
        banana=findViewById(R.id.bananaBT);
        pineapple=findViewById(R.id.pineappleBT);
        guyava=findViewById(R.id.goyavaBT);
        pepe=findViewById(R.id.pepeBT);
        jaam=findViewById(R.id.jaamBT);

        //onclick listener find
        mango.setOnClickListener(MainActivity.this);
        watermelon.setOnClickListener(MainActivity.this);
        jackfruit.setOnClickListener(MainActivity.this);
        lichi.setOnClickListener(MainActivity.this);
        banana.setOnClickListener(MainActivity.this);
        pineapple.setOnClickListener(MainActivity.this);
        guyava.setOnClickListener(MainActivity.this);
        pepe.setOnClickListener(MainActivity.this);
        jaam.setOnClickListener(MainActivity.this);

        //Admob Option

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }





    @Override
    public void onClick(View v) {
    if (v.getId()==R.id.mangoBT){
        Intent intent = new Intent(MainActivity.this,Main2Activity.class);
        intent.putExtra("name","mango");
        startActivity(intent);
    }
        if (v.getId()==R.id.watermelonBT){
            Intent intent = new Intent(MainActivity.this,Main2Activity.class);
            intent.putExtra("name","watermelon");
            startActivity(intent);
        }

        if (v.getId()==R.id.jackfruitBT){
            Intent intent = new Intent(MainActivity.this,Main2Activity.class);
            intent.putExtra("name","jackfruit");
            startActivity(intent);
        }

        if (v.getId()==R.id.lichiBT){
            Intent intent = new Intent(MainActivity.this,Main2Activity.class);
            intent.putExtra("name","lichi");
            startActivity(intent);
        }

        if (v.getId()==R.id.bananaBT){
            Intent intent = new Intent(MainActivity.this,Main2Activity.class);
            intent.putExtra("name","banana");
            startActivity(intent);
        }

        if (v.getId()==R.id.pineappleBT){
            Intent intent = new Intent(MainActivity.this,Main2Activity.class);
            intent.putExtra("name","pineapple");
            startActivity(intent);
        }

        if (v.getId()==R.id.goyavaBT){
            Intent intent = new Intent(MainActivity.this,Main2Activity.class);
            intent.putExtra("name","guyava");
            startActivity(intent);
        }

        if (v.getId()==R.id.pepeBT){
            Intent intent = new Intent(MainActivity.this,Main2Activity.class);
            intent.putExtra("name","pepe");
            startActivity(intent);
        }

        if (v.getId()==R.id.jaamBT){
            Intent intent = new Intent(MainActivity.this,Main2Activity.class);
            intent.putExtra("name","jaam");
            startActivity(intent);
        }

    }
}
