package com.example.cleanarchitecture.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.cleanarchitecture.base.fragment.BasePrimaryFragment
import com.example.cleanarchitecture.databinding.FragmentNavigationHomeBinding
import com.example.cleanarchitecture.ui.MainActivity

class HomeNavigationFragment: BasePrimaryFragment<MainActivity, FragmentNavigationHomeBinding>() {

    override fun prepareFragmentBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentNavigationHomeBinding {
        return FragmentNavigationHomeBinding.inflate(inflater, container, false)
    }
}