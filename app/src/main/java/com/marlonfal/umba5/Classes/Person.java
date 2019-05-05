package com.marlonfal.umba5.Classes;

import android.os.Parcelable;

public class Person {
    public String Nombres;
    public String Apellidos;
    public String Correo;
    public String Telefono;
    public String Preferencias;
    public String Resumen;
    public Boolean Correos;

    public Person(String nombres, String apellidos, String correo, String telefono,
                String preferencias, String resumen, Boolean correos) {
        this.Nombres = nombres;
        this.Apellidos = apellidos;
        this.Correo = correo;
        this.Telefono = telefono;
        this.Preferencias = preferencias;
        this.Resumen = resumen;
        this.Correos = correos;
    }

    @Override
    public String toString() {
        String correos = Correos ? "Sí" : "No";
        return
                "Nombres: " + Nombres + '\n' +
                "Apellidos: " + Apellidos + '\n' +
                "Correo: " + Correo + '\n' +
                "Telefono: " + Telefono + '\n' +
                "Preferencias: " + Preferencias + '\n' +
                "Resumen: " + Resumen + '\n' +
                "Correos: " + correos;
    }
}
