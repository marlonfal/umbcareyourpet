package com.marlonfal.umba5;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.marlonfal.umba5.Classes.Person;

public class ConfirmActivity extends AppCompatActivity {
    TextView txtAppName;
    TextView txtDatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);

        txtAppName = (TextView) findViewById(R.id.txtAppName);
        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/Gula FREE.ttf");
        txtAppName.setTypeface(font);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            Person person = new Person(
                    extras.getString("nombres"),
                    extras.getString("apellidos"),
                    extras.getString("correo"),
                    extras.getString("telefono"),
                    extras.getString("preferencia"),
                    extras.getString("resumen"),
                    extras.getBoolean("correos"));

            Log.d("datos", person.toString());
            txtDatos = findViewById(R.id.txtDatos);
            txtDatos.setText(person.toString());
        }
    }
}
