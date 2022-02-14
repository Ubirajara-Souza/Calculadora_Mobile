package com.bira.projetoandroid

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnSomar = findViewById<Button>(R.id.btnSomar)
        var btnSubtrair = findViewById<Button>(R.id.btnSubtrair)
        var btnDividir = findViewById<Button>(R.id.btnDividir)
        var btnMultiplicar = findViewById<Button>(R.id.btnMultiplicar)

        btnSomar.setOnClickListener(this)
        btnSubtrair.setOnClickListener(this)
        btnDividir.setOnClickListener(this)
        btnMultiplicar.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        var edtValor1 = findViewById<EditText>(R.id.editValor1)
        var edtValor2 = findViewById<EditText>(R.id.editValor2)
        var textView = findViewById<TextView>(R.id.textViewResultado)

        var txtValor1 = edtValor1.text.toString()
        var txtValor2 = edtValor2.text.toString()

        var valor1 = txtValor1.toInt()
        var valor2 = txtValor2.toInt()

        textView.text = when(v?.id) {
            R.id.btnSomar -> "Resultado = ${valor1 + valor2}"
            R.id.btnSubtrair -> "Resultado = ${valor1 - valor2}"
            R.id.btnMultiplicar -> "Resultado = ${valor1 * valor2}"
            R.id.btnDividir -> "Resultado = ${valor1 / valor2}"
            else -> "Não foi possível realizar a operação"
        }

    }
}