package com.cetis108.tercerparcial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class CochesActivity(var adapter: CochesAdapter? = null) : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coches)

        val coches = crearListaDeCoches()
        adapter = CochesAdapter(this, coches)
        findViewById<ListView>(R.id.ListViewCochesLista).adapter = adapter
    }

    fun crearListaDeCoches(): ArrayList<Coche>{
     val listadecoches = ArrayList<Coche>()
        val bowser = Coche(
            R.drawable.hw_bowser_sm,
            "Bowser",
             "Coche del peje lagarto",
             "100,000",
             true
        )
        listadecoches.add(bowser)
        listadecoches.add(Coche(
            R.drawable.hw_buddy_car,
            "Buddy",
        "El carro perfecto para un sherif",
        "200,000",
        true
        ))
        listadecoches.add(
            Coche(
                R.drawable.hw_camaro_ee_2015,
                "Camaro",
                "Es mas rapido que el buddy",
                "300,000",
                true
            )
        )
        listadecoches.add(
            Coche(
                R.drawable.hw_charger_2014,
                "Charger",
            "Es rojo",
                "400,000",
            false
            )
        )
        listadecoches.add(
            Coche(
                R.drawable.hw_fury_shark,
                "Fury",
                "Tiene forma de tiburon y huele a limon",
            "500,000",
            true
            )
        )
        listadecoches.add(
            Coche(
                R.drawable.hw_mario_sm,
                "Martino Coche",
                "Las demandas de nintento son peligrosas",
                "600,000",
            true
            )
        )
        listadecoches.add(
            Coche(
                R.drawable.hw_toad_sm,
                "Hongo Carro",
                "Es un hongo con ruedas",
                "700,000",
                false
            )
        )
        listadecoches.add(
            Coche(
                R.drawable.hw_yoshi_sm,
                "Godzilla",
                "Tira un rayo mortal y huele a limon",
                "800,000",
                true
            )
        )

        return listadecoches
    }
}