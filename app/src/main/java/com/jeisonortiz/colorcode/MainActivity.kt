package com.jeisonortiz.colorcode

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
       // private const val cero = 0
       /* private const val Negro = "Negro"
        private const val Marron = "Marron"
        private const val Rojo = "Rojo"
        private const val Naranja = "Naranja"
        private const val Amarillo = "Amarillo"
        private const val Verde = "Verde"
        private const val Azul = "Azul"
        private const val Purpura = "Purpura"
        private const val Gris = "Gris"
        private const val Blanco = "Blanco" */
        private const val ohm = " Ω"
        private const val Kohm = " KΩ"
        private const val Mohm = " MΩ"
        //private const val Gohm = " GΩ"

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var rtaTotal: Int
        var rtaCol1 = 10
        var rtaCol2 = 0
        var rtaCol3 = 1

        negro_button_columna2.setOnClickListener {
           // columna2_textView.text = Negro
            rtaCol2 = 0
            rtaTotal = (rtaCol1 + rtaCol2) * rtaCol3
            evaluar(rtaTotal, false)
            columna2_textView.setBackgroundColor(Color.parseColor("#000000"))



        }
        negro_button_columna3.setOnClickListener {
            rtaCol3 = 1
            rtaTotal = (rtaCol1 + rtaCol2) * rtaCol3
            evaluar(rtaTotal, false)
            columna3_textView.setBackgroundColor(Color.parseColor("#000000"))

        }

        marron_button_columna1.setOnClickListener {
            rtaCol1 = 10
            rtaTotal = (rtaCol1 + rtaCol2) * rtaCol3
            evaluar(rtaTotal, false)
            columna1_textView.setBackgroundColor(Color.parseColor("#993300"))


        }

        marron_button_columna2.setOnClickListener {
            rtaCol2 = 1
            rtaTotal = (rtaCol1 + rtaCol2) * rtaCol3
            evaluar(rtaTotal, false)
            columna2_textView.setBackgroundColor(Color.parseColor("#993300"))


        }
        marron_button_columna3.setOnClickListener {
            rtaCol3 = 10
            rtaTotal = (rtaCol1 + rtaCol2) * rtaCol3
            evaluar(rtaTotal, false)
            columna3_textView.setBackgroundColor(Color.parseColor("#993300"))

        }

        rojo_button_columna1.setOnClickListener {
            rtaCol1 = 20
            rtaTotal = (rtaCol1 + rtaCol2) * rtaCol3
            evaluar(rtaTotal, false)
            columna1_textView.setBackgroundColor(Color.parseColor("#ff0000"))

        }

        rojo_button_columna2.setOnClickListener {
            rtaCol2 = 2
            rtaTotal = (rtaCol1 + rtaCol2) * rtaCol3
            evaluar(rtaTotal, false)
            columna2_textView.setBackgroundColor(Color.parseColor("#ff0000"))


        }

        rojo_button_columna3.setOnClickListener {
            rtaCol3 = 100
            rtaTotal = (rtaCol1 + rtaCol2) * rtaCol3
            evaluar(rtaTotal, false)
            columna3_textView.setBackgroundColor(Color.parseColor("#ff0000"))

        }

        naranja_button_columna1.setOnClickListener {
            rtaTotal = 30
            rtaTotal = (rtaCol1 + rtaCol2) * rtaCol3
            evaluar(rtaTotal, false)
            columna1_textView.setBackgroundColor(Color.parseColor("#C83D02"))

        }

        naranja_button_columna2.setOnClickListener {
            rtaCol2 = 3
            rtaTotal = (rtaCol1 + rtaCol2) * rtaCol3
            evaluar(rtaTotal, false)
            columna2_textView.setBackgroundColor(Color.parseColor("#C83D02"))

        }

        naranja_button_columna3.setOnClickListener {
            rtaCol3 = 1000
            rtaTotal = (rtaCol1 + rtaCol2) * rtaCol3
            evaluar(rtaTotal, false)
            columna3_textView.setBackgroundColor(Color.parseColor("#C83D02"))

        }

        amarillo_button_columna.setOnClickListener {
            rtaCol1 = 40
            rtaTotal = (rtaCol1 + rtaCol2) * rtaCol3
            evaluar(rtaTotal, false)
            columna1_textView.setBackgroundColor(Color.parseColor("#F8D805"))

        }

        amarillo_button_columna2.setOnClickListener {
            rtaCol2 = 4
            rtaTotal = (rtaCol1 + rtaCol2) * rtaCol3
            evaluar(rtaTotal, false)
            columna2_textView.setBackgroundColor(Color.parseColor("#F8D805"))
        }

        amarillo_button_columna3.setOnClickListener {
            rtaCol3 = 10000
            rtaTotal = (rtaCol1 + rtaCol2) * rtaCol3
            evaluar(rtaTotal, false)
            columna3_textView.setBackgroundColor(Color.parseColor("#F8D805"))
        }


        verde_button_columna1.setOnClickListener {
            rtaCol1 = 50
            rtaTotal = (rtaCol1 + rtaCol2) * rtaCol3
            evaluar(rtaTotal, false)
            columna1_textView.setBackgroundColor(Color.parseColor("#00ff00"))

        }

        verde_button_columna2.setOnClickListener {
            rtaCol2 = 5
            rtaTotal = (rtaCol1 + rtaCol2) * rtaCol3
            evaluar(rtaTotal, false)
            columna2_textView.setBackgroundColor(Color.parseColor("#00ff00"))

        }

        verde_button_columna3.setOnClickListener {
            rtaCol3 = 100000
            rtaTotal = (rtaCol1 + rtaCol2) * rtaCol3
            evaluar(rtaTotal, false)
            columna3_textView.setBackgroundColor(Color.parseColor("#00ff00"))

        }

        azul_button_columna1.setOnClickListener {
            rtaCol1 = 60
            rtaTotal = (rtaCol1 + rtaCol2) * rtaCol3
            evaluar(rtaTotal, false)
            columna1_textView.setBackgroundColor(Color.parseColor("#0000ff"))


        }

        azul_button_columna2.setOnClickListener {
            rtaCol2 = 6
            rtaTotal = (rtaCol1 + rtaCol2) * rtaCol3
            evaluar(rtaTotal, false)
            columna2_textView.setBackgroundColor(Color.parseColor("#0000ff"))
        }

        azul_button_columna3.setOnClickListener {
            rtaCol3 = 1000000
            rtaTotal = (rtaCol1 + rtaCol2) * rtaCol3
            evaluar(rtaTotal, false)
            columna3_textView.setBackgroundColor(Color.parseColor("#0000ff"))

        }

        purpura_button_columna1.setOnClickListener {
            rtaCol1 = 70
            rtaTotal = (rtaCol1 + rtaCol2) * rtaCol3
            evaluar(rtaTotal, false)
            columna1_textView.setBackgroundColor(Color.parseColor("#ff0095"))

        }

        purpura_button_columna2.setOnClickListener {
            rtaCol2 = 7
            rtaTotal = (rtaCol1 + rtaCol2) * rtaCol3
            evaluar(rtaTotal, false)
            columna2_textView.setBackgroundColor(Color.parseColor("#ff0095"))

        }

        purpura_button_columna3.setOnClickListener {
            rtaCol3 = 10000000
            rtaTotal = (rtaCol1 + rtaCol2) * rtaCol3
            evaluar(rtaTotal, false)
            columna3_textView.setBackgroundColor(Color.parseColor("#ff0095"))

        }


        gris_button_columna1.setOnClickListener {
            rtaCol1 = 80
            rtaTotal = (rtaCol1 + rtaCol2) * rtaCol3
            evaluar(rtaTotal, false)
            columna1_textView.setBackgroundColor(Color.parseColor("#808080"))


        }

        gris_button_columna2.setOnClickListener {
            rtaCol2 = 8
            rtaTotal = (rtaCol1 + rtaCol2) * rtaCol3
            evaluar(rtaTotal, false)
            columna2_textView.setBackgroundColor(Color.parseColor("#808080"))

        }

        gris_button_columna3.setOnClickListener {
            rtaCol3 = 100
            rtaTotal = (rtaCol1 + rtaCol2) * rtaCol3
            evaluar(rtaTotal, true)
            columna3_textView.setBackgroundColor(Color.parseColor("#808080"))
        }


        blanco_button_columna1.setOnClickListener {
            rtaCol1 = 90
            rtaTotal = (rtaCol1 + rtaCol2) * rtaCol3
            evaluar(rtaTotal, false)
            columna1_textView.setBackgroundColor(Color.parseColor("#F6F5F5"))

        }

        blanco_button_columna2.setOnClickListener {
            rtaCol2 = 9
            rtaTotal = (rtaCol1 + rtaCol2) * rtaCol3
            evaluar(rtaTotal, false)
            columna2_textView.setBackgroundColor(Color.parseColor("#F6F5F5"))
        }

        blanco_button_columna3.setOnClickListener {
            rtaCol3 = 1000
            rtaTotal = (rtaCol1 + rtaCol2) * rtaCol3
            evaluar(rtaTotal, true)
            columna3_textView.setBackgroundColor(Color.parseColor("#F6F5F5"))
        }


    }

    private fun evaluar(number: Int, bandera: Boolean) {
        if (number < 10000 && !bandera) {
            val aux = number.toString() + ohm
            respuesta_text_view.text = aux

        } else if (number in 10000..10000000 && !bandera) {
            val div = number / 1000
            val aux = div.toString() + Kohm
            respuesta_text_view.text = aux

        } else if (number >= 10000000 && !bandera) {
            val div = number / 1000000
            val aux = div.toString() + Mohm
            respuesta_text_view.text = aux
        }

        else{
            val aux = number.toString() + Mohm
            respuesta_text_view.text = aux
            }
    }
}
