package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.helloworld.databinding.ActivityCalculatorTableBinding

class CalculatorTableActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCalculatorTableBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalculatorTableBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.acButton.setOnClickListener {
            binding.operationsTextView.text = ""
        }

        //       binding.oneButton.setOnClickListener{addTextToOperations(it)}
       //        binding.twoButton.setOnClickListener{addTextToOperations(it)}
       //        binding.threeButton.setOnClickListener{addTextToOperations(it)}


        binding.oneButton.setOnClickListener {
            addTextToOperations("1")
        }

        binding.twoButton.setOnClickListener { _ ->
            addTextToOperations("2")
        }
    }

    fun addTextToOperations(v: View) {
        val text = (v as Button).text.toString()
        addTextToOperations(text)
    }

    fun addTextToOperations(v: String) {
        binding.operationsTextView.text =
            binding.operationsTextView.text.toString() + v
    }
}