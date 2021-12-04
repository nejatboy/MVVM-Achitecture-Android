package com.example.cleanarchitecture.base.fragment

import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding
import com.example.cleanarchitecture.base.BaseActivity

abstract class BaseSecondaryFragment<A: BaseActivity<*>, VB: ViewBinding, PF: Fragment>: BasePrimaryFragment<A, VB>() {

    @Suppress("UNCHECKED_CAST")
    fun primaryFragment() : PF {
        return parentFragment?.parentFragment as PF
    }

}