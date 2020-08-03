package com.hacybeyker.animationactivity.ui.normal

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hacybeyker.animationactivity.R
import com.hacybeyker.animationactivity.databinding.ActivityNormalBBinding
import com.hacybeyker.animationactivity.ui.DEFAULT
import com.hacybeyker.animationactivity.ui.PARAMETER

class NormalActivityB : AppCompatActivity() {

    lateinit var binding: ActivityNormalBBinding
    lateinit var parameter: String

    companion object {
        fun start(activity: Activity, parameter: String) {
            val intent = Intent(activity, NormalActivityB::class.java)
            intent.putExtra(PARAMETER, parameter)
            activity.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setUpBinding()
        getIntentData()
        setUpView()
    }

    private fun setUpBinding() {
        binding = ActivityNormalBBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun getIntentData() {
        val bundle = intent.extras
        bundle?.let {
            parameter = it.getString(PARAMETER, DEFAULT)
        }
    }

    private fun setUpView() {
        title = getString(R.string.normal_b)
        binding.normalTextParameter.text = parameter
        binding.normalButtonB.setOnClickListener { finish() }
    }
}