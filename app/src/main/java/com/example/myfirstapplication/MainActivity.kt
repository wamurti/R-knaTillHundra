package com.example.myfirstapplication

import android.content.Context
import android.graphics.Color
import android.media.MediaPlayer
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
                1 -> {
                    var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.ett)
                    mediaPlayer.start()
                }
                2 -> {
                    var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.tva)
                    mediaPlayer.start()
                }
                3 -> {
                    var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.tre)
                    mediaPlayer.start()
                }
                4 -> {
                    var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.fyra)
                    mediaPlayer.start()
                }
                5 -> {
                    var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.fem)
                    mediaPlayer.start()
                    Toast.makeText(this, rainBow,Toast.LENGTH_LONG).show()
                    rainBow += rainBow
                }
                6 -> {
                    var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.sex)
                    mediaPlayer.start()
                }
                7 -> {
                    var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.sju)
                    mediaPlayer.start()
                }
                8 -> {
                    var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.otta)
                    mediaPlayer.start()
                }
                9 -> {
                    var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.nio)
                    mediaPlayer.start()
                }
                10 -> {
                    var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.tio)
                    mediaPlayer.start()
                    Toast.makeText(this, rainBow,Toast.LENGTH_LONG).show()
                    rainBow += "\ud83c\udf08"
                    greetingText.setTextColor(Color.parseColor("#007FFF"))
                }
                11 -> {
                    var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.elva)
                    mediaPlayer.start()
                }
                12 -> {
                    var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.tolv)
                    mediaPlayer.start()
                }
                13 -> {
                    var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.tretton)
                    mediaPlayer.start()
                }
                14 -> {
                    var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.fjorton)
                    mediaPlayer.start()
                }

                15 -> {
                    var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.femton)
                    mediaPlayer.start()
                    Toast.makeText(this, rainBow,Toast.LENGTH_LONG).show()
                    rainBow += "\ud83c\udf08"

                }
                16 -> {
                    var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.sexton)
                    mediaPlayer.start()
                }
                17 -> {
                    var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.sjutton)
                    mediaPlayer.start()
                }
                18 -> {
                    var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.arton)
                    mediaPlayer.start()
                }
                19 -> {
                    var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.nitton)
                    mediaPlayer.start()
                }
                20 -> {
                    var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.tjugo)
                    mediaPlayer.start()
                    Toast.makeText(this, rainBow+star,Toast.LENGTH_LONG).show()
                    oneStar.setVisibility(VISIBLE)
                    rainBow += "\ud83c\udf08"
                    star += star
                    greetingText.setTextColor(Color.parseColor("#FF00FF"))
                }
                21 -> {
                    var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.tjugoett)
                    mediaPlayer.start()
                }
                22 -> {
                    var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.tjugotva)
                    mediaPlayer.start()
                }
                23 -> {
                    var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.tjugotre)
                    mediaPlayer.start()
                }
                24 -> {
                    var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.tjugofyra)
                    mediaPlayer.start()
                }
                25 -> {
                    var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.tjugofem)
                    mediaPlayer.start()
                }
                26 -> {
                    var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.tjugosex)
                    mediaPlayer.start()
                }
                27 -> {
                    var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.tjugosju)
                    mediaPlayer.start()
                }
                28 -> {
                    var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.tjugootta)
                    mediaPlayer.start()
                }
                29 -> {
                    var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.tjugonio)
                    mediaPlayer.start()
                }
                30 -> {
                    var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.trettio)
                    mediaPlayer.start()
                    Toast.makeText(this, rainBow+star,Toast.LENGTH_LONG).show()
                    twoStar.setVisibility(VISIBLE)
                    rainBow += "\ud83c\udf08"
                    star += "\ud83c\udf1f"
                    greetingText.setTextColor(Color.parseColor("#FF007F"))
                }
                31 -> {
                    var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.trettioett)
                    mediaPlayer.start()
                }
                32 -> {
                    var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.trettiotva)
                    mediaPlayer.start()
                }
                33 -> {
                    var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.trettiotre)
                    mediaPlayer.start()
                }
                34 -> {
                    var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.trettiofyra)
                    mediaPlayer.start()
                }
                35 -> {
                    var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.trettiofem)
                    mediaPlayer.start()
                }
                36 -> {
                    var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.trettiosex)
                    mediaPlayer.start()
                }
                37 -> {
                    var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.trettiosju)
                    mediaPlayer.start()
                }
                38 -> {
                    var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.trettiootta)
                    mediaPlayer.start()
                }
                39 -> {
                    var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.trettionio)
                    mediaPlayer.start()
                }
                40 -> {
                    var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.fyrtio)
                    mediaPlayer.start()
                    Toast.makeText(this, rainBow+star,Toast.LENGTH_LONG).show()
                    threeStar.setVisibility(VISIBLE)
                    rainBow += "\ud83c\udf08"
                    star += "\ud83c\udf1f"
                    greetingText.setTextColor(Color.parseColor("#7F00FF"))
                }
                41 -> {
                    var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.fyrtioen)
                    mediaPlayer.start()
                }
                42 -> {
                    var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.fyrtiotva)
                    mediaPlayer.start()
                }
                43 -> {
                    var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.fyrtiotre)
                    mediaPlayer.start()
                }
                44 -> {
                    var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.fyrtiofyra)
                    mediaPlayer.start()
                }
                45 -> {
                    var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.fyrtiofem)
                    mediaPlayer.start()
                }
                46 -> {
                    var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.fyrtiosex)
                    mediaPlayer.start()
                }
                47 -> {
                    var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.fyrtiosju)
                    mediaPlayer.start()
                }
                48 -> {
                    var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.fyrtiootta)
                    mediaPlayer.start()
                }
                49 -> {
                    var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.fyrtionio)
                    mediaPlayer.start()
                }

                50 -> {
                    var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.femtio)
                    mediaPlayer.start()
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