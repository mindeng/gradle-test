package com.example.gradletest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class Page2 : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_page2)

    handleIntent()
  }

  override fun onNewIntent(intent: Intent?) {
    super.onNewIntent(intent)
    Log.i("Page2", "onNewIntent")
    handleIntent()
  }

  private fun handleIntent() {
    Log.i("Page2", "handleIntent: $intent")
  }

  override fun onDestroy() {
    super.onDestroy()
    Log.i("Page2", "onDestroy")
  }
}