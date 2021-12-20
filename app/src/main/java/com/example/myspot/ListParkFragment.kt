package com.example.myspot

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_list.*

class ListParkFragment : Fragment(), OnDisplayChanged {
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<ListParkAdapter.ViewHolder>? = null
    private lateinit var viewModel: ListParkViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_list_parks, container, false)
        viewModel = ViewModelProvider(this)[ListParkViewModel::class.java]
        //viewModel.display.let { view.parkNameView.text = it }
        //ButterKnife.bind(this, view)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val rvParks = getView()?.findViewById<RecyclerView>(R.id.recyclerView) as RecyclerView

        layoutManager = LinearLayoutManager(activity as Context) //Fragments don't have context like the activities.
        adapter = ListParkAdapter(parentFragmentManager)

        rvParks.layoutManager = layoutManager
        rvParks.adapter = adapter
    }

    override fun onStart(){
        viewModel.registerListener(this)
        super.onStart()
    }

    override fun onDisplayChanged(value: String?) {
        //value.let { parkNameView.text = it }
    }

    override fun onDestroy() {
        viewModel.unregisterListener()
        super.onDestroy()
    }
}