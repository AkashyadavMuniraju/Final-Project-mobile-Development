package com.example.cinemagic.HomeScreen

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.cinemagic.R

class HomeScreenActivityFragment: Fragment(R.layout.home_screen_fragment) {
    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?
    ) {
        super.onViewCreated(view, savedInstanceState)
        val tv:TextView = view.findViewById(R.id.tv)
        tv.text = "Welcome to our app"
    }
}