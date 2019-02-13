package com.example.ejemplogps.DataBaseManager;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DB_SQLite extends SQLiteOpenHelper {

    public static final int OPEN_MODE_READ = 1;
    public static final int OPEN_MODE_WRITE = 2;

    private static final String DATABASE_NAME = "tienda.sqlite";
    private static final int DATABASE_VERSION = 1;

    private static final String sql_D_01 ="DROP TABLE IF EXISTS " + Esquema.Gps.TABLE_NAME;
    private static final String sql_C_01 = "CREATE TABLE " + Esquema.Gps.TABLE_NAME + " (" +
            Esquema.Gps.COLUMN_NAME_ID + " " + Esquema.Gps.COLUMN_TYPE_ID + " PRIMARY KEY AUTOINCREMENT, " +
            Esquema.Gps.COLUMN_NAME_LATITUD + " " + Esquema.Gps.COLUMN_TYPE_LATITUD + ", " +
            Esquema.Gps.COLUMN_NAME_LONGITUD + " " + Esquema.Gps.COLUMN_TYPE_LONGITUD + ", " +
            Esquema.Gps.COLUMN_NAME_TIPO + " " + Esquema.Gps.COLUMN_TYPE_TIPO + ")";

    // " FOREIGN KEY (" + Esquema.Producto.COLUMN_NAME_ID + ") REFERENCES " + Esquema.Seccion.TABLE_NAME + "(" + Esquema.Seccion.COLUMN_NAME_ID + ")" +
    //EL SIGUIENTE CÓDIGO ELIMINA TODOS LAS REFERENCIAS QUE TENGA NUESTRA FK
    // " ON UPDATE CASCADE ON DELETE CASCADE)";


    public DB_SQLite(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL(sql_C_01);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(sql_D_01);
        onCreate(db);
    }

    public static SQLiteDatabase conectar(Context context, int open_mode) {
        DB_SQLite db = new DB_SQLite(context);
        SQLiteDatabase conn;
        if (open_mode == OPEN_MODE_READ)
            conn = db.getWritableDatabase();
        else
            conn = db.getReadableDatabase();
        return conn;
    }

    public static void desconectar(SQLiteDatabase conn) {
        conn.close();
    }

}
