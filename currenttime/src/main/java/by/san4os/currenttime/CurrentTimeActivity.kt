package by.san4os.currenttime

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.Date

class CurrentTimeActivity : AppCompatActivity() {

    private var thread: Thread? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_currenttime)
        val view = findViewById<TextView>(R.id.currentTimeTextView)

        thread = Thread {
            while (true) {
                view.text = Date().toString()
                Thread.sleep(1000)
            }
        }.also {
            it.start()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        thread?.interrupt()
    }
}