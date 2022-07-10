package com.creativeduck.secodn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "So Sad", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "Why not", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "Pretty", Toast.LENGTH_SHORT).show()
    }
}