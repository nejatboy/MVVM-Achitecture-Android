package com.example.cleanarchitecture.ui.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cleanarchitecture.base.fragment.BasePrimaryFragment
import com.example.cleanarchitecture.databinding.FragmentNavigatonProfileBinding
import com.example.cleanarchitecture.ui.MainActivity

class ProfileNavigationFragment: BasePrimaryFragment<MainActivity, FragmentNavigatonProfileBinding>() {

    override fun prepareFragmentBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentNavigatonProfileBinding {
        return FragmentNavigatonProfileBinding.inflate(inflater, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }
}
