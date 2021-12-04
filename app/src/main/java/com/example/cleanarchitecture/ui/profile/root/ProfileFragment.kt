package com.example.cleanarchitecture.ui.profile.root

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cleanarchitecture.base.fragment.BaseSecondaryFragment
import com.example.cleanarchitecture.databinding.FragmentProfileBinding
import com.example.cleanarchitecture.ui.MainActivity
import com.example.cleanarchitecture.ui.profile.ProfileNavigationFragment

class ProfileFragment: BaseSecondaryFragment<MainActivity, FragmentProfileBinding, ProfileNavigationFragment>() {

    override fun prepareFragmentBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentProfileBinding {
        return FragmentProfileBinding.inflate(inflater, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button.setOnClickListener {
            val action = ProfileFragmentDirections.actionProfileFragmentToSettingsFragment()
            navController().navigate(action)
        }
    }
}