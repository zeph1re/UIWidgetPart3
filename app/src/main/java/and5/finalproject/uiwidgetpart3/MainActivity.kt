package and5.finalproject.uiwidgetpart3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragOne = FragFirst()
        val fragTwo = FragSec()
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment_main, fragOne)
            commit()
        }
        findViewById<Button>(R.id.btn_one).setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragment_main, fragOne)
                commit()
            }
        }
        findViewById<Button>(R.id.btn_two).setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragment_main, fragTwo)
                commit()
            }
        }
    }
}
