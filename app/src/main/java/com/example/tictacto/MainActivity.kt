package com.example.tictacto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

   protected fun btn_click(view: android.view.View) {
       val btn_selected = view as Button

        var cellId = 0

        when (btn_selected.id)
        {
            R.id.button2->cellId=1
            R.id.button12->cellId=2
            R.id.button13->cellId=3
            R.id.button3->cellId=4
            R.id.button4->cellId=5
            R.id.button5->cellId=6
            R.id.button6->cellId=7
            R.id.button7->cellId=8
            R.id.button8->cellId=9

        }
        Toast.makeText(this,"ID : "+cellId, Toast.LENGTH_LONG).show()

    }
}