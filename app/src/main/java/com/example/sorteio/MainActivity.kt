package com.example.sorteio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sortearNumeros(view: View){

        var texto = findViewById(R.id.idTextoSorteio) as TextView
        var numSorteado = Random().nextInt(11)
        texto.setText("Numero sorteado é: $numSorteado")
    }
}
