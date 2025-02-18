package com.example.nokhchi

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.asLiveData

class Baydarka: AppCompatActivity(R.layout.baydaka) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val btnApply = findViewById<Button>(R.id.btnApply)
        val edName = findViewById<EditText>(R.id.edName)
        val edLastName = findViewById<EditText>(R.id.edLastName)
        val showText = findViewById<TextView>(R.id.textShow)
            val db = MainDb.getDb(this)
            db.getDao().getAllItem().asLiveData().observe(this) {
                showText.text = ""
                it.forEach {
                    val text = "The baydarka  is decorated"
                    showText.append(text)
                }
        btnApply.setOnClickListener {
            val items = Item(
                null,
                edName.text.toString(),
                edLastName.text.toString()
            )

            Thread {
                db.getDao().insertItem(items)
            }.start()
            val input1 = edName.text.toString()
            val input2 = edLastName.text.toString()
            val profileFragment = ProfileFragment().apply {
                arguments = Bundle().apply {
                    putString("FIRST_NAME", input1)
                    putString("LAST_NAME", input2)
                }
            }

            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, profileFragment)
                .addToBackStack(null)
                .commit()
            val text = "the order has been placed!"
            val duration = Toast.LENGTH_SHORT

            val toast = Toast.makeText(this, text, duration) // in Activity
            toast.show()
        }
                }
            }
    }




