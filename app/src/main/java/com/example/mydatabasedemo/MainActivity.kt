package com.example.mydatabasedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mydatabasedemo.database.ProductDB
import com.example.mydatabasedemo.databinding.ActivityMainBinding
import com.example.mydatabasedemo.entity.Product

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnInsert.setOnClickListener() {
            val p = Product(0, "Iphone", 3500.00)

            val dao = ProductDB.getInstance(applicationContext).productDao

            dao.addProduct(p)
        }

        binding.btnRead.setOnClickListener() {

        }
    }
}