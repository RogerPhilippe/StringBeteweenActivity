package br.com.philippesis.myktapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtParam = findViewById<EditText>(R.id.edt_param)
        val btnEnviar = findViewById<Button>(R.id.btn_new_activity)

        btnEnviar.setOnClickListener {

            val paramString:String = edtParam.text.toString()

            if (paramString != null && !paramString.isEmpty()) {

                val intent = Intent(this, SecondActivity::class.java)

                intent.putExtra("param", paramString)

                startActivity(intent)

            }

        }

    }
}
