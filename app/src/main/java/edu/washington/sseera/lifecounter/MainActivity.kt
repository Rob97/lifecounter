package edu.washington.sseera.lifecounter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val LifeCount1 = findViewById(R.id.player_one_lives) as TextView
        val LifeCount2 = findViewById(R.id.player_two_lives) as TextView
        val LifeCount3 = findViewById(R.id.player_three_lives) as TextView
        val LifeCount4 = findViewById(R.id.player_four_lives) as TextView

        var lives1 = LifeCount1.getText().toString().toInt();
        var lives2 = LifeCount2.getText().toString().toInt();
        var lives3 = LifeCount3.getText().toString().toInt();
        var lives4 = LifeCount4.getText().toString().toInt();

        val plusButton1 = findViewById(R.id.player_one_plus) as Button
        val plusButton2 = findViewById(R.id.player_two_plus) as Button
        val plusButton3 = findViewById(R.id.player_three_plus) as Button
        val plusButton4 = findViewById(R.id.player_four_plus) as Button

        val plus5Button1 = findViewById(R.id.player_one_plus_five) as Button
        val plus5Button2 = findViewById(R.id.player_two_plus_five) as Button
        val plus5Button3 = findViewById(R.id.player_three_plus_five) as Button
        val plus5Button4 = findViewById(R.id.player_four_plus_five) as Button


        val minusButton1 = findViewById(R.id.player_one_minus) as Button
        val minusButton2 = findViewById(R.id.player_two_minus) as Button
        val minusButton3 = findViewById(R.id.player_three_minus) as Button
        val minusButton4 = findViewById(R.id.player_four_minus) as Button


        val minus5Button1 = findViewById(R.id.player_one_minus_five) as Button
        val minus5Button2 = findViewById(R.id.player_two_minus_five) as Button
        val minus5Button3 = findViewById(R.id.player_three_minus_five) as Button
        val minus5Button4 = findViewById(R.id.player_four_minus_five) as Button






    }

}
