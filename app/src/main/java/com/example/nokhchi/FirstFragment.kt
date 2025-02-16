package com.example.nokhchi

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class FirstFragment: Fragment(R.layout.slider_item){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
       val button = view.findViewById<Button>(R.id.btnApply)

        button.setOnClickListener{
            val intent = Intent(requireContext(), Baydarka::class.java)
                requireContext().startActivity(intent)
        }
    }
}