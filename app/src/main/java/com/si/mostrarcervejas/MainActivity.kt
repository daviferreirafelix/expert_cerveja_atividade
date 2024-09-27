package com.si.mostrarcervejas

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.si.mostrarcervejas.enums.TIPOS

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.txtView)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val tiposCerveja     = arrayOf(TIPOS.LAGER,TIPOS.PILSEN,TIPOS.IPA,TIPOS.BOCK,TIPOS.AMBER,
                                                                                        TIPOS.WEISS)
        val spinner: Spinner = findViewById(R.id.spinner)
        spinner.adapter      = ArrayAdapter(this,
                                            android.R.layout.simple_spinner_dropdown_item,
                                            tiposCerveja)
    }

    fun verCervejas(view: View){
        val cervejas         = ExpertCervejas()
        val marcasCervejas   = cervejas.getMarcas()
        val spinner: Spinner = findViewById(R.id.spinner)
        val text: TextView   = findViewById(R.id.textView)
        var itens            = ""

        when(spinner.selectedItemPosition){
            0 -> {
                for (findItens in marcasCervejas[0]){
                    itens += "$findItens\n"
                }

                text.text = itens
            }

            1 -> {
                for (findIntens in marcasCervejas[1]){
                    itens += "$findIntens\n"
                }

                text.text = itens
            }

            2 -> {
                for (findItens in marcasCervejas[2]){
                    itens += "$findItens\n"
                }

                text.text = itens
            }

            3 -> {
                for (findItens in marcasCervejas[3]){
                    itens += "$findItens\n"
                }

                text.text = itens
            }

            4 -> {
                for (findItens in marcasCervejas[4]){
                    itens += "$findItens\n"
                }

                text.text = itens
            }

            5 -> {
                for (findItens in marcasCervejas[5]){
                    itens += "$findItens\n"
                }

                text.text = itens
            }

            else -> {
                val textToast = "Deu ruim"
                val durationToast = Toast.LENGTH_SHORT
                Toast.makeText(this, textToast, durationToast).show()
            }
        }
    }
}