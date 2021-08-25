package com.cetis108.tercerparcial

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.cetis108.tercerparcial.databinding.FichacocheBinding

class CochesAdapter(var contexto: Context, var listaDeCoches: ArrayList<Coche>): BaseAdapter() {
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
        val coche = listaDeCoches[position]
        val inflater = contexto!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val fichaCoche = FichacocheBinding.inflate(inflater, parent, false)

        fichaCoche.ImageViewFichaCocheImagen.setImageResource(coche.Imagen!!)
        fichaCoche.TextViewFichaChocheNombre.text = coche.Nombre!!
        fichaCoche.TextViewFichaCocheDescripcion.text = coche.Descripcion!!
        fichaCoche.TextViewFichaCochePrecio.text = coche.Precio!!


        fichaCoche.ImageViewFichaCocheImagen.setOnClickListener {
            val intent = Intent(contexto, CochesDetalleActivity::class.java)
            intent.putExtra("coche", coche)
            contexto!!.startActivities(intent)

        }

        return fichaCoche.root
    }
}