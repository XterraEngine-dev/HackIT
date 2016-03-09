package com.hackit.signum.hackit;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener{

    Button boton;
    EditText texto;
    String codigoSecreto;
    TextView resultado;
    public static String CODAHACK="hACK3d)(24!XS!gNum";
//olol
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton= (Button) findViewById(R.id.button);
        texto= (EditText) findViewById(R.id.editText);
        resultado= (TextView) findViewById(R.id.textView2);


        boton.setOnClickListener(this);





    }


    @Override
    public void onClick(View v) {

        codigoSecreto=texto.getText().toString();

        if (codigoSecreto.equals(CODAHACK)){

            resultado.setText("Código correcto!!!");


        }else{

            resultado.setText("Incorrecto!!!");

        }






    }
}
