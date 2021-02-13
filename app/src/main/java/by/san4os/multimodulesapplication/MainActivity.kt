package by.san4os.multimodulesapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import by.san4os.calculator.CalculatorActivity
import by.san4os.currenttime.CurrentTimeActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onNavigateCalculatorButtonClick(view: View) {
        startActivity(Intent(this, CalculatorActivity::class.java))
    }

    fun onNavigateTimeButtonClick(view: View) {
        startActivity(Intent(this, CurrentTimeActivity::class.java))
    }
}