package qbo.com.appkea1mapsintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnvermaps.setOnClickListener {
            val urlIntent = Uri.parse(
                    "geo:0,0?q=-17.964608,-67.106727(Bolivia)")
            val mapIntent = Intent(Intent.ACTION_VIEW, urlIntent)
            mapIntent.`package` = "com.google.android.apps.maps"
            mapIntent.resolveActivity(packageManager)?.let {
                startActivity(mapIntent)
            }
        }

    }
}