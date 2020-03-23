package com.example.kotlin

import Connection.ConnectionServer
import Connection.Package
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Debug
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var editText: EditText? = null
    private var button: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.button = findViewById<Button>(R.id.button)
        this.editText = findViewById(R.id.inputedText)
    }

     fun Resul(v: View) {
        Toast.makeText(this,"Enviado",Toast.LENGTH_LONG).show()
         val cs = ConnectionServer()

         var packag = Package(editText?.text.toString())
         cs.execute(packag)

    }

}
