package es.uem.testparceablebueno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import es.uem.testparceablebueno.javabean.Persona;

public class Datos extends AppCompatActivity {

    // Declaración de variables
    TextView tvDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);

        // Instanciamos las variables
        tvDatos = findViewById(R.id.tvDatos);

        // Recuperamos el objeto persona
        Persona persona = getIntent().getParcelableExtra(MainActivity.KEY_PERSONA);

        // Mostramos los datos
        tvDatos.setText(String.format(getString(R.string.tv_datos), persona.getNombre(), persona.getNacionalidad(), persona.getEdad()));



    }
}