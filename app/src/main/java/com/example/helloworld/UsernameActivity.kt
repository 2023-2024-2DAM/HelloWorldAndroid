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

        binding.openDisplayUsernameActivityButton.setOnClickListener {
            if(binding.usernameEditText.text.isEmpty()) {
                Toast.makeText(
                    this,
                    "Debe introducir un nombre de usuario",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                val intent = Intent(
                    this,
                    DisplayUsernameActivity::class.java
                )

                intent.putExtra(
                    DisplayUsernameActivity.Params.USERNAME.name,
                    binding.usernameEditText.text.toString()
                )

                startActivity(intent)
            }


        }

    }
}