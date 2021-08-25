package com.cetis108.tercerparcial

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter

class CochesAdapter(_Contexto: Context, var listaDeCoches: ArrayList<Coche>): BaseAdapter() {
    override fun getCount(): Int {
        return listaDeCoches.size
    }

    override fun getItem(position: Int): Any {
        return listaDeCoches[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        TODO("Not yet implemented")
    }
}