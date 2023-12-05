package com.example.mobileapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

class Translate : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.editText)
        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        val buttonConvert = findViewById<Button>(R.id.buttonConvert)

        buttonConvert.setOnClickListener {
            val numberStr = editText.text.toString()
            val number = numberStr.toInt()

            val selectedRadioButtonId = radioGroup.checkedRadioButtonId
            val selectedRadioButton = findViewById<RadioButton>(selectedRadioButtonId)
            val selectedSystem = when (selectedRadioButton.id) {
                R.id.radioButton8 -> 8
                R.id.radioButton10 -> 10
                R.id.radioButton16 -> 16
                else -> 10
            }
            val result = when (selectedSystem) {
                8 -> Integer.toOctalString(number)
                10 -> Integer.toString(number)
                16 -> Integer.toHexString(number)
                else -> ""
            }

            // Вывод результата
            // result содержит строку с числом в выбранной системе счисления
        }
    }
}