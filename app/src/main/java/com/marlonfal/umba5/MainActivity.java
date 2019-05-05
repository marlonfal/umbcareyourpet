package com.marlonfal.umba5;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtAppName;
    Button registerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtAppName = findViewById(R.id.txtAppName);
        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/Gula FREE.ttf");
        txtAppName.setTypeface(font);

        registerBtn = findViewById(R.id.registerBtn);
        registerBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openRegisterActivity();
            }
        });
    }

    public void openRegisterActivity() {
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }
}
