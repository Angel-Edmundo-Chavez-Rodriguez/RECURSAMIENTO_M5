package com.cetis108.tercerparcial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cetis108.tercerparcial.databinding.ActivityCochesBinding
import com.cetis108.tercerparcial.databinding.ActivityCochesDetalleBinding

class CochesDetalleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coches_detalle)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        val coche = intent.getSerializableExtra("coche")as Coche
        val detalle = ActivityCochesDetalleBinding.inflate(layoutInflater)
        detalle.imageViewCochesDetalleImagen.setImageResource(coche.Imagen!!)
        detalle.textViewCochesDetalleNombre.text = coche.Nombre
        detalle.textViewCochesDetalleDescripcion.text = coche.Descripcion
        detalle.textViewCochesDetallePrecio.text = coche.Precio
        detalle.buttonCochesDetalleComprar.isEnabled = coche.Venta!!
        detalle.buttonCochesDetalleComprar.isClickable = coche.Venta!!
    }
}