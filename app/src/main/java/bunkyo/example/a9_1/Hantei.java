package bunkyo.example.a9_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Hantei extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hantei);
        ((TextView) findViewById(R.id.textView4)).setMovementMethod(new ScrollingMovementMethod());
    }

}