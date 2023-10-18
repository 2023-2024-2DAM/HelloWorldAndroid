package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.helloworld.databinding.ActivitySendEmailBinding

class SendEmailActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySendEmailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySendEmailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.sendEmailButton.setOnClickListener { v ->
            Toast
                .makeText(
                    this,
                    "Enviando mensaje ${binding.subjectEditText.text} a ${binding.destinationEMailEditText.text}",
                    Toast.LENGTH_SHORT)
                .show()
        }
    }
}