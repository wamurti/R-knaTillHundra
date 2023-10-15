package com.example.myfirstapplication

import android.content.Context
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.os.SystemClock
import android.os.VibrationEffect
import android.os.Vibrator
import android.os.VibratorManager
import android.view.HapticFeedbackConstants
import android.view.View
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.delay


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        var lastClickTime : Long = 0;
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

        btnClickMe.setOnClickListener { view ->

            //Lägger in en delay så att det inte går att spamma
            if (SystemClock.elapsedRealtime() - lastClickTime < 750){
                return@setOnClickListener
            }
            lastClickTime = SystemClock.elapsedRealtime();



            view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY,
                HapticFeedbackConstants.FLAG_IGNORE_GLOBAL_SETTING)





            timesClicked +=1
            greetingText.text = timesClicked.toString()
            when (timesClicked) {
                5 -> {
                    Toast.makeText(this, rainBow,Toast.LENGTH_LONG).show()
                    rainBow += rainBow

                }
                10 -> {
                    Toast.makeText(this, rainBow,Toast.LENGTH_LONG).show()
                    rainBow += "\ud83c\udf08"
                    greetingText.setTextColor(Color.parseColor("#007FFF"))
                }
                15 -> {
                    Toast.makeText(this, rainBow,Toast.LENGTH_LONG).show()
                    rainBow += "\ud83c\udf08"

                }
                20 -> {
                    Toast.makeText(this, rainBow+star,Toast.LENGTH_LONG).show()
                    oneStar.setVisibility(VISIBLE)
                    rainBow += "\ud83c\udf08"
                    star += star
                    greetingText.setTextColor(Color.parseColor("#FF00FF"))
                }
                30 -> {
                    Toast.makeText(this, rainBow+star,Toast.LENGTH_LONG).show()
                    twoStar.setVisibility(VISIBLE)
                    rainBow += "\ud83c\udf08"
                    star += "\ud83c\udf1f"
                    greetingText.setTextColor(Color.parseColor("#FF007F"))
                }
                40 -> {
                    Toast.makeText(this, rainBow+star,Toast.LENGTH_LONG).show()
                    threeStar.setVisibility(VISIBLE)
                    rainBow += "\ud83c\udf08"
                    star += "\ud83c\udf1f"
                    greetingText.setTextColor(Color.parseColor("#7F00FF"))
                }
                50 -> {
                    Toast.makeText(this, rainBow+star,Toast.LENGTH_LONG).show()
                    fourStar.setVisibility(VISIBLE)
                    rainBow += "\ud83c\udf08"
                    star += "\ud83c\udf1f"
                    greetingText.setTextColor(Color.parseColor("#FF7F00"))
                }

                60 -> {
                    Toast.makeText(this, rainBow+star,Toast.LENGTH_LONG).show()
                    fiveStar.setVisibility(VISIBLE)
                    rainBow += "\ud83c\udf08"
                    star += "\ud83c\udf1f"
                    greetingText.setTextColor(Color.parseColor("#FF00FF"))
                }

                70 -> {
                    Toast.makeText(this, rainBow+star,Toast.LENGTH_LONG).show()
                    sixStar.setVisibility(VISIBLE)
                    rainBow += "\ud83c\udf08"
                    star += "\ud83c\udf1f"
                    greetingText.setTextColor(Color.parseColor("#FF007F"))
                }

                80 -> {
                    Toast.makeText(this, rainBow+star,Toast.LENGTH_LONG).show()
                    sevenStar.setVisibility(VISIBLE)
                    rainBow += "\ud83c\udf08"
                    star += "\ud83c\udf1f"
                    greetingText.setTextColor(Color.parseColor("#00FFFF"))
                }
                90 -> {
                    Toast.makeText(this, rainBow+star,Toast.LENGTH_LONG).show()
                    eightStar.setVisibility(VISIBLE)
                    rainBow += "\ud83c\udf08"
                    star += "\ud83c\udf1f"
                    greetingText.setTextColor(Color.parseColor("#FF00FF"))
                }
            }







        }
        btnReset.setOnClickListener {
            timesClicked +=1
            greetingText.text = "0"
            timesClicked = 0
            oneStar.setVisibility(INVISIBLE)
            twoStar.setVisibility(INVISIBLE)
            threeStar.setVisibility(INVISIBLE)
            fourStar.setVisibility(INVISIBLE)
            fiveStar.setVisibility(INVISIBLE)
            sixStar.setVisibility(INVISIBLE)
            sevenStar.setVisibility(INVISIBLE)
            eightStar.setVisibility(INVISIBLE)
            rainBow = "\ud83c\udf08"
            star ="\ud83c\udf1f"


        }



    }
}