package com.sharacadavid.myapplication;



    import java.util.ArrayList;
    import java.util.Calendar;
    import java.util.List;

    import android.app.Activity;
    import android.app.DatePickerDialog;
    import android.app.Dialog;
    import android.os.Bundle;
    import android.support.v7.app.AppCompatActivity;
    import android.view.View;
    import android.view.View.OnClickListener;
    import android.widget.ArrayAdapter;
    import android.widget.Button;
    import android.widget.CheckBox;
    import android.widget.DatePicker;
    import android.widget.EditText;
    import android.widget.ImageButton;
    import android.widget.LinearLayout;
    import android.widget.RadioButton;
    import android.widget.RadioGroup;
    import android.widget.Spinner;
    import android.widget.TextView;
    import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnClickListener {
        private ImageButton ib;
        private Calendar cal;
        private int day;
        private int month;
        private int year;
        private EditText et;
        private Spinner spinner1;
        private List<String> lista;
        private RadioGroup radioOperacionGroup;
        private RadioButton radiogeneroButton;
        static String muestrafecha;
        static String hobbies []= new String[4];



    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            // mDateButton = (Button) findViewById(R.id.date_button);
            ib = (ImageButton) findViewById(R.id.imageButton1);
            cal = Calendar.getInstance();
            day = cal.get(Calendar.DAY_OF_MONTH);
            month = cal.get(Calendar.MONTH);
            year = cal.get(Calendar.YEAR);
            et = (EditText) findViewById(R.id.EfechaN);
            final EditText nombre1 = (EditText) findViewById(R.id.Enombre);
            final EditText apellido1 = (EditText) findViewById(R.id.Eapellido);
            final EditText identificacion1 = (EditText) findViewById(R.id.Eidentificacion);
            final EditText fecha1 = (EditText) findViewById(R.id.EfechaN);
            final TextView Tnombre= (TextView) findViewById(R.id.Inombre);
            final TextView Tapellido= (TextView) findViewById(R.id.Iapellido);
            final TextView Tidentificacion= (TextView) findViewById(R.id.Iidentificacion);
            final TextView Tfecha= (TextView) findViewById(R.id.Ifecha);
            final TextView Tgenero= (TextView) findViewById(R.id.Igenero);
            final TextView Thobbies= (TextView) findViewById(R.id.Ihobbies);
            final TextView Tciudad= (TextView) findViewById(R.id.Iciudad);
            final Spinner SpCiudad= (Spinner) findViewById(R.id.spciudad);

            final CheckBox check1 = (CheckBox) findViewById(R.id.musica);
            final CheckBox check2 = (CheckBox) findViewById(R.id.play);
            final CheckBox check4 = (CheckBox) findViewById(R.id.tareas);
            final CheckBox check3 = (CheckBox) findViewById(R.id.dormir);
            final LinearLayout ingresados = (LinearLayout) findViewById(R.id.Imuestra);

            radioOperacionGroup = (RadioGroup) findViewById(R.id.Iradiogroup1);
            Button enviar = (Button) findViewById(R.id.enviar);

            enviar.setOnClickListener(new View.OnClickListener() {

               @Override
               public void onClick(View v) {

                   String Snombre = nombre1.getText().toString();
                   String Sapellido = apellido1.getText().toString();
                   String Sidentificacion = identificacion1.getText().toString();
                   String Sfecha= fecha1.getText().toString();
                   String Sciudad= SpCiudad.getSelectedItem().toString();
                   Tnombre.setText(Snombre);
                   Tapellido.setText(Sapellido);
                   Tidentificacion.setText(Sidentificacion);
                   int selectedId = radioOperacionGroup.getCheckedRadioButtonId();
                   radiogeneroButton = (RadioButton) findViewById(selectedId);
                   switch (selectedId) {
                       case R.id.Ifemenino:
                           Tgenero.setText("Femenino");
                           break;
                       case R.id.Imasculino:
                           Tgenero.setText("Masculinno");
                           break;
                       default:
                           Tgenero.setText("No especificado :P");

                   }
                   Tfecha.setText(muestrafecha);
                   Tciudad.setText(Sciudad);

                   if (check1.isChecked()){
                       if (check2.isChecked()){
                           if (check3.isChecked()){
                               if (check4.isChecked()){
                                  Thobbies.setText((hobbies[0]).toString()+", "+(hobbies[1]).toString()+", "+(hobbies[2]).toString()+", "+(hobbies[3]).toString());
                                   //Thobbies.setText("hello");
                               }else Thobbies.setText(hobbies[0]+", "+hobbies[1]+", "+hobbies[2]);
                           }else if (check4.isChecked()){
                               Thobbies.setText(hobbies[0]+", "+hobbies[1]+", "+hobbies[3]);
                           }else Thobbies.setText(hobbies[0]+", "+hobbies[1]);
                       }else if (check3.isChecked()){
                           Thobbies.setText(hobbies[0]+", "+hobbies[2]);
                       }else if (check4.isChecked()){
                           Thobbies.setText(hobbies[0]+", "+hobbies[3]);
                       }else
                           Thobbies.setText(hobbies[0]);
                   }else if(check2.isChecked()){
                       if (check3.isChecked()){
                           if (check4.isChecked()){
                               Thobbies.setText((hobbies[1]).toString()+", "+(hobbies[2]).toString()+", "+(hobbies[3]).toString());
                           }else Thobbies.setText((hobbies[1]).toString()+", "+(hobbies[2]).toString());
                            //Thobbies.setText("si entra aqui");
                       }else Thobbies.setText((hobbies[1]).toString());
                   }else if (check3.isChecked()){
                       if (check4.isChecked()){
                           Thobbies.setText((hobbies[2]).toString()+", "+(hobbies[3]).toString());
                       }else
                       Thobbies.setText(hobbies[2]);
                   }else if (check4.isChecked()){
                       Thobbies.setText(hobbies[3]);
                   }else
                       Thobbies.setText("Ningun hobbie fue registrado");

                   ingresados.setVisibility(View.VISIBLE);
               }
            });
            check1.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    int i=0;
                    if(check1.isChecked()) {
                        hobbies[0] = check1.getText().toString();
                    }    else  i=1;
                }
            });
            check2.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    int i=0;
                    if(check2.isChecked()) {
                        hobbies[1] = check2.getText().toString();
                    }else  i=1;
                }
            });
             check3.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    int i=0;
                    if(check3.isChecked()) {
                        hobbies[2] = check3.getText().toString();
                    }else  i=1;
                }
            });
            check4.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    int i=0;
                    if(check4.isChecked()) {
                        hobbies[3] = check4.getText().toString();
                    }else  i=1;
                }
            });
            ib.setOnClickListener(this);
            DatosPorDefecto();
        }

        @Override
        public void onClick(View v) {
            showDialog(0);
        }

        @Override
        @Deprecated
        public Dialog onCreateDialog(int id) {
            return new DatePickerDialog(this, datePickerListener, year, month, day);
        }

        public DatePickerDialog.OnDateSetListener datePickerListener = new DatePickerDialog.OnDateSetListener() {
            public void onDateSet(DatePicker view, int selectedYear,
                                  int selectedMonth, int selectedDay) {
                et.setText(selectedDay + " / " + (selectedMonth + 1) + " / "
                        + selectedYear);
                muestrafecha= selectedDay+" / "+(selectedMonth+1)+"/"+selectedYear;
               // Toast.makeText(getApplicationContext(), muestrafecha, Toast.LENGTH_LONG).show();

            }
        };
        private void DatosPorDefecto() {
            spinner1 = (Spinner) findViewById(R.id.spciudad);
            lista = new ArrayList<String>();
            spinner1 = (Spinner) this.findViewById(R.id.spciudad);
            lista.add("Arauca");
            lista.add("Armenia");
            lista.add("Barranquilla");
            lista.add("Bogotá");
            lista.add("Bucaramanga");
            lista.add("Cali");
            lista.add("Cartgena");
            lista.add("Cúcuta");
            lista.add("Leticia");
            lista.add("Manizales");
            lista.add("Medellín");
            lista.add("Mocoa");
            lista.add("Montería");
            lista.add("Mitú");
            lista.add("Neiva");
            lista.add("Pasto");
            lista.add("Pereira");
            lista.add("Popayán");
            lista.add("Puerto Carreño");
            lista.add("Puerto Inírida");
            lista.add("Riohacha");
            lista.add("Santa Marta");
            lista.add("San Andres");
            lista.add("Tunja");
            lista.add("Valledupar");

            ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, lista);
            adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner1.setAdapter(adaptador);
        }

    }