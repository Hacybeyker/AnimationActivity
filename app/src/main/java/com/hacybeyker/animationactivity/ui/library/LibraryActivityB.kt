package com.hacybeyker.animationactivity.ui.library

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.hacybeyker.animationactivity.R
import com.hacybeyker.animationactivity.databinding.ActivityLibraryBBinding
import com.hacybeyker.animationactivity.databinding.ActivityNormalBBinding
import com.hacybeyker.animationactivity.ui.DEFAULT
import com.hacybeyker.animationactivity.ui.PARAMETER
import com.hacybeyker.animationactivity.ui.normal.NormalActivityB
import maes.tech.intentanim.CustomIntent

class LibraryActivityB : AppCompatActivity() {

    lateinit var binding: ActivityLibraryBBinding
    lateinit var parameter: String

    companion object {
        fun start(activity: Activity, parameter: String) {
            val intent = Intent(activity, LibraryActivityB::class.java)
            intent.putExtra(PARAMETER, parameter)
            activity.startActivity(intent)
            CustomIntent.customType(activity, "bottom-to-up")
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_library_b)
        setUpBinding()
        getIntentData()
        setUpView()
    }

    private fun setUpBinding() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_library_b)
    }

    private fun getIntentData() {
        val bundle = intent.extras
        bundle?.let {
            parameter = it.getString(PARAMETER, DEFAULT)
        }
    }

    private fun setUpView() {
        title = getString(R.string.library_b)
        binding.libraryTextParameter.text = parameter
        binding.libraryButtonB.setOnClickListener { finish() }
    }

    override fun finish() {
        super.finish()
        CustomIntent.customType(this, "up-to-bottom")
    }
}