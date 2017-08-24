package Model;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;

/**
 * Created by Itheron on 15/08/2017.
 */

public class GestionDatos {

    //definimos la ruta de guardado, en este caso una tabla en SQLITE que creara
    //el propio sistema
    Ayudante helper;
    SQLiteDatabase db;

    public GestionDatos(Context ctx, String nombreBd){
        helper=new Ayudante(ctx, nombreBd);
        db=helper.getWritableDatabase();
    }

//-------------------------------Alta asistente-----------------------------------------------------
    public void altaAsistente(String nombre, String email, int telefono){
        //Creacion objeto
        String sql="insert into actas (nombre, email, telefono)";
        sql+="values('"+nombre+"','"+email+"',"+telefono+")";
        db.execSQL(sql);
    }
//--------------------------------------------------------------------------------------------------

    //-----------------------------Recuperar Actas--------------------------------------------------
    public Cursor recuperarActas() {
        String sql = "select* from actas";
        return db.rawQuery(sql, null);
    }
    //----------------------------------------------------------------------------------------------
    //---------------------------------Metodo guardar----------------------------------------------
    public void guardarActa(Acta ac, String nombre, String memoria) {
        String sql="insert into actas (nombre, email, telefono)";
        sql+="values('"+nombre+"','"+memoria+")";
        db.execSQL(sql);

    }
    //----------------------------------------------------------------------------------------------

    //-------------------------------Metodo recuperar fecha------------------------------------------
    public Cursor recuperarFecha() {
        String sql = "select* from meeting";

        return db.rawQuery(sql, null);
        //transformar datos en arrayList
    }
    //----------------------------------------------------------------------------------------------

 // ---------------------------------------------------------------------------------------------


}
