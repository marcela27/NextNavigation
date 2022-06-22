package com.example.appnextnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import androidx.navigation.findNavController

class Tree : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_tree, container, false)
        view.findViewById<Button>(R.id.button5).setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_tree_to_five)
        }
        return view
    }

    companion object {

        fun newInstance(param1: String, param2: String) =
            Second().apply {
                arguments = Bundle().apply {

                }
            }
    }
}