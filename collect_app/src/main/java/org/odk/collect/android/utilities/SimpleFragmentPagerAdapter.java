package org.odk.collect.android.utilities;


import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import org.odk.collect.android.activities.Engine_util;
import org.odk.collect.android.fragments.Activos;
import org.odk.collect.android.fragments.mapa;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;
    String numeroruta,_CodigoLocal;
    Engine_util objutil;
    int finalizadosE;
    int activosE;
    Bundle args = new Bundle();
    public SimpleFragmentPagerAdapter(Context context, FragmentManager fm, String ruta, String CodigoLocal) {
        super(fm);
        numeroruta=ruta;
        _CodigoLocal=CodigoLocal;
        args.putString("Ruta",numeroruta );
        args.putString("Codigo",_CodigoLocal );
        objutil= new Engine_util();
        String where = "where 1=1 ";
        where = "where 1=1    ";
        where = where + " and  rutaaggregate ='" + ruta + "' ";
        Cursor cursorActivos = objutil.ContarEstado(where);
        where = "where 1=1 ";
        where = "where 1=1  ";
        where = where + " and  rutaaggregate ='" + ruta + "' ";
        Cursor cursorFinalizados = objutil.ContarEstado(where);
        if (cursorFinalizados.moveToFirst()) {

            do {
                finalizadosE=cursorFinalizados.getInt(0);
            } while (cursorFinalizados.moveToNext());
        }
        if (cursorActivos.moveToFirst()) {

            do {
                activosE=cursorActivos.getInt(0);
            } while (cursorActivos.moveToNext());
        }
        mContext = context;
    }

    // This determines the fragment for each tab
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            Fragment activo =new Activos();
            activo.setArguments(args);
            return activo;
        /*} else if (position==1){
            Fragment finalizados =new Finalizados();
            finalizados.setArguments(args);
            return finalizados;*/
        }else
        {
            Fragment mapa =new mapa();
            return mapa;
        }
    }

    // This determines the number of tabs
    @Override
    public int getCount() {
        return 2;
    }

    // This determines the title for each tab
    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        switch (position) {
            case 0:
                return "Pendientes("+ activosE+")";
            /*case 1:
                return "Finalizados("+ finalizadosE+")";*/
            case 1:
                return "Ubicación("+ activosE+")";

            default:
                return null;
        }
    }

}
