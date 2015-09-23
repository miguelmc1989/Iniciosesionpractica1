package com.udg.miguel.loginusuario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button boton = (Button) findViewById(R.id.button);
        boton.setOnClickListener(new View.OnClickListener(){
            @Override

           public void onClick(View view) {
                String usuario = ((EditText)findViewById(R.id.txtusuario)).getText().toString();
                String password = ((EditText)findViewById(R.id.txtcontraseña)).getText().toString();
                if (usuario.equals("root" )&& password.equals("admin"))
                {
                    Intent nuevoform = new Intent(MainActivity.this,Ventana.class);
                    startActivity(nuevoform);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Usuario o Contraseña incorrectos",Toast.LENGTH_SHORT).show();
                }
        }

        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
