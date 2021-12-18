package com.example.myspot

import android.content.Context
import android.os.Bundle
import android.service.controls.actions.FloatAction
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListCarFragment : Fragment() {
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<CarAdapter.ViewHolder>? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_car, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val rvCars = getView()?.findViewById<RecyclerView>(R.id.recyclerView) as RecyclerView
        val fabCars = getView()?.findViewById<FloatingActionButton>(R.id.insertButton)
        if (fabCars != null) {
            fabCars.setOnClickListener {
                NavigationManager.goToDetalhesCar(activity?.supportFragmentManager!!, null, true)
            }
        }

        layoutManager = LinearLayoutManager(activity as Context) //Fragments don't have context like the activities.
        adapter = CarAdapter(parentFragmentManager)

        rvCars.layoutManager = layoutManager
        rvCars.adapter = adapter
    }
}