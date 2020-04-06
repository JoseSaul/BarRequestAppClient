package com.example.kotlin

import Connection.ConnectionServer
import Connection.Package
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var editText: EditText? = null
    private var button: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.button = findViewById<Button>(R.id.button)
        //this.editText = findViewById(R.id.inputedText)
    }

    //ActionBar
    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.action_settings -> {
            true
        }

        else -> {
            super.onOptionsItemSelected(item)
        }
    }

     fun Buy(v: View) {
        Toast.makeText(this,"Enviado",Toast.LENGTH_LONG).show()
         val cs = ConnectionServer()

         val packag = Package(editText?.text.toString())
         cs.execute(packag)

    }


}
