package com.example.helloworld

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.helloworld.databinding.ActivityCalculatorBinding
import com.example.helloworld.databinding.ActivityContactBinding

class ContactActivity : AppCompatActivity() {

    private lateinit var binding: ActivityContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContactBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.emailSwitch.setOnClickListener {
            // binding.emailSwitch.visibility = View.INVISIBLE
            binding.emailEditText.isEnabled =
                binding.emailSwitch.isChecked
        }

        binding.helloButton.setOnClickListener { _ ->
            when (binding.sexGroup.checkedRadioButtonId) {
                binding.maleRB.id -> {
                    Toast.makeText(this, "Sexo: masculino", Toast.LENGTH_SHORT).show()
                }

                binding.femaleRB.id -> {
                    Toast.makeText(this, "Sexo: femenino", Toast.LENGTH_SHORT).show()
                }

                binding.nonBinaryRB.id -> {
                    Toast.makeText(this, "Sexo: No binario", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}