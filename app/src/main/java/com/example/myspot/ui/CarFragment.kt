package com.example.myspot.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myspot.R

class CarFragment : Fragment() {

    /*private lateinit var viewModel: CarViewModel by viewModels{

    } */

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_car_formulario, container, false)
    }

}