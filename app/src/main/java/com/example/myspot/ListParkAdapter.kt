package com.example.myspot

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView


class ListParkAdapter(val fragmentManager: FragmentManager, val parks: List<Park>): RecyclerView.Adapter<ListParkAdapter.ViewHolder>(){
    //var onItemClick: ((Park) -> Unit)? = null
    private val TAG = ListParkAdapter::class.java.simpleName

   /* private var parks = arrayOf(
        Park(
            "P019",
            "Park0001",
            true,
            300,
            50,
            "2018-11-05 18:06:30",
            38.7352591,
            -9.15528429,
            "Nao"
        ),
        Park(
            "P01khn",
            "Park0002",
            true,
            300,
            50,
            "2018-11-05 18:06:30",
            38.7352591,
            -9.15528429,
            "Nao"
        )
    )*/
    // inner class ViewHolder(private val context: Context, itemView: View) : RecyclerView.ViewHolder(itemView) {
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        lateinit var itemPark: TextView
        lateinit var itemInfo: TextView
        lateinit var itemDistance: TextView
        //lateinit var itemDetalhes: TextView




        init {
            itemPark = itemView.findViewById(R.id.parkNameView)
            itemInfo = itemView.findViewById(R.id.kindView) //kindView
            itemDistance = itemView.findViewById(R.id.distanceView)
            //itemDetalhes = itemView.findViewById(R.id.detalhes)
            //itemView.setOnClickListener(context);

        itemView.setOnClickListener {
               Log.i(TAG,"Coloquei")
               //itemPark.text = viewModel.onClickSymbol(itemView.tag.toString())
               NavigationManager.goToDetalhes(fragmentManager, adapterPosition)

           }
        }

    }

        override fun onCreateViewHolder(
            parent: ViewGroup,
            viewType: Int
        ): ListParkAdapter.ViewHolder {
            val v = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)

            return ViewHolder(v)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.itemPark.text = parks[position].toString()
            holder.itemInfo.text = parks[position].toString()
            holder.itemDistance.text = parks[position].toString()
            //holder.itemDetalhes.text = parks[position].toString()
        }

        override fun getItemCount(): Int {
            return parks.size
        }
    }






