package com.tashi.myapplication;

import java.io.IOException;
import java.io.InputStream;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener{
    ImageView display;
    int tophone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        // to our activity to cover the whole screen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);
        Button but = (Button) findViewById(R.id.setwallpaper);
        tophone = R.drawable.image4;
        but.setOnClickListener(this);
        display = (ImageView) findViewById(R.id.ivdisplay);
        ImageView image1 = (ImageView) findViewById(R.id.IVimage1);
        ImageView image2 = (ImageView) findViewById(R.id.IVimage2);
        ImageView image3 = (ImageView) findViewById(R.id.IVimage3);
        ImageView image4 = (ImageView) findViewById(R.id.image4);
        ImageView image5 = (ImageView) findViewById(R.id.IVimage5);

        image1.setOnClickListener(this);
        image2.setOnClickListener(this);
        image3.setOnClickListener(this);
        image4.setOnClickListener(this);
        image5.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        Toast var;
        switch (v.getId()) {
            case R.id.IVimage1:
                display.setImageResource(R.drawable.image4);
                var = Toast.makeText(MainActivity.this, "image changed",
                        Toast.LENGTH_SHORT);

                var.show();
                tophone = R.drawable.image4;
                break;
            case R.id.IVimage2:
                display.setImageResource(R.drawable.image5);
                var = Toast.makeText(MainActivity.this, "image changed",
                        Toast.LENGTH_SHORT);

                var.show();

                tophone = R.drawable.image5;
                break;
            case R.id.IVimage3:
                display.setImageResource(R.drawable.image6);
                var = Toast.makeText(MainActivity.this, "image changed",
                        Toast.LENGTH_SHORT);

                var.show();

                tophone = R.drawable.image6;
                break;
            case R.id.image4:
                display.setImageResource(R.drawable.image7);
                var = Toast.makeText(MainActivity.this, "image changed",
                        Toast.LENGTH_SHORT);

                var.show();

                tophone = R.drawable.image7;
                break;
            case R.id.IVimage5:
                display.setImageResource(R.drawable.image8);
                var = Toast.makeText(MainActivity.this, "image changed",
                        Toast.LENGTH_SHORT);

                var.show();

                tophone = R.drawable.image8;
                break;
            case R.id.setwallpaper:
                // to set a background we need to use bitmap
                InputStream is = getResources().openRawResource(tophone);
                // to phone is a variable that is updated everytime we click on an
                // ImageView to that imageview resource and by clicking the button
                // we set the phone background to that image.
                Bitmap bm = BitmapFactory.decodeStream(is);
                // decode inputstream is
                try {
                    getApplicationContext().setWallpaper(bm);
                    // to set the wallpaper of the phone background we need to ask
                    // permission from the user so add permission of background from
                    // manifest file

                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                var = Toast.makeText(MainActivity.this, "Wallpaper image changed",
                        Toast.LENGTH_SHORT);

                var.show();

                break;
        }
    }
}
