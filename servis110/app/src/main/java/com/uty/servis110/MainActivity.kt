package com.uty.servis110


import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //buton facebook
        btn_facebook.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.facebook.com/ langitinspirasi"))
            startActivity(i)
        })


        //button instagram
        btn_instagram.setOnClickListener({
           val i = Intent(Intent.ACTION_VIEW,
               Uri.parse("http//www.instagram.com/ langit inspirasi"))
            startActivity(i)
        })

        //deklarasi variabel
    }
}
