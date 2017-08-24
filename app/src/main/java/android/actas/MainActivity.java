package android.actas;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import Model.Acta;
import Model.BeanMeeting;
import Model.GestionDatos;
import Model.ListadoAdapter;

import static android.actas.R.id.lvActas;


public class MainActivity extends AppCompatActivity {

    GestionDatos gdatos;
    ListView datos;

    private Context ctx;
    private ArrayList<Acta> actas;
    private ArrayList<BeanMeeting> bm;
    private LayoutInflater lf;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acta_nueva);
        bm=(ArrayList<BeanMeeting>) ;//poner recuperarBeenMeeting
        datos = (ListView) this.findViewById(lvActas);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();

        //Obtener datos
        gdatos=new GestionDatos(this,MainActivity.this.toString());
        actas= (ArrayList<Acta>) gdatos.recuperarActas();

        //Mostrar datos en ListView
        ListadoAdapter adapter=new ListadoAdapter(this,bm);
        datos.setAdapter(adapter);



//----------------------------Metodo clicklistener--------------------------------------------------
        //usamos OnItemClick para mostrar el acta seleccionada
        AdapterView.OnItemClickListener listener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Acta ac = actas.get(position);
                //abre una nueva ventana recuperando el acta en cuestión
                Intent intent =new Intent(MainActivity.this,MainActivity.class);
                intent.putExtra("Acta",ac);
                MainActivity.this.startActivity(intent);

            }
        };
        lvActas.setOnItemClickListener(listener);
    }

 //------------------------------boton nueva-------------------------------------------------------

    public void nueva(View v){

    }


    //--------------------------------Boton Salir-------------------------------------------------------
    public void salir(View v) {
        this.finish();
    }
//--------------------------------------------------------------------------------------------------
}

