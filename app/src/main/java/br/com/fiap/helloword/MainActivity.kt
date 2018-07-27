package br.com.fiap.helloword

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.fiap.helloword.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Criando listener onClick
        btn_CliqueAqui.setOnClickListener {

            //Recuperando o texto digitado pelo usuário e atribuindo a uma String
            var nome:String = edt_Nome.editableText.toString()

            //Alterando o texto dentro do TextView
            txv_Resultado.text = nome
        }
    }
}
