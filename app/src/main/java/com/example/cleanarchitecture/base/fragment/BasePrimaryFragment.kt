package com.example.cleanarchitecture.base.fragment

import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.viewbinding.ViewBinding
import com.example.cleanarchitecture.base.BaseActivity

abstract class BasePrimaryFragment<A: BaseActivity<*>, VB: ViewBinding>: BaseFragment<A, VB>() {

    fun navController(): NavController {
        return (parentFragment as NavHost).navController
    }
}