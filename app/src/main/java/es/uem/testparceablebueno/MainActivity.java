package es.uem.testparceablebueno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import es.uem.testparceablebueno.javabean.Persona;

public class MainActivity extends AppCompatActivity {

    // Declaración de variables
    EditText etNombre, etNacionalidad, etEdad;
    Button btnEnviar;
    public static final String KEY_PERSONA = "PERSONA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Instanciamos las variables
        etNombre = findViewById(R.id.etNombre);
        etNacionalidad = findViewById(R.id.etNacionalidad);
        etEdad = findViewById(R.id.etEdad);
        btnEnviar = findViewById(R.id.btnEnviar);

        // Creamos escuchador de evento
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = etNombre.getText().toString();
                String nacionalidad = etNacionalidad.getText().toString();
                int edad = Integer.parseInt(etEdad.getText().toString());

                // Creamos objeto persona
                Persona persona = new Persona(nombre, nacionalidad, edad);

                // Creamos intent
                Intent intent = new Intent(MainActivity.this, Datos.class); // (Contexto, Destino)

                // Añadimos el objeto persona al intent
                intent.putExtra(KEY_PERSONA, persona); // (Nombre, Objeto)
                startActivity(intent);

            }
        });
    }
}