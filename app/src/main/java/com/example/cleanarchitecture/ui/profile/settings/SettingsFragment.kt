package com.example.cleanarchitecture.ui.profile.settings

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.cleanarchitecture.base.fragment.BaseSecondaryFragment
import com.example.cleanarchitecture.databinding.FragmentSettingsBinding
import com.example.cleanarchitecture.ui.MainActivity
import com.example.cleanarchitecture.ui.profile.ProfileNavigationFragment

class SettingsFragment: BaseSecondaryFragment<MainActivity, FragmentSettingsBinding, ProfileNavigationFragment>() {

    override fun prepareFragmentBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentSettingsBinding {
        return FragmentSettingsBinding.inflate(inflater, container, false)
    }



}