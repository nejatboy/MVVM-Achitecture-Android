package com.example.cleanarchitecture.ui.home.root

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.cleanarchitecture.base.fragment.BaseSecondaryFragment
import com.example.cleanarchitecture.databinding.FragmentHomeBinding
import com.example.cleanarchitecture.ui.MainActivity
import com.example.cleanarchitecture.ui.home.HomeNavigationFragment

class HomeFragment: BaseSecondaryFragment<MainActivity, FragmentHomeBinding, HomeNavigationFragment>() {

    override fun prepareFragmentBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentHomeBinding {
        return FragmentHomeBinding.inflate(inflater, container, false)
    }
}