package me.milanmenezes.kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nam = findViewById(R.id.editText1) as EditText

        val btn = findViewById(R.id.button1) as Button
        btn.setOnClickListener {
            toast("Hello ${nam.text}!");
        }
    }
}
