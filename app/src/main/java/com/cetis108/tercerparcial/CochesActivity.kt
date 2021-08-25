package com.cetis108.tercerparcial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class CochesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coches)
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
                "Carro de martino, nada parecido al de mario... NINTENDO NO ME DEMANDES!! D:",
                "600,000",
            true
            )
        )
        listadecoches.add(
            Coche(
                R.drawable.hw_toad_sm,
                "Hongo Carro",
                "Si se preguntan ´porque al de mario le cambie el nombre y al de bowser no, es porque (CONFIDENCIAL)",
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