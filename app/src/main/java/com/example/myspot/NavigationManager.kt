package com.example.myspot

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

class NavigationManager {

    companion object {
        private fun placeFragment(fm: FragmentManager, fragment: Fragment){
            val transition = fm.beginTransaction()
            transition.replace(R.id.frame, fragment)
            transition.addToBackStack(null)
            transition.commit()
        }

        fun goToListParksFragment(fm: FragmentManager){
            placeFragment(fm, ListParksFragment())
        }

        // vai para o detalhe associado a esta posicao
        fun goToDetalhes(fm:FragmentManager, position: Int){
            val bundle = Bundle()
            bundle.putInt("position", position)
            val fragment = DetalhesFragment()
            fragment.arguments = bundle
            placeFragment(fm, fragment)
        }
    }

}