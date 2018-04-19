package edu.washington.sseera.lifecounter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val whoLost = findViewById(R.id.whoLost) as TextView

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


        //Adding one life buttons
        plusButton1.setOnClickListener({ view ->
            lives1++
            LifeCount1.setText(lives1.toString())

            if(lives1 == 0 ||lives2 == 0 || lives3 == 0 || lives4 == 0 ){
                if(lives1 == 0){
                    whoLost.setText("Player1 LOST!")
                }
                whoLost.visibility = View.VISIBLE

            }else{
                whoLost.visibility = View.INVISIBLE
            }

        })
        plusButton2.setOnClickListener({ view ->
            lives2++
            LifeCount2.setText(lives2.toString())
            if(lives1 == 0 ||lives2 == 0 || lives3 == 0 || lives4 == 0 ){
                if(lives2 == 0){
                    whoLost.setText("Player2 LOST!")
                }
                whoLost.visibility = View.VISIBLE
            }else{
                whoLost.visibility = View.INVISIBLE
            }



        })
        plusButton3.setOnClickListener({ view ->
            lives3++
            LifeCount3.setText(lives3.toString())
            if(lives1 == 0 ||lives2 == 0 || lives3 == 0 || lives4 == 0 ){
                if(lives3 == 0){
                    whoLost.setText("Player3 LOST!")
                }
                whoLost.visibility = View.VISIBLE
            }else{
                whoLost.visibility = View.INVISIBLE
            }


        })
        plusButton4.setOnClickListener({ view ->
            lives4++
            LifeCount4.setText(lives4.toString())

            if(lives1 == 0 ||lives2 == 0 || lives3 == 0 || lives4 == 0 ){
                if(lives4 == 0){
                    whoLost.setText("Player4 LOST!")
                }
                whoLost.visibility = View.VISIBLE
            }else{
                whoLost.visibility = View.INVISIBLE
            }


        })


        //Adding five lives buttons
        plus5Button1.setOnClickListener({ view ->
            lives1+=5
            LifeCount1.setText(lives1.toString())

            if(lives1 == 0 ||lives2 == 0 || lives3 == 0 || lives4 == 0 ){
                if(lives1 == 0){
                    whoLost.setText("Player1 LOST!")
                }
                whoLost.visibility = View.VISIBLE
            }else{
                whoLost.visibility = View.INVISIBLE
            }

        })
        plus5Button2.setOnClickListener({ view ->
            lives2+=5
            LifeCount2.setText(lives2.toString())
            if(lives1 == 0 ||lives2 == 0 || lives3 == 0 || lives4 == 0 ){
                if(lives2 == 0){
                    whoLost.setText("Player2 LOST!")
                }
                whoLost.visibility = View.VISIBLE
            }else{
                whoLost.visibility = View.INVISIBLE
            }


        })
        plus5Button3.setOnClickListener({ view ->
            lives3+=5
            LifeCount3.setText(lives3.toString())

            if(lives1 == 0 ||lives2 == 0 || lives3 == 0 || lives4 == 0 ){
                if(lives3 == 0){
                    whoLost.setText("Player3 LOST!")
                }
                whoLost.visibility = View.VISIBLE
            }else{
                whoLost.visibility = View.INVISIBLE
            }


        })
        plus5Button4.setOnClickListener({ view ->
            lives4+=5
            LifeCount4.setText(lives4.toString())

            if(lives1 == 0 ||lives2 == 0 || lives3 == 0 || lives4 == 0 ){
                whoLost.visibility = View.VISIBLE
                if(lives4 == 0){
                    whoLost.setText("Player4 LOST!")
                }
            }else{
                whoLost.visibility = View.INVISIBLE
            }


        })



        //Removing one life buttons
        minusButton1.setOnClickListener({ view ->
            if(lives1 >0) {
                lives1--
            }
            LifeCount1.setText(lives1.toString())

            if(lives1 == 0 ||lives2 == 0 || lives3 == 0 || lives4 == 0 ){
                if(lives1 == 0){
                    whoLost.setText("Player1 LOST!")
                }
                whoLost.visibility = View.VISIBLE
            }else{
                whoLost.visibility = View.INVISIBLE
            }

        })
        minusButton2.setOnClickListener({ view ->
            if(lives2 >0) {
                lives2--
            }
            LifeCount2.setText(lives2.toString())

            if(lives1 == 0 ||lives2 == 0 || lives3 == 0 || lives4 == 0 ){
                if(lives2 == 0){
                    whoLost.setText("Player2 LOST!")
                }
                whoLost.visibility = View.VISIBLE
            }else{
                whoLost.visibility = View.INVISIBLE
            }


        })
        minusButton3.setOnClickListener({ view ->
            if(lives3 >0) {
                lives3--
            }
            LifeCount3.setText(lives3.toString())

            if(lives1 == 0 ||lives2 == 0 || lives3 == 0 || lives4 == 0 ){
                if(lives3 == 0){
                    whoLost.setText("Player3 LOST!")
                }
                whoLost.visibility = View.VISIBLE
            }else{
                whoLost.visibility = View.INVISIBLE
            }


        })
        minusButton4.setOnClickListener({ view ->
            if(lives4 >0) {
                lives4--
            }
            LifeCount4.setText(lives4.toString())

            if(lives1 == 0 ||lives2 == 0 || lives3 == 0 || lives4 == 0 ){
                if(lives4 == 0){
                    whoLost.setText("Player4 LOST!")
                }
                whoLost.visibility = View.VISIBLE
            }else{
                whoLost.visibility = View.INVISIBLE
            }


        })


        //Removing five lives buttons
        minus5Button1.setOnClickListener({ view ->
           if((lives1-5)> 0){
               lives1 -= 5
           }else {
               lives1 = 0;
           }
            LifeCount1.setText(lives1.toString())

            if(lives1 == 0 ||lives2 == 0 || lives3 == 0 || lives4 == 0 ){
                if(lives1 == 0){
                    whoLost.setText("Player1 LOST!")
                }
                whoLost.visibility = View.VISIBLE
            }else{
                whoLost.visibility = View.INVISIBLE
            }


        })
        minus5Button2.setOnClickListener({ view ->
            if((lives2-5)> 0){
                lives2 -= 5
            }else {
                lives2 = 0;
            }
            LifeCount2.setText(lives2.toString())

            if(lives1 == 0 ||lives2 == 0 || lives3 == 0 || lives4 == 0 ){
                if(lives2 == 0){
                    whoLost.setText("Player2 LOST!")
                }
                whoLost.visibility = View.VISIBLE
            }else{
                whoLost.visibility = View.INVISIBLE
            }


        })
        minus5Button3.setOnClickListener({ view ->
            if((lives3-5)> 0){
                lives3 -= 5
            }else {
                lives3 = 0;
            }
            LifeCount3.setText(lives3.toString())

            if(lives1 == 0 ||lives2 == 0 || lives3 == 0 || lives4 == 0 ){
                if(lives3 == 0){
                    whoLost.setText("Player3 LOST!")
                }
                whoLost.visibility = View.VISIBLE
            }else{
                whoLost.visibility = View.INVISIBLE
            }


        })


        minus5Button4.setOnClickListener({ view ->
            if((lives4-5)> 0){
                lives4 -= 5
            }else {
                lives4 = 0;
            }
            LifeCount4.setText(lives4.toString())

            if(lives1 == 0 ||lives2 == 0 || lives3 == 0 || lives4 == 0 ){
                if(lives4 == 0){
                    whoLost.setText("Player4 LOST!")
                }
                whoLost.visibility = View.VISIBLE
            }else{
                whoLost.visibility = View.INVISIBLE
            }


        })




    }

}
