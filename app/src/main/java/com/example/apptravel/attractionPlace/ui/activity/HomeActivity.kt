package com.example.apptravel.attractionPlace.ui.activity

import androidx.fragment.app.Fragment
import com.example.apptravel.attractionPlace.ui.fragment.HomeFragment
import com.example.apptravel.databinding.ActivityHomeBinding
import com.example.apptravel.ui.activity.BaseActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeActivity : BaseActivity<ActivityHomeBinding>() {
    override fun inflateLayout(): ActivityHomeBinding = ActivityHomeBinding.inflate(layoutInflater)
    override fun getDefaultFragment(): Fragment? = HomeFragment.newInstance()
}