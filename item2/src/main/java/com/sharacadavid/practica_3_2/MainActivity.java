package com.sharacadavid.practica_3_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText Equices = (EditText) findViewById(R.id.Iquices);
        final EditText Eexposiciones = (EditText) findViewById(R.id.Iexposiciones);
        final EditText Epracticas = (EditText) findViewById(R.id.Ipracticas);
        final EditText Eproyecto = (EditText) findViewById(R.id.Iproyecto);
        final TextView TnotaFinal= (TextView) findViewById(R.id.InotaF);
        Button btnCalcular = (Button) findViewById(R.id.Icalular);



        btnCalcular.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String Squices = Equices.getText().toString();
                String Sexpo = Eexposiciones.getText().toString();
                String Spracticas = Epracticas.getText().toString();
                String Sproyecto = Eproyecto.getText().toString();
                if (Squices.isEmpty() == true || Squices.equals("--") || Squices.equals(".")) {
                    Toast.makeText(getApplicationContext(), "Cantidad inválida en Quices", Toast.LENGTH_LONG).show();
                } else if (Sexpo.isEmpty() == true || Sexpo.equals("--") || Sexpo.equals(".")) {
                    Toast.makeText(getApplicationContext(), "Cantidad inválida en Exposiciones", Toast.LENGTH_LONG).show();
                } else if (Spracticas.isEmpty() == true || Spracticas.equals("--") || Spracticas.equals(".")) {
                    Toast.makeText(getApplicationContext(), "Cantidad inválida en Prácticas", Toast.LENGTH_LONG).show();
                } else if (Sproyecto.isEmpty() == true || Sproyecto.equals("--") || Sproyecto.equals(".")) {
                    Toast.makeText(getApplicationContext(), "Cantidad inválida en Proy. Final", Toast.LENGTH_LONG).show();
                } else {

                    double total = 0;
                    double quices = Double.parseDouble(Squices);
                    double exposiciones = Double.parseDouble(Eexposiciones.getText().toString());
                    double proyecto = Double.parseDouble(Eproyecto.getText().toString());
                    double practicas = Double.parseDouble(Epracticas.getText().toString());
                    total = quices * 0.15 + exposiciones * 0.1 + proyecto * 0.4 + practicas * 0.35;
                    TnotaFinal.setText(" "+String.valueOf(total));
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
