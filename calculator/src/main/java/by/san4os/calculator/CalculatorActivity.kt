package by.san4os.calculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import examples.android.lib_calculator.Calculator

class CalculatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_calculator)

        val resultTextView = findViewById<TextView>(R.id.resultTextView)
        val inputEditText = findViewById<EditText>(R.id.inputEditText)
        val calculateButton = findViewById<Button>(R.id.calculateButton)

        calculateButton.setOnClickListener {
            val text = inputEditText.text.toString()

            resultTextView.text = Calculator.calculate(text)
        }
    }


}