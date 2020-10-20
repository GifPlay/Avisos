package com.example.avisos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Agregar TAG para invocarlo en estados de la app
    private static final String TAG= "MainActivity";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //vincula al boton del archivo activity_main.xml con el MainActivity.java
        Button btnMA = findViewById(R.id.btnMA);

        btnMA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ira2 = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(ira2);
            }
        });

        //En el registro de ejecución de mostrará la acción realizada
        Log.i(TAG,"OnCreate");
       // Toast.makeText(this, "La aplicación se ha creado", Toast.LENGTH_SHORT).show();
        Context context = getApplicationContext();
        CharSequence text ="Aplicación Creada";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.TOP|Gravity.CENTER_HORIZONTAL,0,0);
        toast.show();
    }

    // Estado en On Start
    @Override
    protected void onStart(){
        super.onStart();
        Log.i(TAG,"Mensaje de OnStart");
        //Toast.makeText(this, "La aplicación ha iniciado", Toast.LENGTH_SHORT).show();
        Context context = getApplicationContext();
        CharSequence text ="Aplicación Iniciada";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.TOP|Gravity.CENTER_HORIZONTAL,0,0);
        toast.show();
    }

    //Estado de On Resumen
    @Override
    protected void onResume(){
        super.onResume();

        // Toast Personalizado
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast_personalizado_onresume,(ViewGroup) findViewById(R.id.toast_on_resume));
        TextView texto = (TextView) layout.findViewById(R.id.texto_Toast);
        texto.setText("Entro en la Actividad Principal");

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i(TAG,"Mensaje de OnPause");
        //Toast.makeText(this, "La aplicación se encuentra pausada", Toast.LENGTH_SHORT).show();
        Context context = getApplicationContext();
        CharSequence text ="Aplicación Pausada";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.TOP|Gravity.CENTER_HORIZONTAL,0,0);
        toast.show();
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i(TAG,"Mensaje de onStop");
        //Toast.makeText(this, "La aplicación se ha detenido", Toast.LENGTH_SHORT).show();

        Context context = getApplicationContext();
        CharSequence text ="Aplicación detenida";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
        toast.show();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i(TAG,"Mensaje de onDestroy");
        //Toast.makeText(this, "La aplicación ha cerrado", Toast.LENGTH_SHORT).show();

        Context context = getApplicationContext();
        CharSequence text ="Cerrando Sesión";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
        toast.show();
    }


}