package edu.temple.assignment3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.graphics.Color
import android.view.View
import android.widget.AdapterView
import android.widget.Spinner

class MainActivity : AppCompatActivity() {

    private lateinit var colorSpinner: Spinner
    lateinit var layout: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Bind views
        colorSpinner = findViewById(R.id.colorSpinner)
        layout = findViewById(R.id.layout)

        colorSpinner.adapter = ColorAdapter(this)

        colorSpinner.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                layout.setBackgroundColor(Color.parseColor(parent!!.getItemAtPosition(position).toString()))
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                layout.setBackgroundColor(Color.WHITE)
            }

        }
    }
}