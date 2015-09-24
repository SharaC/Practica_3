package com.sharacadavid.practica_3_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.sharacadavid.practica_3_2.R;

public class MainActivity extends AppCompatActivity {
    private RadioGroup radioOperacionGroup;
    private RadioButton radioOperacionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RadioButton circulo = (RadioButton) findViewById(R.id.Icirculo);
        RadioButton cuadrado = (RadioButton) findViewById(R.id.Icuadrado);
        RadioButton rectangulo = (RadioButton) findViewById(R.id.Irectangulo);
        RadioButton triangulo = (RadioButton) findViewById(R.id.Itriangulo);

        addListenerOnButton();
        circulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar1();
                addListenerOnButton();
            }
        });
        cuadrado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar2();
                addListenerOnButton();
            }
        });
        rectangulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar3();
                addListenerOnButton();
            }
        });
        triangulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar4();
                addListenerOnButton();
            }
        });
    }
        public void mostrar1 () {
           // final TextView Mostrar = (TextView) findViewById(R.id.Itext);
            final ImageView imgcirculo = (ImageView) findViewById(R.id.Imgcirculo);
            final ImageView imgcuadrado = (ImageView) findViewById(R.id.Imgcuadrado);
            final ImageView imgrectangulo = (ImageView) findViewById(R.id.Imgrectangulo);
            final ImageView imgtriangulo = (ImageView) findViewById(R.id.Imgtriangulo);
            final TextView Tradio= (TextView) findViewById(R.id.Iradio);
            final TextView Tlado= (TextView) findViewById(R.id.Ilado);
            final TextView Tladoa= (TextView) findViewById(R.id.ILadoa);
            final TextView Tbase= (TextView) findViewById(R.id.Ibase);
            final TextView Tladob= (TextView) findViewById(R.id.ILadob);
            final TextView Taltura= (TextView) findViewById(R.id.Ialtura);
            final EditText Edradio= (EditText) findViewById(R.id.Eradio);
            final EditText Edbase= (EditText) findViewById(R.id.Ebase);
            final EditText Edaltura= (EditText) findViewById(R.id.Ealtura);
            final EditText Edlado= (EditText) findViewById(R.id.Elado);
            final EditText Edladoa= (EditText) findViewById(R.id.Eladoa);
            final EditText Edladob= (EditText) findViewById(R.id.Eladob);




            //String texto = Mostrar.getText().toString();

            //   if (Mostrar.getVisibility()== View.GONE)
            if (imgcirculo.getVisibility() == View.INVISIBLE) {

                imgcirculo.setVisibility(View.VISIBLE);
                imgcuadrado.setVisibility(View.INVISIBLE);
                imgrectangulo.setVisibility(View.INVISIBLE);
                imgtriangulo.setVisibility(View.INVISIBLE);
                //}else if(imgcuadrado.getVisibility()==View.VISIBLE){
                //      Mostrar.setVisibility(View.GONE);
            } else imgcirculo.setVisibility(View.VISIBLE);
            if (Tradio.getVisibility() == View.INVISIBLE) {

                Tradio.setVisibility(View.VISIBLE);
                Tlado.setVisibility(View.INVISIBLE);
                Tladoa.setVisibility(View.INVISIBLE);
                Tladob.setVisibility(View.INVISIBLE);
                Tbase.setVisibility(View.INVISIBLE);
                Taltura.setVisibility(View.INVISIBLE);
                Edradio.setVisibility(View.VISIBLE);
                Edlado.setVisibility(View.INVISIBLE);
                Edladoa.setVisibility(View.INVISIBLE);
                Edladob.setVisibility(View.INVISIBLE);
                Edbase.setVisibility(View.INVISIBLE);
                Edaltura.setVisibility(View.INVISIBLE);
                //}else if(imgcuadrado.getVisibility()==View.VISIBLE){
                //      Mostrar.setVisibility(View.GONE);
            } else Tradio.setVisibility(View.VISIBLE);
        }

    public void mostrar2 () {
        //final TextView Mostrar = (TextView) findViewById(R.id.Itext);
        final ImageView imgcirculo = (ImageView) findViewById(R.id.Imgcirculo);
        final ImageView imgcuadrado = (ImageView) findViewById(R.id.Imgcuadrado);
        final ImageView imgrectangulo = (ImageView) findViewById(R.id.Imgrectangulo);
        final ImageView imgtriangulo = (ImageView) findViewById(R.id.Imgtriangulo);
        final TextView Tradio= (TextView) findViewById(R.id.Iradio);
        final TextView Tlado= (TextView) findViewById(R.id.Ilado);
        final TextView Tladoa= (TextView) findViewById(R.id.ILadoa);
        final TextView Tbase= (TextView) findViewById(R.id.Ibase);
        final TextView Tladob= (TextView) findViewById(R.id.ILadob);
        final TextView Taltura= (TextView) findViewById(R.id.Ialtura);
        final EditText Edlado= (EditText) findViewById(R.id.Elado);
        final EditText Edradio= (EditText) findViewById(R.id.Eradio);
        final EditText Edbase= (EditText) findViewById(R.id.Ebase);
        final EditText Edaltura= (EditText) findViewById(R.id.Ealtura);
        final EditText Edladoa= (EditText) findViewById(R.id.Eladoa);
        final EditText Edladob= (EditText) findViewById(R.id.Eladob);


        //String texto = Mostrar.getText().toString();

        //   if (Mostrar.getVisibility()== View.GONE)
        if (imgcuadrado.getVisibility() == View.INVISIBLE) {

            imgcirculo.setVisibility(View.INVISIBLE);
            imgcuadrado.setVisibility(View.VISIBLE);
            imgrectangulo.setVisibility(View.INVISIBLE);
            imgtriangulo.setVisibility(View.INVISIBLE);
            //}else if(imgcuadrado.getVisibility()==View.VISIBLE){
            //      Mostrar.setVisibility(View.GONE);
        } else imgcuadrado.setVisibility(View.VISIBLE);
        if (Tlado.getVisibility() == View.INVISIBLE) {

            Tradio.setVisibility(View.INVISIBLE);
            Tlado.setVisibility(View.VISIBLE);
            Tladoa.setVisibility(View.INVISIBLE);
            Tladob.setVisibility(View.INVISIBLE);
            Tbase.setVisibility(View.INVISIBLE);
            Taltura.setVisibility(View.INVISIBLE);
            Edlado.setVisibility(View.VISIBLE);
            Edradio.setVisibility(View.INVISIBLE);
            Edladoa.setVisibility(View.INVISIBLE);
            Edladob.setVisibility(View.INVISIBLE);
            Edbase.setVisibility(View.INVISIBLE);
            Edaltura.setVisibility(View.INVISIBLE);
            //}else if(imgcuadrado.getVisibility()==View.VISIBLE){
            //      Mostrar.setVisibility(View.GONE);
        } else Tlado.setVisibility(View.VISIBLE);
    }

    public void mostrar3 () {
        //final TextView Mostrar = (TextView) findViewById(R.id.Itext);
        final ImageView imgcirculo = (ImageView) findViewById(R.id.Imgcirculo);
        final ImageView imgcuadrado = (ImageView) findViewById(R.id.Imgcuadrado);
        final ImageView imgrectangulo = (ImageView) findViewById(R.id.Imgrectangulo);
        final ImageView imgtriangulo = (ImageView) findViewById(R.id.Imgtriangulo);
        final TextView Tradio= (TextView) findViewById(R.id.Iradio);
        final TextView Tlado= (TextView) findViewById(R.id.Ilado);
        final TextView Tladoa= (TextView) findViewById(R.id.ILadoa);
        final TextView Tbase= (TextView) findViewById(R.id.Ibase);
        final TextView Tladob= (TextView) findViewById(R.id.ILadob);
        final TextView Taltura= (TextView) findViewById(R.id.Ialtura);
        final EditText Edladoa= (EditText) findViewById(R.id.Eladoa);
        final EditText Edladob= (EditText) findViewById(R.id.Eladob);
        final EditText Edradio= (EditText) findViewById(R.id.Eradio);
        final EditText Edbase= (EditText) findViewById(R.id.Ebase);
        final EditText Edaltura= (EditText) findViewById(R.id.Ealtura);
        final EditText Edlado= (EditText) findViewById(R.id.Elado);

        //String texto = Mostrar.getText().toString();

        //   if (Mostrar.getVisibility()== View.GONE)
        if (imgrectangulo.getVisibility() == View.INVISIBLE) {

            imgcirculo.setVisibility(View.INVISIBLE);
            imgcuadrado.setVisibility(View.INVISIBLE);
            imgrectangulo.setVisibility(View.VISIBLE);
            imgtriangulo.setVisibility(View.INVISIBLE);
            //}else if(imgcuadrado.getVisibility()==View.VISIBLE){
            //      Mostrar.setVisibility(View.GONE);
        } else imgrectangulo.setVisibility(View.VISIBLE);
        if (Tladoa.getVisibility() == View.INVISIBLE) {

            Tradio.setVisibility(View.INVISIBLE);
            Tlado.setVisibility(View.INVISIBLE);
            Tladoa.setVisibility(View.VISIBLE);
            Tladob.setVisibility(View.VISIBLE);
            Tbase.setVisibility(View.INVISIBLE);
            Taltura.setVisibility(View.INVISIBLE);
            Edladoa.setVisibility(View.VISIBLE);
            Edladob.setVisibility(View.VISIBLE);
            Edlado.setVisibility(View.INVISIBLE);
            Edradio.setVisibility(View.INVISIBLE);
            Edbase.setVisibility(View.INVISIBLE);
            Edaltura.setVisibility(View.INVISIBLE);
            //}else if(imgcuadrado.getVisibility()==View.VISIBLE){
            //      Mostrar.setVisibility(View.GONE);
        } else {
            Tladoa.setVisibility(View.VISIBLE);
            Tladob.setVisibility(View.VISIBLE);
        }
    }

    public void mostrar4 () {
        //final TextView Mostrar = (TextView) findViewById(R.id.Itext);
        final ImageView imgcirculo = (ImageView) findViewById(R.id.Imgcirculo);
        final ImageView imgcuadrado = (ImageView) findViewById(R.id.Imgcuadrado);
        final ImageView imgrectangulo = (ImageView) findViewById(R.id.Imgrectangulo);
        final ImageView imgtriangulo = (ImageView) findViewById(R.id.Imgtriangulo);
        final TextView Tradio= (TextView) findViewById(R.id.Iradio);
        final TextView Tlado= (TextView) findViewById(R.id.Ilado);
        final TextView Tladoa= (TextView) findViewById(R.id.ILadoa);
        final TextView Tbase= (TextView) findViewById(R.id.Ibase);
        final TextView Tladob= (TextView) findViewById(R.id.ILadob);
        final TextView Taltura= (TextView) findViewById(R.id.Ialtura);
        final EditText Edbase= (EditText) findViewById(R.id.Ebase);
        final EditText Edaltura= (EditText) findViewById(R.id.Ealtura);
        final EditText Edradio= (EditText) findViewById(R.id.Eradio);
        final EditText Edlado= (EditText) findViewById(R.id.Elado);
        final EditText Edladoa= (EditText) findViewById(R.id.Eladoa);
        final EditText Edladob= (EditText) findViewById(R.id.Eladob);

        //String texto = Mostrar.getText().toString();

        //   if (Mostrar.getVisibility()== View.GONE)
        if (imgtriangulo.getVisibility() == View.INVISIBLE) {

            imgcirculo.setVisibility(View.INVISIBLE);
            imgcuadrado.setVisibility(View.INVISIBLE);
            imgrectangulo.setVisibility(View.INVISIBLE);
            imgtriangulo.setVisibility(View.VISIBLE);
            //}else if(imgcuadrado.getVisibility()==View.VISIBLE){
            //      Mostrar.setVisibility(View.GONE);
        } else imgtriangulo.setVisibility(View.VISIBLE);
        if (Tbase.getVisibility() == View.INVISIBLE) {

            Tradio.setVisibility(View.INVISIBLE);
            Tlado.setVisibility(View.INVISIBLE);
            Tladoa.setVisibility(View.INVISIBLE);
            Tladob.setVisibility(View.INVISIBLE);
            Tbase.setVisibility(View.VISIBLE);
            Taltura.setVisibility(View.VISIBLE);
            Edaltura.setVisibility(View.VISIBLE);
            Edlado.setVisibility(View.INVISIBLE);
            Edradio.setVisibility(View.INVISIBLE);
            Edladoa.setVisibility(View.INVISIBLE);
            Edladob.setVisibility(View.INVISIBLE);
            Edbase.setVisibility(View.VISIBLE);


            //}else if(imgcuadrado.getVisibility()==View.VISIBLE){
            //      Mostrar.setVisibility(View.GONE);
        } else {
            Tbase.setVisibility(View.VISIBLE);
            Taltura.setVisibility(View.VISIBLE);
        }
    }



    public void addListenerOnButton() {
        Button btnCalcular = (Button) findViewById(R.id.ICalcular);
        // final EditText num1= (EditText) findViewById(R.id.eNum1);
        // final EditText num2= (EditText) findViewById(R.id.eNum2);
        radioOperacionGroup = (RadioGroup) findViewById(R.id.radioOperacionGroup);
        final TextView Tresult = (TextView) findViewById(R.id.Iresult);

        btnCalcular = (Button) findViewById(R.id.ICalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // get selected radio button from radioGroup
                int selectedId = radioOperacionGroup.getCheckedRadioButtonId();
                radioOperacionButton = (RadioButton) findViewById(selectedId);

                double area=0 ;

               /* if (numeroa.isEmpty()==true|| numeroa.equals("-")|| numeroa.equals(".")) {
                    Toast.makeText(getApplicationContext(), "Debe ingresar una cantidad válida en el campo: Numero1", Toast.LENGTH_LONG).show();
                }else if(numerob.isEmpty()==true|| numerob.equals("-")|| numerob.equals(".")){
                    Toast.makeText(getApplicationContext(), "Debe ingresar una cantidad válida en el campo: Numero2", Toast.LENGTH_LONG).show();
                }
                else {*/

                    //double numero1 = Double.parseDouble(numeroa);
                    //double numero2 = Double.parseDouble(numerob);
                    try {

                        switch (selectedId) {
                            case R.id.Icirculo:
                                final EditText radio1= (EditText) findViewById(R.id.Eradio);
                                double radio= Double.parseDouble(radio1.getText().toString());
                                area = Math.pow(radio,2)*(Math.PI);
                                Tresult.setText(String.valueOf(area));
                                if ((radio1.getText().toString()).isEmpty()==true|| (radio1.getText().toString()).equals(".")) {
                                    Toast.makeText(getApplicationContext(), "Debe ingresar una cantidad válida ", Toast.LENGTH_LONG).show();
                                }
                                break;
                            case R.id.Icuadrado:
                                final EditText lado1= (EditText) findViewById(R.id.Elado);
                                double lado= Double.parseDouble(lado1.getText().toString());
                                area = Math.pow(lado,2);
                                Tresult.setText(String.valueOf(area));
                                if ((lado1.getText().toString()).isEmpty()==true|| (lado1.getText().toString()).equals(".")) {
                                    Toast.makeText(getApplicationContext(), "Debe ingresar una cantidad válida ", Toast.LENGTH_LONG).show();
                                }
                                break;
                            case R.id.Irectangulo:
                                final EditText lado1a= (EditText) findViewById(R.id.Eladoa);
                                final EditText lado1b= (EditText) findViewById(R.id.Eladob);
                                double ladoa= Double.parseDouble(lado1a.getText().toString());
                                double ladob= Double.parseDouble(lado1b.getText().toString());
                                area = ladoa*ladob;
                                Tresult.setText(String.valueOf(area));
                                if ((lado1a.getText().toString()).isEmpty()==true|| (lado1a.getText().toString()).equals(".")||(lado1b.getText().toString()).isEmpty()==true|| (lado1b.getText().toString()).equals(".")) {
                                    Toast.makeText(getApplicationContext(), "Debe ingresar cantidadades válidas ", Toast.LENGTH_LONG).show();
                                }
                                break;
                            case R.id.Itriangulo:
                                final EditText base1= (EditText) findViewById(R.id.Ebase);
                                final EditText altura1= (EditText) findViewById(R.id.Ealtura);
                                double altura= Double.parseDouble(altura1.getText().toString());
                                double base= Double.parseDouble(base1.getText().toString());
                                area = (base*altura)/2;
                                Tresult.setText(String.valueOf(area));
                                if ((base1.getText().toString()).isEmpty()==true|| (base1.getText().toString()).equals(".")||(base1.getText().toString()).isEmpty()==true|| (base1.getText().toString()).equals(".")) {
                                    Toast.makeText(getApplicationContext(), "Debe ingresar cantidadades válidas ", Toast.LENGTH_LONG).show();
                                }
                                break;

                        }

                    } catch (NumberFormatException e) {
                        Toast.makeText(getApplicationContext(), "Debe ingresar las medidas de la figura", Toast.LENGTH_LONG).show();
                    } catch (ArithmeticException e) {
                        Tresult.setText("Resultado: Error en operacion");
                    }
                }

            }


        );

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
