package com.example.jeff_skillrill

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_splash_screen.*

class splash_screen : AppCompatActivity() {
    var imgArr = mutableListOf<ImageView>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)



        imgArr.add(t1)
        imgArr.add(i)
        imgArr.add(c1)
        imgArr.add(t2)
        imgArr.add(a)
        imgArr.add(c2)

        val anim = AnimationUtils.loadAnimation(this, R.anim.anim_translate)
        val anim2 = AnimationUtils.loadAnimation(this, R.anim.set_anim)
        val anim3 = AnimationUtils.loadAnimation(this, R.anim.anim_tr2)

        var index = 1
        t1.startAnimation(anim)
        anim.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(p0: Animation?) {

            }


            override fun onAnimationEnd(p0: Animation?) {
                if (index <= imgArr.size) {
                    imgArr[index - 1].startAnimation(anim3)
                }
                if (index == imgArr.size - 1) {
                    toe.visibility = View.VISIBLE
                    toe.startAnimation(anim2)
                }
            }

            override fun onAnimationRepeat(p0: Animation?) {}
        })

        anim3.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(p0: Animation?) {}

            override fun onAnimationEnd(p0: Animation?) {
                if (index <= imgArr.size - 1) {
                    imgArr[index].visibility = View.VISIBLE
                    imgArr[index].startAnimation(anim)
                    index++
                }
            }

            override fun onAnimationRepeat(p0: Animation?) {}
        })


        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, Play_Game_Activ::class.java)
            startActivity(intent)
            finish()
        }, 5500)

    }
}