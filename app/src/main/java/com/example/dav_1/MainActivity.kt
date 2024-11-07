package com.example.dav_1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.remoteapp2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {

            okayBtn.setOnClickListener{
                val number = numberField.text.toString()

                yourNumber.text = "Your number is $number"
            }


            nextBtn.setOnClickListener{
                val intent = Intent(this@MainActivity, NextPage::class.java)
                intent.putExtra("number", numberField.text.toString())

                startActivity(intent)
                finish()
            }

        }

    }
}