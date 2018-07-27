package br.com.fiap.helloword

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var txv_Resultado = findViewById<TextView>(R.id.txv_Resultado)

        //Criando listener onClick
        btn_CliqueAqui.setOnClickListener {

            //Recuperando o texto digitado pelo usuário e atribuindo a uma String
            var nome: String = edt_Nome.editableText.toString()

            //Alterando o texto dentro do TextView
            txv_Resultado.text = nome

            val intent = Intent(this, Proxima::class.java)
            startActivity(intent)
        }
    }
}
