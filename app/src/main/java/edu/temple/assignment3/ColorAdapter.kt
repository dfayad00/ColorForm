package edu.temple.assignment3

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import org.w3c.dom.Text

class ColorAdapter(_context: Context) : BaseAdapter() {
    private val context = _context

    private var colors = arrayOf(
        "Red",
        "Blue",
        "Yellow",
        "Green",
        "Purple",
        "Gray",
        "White",
        "Magenta",
        "Teal",
        "Orange",
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
        val textView = TextView(context)
        textView.text = colors[position]
        return textView
    }
}