package me.milanmenezes.kotlin


import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.database.*
import kotlinx.android.synthetic.main.activity_second.*
import org.jetbrains.anko.toast
import org.json.JSONObject
import java.lang.ref.Reference

class second : AppCompatActivity() {

//    val database:FirebaseDatabase = FirebaseDatabase.getInstance()
//    val myRef: DatabaseReference = database.getReference("songs/1/number")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

//       var shrpref: SharedPreferences = getSharedPreferences("MyPref", MODE_PRIVATE)
//       var abc:String = shrpref.getString("Name","0").toString()




        var shrpref:SharedPreferences = getSharedPreferences("MyPref", MODE_PRIVATE)
        var json:JSONObject= JSONObject(shrpref.getString("JSON",null))

        secondtxt.setText(json.getString("hello"))


    }
}
