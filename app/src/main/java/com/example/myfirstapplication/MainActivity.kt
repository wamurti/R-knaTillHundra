package com.example.myfirstapplication

import android.os.Bundle
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.mybutton)
        val btnReset = findViewById<Button>(R.id.resetbutton)
        val greetingText = findViewById<TextView>(R.id.textView2)
        val oneStar = findViewById<ImageView>(R.id.oneStar)
        val twoStar = findViewById<ImageView>(R.id.oneStar2)
        val threeStar = findViewById<ImageView>(R.id.oneStar3)
        val fourStar = findViewById<ImageView>(R.id.oneStar4)
        val fiveStar = findViewById<ImageView>(R.id.oneStar5)
        val sixStar = findViewById<ImageView>(R.id.oneStar6)
        val sevenStar = findViewById<ImageView>(R.id.oneStar7)
        val eightStar = findViewById<ImageView>(R.id.oneStar8)

        var timesClicked = 0
        var rainBow = "\ud83c\udf08"
        var star ="\ud83c\udf1f"
        btnClickMe.setOnClickListener {
            timesClicked +=1
            greetingText.text = timesClicked.toString()
            when (timesClicked) {
                5 -> {
                    Toast.makeText(this, rainBow,Toast.LENGTH_LONG).show()
                    rainBow += rainBow
                }
                10 -> {
                    Toast.makeText(this, rainBow,Toast.LENGTH_LONG).show();
                    rainBow += "\ud83c\udf08"
                }
                15 -> {
                    Toast.makeText(this, rainBow,Toast.LENGTH_LONG).show();
                    rainBow += "\ud83c\udf08"
                }
                20 -> {
                    Toast.makeText(this, rainBow+star,Toast.LENGTH_LONG).show();
                    oneStar.setVisibility(VISIBLE)
                    rainBow += "\ud83c\udf08"
                    star += star
                }
                30 -> {
                    Toast.makeText(this, rainBow+star,Toast.LENGTH_LONG).show();
                    twoStar.setVisibility(VISIBLE)
                    rainBow += "\ud83c\udf08"
                    star += "\ud83c\udf1f"
                }
                40 -> {
                    Toast.makeText(this, rainBow+star,Toast.LENGTH_LONG).show();
                    threeStar.setVisibility(VISIBLE)
                    rainBow += "\ud83c\udf08"
                    star += "\ud83c\udf1f"
                }
                50 -> {
                    Toast.makeText(this, rainBow+star,Toast.LENGTH_LONG).show();
                    fourStar.setVisibility(VISIBLE)
                    rainBow += "\ud83c\udf08"
                    star += "\ud83c\udf1f"
                }

                60 -> {
                    Toast.makeText(this, rainBow+star,Toast.LENGTH_LONG).show();
                    fiveStar.setVisibility(VISIBLE)
                    rainBow += "\ud83c\udf08"
                    star += "\ud83c\udf1f"
                }

                70 -> {
                    Toast.makeText(this, rainBow+star,Toast.LENGTH_LONG).show();
                    sixStar.setVisibility(VISIBLE)
                    rainBow += "\ud83c\udf08"
                    star += "\ud83c\udf1f"
                }

                80 -> {
                    Toast.makeText(this, rainBow+star,Toast.LENGTH_LONG).show();
                    sevenStar.setVisibility(VISIBLE)
                    rainBow += "\ud83c\udf08"
                    star += "\ud83c\udf1f"
                }
                90 -> {
                    Toast.makeText(this, rainBow+star,Toast.LENGTH_LONG).show();
                    eightStar.setVisibility(VISIBLE)
                    rainBow += "\ud83c\udf08"
                    star += "\ud83c\udf1f"
                }
            }
        }
        btnReset.setOnClickListener {
            timesClicked +=1
            greetingText.text = "0"
            timesClicked = 0


        }

    }
}