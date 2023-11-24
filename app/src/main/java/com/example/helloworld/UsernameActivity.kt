package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.helloworld.databinding.ActivityUsernameBinding

class UsernameActivity : AppCompatActivity() {
    private lateinit var binding: ActivityUsernameBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUsernameBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val username = binding.usernameEditText.text.toString()

        binding.openDisplayUsernameActivityButton.setOnClickListener {
            if(binding.usernameEditText.text.isEmpty()) {
                Toast.makeText(
                    this,
                    "Debe introducir un nombre de usuario",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                val diplayIntent = Intent(
                    this,
                    DisplayUsernameActivity::class.java
                )

                diplayIntent.putExtra(
                    DisplayUsernameActivity.Params.USERNAME.name,
                    username
                )

                startActivity(diplayIntent)
            }


        }

    }
}