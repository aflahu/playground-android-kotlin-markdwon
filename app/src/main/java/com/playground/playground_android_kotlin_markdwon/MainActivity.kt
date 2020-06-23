package com.playground.playground_android_kotlin_markdwon

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import io.noties.markwon.Markwon

class MainActivity : AppCompatActivity() {
    lateinit var tvMarkdown: TextView
    lateinit var markwon: Markwon

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
    }

    fun initView() {
        tvMarkdown = findViewById<TextView>(R.id.text_view_markdown);
        markwon = Markwon.create(this)
        markwon.setMarkdown(tvMarkdown, "# Coba")
    }
}