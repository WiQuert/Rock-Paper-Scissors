package com.wiquert.rock_paper_scissors

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wiquert.rock_paper_scissors.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.bStart.setOnClickListener {
            val intent = Intent(this, GameActivity::class.java)
            startActivity(intent)

        }
    }

}