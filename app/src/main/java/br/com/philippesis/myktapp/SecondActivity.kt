package br.com.philippesis.myktapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val btnBack = findViewById<Button>(R.id.btnBack)

        val txtParam = findViewById<TextView>(R.id.txtParam)

        val bundle = intent.extras
        val paramStr:String

        if (bundle != null) {

            txtParam.setText(bundle.getString("param") ?: "")

        }

        btnBack.setOnClickListener {

            this.finish()

        }

    }
}
