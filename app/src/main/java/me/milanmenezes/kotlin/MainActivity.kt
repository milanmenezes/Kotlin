package me.milanmenezes.kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    fun findsum(a:Int, b:Int):Int{
        return a+b
    }

    fun findsub(a:Int, b:Int):Int{
        return a-b
    }

    fun findmul(a:Int, b:Int):Int{
        return a*b
    }

    fun finddiv(a:Int, b:Int):Float{
        return (a.toFloat()/b)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button1.setOnClickListener {
            toast("The sum is "+findsum(editText1.text.toString().toInt(),editText2.text.toString().toInt())+"!")

        }

        button2.setOnClickListener {
            toast("The remainder is "+findsub(editText1.text.toString().toInt(),editText2.text.toString().toInt())+"!")
//
        }

        button3.setOnClickListener {
            toast("The product is "+findmul(editText1.text.toString().toInt(),editText2.text.toString().toInt())+"!")
//
        }

        button4.setOnClickListener {
            toast("The quotient is "+finddiv(editText1.text.toString().toInt(),editText2.text.toString().toInt())+"!")
//
        }
    }
}
