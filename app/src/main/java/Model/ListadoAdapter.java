package Model;

import android.actas.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Jorge on 15/06/2017.
 */

public class ListadoAdapter extends BaseAdapter {
    private Context ctx;
    private ArrayList<BeanMeeting> datos;
    private LayoutInflater lf;
    public ListadoAdapter(Context ctx, ArrayList<BeanMeeting> datos){
        this.ctx=ctx;
        this.datos=datos;
        lf=LayoutInflater.from(ctx);
    }

    @Override
    public int getCount() {
        return datos.size();
    }

    @Override
    public Object getItem(int position) {
        return datos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        //Generamos un objeto View a partir de la plantilla creada para la fila.
        convertView=lf.inflate(R.layout.cardactas,null);

        //Titulo del acta
        TextView tvTitulo=(TextView)convertView.findViewById(R.id.tvTitulo);
        tvTitulo.setText(datos.get(position).getTitle());

        //Fecha del acta
        TextView tvFecha=(TextView)convertView.findViewById(R.id.tvFecha);
        tvFecha.setText(datos.get(position).getDate());


        //Devolver el view de la fila
        return convertView;
    }
}