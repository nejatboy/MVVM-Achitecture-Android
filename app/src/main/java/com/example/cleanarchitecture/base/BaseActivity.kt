package com.example.cleanarchitecture.base

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<VB: ViewBinding>: AppCompatActivity() {

    protected lateinit var binding: VB


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = getActivityBinding(layoutInflater)
        setContentView(binding.root)
    }


    abstract fun getActivityBinding(inflater: LayoutInflater) : VB


    abstract fun showProgress()


    abstract fun hideProgress()


    fun showMessage(message: String) {
        hideProgress()
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }


    fun navController() : NavController = (supportFragmentManager.fragments.first() as NavHostFragment).navController
}