package com.example.myspot

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

        fun goToDetalhes(fm:FragmentManager){
            placeFragment(fm, DetalhesFragment())
        }
    }

}