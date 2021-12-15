package com.example.myspot

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.item_list.*

class ListParksFragment : Fragment() {
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<ListaParkAdapter.ViewHolder>? = null
    lateinit var toggle: ActionBarDrawerToggle

/*
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_list_parks, container, false)
        val itemDaMinhaLista : Button = view.findViewById(R.id.row)
        itemDaMinhaLista.setOnClickListener {
            val fragment = DetalhesFragment()
            val transation = fragmentManager?.beginTransaction()
            transation?.replace(R.id.frame, fragment)?.commit()
        }

        return view
    }
*/

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        /*layoutManager.setOnClickListener{
            NavigationManager.goToDetalhes()}*/

        return inflater.inflate(R.layout.fragment_list_parks, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val rvParks = getView()?.findViewById<RecyclerView>(R.id.recyclerView) as RecyclerView

        layoutManager = LinearLayoutManager(activity as Context) //Fragments don't have context like the activities.
        adapter = ListaParkAdapter()

        rvParks.layoutManager = layoutManager
        rvParks.adapter = adapter
    }

   /*override fun onStart() {
        super.onStart()
        val btnFechar = view.findViewById(R.id.fragment_list)
        val intent: Intent(this, DetalhesFragment::class.java)

    }*/

}