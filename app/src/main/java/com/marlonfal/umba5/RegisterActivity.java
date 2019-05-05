package com.marlonfal.umba5;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;

import com.marlonfal.umba5.Classes.Person;

import org.w3c.dom.Text;

import javax.xml.transform.Result;

public class RegisterActivity extends AppCompatActivity {
    TextView txtAppName;

    TextView eTxtNombres;
    TextView eTxtApellidos;
    TextView eTxtCorreo;
    TextView eTxtTelefono;
    Spinner spnPreferencia;
    TextView eTxtResumen;
    CheckBox cbCorreos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        txtAppName = (TextView) findViewById(R.id.txtAppName);
        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/Gula FREE.ttf");
        txtAppName.setTypeface(font);
    }


    public void sendForm(View form) {
        eTxtNombres = findViewById(R.id.eTxtNombres);
        eTxtApellidos = findViewById(R.id.eTxtApellidos);
        eTxtCorreo = findViewById(R.id.eTxtCorreo);
        eTxtTelefono = findViewById(R.id.eTxtTelefono);
        spnPreferencia = findViewById(R.id.spnPreferencia);
        String preferencia = spnPreferencia.getSelectedItem().toString();
        eTxtResumen = findViewById(R.id.eTxtResumen);
        cbCorreos = findViewById(R.id.cbCorreos);
        boolean correos = cbCorreos.isChecked();


        Intent intent = new Intent(this, ConfirmActivity.class);

        intent.putExtra("nombres", eTxtNombres.getText().toString());
        intent.putExtra("apellidos", eTxtApellidos.getText().toString());
        intent.putExtra("correo", eTxtCorreo.getText().toString());
        intent.putExtra("telefono", eTxtTelefono.getText().toString());
        intent.putExtra("preferencia", preferencia);
        intent.putExtra("resumen", eTxtResumen.getText().toString());
        intent.putExtra("correos", correos);

        startActivity(intent);

    }
}
