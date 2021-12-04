package com.example.cleanarchitecture.base.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding
import com.example.cleanarchitecture.base.BaseActivity


abstract class BaseFragment<A: BaseActivity<*>, VB: ViewBinding>: Fragment() {

    protected lateinit var binding: VB


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = prepareFragmentBinding(inflater, container)
        return binding.root
    }


    abstract fun prepareFragmentBinding(inflater: LayoutInflater, container: ViewGroup?) : VB


    @Suppress("UNCHECKED_CAST")
    protected fun activity() : A {
        return activity as A
    }


    fun showMessage(message: String) = activity().showMessage(message)


    fun showProgress() = activity().showProgress()


    fun hideProgress() = activity().hideProgress()
}