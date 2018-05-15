package android.boloorian.com.demointlphonelayout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import khosrov.kotlin.widget.IntlPhoneLayout
import khosrov.kotlin.widget.RegionItem
import khosrov.kotlin.widget.events.ISelectionDelegate

class MainActivity : AppCompatActivity() , ISelectionDelegate {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val input = findViewById<IntlPhoneLayout>(R.id.input_layout);
        input.setOnSelectionListener(this)
        input.number = "+3312345678"
    }

    override fun onSelectRegion(regionItem: RegionItem) {

    }
}
