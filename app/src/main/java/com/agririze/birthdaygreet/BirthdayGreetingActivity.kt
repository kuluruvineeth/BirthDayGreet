package com.agririze.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BirthdayGreetingActivity : AppCompatActivity() {
    companion object {
        const val NAME_EXTRA = "name_extra"
    }
    private lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)
        textView = findViewById(R.id.birthdayGreeting)
        val name = intent.getStringExtra(NAME_EXTRA)
        textView.text = "Happy Birthday\n$name!"
    }
}