package bezzier.fasty

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class registro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Thread.sleep(2000)
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registro_view)
    }
}