package com.example.appnextnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import androidx.navigation.findNavController

class First : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_first, container, false)
        view.findViewById<Button>(R.id.button2).setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_first_to_second)
        }
        view.findViewById<Button>(R.id.button3).setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_first_to_tree)}
        return view
    }

    }
