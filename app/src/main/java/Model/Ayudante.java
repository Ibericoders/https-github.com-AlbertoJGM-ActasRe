package Model;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Ayudante extends SQLiteOpenHelper {

    public Ayudante(Context ctx, String nombre, int version) {
        //permitimos al que use la clase ayudante, le demos los datos con los que va a trabajar
        //el propio android intuye que en el momento en el que se cree un objeto Ayudante, Android determina
        //con que base de Datos quiere trabajar, y entonces llama a Oncreate.
        super(ctx, nombre, null, version);
    }

    public Ayudante(Context ctx, String nombre) {

        super(ctx, nombre, null, 1);
    }


    //este método se ejecuta cuando Android crea la DB
    @Override
    public void onCreate(SQLiteDatabase db) {
        //montamos la instrucción SQL de creación de la tabla
        String sqlCreaTabla2 = "create table particpantes(";
        sqlCreaTabla2 += "_id integer primary key autoincrement,";
        sqlCreaTabla2 += "nombre text,";
        sqlCreaTabla2 += "email text,";
        sqlCreaTabla2 += "telefono text)";
        db.execSQL(sqlCreaTabla2);


        //montamos la instrucción SQL de creación de la tabla
        String sqlCreaTabla = "create table actas(";
        sqlCreaTabla += "_id integer primary key autoincrement,";
        sqlCreaTabla += "nombre text,";
        sqlCreaTabla += "memoria text,";
        db.execSQL(sqlCreaTabla);

        //montamos la instrucción SQL de creación de la tabla
        String sqlCreaTabla3 = "create table fechas(";
        sqlCreaTabla3 += "_id integer primary key autoincrement,";
        sqlCreaTabla3 += "nombre text,";
        sqlCreaTabla3 += "fecha long";
        db.execSQL(sqlCreaTabla);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
