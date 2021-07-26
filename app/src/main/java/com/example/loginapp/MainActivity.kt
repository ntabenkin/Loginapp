package com.example.loginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loginapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val user = intent.extras?.getParcelable("user") as User?
        if(user == null){
            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
            finish()
        }else{
            binding.welcomeMsg.text = getString(R.string.welcome,user.email)

        }

    }
}