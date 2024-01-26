package com.example.imagechanger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Loadimage(View view)
    {
        ImageView img1=(ImageView)findViewById(R.id.imageView);
        switch(view.getId())
        {
            case R.id.b1:
                img1.setImageResource(R.drawable.img1);
                break;

            case R.id.b2:
                img1.setImageResource(R.drawable.img2);
                break;

            case R.id.b3:
                img1.setImageResource(R.drawable.img3);
                break;
        }
    }

}
