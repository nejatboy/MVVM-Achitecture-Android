package com.example.cleanarchitecture.ui.splash

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cleanarchitecture.base.fragment.BasePrimaryFragment
import com.example.cleanarchitecture.databinding.FragmentSplashBinding
import com.example.cleanarchitecture.ui.MainActivity

class SplashFragment: BasePrimaryFragment<MainActivity, FragmentSplashBinding>() {

    override fun prepareFragmentBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentSplashBinding {
        return FragmentSplashBinding.inflate(inflater, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        activity().hideBottomNavigationView()

        binding.button.setOnClickListener {
            val action = SplashFragmentDirections.actionSplashFragmentToHomeFragment()
            navController().navigate(action)
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()

        activity().showBottomNavigationView()
    }
}