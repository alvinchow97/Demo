package com.example.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

//: = extends
class MainActivity : AppCompatActivity() {
    //onCreate = mainfunction
    //super = super class
    //setContentView = create UI
    //R = resources
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //TODO: Continue Here
        //Java int x; in Kotlin var x : int
        // val = value and var = variable
        //findViewById = link UI to code
        val viewMessage : Button = findViewById(R.id.viewMessage);
        viewMessage.setOnClickListener {showMessage()};


    }

    private fun showMessage() {
        textViewMessage.setText(getString(R.string.warning_message));
    }


}
