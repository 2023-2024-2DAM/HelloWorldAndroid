package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.helloworld.databinding.ActivityDisplayUsernameBinding
import com.example.helloworld.databinding.ActivityUsernameBinding

class DisplayUsernameActivity : AppCompatActivity() {
    enum class Params {
        USERNAME
    }

    private lateinit var binding: ActivityDisplayUsernameBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDisplayUsernameBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val username = this.intent.getStringExtra(Params.USERNAME.name)

        binding.usernameTextView.text = username

        binding.returnButton.setOnClickListener {
            finish()
        }
    }
}