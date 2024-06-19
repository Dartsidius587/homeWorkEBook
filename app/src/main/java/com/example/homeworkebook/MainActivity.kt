package com.example.homeworkebook

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var titleProgramTB: Toolbar
    private lateinit var buttonDownloadBookBTN: Button
    private lateinit var textTV: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        init()
    }

    private fun init() {
        setContentView(R.layout.activity_main)
        titleProgramTB = findViewById(R.id.titleProgramTB)
        setSupportActionBar(titleProgramTB)
        title = "Электронная книга"
        buttonDownloadBookBTN = findViewById(R.id.buttonDownloadBookBTN)
        buttonDownloadBookBTN.setOnClickListener(this)
        textTV = findViewById(R.id.textTV)
    }

    fun loadBook(text: String): List<String> {
        val list = text.split(" ")
        return list
    }

    override fun onClick(view: View) {
        val book = DataBase()
        textTV.text = loadBook(book.text).joinToString(separator = " ")
    }
}