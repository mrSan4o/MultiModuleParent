package by.san4os.calculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CalculatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_calculator)

        val resultTextView = findViewById<TextView>(R.id.resultTextView)
        val inputEditText = findViewById<EditText>(R.id.inputEditText)
        val calculateButton = findViewById<Button>(R.id.calculateButton)

        calculateButton.setOnClickListener {
            val text = inputEditText.text.toString()

            resultTextView.text = calculate(text)
        }
    }

    private val operations = arrayOf('+', '-', '/', '*')
    private fun calculate(text: String): String {
        return operations
            .find { text.contains(it) }
            ?.let {
                val split = text.split(it)
                return@let calculateNumbers(
                    split[0].toIntOrNull() ?: 0,
                    split[1].toIntOrNull() ?: 0,
                    it
                ).toString()
            }
            ?: ""
    }

    private fun calculateNumbers(i1: Int, i2: Int, operator: Char): Int {
        return when (operator) {
            '+' -> i1 + i2
            '-' -> i1 - i2
            '*' -> i1 * i2
            '/' -> i1 / i2
            else -> 0
        }
    }
}