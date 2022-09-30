package edu.temple.assignment3

import android.content.Context
import android.graphics.Color
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ColorAdapter(_context: Context) : BaseAdapter() {
    private val context = _context

    private var colors = arrayOf(
        "White",
        "Red",
        "Blue",
        "Yellow",
        "Green",
        "Purple",
        "Gray",
        "Magenta",
        "Teal",
        "Olive",
        "Black"
    )

    override fun getCount(): Int {
        return colors.size
    }

    override fun getItem(position: Int): Any {
        return colors[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val textView: TextView

        if(convertView != null)
            textView = convertView as TextView
        else
            textView = TextView(context)

        textView.text = colors[position]
        textView.setBackgroundColor(Color.WHITE)

        return textView
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val textView: TextView
        val color = Color.parseColor(colors[position])

        if(convertView != null)
            textView = convertView as TextView
        else
            textView = TextView(context)

        textView.text = colors[position]
        textView.setBackgroundColor(color)

        if(colors[position] == "Black" || colors[position] == "Blue")
            textView.setTextColor(Color.WHITE)

        return textView
    }
}