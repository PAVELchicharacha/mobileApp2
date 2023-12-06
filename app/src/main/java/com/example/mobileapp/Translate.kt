package com.example.mobileapp

import android.icu.number.IntegerWidth
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

class Translate : AppCompatActivity() {
    private lateinit var editText:EditText
    private lateinit var editResult:EditText
    private lateinit var radioGroup:RadioGroup
    private lateinit var buttonConvert:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.translate)

        editText = findViewById<EditText>(R.id.editText)
        editResult=findViewById<EditText>(R.id.editResult)
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
                8 ->editResult.setText(Integer.toOctalString(number).toString())
                10 -> editResult.setText(Integer.toString(number))
                16 -> editResult.setText(Integer.toHexString(number))
                else -> ""
            }
        }
    }
}