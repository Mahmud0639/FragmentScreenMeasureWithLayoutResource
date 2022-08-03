package com.manuni.fragmentscreenmeasurewithlayoutresource;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.showTxt);

        ViewGroup frameLayout = findViewById(R.id.detailFragmentContainer);
        boolean isUsing = (frameLayout != null);
        if (isUsing){
            textView.setText("It is possible to use the fragment side by side");
            Toast.makeText(this, "It is possible to use the fragment side by side", Toast.LENGTH_SHORT).show();
        }else {
            textView.setText("It is not possible to use the fragment side by side");
            Toast.makeText(this, "It is not possible to use the fragment side by side", Toast.LENGTH_SHORT).show();
        }
    }
}