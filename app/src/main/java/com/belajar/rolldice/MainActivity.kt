package com.belajar.rolldice

import android.app.Activity
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.belajar.rolldice.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.* //fungsi kotlin utk memanggil id pada MainActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    //cara 2 lateinit
   // lateinit var rollButton: Button //public rollButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main) //cara 1 dan 2
       //cara 3
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        //rollButton = findViewById(R.id.rool_button) //Lateinit
        // val rollButton : Button = findViewById(R.id.rool_button) =>cara findViewByID
        binding.roolButton.setOnClickListener(){

            rollDice()
            Toast.makeText(this, "Roll Dice berhasil!!", Toast.LENGTH_SHORT).show()
        }
    }
    private fun rollDice() {
        //val diceImage: ImageView = findViewById(R.id.imageRoll)

        val drawableRes = when(Random().nextInt(6)+1){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
       // rollDice.setImageResource(drawableRes) => cara pertama
        imageRoll.setImageResource(drawableRes) // memanggil id di view

    }

    // menyambungkan id
    // cara menginisiasi view dengan fungsi
    // 1. findViewById
    // 2. Lateinit
    // 3. Data Binding
    }