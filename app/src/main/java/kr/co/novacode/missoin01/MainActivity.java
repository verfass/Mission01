package kr.co.novacode.missoin01;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {

    Button button01, button02;
    ImageView imageView01, imageView02;
    ScrollView scrollView01, scrollView02;
    BitmapDrawable bitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button01 = (Button)findViewById(R.id.button01);
        button02 = (Button)findViewById(R.id.button02);
        scrollView01 = (ScrollView)findViewById(R.id.scrollView01);
        scrollView02 = (ScrollView)findViewById(R.id.scrollView02);
        imageView01 = (ImageView)findViewById(R.id.imageView01);
        imageView02 = (ImageView)findViewById(R.id.imageView02);

        scrollView01.setHorizontalScrollBarEnabled(true);
        scrollView02.setHorizontalScrollBarEnabled(true);

        changeImage(1);

        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeImage(1);
            }
        });

        button02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeImage(0);
            }
        });

    }

    public void changeImage(int index) {
        Resources res = getResources();
        bitmap = (BitmapDrawable)res.getDrawable(R.drawable.image01);
        int bitmapWidth = bitmap.getIntrinsicWidth();
        int bitmapHeight = bitmap.getIntrinsicHeight();

        if (index == 0) {
            imageView01.setImageDrawable(null);

            imageView02.setImageDrawable(bitmap);
            imageView02.getLayoutParams().width = bitmapWidth;
            imageView02.getLayoutParams().height = bitmapHeight;

        } else {
            imageView02.setImageDrawable(null);

            imageView01.setImageDrawable(bitmap);
            imageView01.getLayoutParams().width = bitmapWidth;
            imageView01.getLayoutParams().height = bitmapHeight;
        }
    }
}
