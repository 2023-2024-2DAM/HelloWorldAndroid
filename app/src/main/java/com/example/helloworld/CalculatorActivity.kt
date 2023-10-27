package com.example.helloworld

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.helloworld.databinding.ActivityCalculatorBinding

class CalculatorActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCalculatorBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalculatorBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.plusButton.setOnClickListener {
            val number1 = binding.number1EditText
                .text.toString().toDoubleOrNull()

            val number2 = binding.number2EditText
                .text.toString().toDoubleOrNull()
//            number1?.let { number1 ->
//                number2?.let { number2 ->
//                    val sum = number1 + number2
//                    binding.resultTextView.text = sum.toString()
//                }
//            } ?: Toast.makeText(this, "Debe introducir ambos números", Toast.LENGTH_SHORT).show()

            if (number1 != null && number2 != null) {
                val sum = number1 + number2
                binding.resultTextView.text = sum.toString()
            } else {
                Toast.makeText(this, "Debe introducir ambos números", Toast.LENGTH_SHORT).show()
            }
        }

    }
}