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

    fun findavg(a:Int, b:Int):Float{
        return ((a+b).toFloat())/2
    }

    fun findmax(a:Int, b:Int):Int {
        if(a>b){
            return a
        }

        else
        {
            return b
        }
    }

    fun findmin(a:Int, b:Int):Int {
        if(a<b){
            return a
        }

        else
        {
            return b
        }
    }

    fun check():Boolean{
        return !(editText1.text.toString().trim()=="" || editText2.text.toString().trim()=="")
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            if(check()) {
                ans.text=findsum(editText1.text.toString().toInt(),editText2.text.toString().toInt()).toString()
            }

            else
                toast("Enter both numbers!")
        }

        button2.setOnClickListener {
            if (check())
                ans.text=findsub(editText1.text.toString().toInt(),editText2.text.toString().toInt()).toString()

            else
                toast("Enter both numbers!")

        }

        button3.setOnClickListener {
            if (check())
                ans.text=findmul(editText1.text.toString().toInt(),editText2.text.toString().toInt()).toString()

            else
                toast("Enter both numbers!")
        }

        button4.setOnClickListener {
            if (check()){
                if (!(editText2.text.toString().equals("0")))
                ans.text=finddiv(editText1.text.toString().toInt(),editText2.text.toString().toInt()).toString()
                else {
                    ans.text="Infinity"
                    toast("Cannot divide by zero")
                }
            }
            else
                toast("Enter both numbers!")
        }

        button5.setOnClickListener {
            if (check())
                ans.text=findmax(editText1.text.toString().toInt(),editText2.text.toString().toInt()).toString()
            else
                toast("Enter both numbers!")

        }

        button6.setOnClickListener {
            if (check())
                ans.text=findmin(editText1.text.toString().toInt(),editText2.text.toString().toInt()).toString()
            else
                toast("Enter both numbers!")

        }

        button7.setOnClickListener {
                if (check()) {
                        ans.text = findavg(editText1.text.toString().toInt(), editText2.text.toString().toInt()).toString()
                }
                else
                    toast("Enter both numbers!")
        }


    }
}
