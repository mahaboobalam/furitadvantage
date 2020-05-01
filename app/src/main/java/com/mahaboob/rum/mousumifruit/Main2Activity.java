package com.mahaboob.rum.mousumifruit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private ImageView profilePhotoID;
    private TextView nameID, detailsID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        profilePhotoID = findViewById(R.id.profilePicID);
        nameID = findViewById(R.id.name_ID);
        detailsID = findViewById(R.id.details_ID);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {
            String myValue = bundle.getString("name");

            showResult(myValue);
        }

    }

    public void showResult(String myValue) {
        if (myValue.equals("mango")) {
            profilePhotoID.setImageResource(R.drawable.mango);
            nameID.setText(R.string.mango_name);
            detailsID.setText(R.string.mango_deatils);
        }

        if (myValue.equals("watermelon")) {
            profilePhotoID.setImageResource(R.drawable.watermelon);
            nameID.setText(R.string.watermelon_name);
            detailsID.setText(R.string.watermelon_deatils);
        }

        if (myValue.equals("jackfruit")) {
            profilePhotoID.setImageResource(R.drawable.jackfruit);
            nameID.setText(R.string.jackfruit_name);
            detailsID.setText(R.string.jackfruit_deatils);
        }

        if (myValue.equals("lichi")) {
            profilePhotoID.setImageResource(R.drawable.lychee);
            nameID.setText(R.string.lichi_name);
            detailsID.setText(R.string.lichi_deatils);
        }

        if (myValue.equals("banana")) {
            profilePhotoID.setImageResource(R.drawable.banana);
            nameID.setText(R.string.banana_name);
            detailsID.setText(R.string.banana_deatils);
        }

        if (myValue.equals("pineapple")) {
            profilePhotoID.setImageResource(R.drawable.pineapple);
            nameID.setText(R.string.pineapple_name);
            detailsID.setText(R.string.pineapple_deatils);
        }

        if (myValue.equals("guyava")) {
            profilePhotoID.setImageResource(R.drawable.guyava);
            nameID.setText(R.string.guyava_name);
            detailsID.setText(R.string.guyava_deatils);
        }

        if (myValue.equals("pepe")) {
            profilePhotoID.setImageResource(R.drawable.pepe);
            nameID.setText(R.string.pepe_name);
            detailsID.setText(R.string.pepe_deatils);
        }

        if (myValue.equals("jaam")) {
            profilePhotoID.setImageResource(R.drawable.jaam);
            nameID.setText(R.string.jaam_name);
            detailsID.setText(R.string.jaam_deatils);
        }

    }
}
