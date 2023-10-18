package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.helloworld.databinding.ActivityTextViewsBinding

class TextViewsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTextViewsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTextViewsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textView5.text = "He cambiado este texto desde el código"
    }
}