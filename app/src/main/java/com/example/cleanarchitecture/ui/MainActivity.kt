package com.example.cleanarchitecture.ui


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.navigation.ui.setupWithNavController
import com.example.cleanarchitecture.base.BaseActivity
import com.example.cleanarchitecture.databinding.ActivityMainBinding


class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)

        binding.bottomNavigationView.setupWithNavController(navController())
    }


    override fun getActivityBinding(inflater: LayoutInflater): ActivityMainBinding {
        return ActivityMainBinding.inflate(inflater)
    }


    override fun showProgress() {

    }


    override fun hideProgress() {

    }


    fun hideBottomNavigationView() {
        binding.bottomNavigationView.visibility = View.GONE
    }


    fun showBottomNavigationView() {
        binding.bottomNavigationView.visibility = View.VISIBLE
    }
}