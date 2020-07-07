package com.example.appknoledge;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.widget.TextViewCompat;

import java.util.ArrayList;
/*
public class NombresAdapter extends BaseAdapter {
    private ArrayList<lista_onclick> lista;
    private LayoutInflater mYinflater;
    public NombresAdapter(Context context, ArrayList<lista_onclick> lista){
        this.mYinflater=LayoutInflater.from(context);
        this.lista=lista;
    }
    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int position) {
        return lista.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder=null;
        if(convertView==null){
            convertView=mYinflater.inflate(R.layout.activity_lista_onclick,null);
            holder=new ViewHolder();
            holder.HNombre=(TextView)convertView.findViewById(R.id.idName);
            holder.HApellidos=(TextView)convertView.findViewById(R.id.idApellido);
            holder.HImagen=(ImageView)convertView.findViewById(R.id.idLogo);
        }else{
            lista_onclick lista_onclick= (com.example.appknoledge.lista_onclick) getItem(position);
            holder.HNombre.setText(lista_onclick.getNombre());
            holder.HApellidos.setText(lista_onclick.getApellidos());
            holder.HImagen.setImageResource(lista_onclick.getLogo());
        }
        return null;
    }


}*/
