package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.helloworld.databinding.ActivityDisplayStudentInfoBinding

class DisplayStudentInfoActivity : AppCompatActivity() {
    enum class Params {
        STUDENT
    }

    private lateinit var binding: ActivityDisplayStudentInfoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDisplayStudentInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val student = intent.getParcelableExtra(
            Params.STUDENT.name,
            Student::class.java
        )

        binding.nameTv.text = student?.name ?: "Sin nombre"
        binding.surnameTV.text = student?.surname ?: "Sin apellidos"
        binding.ageTv.text = student?.age?.toString() ?: "Sin edad"

        binding.closeButton.setOnClickListener{
            finish()
        }
    }
}