package com.example.ejemplogps.DataBaseManager;

import android.provider.BaseColumns;

public class Esquema {

    public Esquema() {
    }

    public static abstract class Gps implements BaseColumns {
        public static final String TABLE_NAME = "Gps";

        public static final String COLUMN_NAME_ID = "INTEGER";
        public static final String COLUMN_NAME_LATITUD = "latitud";
        public static final String COLUMN_NAME_LONGITUD = "longitud";
        public static final String COLUMN_NAME_LUGAR = "lugar";
        public static final String COLUMN_NAME_TIPO = "tipo";
        public static final String COLUMN_TYPE_ID = "INTEGER";
        public static final String COLUMN_TYPE_LATITUD = "FLOAT";
        public static final String COLUMN_TYPE_LONGITUD = "FLOAT";
        public static final String COLUMN_TYPE_LUGAR = "TEXT";
        public static final String COLUMN_TYPE_TIPO = "TEXT";

    }
}
