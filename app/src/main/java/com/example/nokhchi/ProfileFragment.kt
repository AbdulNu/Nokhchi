package com.example.nokhchi

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment



class ProfileFragment : Fragment(R.layout.fragment_profile) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val tvText = view.findViewById<TextView>(R.id.tvText)


        val firstName = arguments?.getString("FIRST_NAME")
        val lastName = arguments?.getString("LAST_NAME")

val showStrings = "your order is made in the name of: $firstName $lastName"
        tvText.text = showStrings
    }
}

