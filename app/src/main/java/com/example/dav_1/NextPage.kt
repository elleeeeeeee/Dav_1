package com.example.dav_1

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.remoteapp2.databinding.ActivityNextPageBinding

class NextPage : AppCompatActivity() {
    private lateinit var binding: ActivityNextPageBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityNextPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {

            var number = intent.extras?.getString("number", "number not entered").toString().toInt()
            counterNumber.text = number.toString()

            clickBtn.setOnClickListener{
                number--
                counterNumber.text = number.toString()
            }
        }
    }
}