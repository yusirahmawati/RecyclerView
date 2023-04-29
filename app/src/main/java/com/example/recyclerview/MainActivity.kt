package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    lateinit var adapter: MyContactAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listStudent = arrayListOf(
            MyContact("19102298","Yusi Rahmawati", "081333856588") ,
            MyContact("19102300","Sophia Sandeva","089538259253"),
            MyContact("19102191","Ica","0896374618518"),
            MyContact("19102192","Dona","081246173428"),
            MyContact("19102235","Zahra Mahardika","0813228734186"),
            MyContact("19102863","Zahira","089962858241"),
        )

        adapter = MyContactAdapter(listStudent)

        val layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        binding.rvContact.layoutManager = layoutManager
        binding.rvContact.adapter = adapter

    }
}