package tiil.edu.baith10_viduintentdongian

import android.R
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    var txtResult: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        txtResult = findViewById<TextView?>(R.id.txtResult)

        val name = getIntent().getStringExtra("ten")

        txtResult!!.setText("Xin chao: " + name)
    }
}