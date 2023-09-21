package com.pvstudio.schedule

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.pvstudio.schedule.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.dateTV.setOnClickListener {
            Log.d("MA", "date Clic" )
        }
        binding.nextIB.setOnClickListener {  }
        binding.privIB.setOnClickListener {  }
    }
}