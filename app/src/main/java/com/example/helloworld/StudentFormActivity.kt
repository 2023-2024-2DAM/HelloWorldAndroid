package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.helloworld.databinding.ActivityStudentFormBinding

class StudentFormActivity : AppCompatActivity() {
    private lateinit var binding: ActivityStudentFormBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStudentFormBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.saveButton.setOnClickListener{
            val name = binding.nameEditText.text.toString()
            val surname = binding.surnameEditText.text.toString()
            val ageStr = binding.ageEditText.text.toString()
            if(name.isEmpty() || surname.isEmpty() || ageStr.isEmpty()) {
                Toast.makeText(this,
                    "Debe introducir todos los campos",
                    Toast.LENGTH_SHORT
                ).show()
            }else{
                val student = Student(name, surname, ageStr.toInt())
                val displayStudentIntent = Intent(
                    this,
                    DisplayStudentInfoActivity::class.java
                )

                displayStudentIntent.putExtra(
                    DisplayStudentInfoActivity.Params.STUDENT.name,
                    student
                )
                startActivity(displayStudentIntent)
            }

        }
    }
}