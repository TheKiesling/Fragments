package com.example.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

/**
 * A simple [Fragment] subclass.
 * Use the [LibraryFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LibraryFragment : Fragment(R.layout.fragment_library) {

    private lateinit var textSongs: TextView
    private lateinit var buttonAdd: Button
    private var likedSongs: Int = 0

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        textSongs = view.findViewById(R.id.text_LibraryFragment_likedSongs)
        buttonAdd = view.findViewById((R.id.button_LibraryFragment_add))

        setListeners()
        super.onViewCreated(view, savedInstanceState)
    }

    private fun setListeners() {
        buttonAdd.setOnClickListener{
            likedSongs++
            textSongs.text = likedSongs.toString()
        }
    }

}