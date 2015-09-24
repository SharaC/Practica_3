package com.sharacadavid.myapplication;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioOperacionGroup;
    private RadioButton radioOperacionButton;
    private Button btnCalcular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        addListenerOnButton();
    }
    public void addListenerOnButton() {

        final EditText num1= (EditText) findViewById(R.id.eNum1);
        final EditText num2= (EditText) findViewById(R.id.eNum2);
        radioOperacionGroup = (RadioGroup) findViewById(R.id.radioOperacionGroup);
        final TextView Tresult = (TextView) findViewById(R.id.Tresult);

        btnCalcular = (Button) findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                // get selected radio button from radioGroup
                int selectedId = radioOperacionGroup.getCheckedRadioButtonId();
                radioOperacionButton = (RadioButton) findViewById(selectedId);

                    String numeroa= num1.getText().toString();
                    String numerob= num2.getText().toString();
                    double total=0 ;

                    if (numeroa.isEmpty()==true|| numeroa.equals("-")|| numeroa.equals(".")) {
                        Toast.makeText(getApplicationContext(), "Debe ingresar una cantidad válida en el campo: Numero1", Toast.LENGTH_LONG).show();
                    }else if(numerob.isEmpty()==true|| numerob.equals("-")|| numerob.equals(".")){
                            Toast.makeText(getApplicationContext(), "Debe ingresar una cantidad válida en el campo: Numero2", Toast.LENGTH_LONG).show();
                        }
                    else {

                        double numero1 = Double.parseDouble(numeroa);
                        double numero2 = Double.parseDouble(numerob);
                        try {

                            switch (selectedId) {
                                case R.id.Rsuma:
                                    total = numero1 + numero2;
                                    break;
                                case R.id.Rresta:
                                    total = numero1 - numero2;
                                    break;
                                case R.id.Rmultiplica:
                                    total = numero1 * numero2;
                                    break;
                                default:
                                    total = numero1 / numero2;
                            }
                            Tresult.setText(String.valueOf(total));
                        } catch (NumberFormatException e) {
                            Tresult.setText("Resultado: Faltan datos");
                        } catch (ArithmeticException e) {
                            Tresult.setText("Resultado: Error en operacion");
                        }
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
