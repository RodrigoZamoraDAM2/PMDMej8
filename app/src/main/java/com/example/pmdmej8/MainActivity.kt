package com.example.pmdmej8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pmdmej8.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.humano.setOnClickListener(){
            binding.imageView.setImageResource(R.drawable.humano)
        }
        binding.elfo.setOnClickListener(){
            binding.imageView.setImageResource(R.drawable.elfo)
        }
        binding.enano.setOnClickListener(){
            binding.imageView.setImageResource(R.drawable.enano)
        }
        binding.goblin.setOnClickListener(){
            binding.imageView.setImageResource(R.drawable.goblin)
        }
        binding.aceptar.setOnClickListener(){
            val intent = Intent(this@MainActivity,BlankActivity::class.java)
            startActivity(intent)
        }
    }
}